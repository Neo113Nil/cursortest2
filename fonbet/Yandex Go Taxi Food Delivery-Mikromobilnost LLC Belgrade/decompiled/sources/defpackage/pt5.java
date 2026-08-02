package defpackage;

import java.util.Arrays;

/* loaded from: classes10.dex */
public final class pt5 extends x5v {
    public final byte[] b;

    public pt5(String str, byte[] bArr) {
        super(str);
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pt5.class != obj.getClass()) {
            return false;
        }
        pt5 pt5Var = (pt5) obj;
        return this.a.equals(pt5Var.a) && Arrays.equals(this.b, pt5Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + unr0.b(527, 31, this.a);
    }
}
