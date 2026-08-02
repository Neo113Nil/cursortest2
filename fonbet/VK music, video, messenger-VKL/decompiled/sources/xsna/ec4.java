package xsna;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: AudioAttachCornersHelper.kt */
/* loaded from: classes2.dex */
public final class ec4 extends ViewOutlineProvider {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;

    public ec4(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        if (this.a == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            outline.setRoundRect(0, -((int) this.b), view.getWidth(), view.getHeight(), this.b);
        } else {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.b);
        }
        view.setClipToOutline(true);
    }
}
