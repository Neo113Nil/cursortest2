package xsna;

import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteReadOnlyDatabaseException;

/* compiled from: EngineExceptionsExt.kt */
/* loaded from: classes2.dex */
public final class nlp {
    public static final boolean a(Throwable th, Class<?> cls) {
        while (th != null) {
            if (cls.isAssignableFrom(th.getClass())) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    public static final boolean b(Throwable th) {
        String message;
        while (th != null) {
            if (!(th instanceof SQLiteReadOnlyDatabaseException) && !(th instanceof SQLiteCantOpenDatabaseException) && !(th instanceof SQLiteDatabaseLockedException) && !(th instanceof SQLiteFullException) && !(th instanceof SQLiteDiskIOException) && !(th instanceof SQLiteDatabaseCorruptException)) {
                if (th instanceof IllegalStateException) {
                    String message2 = ((IllegalStateException) th).getMessage();
                    if (message2 != null && drm0.D(message2, "attempt to re-open an already-closed object", true)) {
                    }
                    th = th.getCause();
                } else {
                    if ((th instanceof SQLiteException) && (message = ((SQLiteException) th).getMessage()) != null && drm0.D(message, "malformed database schema", true)) {
                    }
                    th = th.getCause();
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean c(Throwable th) {
        SQLiteException sQLiteException;
        String message;
        while (true) {
            sQLiteException = null;
            if (th == null) {
                break;
            }
            if (th.getClass().equals(SQLiteException.class)) {
                sQLiteException = (SQLiteException) th;
                break;
            }
            if (th.equals(th.getCause())) {
                break;
            }
            th = th.getCause();
        }
        return (sQLiteException == null || (message = sQLiteException.getMessage()) == null || !drm0.D(message, "no such table", true)) ? false : true;
    }

    public static final String d(Throwable th) {
        String message;
        String message2;
        while (th != null) {
            String str = th instanceof SQLiteReadOnlyDatabaseException ? "db_read_only" : th instanceof SQLiteCantOpenDatabaseException ? "db_cant_open_db" : th instanceof SQLiteDatabaseLockedException ? "db_locked" : th instanceof SQLiteFullException ? "disk_full" : th instanceof SQLiteDiskIOException ? "disk_io" : th instanceof SQLiteDatabaseCorruptException ? "db_corrupted" : ((th instanceof IllegalStateException) && (message2 = ((IllegalStateException) th).getMessage()) != null && drm0.D(message2, "attempt to re-open an already-closed object", true)) ? "db_closed" : ((th instanceof SQLiteException) && (message = ((SQLiteException) th).getMessage()) != null && drm0.D(message, "malformed database schema", true)) ? "db_broken_schema" : null;
            if (str != null) {
                return str;
            }
            th = th.getCause();
        }
        return "unknown_error";
    }
}
