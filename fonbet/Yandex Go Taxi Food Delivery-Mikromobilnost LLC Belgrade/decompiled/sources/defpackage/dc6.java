package defpackage;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.ViewGroup;
import android.view.ViewParent;

/* loaded from: classes12.dex */
public final class dc6 {
    public final Context a;
    public final Paint b;
    public int c;
    public final Paint d;
    public final float e;
    public final float f;
    public ViewGroup g;
    public cc6 h;

    public dc6(Context context) {
        this.a = context;
        Paint paint = new Paint();
        paint.setMaskFilter(new BlurMaskFilter(tje.w(20, context), BlurMaskFilter.Blur.NORMAL));
        paint.setColor(qje.u(context.getTheme(), xng0.effectShadowBottom));
        this.b = paint;
        this.c = xng0.bgMain;
        Paint paint2 = new Paint();
        paint2.setColor(qje.u(context.getTheme(), this.c));
        this.d = paint2;
        this.e = tje.w(-4, context);
        this.f = tje.w(20, context);
    }

    public final void a(ViewGroup viewGroup) {
        this.g = viewGroup;
        ViewParent parent = viewGroup.getParent();
        ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup2 != null) {
            this.h = new cc6(viewGroup2, viewGroup2.getClipChildren(), viewGroup2.getClipChildren());
            viewGroup2.setClipChildren(false);
            viewGroup2.setClipToPadding(false);
        }
    }

    public final void b(Canvas canvas) {
        ViewGroup viewGroup = this.g;
        if (viewGroup == null) {
            return;
        }
        float width = viewGroup.getWidth();
        float height = viewGroup.getHeight();
        float f = this.f;
        canvas.drawRoundRect(0.0f, this.e, width, height, f, f, this.b);
        float f2 = this.f;
        canvas.drawRoundRect(0.0f, 0.0f, width, height + f2, f2, f2, this.d);
    }

    public final void c() {
        int i = this.c;
        Context context = this.a;
        this.d.setColor(qje.t(i, context));
        this.b.setColor(qje.u(context.getTheme(), xng0.bgMinor));
    }
}
