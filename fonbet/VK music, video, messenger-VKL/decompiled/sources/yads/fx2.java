package yads;

import xsna.epx;

/* loaded from: classes10.dex */
public final class fx2 implements qr2 {
    public final int a;
    public final String b;

    public fx2(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fx2)) {
            return false;
        }
        fx2 fx2Var = (fx2) obj;
        return this.a == fx2Var.a && epx.f(this.b, fx2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return xsna.gq.b(this.a, "SdkReward(amount=", ", type=", this.b, ")");
    }
}
