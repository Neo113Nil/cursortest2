package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class hy5 implements iy5 {
    public final String a;

    public /* synthetic */ hy5(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hy5) {
            return jl40.l(this.a, ((hy5) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("Raw(value=", this.a, Extension.C_BRAKE);
    }
}
