package xsna;

import java.util.Arrays;

/* compiled from: VkTokenizationData.kt */
/* loaded from: classes6.dex */
public final class osv0 {
    public final nsv0 a;
    public final byte[] b;

    public osv0(nsv0 nsv0Var, byte[] bArr) {
        this.a = nsv0Var;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof osv0)) {
            return false;
        }
        osv0 osv0Var = (osv0) obj;
        return epx.f(this.a, osv0Var.a) && epx.f(this.b, osv0Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "VkTokenizationData(card=" + this.a + ", opc=" + Arrays.toString(this.b) + ')';
    }
}
