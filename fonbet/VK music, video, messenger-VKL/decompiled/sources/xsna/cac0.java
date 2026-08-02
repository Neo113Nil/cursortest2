package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: PosterBackgroundView.kt */
/* loaded from: classes15.dex */
public final class cac0 extends View {
    public static final float e = cn70.a() * 12.0f;
    public final kac0 b;
    public final kac0 c;
    public final Path d;

    public cac0(Context context) {
        super(context, null, 0);
        this.b = new kac0(this, 1.084f);
        this.c = new kac0(this, 1.12f);
        this.d = new Path();
    }

    @Override // android.view.View
    public final void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        int i5 = i3 - i;
        int i6 = i4 - i2;
        kac0 kac0Var = this.b;
        kac0Var.j = i5;
        kac0Var.k = i6;
        kac0Var.b();
        kac0Var.a.invalidate();
        kac0 kac0Var2 = this.c;
        kac0Var2.j = i5;
        kac0Var2.k = i6;
        kac0Var2.b();
        kac0Var2.a.invalidate();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        kac0 kac0Var = this.b;
        io.reactivex.rxjava3.disposables.c cVar = kac0Var.h;
        if (cVar != null) {
            cVar.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar2 = kac0Var.i;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        kac0Var.h = null;
        kac0Var.i = null;
        kac0 kac0Var2 = this.c;
        io.reactivex.rxjava3.disposables.c cVar3 = kac0Var2.h;
        if (cVar3 != null) {
            cVar3.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar4 = kac0Var2.i;
        if (cVar4 != null) {
            cVar4.dispose();
        }
        kac0Var2.h = null;
        kac0Var2.i = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int save = canvas.save();
        float width = getWidth();
        float height = getHeight();
        float f = e;
        Path.Direction direction = Path.Direction.CW;
        Path path = this.d;
        path.addRoundRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width, height, f, f, direction);
        canvas.clipPath(path);
        super.onDraw(canvas);
        this.b.a(canvas);
        this.c.a(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        setMeasuredDimension(size, (int) ((size * 1.0f) / 1.3333334f));
    }
}
