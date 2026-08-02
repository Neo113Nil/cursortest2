package xsna;

import android.graphics.Canvas;
import android.graphics.drawable.NinePatchDrawable;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: RoundedNinePatchDrawable.kt */
/* loaded from: classes12.dex */
public final class fpg0 extends epg0 {
    public fpg0(NinePatchDrawable ninePatchDrawable) {
        super(ninePatchDrawable);
    }

    @Override // xsna.epg0, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (lhs.d()) {
            lhs.a("RoundedNinePatchDrawable#draw");
        }
        if (!this.c && !this.d && this.e <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            super.draw(canvas);
            if (lhs.d()) {
                lhs.b();
                return;
            }
            return;
        }
        d();
        b();
        canvas.clipPath(this.f);
        super.draw(canvas);
        if (lhs.d()) {
            lhs.b();
        }
    }
}
