package xsna;

import com.vk.photo.editor.features.crop.models.params.CropAspectRatioFormat;

/* compiled from: ActualCropParams.kt */
/* loaded from: classes4.dex */
public final class cc0 implements zhk {
    public final tnt a;
    public final cfk b;
    public final CropAspectRatioFormat c;
    public final boolean d;

    public cc0(tnt tntVar, cfk cfkVar, CropAspectRatioFormat cropAspectRatioFormat, boolean z) {
        this.a = tntVar;
        this.b = cfkVar;
        this.c = cropAspectRatioFormat;
        this.d = z;
    }

    @Override // xsna.g5p
    public final boolean I() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cc0)) {
            return false;
        }
        cc0 cc0Var = (cc0) obj;
        return epx.f(this.a, cc0Var.a) && epx.f(this.b, cc0Var.b) && this.c == cc0Var.c;
    }

    @Override // xsna.g5p
    public final f5p getId() {
        return jik.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ActualCropParams(basedOnImageLink=null, geometry=" + this.a + ", area=" + this.b + ", ratioFormat=" + this.c + ", isDefault=" + this.d + ")";
    }
}
