package com.yandex.passport.internal.usecase.ui;

import com.yandex.passport.common.core.Uid;
import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;

/* loaded from: classes2.dex */
public final class k0 {
    public final Uid a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public final String f;
    public final String g;

    static {
        int i = Uid.$stable;
    }

    public k0(Uid uid, String str, String str2, boolean z, String str3, String str4, String str5) {
        this.a = uid;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = str3;
        this.f = str4;
        this.g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return jl40.l(this.a, k0Var.a) && jl40.l(this.b, k0Var.b) && jl40.l(this.c, k0Var.c) && this.d == k0Var.d && jl40.l(this.e, k0Var.e) && jl40.l(this.f, k0Var.f) && jl40.l(this.g, k0Var.g);
    }

    public final int hashCode() {
        int e = unr0.e(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return this.g.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(selectedUid=");
        sb.append(this.a);
        sb.append(", clientId=");
        sb.append(this.b);
        sb.append(", responseType=");
        sb.append(this.c);
        sb.append(", forceConfirm=");
        sb.append(this.d);
        sb.append(", callerAppId=");
        sb.append(this.e);
        sb.append(", fingerprint=");
        sb.append(this.f);
        sb.append(", state=");
        return b64.p(sb, this.g, ')');
    }
}
