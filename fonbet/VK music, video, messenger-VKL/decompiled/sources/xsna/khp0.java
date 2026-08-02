package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* compiled from: TrackableGiftView.kt */
/* loaded from: classes6.dex */
public class khp0 extends FrameLayout {
    public static final /* synthetic */ int k = 0;
    public gzs<s3q0> b;
    public final int c;
    public final long d;
    public boolean e;
    public yok0 f;
    public final Rect g;
    public final hpj h;
    public final hhp0 i;
    public final ihp0 j;

    public khp0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a() {
        if (this.e) {
            return;
        }
        if (!b(this.c, this)) {
            yok0 yok0Var = this.f;
            if (yok0Var != null) {
                yok0Var.b(null);
            }
            this.f = null;
            return;
        }
        yok0 yok0Var2 = this.f;
        if (yok0Var2 == null || !yok0Var2.isActive()) {
            this.f = myc0.h(this.h, null, null, new jhp0(this, null), 3);
        }
    }

    public final boolean b(int i, View view) {
        if (!view.isShown() || view.getWindowVisibility() != 0) {
            return false;
        }
        Rect rect = this.g;
        if (!view.getGlobalVisibleRect(rect)) {
            return false;
        }
        int height = rect.height() * rect.width();
        int height2 = view.getHeight() * view.getWidth();
        return height2 > 0 && (((float) height) / ((float) height2)) * ((float) 100) >= ((float) i);
    }

    public gzs<s3q0> getVisibilityListener() {
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.i);
        getViewTreeObserver().addOnGlobalLayoutListener(this.j);
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnScrollChangedListener(this.i);
        getViewTreeObserver().removeOnGlobalLayoutListener(this.j);
        yok0 yok0Var = this.f;
        if (yok0Var != null) {
            yok0Var.b(null);
        }
        this.f = null;
        this.e = false;
        iyx.d(this.h.b);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            a();
            return;
        }
        yok0 yok0Var = this.f;
        if (yok0Var != null) {
            yok0Var.b(null);
        }
        this.f = null;
    }

    public void setVisibilityListener(gzs<s3q0> gzsVar) {
        this.b = gzsVar;
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [xsna.hhp0] */
    /* JADX WARN: Type inference failed for: r1v9, types: [xsna.ihp0] */
    public khp0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.c = 70;
        this.d = 500L;
        this.g = new Rect();
        bdn bdnVar = bdn.a;
        this.h = zvj.a(ie00.a.plus(whn0.a()));
        this.i = new ViewTreeObserver.OnScrollChangedListener() { // from class: xsna.hhp0
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                int i2 = khp0.k;
                khp0.this.a();
            }
        };
        this.j = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: xsna.ihp0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                int i2 = khp0.k;
                khp0.this.a();
            }
        };
    }
}
