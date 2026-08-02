package com.yandex.passport.data.network;

import defpackage.jl40;
import defpackage.qv10;
import defpackage.smw0;
import defpackage.unr0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes8.dex */
public final class p0 {
    public final com.yandex.passport.data.models.g a;
    public final String b;
    public final o0 c;
    public final List d;
    public final List e;
    public final String f;
    public final String g;
    public final String h;
    public final Pair i;
    public final String j;
    public final String k;
    public final Map l;

    public p0(com.yandex.passport.data.models.g gVar, String str, o0 o0Var, ArrayList arrayList, ArrayList arrayList2, String str2, String str3, String str4, Pair pair, String str5, String str6, Map map) {
        this.a = gVar;
        this.b = str;
        this.c = o0Var;
        this.d = arrayList;
        this.e = arrayList2;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = pair;
        this.j = str5;
        this.k = str6;
        this.l = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return jl40.l(this.a, p0Var.a) && jl40.l(this.b, p0Var.b) && jl40.l(this.c, p0Var.c) && jl40.l(this.d, p0Var.d) && jl40.l(this.e, p0Var.e) && jl40.l(this.f, p0Var.f) && jl40.l(this.g, p0Var.g) && jl40.l(this.h, p0Var.h) && jl40.l(this.i, p0Var.i) && jl40.l(this.j, p0Var.j) && jl40.l(this.k, p0Var.k) && jl40.l(this.l, p0Var.l);
    }

    public final int hashCode() {
        int c = qv10.c(Integer.hashCode(this.a.a) * 31, 31, 0L);
        String str = this.b;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        o0 o0Var = this.c;
        int c2 = unr0.c(unr0.c((hashCode + (o0Var == null ? 0 : o0Var.hashCode())) * 31, 31, this.d), 31, this.e);
        String str2 = this.f;
        int hashCode2 = (c2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int hashCode4 = (this.i.hashCode() + ((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31;
        String str5 = this.j;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.k;
        return this.l.hashCode() + ((hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", locationId=0, placemark=");
        sb.append(this.b);
        sb.append(", gps=");
        sb.append(this.c);
        sb.append(", productLocation=");
        sb.append(this.d);
        sb.append(", deviceGeoLocation=");
        sb.append(this.e);
        sb.append(", authToken=");
        sb.append(this.f);
        sb.append(", appId=");
        sb.append(this.g);
        sb.append(", appVersion=");
        sb.append(this.h);
        sb.append(", simRegion=");
        sb.append(this.i);
        sb.append(", deviceRegion=");
        sb.append(this.j);
        sb.append(", cookies=");
        sb.append(this.k);
        sb.append(", additionalParams=");
        return smw0.n(sb, this.l, ')');
    }
}
