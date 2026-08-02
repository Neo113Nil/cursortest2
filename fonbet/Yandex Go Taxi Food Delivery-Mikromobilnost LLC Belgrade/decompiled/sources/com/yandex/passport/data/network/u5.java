package com.yandex.passport.data.network;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/passport/data/network/u5;", "", "Companion", "com/yandex/passport/data/network/s5", "com/yandex/passport/data/network/t5", "passport-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class u5 {
    public static final t5 Companion = new t5();
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ u5(int i, String str, String str2, String str3, String str4) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5)) {
            return false;
        }
        u5 u5Var = (u5) obj;
        return jl40.l(this.a, u5Var.a) && jl40.l(this.b, u5Var.b) && jl40.l(this.c, u5Var.c) && jl40.l(this.d, u5Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EbsConfig(bioCollectionType=");
        sb.append(this.a);
        sb.append(", tibUri=");
        sb.append(this.b);
        sb.append(", backendUriTemplate=");
        sb.append(this.c);
        sb.append(", ebsUriTemplate=");
        return b64.p(sb, this.d, ')');
    }

    public u5() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
