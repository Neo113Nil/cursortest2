package xsna;

import android.view.View;
import com.vk.core.ui.image.VKImageController;

/* compiled from: ImageRequest.kt */
/* loaded from: classes17.dex */
public final class klw {
    public final String a;
    public final VKImageController<View> b;

    public klw(VKImageController vKImageController, String str) {
        this.a = str;
        this.b = vKImageController;
    }

    public final VKImageController<View> a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof klw)) {
            return false;
        }
        klw klwVar = (klw) obj;
        return epx.f(this.a, klwVar.a) && epx.f(this.b, klwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ImageRequest(url=" + this.a + ", controller=" + this.b + ')';
    }
}
