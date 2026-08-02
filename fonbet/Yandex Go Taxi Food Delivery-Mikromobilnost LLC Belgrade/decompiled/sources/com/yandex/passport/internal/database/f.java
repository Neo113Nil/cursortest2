package com.yandex.passport.internal.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.a0;
import defpackage.ooc;
import defpackage.sls;

/* loaded from: classes8.dex */
public final class f {
    public final sls a;
    public final sls b;

    public f(sls slsVar, sls slsVar2) {
        this.a = slsVar;
        this.b = slsVar2;
    }

    public final boolean a(Uid uid) {
        Cursor query = ((SQLiteDatabase) ((DatabaseHelper$delayedAccountUidsDao$1) this.a).invoke()).query("local_uids", com.yandex.passport.internal.database.tables.a.c, "uid = ?", new String[]{String.valueOf(uid.getValue())}, null, null, null);
        try {
            Cursor cursor = query;
            while (cursor.moveToNext()) {
                String L = a0.L(cursor, "uid");
                if ((L != null ? Long.valueOf(Long.parseLong(L)) : null) != null) {
                    ooc.g(query, null);
                    return true;
                }
            }
            ooc.g(query, null);
            return false;
        } finally {
        }
    }
}
