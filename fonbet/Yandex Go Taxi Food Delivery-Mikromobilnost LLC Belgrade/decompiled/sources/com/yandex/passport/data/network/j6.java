package com.yandex.passport.data.network;

import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/passport/data/network/j6;", "", "Companion", "com/yandex/passport/data/network/h6", "com/yandex/passport/data/network/i6", "passport-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class j6 {
    public static final i6 Companion = new i6();
    public final g6 a;
    public final g6 b;

    public /* synthetic */ j6(int i, g6 g6Var, g6 g6Var2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = g6Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = g6Var2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j6)) {
            return false;
        }
        j6 j6Var = (j6) obj;
        return jl40.l(this.a, j6Var.a) && jl40.l(this.b, j6Var.b);
    }

    public final int hashCode() {
        g6 g6Var = this.a;
        int hashCode = (g6Var == null ? 0 : g6Var.hashCode()) * 31;
        g6 g6Var2 = this.b;
        return hashCode + (g6Var2 != null ? g6Var2.hashCode() : 0);
    }

    public final String toString() {
        return "UrlTemplateConfigDTO(updateTokenWithMasterUrl=" + this.a + ", switchMemberUrl=" + this.b + ')';
    }

    public j6() {
        this.a = null;
        this.b = null;
    }
}
