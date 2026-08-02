package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.impl.DeprecatedAttachActivity;
import com.vk.attachpicker.impl.fragment.StoryFragment;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.ui.mvp.holder.group.GroupsRedesignCollectionVh;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.games.presentation.fragments.GamesCatalogSearchFragment;
import com.vk.music.player.analytics.api.di.PlayerAnalyticsComponent;
import com.vk.music.player.api.di.PlayerUIComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.presentation.newsfeed_geo.presentation.fragment.GeoPostsFragment;
import com.vk.onboardingscreens.impl.georequest.presentation.fragment.GeoRequestFragment;
import com.vk.search.integration.api.di.SearchComponent;
import com.vk.search.ui.api.di.SearchUiComponent;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchGroupsCatalogRootVh;
import com.vk.stat.scheme.SchemeStat$TypeRegistrationItem;
import com.vk.superapp.miniapps.api.utils.InternalVkMiniApps;
import com.vk.superapp.vksteps.VkStepsBridgeDelegatesFactory;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.friends.FriendsFragment;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Collection;
import xsna.e3m;
import xsna.g8i;
import xsna.iqh0;
import xsna.m5u;
import xsna.p4g;
import xsna.zrz;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class n1i implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n1i(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        ExposedFunction invoke$lambda$42;
        boolean z;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                o1i o1iVar = (o1i) obj;
                return c7h.a((c7h) o1iVar.s.getValue(), o1iVar.q, o1iVar.b, o1iVar.f, o1iVar.d, null, 16);
            case 1:
                return new gp80(((View) obj).getContext());
            case 2:
                DeprecatedAttachActivity deprecatedAttachActivity = (DeprecatedAttachActivity) obj;
                int i2 = DeprecatedAttachActivity.K0;
                deprecatedAttachActivity.getClass();
                StoryFragment storyFragment = new StoryFragment();
                Bundle bundle = new Bundle();
                bundle.putLong("peer_id", deprecatedAttachActivity.q0);
                storyFragment.setArguments(bundle);
                return storyFragment;
            case 3:
                rdi.y((ydo) obj, new ci3(26));
                return s3q0.a;
            case 4:
                Long l = ((com.vk.attachpicker.screen.h) obj).p.g;
                if (l != null) {
                    cpu a = xg5.a();
                    Context context = e43.a;
                    if (context == null) {
                        context = null;
                    }
                    a.s(context, new UserId(l.longValue()), (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) == 0 ? "co_owners" : null);
                } else {
                    cbn0 a2 = q7n0.a().a();
                    Context context2 = e43.a;
                    cbn0.i(a2, context2 != null ? context2 : null, InternalVkMiniApps.PROFILE_DONUT_SETTINGS.h().a, null, 12);
                }
                return s3q0.a;
            case 5:
                return new androidx.lifecycle.m((f5z) ((mqp) obj).Q.getValue(), true);
            case 6:
                Peer peer = ((d2s) obj).o.r().a.c;
                peer.getClass();
                return String.valueOf(peer.Ab(Peer.Type.GROUP));
            case 7:
                int i3 = FriendsFragment.q0;
                ((FriendsFragment) obj).getClass();
                return null;
            case 8:
                mss mssVar = (mss) obj;
                return new yp9(mssVar.a, mssVar.d, (sgg) mssVar.m.getValue(), (g2r0) mssVar.o.getValue(), (nts) mssVar.j.getValue(), (s1r0) mssVar.k.getValue(), mssVar.i, mssVar.e);
            case 9:
                lat latVar = (lat) obj;
                mzp0 mzp0Var = latVar.g;
                if (mzp0Var == null) {
                    return null;
                }
                mzp0Var.d(latVar.c());
                return s3q0.a;
            case 10:
                GamesCatalogSearchFragment gamesCatalogSearchFragment = (GamesCatalogSearchFragment) obj;
                int i4 = GamesCatalogSearchFragment.T;
                return ((SearchComponent) m7m.d(gamesCatalogSearchFragment).mo408a(fpf0.a(SearchComponent.class))).V3().a(new iqh0.a(gamesCatalogSearchFragment, gamesCatalogSearchFragment.requireContext().getString(R.string.vk_games_topbar_search_hint)));
            case 11:
                qcy<Object>[] qcyVarArr = GeoPostsFragment.q0;
                return ((GeoPostsFragment) obj).ho();
            case 12:
                int i5 = GeoRequestFragment.O;
                GeoRequestFragment.eo(SchemeStat$TypeRegistrationItem.EventType.SCREEN_PROCEED);
                ((GeoRequestFragment) obj).Mf(-1, null);
                return s3q0.a;
            case 13:
                return ((GlobalSearchGroupsCatalogRootVh) obj).u;
            case 14:
                ((z5u) obj).l.invoke(m5u.g.b);
                return s3q0.a;
            case 15:
                ((xlu) obj).d.animate().translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setInterpolator(qq2.f).setDuration(180L).withLayer().start();
                return s3q0.a;
            case 16:
                return ((BridgeComponent) ((k7m) m7m.f((GroupsRedesignCollectionVh) obj)).a(fpf0.a(BridgeComponent.class))).p().e();
            case 17:
                invoke$lambda$42 = HandleInvocationsFromAdViewer.invoke$lambda$42((HandleInvocationsFromAdViewer) obj);
                return invoke$lambda$42;
            case 18:
                StringBuilder sb = new StringBuilder("    skippedMarkers = ");
                Collection<g8i> collection = ((g8i.a) obj).f;
                p4g.a aVar = p4g.a;
                sb.append(j5g.g0(collection, StringUtils.COMMA, null, null, 0, null, 30));
                return sb.toString();
            case 19:
                return ((l4y) obj).n(VkStepsBridgeDelegatesFactory.DelegateType.GET_STEPS_HC);
            case 20:
                Object obj2 = ((r6y) obj).l;
                if (obj2 == null) {
                    return null;
                }
                while (true) {
                    z = obj2 instanceof FragmentActivity;
                    if (!z && (obj2 instanceof ContextWrapper)) {
                        obj2 = ((ContextWrapper) obj2).getBaseContext();
                    }
                }
                return (FragmentActivity) (z ? (Activity) obj2 : null);
            case 21:
                zrz.a aVar2 = (zrz.a) obj;
                return "state: " + aVar2 + " state :" + aVar2 + " checkExpirationAndLaunchNetworkLoadIfExpired restarted network load data " + aVar2.a;
            case 22:
                return ((NewsFeedComponent) ((k7m) m7m.f((com.vk.newsfeed.posting.market_picker.presentation.base.view.f) obj)).a(fpf0.a(NewsFeedComponent.class))).G2();
            case 23:
                return ((SearchUiComponent) ((k7m) m7m.f((n620) obj)).a(fpf0.a(SearchUiComponent.class))).o9();
            case 24:
                ((kz20) obj).e.Qc("episode_bottom_sheet");
                return s3q0.a;
            case 25:
                xt30 xt30Var = (xt30) obj;
                Context t = xt30Var.t();
                e3m.a aVar3 = e3m.a;
                return new wng0(t.getColor(R.color.vkim_msg_part_placeholder), e3m.d(R.attr.im_msg_part_story_corner_radius, xt30Var.t())).mutate();
            case 26:
                ((m340) obj).d(new t810(4));
                return s3q0.a;
            case 27:
                return ((MarketComponent) ((k7m) m7m.f((com.vk.catalog2.feature.music.configuration.a) obj)).a(fpf0.a(MarketComponent.class))).U1();
            case 28:
                return ((PlayerUIComponent) ((h7m) ((tfc) obj).b).a(fpf0.a(PlayerUIComponent.class))).Ne();
            default:
                return (PlayerAnalyticsComponent) m7m.e().a(fpf0.a(PlayerAnalyticsComponent.class));
        }
    }
}
