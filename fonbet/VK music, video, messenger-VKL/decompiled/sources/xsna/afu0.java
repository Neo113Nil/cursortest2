package xsna;

import java.util.List;

/* compiled from: VkBidUserData.kt */
/* loaded from: classes18.dex */
public final class afu0 {
    public final int a;
    public final List<xeu0> b;

    public afu0(int i, List<xeu0> list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afu0)) {
            return false;
        }
        afu0 afu0Var = (afu0) obj;
        return this.a == afu0Var.a && epx.f(this.b, afu0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkBidUserData(selectedProfileIndex=");
        sb.append(this.a);
        sb.append(", profiles=");
        return ms9.a(')', sb, this.b);
    }
}
