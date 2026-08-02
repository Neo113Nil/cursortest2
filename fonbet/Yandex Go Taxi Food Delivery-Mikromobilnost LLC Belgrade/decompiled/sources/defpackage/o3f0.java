package defpackage;

import java.util.Arrays;

/* loaded from: classes10.dex */
public final class o3f0 extends x5v {
    public final String b;
    public final byte[] c;

    public o3f0(String str, byte[] bArr) {
        super("PRIV");
        this.b = str;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o3f0.class != obj.getClass()) {
            return false;
        }
        o3f0 o3f0Var = (o3f0) obj;
        return this.b.equals(o3f0Var.b) && Arrays.equals(this.c, o3f0Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + unr0.b(527, 31, this.b);
    }

    @Override // defpackage.x5v
    public final String toString() {
        return this.a + ": owner=" + this.b;
    }
}
