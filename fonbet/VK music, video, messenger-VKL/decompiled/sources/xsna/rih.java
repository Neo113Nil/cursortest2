package xsna;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.vmoji.dto.VmojiPurchaseProductResponseDto;
import com.vk.core.tool.view.onboarding.highlighter.VkOnboardingHighlighter;
import com.vk.core.view.components.tabs.VkTabs;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.profile.tool.view.CommunityProfileTabsContainerLayout;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.wih;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class rih implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ rih(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VkTabs.c g;
        switch (this.b) {
            case 0:
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.c;
                wih.a aVar = (wih.a) this.d;
                ViewPager2 viewPager2 = aVar.z;
                wih wihVar = (wih) this.e;
                if (ref$BooleanRef.element) {
                    Integer num = wihVar.g.f;
                    VkTabs vkTabs = aVar.A;
                    RecyclerView.Adapter adapter = viewPager2.getAdapter();
                    if (adapter != null) {
                        int itemCount = adapter.getItemCount();
                        for (int i = 0; i < itemCount; i++) {
                            if (vkTabs.getTabsCount() > i) {
                                g = vkTabs.f(i);
                            } else {
                                g = vkTabs.g();
                                vkTabs.b(g, false);
                            }
                            aVar.t6(g, i);
                        }
                        i9x o = swe0.o(swe0.q(itemCount, vkTabs.getTabsCount()));
                        int i2 = o.b;
                        int i3 = o.c;
                        int i4 = o.d;
                        if ((i4 > 0 && i2 <= i3) || (i4 < 0 && i3 <= i2)) {
                            while (true) {
                                vkTabs.i(i2, true);
                                if (i2 != i3) {
                                    i2 += i4;
                                }
                            }
                        }
                        if (itemCount > 0) {
                            int min = Math.min(num != null ? num.intValue() : viewPager2.getCurrentItem(), vkTabs.getTabsCount() - 1);
                            VkTabs.c selectedTab = vkTabs.getSelectedTab();
                            if (selectedTab == null || min != selectedTab.b) {
                                vkTabs.l(min, true);
                            }
                        }
                    }
                }
                CommunityProfileTabsContainerLayout communityProfileTabsContainerLayout = aVar.w;
                viewPager2.post(new qn9(1, wihVar, aVar));
                CommunityProfileContentItem communityProfileContentItem = wihVar.g.b.get(viewPager2.getCurrentItem());
                dhq dhqVar = aVar.C;
                int i5 = wih.a.c.$EnumSwitchMapping$0[communityProfileContentItem.f().ordinal()];
                if ((i5 == 1 || i5 == 2 || i5 == 3 || i5 == 4) && !dhqVar.getHasOffset()) {
                    dhqVar.n(wih.a.v6(communityProfileContentItem), null, null);
                }
                if (communityProfileContentItem.f() == CommunityProfileContentItem.State.LOADED) {
                    dhqVar.g(null);
                }
                aVar.B.setTranslationY(-communityProfileTabsContainerLayout.getTop());
                if (aVar.q.i() + (-communityProfileTabsContainerLayout.getTop()) >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    wihVar.a = 1;
                } else {
                    wihVar.a = 2;
                }
                viewPager2.post(new sih(wihVar.g.i, aVar));
                break;
            case 1:
                TextView textView = (TextView) this.c;
                String str = (String) this.d;
                VkOnboardingHighlighter vkOnboardingHighlighter = (VkOnboardingHighlighter) this.e;
                textView.setText(str);
                VkOnboardingHighlighter.e(vkOnboardingHighlighter, false, null, true, null, 8);
                break;
            default:
                new vs8().a(((y7w0) this.c).c, (VmojiPurchaseProductResponseDto) this.d, (puv0) this.e);
                break;
        }
    }
}
