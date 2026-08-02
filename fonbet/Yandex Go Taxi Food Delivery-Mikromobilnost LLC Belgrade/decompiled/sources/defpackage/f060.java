package defpackage;

import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lf060;", "", "Companion", "d060", "e060", "plus-home-data-openapi-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class f060 {
    public static final e060 Companion = new e060();
    public final mu50 a;
    public final c060 b;

    public /* synthetic */ f060(int i, mu50 mu50Var, c060 c060Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = mu50Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = c060Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f060)) {
            return false;
        }
        f060 f060Var = (f060) obj;
        return jl40.l(this.a, f060Var.a) && jl40.l(this.b, f060Var.b);
    }

    public final int hashCode() {
        mu50 mu50Var = this.a;
        int hashCode = (mu50Var == null ? 0 : mu50Var.hashCode()) * 31;
        c060 c060Var = this.b;
        return hashCode + (c060Var != null ? c060Var.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkSdkConfigurationResponseModel(error=" + this.a + ", data=" + this.b + ')';
    }

    public f060() {
        this.a = null;
        this.b = null;
    }
}
