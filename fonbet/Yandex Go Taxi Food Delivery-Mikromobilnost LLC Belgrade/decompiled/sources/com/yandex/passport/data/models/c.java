package com.yandex.passport.data.models;

import com.yandex.passport.common.account.MasterToken;
import defpackage.jl40;

/* loaded from: classes15.dex */
public final class c {
    public final MasterToken a;
    public final UserInfoData b;
    public final e c;

    public c(MasterToken masterToken, UserInfoData userInfoData, e eVar) {
        this.a = masterToken;
        this.b = userInfoData;
        this.c = eVar;
    }

    public final e a() {
        return this.c;
    }

    public final MasterToken b() {
        return this.a;
    }

    public final UserInfoData c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a.equals(cVar.a) && jl40.l(this.b, cVar.b) && jl40.l(this.c, cVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        e eVar = this.c;
        return hashCode + (eVar == null ? 0 : eVar.hashCode());
    }

    public final String toString() {
        return "AuthorizationResultData(masterToken=" + this.a + ", userInfo=" + this.b + ", clientToken=" + this.c + ')';
    }
}
