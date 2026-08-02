package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class odj0 {
    public final int a;
    public final kb5 b;

    public odj0(int i, kb5 kb5Var) {
        this.a = i;
        this.b = kb5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof odj0)) {
            return false;
        }
        odj0 odj0Var = (odj0) obj;
        return this.a == odj0Var.a && jl40.l(this.b, odj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "RequirementCarouselIndexWithTariff(index=" + this.a + ", baseTariffInfo=" + this.b + Extension.C_BRAKE;
    }
}
