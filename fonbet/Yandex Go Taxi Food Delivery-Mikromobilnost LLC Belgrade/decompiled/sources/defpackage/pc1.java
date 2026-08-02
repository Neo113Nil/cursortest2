package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class pc1 extends n351 {
    public final vc1 c;

    public pc1(vc1 vc1Var) {
        super("ads-banner-key", false, 14);
        this.c = vc1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pc1) && this.c.equals(((pc1) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "AdsBannerModel(adsBannerSettings=" + this.c + Extension.C_BRAKE;
    }
}
