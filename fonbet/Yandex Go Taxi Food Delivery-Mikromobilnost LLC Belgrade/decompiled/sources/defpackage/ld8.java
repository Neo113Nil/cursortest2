package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ld8 {
    public final String a;
    public final dp8 b;

    public ld8(String str, dp8 dp8Var) {
        this.a = str;
        this.b = dp8Var;
    }

    public final String a() {
        return this.a;
    }

    public final dp8 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ld8)) {
            return false;
        }
        ld8 ld8Var = (ld8) obj;
        return jl40.l(this.a, ld8Var.a) && this.b.equals(ld8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CardDetailsCarouselItem(id=" + this.a + ", state=" + this.b + Extension.C_BRAKE;
    }
}
