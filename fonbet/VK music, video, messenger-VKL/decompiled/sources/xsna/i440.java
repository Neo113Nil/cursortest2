package xsna;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.unity3d.ads.core.domain.events.LifecycleEventObserver;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.di.ServicesRegistry;
import com.vk.attachpicker.PhotoVideoAttachActivity;
import com.vk.catalog2.feature.music.search.history.di.SearchHistoryProviderComponent;
import com.vk.catalog2.feature.music.ui.holder.MusicCatalogRootVh;
import com.vk.core.tool.view.vkblur.VkBlurView;
import com.vk.di.scope.FeatureScopesKt$createFeatureScope$scope$1;
import com.vk.donut.video.api.di.DonutVideoComponent;
import com.vk.dto.ads.PixelStats;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoryEntryExtended;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.ecomm.orders.impl.common.model.OrderPaymentResult;
import com.vk.ecomm.orders.impl.orderlist.presentation.mvi.OrderListAction;
import com.vk.friends.impl.friends.presentation.fragment.PaginatedFriendsListFragment;
import com.vk.friends.requests.api.di.FriendsRequestsComponent;
import com.vk.friends.requests.api.di.ScreenType;
import com.vk.libvideo.api.di.VideoPlaylistReversionComponent;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetComponent;
import com.vk.music.model.di.AudioModelsComponent;
import com.vk.music.playerservice.impl.PlayerService;
import com.vk.music.search.history.di.SearchHistoryScope;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.common.views.clips.NewsFeedControlsLayout;
import com.vk.newsfeed.impl.newsfeed_post.presentation.fragment.PostFragment;
import com.vk.newsfeed.impl.posting.PostingFragment;
import com.vk.newsfeed.impl.presentation.from_notifications.presentation.fragment.PostsFromNotificationsFragment;
import com.vk.poll.fragments.PollEditorFragment;
import com.vk.profile.design.view.fab.ProfileFabView;
import com.vk.search.ui.impl.catalog.roots.MusicSearchCatalogRootVh;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioSnippetItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.toggle.data.FriendCellButtonType;
import com.vk.toggle.data.FriendCellLayout;
import com.vk.video.playlist.playlistscreen.PlaylistScreenArgs;
import com.vk.video.playlist.playlistscreen.di.PlaylistScreenFragmentInternalComponent;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import com.vk.video.ui.upload.impl.settings.presentation.fragment.SettingsArguments;
import com.vk.video.ui.upload.impl.settings.presentation.fragment.SettingsFragment;
import com.vkontakte.android.R;
import java.util.UUID;
import kotlin.LazyThreadSafetyMode;
import xsna.h7u0;
import xsna.nnd0;
import xsna.zxd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class i440 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i440(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v85, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        l7m c;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        String string;
        PublishState.Edit j;
        LifecycleEventObserver initialize$lambda$220$lambda$148;
        Object obj;
        Object parcelable;
        int i = this.b;
        int i2 = 10;
        int i3 = 7;
        boolean z = true;
        boolean z2 = false;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                StoryEntryExtended storyEntryExtended = ((u440) obj2).k.f;
                if (storyEntryExtended != null) {
                    return storyEntryExtended.b;
                }
                return null;
            case 1:
                String str = ((MusicCatalogRootVh) obj2).B.r;
                if (epx.f(str, "")) {
                    return null;
                }
                return str;
            case 2:
                l7m f = m7m.f((MusicSearchCatalogRootVh) obj2);
                bpn0 bpn0Var = o25.a;
                UserId c2 = ((b25) (bpn0Var != null ? bpn0Var : null).getValue()).c();
                uuh0 uuh0Var = new uuh0(0);
                ewy ewyVar = ((SearchHistoryProviderComponent) ((k7m) f).d(new FeatureScopesKt$createFeatureScope$scope$1(new SearchHistoryScope(c2, uuh0Var), new rxh0(c2, uuh0Var), fpf0.a(SearchHistoryProviderComponent.class), new sc8(uuh0Var, 3))).b(fpf0.a(SearchHistoryProviderComponent.class), new fvh0(uuh0Var, com.vk.toggle.d.K()))).c;
                qcy<Object> qcyVar = SearchHistoryProviderComponent.d[0];
                return (yp70) ewyVar.c();
            case 3:
                rbk0 rbk0Var = ((l650) obj2).i;
                rbk0Var.b.q0(CommonAudioStat$TypeAudioSnippetItem.EventSubtype.GOTO_TRACK, rbk0Var.b());
                return s3q0.a;
            case 4:
                ((o660) obj2).b.invoke(zxd0.m.a);
                return s3q0.a;
            case 5:
                int i4 = NewsFeedControlsLayout.D;
                return (VkBlurView) ((NewsFeedControlsLayout) obj2).findViewById(R.id.feed_carousel_product_sound_control_blur);
            case 6:
                return (MarketComponent) ((mo60) obj2).c().a(fpf0.a(MarketComponent.class));
            case 7:
                View view = (View) obj2;
                if (view == null || (c = m7m.c(view)) == null) {
                    return null;
                }
                DonutVideoComponent donutVideoComponent = (DonutVideoComponent) ((k7m) c).a(fpf0.a(DonutVideoComponent.class));
                if (donutVideoComponent != null) {
                    return donutVideoComponent.J();
                }
                return null;
            case 8:
                b2r b2rVar = ((a880) obj2).h;
                if (b2rVar != null) {
                    return b2rVar.b.getContext();
                }
                return null;
            case 9:
                ((hv80) obj2).a.invoke(new OrderListAction.i(OrderPaymentResult.Failed));
                return s3q0.a;
            case 10:
                PaginatedFriendsListFragment paginatedFriendsListFragment = (PaginatedFriendsListFragment) obj2;
                int i5 = PaginatedFriendsListFragment.p0;
                Bundle arguments = paginatedFriendsListFragment.getArguments();
                if (arguments == null || (string = arguments.getString("event_screen")) == null || (mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.valueOf(string)) == null) {
                    mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.NOWHERE;
                }
                Bundle arguments2 = paginatedFriendsListFragment.getArguments();
                return FriendsRequestsComponent.K5((FriendsRequestsComponent) m7m.d(paginatedFriendsListFragment).mo408a(fpf0.a(FriendsRequestsComponent.class)), new nss(arguments2 != null ? arguments2.getString("referrer") : null, mobileOfficialAppsCoreNavStat$EventScreen, new cis(true, FriendCellLayout.THREE_LINES_COMPACT, FriendCellButtonType.IMAGES, false), true), new njw(new f550(paginatedFriendsListFragment, i2), new xht(18), new hj60(paginatedFriendsListFragment, 5)), null, paginatedFriendsListFragment.kn(), paginatedFriendsListFragment.j0, null, ScreenType.FRIENDS_LIST, 36);
            case 11:
                PhotoVideoAttachActivity photoVideoAttachActivity = (PhotoVideoAttachActivity) obj2;
                Intent w = photoVideoAttachActivity.v.w();
                w.putExtra("FROM_MULTISELECT_MODE_KEY", true);
                photoVideoAttachActivity.V2(w);
                return s3q0.a;
            case 12:
                return UUID.nameUUIDFromBytes(((PixelStats) obj2).b.getBytes(emb.b));
            case 13:
                int i6 = PlayerService.t;
                return ((AudioModelsComponent) ((k7m) m7m.b((PlayerService) obj2)).a(fpf0.a(AudioModelsComponent.class))).r();
            case 14:
                PlaylistScreenFragmentInternalComponent playlistScreenFragmentInternalComponent = (PlaylistScreenFragmentInternalComponent) obj2;
                PlaylistScreenFragmentInternalComponent.a aVar = PlaylistScreenFragmentInternalComponent.x;
                cea Ef = playlistScreenFragmentInternalComponent.Ef();
                nwy nwyVar = playlistScreenFragmentInternalComponent.u;
                qcy<Object>[] qcyVarArr = PlaylistScreenFragmentInternalComponent.y;
                qcy<Object> qcyVar2 = qcyVarArr[11];
                dga g = Ef.g((tda) nwyVar.c());
                PlaylistScreenArgs playlistScreenArgs = playlistScreenFragmentInternalComponent.a.a;
                int i7 = playlistScreenArgs.b;
                VideoBottomSheetComponent videoBottomSheetComponent = playlistScreenFragmentInternalComponent.f;
                UserId userId = playlistScreenArgs.c;
                nwy nwyVar2 = playlistScreenFragmentInternalComponent.t;
                qcy<Object> qcyVar3 = qcyVarArr[10];
                com.vk.video.kidsprofile.restricteduseractions.a aVar2 = (com.vk.video.kidsprofile.restricteduseractions.a) nwyVar2.c();
                nwy nwyVar3 = playlistScreenFragmentInternalComponent.q;
                qcy<Object> qcyVar4 = qcyVarArr[7];
                cpu cpuVar = (cpu) nwyVar3.c();
                g7s0 Ff = playlistScreenFragmentInternalComponent.Ff();
                VideoPlaylistReversionComponent videoPlaylistReversionComponent = playlistScreenFragmentInternalComponent.i;
                nwy nwyVar4 = playlistScreenFragmentInternalComponent.v;
                qcy<Object> qcyVar5 = qcyVarArr[12];
                return new ocb0(i7, g, videoBottomSheetComponent, userId, aVar2, cpuVar, Ff, videoPlaylistReversionComponent, (s0a) nwyVar4.c());
            case 15:
                int i8 = PollEditorFragment.X;
                Bundle arguments3 = ((PollEditorFragment) obj2).getArguments();
                return arguments3 != null ? arguments3.getBoolean("shouldMeasureTechMetrics", false) : false ? new skl() : new ksm0();
            case 16:
                return (StoryViewerComponent) ((k7m) m7m.f((xzb0) obj2)).a(fpf0.a(StoryViewerComponent.class));
            case 17:
                return ((NewsFeedComponent) ((k7m) m7m.f((y1c0) obj2)).a(fpf0.a(NewsFeedComponent.class))).m6();
            case 18:
                int i9 = PostFragment.S0;
                return ((PostFragment) obj2).requireContext();
            case 19:
                PostingFragment postingFragment = (PostingFragment) obj2;
                int i10 = PostingFragment.s0;
                h7u0.a aVar3 = new h7u0.a(postingFragment.requireContext());
                aVar3.g0(R.string.confirm);
                aVar3.U(R.string.posting_confirm_publish_without_changes);
                aVar3.c0(R.string.publish_suggested, new kfc0(z2 ? 1 : 0, postingFragment));
                aVar3.W(R.string.cancel, null);
                return aVar3;
            case 20:
                return new ics0(msy.a(LazyThreadSafetyMode.NONE, new gd70((ikc0) obj2, 13)));
            case 21:
                return new nsc0(((ftc0) obj2).h.a, ur60.h);
            case 22:
                PostsFromNotificationsFragment postsFromNotificationsFragment = (PostsFromNotificationsFragment) obj2;
                qcy<Object>[] qcyVarArr2 = PostsFromNotificationsFragment.p0;
                int i11 = 15;
                return new puc0(new bi80(postsFromNotificationsFragment, i3), new b010(postsFromNotificationsFragment, 29), new kr50(postsFromNotificationsFragment, i11), new gd40(postsFromNotificationsFragment, i11));
            case 23:
                return ((NewsFeedComponent) ((rkd0) obj2).n.getValue()).w();
            case 24:
                nnd0 nnd0Var = (nnd0) obj2;
                return new qnd0(nnd0Var.C, new nnd0.a(0, nnd0Var, nnd0.class, "onShowAllClick", "onShowAllClick()V", 0), nnd0Var.E);
            case 25:
                return Boolean.valueOf(ProfileFabView.E((ProfileFabView) obj2));
            case 26:
                PublishState publishState = (PublishState) obj2;
                if (!fkq0.d(publishState.h) || (publishState.o() == null && ((j = publishState.j()) == null || !j.Z1()))) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 27:
                int i12 = yhi0.f1;
                ((yhi0) obj2).tn();
                return s3q0.a;
            case 28:
                initialize$lambda$220$lambda$148 = ServiceProvider.initialize$lambda$220$lambda$148((ServicesRegistry) obj2);
                return initialize$lambda$220$lambda$148;
            default:
                qcy<Object>[] qcyVarArr3 = SettingsFragment.Q;
                Bundle requireArguments = ((SettingsFragment) obj2).requireArguments();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = requireArguments.getParcelable("arguments", SettingsArguments.class);
                    obj = (Parcelable) parcelable;
                } else {
                    Object parcelable2 = requireArguments.getParcelable("arguments");
                    obj = (SettingsArguments) (parcelable2 instanceof SettingsArguments ? parcelable2 : null);
                }
                return (SettingsArguments) obj;
        }
    }
}
