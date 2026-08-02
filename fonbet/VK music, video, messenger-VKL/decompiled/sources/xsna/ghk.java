package xsna;

import com.vk.photo.editor.features.crop.models.params.CropAspectRatioFormat;

/* compiled from: CropFormatDescription.kt */
/* loaded from: classes4.dex */
public final class ghk {
    public final jbo0 a;
    public final int b;
    public final CropAspectRatioFormat c;

    public ghk(jbo0 jbo0Var, int i, CropAspectRatioFormat cropAspectRatioFormat) {
        this.a = jbo0Var;
        this.b = i;
        this.c = cropAspectRatioFormat;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ghk)) {
            return false;
        }
        ghk ghkVar = (ghk) obj;
        return this.a.equals(ghkVar.a) && this.b == ghkVar.b && this.c == ghkVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + shy.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "CropFormatDescription(title=" + this.a + ", drawableRes=" + this.b + ", format=" + this.c + ")";
    }
}
