package com.yandex.passport.internal.filter;

import defpackage.auu0;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.p53;
import defpackage.qv10;
import java.util.Set;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/passport/internal/filter/o;", "", "Companion", "com/yandex/passport/internal/filter/m", "com/yandex/passport/internal/filter/n", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class o {
    public static final n Companion = new n();
    public static final KSerializer[] c;
    public final Set a;
    public final Set b;

    static {
        auu0 auu0Var = auu0.a;
        c = new KSerializer[]{new p53(auu0Var, 1), new p53(auu0Var, 1)};
    }

    public /* synthetic */ o(int i, Set set, Set set2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = set;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = set2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return jl40.l(this.a, oVar.a) && jl40.l(this.b, oVar.b);
    }

    public final int hashCode() {
        Set set = this.a;
        int hashCode = (set == null ? 0 : set.hashCode()) * 31;
        Set set2 = this.b;
        return hashCode + (set2 != null ? set2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParameterRuleCacheV1(includeParameters=");
        sb.append(this.a);
        sb.append(", excludeParameters=");
        return qv10.s(sb, this.b, ')');
    }

    public o() {
        this((Set) null, (Set) null, 3);
    }

    public o(Set set, Set set2, int i) {
        set = (i & 1) != 0 ? null : set;
        set2 = (i & 2) != 0 ? null : set2;
        this.a = set;
        this.b = set2;
    }
}
