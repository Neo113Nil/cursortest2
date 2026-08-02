package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: PosterBackgroundView.kt */
/* loaded from: classes4.dex */
public final class bac0 extends View {
    public final pac0 b;
    public final pac0 c;
    public float d;
    public float e;

    public bac0(Context context) {
        super(context);
        this.b = new pac0(this, 1.084f);
        this.c = new pac0(this, 1.12f);
    }

    public final void a(float f, float f2) {
        double d = f;
        if (d < -1.0d || 1.0d < d) {
            return;
        }
        double d2 = f2;
        if (d2 < -1.0d || 1.0d < d2) {
            return;
        }
        this.d = f;
        this.e = f2;
        this.b.d(f, f2);
        this.c.d(f, f2);
        invalidate();
    }

    public final float getParallaxTranslationX() {
        return this.d;
    }

    public final float getParallaxTranslationY() {
        return this.e;
    }

    @Override // android.view.View
    public final void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        int i5 = i3 - i;
        int i6 = i4 - i2;
        pac0 pac0Var = this.b;
        pac0Var.o = i5;
        pac0Var.p = i6;
        pac0Var.b();
        pac0Var.a.invalidate();
        pac0 pac0Var2 = this.c;
        pac0Var2.o = i5;
        pac0Var2.p = i6;
        pac0Var2.b();
        pac0Var2.a.invalidate();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        pac0 pac0Var = this.b;
        io.reactivex.rxjava3.disposables.c cVar = pac0Var.k;
        if (cVar != null) {
            cVar.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar2 = pac0Var.l;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        pac0Var.k = null;
        pac0Var.l = null;
        pac0Var.r = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        pac0Var.s = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        pac0 pac0Var2 = this.c;
        io.reactivex.rxjava3.disposables.c cVar3 = pac0Var2.k;
        if (cVar3 != null) {
            cVar3.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar4 = pac0Var2.l;
        if (cVar4 != null) {
            cVar4.dispose();
        }
        pac0Var2.k = null;
        pac0Var2.l = null;
        pac0Var2.r = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        pac0Var2.s = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.b.a(canvas);
        this.c.a(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        setMeasuredDimension(size, (int) ((size * 1.0f) / 1.3333334f));
    }
}
