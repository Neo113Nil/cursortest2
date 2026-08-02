package com.yandex.passport.data.network;

import com.yandex.passport.data.models.UserInfoData;
import defpackage.jl40;
import defpackage.unr0;

/* loaded from: classes15.dex */
public final class bb {
    public final String a;
    public final String b;
    public final String c;
    public final UserInfoData d;

    public bb(String str, String str2, String str3, UserInfoData userInfoData) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = userInfoData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bb)) {
            return false;
        }
        bb bbVar = (bb) obj;
        return jl40.l(this.a, bbVar.a) && jl40.l(this.b, bbVar.b) && jl40.l(this.c, bbVar.c) && jl40.l(this.d, bbVar.d);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.d.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "RegisterPhonishResult(status=" + this.a + ", masterToken=" + this.b + ", clientToken=" + this.c + ", userInfo=" + this.d + ')';
    }
}
