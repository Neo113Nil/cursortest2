package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class ohy {
    public final float a;
    public final float b;

    public ohy(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ohy)) {
            return false;
        }
        ohy ohyVar = (ohy) obj;
        return y7m.b(this.a, ohyVar.a) && y7m.b(this.b, ohyVar.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return unr0.p("LineInputSpace(start=", y7m.c(this.a), ", end=", y7m.c(this.b), Extension.C_BRAKE);
    }
}
