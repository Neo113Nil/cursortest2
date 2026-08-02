package xsna;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* compiled from: ActionWithOfflineSupportDatabase.kt */
/* loaded from: classes.dex */
public final class z60 extends SQLiteOpenHelper {
    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(xqm0.g("\n            CREATE TABLE actions_with_offline_support (\n                _id INTEGER PRIMARY KEY AUTOINCREMENT,\n                action BLOB NOT NULL,\n                action_type TEXT NOT NULL,\n                sync_result BLOB,\n                sync_status TEXT NOT NULL DEFAULT " + a70.h.h() + ",\n                last_sync_error BLOB,\n                sync_attempt_count INTEGER NOT NULL DEFAULT 0)\n            "));
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS actions_with_offline_support");
        onCreate(sQLiteDatabase);
    }
}
