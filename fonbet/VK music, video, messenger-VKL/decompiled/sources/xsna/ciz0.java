package xsna;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import java.util.concurrent.ConcurrentHashMap;
import xsna.eez0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes.dex */
public final class ciz0 implements vfz0 {
    public final SQLiteDatabase a;
    public final SQLiteStatement b;
    public final SQLiteStatement c;
    public final fxc0 d = new fxc0();

    public ciz0(SQLiteDatabase sQLiteDatabase) {
        this.a = sQLiteDatabase;
        this.b = sQLiteDatabase.compileStatement("INSERT INTO table_audit_pixel_attempts(adId, pixelUrl, type, attempt, timestamp, error, isCompleted, monitoring) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
        this.c = sQLiteDatabase.compileStatement("DELETE FROM table_audit_pixel_attempts WHERE adId=?");
    }

    @Override // xsna.vfz0
    public final void a(String str, String str2, String str3, eez0.a aVar, boolean z, e7z0 e7z0Var) {
        int i = aVar.a;
        long j = aVar.b;
        String str4 = aVar.c;
        SQLiteStatement sQLiteStatement = this.b;
        try {
            this.d.getClass();
            String d = fxc0.d(e7z0Var);
            sQLiteStatement.bindString(1, str);
            sQLiteStatement.bindString(2, str2);
            sQLiteStatement.bindString(3, str3);
            sQLiteStatement.bindLong(4, i);
            sQLiteStatement.bindLong(5, j);
            sQLiteStatement.bindString(6, String.valueOf(str4));
            sQLiteStatement.bindLong(7, z ? 1L : 0L);
            sQLiteStatement.bindString(8, d);
            sQLiteStatement.executeInsert();
        } catch (Throwable th) {
            try {
                gu8.c(null, "AuditPixelDbTableReal.insertAttempt() error: " + th);
            } finally {
                sQLiteStatement.clearBindings();
            }
        }
    }

    @Override // xsna.vfz0
    public final ConcurrentHashMap getAll() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        try {
            Cursor rawQuery = this.a.rawQuery("SELECT adId, pixelUrl, type, attempt, timestamp, error, isCompleted, monitoring FROM table_audit_pixel_attempts", null);
            while (rawQuery.moveToNext()) {
                try {
                    String string = rawQuery.getString(0);
                    String string2 = rawQuery.getString(1);
                    String string3 = rawQuery.getString(2);
                    int i = rawQuery.getInt(3);
                    long j = rawQuery.getLong(4);
                    String string4 = rawQuery.getString(5);
                    boolean z = rawQuery.getLong(6) == 1;
                    String string5 = rawQuery.getString(7);
                    ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) concurrentHashMap.get(string);
                    if (concurrentHashMap2 == null) {
                        concurrentHashMap2 = new ConcurrentHashMap();
                        ConcurrentHashMap concurrentHashMap3 = (ConcurrentHashMap) concurrentHashMap.putIfAbsent(string, concurrentHashMap2);
                        if (concurrentHashMap3 != null) {
                            concurrentHashMap2 = concurrentHashMap3;
                        }
                    }
                    eez0 eez0Var = (eez0) concurrentHashMap2.get(string2);
                    if (eez0Var == null) {
                        this.d.getClass();
                        eez0 eez0Var2 = new eez0(string2, string3, fxc0.h(string5));
                        eez0Var = (eez0) concurrentHashMap2.putIfAbsent(string2, eez0Var2);
                        if (eez0Var == null) {
                            eez0Var = eez0Var2;
                        }
                    }
                    eez0Var.c(i, j, string4);
                    if (z) {
                        eez0Var.d(true);
                    }
                } finally {
                }
            }
            rawQuery.close();
            return concurrentHashMap;
        } catch (Throwable th) {
            gu8.c(null, "AuditPixelDbTableReal.getAll() error: " + th);
            return concurrentHashMap;
        }
    }

    @Override // xsna.vfz0
    public final void a(String str) {
        SQLiteStatement sQLiteStatement = this.c;
        try {
            sQLiteStatement.bindString(1, str);
            sQLiteStatement.executeUpdateDelete();
        } catch (Throwable th) {
            try {
                gu8.c(null, "AuditPixelDbTableReal.deleteAuditBanner() error: " + th);
            } finally {
                sQLiteStatement.clearBindings();
            }
        }
    }
}
