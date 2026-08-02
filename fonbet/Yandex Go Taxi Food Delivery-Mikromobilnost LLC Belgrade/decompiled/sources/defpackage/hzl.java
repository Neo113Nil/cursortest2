package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class hzl extends mzl {
    public final xzl a;

    public hzl(xzl xzlVar) {
        this.a = xzlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hzl) {
            return jl40.l(this.a, ((hzl) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RenderingFinished(document=" + this.a + Extension.C_BRAKE;
    }
}
