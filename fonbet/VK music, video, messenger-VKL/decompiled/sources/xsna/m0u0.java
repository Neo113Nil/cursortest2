package xsna;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: ViewRoundRectOutlineProvider.kt */
/* loaded from: classes16.dex */
public final class m0u0 extends ViewOutlineProvider {
    public final float a;
    public final boolean b;
    public final boolean c = true;

    public m0u0(float f, boolean z) {
        this.a = f;
        this.b = z;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        boolean z = this.c;
        float f = this.a;
        int b = z ? 0 : an10.b(f);
        if (this.b) {
            f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        int width = view.getWidth();
        if (width == 0) {
            width = view.getMeasuredWidth();
        }
        int i = width;
        int height = view.getHeight();
        if (height == 0) {
            height = view.getMeasuredHeight();
        }
        outline.setRoundRect(0, -b, i, an10.b(height + f), this.a);
    }
}
