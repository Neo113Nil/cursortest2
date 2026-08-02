package com.yandex.div.storage.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import java.io.Closeable;

/* compiled from: DatabaseOpenHelper.kt */
/* loaded from: classes7.dex */
public interface DatabaseOpenHelper {

    /* compiled from: DatabaseOpenHelper.kt */
    public interface CreateCallback {
        void onCreate(Database database);
    }

    /* compiled from: DatabaseOpenHelper.kt */
    public interface Database extends Closeable {
        void beginTransaction();

        SQLiteStatement compileStatement(String str);

        void endTransaction();

        void execSQL(String str);

        Cursor rawQuery(String str, String[] strArr);

        void setTransactionSuccessful();
    }

    /* compiled from: DatabaseOpenHelper.kt */
    public interface UpgradeCallback {
        void onUpgrade(Database database, int i, int i2);
    }

    Database getReadableDatabase();

    Database getWritableDatabase();
}
