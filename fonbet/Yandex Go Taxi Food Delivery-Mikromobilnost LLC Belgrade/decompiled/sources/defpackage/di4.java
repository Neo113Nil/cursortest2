package defpackage;

import com.yandex.plus.core.graphql.type.BackgroundGradientTvTypeView;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class di4 {
    public final double a;
    public final ArrayList b;
    public final fi4 c;
    public final gi4 d;
    public final BackgroundGradientTvTypeView e;

    public di4(double d, ArrayList arrayList, fi4 fi4Var, gi4 gi4Var, BackgroundGradientTvTypeView backgroundGradientTvTypeView) {
        this.a = d;
        this.b = arrayList;
        this.c = fi4Var;
        this.d = gi4Var;
        this.e = backgroundGradientTvTypeView;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof di4)) {
            return false;
        }
        di4 di4Var = (di4) obj;
        return Double.compare(this.a, di4Var.a) == 0 && this.b.equals(di4Var.b) && jl40.l(this.c, di4Var.c) && jl40.l(this.d, di4Var.d) && this.e == di4Var.e;
    }

    public final int hashCode() {
        int b = ly3.b(Double.hashCode(this.a) * 31, 31, this.b);
        fi4 fi4Var = this.c;
        int hashCode = (b + (fi4Var == null ? 0 : fi4Var.hashCode())) * 31;
        gi4 gi4Var = this.d;
        return this.e.hashCode() + ((hashCode + (gi4Var != null ? gi4Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "BackgroundGradientsTv(angle=" + this.a + ", colors=" + this.b + ", relativeCenter=" + this.c + ", relativeRadius=" + this.d + ", type=" + this.e + ')';
    }
}
