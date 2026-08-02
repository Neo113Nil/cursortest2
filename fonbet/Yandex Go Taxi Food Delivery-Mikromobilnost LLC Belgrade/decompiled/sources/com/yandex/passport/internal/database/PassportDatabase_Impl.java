package com.yandex.passport.internal.database;

import defpackage.lkw0;
import defpackage.vnh;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes8.dex */
public final class PassportDatabase_Impl extends PassportDatabase {
    public volatile com.yandex.passport.internal.database.diary.d l;
    public volatile com.yandex.passport.internal.database.diary.e m;
    public volatile com.yandex.passport.internal.database.auth_cookie.d n;

    @Override // androidx.room.RoomDatabase
    public final lkw0 A0(androidx.room.c cVar) {
        return cVar.c.a(new vnh(cVar.a, cVar.b, new androidx.room.m(cVar, new k(this)), false, false));
    }

    @Override // androidx.room.RoomDatabase
    public final List C0() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new j());
        return arrayList;
    }

    @Override // androidx.room.RoomDatabase
    public final Set F0() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public final Map H0() {
        HashMap hashMap = new HashMap();
        List list = Collections.EMPTY_LIST;
        hashMap.put(com.yandex.passport.internal.database.diary.d.class, list);
        hashMap.put(com.yandex.passport.internal.database.diary.e.class, list);
        hashMap.put(com.yandex.passport.internal.database.auth_cookie.d.class, list);
        return hashMap;
    }

    @Override // com.yandex.passport.internal.database.PassportDatabase
    public final com.yandex.passport.internal.database.auth_cookie.d S0() {
        com.yandex.passport.internal.database.auth_cookie.d dVar;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            try {
                if (this.n == null) {
                    this.n = new com.yandex.passport.internal.database.auth_cookie.d(this);
                }
                dVar = this.n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    @Override // com.yandex.passport.internal.database.PassportDatabase
    public final com.yandex.passport.internal.database.diary.d T0() {
        com.yandex.passport.internal.database.diary.d dVar;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            try {
                if (this.l == null) {
                    this.l = new com.yandex.passport.internal.database.diary.d(this);
                }
                dVar = this.l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    @Override // com.yandex.passport.internal.database.PassportDatabase
    public final com.yandex.passport.internal.database.diary.e U0() {
        com.yandex.passport.internal.database.diary.e eVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            try {
                if (this.m == null) {
                    this.m = new com.yandex.passport.internal.database.diary.e(this);
                }
                eVar = this.m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    @Override // androidx.room.RoomDatabase
    public final androidx.room.d y0() {
        return new androidx.room.d(this, new HashMap(0), new HashMap(0), "diary_method", "diary_parameter", "diary_upload", "modern_auth_cookie");
    }
}
