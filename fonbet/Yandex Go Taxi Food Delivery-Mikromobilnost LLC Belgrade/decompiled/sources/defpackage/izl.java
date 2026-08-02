package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class izl extends mzl {
    public final xzl a;

    public izl(xzl xzlVar) {
        this.a = xzlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof izl) {
            return jl40.l(this.a, ((izl) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RenderingStarted(document=" + this.a + Extension.C_BRAKE;
    }
}
