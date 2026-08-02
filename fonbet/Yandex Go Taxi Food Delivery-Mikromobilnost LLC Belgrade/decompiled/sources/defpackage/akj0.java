package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class akj0 implements dkj0 {
    public final int a;
    public final int b;
    public final hx8 c;

    public akj0(int i, int i2, hx8 hx8Var) {
        this.a = i;
        this.b = i2;
        this.c = hx8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akj0)) {
            return false;
        }
        akj0 akj0Var = (akj0) obj;
        return this.a == akj0Var.a && this.b == akj0Var.b && jl40.l(this.c, akj0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + oyr.b(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder s = b64.s(this.a, this.b, "InCarousel(carouselIndex=", ", carouselCellIndex=", ", carouselCellUiState=");
        s.append(this.c);
        s.append(Extension.C_BRAKE);
        return s.toString();
    }
}
