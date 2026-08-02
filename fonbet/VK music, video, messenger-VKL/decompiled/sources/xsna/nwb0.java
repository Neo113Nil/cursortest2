package xsna;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: AndroidPopup.android.kt */
/* loaded from: classes11.dex */
public final class nwb0 extends ViewOutlineProvider {
    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRect(0, 0, view.getWidth(), view.getHeight());
        outline.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }
}
