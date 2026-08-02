package xsna;

import com.vk.external.miniapp.net.app.WebImage;

/* compiled from: ThemedImage.kt */
/* loaded from: classes17.dex */
public final class wpo0 {
    public final WebImage a;
    public final WebImage b;

    public wpo0(WebImage webImage, WebImage webImage2) {
        this.a = webImage;
        this.b = webImage2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wpo0)) {
            return false;
        }
        wpo0 wpo0Var = (wpo0) obj;
        return epx.f(this.a, wpo0Var.a) && epx.f(this.b, wpo0Var.b);
    }

    public final int hashCode() {
        WebImage webImage = this.a;
        int hashCode = (webImage == null ? 0 : webImage.b.hashCode()) * 31;
        WebImage webImage2 = this.b;
        return hashCode + (webImage2 != null ? webImage2.b.hashCode() : 0);
    }

    public final String toString() {
        return "ThemedImage(light=" + this.a + ", dark=" + this.b + ')';
    }
}
