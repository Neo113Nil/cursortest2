package xsna;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* compiled from: KeyStorageSQLiteHelper.kt */
@ozl
/* loaded from: classes11.dex */
public final class cey extends SQLiteOpenHelper {
    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            sQLiteDatabase.execSQL("CREATE TABLE encrypted_aliases(encrypted_alias TEXT NOT NULL PRIMARY KEY, encrypted_alias_value TEXT NOT NULL)");
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
