package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class mo2 extends x5v {
    public final String b;
    public final String c;
    public final int w;
    public final byte[] x;

    public mo2(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.b = str;
        this.c = str2;
        this.w = i;
        this.x = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mo2.class != obj.getClass()) {
            return false;
        }
        mo2 mo2Var = (mo2) obj;
        return this.w == mo2Var.w && this.b.equals(mo2Var.b) && Objects.equals(this.c, mo2Var.c) && Arrays.equals(this.x, mo2Var.x);
    }

    public final int hashCode() {
        int b = unr0.b((527 + this.w) * 31, 31, this.b);
        String str = this.c;
        return Arrays.hashCode(this.x) + ((b + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // defpackage.s820
    public final void populateMediaMetadata(qe10 qe10Var) {
        qe10Var.a(this.w, this.x);
    }

    @Override // defpackage.x5v
    public final String toString() {
        return this.a + ": mimeType=" + this.b + ", description=" + this.c;
    }
}
