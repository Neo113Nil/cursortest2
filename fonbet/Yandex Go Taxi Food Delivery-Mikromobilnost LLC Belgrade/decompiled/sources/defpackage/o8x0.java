package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class o8x0 implements r9x0 {
    public final String a;

    public o8x0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o8x0) && jl40.l(this.a, ((o8x0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("BannerAction(promotionId=", this.a, Extension.C_BRAKE);
    }
}
