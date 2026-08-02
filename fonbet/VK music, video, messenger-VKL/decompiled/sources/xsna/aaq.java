package xsna;

import android.view.View;
import android.widget.TextView;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.viewpager.widget.ViewPager;
import com.ironsource.Lf;
import com.ironsource.mediationsdk.testSuite.TestSuiteActivity;
import com.unity3d.mediation.banner.LevelPlayBannerAdView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.tabs.VkTabLayout;
import com.vk.core.view.components.tabs.VkTabs;
import com.vk.newsfeed.impl.explore.ExploreFragment;
import ru.mail.libverify.controls.VerificationController;
import ru.ok.android.externcalls.sdk.waiting_room.ConversationWaitingParticipantId;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants;
import xsna.xy50;
import xsna.zv90;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class aaq implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ aaq(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ExploreFragment exploreFragment = (ExploreFragment) this.c;
                ViewPager viewPager = (ViewPager) this.d;
                VkTabLayout vkTabLayout = exploreFragment.S;
                if (vkTabLayout != null) {
                    vkTabLayout.d(viewPager.getCurrentItem(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true, true);
                }
                VkTabs vkTabs = exploreFragment.T;
                if (vkTabs != null) {
                    VkTabs.c selectedTab = vkTabs.getSelectedTab();
                    if ((selectedTab == null || selectedTab.b != viewPager.getCurrentItem()) && viewPager.getCurrentItem() < vkTabs.getTabsCount()) {
                        vkTabs.l(viewPager.getCurrentItem(), true);
                        break;
                    }
                }
                break;
            case 1:
                zgr zgrVar = (zgr) this.c;
                zgrVar.j.a((VideoFrameProcessingException) this.d);
                break;
            case 2:
                Lf.b((TestSuiteActivity) this.c, (LevelPlayBannerAdView) this.d);
                break;
            case 3:
                p630 p630Var = (p630) this.c;
                CharSequence charSequence = (CharSequence) this.d;
                TextView textView = p630Var.x;
                textView.setText(charSequence);
                d3m.c(textView, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case 4:
                View view = (View) this.c;
                view.getViewTreeObserver().removeOnDrawListener((xy50.b) this.d);
                break;
            case 5:
                View view2 = (View) this.c;
                view2.getViewTreeObserver().removeOnDrawListener((zv90.a) this.d);
                break;
            case 6:
                ((VerificationController) this.c).lambda$onEnterSmsCode$3((String) this.d);
                break;
            default:
                WaitingRoomParticipants.resolveInternalIdSingle$lambda$0$0((io.reactivex.rxjava3.core.y) this.c, (ConversationWaitingParticipantId) this.d);
                break;
        }
    }
}
