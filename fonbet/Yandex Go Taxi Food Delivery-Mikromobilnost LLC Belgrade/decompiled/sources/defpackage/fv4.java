package defpackage;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;

/* loaded from: classes11.dex */
public final class fv4 {
    public final vv4 a;
    public final Rect b;

    public fv4(vv4 vv4Var, Matrix matrix) {
        this.a = vv4Var;
        Rect k = vv4Var.k();
        if (k != null && matrix != null) {
            qnc.d(k, matrix);
        }
        this.b = k;
        Point[] n = vv4Var.n();
        if (n == null || matrix == null) {
            return;
        }
        qnc.b(n, matrix);
    }
}
