package xsna;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: WatermarkLogoDrawer.kt */
/* loaded from: classes3.dex */
public abstract class cdx0 extends og6 {
    public final dqz0 d;
    public final StaticLayout e;

    public cdx0(String str, float f, float f2, Typeface typeface, int i, float f3, Drawable drawable, dqz0 dqz0Var) {
        super(i, f3, drawable);
        this.d = dqz0Var;
        TextPaint textPaint = new TextPaint(1);
        textPaint.setColor(-1);
        textPaint.setTextSize(i * f2);
        textPaint.setTypeface(typeface);
        this.e = new xxk0(str, textPaint, an10.b(f * this.c), null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, 8184).a();
    }
}
