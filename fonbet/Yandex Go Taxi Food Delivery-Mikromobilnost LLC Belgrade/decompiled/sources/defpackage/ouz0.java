package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ouz0 implements puz0 {
    public final String a;

    public ouz0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ouz0) && jl40.l(this.a, ((ouz0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("TariffTooltipShown(analyticsName=", this.a, Extension.C_BRAKE);
    }
}
