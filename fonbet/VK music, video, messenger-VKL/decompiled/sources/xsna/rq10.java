package xsna;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import com.ironsource.D1;
import com.ironsource.X3;
import com.vk.core.preference.Preference;
import com.vk.mediastore.system.AlbumEntry;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.mediastore.system.MediaStoreImageEntry;
import com.vk.mediastore.system.MediaStoreVideoEntry;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.text.Regex;

/* compiled from: MediaDatabaseLoader.kt */
/* loaded from: classes3.dex */
public final class rq10 {
    public static final String[] e = {"1", "3"};
    public static final String[] f;
    public static final String[] g;
    public final Context a;
    public final bpn0 b = new bpn0(new gc(16));
    public final bpn0 c = new bpn0(new jrh(this, 27));
    public final bpn0 d = new bpn0(new x0(22));

    static {
        String[] strArr = {"_id", "media_type", "bucket_id", "bucket_display_name", "datetaken", "_data", "width", "height", "_size", "date_modified", "duration", X3.i.n};
        f = strArr;
        g = (String[]) jw5.z(new String[]{"count (_id)"}, strArr);
    }

    public rq10(Context context) {
        this.a = context;
    }

    public static ArrayList d(Cursor cursor, String str) {
        String str2;
        String str3;
        ArrayList arrayList = new ArrayList();
        try {
            int columnIndex = cursor.getColumnIndex("is_favorite");
            int columnIndex2 = cursor.getColumnIndex(str);
            int columnIndex3 = cursor.getColumnIndex("_data");
            int columnIndex4 = cursor.getColumnIndex("bucket_display_name");
            while (cursor.moveToNext()) {
                int i = columnIndex == -1 ? 0 : cursor.getInt(columnIndex);
                long j = cursor.getLong(columnIndex2);
                String string = cursor.getString(columnIndex3);
                String string2 = cursor.getString(columnIndex4);
                String str4 = string;
                boolean z = i == 1;
                if (str4 == null) {
                    str4 = "";
                }
                if (string2 == null) {
                    str3 = str4;
                    str2 = "";
                } else {
                    String str5 = str4;
                    str2 = string2;
                    str3 = str5;
                }
                arrayList.add(new j3k0(j, str3, str2, z));
            }
            return arrayList;
        } catch (Throwable th) {
            com.vk.metrics.eventtracking.b.a.q(th);
            return arrayList;
        }
    }

    public static String[] e(int i, int i2) {
        ArrayList w0;
        if (i == 111) {
            w0 = rl3.w0(e);
        } else if (i == 222) {
            w0 = e43.a("1");
        } else {
            if (i != 333) {
                throw new IllegalStateException("Not supported type");
            }
            w0 = e43.a("3");
        }
        if (i2 != -2 && i2 != -1) {
            w0.add(String.valueOf(i2));
        }
        return (String[]) w0.toArray(new String[0]);
    }

