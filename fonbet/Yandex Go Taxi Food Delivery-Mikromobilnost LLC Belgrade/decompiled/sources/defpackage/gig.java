package defpackage;

import com.ybsdk.core.utils.ColorModel;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class gig {
    public final ColorModel a;
    public final int b;
    public final int c;

    public gig(ColorModel colorModel, int i, int i2) {
        this.a = colorModel;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gig)) {
            return false;
        }
        gig gigVar = (gig) obj;
        return this.a.equals(gigVar.a) && this.b == gigVar.b && this.c == gigVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + oyr.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpoilerState(particleColor=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        return oyr.m(this.c, Extension.C_BRAKE, sb);
    }
}
