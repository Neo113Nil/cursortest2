package xsna;

import com.vk.photo.editor.features.collage.model.CollageAspectRatioFormat;

/* compiled from: CollageUiFormat.kt */
/* loaded from: classes4.dex */
public final class z2g {
    public final jbo0 a;
    public final int b;
    public final CollageAspectRatioFormat c;
    public final boolean d;

    public z2g(jbo0 jbo0Var, int i, CollageAspectRatioFormat collageAspectRatioFormat, boolean z) {
        this.a = jbo0Var;
        this.b = i;
        this.c = collageAspectRatioFormat;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2g)) {
            return false;
        }
        z2g z2gVar = (z2g) obj;
        return epx.f(this.a, z2gVar.a) && this.b == z2gVar.b && this.c == z2gVar.c && this.d == z2gVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + shy.a(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "CollageUiFormat(title=" + this.a + ", drawableRes=" + this.b + ", format=" + this.c + ", isSelected=" + this.d + ")";
    }
}
