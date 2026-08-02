package xsna;

/* compiled from: StickerColorPipetteInfo.kt */
/* loaded from: classes18.dex */
public final class t2l0 {
    public boolean a = true;
    public final int b;
    public final float c;
    public final float d;

    public t2l0(float f, float f2, int i) {
        this.b = i;
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t2l0)) {
            return false;
        }
        t2l0 t2l0Var = (t2l0) obj;
        return this.a == t2l0Var.a && this.b == t2l0Var.b && Float.compare(this.c, t2l0Var.c) == 0 && Float.compare(this.d, t2l0Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + io.reactivex.rxjava3.subjects.b.a(this.c, shy.a(this.b, Boolean.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerColorPipetteInfo(colorPipetteSelected=");
        sb.append(this.a);
        sb.append(", colorPipette=");
        sb.append(this.b);
        sb.append(", coordinatePipetteX=");
        sb.append(this.c);
        sb.append(", coordinatePipetteY=");
        return xq.c(')', this.d, sb);
    }
}
