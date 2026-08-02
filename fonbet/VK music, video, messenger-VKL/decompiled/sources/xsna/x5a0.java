package xsna;

import com.vk.feed.design.view.posting.preview.image.crop.model.PreviewCropType;

/* compiled from: PhotoCropUiTestTag.kt */
/* loaded from: classes18.dex */
public final class x5a0 {
    public final PreviewCropType a;
    public final e4d0 b;
    public final int c;
    public final int d;

    public x5a0(PreviewCropType previewCropType, e4d0 e4d0Var, int i, int i2) {
        this.a = previewCropType;
        this.b = e4d0Var;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5a0)) {
            return false;
        }
        x5a0 x5a0Var = (x5a0) obj;
        return this.a == x5a0Var.a && epx.f(this.b, x5a0Var.b) && this.c == x5a0Var.c && this.d == x5a0Var.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        e4d0 e4d0Var = this.b;
        return Integer.hashCode(this.d) + shy.a(this.c, (hashCode + (e4d0Var == null ? 0 : e4d0Var.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhotoCropUiTestTag(cropType=");
        sb.append(this.a);
        sb.append(", cropData=");
        sb.append(this.b);
        sb.append(", imageWidth=");
        sb.append(this.c);
        sb.append(", imageHeight=");
        return vu5.b(sb, this.d, ')');
    }
}
