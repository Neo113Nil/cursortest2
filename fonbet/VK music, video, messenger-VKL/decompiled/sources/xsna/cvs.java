package xsna;

import android.content.Context;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.ads.stats.api.di.AdPixelStatsComponent;
import com.vk.bridges.ImageViewer;
import com.vk.catalog2.feature.music.holders.vkmix.MusicVkMixVh;
import com.vk.catalog2.feature.music.holders.vkmix.viewholders.MusicInteractiveTwoVkMixesVh;
import com.vk.catalog2.feature.music.ui.holder.MusicShowAllListVh;
import com.vk.clips.clipchecker.api.di.ClipCheckerComponent;
import com.vk.clips.viewer.api.di.ClipActionsComponent;
import com.vk.ecomm.market.good.linkedcontent.mvi2.ui.MarketLinkedContentFragment;
import com.vk.ecomm.moderation.impl.restrictions.di.ModerationComponentImpl;
import com.vk.im.design.view.pagination.ImPaginationSegment;
import com.vk.im.engine.di.event.ImRxEventObserverScopedComponentImpl;
import com.vk.im.engine.event.observer.rx.di.ImRxEventObserverComponent;
import com.vk.im.ui.components.msg_search.vc.HideReason;
import com.vk.music.mixsettings.MixSettingsEntity;
import com.vk.music.player.PlayState;
import com.vk.music.view.MusicRoundPlayView;
import com.vk.narratives.impl.highlights.HighlightEditFragment;
import com.vk.newsfeed.impl.presentation.newsfeed_custom.presentation.fragment.NewsfeedCustomFragment2;
import com.vk.newsfeed.impl.presentation.search.presentation.fragment.NewsfeedSearchFragment;
import com.vk.notifications.list.impl.presentation.base.fragment.grouped.GroupedNotificationListFragment;
import com.vk.notifications.list.impl.presentation.base.fragment.list.NotificationListFragment;
import com.vk.profile.community.impl.ui.members.GroupMembersFragment;
import com.vk.profile.community.members.api.CommunityMembersComponent;
import com.vk.settings.api.di.NotificationsSettingsComponent;
import com.vk.superapp.analytics.js.bridge.api.di.JsAnalyticsDelegateComponent;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import xsna.b910;
import xsna.bex0;
import xsna.h420.a;
import xsna.n810;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class cvs implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cvs(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        ExposedFunction updateTrackingToken;
        r80 a;
        int i = this.b;
        int i2 = 4;
        int i3 = 5;
        Object obj = this.c;
        switch (i) {
            case 0:
                evs evsVar = (evs) obj;
                return new bmq(evsVar, evsVar.E.M);
            case 1:
                int i4 = GroupMembersFragment.k0;
                return (CommunityMembersComponent) m7m.d((GroupMembersFragment) obj).mo408a(fpf0.a(CommunityMembersComponent.class));
            case 2:
                int i5 = GroupedNotificationListFragment.Y;
                return (ClipCheckerComponent) m7m.d((GroupedNotificationListFragment) obj).a(fpf0.a(ClipCheckerComponent.class));
            case 3:
                updateTrackingToken = CommonAdViewerExposedFunctionsKt.updateTrackingToken((AdObject) obj);
                return updateTrackingToken;
            case 4:
                int i6 = HighlightEditFragment.h0;
                return new ppl0(new HighlightEditFragment.d(2, ((HighlightEditFragment) obj).S, u4v.class, "selectStory", "selectStory(Lcom/vk/dto/stories/model/StoryEntry;Z)V", 0));
            case 5:
                return Boolean.valueOf(epx.f((String) ((ckv) obj).i().c.getValue(), HttpRequest.DEFAULT_SCHEME));
            case 6:
                ((j6k) obj).invoke();
                return s3q0.a;
            case 7:
                ImPaginationSegment imPaginationSegment = (ImPaginationSegment) obj;
                int i7 = ImPaginationSegment.A;
                return Float.valueOf(imPaginationSegment.d(5) + imPaginationSegment.w);
            case 8:
                ImRxEventObserverScopedComponentImpl imRxEventObserverScopedComponentImpl = (ImRxEventObserverScopedComponentImpl) obj;
                acw acwVar = imRxEventObserverScopedComponentImpl.a;
                return acwVar.a ? new ybw(sdy.n(acwVar)) : ((ImRxEventObserverComponent) imRxEventObserverScopedComponentImpl.b.getValue()).l();
            case 9:
                l2y l2yVar = (l2y) obj;
                return new ypt(new m2y(l2yVar, l2y.class, "presenter", "getPresenter()Lcom/vk/superapp/base/js/bridge/VkUiPresenter;", 0), l2yVar.f, l2yVar.g, l2yVar.L0(), l2yVar.w0());
            case 10:
                bex0.a.a(((d4y) obj).a, JsApiMethodType.FLASH_SET_LEVEL, VkAppsErrors.Client.NO_PERMISSIONS, null, null, null, 60);
                return s3q0.a;
            case 11:
                r6y r6yVar = (r6y) obj;
                return ((JsAnalyticsDelegateComponent) x6y.H().a(fpf0.a(JsAnalyticsDelegateComponent.class))).x4().a(r6yVar.M(), r6yVar);
            case 12:
                ((p7y) obj).a.A(JsApiMethodType.SECURE_TOKEN_GET, VkAppsErrors.Client.i(VkAppsErrors.Client.USER_DENIED, null, null, 7));
                return s3q0.a;
            case 13:
                lj50 lj50Var = (lj50) obj;
                return "[send action] New MVI action [" + fpf0.a(lj50Var.getClass()).l() + "] with data: " + lj50Var + ' ' + x100.a(null);
            case 14:
                return new AtomicReference(((xm00) obj).b.getValue());
            case 15:
                MarketLinkedContentFragment marketLinkedContentFragment = (MarketLinkedContentFragment) obj;
                qcy<Object>[] qcyVarArr = MarketLinkedContentFragment.R;
                return new hc10((g7s0) marketLinkedContentFragment.N.getValue(), (ImageViewer) marketLinkedContentFragment.O.getValue());
            case 16:
                n810 n810Var = (n810) obj;
                m810 m810Var = n810Var.n;
                izs<b910, s3q0> izsVar = n810Var.l;
                if (m810Var != null) {
                    int i8 = n810.a.$EnumSwitchMapping$0[m810Var.d.ordinal()];
                    if (i8 == 1) {
                        izsVar.invoke(b910.f.a);
                    } else {
                        if (i8 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        izsVar.invoke(b910.e.a);
                    }
                }
                return s3q0.a;
            case 17:
                com.vk.newsfeed.posting.market_picker.presentation.base.view.e.c((com.vk.newsfeed.posting.market_picker.presentation.base.view.e) obj);
                return s3q0.a;
            case 18:
                return ((h420) obj).new a();
            case 19:
                return ((gr20) obj).s;
            case 20:
                return new o430(((ModerationComponentImpl) obj).a);
            case 21:
                iy30 iy30Var = (iy30) obj;
                cw30 cw30Var = iy30Var.o;
                if (!(cw30Var != null ? cw30Var : null).d) {
                    iy30Var.b(HideReason.NAV_BACK, false);
                }
                return s3q0.a;
            case 22:
                MusicInteractiveTwoVkMixesVh musicInteractiveTwoVkMixesVh = (MusicInteractiveTwoVkMixesVh) obj;
                u2b0 u2b0Var = musicInteractiveTwoVkMixesVh.b;
                if (u2b0Var.m0() == PlayState.PLAYING) {
                    MusicRoundPlayView musicRoundPlayView = musicInteractiveTwoVkMixesVh.o;
                    if (musicRoundPlayView == null) {
                        musicRoundPlayView = null;
                    }
                    boolean a2 = musicRoundPlayView.a();
                    l4v0 l4v0Var = musicInteractiveTwoVkMixesVh.i;
                    MusicVkMixVh.h(musicInteractiveTwoVkMixesVh, a2, (l4v0Var == null || (a = l4v0Var.a()) == null) ? null : (MixSettingsEntity) a.c, null, 4);
                } else {
                    musicInteractiveTwoVkMixesVh.j(u2b0Var.m0());
                }
                return s3q0.a;
            case 23:
                MusicShowAllListVh musicShowAllListVh = (MusicShowAllListVh) obj;
                return new zd40(musicShowAllListVh.w.b.f, musicShowAllListVh.y, new v100(musicShowAllListVh, i3), i2);
            case 24:
                return ((AdPixelStatsComponent) ((k7m) m7m.f((fa60) obj)).a(fpf0.a(AdPixelStatsComponent.class))).Ed();
            case 25:
                qcy<Object>[] qcyVarArr2 = NewsfeedCustomFragment2.r0;
                return ((NewsfeedCustomFragment2) obj).io();
            case 26:
                Context context = ((rm60) obj).a.getContext();
                HashSet hashSet = iah0.a;
                return Boolean.valueOf(fnj.d(context));
            case 27:
                return (ClipActionsComponent) ((mo60) obj).c().mo408a(fpf0.a(ClipActionsComponent.class));
            case 28:
                return ((NewsfeedSearchFragment) obj).d0;
            default:
                int i9 = NotificationListFragment.a0;
                return ((NotificationsSettingsComponent) m7m.d((NotificationListFragment) obj).a(fpf0.a(NotificationsSettingsComponent.class))).a();
        }
    }

    public /* synthetic */ cvs(lj50 lj50Var, x100 x100Var) {
        this.b = 13;
        this.c = lj50Var;
    }
}
