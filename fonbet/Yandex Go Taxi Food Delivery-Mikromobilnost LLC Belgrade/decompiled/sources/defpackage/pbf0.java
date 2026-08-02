package defpackage;

import android.widget.ImageView;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class pbf0 {
    public final rbv a;
    public final ImageView.ScaleType b;

    public pbf0(rbv rbvVar, ImageView.ScaleType scaleType) {
        this.a = rbvVar;
        this.b = scaleType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pbf0)) {
            return false;
        }
        pbf0 pbf0Var = (pbf0) obj;
        return this.a.equals(pbf0Var.a) && this.b == pbf0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FallbackGradientImage(image=" + this.a + ", scaleType=" + this.b + Extension.C_BRAKE;
    }
}
