package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.View;
import androidx.annotation.NonNull;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;

/* compiled from: VKZoomableImageView.java */
/* loaded from: classes2.dex */
public class fir0 extends VKImageView {
    public h64 m;

    public fir0(Context context) {
        super(context, null, 0);
        h64 h64Var = this.m;
        if (h64Var == null || h64Var.g() == null) {
            this.m = new h64(this);
        }
        setFocusable(true);
        if (getContentDescription() == null) {
            setContentDescription(context.getString(R.string.accessibility_zoomable_image));
        }
        setOnLoadCallback(new eir0(this));
    }

    public RectF getDisplayRect() {
        return this.m.e();
    }

    public i64 getImageListener() {
        return this.m.t;
    }

    public float getMaximumScale() {
        return this.m.g;
    }

    public float getMediumScale() {
        return this.m.f;
    }

    public float getMinimumScale() {
        return this.m.e;
    }

    public float getScale() {
        return this.m.h();
    }

    public Matrix getTransformMatrix() {
        return this.m.o;
    }

    @Override // xsna.zjt, android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        h64 h64Var = this.m;
        if (h64Var == null || h64Var.g() == null) {
            this.m = new h64(this);
        }
        setFocusable(true);
        super.onAttachedToWindow();
    }

    @Override // xsna.zjt, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        this.m.b();
        super.onDetachedFromWindow();
    }

    @Override // com.vk.imageloader.view.VKImageView, xsna.zjt, android.widget.ImageView, android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        int save = canvas.save();
        canvas.concat(this.m.o);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
    }

    public void setAllowParentInterceptOnEdge(boolean z) {
        this.m.l = z;
    }

    public void setImageListener(i64 i64Var) {
        this.m.t = i64Var;
    }

    public void setMaximumScale(float f) {
        h64 h64Var = this.m;
        h64.d(h64Var.e, h64Var.f, f);
        h64Var.g = f;
    }

    public void setMediumScale(float f) {
        h64 h64Var = this.m;
        h64.d(h64Var.e, f, h64Var.g);
        h64Var.f = f;
    }

    public void setMinimumScale(float f) {
        h64 h64Var = this.m;
        h64.d(f, h64Var.f, h64Var.g);
        h64Var.e = f;
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        h64 h64Var = this.m;
        fot fotVar = h64Var.j;
        if (onDoubleTapListener != null) {
            fotVar.a.setOnDoubleTapListener(onDoubleTapListener);
        } else {
            fotVar.a.setOnDoubleTapListener(new sjl(h64Var));
        }
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.m.u = onLongClickListener;
    }

    public void setScale(float f) {
        this.m.i(f);
    }

    public void setZoomTransitionDuration(long j) {
        h64 h64Var = this.m;
        h64Var.getClass();
        if (j < 0) {
            j = 200;
        }
        h64Var.h = j;
    }

    public void setZoomable(boolean z) {
        this.m.n = z;
    }
}
