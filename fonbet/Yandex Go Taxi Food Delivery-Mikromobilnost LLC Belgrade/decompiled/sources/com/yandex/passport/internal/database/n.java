package com.yandex.passport.internal.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.a0;
import com.yandex.passport.internal.entities.ClientToken;
import defpackage.ooc;
import defpackage.sls;

/* loaded from: classes8.dex */
public final class n {
    public final sls a;
    public final sls b;

    public n(sls slsVar, sls slsVar2) {
        this.a = slsVar;
        this.b = slsVar2;
    }

    public final void a(Uid uid) {
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "dropClientToken: uid=" + uid, 8);
        }
        int delete = ((SQLiteDatabase) ((DatabaseHelper$tokensDao$2) this.b).invoke()).delete("tokens", "uid = ?", a0.h0(uid));
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "dropClientToken(uid): rows=" + delete, 8);
        }
    }

    public final ClientToken b(Uid uid, String str) {
        ClientToken clientToken;
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "getClientToken: uid=" + uid + " decryptedClientId=" + str, 8);
        }
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) ((DatabaseHelper$tokensDao$1) this.a).invoke();
        String[] strArr = com.yandex.passport.internal.database.tables.b.c;
        StringBuilder sb = new StringBuilder();
        sb.append(uid.getEnvironment().getInteger());
        sb.append(':');
        sb.append(uid.getValue());
        Cursor query = sQLiteDatabase.query("tokens", strArr, "uid = ? AND client_id = ?", new String[]{sb.toString(), str}, null, null, null);
        try {
            Cursor cursor = query;
            if (cursor.moveToNext()) {
                clientToken = new ClientToken(cursor.getString(cursor.getColumnIndexOrThrow("client_token")), str);
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "getClientToken: return token for uid " + uid + " and client id " + str, 8);
                }
            } else {
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "getClientToken: no token for uid " + uid, 8);
                }
                clientToken = null;
            }
            ooc.g(query, null);
            return clientToken;
        } finally {
        }
    }
}
