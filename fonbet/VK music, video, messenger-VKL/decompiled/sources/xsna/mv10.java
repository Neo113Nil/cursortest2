package xsna;

import android.graphics.Matrix;
import android.graphics.RectF;

/* compiled from: MediaProperties.kt */
/* loaded from: classes4.dex */
public final class mv10 {
    public final Matrix a;
    public final Matrix b;
    public final Matrix c;
    public final hif0 d;
    public final RectF e;
    public final hif0 f;
    public final boolean g;

    public mv10() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mv10)) {
            return false;
        }
        mv10 mv10Var = (mv10) obj;
        return epx.f(this.a, mv10Var.a) && epx.f(this.b, mv10Var.b) && epx.f(this.c, mv10Var.c) && epx.f(this.d, mv10Var.d) && epx.f(this.e, mv10Var.e) && epx.f(this.f, mv10Var.f) && this.g == mv10Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaProperties(mediaMatrix=");
        sb.append(this.a);
        sb.append(", viewMatrix=");
        sb.append(this.b);
        sb.append(", zoomMatrix=");
        sb.append(this.c);
        sb.append(", mediaPoints=");
        sb.append(this.d);
        sb.append(", viewVisibleRect=");
        sb.append(this.e);
        sb.append(", visibleMediaPoints=");
        sb.append(this.f);
        sb.append(", isMirrored=");
        return n23.b(sb, this.g, ")");
    }

    public mv10(Matrix matrix, Matrix matrix2, Matrix matrix3, hif0 hif0Var, RectF rectF, hif0 hif0Var2, boolean z) {
        this.a = matrix;
        this.b = matrix2;
        this.c = matrix3;
        this.d = hif0Var;
        this.e = rectF;
        this.f = hif0Var2;
        this.g = z;
    }

    public /* synthetic */ mv10(int i) {
        this(new Matrix(), new Matrix(), new Matrix(), new hif0(0), new RectF(), new hif0(0), false);
    }
}
