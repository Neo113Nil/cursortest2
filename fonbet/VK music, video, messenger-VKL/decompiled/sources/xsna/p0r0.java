package xsna;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* compiled from: UsersDbHelper.kt */
/* loaded from: classes11.dex */
public final class p0r0 extends SQLiteOpenHelper {
    public p0r0(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 3);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            sQLiteDatabase.execSQL("CREATE TABLE users( user_id INTEGER PRIMARY KEY, name TEXT NOT NULL, avatar TEXT, exchange_token TEXT NOT NULL, timestamp INTEGER, logged_in INTEGER DEFAULT 0, profile_type INTEGER DEFAULT 0, last_name TEXT, phone TEXT, email TEXT);");
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i < 2 && sQLiteDatabase != null) {
            sQLiteDatabase.execSQL("ALTER TABLE users\nADD COLUMN profile_type DEFAULT 0");
        }
        if (i < 3) {
            if (sQLiteDatabase != null) {
                sQLiteDatabase.execSQL("ALTER TABLE users \n                ADD COLUMN last_name TEXT");
            }
            if (sQLiteDatabase != null) {
                sQLiteDatabase.execSQL("ALTER TABLE users \n                ADD COLUMN phone TEXT");
            }
            if (sQLiteDatabase != null) {
                sQLiteDatabase.execSQL("ALTER TABLE users \n                ADD COLUMN email TEXT");
            }
        }
    }
}
