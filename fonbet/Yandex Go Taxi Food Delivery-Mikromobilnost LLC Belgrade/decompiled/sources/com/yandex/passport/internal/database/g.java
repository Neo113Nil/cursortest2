package com.yandex.passport.internal.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.push.j0;

/* loaded from: classes8.dex */
public final class g {
    public final DatabaseHelper a;

    public g(DatabaseHelper databaseHelper) {
        this.a = databaseHelper;
    }

    public final j0 a(Uid uid) {
        SQLiteDatabase readableDatabase = this.a.getReadableDatabase();
        StringBuilder sb = new StringBuilder();
        sb.append(uid.getEnvironment().getInteger());
        sb.append(':');
        sb.append(uid.getValue());
        Cursor rawQuery = readableDatabase.rawQuery("SELECT gcm_token_hash FROM gcm_subscriptions WHERE uid = '" + sb.toString() + "'", null);
        try {
            if (!rawQuery.moveToFirst()) {
                rawQuery.close();
                return null;
            }
            j0 j0Var = new j0(uid, rawQuery.getString(rawQuery.getColumnIndexOrThrow("gcm_token_hash")));
            rawQuery.close();
            return j0Var;
        } catch (Throwable th) {
            if (rawQuery != null) {
                try {
                    rawQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
