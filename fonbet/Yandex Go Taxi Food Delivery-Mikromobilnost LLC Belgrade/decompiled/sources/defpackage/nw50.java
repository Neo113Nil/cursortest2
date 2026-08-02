package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lnw50;", "", "Companion", "lw50", "mw50", "plus-home-data-openapi-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class nw50 {
    public static final mw50 Companion = new mw50();
    public final Integer a;
    public final vq50 b;
    public final vq50 c;

    public /* synthetic */ nw50(int i, Integer num, vq50 vq50Var, vq50 vq50Var2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = vq50Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = vq50Var2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nw50)) {
            return false;
        }
        nw50 nw50Var = (nw50) obj;
        return jl40.l(this.a, nw50Var.a) && jl40.l(this.b, nw50Var.b) && jl40.l(this.c, nw50Var.c);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        vq50 vq50Var = this.b;
        int hashCode2 = (hashCode + (vq50Var == null ? 0 : vq50Var.hashCode())) * 31;
        vq50 vq50Var2 = this.c;
        return hashCode2 + (vq50Var2 != null ? vq50Var2.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkLocationModel(geoId=" + this.a + ", coordinates=" + this.b + ", geoPinPosition=" + this.c + ')';
    }

    public nw50() {
        this(null, null);
    }

    public nw50(vq50 vq50Var, vq50 vq50Var2) {
        this.a = null;
        this.b = vq50Var;
        this.c = vq50Var2;
    }
}
