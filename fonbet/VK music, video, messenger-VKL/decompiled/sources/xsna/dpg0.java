package xsna;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: RoundedDrawable.kt */
/* loaded from: classes17.dex */
public final class dpg0 extends alo {
    public final boolean b;
    public final bpn0 c;
    public final bpn0 d;
    public final bpn0 e;

    public dpg0(Drawable drawable, float f) {
        super(drawable);
        bpn0 bpn0Var = new bpn0(new jo60(6));
        this.c = bpn0Var;
        this.d = new bpn0(new uv80(5));
        this.e = new bpn0(new ml7(25));
        boolean z = f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.b = z;
        if (z) {
            jw5.q((float[]) bpn0Var.getValue(), f);
        }
        a(getBounds());
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getPaint().setAntiAlias(true);
        }
    }

    public final void a(Rect rect) {
        bpn0 bpn0Var = this.d;
        ((Path) bpn0Var.getValue()).reset();
        if (this.b) {
            bpn0 bpn0Var2 = this.e;
            ((RectF) bpn0Var2.getValue()).left = rect.left;
            ((RectF) bpn0Var2.getValue()).top = rect.top;
            ((RectF) bpn0Var2.getValue()).right = rect.right;
            ((RectF) bpn0Var2.getValue()).bottom = rect.bottom;
            ((Path) bpn0Var.getValue()).addRoundRect((RectF) bpn0Var2.getValue(), (float[]) this.c.getValue(), Path.Direction.CW);
        }
    }

    @Override // xsna.alo, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        bpn0 bpn0Var = this.d;
        if (((Path) bpn0Var.getValue()).isEmpty()) {
            super.draw(canvas);
            return;
        }
        Rect clipBounds = canvas.getClipBounds();
        canvas.clipPath((Path) bpn0Var.getValue());
        try {
            super.draw(canvas);
        } finally {
            canvas.clipRect(clipBounds);
        }
    }

    @Override // xsna.alo, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        a(rect);
    }
}
