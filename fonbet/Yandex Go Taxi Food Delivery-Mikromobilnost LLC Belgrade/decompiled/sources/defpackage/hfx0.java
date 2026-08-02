package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class hfx0 implements kfx0 {
    public final String a;

    public hfx0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hfx0) && jl40.l(this.a, ((hfx0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("OpenBrandingFeatureUrl(url=", this.a, Extension.C_BRAKE);
    }
}
