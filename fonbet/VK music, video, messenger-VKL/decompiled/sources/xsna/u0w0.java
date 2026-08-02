package xsna;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: VkViewOutlineProvider.kt */
/* loaded from: classes17.dex */
public final class u0w0 extends ViewOutlineProvider {
    public final float a;
    public final boolean b = true;
    public final boolean c;

    public u0w0(float f, boolean z) {
        this.a = f;
        this.c = z;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        boolean z = this.b;
        float f = this.a;
        int b = z ? 0 : an10.b(f);
        if (this.c) {
            f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        int width = view.getWidth();
        if (width == 0) {
            width = view.getMeasuredWidth();
        }
        int height = view.getHeight();
        if (height == 0) {
            height = view.getMeasuredHeight();
        }
        outline.setRoundRect(-b, 0, an10.b(width + f), height, this.a);
    }
}
