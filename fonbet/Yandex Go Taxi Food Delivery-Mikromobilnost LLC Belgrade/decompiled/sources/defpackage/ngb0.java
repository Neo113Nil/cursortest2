package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class ngb0 extends cj91 {
    public final String b;

    public ngb0(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ngb0) && jl40.l(this.b, ((ngb0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return oyr.p("LoadHtmlState(html=", this.b, Extension.C_BRAKE);
    }
}
