package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class oh31 {
    public final int a;
    public final int b;
    public final int c;
    public final float d;
    public final float e;
    public final float f;

    public oh31(int i, int i2, int i3, float f, float f2, float f3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = f;
        this.e = f2;
        this.f = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oh31)) {
            return false;
        }
        oh31 oh31Var = (oh31) obj;
        return this.a == oh31Var.a && this.b == oh31Var.b && this.c == oh31Var.c && Float.compare(this.d, oh31Var.d) == 0 && Float.compare(this.e, oh31Var.e) == 0 && Float.compare(this.f, oh31Var.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + g8e.c(this.e, g8e.c(this.d, oyr.b(this.c, oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder s = b64.s(this.a, this.b, "VerticalSummaryLayout(smallAnchorOffset=", ", defaultAnchorOffset=", ", expandedAnchorOffset=");
        s.append(this.c);
        s.append(", smallAnchorTariffsHeight=");
        s.append(this.d);
        s.append(", defaultAnchorTariffsHeight=");
        return ly3.q(s, this.e, ", expandedAnchorTariffsHeight=", this.f, Extension.C_BRAKE);
    }
}
