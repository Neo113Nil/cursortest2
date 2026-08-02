package com.yandex.passport.internal.usecase.ui;

import com.yandex.passport.common.core.Environment;
import com.yandex.passport.internal.entities.ConfirmMethod;
import defpackage.jl40;
import defpackage.unr0;

/* loaded from: classes2.dex */
public final class q0 {
    public final Environment a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final ConfirmMethod f;
    public final boolean g;

    public q0(Environment environment, String str, String str2, String str3, String str4, ConfirmMethod confirmMethod, boolean z) {
        this.a = environment;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = confirmMethod;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return this.a == q0Var.a && jl40.l(this.b, q0Var.b) && jl40.l(this.c, q0Var.c) && jl40.l(this.d, q0Var.d) && jl40.l(this.e, q0Var.e) && this.f == q0Var.f && this.g == q0Var.g;
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int b2 = unr0.b((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        String str2 = this.e;
        return Boolean.hashCode(this.g) + ((this.f.hashCode() + ((b2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", trackId=");
        sb.append(this.b);
        sb.append(", phoneNumber=");
        sb.append(this.c);
        sb.append(", language=");
        sb.append(this.d);
        sb.append(", country=");
        sb.append(this.e);
        sb.append(", confirmMethod=");
        sb.append(this.f);
        sb.append(", authBySms=");
        return unr0.u(sb, this.g, ')');
    }
}
