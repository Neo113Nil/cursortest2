package xsna;

import xsna.tlo0;

/* compiled from: CheckoutViewState.kt */
/* loaded from: classes18.dex */
public final class r1n0 {
    public final tlo0.f a;
    public final tlo0.f b;

    public r1n0(tlo0.f fVar, tlo0.f fVar2) {
        this.a = fVar;
        this.b = fVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1n0)) {
            return false;
        }
        r1n0 r1n0Var = (r1n0) obj;
        return this.a.equals(r1n0Var.a) && this.b.equals(r1n0Var.b);
    }

    public final int hashCode() {
        return Integer.hashCode(this.b.a) + (Integer.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuccessCheckoutTexts(actionButtonTitle=");
        sb.append(this.a);
        sb.append(", descriptionTitle=");
        return pr.b(sb, this.b, ')');
    }
}
