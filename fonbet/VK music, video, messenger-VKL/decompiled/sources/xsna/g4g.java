package xsna;

import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.feature.music.api.CatalogGetAudioSearchRequestFactory;
import com.vk.core.view.components.picture.VkImage;
import com.vk.donut.price.api.di.DonutPriceComponent;
import com.vk.newsfeed.impl.fave_feed.presentation.fragment.FaveFeedFragment;
import com.vk.newsfeed.impl.presentation.similar.presentation.fragment.DiscoverSimilarFeedFragment;
import com.vk.notifications.GroupedNotificationsFragment;
import com.vk.profile.community.impl.ui.profile.CommunityProfileFragment;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.profile.core.scheduled_clips.b;
import com.vk.profile.provider.di.ProfileFragmentProviderComponent;
import com.vk.repository.data.api.di.DataRepositoryComponent;
import com.vk.search.ui.api.di.SearchUiComponent;
import com.vk.voip.ui.groupcalls.list.ListGroupCallView;
import com.vkontakte.android.R;
import java.util.LinkedHashSet;
import java.util.Set;
import xsna.bsm;
import xsna.mdg;
import xsna.s1c0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class g4g implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g4g(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = 2;
        LinkedHashSet linkedHashSet = null;
        switch (this.b) {
            case 0:
                h4g h4gVar = (h4g) this.c;
                int i2 = h4g.g1;
                h4gVar.tn();
                return s3q0.a;
            case 1:
                return new mdg.a((mdg) this.c);
            case 2:
                c1h c1hVar = (c1h) this.c;
                ljo0 ljo0Var = (ljo0) ((zak0) c1hVar.j).getValue();
                boolean z = (ljo0Var != null ? ljo0Var.b.f : 0) > 1;
                float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (z) {
                    f = c1h.v(c1hVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.4f, 5);
                }
                return Float.valueOf(f);
            case 3:
                return ((BridgeComponent) ((h7m) this.c).a(fpf0.a(BridgeComponent.class))).x();
            case 4:
                CommunityProfileFragment communityProfileFragment = (CommunityProfileFragment) this.c;
                int i3 = CommunityProfileFragment.k0;
                communityProfileFragment.getFeature().C(CommunityProfileAction.v.b);
                return s3q0.a;
            case 5:
                return ((DataRepositoryComponent) m7m.d(((vvh) this.c).c).a(fpf0.a(DataRepositoryComponent.class))).C();
            case 6:
                com.vk.profile.core.scheduled_clips.h hVar = (com.vk.profile.core.scheduled_clips.h) this.c;
                hVar.d.invoke(new b.a(hVar.c, true));
                return s3q0.a;
            case 7:
                q5i q5iVar = (q5i) this.c;
                q5iVar.U6(q5iVar.F);
                return s3q0.a;
            case 8:
                return new bsm.c((bsm) this.c);
            case 9:
                DiscoverSimilarFeedFragment discoverSimilarFeedFragment = (DiscoverSimilarFeedFragment) this.c;
                qcy<Object>[] qcyVarArr = DiscoverSimilarFeedFragment.s0;
                s1c0.a aVar = new s1c0.a();
                aVar.b = true;
                aVar.C = true;
                sf2 sf2Var = new sf2();
                sf2Var.b = discoverSimilarFeedFragment.i0.get();
                aVar.s = sf2Var.a();
                aVar.J = ((Boolean) discoverSimilarFeedFragment.Q.getValue()).booleanValue();
                return aVar.a();
            case 10:
                return ((DonutPriceComponent) ((k7m) m7m.c(((s1o) this.c).itemView)).a(fpf0.a(DonutPriceComponent.class))).kf();
            case 11:
                return ((SearchUiComponent) ((jip) this.c).b.a(fpf0.a(SearchUiComponent.class))).W(CatalogGetAudioSearchRequestFactory.y);
            case 12:
                return Integer.valueOf(((pop) this.c).getResources().getDimensionPixelSize(R.dimen.vk_auth_logo_size_mini));
            case 13:
                View view = (View) this.c;
                kpp kppVar = opp.T;
                return new RectF(f4m.e(view));
            case 14:
                return new oqp((mqp) this.c);
            case 15:
                return ((lzp) this.c).e;
            case 16:
                FaveFeedFragment faveFeedFragment = (FaveFeedFragment) this.c;
                qcy<Object>[] qcyVarArr2 = FaveFeedFragment.s0;
                return faveFeedFragment.io();
            case 17:
                ((com.vk.newsfeed.common.recycler.holders.a) this.c).r7();
                return s3q0.a;
            case 18:
                f6s f6sVar = (f6s) this.c;
                q6s j7 = f6sVar.j7();
                if (j7 != null) {
                    f6sVar.p7(j7, new ks2(12, f6sVar, j7)).invoke();
                }
                return s3q0.a;
            case 19:
                ((s3t) this.c).e.invoke();
                return s3q0.a;
            case 20:
                com.vk.permission.a aVar2 = (com.vk.permission.a) this.c;
                int i4 = com.vk.permission.a.c;
                aVar2.dismiss();
                return s3q0.a;
            case 21:
                return ((y4u) this.c).e.C6();
            case 22:
                ((g8u) this.c).n.d();
                return s3q0.a;
            case 23:
                GroupedNotificationsFragment groupedNotificationsFragment = (GroupedNotificationsFragment) this.c;
                int i5 = GroupedNotificationsFragment.f0;
                return (ProfileFragmentProviderComponent) ((k7m) m7m.f(groupedNotificationsFragment)).a(fpf0.a(ProfileFragmentProviderComponent.class));
            case 24:
                return ((c8v) this.c).k1();
            case 25:
                mbx mbxVar = (mbx) this.c;
                FrameLayout frameLayout = new FrameLayout(mbxVar.a.getCtx());
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                bwt0.i0(frameLayout, new v4w(mbxVar, i));
                frameLayout.addView((VkImage) mbxVar.h.getValue());
                frameLayout.addView(mbxVar.a());
                return frameLayout;
            case 26:
                xwv0 xwv0Var = ((n1y) this.c).b;
                if (xwv0Var != null) {
                    return xwv0Var.E();
                }
                return null;
            case 27:
                return new pvp(((x7y) this.c).e);
            case 28:
                Set<String> set = ((f9z) this.c).e;
                if (set != null) {
                    linkedHashSet = new LinkedHashSet(set.size() * 2);
                    for (String str : set) {
                        linkedHashSet.add(str);
                        linkedHashSet.add("www." + str);
                    }
                }
                return linkedHashSet;
            default:
                return ((ListGroupCallView) this.c).getPrimaryId();
        }
    }
}
