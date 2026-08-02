package defpackage;

import com.monetization.ads.nativeads.ExtendedNativeAdView;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class ei81 {
    public final int a;
    public final cv81 b;
    public final o191 c;

    public ei81(int i, cv81 cv81Var, o191 o191Var) {
        this.a = i;
        this.b = cv81Var;
        this.c = o191Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ei81)) {
            return false;
        }
        ei81 ei81Var = (ei81) obj;
        return this.a == ei81Var.a && ExtendedNativeAdView.class.equals(ExtendedNativeAdView.class) && this.b.equals(ei81Var.b) && this.c.equals(ei81Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + ((ExtendedNativeAdView.class.hashCode() + (Integer.hashCode(this.a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "LayoutDesign(layoutId=" + this.a + ", layoutViewClass=" + ExtendedNativeAdView.class + ", designComponentBinder=" + this.b + ", designConstraint=" + this.c + Extension.C_BRAKE;
    }
}
