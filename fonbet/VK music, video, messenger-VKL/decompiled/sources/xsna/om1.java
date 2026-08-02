package xsna;

import android.util.SparseArray;
import androidx.viewpager2.widget.ViewPager2;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSearchTab;
import com.vk.dto.common.data.VKList;
import com.vk.games.presentation.fragments.GamesListFragment;
import com.vk.im.ui.components.msg_view.header.MsgViewHeaderComponent;
import com.vk.newsfeed.posting.mediapicker.photovk.base.BasePhotoListFragment;
import com.vk.notifications.settings.CommunityNotificationSettingsFragment;
import com.vk.search.fragment.DiscoverSearchFragment;
import com.vk.search.fragment.DiscoverSearchTabs;
import com.vk.search.params.api.VkFeedSearchParams;
import com.vk.search.params.api.VkGroupsSearchParams;
import com.vk.search.params.api.VkMarketSearchParams;
import com.vk.search.params.api.VkPeopleSearchParams;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import xsna.el50;
import xsna.qdw;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class om1 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ om1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        int i2 = 10;
        int i3 = 2;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((on) obj2).invoke(obj);
                break;
            case 1:
                ((on) obj2).invoke(obj);
                break;
            case 2:
                int i4 = BasePhotoListFragment.l0;
                ((ym1) obj2).invoke(obj);
                break;
            case 3:
                ((fl6) obj2).k((sxp) obj);
                break;
            case 4:
                ((on) obj2).invoke(obj);
                break;
            case 5:
                ((c9b) obj2).invoke(obj);
                break;
            case 6:
                ((on) obj2).invoke(obj);
                break;
            case 7:
                ((on) obj2).invoke(obj);
                break;
            case 8:
                ((m9) obj2).invoke(obj);
                break;
            case 9:
                ((z13) obj2).invoke(obj);
                break;
            case 10:
                el50.a.b((com.vk.profile.community.impl.ui.events.e) obj2, new iie((s2h) obj, i3));
                break;
            case 11:
                int i5 = CommunityNotificationSettingsFragment.b0;
                ((on) obj2).invoke(obj);
                break;
            case 12:
                psm psmVar = (psm) obj2;
                psmVar.q(new fo6(i2, (ndw) obj, psmVar));
                break;
            case 13:
                ((dhh) obj2).invoke(obj);
                break;
            case 14:
                DiscoverSearchFragment discoverSearchFragment = (DiscoverSearchFragment) obj2;
                int i6 = DiscoverSearchFragment.s0;
                UIBlockActionOpenSearchTab.a aVar = (UIBlockActionOpenSearchTab.a) obj;
                DiscoverSearchTabs.SearchTabName.a aVar2 = DiscoverSearchTabs.SearchTabName.Companion;
                String str = aVar.a;
                aVar2.getClass();
                DiscoverSearchTabs.SearchTabName a = DiscoverSearchTabs.SearchTabName.a.a(str);
                int i7 = -1;
                int i8 = a == null ? -1 : DiscoverSearchFragment.e.$EnumSwitchMapping$0[a.ordinal()];
                if (i8 == 2) {
                    VkGroupsSearchParams vkGroupsSearchParams = discoverSearchFragment.X;
                    if (!vkGroupsSearchParams.I()) {
                        ysg0<Object> ysg0Var = ysg0.b;
                        vkGroupsSearchParams.reset();
                        ysg0Var.a(new eru0(vkGroupsSearchParams));
                    }
                } else if (i8 == 3) {
                    VkPeopleSearchParams vkPeopleSearchParams = discoverSearchFragment.W;
                    if (!vkPeopleSearchParams.I()) {
                        ysg0<Object> ysg0Var2 = ysg0.b;
                        vkPeopleSearchParams.reset();
                        ysg0Var2.a(new mru0(vkPeopleSearchParams, true));
                    }
                } else if (i8 == 6) {
                    VkFeedSearchParams vkFeedSearchParams = discoverSearchFragment.Z;
                    boolean N = drm0.N(discoverSearchFragment.i());
                    if ((!N && (vkFeedSearchParams.b != VkFeedSearchParams.SortType.RELEVANT || !vkFeedSearchParams.c)) || (N && !vkFeedSearchParams.I())) {
                        ysg0<Object> ysg0Var3 = ysg0.b;
                        vkFeedSearchParams.reset();
                        if (!N) {
                            vkFeedSearchParams.b = VkFeedSearchParams.SortType.RELEVANT;
                        }
                        ysg0Var3.a(new bru0(vkFeedSearchParams));
                    }
                } else if (i8 == 10) {
                    VkMarketSearchParams vkMarketSearchParams = discoverSearchFragment.Y;
                    if (!vkMarketSearchParams.I()) {
                        ysg0<Object> ysg0Var4 = ysg0.b;
                        vkMarketSearchParams.reset();
                        ysg0Var4.a(new jru0(vkMarketSearchParams));
                    }
                }
                if (a != null) {
                    Iterator it = ((List) discoverSearchFragment.o0.getValue()).iterator();
                    int i9 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            if (epx.f(((DiscoverSearchTabs.a) it.next()).e, aVar.a)) {
                                i7 = i9;
                            } else {
                                i9++;
                            }
                        }
                    }
                    discoverSearchFragment.l0 = Integer.valueOf(i7);
                    discoverSearchFragment.d0();
                    ViewPager2 viewPager2 = discoverSearchFragment.g0;
                    if (viewPager2 != null) {
                        viewPager2.e(i7, false);
                        break;
                    }
                }
                break;
            case 15:
                com.vk.music.fragment.impl.model.a aVar3 = (com.vk.music.fragment.impl.model.a) obj2;
                Throwable th = (Throwable) obj;
                aVar3.h = null;
                bn40.c(th, new Object[0]);
                if (th instanceof VKApiExecutionException) {
                    aVar3.y(new q9(aVar3, th));
                    break;
                }
                break;
            case 16:
                ((dhh) obj2).invoke(obj);
                break;
            case 17:
                ((anq) obj2).invoke(obj);
                break;
            case 18:
                ((dhh) obj2).invoke(obj);
                break;
            case 19:
                ((z13) obj2).invoke(obj);
                break;
            case 20:
                GamesListFragment gamesListFragment = (GamesListFragment) obj2;
                Pair pair = (Pair) obj;
                SparseArray<String> sparseArray = GamesListFragment.L0;
                gamesListFragment.getClass();
                Integer num = (Integer) pair.i();
                VKList vKList = new VKList((Collection) pair.j());
                vKList.o(num.intValue());
                gamesListFragment.zo(vKList);
                break;
            case 21:
                ((dhh) obj2).invoke(obj);
                break;
            case 22:
                ((hx3) obj2).invoke(obj);
                break;
            case 23:
                ((dhh) obj2).invoke(obj);
                break;
            case 24:
                ((dhh) obj2).invoke(obj);
                break;
            case 25:
                ((qdw.a) obj2).invoke(obj);
                break;
            case 26:
                ((z13) obj2).invoke(obj);
                break;
            case 27:
                ((ie8) obj2).invoke(obj);
                break;
            case 28:
                ((xvx) obj2).invoke(obj);
                break;
            default:
                ((MsgViewHeaderComponent.b) obj2).invoke(obj);
                break;
        }
    }
}
