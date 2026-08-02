package com.yandex.passport.internal.database.tables;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.common.logger.c;
import defpackage.ooc;

/* loaded from: classes2.dex */
public abstract class b {
    public static final String[] a = {"uid", "gcm_token_hash"};
    public static final String[] b = {"uid", "master_token_value", "attempts"};
    public static final String[] c = {"client_token"};

    public static void a(SQLiteDatabase sQLiteDatabase) {
        try {
            Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM children WHERE is_deleted = ?", new String[]{"0"});
            try {
                try {
                    Cursor cursor = rawQuery;
                    ooc.g(rawQuery, null);
                } catch (SQLiteException e) {
                    c cVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "", e);
                    }
                }
            } finally {
            }
        } catch (SQLiteException unused) {
            sQLiteDatabase.execSQL("ALTER TABLE children ADD COLUMN is_deleted BOOLEAN NOT NULL DEFAULT \"0\"");
        }
    }

    public static void b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("    CREATE TABLE new_tokens (\n    uid TEXT,\n    client_id TEXT,\n    client_token TEXT,\n    PRIMARY KEY (uid,  client_id)\n)");
        sQLiteDatabase.execSQL("    INSERT INTO new_tokens (uid, client_id, client_token)\nSELECT uid, client_id, client_token FROM tokens");
        sQLiteDatabase.execSQL("DROP TABLE tokens");
        sQLiteDatabase.execSQL("ALTER TABLE new_tokens RENAME TO tokens");
    }
}
