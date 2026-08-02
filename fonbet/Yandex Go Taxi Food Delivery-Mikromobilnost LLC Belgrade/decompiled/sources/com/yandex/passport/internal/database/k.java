package com.yandex.passport.internal.database;

import com.yandex.go.sql.BaseDatabaseHelper;
import defpackage.gwk0;
import defpackage.hkw0;
import defpackage.kne0;
import defpackage.p5x0;
import defpackage.s5x0;
import defpackage.smw0;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes8.dex */
public final class k extends gwk0 {
    public final /* synthetic */ PassportDatabase_Impl h;

    public k(PassportDatabase_Impl passportDatabase_Impl) {
        this.h = passportDatabase_Impl;
    }

    public final void M(hkw0 hkw0Var) {
        hkw0Var.r("CREATE TABLE IF NOT EXISTS `diary_method` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `isUiMethod` INTEGER NOT NULL, `issuedAt` INTEGER NOT NULL, `uploadId` INTEGER)");
        hkw0Var.r("CREATE TABLE IF NOT EXISTS `diary_parameter` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `methodName` TEXT NOT NULL, `value` TEXT NOT NULL, `issuedAt` INTEGER NOT NULL, `uploadId` INTEGER)");
        hkw0Var.r("CREATE TABLE IF NOT EXISTS `diary_upload` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `uploadedAt` INTEGER NOT NULL)");
        hkw0Var.r("CREATE TABLE IF NOT EXISTS `modern_auth_cookie` (`uid` TEXT NOT NULL, `cookies` TEXT NOT NULL, `domain` TEXT NOT NULL DEFAULT '', PRIMARY KEY(`uid`, `domain`))");
        hkw0Var.r("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        hkw0Var.r("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '51126f9ef807fa748bae1e4190fbd279')");
    }

    public final kne0 N(hkw0 hkw0Var) {
        HashMap hashMap = new HashMap(5);
        hashMap.put("id", new p5x0(1, "id", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        hashMap.put("name", new p5x0(0, "name", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        hashMap.put("isUiMethod", new p5x0(0, "isUiMethod", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        hashMap.put("issuedAt", new p5x0(0, "issuedAt", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        hashMap.put("uploadId", new p5x0(0, "uploadId", BaseDatabaseHelper.TYPE_INTEGER, null, false, 1));
        s5x0 s5x0Var = new s5x0("diary_method", hashMap, new HashSet(0), new HashSet(0));
        s5x0 a = s5x0.a(hkw0Var, "diary_method");
        if (!s5x0Var.equals(a)) {
            return new kne0(false, smw0.i("diary_method(com.yandex.passport.internal.database.diary.DiaryMethodEntity).\n Expected:\n", s5x0Var, "\n Found:\n", a));
        }
        HashMap hashMap2 = new HashMap(6);
        hashMap2.put("id", new p5x0(1, "id", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        hashMap2.put("name", new p5x0(0, "name", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        hashMap2.put("methodName", new p5x0(0, "methodName", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        hashMap2.put("value", new p5x0(0, "value", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        hashMap2.put("issuedAt", new p5x0(0, "issuedAt", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        hashMap2.put("uploadId", new p5x0(0, "uploadId", BaseDatabaseHelper.TYPE_INTEGER, null, false, 1));
        s5x0 s5x0Var2 = new s5x0("diary_parameter", hashMap2, new HashSet(0), new HashSet(0));
        s5x0 a2 = s5x0.a(hkw0Var, "diary_parameter");
        if (!s5x0Var2.equals(a2)) {
            return new kne0(false, smw0.i("diary_parameter(com.yandex.passport.internal.database.diary.DiaryParameterEntity).\n Expected:\n", s5x0Var2, "\n Found:\n", a2));
        }
        HashMap hashMap3 = new HashMap(2);
        hashMap3.put("id", new p5x0(1, "id", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        hashMap3.put("uploadedAt", new p5x0(0, "uploadedAt", BaseDatabaseHelper.TYPE_INTEGER, null, true, 1));
        s5x0 s5x0Var3 = new s5x0("diary_upload", hashMap3, new HashSet(0), new HashSet(0));
        s5x0 a3 = s5x0.a(hkw0Var, "diary_upload");
        if (!s5x0Var3.equals(a3)) {
            return new kne0(false, smw0.i("diary_upload(com.yandex.passport.internal.database.diary.DiaryUploadEntity).\n Expected:\n", s5x0Var3, "\n Found:\n", a3));
        }
        HashMap hashMap4 = new HashMap(3);
        hashMap4.put("uid", new p5x0(1, "uid", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        hashMap4.put("cookies", new p5x0(0, "cookies", BaseDatabaseHelper.TYPE_TEXT, null, true, 1));
        hashMap4.put("domain", new p5x0(2, "domain", BaseDatabaseHelper.TYPE_TEXT, "''", true, 1));
        s5x0 s5x0Var4 = new s5x0("modern_auth_cookie", hashMap4, new HashSet(0), new HashSet(0));
        s5x0 a4 = s5x0.a(hkw0Var, "modern_auth_cookie");
        return !s5x0Var4.equals(a4) ? new kne0(false, smw0.i("modern_auth_cookie(com.yandex.passport.internal.database.auth_cookie.AuthCookieEntity).\n Expected:\n", s5x0Var4, "\n Found:\n", a4)) : new kne0(true, (String) null);
    }
}
