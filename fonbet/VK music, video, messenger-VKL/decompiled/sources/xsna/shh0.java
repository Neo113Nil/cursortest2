package xsna;

import android.graphics.PointF;

/* compiled from: ScrollingBusEvent.kt */
/* loaded from: classes18.dex */
public final class shh0 {
    public final gp6 a;
    public final float b;
    public final PointF c;

    public shh0(gp6 gp6Var, float f, PointF pointF) {
        this.a = gp6Var;
        this.b = f;
        this.c = pointF;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof shh0)) {
            return false;
        }
        shh0 shh0Var = (shh0) obj;
        return epx.f(this.a, shh0Var.a) && Float.compare(this.b, shh0Var.b) == 0 && epx.f(this.c, shh0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + io.reactivex.rxjava3.subjects.b.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ScrollingBusEvent(item=" + this.a + ", diff=" + this.b + ", fingerPoint=" + this.c + ')';
    }
}
