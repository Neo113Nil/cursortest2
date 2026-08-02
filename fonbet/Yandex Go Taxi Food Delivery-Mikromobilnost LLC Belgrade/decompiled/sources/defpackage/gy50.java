package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lgy50;", "", "Companion", "ey50", "fy50", "plus-home-data-openapi-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class gy50 {
    public static final fy50 Companion = new fy50();
    public final mu50 a;
    public final ay50 b;

    public /* synthetic */ gy50(int i, mu50 mu50Var, ay50 ay50Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = mu50Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = ay50Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gy50)) {
            return false;
        }
        gy50 gy50Var = (gy50) obj;
        return jl40.l(this.a, gy50Var.a) && jl40.l(this.b, gy50Var.b);
    }

    public final int hashCode() {
        mu50 mu50Var = this.a;
        int hashCode = (mu50Var == null ? 0 : mu50Var.a.hashCode()) * 31;
        ay50 ay50Var = this.b;
        return hashCode + (ay50Var != null ? ay50Var.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkPlaqueResponseModel(error=" + this.a + ", data=" + this.b + ')';
    }

    public gy50() {
        this.a = null;
        this.b = null;
    }
}
