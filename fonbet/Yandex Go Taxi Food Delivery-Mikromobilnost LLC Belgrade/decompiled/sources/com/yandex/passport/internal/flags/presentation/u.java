package com.yandex.passport.internal.flags.presentation;

import defpackage.b64;
import defpackage.jl40;

/* loaded from: classes15.dex */
public final class u {
    public final com.yandex.passport.internal.flags.g a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public u(com.yandex.passport.internal.flags.g gVar, String str, String str2, String str3, String str4, String str5) {
        this.a = gVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.a.equals(uVar.a) && jl40.l(this.b, uVar.b) && jl40.l(this.c, uVar.c) && jl40.l(this.d, uVar.d) && jl40.l(this.e, uVar.e) && jl40.l(this.f, uVar.f);
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
        StringBuilder sb = new StringBuilder("ExperimentDetailsState(flag=");
        sb.append(this.a);
        sb.append(", actualValue=");
        sb.append(this.b);
        sb.append(", sessionValue=");
        sb.append(this.c);
        sb.append(", overrideValue=");
        sb.append(this.d);
        sb.append(", networkCacheValue=");
        sb.append(this.e);
        sb.append(", defaultValue=");
        return b64.p(sb, this.f, ')');
    }
}
