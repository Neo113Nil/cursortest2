package xsna;

import com.facebook.imagepipeline.request.ImageRequest;

/* compiled from: ImageRequestInfo.kt */
/* loaded from: classes17.dex */
public final class llw {
    public final fxj0 a;
    public final ImageRequest b;

    public llw(fxj0 fxj0Var, ImageRequest imageRequest) {
        this.a = fxj0Var;
        this.b = imageRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof llw)) {
            return false;
        }
        llw llwVar = (llw) obj;
        return epx.f(this.a, llwVar.a) && epx.f(this.b, llwVar.b);
    }

    public final int hashCode() {
        fxj0 fxj0Var = this.a;
        int hashCode = (fxj0Var == null ? 0 : fxj0Var.hashCode()) * 31;
        ImageRequest imageRequest = this.b;
        return hashCode + (imageRequest != null ? imageRequest.hashCode() : 0);
    }

    public final String toString() {
        return "ImageRequestInfo(image=" + this.a + ", request=" + this.b + ')';
    }
}
