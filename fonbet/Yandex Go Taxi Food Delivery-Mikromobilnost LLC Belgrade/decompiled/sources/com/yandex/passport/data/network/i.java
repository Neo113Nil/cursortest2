package com.yandex.passport.data.network;

import com.yandex.passport.data.models.UserInfoData;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes8.dex */
public final class i {
    public static final h Companion = new h();
    public static final KSerializer[] e = {null, null, null, new a()};
    public final String a;
    public final String b;
    public final String c;
    public final UserInfoData d;

    public /* synthetic */ i(int i, String str, String str2, String str3, UserInfoData userInfoData) {
        if (9 != (i & 9)) {
            qje.Z(i, 9, g.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        this.d = userInfoData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return jl40.l(this.a, iVar.a) && jl40.l(this.b, iVar.b) && jl40.l(this.c, iVar.c) && jl40.l(this.d, iVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return this.d.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Response(status=" + this.a + ", xToken=" + this.b + ", accessToken=" + this.c + ", userInfo=" + this.d + ')';
    }
}
