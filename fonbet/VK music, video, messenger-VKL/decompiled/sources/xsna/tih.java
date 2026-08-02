package xsna;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$BalloonTilt;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import com.vk.dto.hints.Hint;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import xsna.m8v0;
import xsna.wih;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class tih implements izs {
    public final /* synthetic */ wih.a b;
    public final /* synthetic */ CommunityProfileContentItem.e c;
    public final /* synthetic */ CommunityProfileContentItem d;
    public final /* synthetic */ View e;
    public final /* synthetic */ com.vk.core.view.components.tabs.d f;
    public final /* synthetic */ wih.a.e g;

    public /* synthetic */ tih(wih.a aVar, CommunityProfileContentItem.e eVar, CommunityProfileContentItem communityProfileContentItem, View view, com.vk.core.view.components.tabs.d dVar, wih.a.e eVar2) {
        this.b = aVar;
        this.c = eVar;
        this.d = communityProfileContentItem;
        this.e = view;
        this.f = dVar;
        this.g = eVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        CommunityProfileContentItem.e eVar = this.c;
        String str = eVar.a;
        wih.a aVar = this.b;
        boolean z = aVar.G;
        bjh bjhVar = aVar.q;
        h7v h7vVar = aVar.r;
        if (z) {
            return s3q0.a;
        }
        Hint p = h7vVar != null ? h7vVar.p(str) : null;
        CommunityProfileContentItem communityProfileContentItem = this.d;
        if (p == null) {
            bjhVar.g(communityProfileContentItem);
            return s3q0.a;
        }
        View view = this.e;
        Rect F = bwt0.F(view);
        com.vk.core.view.components.tabs.d dVar = this.f;
        Rect C = bwt0.C(dVar);
        boolean isVisible = ((FragmentImpl) ((wih) aVar.m).i.b).isVisible();
        wih.a.e eVar2 = this.g;
        if (!isVisible || !F.contains(C)) {
            bwt0.n(dVar, new tih(aVar, eVar, communityProfileContentItem, view, dVar, eVar2));
            return s3q0.a;
        }
        int i = 1;
        aVar.G = true;
        dVar.removeOnAttachStateChangeListener(eVar2);
        h7vVar.k(dVar);
        ((FragmentImpl) ((wih) aVar.m).i.b).requireView().dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0));
        int i2 = m8v0.M;
        String str2 = p.c;
        if (str2 == null) {
            str2 = aVar.itemView.getContext().getString(eVar.b);
        }
        m8v0.a.a(dVar, str2, null, VkTooltip$MarkerStyle.Style6, VkTooltip$MarkerSize.Size48, null, VkTooltip$BalloonPosition.BottomRight, VkTooltip$BalloonTilt.Right, new vl1(dVar, 20), new fgh(dVar, i), null, null, null, new hn0(10, aVar, communityProfileContentItem), null, 0, false, null, null, false, null, !dhr0.M(), 5233700);
        bjhVar.h(str);
        return s3q0.a;
    }
}
