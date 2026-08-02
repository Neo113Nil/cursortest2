package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.X2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment;
import com.vkontakte.android.R;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cp8;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class hrg implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hrg(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                CommunityAddressesFragment communityAddressesFragment = (CommunityAddressesFragment) this.c;
                ((Integer) obj2).getClass();
                ((Integer) obj3).getClass();
                crg crgVar = communityAddressesFragment.T;
                if (crgVar != null) {
                    RecyclerView recyclerView = communityAddressesFragment.V;
                    if (recyclerView == null) {
                        recyclerView = null;
                    }
                    crgVar.x0(recyclerView, communityAddressesFragment.D0);
                }
                return s3q0.a;
            case 1:
                izs izsVar = (izs) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1448575844, intValue, -1, "com.vk.draftslist.impl.ui.view.DraftsListViewContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DraftsListViewContent.kt:157)");
                    }
                    q630.a aVar2 = q630.a.a;
                    float f = 16;
                    float f2 = 12;
                    q630 H = s200.H(txj0.f(aVar2, 1.0f), f2, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 4);
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, aVar, 48);
                    int hashCode = Long.hashCode(n34.n(aVar));
                    sy90 D = aVar.D();
                    q630 c = qri.c(aVar, H);
                    cri.h7.getClass();
                    LayoutNode.a aVar3 = cri.a.b;
                    if (aVar.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar.H();
                    if (aVar.L()) {
                        aVar.I(aVar3);
                    } else {
                        aVar.f();
                    }
                    k9q0.w(aVar, a, cri.a.f);
                    k9q0.w(aVar, D, cri.a.e);
                    k9q0.w(aVar, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar, cri.a.h);
                    k9q0.w(aVar, c, cri.a.d);
                    String N = d370.N(R.string.loading_error, 0, aVar);
                    q630 H2 = s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1, 7);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j = ylu0Var.getText().s;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) aVar.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.c(N, H2, j, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.T, aVar, 48, 0, 8184);
                    if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                        szw.a("invalid weight; must be greater than zero");
                    }
                    f9t.e(new xpy(1.0f, true), aVar, 0);
                    q630 D2 = s200.D(aVar2, f2);
                    gio0 a2 = cp8.d.a.a(d370.N(R.string.newsfeed_retry_load, 0, aVar), null, aVar, 3072, 6);
                    ButtonStyle buttonStyle = ButtonStyle.Link;
                    ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                    boolean J = aVar.J(izsVar);
                    Object x = aVar.x();
                    if (J || x == a.C0011a.a) {
                        x = new mif(izsVar, 1);
                        aVar.R(x);
                    }
                    bhu0.d((gzs) x, buttonStyle, buttonAppearance, D2, null, null, null, a2, false, null, aVar, X2.b.f, 3952);
                    aVar.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            default:
                wvq wvqVar = (wvq) this.c;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar4.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1325994040, intValue2, -1, "com.vk.design.demo.presentation.screens.feed.FeedActionButtonsScreenContent.ButtonsList.<anonymous>.<anonymous>.<anonymous> (FeedActionButtonsScreenContent.kt:101)");
                    }
                    wvqVar.d("VkFeedActionCellButton", aVar4, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
        }
    }
}
