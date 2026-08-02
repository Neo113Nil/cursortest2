package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class cyy extends dyy {
    public final boolean a;
    public final boolean b;

    public /* synthetic */ cyy(int i) {
        this((i & 1) != 0, (i & 2) != 0);
    }

    @Override // defpackage.hfb1
    public final int c() {
        return 3;
    }

    @Override // defpackage.dyy
    public final String d() {
        return this.b ? "0123456789 ,." : "0123456789 ";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cyy)) {
            return false;
        }
        cyy cyyVar = (cyy) obj;
        return this.a == cyyVar.a && this.b == cyyVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return ly3.o("MoneyAmount(zeroValueIfEmpty=", ", allowDecimal=", Extension.C_BRAKE, this.a, this.b);
    }

    public cyy(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public cyy() {
        this(3);
    }
}
