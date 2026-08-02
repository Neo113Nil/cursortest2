package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes11.dex */
public final class hqg {
    public static Boolean n;
    public final boolean a;
    public final String b;
    public final int c;
    public final int d;
    public final Context e;
    public pqg h;
    public SQLiteDatabase i;
    public Integer l;
    public final ArrayList f = new ArrayList();
    public final HashMap g = new HashMap();
    public int j = 0;
    public int k = 0;
    public int m = 0;

    public hqg(Context context, String str, int i, boolean z, int i2) {
        this.e = context;
        this.b = str;
        this.a = z;
        this.c = i;
        this.d = i2;
    }

    public static HashMap b(Cursor cursor, Integer num) {
        HashMap hashMap = null;
        ArrayList arrayList = null;
        int i = 0;
        while (cursor.moveToNext()) {
            if (hashMap == null) {
                arrayList = new ArrayList();
                hashMap = new HashMap();
                i = cursor.getColumnCount();
                hashMap.put("columns", Arrays.asList(cursor.getColumnNames()));
                hashMap.put("rows", arrayList);
            }
            ArrayList arrayList2 = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                int type = cursor.getType(i2);
                arrayList2.add(type != 1 ? type != 2 ? type != 3 ? type != 4 ? null : cursor.getBlob(i2) : cursor.getString(i2) : Double.valueOf(cursor.getDouble(i2)) : Long.valueOf(cursor.getLong(i2)));
            }
            arrayList.add(arrayList2);
            if (num != null && arrayList.size() >= num.intValue()) {
                break;
            }
        }
        return hashMap == null ? new HashMap() : hashMap;
    }

    public final void a(wwt0 wwt0Var) {
        try {
            int i = wwt0Var.a;
            if (rez.a(this.d)) {
                g();
            }
            this.g.remove(Integer.valueOf(i));
            wwt0Var.c.close();
        } catch (Exception unused) {
        }
    }

    public final boolean c(q55 q55Var) {
        if (f(q55Var)) {
            Cursor cursor = null;
            if (q55Var.c()) {
                q55Var.success(null);
                return true;
            }
            try {
                try {
                    Cursor rawQuery = this.i.rawQuery("SELECT changes(), last_insert_rowid()", null);
                    if (rawQuery != null) {
                        try {
                            if (rawQuery.getCount() > 0 && rawQuery.moveToFirst()) {
                                int i = rawQuery.getInt(0);
                                int i2 = this.d;
                                if (i == 0) {
                                    if (i2 >= 1) {
                                        g();
                                        rawQuery.getLong(1);
                                    }
                                    q55Var.success(null);
                                    rawQuery.close();
                                    return true;
                                }
                                long j = rawQuery.getLong(1);
                                if (i2 >= 1) {
                                    g();
                                }
                                q55Var.success(Long.valueOf(j));
                                rawQuery.close();
                                return true;
                            }
                        } catch (Exception e) {
                            e = e;
                            cursor = rawQuery;
                            h(e, q55Var);
                            if (cursor != null) {
                                cursor.close();
                            }
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            cursor = rawQuery;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                    Log.e("Sqflite", g().concat("fail to read changes for Insert"));
                    q55Var.success(null);
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    return true;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e2) {
                e = e2;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [zwt0] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r9v0, types: [q55, t85] */
    public final boolean d(q55 q55Var) {
        Integer num = (Integer) q55Var.a("cursorPageSize");
        String str = (String) q55Var.a("sql");
        final ?? zwt0Var = new zwt0(str, (List) q55Var.a("arguments"));
        if (this.d >= 1) {
            g();
            zwt0Var.toString();
        }
        wwt0 wwt0Var = null;
        try {
            try {
                zwt0Var = this.i.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: gqg
                    @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
                    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str2, SQLiteQuery sQLiteQuery) {
                        List list = zwt0.this.b;
                        if (list != null) {
                            int size = list.size();
                            int i = 0;
                            while (i < size) {
                                Object a = zwt0.a(list.get(i));
                                int i2 = i + 1;
                                if (a == null) {
                                    sQLiteQuery.bindNull(i2);
                                } else if (a instanceof byte[]) {
                                    sQLiteQuery.bindBlob(i2, (byte[]) a);
                                } else if (a instanceof Double) {
                                    sQLiteQuery.bindDouble(i2, ((Double) a).doubleValue());
                                } else if (a instanceof Integer) {
                                    sQLiteQuery.bindLong(i2, ((Integer) a).intValue());
                                } else if (a instanceof Long) {
                                    sQLiteQuery.bindLong(i2, ((Long) a).longValue());
                                } else if (a instanceof String) {
                                    sQLiteQuery.bindString(i2, (String) a);
                                } else {
                                    if (!(a instanceof Boolean)) {
                                        throw new IllegalArgumentException("Could not bind " + a + " from index " + i + ": Supported types are null, byte[], double, long, boolean and String");
                                    }
                                    sQLiteQuery.bindLong(i2, ((Boolean) a).booleanValue() ? 1L : 0L);
                                }
                                i = i2;
                            }
                        }
                        return new SQLiteCursor(sQLiteCursorDriver, str2, sQLiteQuery);
                    }
                }, str, p6e.a, null);
                try {
                    HashMap b = b(zwt0Var, num);
                    if (num != null && !zwt0Var.isLast() && !zwt0Var.isAfterLast()) {
                        int i = this.m + 1;
                        this.m = i;
                        b.put("cursorId", Integer.valueOf(i));
                        wwt0 wwt0Var2 = new wwt0(i, num.intValue(), zwt0Var);
                        try {
                            this.g.put(Integer.valueOf(i), wwt0Var2);
                            wwt0Var = wwt0Var2;
                        } catch (Exception e) {
                            e = e;
                            wwt0Var = wwt0Var2;
                            h(e, q55Var);
                            if (wwt0Var != null) {
                                a(wwt0Var);
                            }
                            if (wwt0Var != null || zwt0Var == 0) {
                                return false;
                            }
                            zwt0Var.close();
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            wwt0Var = wwt0Var2;
                            if (wwt0Var == null && zwt0Var != 0) {
                                zwt0Var.close();
                            }
                            throw th;
                        }
                    }
                    q55Var.success(b);
                    if (wwt0Var == null) {
                        zwt0Var.close();
                    }
                    return true;
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e3) {
            e = e3;
            zwt0Var = 0;
        } catch (Throwable th3) {
            th = th3;
            zwt0Var = 0;
        }
    }

    public final boolean e(q55 q55Var) {
        if (f(q55Var)) {
            Cursor cursor = null;
            if (q55Var.c()) {
                q55Var.success(null);
                return true;
            }
            try {
                try {
                    Cursor rawQuery = this.i.rawQuery("SELECT changes()", null);
                    if (rawQuery != null) {
                        try {
                            if (rawQuery.getCount() > 0 && rawQuery.moveToFirst()) {
                                int i = rawQuery.getInt(0);
                                if (this.d >= 1) {
                                    g();
                                }
                                q55Var.success(Integer.valueOf(i));
                                rawQuery.close();
                                return true;
                            }
                        } catch (Exception e) {
                            e = e;
                            cursor = rawQuery;
                            h(e, q55Var);
                            if (cursor != null) {
                                cursor.close();
                            }
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            cursor = rawQuery;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                    Log.e("Sqflite", g().concat("fail to read changes for Update/Delete"));
                    q55Var.success(null);
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    return true;
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return false;
    }

    public final boolean f(q55 q55Var) {
        String str = (String) q55Var.a("sql");
        List list = (List) q55Var.a("arguments");
        if (list == null) {
            list = new ArrayList();
        }
        if (this.d >= 1) {
            g();
            if (!list.isEmpty()) {
                new StringBuilder(" ").append(list);
            }
        }
        Object a = q55Var.a("inTransaction");
        Boolean bool = a instanceof Boolean ? (Boolean) a : null;
        try {
            SQLiteDatabase sQLiteDatabase = this.i;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(zwt0.a(it.next()));
            }
            sQLiteDatabase.execSQL(str, arrayList.toArray(new Object[0]));
            synchronized (this) {
                try {
                    if (Boolean.TRUE.equals(bool)) {
                        this.j++;
                    } else if (Boolean.FALSE.equals(bool)) {
                        this.j--;
                    }
                } finally {
                }
            }
            return true;
        } catch (Exception e) {
            h(e, q55Var);
            return false;
        }
    }

    public final String g() {
        StringBuilder sb = new StringBuilder("[");
        Thread currentThread = Thread.currentThread();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.c);
        sb2.append(",");
        sb2.append(currentThread.getName());
        sb2.append(Extension.O_BRAKE);
        sb2.append(Build.VERSION.SDK_INT >= 36 ? currentThread.threadId() : currentThread.getId());
        sb2.append(Extension.C_BRAKE);
        sb.append(sb2.toString());
        sb.append("] ");
        return sb.toString();
    }

    public final void h(Exception exc, q55 q55Var) {
        if (exc instanceof SQLiteCantOpenDatabaseException) {
            q55Var.l(null, "open_failed " + this.b);
            return;
        }
        if (exc instanceof SQLException) {
            String message = exc.getMessage();
            String str = (String) q55Var.a("sql");
            Collection collection = (List) q55Var.a("arguments");
            if (collection == null) {
                collection = new ArrayList();
            }
            HashMap hashMap = new HashMap();
            hashMap.put("sql", str);
            hashMap.put("arguments", collection);
            q55Var.l(hashMap, message);
            return;
        }
        String message2 = exc.getMessage();
        String str2 = (String) q55Var.a("sql");
        Collection collection2 = (List) q55Var.a("arguments");
        if (collection2 == null) {
            collection2 = new ArrayList();
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("sql", str2);
        hashMap2.put("arguments", collection2);
        q55Var.l(hashMap2, message2);
    }

    public final synchronized boolean i() {
        return this.j > 0;
    }

    public final void j() {
        ApplicationInfo applicationInfo;
        PackageManager.ApplicationInfoFlags of;
        if (n == null) {
            Context context = this.e;
            boolean z = false;
            try {
                String packageName = context.getPackageName();
                if (Build.VERSION.SDK_INT >= 33) {
                    PackageManager packageManager = context.getPackageManager();
                    of = PackageManager.ApplicationInfoFlags.of(128L);
                    applicationInfo = packageManager.getApplicationInfo(packageName, of);
                } else {
                    applicationInfo = context.getPackageManager().getApplicationInfo(packageName, 128);
                }
                if (applicationInfo.metaData.getBoolean("com.tekartik.sqflite.wal_enabled", false)) {
                    z = true;
                }
            } catch (Exception unused) {
            }
            n = Boolean.valueOf(z);
            if (z && rez.a(this.d)) {
                g();
            }
        }
        this.i = SQLiteDatabase.openDatabase(this.b, null, n.booleanValue() ? 805306368 : SelfTester_JCP.IMITA);
    }

    public final void k(z920 z920Var, Runnable runnable) {
        Integer num = (Integer) z920Var.a("transactionId");
        Integer num2 = this.l;
        if (num2 == null) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.f;
        if (num == null || !(num.equals(num2) || num.intValue() == -1)) {
            arrayList.add(new blg0(runnable));
            return;
        }
        runnable.run();
        if (this.l != null || arrayList.isEmpty()) {
            return;
        }
        this.h.h(this, new oxe(10, this));
    }
}
