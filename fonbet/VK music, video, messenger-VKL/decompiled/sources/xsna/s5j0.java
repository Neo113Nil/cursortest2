package xsna;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.ColorDrawable;
import com.unity3d.services.UnityAdsConstants;
import xsna.lw5;
import xsna.y8g;

/* compiled from: ShapeBackgroundDrawable.kt */
/* loaded from: classes4.dex */
public final class s5j0 extends ColorDrawable {
    public final Path a;
    public final lw5 b;
    public final Paint c;
    public final Paint d;
    public final Paint e;

    public s5j0(Path path, kif0 kif0Var, lw5 lw5Var) {
        this.a = path;
        this.b = lw5Var;
        Paint c = x9.c(true);
        u9p u9pVar = lw5Var.g;
        c.setPathEffect(u9pVar.provide());
        ig90.a(c, lw5Var.b);
        int i = (int) (lw5Var.e * 255);
        c.setAlpha(i);
        this.c = c;
        Paint c2 = x9.c(true);
        c2.setPathEffect(u9pVar.provide());
        lw5Var.h.getClass();
        c2.setShadowLayer(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -16777216);
        ig90.a(c2, y8g.a.a);
        c2.setAlpha(i);
        this.d = c2;
        Paint c3 = x9.c(true);
        c3.setPathEffect(u9pVar.provide());
        c3.setStrokeWidth(lw5Var.d);
        c3.setStyle(Paint.Style.STROKE);
        ig90.a(c3, lw5Var.c);
        c3.setAlpha(i);
        this.e = c3;
    }

    @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        lw5 lw5Var = this.b;
        boolean f = epx.f(lw5Var.h, lw5.b.a);
        Path path = this.a;
        if (!f) {
            canvas.drawPath(path, this.d);
        }
        canvas.drawPath(path, this.c);
        if (lw5Var.d == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        canvas.drawPath(path, this.e);
    }
}
