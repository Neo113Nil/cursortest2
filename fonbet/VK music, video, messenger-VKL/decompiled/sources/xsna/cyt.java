package xsna;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.vkontakte.android.R;

/* compiled from: GhostViewPort.java */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes12.dex */
public final class cyt extends ViewGroup implements zxt {
    public static final /* synthetic */ int h = 0;
    public ViewGroup b;
    public View c;
    public final View d;
    public int e;
    public Matrix f;
    public final a g;

    /* compiled from: GhostViewPort.java */
    public class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            View view;
            cyt cytVar = cyt.this;
            cytVar.postInvalidateOnAnimation();
            ViewGroup viewGroup = cytVar.b;
            if (viewGroup == null || (view = cytVar.c) == null) {
                return true;
            }
            viewGroup.endViewTransition(view);
            cytVar.b.postInvalidateOnAnimation();
            cytVar.b = null;
            cytVar.c = null;
            return true;
        }
    }

    public cyt(View view) {
        super(view.getContext());
        this.g = new a();
        this.d = view;
        setWillNotDraw(false);
        setClipChildren(false);
        setLayerType(2, null);
    }

    @Override // xsna.zxt
    public final void a(View view, ViewGroup viewGroup) {
        this.b = viewGroup;
        this.c = view;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        View view = this.d;
        view.setTag(R.id.ghost_view, this);
        view.getViewTreeObserver().addOnPreDrawListener(this.g);
        y1u0.e(4, view);
        if (view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        View view = this.d;
        view.getViewTreeObserver().removeOnPreDrawListener(this.g);
        y1u0.e(0, view);
        view.setTag(R.id.ghost_view, null);
        if (view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        lr9.a(canvas, true);
        canvas.setMatrix(this.f);
        View view = this.d;
        y1u0.e(0, view);
        view.invalidate();
        y1u0.e(4, view);
        drawChild(canvas, view, getDrawingTime());
        lr9.a(canvas, false);
    }

    @Override // android.view.View, xsna.zxt
    public final void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.d;
        if (((cyt) view.getTag(R.id.ghost_view)) == this) {
            y1u0.e(i == 0 ? 4 : 0, view);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
