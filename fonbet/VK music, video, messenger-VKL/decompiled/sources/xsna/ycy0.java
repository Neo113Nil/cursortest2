package xsna;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes.dex */
public final class ycy0 implements CookieStore {
    public final SQLiteDatabase a;
    public final SQLiteStatement b;
    public final SQLiteStatement c;
    public final SQLiteStatement d;
    public final luy0 e;
    public final HashMap f;

    public ycy0(SQLiteDatabase sQLiteDatabase) {
        String str;
        String str2;
        HttpCookie httpCookie;
        HashMap hashMap = new HashMap();
        this.f = hashMap;
        this.a = sQLiteDatabase;
        this.e = new luy0();
        this.b = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_url_resolver_cookie( uri_key, uri, cookie_json) values (?,?,?)");
        this.c = sQLiteDatabase.compileStatement("DELETE FROM table_url_resolver_cookie where uri_key=?");
        this.d = sQLiteDatabase.compileStatement("DELETE FROM table_url_resolver_cookie");
        try {
            Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT  uri, cookie_json FROM table_url_resolver_cookie", null);
            while (rawQuery.moveToNext()) {
                try {
                    try {
                        str = rawQuery.getString(0);
                    } catch (Throwable unused) {
                        str = null;
                    }
                    try {
                        str2 = rawQuery.getString(1);
                    } catch (Throwable unused2) {
                        str2 = null;
                    }
                    if (str2 != null) {
                        this.e.getClass();
                        httpCookie = luy0.b(str2);
                    } else {
                        httpCookie = null;
                    }
                    if (httpCookie != null && str != null) {
                        URI uri = new URI(str);
                        Set set = (Set) hashMap.get(uri);
                        if (set == null) {
                            set = new HashSet();
                            hashMap.put(uri, set);
                        }
                        set.add(httpCookie);
                    }
                } finally {
                }
            }
            rawQuery.close();
        } catch (Throwable unused3) {
        }
    }

    public static URI a(URI uri, HttpCookie httpCookie) {
        if (httpCookie.getDomain() != null) {
            String domain = httpCookie.getDomain();
            if (domain.charAt(0) == '.') {
                domain = domain.substring(1);
            }
            try {
                return new URI(uri.getScheme() == null ? "http" : uri.getScheme(), domain, httpCookie.getPath() == null ? DomExceptionUtils.SEPARATOR : httpCookie.getPath(), null);
            } catch (Throwable th) {
                eb3.a(null, new StringBuilder("MyTargetCookieStore: Error - "), th);
            }
        }
        return uri;
    }

    @Override // java.net.CookieStore
    public final synchronized void add(URI uri, HttpCookie httpCookie) {
        try {
            URI a = a(uri, httpCookie);
            Set set = (Set) this.f.get(a);
            if (set == null) {
                set = new HashSet();
                this.f.put(a, set);
            }
            set.remove(httpCookie);
            set.add(httpCookie);
            d(a, httpCookie);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final ArrayList b(URI uri) {
        SQLiteDatabase sQLiteDatabase;
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : this.f.entrySet()) {
            URI uri2 = (URI) entry.getKey();
            String host = uri2.getHost();
            String host2 = uri.getHost();
            if (!host2.equals(host)) {
                if (host2.endsWith("." + host)) {
                }
            }
            String path = uri2.getPath();
            String path2 = uri.getPath();
            if (path2.equals(path) || ((path2.startsWith(path) && path.charAt(path.length() - 1) == '/') || (path2.startsWith(path) && path2.substring(path.length()).charAt(0) == '/'))) {
                hashSet.addAll((Collection) entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            HttpCookie httpCookie = (HttpCookie) it.next();
            if (httpCookie.hasExpired()) {
                arrayList.add(httpCookie);
                it.remove();
            }
        }
        if (!arrayList.isEmpty()) {
            synchronized (this) {
                this.a.beginTransaction();
                try {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        c(uri, (HttpCookie) it2.next());
                    }
                    this.a.setTransactionSuccessful();
                    sQLiteDatabase = this.a;
                } catch (Throwable unused) {
                    sQLiteDatabase = this.a;
                }
                sQLiteDatabase.endTransaction();
            }
        }
        return new ArrayList(hashSet);
    }

    public final synchronized void c(URI uri, HttpCookie httpCookie) {
        try {
            this.c.bindString(1, uri + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + httpCookie.getName());
            this.c.executeUpdateDelete();
        } finally {
            this.c.clearBindings();
        }
    }

    public final synchronized void d(URI uri, HttpCookie httpCookie) {
        this.a.beginTransaction();
        try {
            c(uri, httpCookie);
            String uri2 = uri.toString();
            String str = uri2 + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + httpCookie.getName();
            this.e.getClass();
            String a = luy0.a(httpCookie);
            this.b.bindString(1, str);
            this.b.bindString(2, uri2);
            this.b.bindString(3, a);
            this.b.executeInsert();
            this.a.setTransactionSuccessful();
        } catch (Throwable th) {
            try {
                gu8.c(null, "DB insertCookie error: " + th);
            } finally {
                this.a.endTransaction();
                this.b.clearBindings();
            }
        }
    }

    @Override // java.net.CookieStore
    public final synchronized List get(URI uri) {
        return b(uri);
    }

    @Override // java.net.CookieStore
    public final synchronized List getCookies() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f.keySet().iterator();
        while (it.hasNext()) {
            arrayList.addAll(b((URI) it.next()));
        }
        return arrayList;
    }

    @Override // java.net.CookieStore
    public final synchronized List getURIs() {
        return new ArrayList(this.f.keySet());
    }

    @Override // java.net.CookieStore
    public final synchronized boolean remove(URI uri, HttpCookie httpCookie) {
        try {
            Set set = (Set) this.f.get(uri);
            boolean z = set != null && set.remove(httpCookie);
            if (!z) {
                return z;
            }
            c(uri, httpCookie);
            return z;
        } finally {
        }
    }

    @Override // java.net.CookieStore
    public final synchronized boolean removeAll() {
        this.f.clear();
        synchronized (this) {
            try {
                this.d.executeUpdateDelete();
            } finally {
                this.d.clearBindings();
            }
        }
        return true;
        return true;
    }
}
