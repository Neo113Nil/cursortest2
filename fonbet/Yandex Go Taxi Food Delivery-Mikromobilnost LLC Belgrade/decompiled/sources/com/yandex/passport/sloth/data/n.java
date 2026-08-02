package com.yandex.passport.sloth.data;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.sloth.dependencies.SlothLoginProperties;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.uw51;

/* loaded from: classes2.dex */
public final class n extends c0 {
    public final String A;
    public final String a;
    public final String b;
    public final SlothLoginProperties c;
    public final boolean w;
    public final Uid x;
    public final String y;
    public final String z;

    public n(String str, String str2, SlothLoginProperties slothLoginProperties, boolean z, Uid uid, String str3, String str4, String str5) {
        super(SlothMode.AuthSdk);
        this.a = str;
        this.b = str2;
        this.c = slothLoginProperties;
        this.w = z;
        this.x = uid;
        this.y = str3;
        this.z = str4;
        this.A = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return jl40.l(this.a, nVar.a) && jl40.l(this.b, nVar.b) && jl40.l(this.c, nVar.c) && this.w == nVar.w && jl40.l(this.x, nVar.x) && jl40.l(this.y, nVar.y) && jl40.l(this.z, nVar.z) && jl40.l(this.A, nVar.A);
    }

    public final int hashCode() {
        int a = uw51.a(this.x, unr0.e((this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.w), 31);
        String str = this.y;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.z;
        return this.A.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthSdk(clientId=");
        sb.append(this.a);
        sb.append(", responseType=");
        sb.append(this.b);
        sb.append(", properties=");
        sb.append(this.c);
        sb.append(", forceConfirm=");
        sb.append(this.w);
        sb.append(", selectedUid=");
        sb.append(this.x);
        sb.append(", callerAppId=");
        sb.append(this.y);
        sb.append(", fingerprint=");
        sb.append(this.z);
        sb.append(", state=");
        return b64.p(sb, this.A, ')');
    }
}
