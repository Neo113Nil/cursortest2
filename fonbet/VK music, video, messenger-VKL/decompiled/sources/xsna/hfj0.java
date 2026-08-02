package xsna;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.LinearLayout;
import com.unity3d.services.UnityAdsConstants;
import xsna.mih0;

/* compiled from: View.kt */
/* loaded from: classes17.dex */
public final class hfj0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.k c;
    public final /* synthetic */ mih0.p d;

    public hfj0(LinearLayout linearLayout, com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.k kVar, mih0.p pVar) {
        this.b = linearLayout;
        this.c = kVar;
        this.d = pVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        LinearLayout linearLayout = this.b;
        linearLayout.setPivotX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        linearLayout.setPivotY(linearLayout.getHeight() / 2.0f);
        linearLayout.setScaleX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        linearLayout.setScaleY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        linearLayout.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.k kVar = this.c;
        ValueAnimator valueAnimator = kVar.p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, kVar.l.getWidth());
        ofInt.addUpdateListener(new ifj0(linearLayout));
        ofInt.setDuration(250L);
        kVar.p = ofInt;
        ofInt.addListener(new jfj0(linearLayout, kVar, this.d));
        ValueAnimator valueAnimator2 = kVar.p;
        if (valueAnimator2 != null) {
            valueAnimator2.start();
        }
    }
}
