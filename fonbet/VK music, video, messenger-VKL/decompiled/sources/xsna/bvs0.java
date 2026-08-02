package xsna;

import androidx.compose.ui.platform.ComposeView;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeScreenMode;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferShow;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeView;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.c;
import xsna.sdh0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class bvs0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ VideoMinimizableDiscoveryFragment c;

    public /* synthetic */ bvs0(VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment, int i) {
        this.b = i;
        this.c = videoMinimizableDiscoveryFragment;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = this.c;
        switch (i) {
            case 0:
                sdh0 sdh0Var = (sdh0) obj;
                szm0 szm0Var = videoMinimizableDiscoveryFragment.l1;
                if (szm0Var != null) {
                    hpj hpjVar = szm0Var.i;
                    if (sdh0Var instanceof sdh0.c) {
                        ComposeView composeView = szm0Var.f;
                        if (composeView != null) {
                            composeView.setContent(new jai(1355973541, new no3(szm0Var, 11), true));
                            myc0.h(hpjVar, null, null, new rzm0(((sdh0.c) sdh0Var).a, szm0Var, null), 3);
                            UiTracker uiTracker = UiTracker.a;
                            new bvt0(UiTracker.c(), SchemeStat$TypeView.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO, null, null, null, null, null, 62, null), "", "", null, new MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionOfferShow(MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi.BANNER, MobileOfficialAppsVideoStat$TypeScreenMode.DISCOVERY), 8)).q();
                        }
                    } else if (sdh0Var instanceof sdh0.b) {
                        szm0Var.h.e(Integer.valueOf(((sdh0.b) sdh0Var).a));
                    }
                    ComposeView composeView2 = szm0Var.f;
                    if (composeView2 != null) {
                        bwt0.p0(composeView2, (sdh0Var instanceof sdh0.b) && ((sdh0.b) sdh0Var).b);
                    }
                    myc0.h(hpjVar, null, null, new pzm0(szm0Var, sdh0Var, null), 3);
                }
                break;
            default:
                int i2 = VideoMinimizableDiscoveryFragment.p1;
                c.e eVar = new c.e((String) obj);
                videoMinimizableDiscoveryFragment.getClass();
                xn50.a.c(videoMinimizableDiscoveryFragment, eVar);
                break;
        }
        return s3q0.a;
    }
}
