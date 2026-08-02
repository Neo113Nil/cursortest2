package xsna;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.ui.mvp.holder.video.assistant.AiAssistantCardVh;
import com.vk.clips.blacklists.api.di.ClipsBlacklistsComponent;
import com.vk.clips.design.view.timeline.VideoTimelineView;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.shared.item.ads.events.AdsItemViewEvent;
import com.vk.clips.viewer.api.di.ClipsViewerComponent;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.arguments.ClipsWrapperInputArguments;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.banner.VkBanner;
import com.vk.core.view.components.banner.VkBanner$Notification$Appearance;
import com.vk.core.view.components.banner.VkNotificationBanner;
import com.vk.core.view.components.banner.c;
import com.vk.core.view.components.text.VkText;
import com.vk.di.scope.FeatureScopesKt$createFeatureScope$scope$2;
import com.vk.di.scope.SharedScope;
import com.vk.friends.impl.friendsandfollowers.tabs.presentation.fragments.AbsFriendsAndFollowersTabFragment;
import com.vk.libvideo.design.view.actionlink.ActionLinkView;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment;
import com.vk.profile.community.suggestions.impl.ui.suggestions.a;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stories.analytics.StoryPublishEvent;
import com.vk.topics.impl.fragments.BoardTopicViewFragment;
import com.vk.video.ui.upload.api.router.AttachedClipsArguments;
import com.vk.video.ui.upload.impl.attachedclips.presentation.fragment.AttachedClipsFragment;
import com.vk.video.ui.upload.impl.attachedclips.presentation.fragment.AttachedClipsFragmentInternalComponent;
import com.vkontakte.android.R;
import java.util.List;
import java.util.regex.Pattern;
import ru.ok.android.externcalls.sdk.di.ApiModuleImpl;
import ru.ok.android.externcalls.sdk.stat.api.ApiStats;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class cb implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cb(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v63, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        ApiStats apiStats_delegate$lambda$0;
        Object obj;
        Object parcelable;
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                hks hksVar = ((AbsFriendsAndFollowersTabFragment) obj2).V;
                if (hksVar == null) {
                    return null;
                }
                return hksVar;
            case 1:
                bpn0 bpn0Var = ActionLinkView.f;
                return (AppCompatTextView) ((ActionLinkView) obj2).findViewById(R.id.video_action_link_text);
            case 2:
                return new ku0((q20) obj2);
            case 3:
                com.vk.clips.sdk.shared.item.ads.c cVar = (com.vk.clips.sdk.shared.item.ads.c) obj2;
                if (cVar.k.c().b) {
                    cVar.B.a(AdsItemViewEvent.c.b);
                }
                return s3q0.a;
            case 4:
                AiAssistantCardVh aiAssistantCardVh = (AiAssistantCardVh) obj2;
                Context context = aiAssistantCardVh.n;
                return new com.vk.catalog2.common.ui.mvp.holder.video.assistant.d(context != null ? context : null, aiAssistantCardVh.f, aiAssistantCardVh.g);
            case 5:
                apiStats_delegate$lambda$0 = ApiModuleImpl.apiStats_delegate$lambda$0((ApiModuleImpl) obj2);
                return apiStats_delegate$lambda$0;
            case 6:
                AttachedClipsFragment attachedClipsFragment = (AttachedClipsFragment) obj2;
                qcy<Object>[] qcyVarArr = AttachedClipsFragment.P;
                Bundle requireArguments = attachedClipsFragment.requireArguments();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = requireArguments.getParcelable("arguments", AttachedClipsArguments.class);
                    obj = (Parcelable) parcelable;
                } else {
                    Object parcelable2 = requireArguments.getParcelable("arguments");
                    obj = (AttachedClipsArguments) (parcelable2 instanceof AttachedClipsArguments ? parcelable2 : null);
                }
                c54 c54Var = new c54((AttachedClipsArguments) obj);
                l7m d = m7m.d(attachedClipsFragment);
                AttachedClipsFragmentInternalComponent.e.getClass();
                return (AttachedClipsFragmentInternalComponent) d.d(new FeatureScopesKt$createFeatureScope$scope$2(SharedScope.a, c54Var, fpf0.a(AttachedClipsFragmentInternalComponent.class), new com.vk.movika.tools.controls.seekbar.o(1))).a(fpf0.a(AttachedClipsFragmentInternalComponent.class));
            case 7:
                FragmentActivity activity = ((com.vk.auth.verification.base.a) ((x65) obj2)).getActivity();
                if (activity != null) {
                    activity.finish();
                }
                return s3q0.a;
            case 8:
                qr5 qr5Var = ((k86) obj2).q;
                MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = (MobileOfficialAppsCoreNavStat$EventScreen) qr5Var.b;
                if (mobileOfficialAppsCoreNavStat$EventScreen != null) {
                    ((y1q0) qr5Var.a).c(new UiTrackingScreen(mobileOfficialAppsCoreNavStat$EventScreen), false);
                }
                return s3q0.a;
            case 9:
                Pattern pattern = BoardTopicViewFragment.H0;
                h3p0.b((BoardTopicViewFragment) obj2);
                return s3q0.a;
            case 10:
                ((com.vk.cameraui.impl.a) obj2).h.d(StoryPublishEvent.CLOSE_SETTINGS);
                return s3q0.a;
            case 11:
                VkNotificationBanner vkNotificationBanner = (VkNotificationBanner) ((k4b) obj2).b.findViewById(R.id.notification_banner);
                VkBanner$Notification$Appearance vkBanner$Notification$Appearance = VkBanner$Notification$Appearance.Negative;
                vkNotificationBanner.setAppearance(vkBanner$Notification$Appearance);
                vkNotificationBanner.setLeft(new c.a(new gko(R.drawable.vk_icon_info_circle_outline_28), vkBanner$Notification$Appearance));
                vkNotificationBanner.setMiddle(new VkBanner.e(null, tq.h(tlo0.Companion, R.string.vkim_channels_monetization_notification_banner_title), null, null, null, null, 125));
                return vkNotificationBanner;
            case 12:
                z4c z4cVar = (z4c) obj2;
                return z4cVar.O(new q170(z4cVar.h));
            case 13:
                return ((agc) obj2).G.b();
            case 14:
                ClipFeedListFragment clipFeedListFragment = (ClipFeedListFragment) obj2;
                int i2 = ClipFeedListFragment.a2;
                if (clipFeedListFragment.Eo().p().a) {
                    return new p8e(clipFeedListFragment.Eo().p().b * 1000, clipFeedListFragment.Eo().p().c);
                }
                return null;
            case 15:
                return (ClipsViewerComponent) ((k7m) m7m.f((o1d) obj2)).a(fpf0.a(ClipsViewerComponent.class));
            case 16:
                ((pds) obj2).o1();
                return s3q0.a;
            case 17:
                return ((u6e) obj2).f.a.g0();
            case 18:
                return (VkText) ((xle) obj2).findViewById(R.id.clips_music_template_owner_name);
            case 19:
                roe roeVar = (roe) obj2;
                ClipsWrapperInputArguments.a aVar = ClipsWrapperInputArguments.r;
                Bundle a = roeVar.a();
                List<ClipFeedTab> c = roeVar.c();
                aVar.getClass();
                return Integer.valueOf(ClipsWrapperInputArguments.a.b(c, a));
            case 20:
                return (VideoTimelineView) ((w6f) obj2).findViewById(R.id.clips_template_editor_cropper_timeline_view);
            case 21:
                return (ClipsBlacklistsComponent) ((i8f) obj2).h.e.getValue();
            case 22:
                return new cze(((iff) obj2).k().U5());
            case 23:
                nwy nwyVar = ((ClipsViewerComponentImpl) obj2).n0;
                qcy<Object> qcyVar = ClipsViewerComponentImpl.o0[52];
                return new cpe((uoe) nwyVar.c());
            case 24:
                ClipsWrapperInputArguments.a aVar2 = ClipsWrapperInputArguments.r;
                Bundle a2 = ((ClipsWrapperInputArguments) obj2).a();
                aVar2.getClass();
                return Boolean.valueOf(a2 != null ? a2.getBoolean("ClipsWrapperFragment.key_single_template", false) : false);
            case 25:
                CommunityAddressesFragment.g gVar = ((CommunityAddressesFragment) obj2).S;
                (gVar != null ? gVar : null).a0();
                return s3q0.a;
            case 26:
                return new odh((ksd0) ((osh) obj2).k.getValue(), CommonMarketStat$TypeRefSource.COMMUNITY_PRIORITY_BLOCK_MARKET);
            case 27:
                ((com.vk.profile.community.suggestions.impl.ui.suggestions.g) obj2).c.invoke(a.b.b);
                return s3q0.a;
            case 28:
                q5i q5iVar = (q5i) obj2;
                return new feb0(q5iVar.E.a(), q5iVar.E.b());
            default:
                u1j u1jVar = (u1j) obj2;
                View findViewById = u1jVar.findViewById(R.id.close_rooms_button);
                bwt0.i0(findViewById, new zqh(u1jVar, 3));
                return findViewById;
        }
    }
}
