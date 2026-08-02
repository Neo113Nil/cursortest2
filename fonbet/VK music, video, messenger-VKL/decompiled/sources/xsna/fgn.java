package xsna;

import one.video.transform.TransformController;

/* compiled from: VideoState.kt */
/* loaded from: classes3.dex */
public final class fgn {
    public final boolean a;
    public final TransformController.ScaleType b;
    public final boolean c;

    public fgn(boolean z, TransformController.ScaleType scaleType, boolean z2) {
        this.a = z;
        this.b = scaleType;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fgn)) {
            return false;
        }
        fgn fgnVar = (fgn) obj;
        return this.a == fgnVar.a && this.b == fgnVar.b && this.c == fgnVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisplayState(isFitCropEnabled=");
        sb.append(this.a);
        sb.append(", scaleType=");
        sb.append(this.b);
        sb.append(", isFirstFrameRendered=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
