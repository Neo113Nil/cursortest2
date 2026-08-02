package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class ny70 {
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;

    public ny70(int i, int i2, boolean z, boolean z2) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ny70)) {
            return false;
        }
        ny70 ny70Var = (ny70) obj;
        return this.a == ny70Var.a && this.b == ny70Var.b && this.c == ny70Var.c && this.d == ny70Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + unr0.e(oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        return smw0.k(", isFloatButtonsVisible=", Extension.C_BRAKE, b64.s(this.a, this.b, "OrderListHeightData(topY=", ", floatButtonsTop=", ", isTopItemsVisible="), this.c, this.d);
    }

    public /* synthetic */ ny70(int i) {
        this(0, 0, true, true);
    }

    public ny70() {
        this(0);
    }
}
