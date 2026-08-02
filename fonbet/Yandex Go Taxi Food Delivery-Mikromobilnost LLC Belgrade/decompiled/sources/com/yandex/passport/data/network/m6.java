package com.yandex.passport.data.network;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/passport/data/network/m6;", "", "Companion", "com/yandex/passport/data/network/k6", "com/yandex/passport/data/network/l6", "passport-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class m6 {
    public static final l6 Companion = new l6();
    public final String a;
    public final String b;

    public /* synthetic */ m6(int i, String str, String str2) {
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m6)) {
            return false;
        }
        m6 m6Var = (m6) obj;
        return jl40.l(this.a, m6Var.a) && jl40.l(this.b, m6Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VersionRuleDTO(versionGreaterOrEqual=");
        sb.append(this.a);
        sb.append(", versionEqual=");
        return b64.p(sb, this.b, ')');
    }

    public m6() {
        this.a = null;
        this.b = null;
    }
}
