package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class aom extends un91 {
    public final pa90 b;

    public aom(pa90 pa90Var) {
        this.b = pa90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aom) && jl40.l(this.b, ((aom) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Image(avatar=" + this.b + Extension.C_BRAKE;
    }
}
