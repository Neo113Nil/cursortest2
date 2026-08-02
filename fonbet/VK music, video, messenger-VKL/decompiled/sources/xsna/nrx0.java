package xsna;

import android.graphics.Rect;
import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: WindowProperties.kt */
/* loaded from: classes4.dex */
public final class nrx0 {
    public final Rect a;
    public final RectF b;
    public final Rect c;
    public final float[] d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;

    public nrx0(Rect rect, RectF rectF, Rect rect2, float[] fArr, float f, float f2, float f3, float f4, float f5) {
        this.a = rect;
        this.b = rectF;
        this.c = rect2;
        this.d = fArr;
        this.e = f;
        this.f = f2;
        this.g = f3;
        this.h = f4;
        this.i = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!nrx0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        nrx0 nrx0Var = (nrx0) obj;
        return epx.f(this.a, nrx0Var.a) && epx.f(this.b, nrx0Var.b) && epx.f(this.c, nrx0Var.c) && Arrays.equals(this.d, nrx0Var.d) && this.e == nrx0Var.e && this.f == nrx0Var.f && this.g == nrx0Var.g;
    }

    public final int hashCode() {
        Rect rect = this.a;
        int hashCode = (this.b.hashCode() + ((rect != null ? rect.hashCode() : 0) * 31)) * 31;
        Rect rect2 = this.c;
        return Float.hashCode(this.g) + io.reactivex.rxjava3.subjects.b.a(this.f, io.reactivex.rxjava3.subjects.b.a(this.e, (Arrays.hashCode(this.d) + ((hashCode + (rect2 != null ? rect2.hashCode() : 0)) * 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WindowProperties(itemRect=");
        sb.append(this.a);
        sb.append(", containerRectF=");
        sb.append(this.b);
        sb.append(", clipContainerRect=");
        sb.append(this.c);
        sb.append(", cornerRadius=");
        sb.append(Arrays.toString(this.d));
        sb.append(", previewWidth=");
        sb.append(this.e);
        sb.append(", previewHeight=");
        sb.append(this.f);
        sb.append(", alpha=");
        sb.append(this.g);
        sb.append(", deviceWidth=");
        sb.append(this.h);
        sb.append(", deviceHeight=");
        return xq.c(')', this.i, sb);
    }
}
