package xsna;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import xsna.o2d0;

/* compiled from: RippleHostView.android.kt */
/* loaded from: classes11.dex */
public final class glg0 extends View {
    public static final int[] g = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] h = new int[0];
    public a5q0 b;
    public Boolean c;
    public Long d;
    public xw1 e;
    public cc2 f;

    private final void setRippleState(boolean z) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.e;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.d;
        long longValue = currentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (z || longValue >= 5) {
            int[] iArr = z ? g : h;
            a5q0 a5q0Var = this.b;
            if (a5q0Var != null) {
                a5q0Var.setState(iArr);
            }
        } else {
            xw1 xw1Var = new xw1(this, 11);
            this.e = xw1Var;
            postDelayed(xw1Var, 50L);
        }
        this.d = Long.valueOf(currentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(glg0 glg0Var) {
        a5q0 a5q0Var = glg0Var.b;
        if (a5q0Var != null) {
            a5q0Var.setState(h);
        }
        glg0Var.e = null;
    }

    public final void b(o2d0.b bVar, boolean z, long j, int i, long j2, float f, cc2 cc2Var) {
        if (this.b == null || !Boolean.valueOf(z).equals(this.c)) {
            a5q0 a5q0Var = new a5q0(z);
            setBackground(a5q0Var);
            this.b = a5q0Var;
            this.c = Boolean.valueOf(z);
        }
        a5q0 a5q0Var2 = this.b;
        this.f = cc2Var;
        e(i, j, f, j2);
        if (z) {
            a5q0Var2.setHotspot(Float.intBitsToFloat((int) (bVar.a >> 32)), Float.intBitsToFloat((int) (bVar.a & 4294967295L)));
        } else {
            a5q0Var2.setHotspot(a5q0Var2.getBounds().centerX(), a5q0Var2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.f = null;
        xw1 xw1Var = this.e;
        if (xw1Var != null) {
            removeCallbacks(xw1Var);
            this.e.run();
        } else {
            a5q0 a5q0Var = this.b;
            if (a5q0Var != null) {
                a5q0Var.setState(h);
            }
        }
        a5q0 a5q0Var2 = this.b;
        if (a5q0Var2 == null) {
            return;
        }
        a5q0Var2.setVisible(false, false);
        unscheduleDrawable(a5q0Var2);
    }

    public final void d() {
        setRippleState(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            c();
        }
    }

    public final void e(int i, long j, float f, long j2) {
        a5q0 a5q0Var = this.b;
        if (a5q0Var == null) {
            return;
        }
        Integer num = a5q0Var.d;
        if (num == null || num.intValue() != i) {
            a5q0Var.d = Integer.valueOf(i);
            a5q0Var.setRadius(i);
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        long c = l5g.c(14, j2, f);
        l5g l5gVar = a5q0Var.c;
        if (!(l5gVar == null ? false : l5g.d(l5gVar.a, c))) {
            a5q0Var.c = new l5g(c);
            a5q0Var.setColor(ColorStateList.valueOf(f870.H(c)));
        }
        Rect rect = new Rect(0, 0, an10.b(Float.intBitsToFloat((int) (j >> 32))), an10.b(Float.intBitsToFloat((int) (j & 4294967295L))));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        a5q0Var.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        cc2 cc2Var = this.f;
        if (cc2Var != null) {
            cc2Var.invoke();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
