package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.util.SizeF;
import com.unity3d.services.UnityAdsConstants;
import kotlin.LazyThreadSafetyMode;

/* compiled from: VkPictureIconBadge.kt */
@ozl
/* loaded from: classes17.dex */
public final class ycv0 implements wcv0 {
    public final Drawable a;
    public final boolean b;
    public float c = -1.0f;
    public final Path d = new Path();
    public SizeF e = new SizeF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    public final Object f = msy.a(LazyThreadSafetyMode.NONE, new ap80(18));

    public ycv0(Drawable drawable, boolean z) {
        this.a = drawable;
        this.b = z;
    }

    public static final SizeF d(int i, int i2, Context context) {
        return new SizeF(hbh0.a(context, i), hbh0.a(context, i2));
    }

    @Override // xsna.wcv0
    public final SizeF a(Context context, float f) {
        e(context, f);
        return this.e;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.wcv0
    public final void b(Context context, float f, Canvas canvas) {
        e(context, f);
        if (!this.b) {
            ?? r5 = this.f;
            ((Paint) r5.getValue()).setShadowLayer(hbh0.a(context, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 255);
            canvas.drawCircle(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.e.getHeight() / 2, (Paint) r5.getValue());
        }
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // xsna.wcv0
    public final Path c(Context context, float f) {
        if (!this.b) {
            return null;
        }
        e(context, f);
        return this.d;
    }

    public final void e(Context context, float f) {
        if (f == this.c) {
            return;
        }
        this.e = f < 40.0f ? d(12, 12, context) : f < 56.0f ? d(16, 16, context) : f < 72.0f ? d(20, 20, context) : d(24, 24, context);
        float a = hbh0.a(context, 4.0f);
        SizeF sizeF = new SizeF(this.e.getWidth() + a, this.e.getHeight() + a);
        Path path = this.d;
        path.reset();
        float f2 = 2;
        path.addOval((-sizeF.getWidth()) / f2, (-sizeF.getHeight()) / f2, sizeF.getWidth() / f2, sizeF.getHeight() / f2, Path.Direction.CW);
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setBounds((int) ((-this.e.getWidth()) / f2), (int) ((-this.e.getHeight()) / f2), (int) (this.e.getWidth() / f2), (int) (this.e.getHeight() / f2));
        }
        this.c = f;
    }
}
