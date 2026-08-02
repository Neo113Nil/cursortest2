package defpackage;

import com.ybsdk.feature.main.api.domain.entity.ProductsV4GradientEntity$GradientImageScaleType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class jbf0 {
    public final rbv a;
    public final ProductsV4GradientEntity$GradientImageScaleType b;

    public jbf0(rbv rbvVar, ProductsV4GradientEntity$GradientImageScaleType productsV4GradientEntity$GradientImageScaleType) {
        this.a = rbvVar;
        this.b = productsV4GradientEntity$GradientImageScaleType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jbf0)) {
            return false;
        }
        jbf0 jbf0Var = (jbf0) obj;
        return this.a.equals(jbf0Var.a) && this.b == jbf0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FallbackGradientImage(image=" + this.a + ", scaleType=" + this.b + Extension.C_BRAKE;
    }
}
