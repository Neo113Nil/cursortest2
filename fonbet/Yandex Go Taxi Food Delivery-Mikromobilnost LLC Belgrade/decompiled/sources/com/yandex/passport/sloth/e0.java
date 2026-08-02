package com.yandex.passport.sloth;

import defpackage.b64;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class e0 implements i0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public e0(String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return jl40.l(this.a, e0Var.a) && jl40.l(this.b, e0Var.b) && jl40.l(this.c, e0Var.c) && jl40.l(this.d, e0Var.d) && jl40.l(this.e, e0Var.e) && jl40.l(this.f, e0Var.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetEbsState(newState=");
        sb.append(this.a);
        sb.append(", application=");
        sb.append(this.b);
        sb.append(", consumer=");
        sb.append(this.c);
        sb.append(", scope=");
        sb.append(this.d);
        sb.append(", esiaBioCreationDeeplinkUrl=");
        sb.append(this.e);
        sb.append(", esiaBioCreationFallbackUrl=");
        return b64.p(sb, this.f, ')');
    }
}
