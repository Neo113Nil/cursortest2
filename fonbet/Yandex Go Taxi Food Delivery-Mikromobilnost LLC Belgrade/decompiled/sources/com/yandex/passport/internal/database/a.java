package com.yandex.passport.internal.database;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.AccountRow;
import com.yandex.passport.internal.a0;
import com.yandex.passport.internal.flags.q;
import defpackage.ooc;
import defpackage.sls;
import defpackage.uw51;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Result;

/* loaded from: classes8.dex */
public final class a {
    public final sls a;
    public final sls b;
    public final n c;
    public final f d;
    public final com.yandex.passport.internal.usecase.k e;
    public final com.yandex.passport.internal.usecase.j f;
    public final com.yandex.passport.internal.network.mappers.h g;
    public final com.yandex.passport.internal.flags.j h;
    public final Object i = new Object();
    public volatile ArrayList j;

    public a(sls slsVar, sls slsVar2, n nVar, f fVar, com.yandex.passport.internal.usecase.k kVar, com.yandex.passport.internal.usecase.j jVar, com.yandex.passport.internal.network.mappers.h hVar, com.yandex.passport.internal.flags.j jVar2) {
        this.a = slsVar;
        this.b = slsVar2;
        this.c = nVar;
        this.d = fVar;
        this.e = kVar;
        this.f = jVar;
        this.g = hVar;
        this.h = jVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AccountRow a(Cursor cursor, String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        Object failure;
        String L = a0.L(cursor, "secure_blob");
        com.yandex.passport.internal.usecase.j jVar = this.f;
        if (L != null) {
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "blob original: ".concat(L), 8);
            }
            Serializable b = jVar.b(L, "secure_blob");
            if (b instanceof Result.Failure) {
                b = null;
            }
            String str6 = (String) b;
            if (str6 != null) {
                try {
                    failure = a0.k0(str6);
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                if (failure instanceof Result.Failure) {
                    failure = null;
                }
                b bVar = (b) failure;
                if (bVar != null) {
                    String a = bVar.a();
                    String c = bVar.c();
                    String b2 = bVar.b();
                    com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        uw51.w("blob decrypted userInfo: ", c, LogLevel.DEBUG, null, 8);
                    }
                    return new AccountRow(str == null ? a0.M(cursor, "name") : str, a, a0.L(cursor, "uid"), c, a0.L(cursor, "user_info_meta"), b2, a0.L(cursor, "legacy_account_type"), a0.L(cursor, "legacy_affinity"), a0.L(cursor, "legacy_extra_data_body"));
                }
            }
        }
        String L2 = a0.L(cursor, "master_token_value");
        String L3 = a0.L(cursor, "user_info_body");
        String L4 = a0.L(cursor, "stash_body");
        com.yandex.passport.common.logger.c cVar3 = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            str2 = "legacy_extra_data_body";
            str3 = "legacy_affinity";
            uw51.w("original: ", L3, LogLevel.DEBUG, null, 8);
        } else {
            str2 = "legacy_extra_data_body";
            str3 = "legacy_affinity";
        }
        if (L3 != null) {
            Serializable b3 = jVar.b(L3, "user_info_body");
            if (b3 instanceof Result.Failure) {
                b3 = null;
            }
            str4 = (String) b3;
        } else {
            str4 = null;
        }
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            uw51.w("decrypted: ", str4, LogLevel.DEBUG, null, 8);
        }
        String M = str == null ? a0.M(cursor, "name") : str;
        if (L2 != null) {
            Serializable b4 = jVar.b(L2, "master_token_value");
            if (b4 instanceof Result.Failure) {
                b4 = null;
            }
            str5 = (String) b4;
        } else {
            str5 = null;
        }
        String L5 = a0.L(cursor, "uid");
        String L6 = a0.L(cursor, "user_info_meta");
        if (L4 != null) {
            Serializable b5 = jVar.b(L4, "stash_body");
            r11 = (String) (b5 instanceof Result.Failure ? null : b5);
        }
        return new AccountRow(M, str5, L5, str4, L6, r11, a0.L(cursor, "legacy_account_type"), a0.L(cursor, str3), a0.L(cursor, str2));
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        Cursor query = ((SQLiteDatabase) ((DatabaseHelper$accountsDao$1) this.a).invoke()).query("accounts", com.yandex.passport.internal.database.tables.a.b, null, null, null, null, null);
        try {
            Cursor cursor = query;
            while (cursor.moveToNext()) {
                arrayList.add(a(cursor, null));
            }
            ooc.g(query, null);
            return arrayList;
        } finally {
        }
    }

    public final ContentValues c(AccountRow accountRow) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", accountRow.name);
        contentValues.put("uid", accountRow.uidString);
        contentValues.put("user_info_meta", accountRow.userInfoMeta);
        contentValues.put("legacy_account_type", accountRow.legacyAccountType);
        contentValues.put("legacy_affinity", accountRow.legacyAffinity);
        contentValues.put("legacy_extra_data_body", accountRow.legacyExtraDataBody);
        boolean booleanValue = ((Boolean) this.h.b(q.j0)).booleanValue();
        com.yandex.passport.internal.usecase.k kVar = this.e;
        if (booleanValue) {
            Serializable b = kVar.b(a0.Q(accountRow.masterTokenValue, accountRow.userInfoBody, accountRow.stashBody), "secure_blob");
            if (b instanceof Result.Failure) {
                b = null;
            }
            String str = (String) b;
            if (str != null) {
                contentValues.put("secure_blob", str);
                contentValues.putNull("master_token_value");
                contentValues.putNull("user_info_body");
                contentValues.putNull("stash_body");
                return contentValues;
            }
        } else {
            contentValues.putNull("secure_blob");
        }
        Serializable b2 = kVar.b(accountRow.masterTokenValue, "master_token_value");
        String str2 = accountRow.masterTokenValue;
        if (b2 instanceof Result.Failure) {
            b2 = str2;
        }
        contentValues.put("master_token_value", (String) b2);
        Serializable b3 = kVar.b(accountRow.userInfoBody, "user_info_body");
        String str3 = accountRow.userInfoBody;
        if (b3 instanceof Result.Failure) {
            b3 = str3;
        }
        contentValues.put("user_info_body", (String) b3);
        Serializable b4 = kVar.b(accountRow.stashBody, "stash_body");
        String str4 = accountRow.stashBody;
        if (b4 instanceof Result.Failure) {
            b4 = str4;
        }
        contentValues.put("stash_body", (String) b4);
        return contentValues;
    }
}
