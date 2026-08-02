package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class pos {
    public final double a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;

    public pos(double d, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        this.a = d;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = charSequence3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pos)) {
            return false;
        }
        pos posVar = (pos) obj;
        return Double.compare(this.a, posVar.a) == 0 && jl40.l(this.b, posVar.b) && jl40.l(this.c, posVar.c) && jl40.l(this.d, posVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + smw0.b(smw0.b(Double.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "PointData(amount=" + this.a + ", incomeText=" + ((Object) this.b) + ", description=" + ((Object) this.c) + ", dailyIncome=" + ((Object) this.d) + Extension.C_BRAKE;
    }
}
