package xsna;

/* compiled from: AutoValue_ImmutableZoomState.java */
/* loaded from: classes11.dex */
public final class vm5 extends spw {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public vm5(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // xsna.e7y0
    public final float a() {
        return this.d;
    }

    @Override // xsna.e7y0
    public final float b() {
        return this.a;
    }

    @Override // xsna.e7y0
    public final float c() {
        return this.b;
    }

    @Override // xsna.e7y0
    public final float d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof spw) {
            spw spwVar = (spw) obj;
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(((vm5) spwVar).a)) {
                vm5 vm5Var = (vm5) spwVar;
                if (Float.floatToIntBits(this.b) == Float.floatToIntBits(vm5Var.b) && Float.floatToIntBits(this.c) == Float.floatToIntBits(vm5Var.c) && Float.floatToIntBits(this.d) == Float.floatToIntBits(vm5Var.d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((Float.floatToIntBits(this.a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ Float.floatToIntBits(this.c)) * 1000003) ^ Float.floatToIntBits(this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImmutableZoomState{zoomRatio=");
        sb.append(this.a);
        sb.append(", maxZoomRatio=");
        sb.append(this.b);
        sb.append(", minZoomRatio=");
        sb.append(this.c);
        sb.append(", linearZoom=");
        return shy.c(this.d, "}", sb);
    }
}
