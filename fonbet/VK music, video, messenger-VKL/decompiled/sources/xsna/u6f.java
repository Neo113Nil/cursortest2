package xsna;

/* compiled from: ClipsTemplateEditorCropperItemPresenterState.kt */
/* loaded from: classes16.dex */
public final class u6f {
    public final int a;
    public final dc50 b;
    public final n7f c;
    public final long d;
    public final float e;

    public u6f(int i, dc50 dc50Var, n7f n7fVar, long j, float f) {
        this.a = i;
        this.b = dc50Var;
        this.c = n7fVar;
        this.d = j;
        this.e = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u6f)) {
            return false;
        }
        u6f u6fVar = (u6f) obj;
        return this.a == u6fVar.a && epx.f(this.b, u6fVar.b) && epx.f(this.c, u6fVar.c) && this.d == u6fVar.d && Float.compare(this.e, u6fVar.e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + bh10.a((this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsTemplateEditorCropperItemPresenterState(cropperIndex=");
        sb.append(this.a);
        sb.append(", musicTrackInfo=");
        sb.append(this.b);
        sb.append(", item=");
        sb.append(this.c);
        sb.append(", initialAudioShiftMs=");
        sb.append(this.d);
        sb.append(", allFragmentProgressRelative=");
        return xq.c(')', this.e, sb);
    }
}
