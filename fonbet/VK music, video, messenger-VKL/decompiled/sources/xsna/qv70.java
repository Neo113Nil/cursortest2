package xsna;

/* compiled from: OffsetBounds.kt */
/* loaded from: classes4.dex */
public final class qv70 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public qv70(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qv70)) {
            return false;
        }
        qv70 qv70Var = (qv70) obj;
        return Float.compare(this.a, qv70Var.a) == 0 && Float.compare(this.b, qv70Var.b) == 0 && Float.compare(this.c, qv70Var.c) == 0 && Float.compare(this.d, qv70Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + io.reactivex.rxjava3.subjects.b.a(this.c, io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OffsetBounds(offsetXMin=");
        sb.append(this.a);
        sb.append(", offsetXMax=");
        sb.append(this.b);
        sb.append(", offsetYMin=");
        sb.append(this.c);
        sb.append(", offsetYMax=");
        return xq.c(')', this.d, sb);
    }
}
