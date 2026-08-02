package xsna;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
@VisibleForTesting
/* loaded from: classes13.dex */
public final class x701 extends SQLiteOpenHelper {
    public final /* synthetic */ e901 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x701(e901 e901Var, Context context) {
        super(context, "google_app_measurement_local.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.b = e901Var;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() throws SQLiteException {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e) {
            throw e;
        } catch (SQLiteException unused) {
            e901 e901Var = this.b;
            k901 k901Var = ((mb01) e901Var.b).j;
            mb01.k(k901Var);
            k901Var.i.a("Opening the local database failed, dropping and recreating it");
            ((mb01) e901Var.b).getClass();
            if (!((mb01) e901Var.b).b.getDatabasePath("google_app_measurement_local.db").delete()) {
                k901 k901Var2 = ((mb01) e901Var.b).j;
                mb01.k(k901Var2);
                k901Var2.i.b("google_app_measurement_local.db", "Failed to delete corrupted local db file");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e2) {
                k901 k901Var3 = ((mb01) e901Var.b).j;
                mb01.k(k901Var3);
                k901Var3.i.b(e2, "Failed to open local database. Events will bypass local storage");
                return null;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        k901 k901Var = ((mb01) this.b.b).j;
        mb01.k(k901Var);
        fyz0.b(k901Var, sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        k901 k901Var = ((mb01) this.b.b).j;
        mb01.k(k901Var);
        fyz0.a(k901Var, sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", null);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
