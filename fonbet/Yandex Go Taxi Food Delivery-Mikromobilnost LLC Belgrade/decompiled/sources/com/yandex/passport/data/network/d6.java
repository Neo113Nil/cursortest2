package com.yandex.passport.data.network;

import defpackage.auu0;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.p53;
import defpackage.unr0;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlinx.serialization.KSerializer;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/passport/data/network/d6;", "", "Companion", "com/yandex/passport/data/network/b6", "com/yandex/passport/data/network/c6", "passport-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class d6 {
    public static final c6 Companion = new c6();
    public static final KSerializer[] k = {new p53(g5.a, 0), new p53(p5.a, 0), null, new p53(i5.a, 0), null, null, new p53(m5.a, 0), new p53(auu0.a, 1), new p53(a5.a, 0), new p53(d5.a, 0)};
    public final List a;
    public final List b;
    public final String c;
    public final List d;
    public final j6 e;
    public final u5 f;
    public final List g;
    public final Set h;
    public final List i;
    public final List j;

    public /* synthetic */ d6(int i, List list, List list2, String str, List list3, j6 j6Var, u5 u5Var, List list4, Set set, List list5, List list6) {
        int i2 = i & 1;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.a = emptyList;
        } else {
            this.a = list;
        }
        if ((i & 2) == 0) {
            this.b = emptyList;
        } else {
            this.b = list2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = emptyList;
        } else {
            this.d = list3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = j6Var;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = u5Var;
        }
        if ((i & 64) == 0) {
            this.g = emptyList;
        } else {
            this.g = list4;
        }
        if ((i & 128) == 0) {
            this.h = EmptySet.a;
        } else {
            this.h = set;
        }
        if ((i & 256) == 0) {
            this.i = emptyList;
        } else {
            this.i = list5;
        }
        if ((i & 512) == 0) {
            this.j = emptyList;
        } else {
            this.j = list6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d6)) {
            return false;
        }
        d6 d6Var = (d6) obj;
        return jl40.l(this.a, d6Var.a) && jl40.l(this.b, d6Var.b) && jl40.l(this.c, d6Var.c) && jl40.l(this.d, d6Var.d) && jl40.l(this.e, d6Var.e) && jl40.l(this.f, d6Var.f) && jl40.l(this.g, d6Var.g) && jl40.l(this.h, d6Var.h) && jl40.l(this.i, d6Var.i) && jl40.l(this.j, d6Var.j);
    }

    public final int hashCode() {
        int c = unr0.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int c2 = unr0.c((c + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        j6 j6Var = this.e;
        int hashCode = (c2 + (j6Var == null ? 0 : j6Var.hashCode())) * 31;
        u5 u5Var = this.f;
        return this.j.hashCode() + unr0.c(g8e.e(this.h, unr0.c((hashCode + (u5Var != null ? u5Var.hashCode() : 0)) * 31, 31, this.g), 31), 31, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result(backends=");
        sb.append(this.a);
        sb.append(", accountManagerConfig=");
        sb.append(this.b);
        sb.append(", whiteListRegex=");
        sb.append(this.c);
        sb.append(", defaultLocations=");
        sb.append(this.d);
        sb.append(", urlTemplatesConfig=");
        sb.append(this.e);
        sb.append(", ebsConfig=");
        sb.append(this.f);
        sb.append(", blockVpnConfig=");
        sb.append(this.g);
        sb.append(", vpnManualMode=");
        sb.append(this.h);
        sb.append(", autoLoginAppParameters=");
        sb.append(this.i);
        sb.append(", autoLoginClientIdParameters=");
        return unr0.t(sb, this.j, ')');
    }

    public d6() {
        EmptyList emptyList = EmptyList.a;
        this.a = emptyList;
        this.b = emptyList;
        this.c = null;
        this.d = emptyList;
        this.e = null;
        this.f = null;
        this.g = emptyList;
        this.h = EmptySet.a;
        this.i = emptyList;
        this.j = emptyList;
    }
}
