package xsna;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: AudioAttachCornersHelper.kt */
/* loaded from: classes2.dex */
public final class fc4 extends ViewOutlineProvider {
    public final /* synthetic */ float a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;

    public fc4(float f, float f2, int i) {
        this.a = f;
        this.b = i;
        this.c = f2;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        float f = this.a;
        int i = this.b;
        outline.setRoundRect(0, f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? -i : 0, view.getWidth(), view.getHeight() + (this.c == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? i : 0), i);
        view.setClipToOutline(true);
    }
}
