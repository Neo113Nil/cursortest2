package com.yandex.passport.sloth.command.data;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;

@gsq0
/* loaded from: classes2.dex */
public final class v0 {
    public static final u0 Companion = new u0();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public /* synthetic */ v0(int i, String str, String str2, String str3, String str4, String str5, String str6) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, t0.a.getDescriptor());
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
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return jl40.l(this.a, v0Var.a) && jl40.l(this.b, v0Var.b) && jl40.l(this.c, v0Var.c) && jl40.l(this.d, v0Var.d) && jl40.l(this.e, v0Var.e) && jl40.l(this.f, v0Var.f);
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
        StringBuilder sb = new StringBuilder("SetEbsAgeConfirmStateData(state=");
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
