package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lpy50;", "", "Companion", "ny50", "oy50", "plus-home-data-openapi-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class py50 {
    public static final oy50 Companion = new oy50();
    public final mu50 a;
    public final my50 b;

    public /* synthetic */ py50(int i, mu50 mu50Var, my50 my50Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = mu50Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = my50Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof py50)) {
            return false;
        }
        py50 py50Var = (py50) obj;
        return jl40.l(this.a, py50Var.a) && jl40.l(this.b, py50Var.b);
    }

    public final int hashCode() {
        mu50 mu50Var = this.a;
        int hashCode = (mu50Var == null ? 0 : mu50Var.hashCode()) * 31;
        my50 my50Var = this.b;
        return hashCode + (my50Var != null ? my50Var.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkPlusStateResponseModel(error=" + this.a + ", data=" + this.b + ')';
    }

    public py50() {
        this.a = null;
        this.b = null;
    }
}
