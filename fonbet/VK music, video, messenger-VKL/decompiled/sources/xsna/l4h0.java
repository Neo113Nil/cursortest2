package xsna;

import android.content.Context;
import android.graphics.RectF;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.vk.imageloader.view.VKImageView;
import xsna.h64.b;

/* compiled from: ScaleDragDetector.java */
/* loaded from: classes2.dex */
public final class l4h0 implements ScaleGestureDetector.OnScaleGestureListener {
    public final float b;
    public final float c;
    public final ScaleGestureDetector d;
    public final h64 e;
    public VelocityTracker f;
    public boolean g;
    public float h;
    public float i;
    public int j = -1;
    public int k = 0;

    public l4h0(Context context, h64 h64Var) {
        this.d = new ScaleGestureDetector(context, this);
        this.e = h64Var;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.c = viewConfiguration.getScaledMinimumFlingVelocity();
        this.b = viewConfiguration.getScaledTouchSlop();
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
            return false;
        }
        this.e.onScale(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        i64 i64Var = this.e.t;
        if (i64Var == null) {
            return true;
        }
        i64Var.a();
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        h64 h64Var = this.e;
        float h = h64Var.h();
        VKImageView g = h64Var.g();
        if (g == null) {
            return;
        }
        if (h < h64Var.e) {
            RectF e = h64Var.e();
            if (e != null) {
                g.post(h64Var.new b(h, h64Var.e, e.centerX(), e.centerY()));
                return;
            }
            return;
        }
        float f = h64Var.g;
        if (h > f) {
            g.post(h64Var.new b(h, f, g.getRight() / 2, g.getBottom() / 2));
        }
    }
}