    public final Uri a() {
        return (Uri) this.b.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final cz10 b(Uri uri, Cursor cursor, qq10 qq10Var) {
        int i;
        int i2;
        Uri withAppendedId;
        Uri uri2;
        MediaStoreEntry mediaStoreVideoEntry;
        int i3 = cursor.getInt(qq10Var.a);
        int i4 = cursor.getInt(qq10Var.b);
        int i5 = cursor.getInt(qq10Var.c);
        String string = cursor.getString(qq10Var.d);
        String string2 = cursor.getString(qq10Var.e);
        long j = cursor.getLong(qq10Var.f);
        int i6 = cursor.getInt(qq10Var.g);
        int i7 = cursor.getInt(qq10Var.h);
        long j2 = cursor.getLong(qq10Var.i);
        long j3 = cursor.getLong(qq10Var.j);
        long j4 = i4;
        if (string2 == null || string2.length() == 0) {
            i = i5;
            i2 = i4;
            withAppendedId = ContentUris.withAppendedId(uri, j4);
        } else {
            File file = new File(string2);
            Regex regex = com.vk.core.files.a.a;
            if (!vhk0.g(file)) {
                i = i5;
                i2 = i4;
                uri2 = null;
                if (uri2 != null) {
                    if (i3 == 1) {
                        mediaStoreVideoEntry = new MediaStoreImageEntry(i2, uri2, j, i6, i7, j3, j2, cursor.getInt(qq10Var.k));
                    } else {
                        mediaStoreVideoEntry = i3 == 3 ? new MediaStoreVideoEntry(i2, uri2, j, i6, i7, j3, j2, cursor.getLong(qq10Var.l)) : null;
                    }
                    if (mediaStoreVideoEntry != null) {
                        if (string == null) {
                            string = "";
                        }
                        return new cz10(mediaStoreVideoEntry, i, string);
                    }
                }
                return null;
            }
            i = i5;
            i2 = i4;
            withAppendedId = ((!((Boolean) this.d.getValue()).booleanValue() || file.canRead()) && !Preference.j().getBoolean("__dbg_use_content_scheme", false)) ? Uri.parse("file://".concat(brm0.y(brm0.y(brm0.y(string2, "%", "%25"), "#", "%23"), "?", "%3F"))) : ContentUris.withAppendedId(uri, j4);
        }
        uri2 = withAppendedId;
        if (uri2 != null) {
        }
        return null;
    }

    public final int c(int i, int i2) {
        Uri contentUri = MediaStore.Files.getContentUri(D1.e);
        String str = i2 == 111 ? "(media_type = ? OR media_type = ?)" : "media_type = ?";
        if (i != -2 && i != -1) {
            str = str.concat(" AND bucket_id=?");
        }
        Cursor query = this.a.getContentResolver().query(contentUri, new String[]{"COUNT(bucket_id)"}, str, e(i2, i), null);
        int i3 = 0;
        try {
            if (query == null) {
                return 0;
            }
            try {
                if (query.moveToNext()) {
                    i3 = query.getInt(0);
                }
            } catch (Exception e2) {
                com.vk.metrics.eventtracking.b.a.q(e2);
            }
            query.close();
            return i3;
        } finally {
        }
    }

    public final boolean f(cz10 cz10Var) {
        String str = (String) this.c.getValue();
        if (str != null) {
            String path = cz10Var.a.f().getPath();
            Boolean valueOf = path != null ? Boolean.valueOf(brm0.B(path, str, false)) : null;
            if (valueOf != null) {
                return valueOf.booleanValue();
            }
        }
        return false;
    }

    public final void g(int i, String str, boolean z, gzs<Boolean> gzsVar, izs<? super List<AlbumEntry>, s3q0> izsVar, gzs<s3q0> gzsVar2) {
        List<MediaStoreEntry> list;
        dda ddaVar = new dda(4, izsVar, this, str);
        int i2 = 0;
        if (Build.VERSION.SDK_INT < 29) {
            ArrayList arrayList = new ArrayList();
            Cursor query = this.a.getContentResolver().query(a(), g, (i == 111 ? "(media_type = ? OR media_type = ?)" : "media_type = ?").concat(") GROUP BY (bucket_id"), e(i, -2), null);
            if (query != null) {
                try {
                    qq10 qq10Var = new qq10(query);
                    int columnIndex = query.getColumnIndex("count (_id)");
                    while (query.moveToNext()) {
                        try {
                            cz10 b = b(a(), query, qq10Var);
                            if (b != null) {
                                arrayList.add(new AlbumEntry(b.b, b.c, Collections.singletonList(b.a), f(b), query.getInt(columnIndex), null, 32, null));
                            }
                        } catch (Throwable th) {
                            com.vk.metrics.eventtracking.b.a.q(th);
                        }
                    }
                    s3q0 s3q0Var = s3q0.a;
                    query.close();
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        ro.e(query, th2);
                        throw th3;
                    }
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                i2 += ((AlbumEntry) it.next()).f;
            }
            AlbumEntry albumEntry = (AlbumEntry) j5g.a0(arrayList);
            if (albumEntry != null && (list = albumEntry.d) != null) {
                r7 = (MediaStoreEntry) j5g.a0(list);
            }
            ddaVar.invoke(new up10(arrayList, i2, r7));
            return;
        }
        if (gzsVar.invoke().booleanValue()) {
            return;
        }
        LinkedHashSet<ql8> linkedHashSet = new LinkedHashSet();
        if (i == 111 || i == 222) {
            g5g.y(h(true), linkedHashSet);
        }
        if (i == 111 || i == 333) {
            g5g.y(h(false), linkedHashSet);
        }
        if (gzsVar.invoke().booleanValue()) {
            return;
        }
        int c = c(-2, i);
        cz10 cz10Var = (cz10) j5g.a0(j(i, 1, 0, -2));
        if (z) {
            ArrayList arrayList2 = new ArrayList(c5g.u(linkedHashSet, 10));
            for (ql8 ql8Var : linkedHashSet) {
                arrayList2.add(new AlbumEntry(ql8Var.a, ql8Var.b, null, false, 0, ql8Var.c, 28, null));
            }
            ddaVar.invoke(new up10(arrayList2, c, cz10Var != null ? cz10Var.a : null));
        }
        if (gzsVar.invoke().booleanValue()) {
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        for (ql8 ql8Var2 : linkedHashSet) {
            int c2 = c(ql8Var2.a, i);
            cz10 cz10Var2 = (cz10) j5g.a0(j(i, 1, 0, ql8Var2.a));
            AlbumEntry albumEntry2 = cz10Var2 != null ? new AlbumEntry(ql8Var2.a, cz10Var2.c, Collections.singletonList(cz10Var2.a), f(cz10Var2), c2, ql8Var2.c) : null;
            if (albumEntry2 != null) {
                arrayList3.add(albumEntry2);
            }
        }
        ddaVar.invoke(new up10(arrayList3, c, cz10Var != null ? cz10Var.a : null));
        gzsVar2.invoke();
    }

    @TargetApi(29)
    public final List<ql8> h(boolean z) {
        Uri uri = z ? MediaStore.Images.Media.EXTERNAL_CONTENT_URI : MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        ArrayList arrayList = new ArrayList();
        Cursor query = this.a.getContentResolver().query(uri, new String[]{"bucket_id", "bucket_display_name", "relative_path"}, "", null, "date_modified DESC");
        if (query != null) {
            try {
                int columnIndex = query.getColumnIndex("bucket_id");
                int columnIndex2 = query.getColumnIndex("bucket_display_name");
                int columnIndex3 = query.getColumnIndex("relative_path");
                while (query.moveToNext()) {
                    try {
                        int i = query.getInt(columnIndex);
                        String string = query.getString(columnIndex2);
                        String string2 = query.getString(columnIndex3);
                        if (string == null) {
                            string = "";
                        }
                        if (string2 == null) {
                            string2 = "";
                        }
                        arrayList.add(new ql8(i, string, string2));
                    } catch (Exception e2) {
                        com.vk.metrics.eventtracking.b.a.q(e2);
                    }
                }
                s3q0 s3q0Var = s3q0.a;
                query.close();
            } finally {
            }
        }
        return j5g.R(arrayList);
    }

    public final ArrayList i(int i, int i2, int i3, int i4) {
        pro0.b();
        ArrayList j = j(i, i2, i3, i4);
        ArrayList arrayList = new ArrayList(c5g.u(j, 10));
        Iterator it = j.iterator();
        while (it.hasNext()) {
            arrayList.add(((cz10) it.next()).a);
        }
        return arrayList;
    }

    public final ArrayList j(int i, int i2, int i3, int i4) {
        pro0.b();
        ArrayList arrayList = new ArrayList();
        ContentResolver contentResolver = this.a.getContentResolver();
        Uri a = a();
        String str = i == 111 ? "(media_type = ? OR media_type = ?)" : "media_type = ?";
        if (i4 != -2 && i4 != -1) {
            str = str.concat(" AND bucket_id=?");
        }
        Cursor b = vkj.b(contentResolver, a, f, str, e(i, i4), (Build.VERSION.SDK_INT >= 29 ? "date_modified" : "datetaken").concat(" DESC"), i2, i3, 128);
        try {
            if (b == null) {
                return arrayList;
            }
            try {
                qq10 qq10Var = new qq10(b);
                while (b.moveToNext()) {
                    cz10 b2 = b(a(), b, qq10Var);
                    if (b2 != null) {
                        arrayList.add(b2);
                    }
                }
            } finally {
                s3q0 s3q0Var = s3q0.a;
                b.close();
                return arrayList;
            }
            s3q0 s3q0Var2 = s3q0.a;
            b.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ro.e(b, th);
            }
        }
    }
}
