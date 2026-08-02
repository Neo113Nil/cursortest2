package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.ironsource.X3;
import io.appmetrica.analytics.coreutils.internal.db.DBUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class X6 {
    public final ReentrantReadWriteLock.ReadLock a;
    public final ReentrantReadWriteLock.WriteLock b;
    public final C4955k7 c;
    public final W6 d;
    public final Object e;
    public final ArrayList f;
    public final Context g;
    public final C4927j5 h;
    public final AtomicLong i;
    public final ArrayList j;
    public final T6 k;
    public final C5136r7 l;

    static {
        HashSet hashSet = new HashSet();
        EnumC5037nb enumC5037nb = EnumC5037nb.EVENT_TYPE_UNDEFINED;
        hashSet.add(0);
        hashSet.add(6400);
    }

    public X6(C4927j5 c4927j5, C4955k7 c4955k7, T6 t6, C5136r7 c5136r7) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock.readLock();
        this.b = reentrantReadWriteLock.writeLock();
        this.e = new Object();
        this.f = new ArrayList(3);
        AtomicLong atomicLong = new AtomicLong();
        this.i = atomicLong;
        this.j = new ArrayList();
        this.c = c4955k7;
        this.g = c4927j5.getContext();
        this.h = c4927j5;
        this.k = t6;
        this.l = c5136r7;
        atomicLong.set(b());
        W6 w6 = new W6(this, c4927j5);
        this.d = w6;
        w6.setName(a(c4927j5));
    }

    public final long a() {
        this.a.lock();
        try {
            return this.i.get();
        } finally {
            this.a.unlock();
        }
    }

    public final long b() {
        long j;
        SQLiteDatabase readableDatabase;
        this.a.lock();
        try {
            readableDatabase = this.c.getReadableDatabase();
        } catch (Throwable unused) {
        }
        if (readableDatabase != null) {
            j = DBUtils.queryRowsCount(readableDatabase, "events");
            this.a.unlock();
            return j;
        }
        j = 0;
        this.a.unlock();
        return j;
    }

    public final void c() {
        Cursor cursor;
        Cursor cursor2;
        this.a.lock();
        Cursor cursor3 = null;
        try {
            SQLiteDatabase readableDatabase = this.c.getReadableDatabase();
            if (readableDatabase != null) {
                cursor2 = readableDatabase.rawQuery(" SELECT DISTINCT id From sessions order by id asc ", new String[0]);
                try {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("All sessions in db: ");
                    while (cursor2.moveToNext()) {
                        stringBuffer.append(cursor2.getString(0));
                        stringBuffer.append(", ");
                    }
                    cursor3 = readableDatabase.rawQuery(" SELECT DISTINCT session_id From events order by session_id asc ", new String[0]);
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("All sessions in reports db: ");
                    while (cursor3.moveToNext()) {
                        stringBuffer2.append(cursor3.getString(0));
                        stringBuffer2.append(", ");
                    }
                } catch (Throwable unused) {
                    cursor = cursor3;
                    cursor3 = cursor2;
                    cursor2 = cursor3;
                    cursor3 = cursor;
                    this.a.unlock();
                    vo.a(cursor2);
                    vo.a(cursor3);
                }
            } else {
                cursor2 = null;
            }
        } catch (Throwable unused2) {
            cursor = null;
        }
        this.a.unlock();
        vo.a(cursor2);
        vo.a(cursor3);
    }

    public final void d() {
        this.d.start();
    }

    public final long a(Set set) {
        this.a.lock();
        Cursor cursor = null;
        long j = 0;
        try {
            SQLiteDatabase readableDatabase = this.c.getReadableDatabase();
            if (readableDatabase != null) {
                StringBuilder sb = new StringBuilder("SELECT count() FROM events");
                if (!set.isEmpty()) {
                    sb.append(" WHERE ");
                }
                Iterator it = set.iterator();
                int i = 0;
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    if (i > 0) {
                        sb.append(" OR ");
                    }
                    sb.append("type == " + num);
                    i++;
                }
                cursor = readableDatabase.rawQuery(sb.toString(), null);
                if (cursor.moveToFirst()) {
                    j = cursor.getLong(0);
                }
            }
        } catch (Throwable unused) {
        }
        vo.a(cursor);
        this.a.unlock();
        return j;
    }

    public final void a(InterfaceC4802e9 interfaceC4802e9) {
        this.j.add(interfaceC4802e9);
    }

    public static String a(Qa qa) {
        return "DatabaseWorker [" + qa.b().e() + X3.j.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(long j, EnumC4840fl enumC4840fl, long j2) {
        JSONObject jSONObject;
        boolean b;
        F7 f7 = new F7(null, 1, 0 == true ? 1 : 0);
        C5224uh c5224uh = (C5224uh) this.h.k.a();
        Long valueOf = Long.valueOf(j);
        Long valueOf2 = Long.valueOf(j2);
        try {
            jSONObject = new JSONObject().put("dId", c5224uh.getDeviceId()).put("uId", c5224uh.getUuid()).put("appVer", c5224uh.getAppVersion()).put("appBuild", c5224uh.getAppBuildNumber()).put("kitBuildType", c5224uh.getAnalyticsSdkBuildType()).put("osVer", c5224uh.getOsVersion()).put("osApiLev", c5224uh.getOsApiLevel()).put("lang", c5224uh.getLocale()).put("root", c5224uh.getDeviceRootStatus()).put("app_debuggable", ((Z5) c5224uh).a).put(CommonUrlParts.APP_FRAMEWORK, c5224uh.getAppFramework()).put("attribution_id", c5224uh.r).put("analyticsSdkVersionName", c5224uh.getAnalyticsSdkVersionName()).put("kitBuildNumber", c5224uh.getAnalyticsSdkBuildNumber());
        } catch (Throwable unused) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        Long valueOf3 = Long.valueOf(Sn.a());
        C4891hk c4891hk = AbstractC4865gk.a;
        synchronized (c4891hk) {
            b = c4891hk.b.b(true);
        }
        ContentValues fromModel = f7.fromModel(new E7(valueOf, enumC4840fl, jSONObject2, new D7(valueOf2, valueOf3, Boolean.valueOf(b))));
        if (fromModel == null) {
            return;
        }
        this.b.lock();
        try {
            SQLiteDatabase writableDatabase = this.c.getWritableDatabase();
            if (writableDatabase != null) {
                writableDatabase.insertOrThrow("sessions", null, fromModel);
            }
        } catch (Throwable unused2) {
        }
        this.b.unlock();
    }

    public final void a(ContentValues contentValues) {
        synchronized (this.e) {
            this.f.add(contentValues);
        }
        synchronized (this.d) {
            this.d.notifyAll();
        }
    }

    public final int a(SQLiteDatabase sQLiteDatabase) {
        try {
            return this.k.a(sQLiteDatabase, String.format("id IN (SELECT id FROM events ORDER BY CASE WHEN type IN (%1$s) THEN 2 WHEN type IN (%2$s) THEN 1 ELSE 0 END, id LIMIT (SELECT count() FROM events) / %3$s)", TextUtils.join(", ", I9.i), TextUtils.join(", ", I9.j), 10), 2, this.h.b.b, true).b;
        } catch (Throwable th) {
            C4710ak c4710ak = AbstractC5326yj.a;
            c4710ak.getClass();
            c4710ak.a(new C5351zj("deleteExcessiveReports exception", th));
            return 0;
        }
    }

    public final void a(long j, int i, int i2, boolean z) {
        if (i2 <= 0) {
            return;
        }
        this.b.lock();
        try {
            String format = String.format(Locale.US, "%1$s = %2$s AND %3$s = %4$s AND %5$s <= (SELECT %5$s FROM %6$s WHERE %1$s = %2$s AND %3$s = %4$s ORDER BY %5$s ASC LIMIT %7$s, 1)", "session_id", Long.toString(j), "session_type", Integer.toString(i), "id", "events", Integer.toString(i2 - 1));
            SQLiteDatabase writableDatabase = this.c.getWritableDatabase();
            if (writableDatabase != null) {
                R6 a = this.k.a(writableDatabase, format, 1, this.h.b.b, z);
                if (a.a != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = a.a.iterator();
                    while (it.hasNext()) {
                        Integer asInteger = ((ContentValues) it.next()).getAsInteger("type");
                        asInteger.intValue();
                        arrayList.add(asInteger);
                    }
                    Iterator it2 = this.j.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC4802e9) it2.next()).b(arrayList);
                    }
                }
                List list = a.a;
                if (list != null) {
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        a((ContentValues) list.get(i3), "Event removed from db");
                    }
                }
                this.i.addAndGet(-a.b);
            }
        } catch (Throwable unused) {
        }
        this.b.unlock();
    }

    public final ContentValues a(long j, EnumC4840fl enumC4840fl) {
        ContentValues contentValues = new ContentValues();
        this.a.lock();
        Cursor cursor = null;
        try {
            SQLiteDatabase readableDatabase = this.c.getReadableDatabase();
            if (readableDatabase != null) {
                Locale locale = Locale.US;
                cursor = readableDatabase.rawQuery("SELECT report_request_parameters FROM sessions WHERE id = " + j + " AND type = " + enumC4840fl.a + " ORDER BY id DESC LIMIT 1", null);
                if (cursor.moveToNext()) {
                    ContentValues contentValues2 = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(cursor, contentValues2);
                    contentValues = contentValues2;
                }
            }
        } catch (Throwable unused) {
        }
        vo.a(cursor);
        this.a.unlock();
        return contentValues;
    }

    public static String a(LinkedHashMap linkedHashMap) {
        StringBuilder sb = new StringBuilder("id >= ?");
        for (String str : linkedHashMap.keySet()) {
            sb.append(sb.length() > 0 ? " AND " : "");
            sb.append(str + " = ? ");
        }
        if (TextUtils.isEmpty(sb.toString())) {
            return null;
        }
        return sb.toString();
    }

    public static String[] a(String[] strArr, LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(strArr));
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getValue());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(ContentValues contentValues, String str) {
        Integer asInteger = contentValues.getAsInteger("type");
        if (I9.d.contains(EnumC5037nb.a(asInteger != null ? asInteger.intValue() : -1))) {
            C5111q7 model = new C5136r7(null, 1, 0 == true ? 1 : 0).toModel(contentValues);
            PublicLogger publicLogger = this.h.m;
            EnumC5037nb enumC5037nb = model.d;
            C5085p7 c5085p7 = model.g;
            publicLogger.info(AbstractC4706ag.a(str, enumC5037nb, c5085p7.b, c5085p7.c), new Object[0]);
        }
    }

    public static boolean a(X6 x6) {
        boolean isEmpty;
        synchronized (x6.e) {
            isEmpty = x6.f.isEmpty();
        }
        return isEmpty;
    }
}
