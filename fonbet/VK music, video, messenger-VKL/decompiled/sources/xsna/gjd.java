package xsna;

import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import xsna.ijd;

/* compiled from: View.kt */
/* loaded from: classes16.dex */
public final class gjd implements View.OnLayoutChangeListener {
    public final /* synthetic */ ijd.a b;
    public final /* synthetic */ ijd c;

    public gjd(ijd.a aVar, ijd ijdVar) {
        this.b = aVar;
        this.c = ijdVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        View view2 = this.b.a;
        view2.setScaleX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        view2.setScaleY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        view2.setPivotX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        view2.setPivotY(view2.getHeight());
        view2.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).withEndAction(new hjd(this.c)).start();
    }
}
