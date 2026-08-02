package xsna;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* compiled from: AndroidContactDb.kt */
/* loaded from: classes17.dex */
public final class q62 extends SQLiteOpenHelper {
    public q62(Context context) {
        super(context, "libcontacts.sqlite", (SQLiteDatabase.CursorFactory) null, 5);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("\n            CREATE TABLE android_contacts(\n                id INTEGER NOT NULL PRIMARY KEY,\n                android_id INTEGER,\n                name TEXT NOT NULL,\n                is_favorite INT NOT NULL,\n                phones TEXT,\n                original_phones TEXT,\n                emails TEXT\n            );\n        ");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS android_contacts");
        sQLiteDatabase.execSQL("\n            CREATE TABLE android_contacts(\n                id INTEGER NOT NULL PRIMARY KEY,\n                android_id INTEGER,\n                name TEXT NOT NULL,\n                is_favorite INT NOT NULL,\n                phones TEXT,\n                original_phones TEXT,\n                emails TEXT\n            );\n        ");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS android_contacts");
        sQLiteDatabase.execSQL("\n            CREATE TABLE android_contacts(\n                id INTEGER NOT NULL PRIMARY KEY,\n                android_id INTEGER,\n                name TEXT NOT NULL,\n                is_favorite INT NOT NULL,\n                phones TEXT,\n                original_phones TEXT,\n                emails TEXT\n            );\n        ");
    }
}
