package xsna;

import android.graphics.PointF;
import android.graphics.RectF;

/* compiled from: StickerPosition.kt */
/* loaded from: classes5.dex */
public final class x5l0 {
    public final RectF a;
    public final RectF b;

    public x5l0() {
        this(0);
    }

    public static PointF a(RectF rectF) {
        return new PointF(rectF.centerX(), rectF.centerY());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5l0)) {
            return false;
        }
        x5l0 x5l0Var = (x5l0) obj;
        return epx.f(this.a, x5l0Var.a) && epx.f(this.b, x5l0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "StickerPosition(prevStickerRect=" + this.a + ", currStickerRect=" + this.b + ')';
    }

    public x5l0(int i) {
        RectF rectF = new RectF();
        RectF rectF2 = new RectF();
        this.a = rectF;
        this.b = rectF2;
    }
}
