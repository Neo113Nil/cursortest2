package yads;

import xsna.epx;

/* loaded from: classes10.dex */
public final class xh0 {
    public final yh0 a;
    public final String b;

    public xh0(yh0 yh0Var, String str) {
        this.a = yh0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xh0)) {
            return false;
        }
        xh0 xh0Var = (xh0) obj;
        return this.a == xh0Var.a && epx.f(this.b, xh0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DivKitAsset(type=" + this.a + ", assetName=" + this.b + ")";
    }
}
