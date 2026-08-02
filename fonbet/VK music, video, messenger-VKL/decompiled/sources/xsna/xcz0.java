package xsna;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import java.util.HashSet;
import java.util.Set;
import xsna.taz0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes.dex */
public final class xcz0 implements taz0 {
    public final SQLiteDatabase a;
    public final SQLiteStatement b;
    public final SQLiteStatement c;
    public final SQLiteStatement d;
    public final fxc0 e = new fxc0();

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static final class a implements taz0.a {
        public final Cursor b;
        public final fxc0 c;

        public a(Cursor cursor, fxc0 fxc0Var) {
            this.b = cursor;
            this.c = fxc0Var;
        }

        @Override // xsna.taz0.a
        public final bez0 a() {
            Cursor cursor = this.b;
            long j = cursor.getLong(0);
            String string = cursor.getString(1);
            String string2 = cursor.getString(2);
            cursor.getLong(3);
            String string3 = cursor.getString(4);
            boolean z = cursor.getLong(5) == 1;
            this.c.getClass();
            return new bez0(j, string, string2, fxc0.h(string3), z);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.b.close();
        }

        @Override // xsna.taz0.a
        public final boolean moveToNext() {
            return this.b.moveToNext();
        }
    }

    public xcz0(SQLiteDatabase sQLiteDatabase) {
        this.a = sQLiteDatabase;
        this.b = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_stat_send(url, type, timestampMs, deadlineMs, adId, monitoring, neededDetailedMonitoring) VALUES (?, ?, ?, ?, ?, ?, ?)");
        this.c = sQLiteDatabase.compileStatement("DELETE FROM table_stat_send WHERE id=?");
        this.d = sQLiteDatabase.compileStatement("DELETE FROM table_stat_send WHERE deadlineMs <= ?");
    }

    @Override // xsna.taz0
    public final void a(String str, String str2, long j, long j2, e7z0 e7z0Var, boolean z) {
        SQLiteStatement sQLiteStatement = this.b;
        try {
            String str3 = e7z0Var.a.a;
            this.e.getClass();
            String d = fxc0.d(e7z0Var);
            sQLiteStatement.bindString(1, str);
            sQLiteStatement.bindString(2, str2);
            sQLiteStatement.bindLong(3, j);
            sQLiteStatement.bindLong(4, j2);
            sQLiteStatement.bindString(5, str3);
            sQLiteStatement.bindString(6, d);
            sQLiteStatement.bindLong(7, z ? 1L : 0L);
            sQLiteStatement.executeInsert();
        } catch (Throwable th) {
            try {
                gu8.c(null, "DB insertStat error: " + th);
            } finally {
                sQLiteStatement.clearBindings();
            }
        }
    }

    @Override // xsna.taz0
    public final void b(long j) {
        SQLiteStatement sQLiteStatement = this.c;
        try {
            sQLiteStatement.bindLong(1, j);
            sQLiteStatement.executeUpdateDelete();
        } catch (Throwable th) {
            try {
                gu8.c(null, "DB deleteInfo error: " + th);
            } finally {
                sQLiteStatement.clearBindings();
            }
        }
    }

    @Override // xsna.taz0
    public final Set b() {
        HashSet hashSet = new HashSet();
        try {
            Cursor rawQuery = this.a.rawQuery("SELECT url FROM table_stat_send WHERE neededDetailedMonitoring == 1", null);
            while (rawQuery.moveToNext()) {
                try {
                    hashSet.add(rawQuery.getString(0));
                } finally {
                }
            }
            rawQuery.close();
            return hashSet;
        } catch (Throwable th) {
            gu8.c(null, "DB getUrlsWithNeededDetailedMonitoring error: " + th);
            return hashSet;
        }
    }

    @Override // xsna.taz0
    public final void a(long j) {
        SQLiteStatement sQLiteStatement = this.d;
        try {
            sQLiteStatement.bindLong(1, j);
            sQLiteStatement.executeUpdateDelete();
        } catch (Throwable th) {
            try {
                gu8.c(null, "DB deleteOldStats error: " + th);
            } finally {
                sQLiteStatement.clearBindings();
            }
        }
    }

    @Override // xsna.taz0
    public final taz0.a a() {
        try {
            return new a(this.a.rawQuery("SELECT id, url, type, timestampMs, monitoring, neededDetailedMonitoring  FROM table_stat_send", null), this.e);
        } catch (Throwable th) {
            gu8.c(null, "DB getStatsToSendIterator error: " + th);
            throw th;
        }
    }
}
