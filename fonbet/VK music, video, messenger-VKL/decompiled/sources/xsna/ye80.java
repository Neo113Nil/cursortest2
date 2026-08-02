package xsna;

import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.di.AttachPickerComponent;
import com.vk.catalog2.common.ui.mvp.auto.VKAndroidAutoCatalogMediaService;
import com.vk.core.apps.BuildInfo;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.datepicker.api.di.DatePickerComponent;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.moderation.api.restrictions.ModerationRestriction;
import com.vk.im.engine.models.SearchMode;
import com.vk.im.ui.views.online.OnlineView;
import com.vk.music.offline.api.di.OfflineAudioComponent;
import com.vk.music.player.api.di.PlayerUIComponent;
import com.vk.music.stickyplayer.StickyMusicPlayerBottomSheet;
import com.vk.narratives.api.di.NarrativeComponent;
import com.vk.newsfeed.impl.posting.attachments.PostingAttachActivity;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.onboardingpromo.impl.di.OnboardingPromoComponentImpl;
import com.vk.photos.root.di.PhotosComponent;
import com.vk.profile.user.impl.ui.UserProfileFragment;
import com.vk.repository.internal.repos.stickers.suggests.VmojiPromoInSuggestsRepositoryImpl;
import com.vk.sharing.api.di.SharingComponent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.story.impl.di.StoriesComponentImpl;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.storycamera.picker.ui.StoryMediaPickerFragment;
import com.vkontakte.android.R;
import java.util.Map;
import xsna.bdc0;
import xsna.v6j0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ye80 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ye80(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.util.AttributeSet] */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // xsna.gzs
    public final Object invoke() {
        gzs<s3q0> gzsVar;
        UserId userId;
        int i = this.b;
        boolean z = false;
        z = false;
        z = false;
        r2 = null;
        ModerationRestriction moderationRestriction = null;
        Object obj = this.c;
        switch (i) {
            case 0:
                qcy<Object>[] qcyVarArr = OnboardingPromoComponentImpl.c;
                return new og80(((OnboardingPromoComponentImpl) obj).b());
            case 1:
                ua90 ua90Var = (ua90) obj;
                boolean z2 = ua90Var.e;
                mkr0 mkr0Var = ua90Var.b;
                return new rwh0(ua90Var.a.getString(z2 ? R.string.vkim_search_tab_title_communities : R.string.vkim_search_tab_title_channels), new xng(mkr0Var), SearchMode.CHANNELS, MobileOfficialAppsCoreNavStat$EventScreen.IM_SEARCH_CHANNELS, 700L, new rx30(mkr0Var, ua90Var.c, ua90Var.f), 0, PsExtractor.AUDIO_STREAM);
            case 2:
                return (OnlineView) ((dp90) obj).b().findViewById(R.id.past_call_details_header_online);
            case 3:
                g1k0 g1k0Var = (g1k0) obj;
                float floatValue = g1k0Var.b.getStart().floatValue();
                float floatValue2 = g1k0Var.b.c().floatValue() - floatValue;
                return Float.valueOf(swe0.f(floatValue2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0.0f : (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - floatValue) / floatValue2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
            case 4:
                return Float.valueOf(e3m.a(R.dimen.vkim_msg_part_playlist_lowest_thumb_corners_enlarged, (((heb0) obj).a != null ? r0 : 0).getContext()));
            case 5:
                return (g3f0) obj;
            case 6:
                int i2 = PostingAttachActivity.X;
                return ((AttachPickerComponent) ((k7m) m7m.f((PostingAttachActivity) obj)).a(fpf0.a(AttachPickerComponent.class))).J4();
            case 7:
                sk3<bdc0.a> sk3Var = ((bdc0) obj).d;
                while (!sk3Var.isEmpty()) {
                    bdc0.a m = sk3Var.m();
                    if (m != null) {
                        m.a().dismiss();
                    }
                }
                sk3Var.clear();
                return s3q0.a;
            case 8:
                ((enc0) obj).U.invoke(PostingAction.Navigation.Back.b);
                return s3q0.a;
            case 9:
                ctd0 ctd0Var = (ctd0) obj;
                c530 i3 = ctd0Var.i();
                c530 i4 = ctd0Var.i();
                q530 q530Var = ctd0Var.a;
                if (q530Var != null && i4 != null) {
                    moderationRestriction = q530Var.a(i4);
                }
                if (i3 != null && moderationRestriction != null && q530Var != null) {
                    z = q530Var.b(i3, moderationRestriction);
                }
                if (!z && (gzsVar = ctd0Var.e) != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 10:
                Object systemService = ((i9e0) obj).b.getSystemService("sensor");
                if (systemService instanceof SensorManager) {
                    return (SensorManager) systemService;
                }
                return null;
            case 11:
                Map map = (Map) obj;
                return BuildInfo.m() ? j5g.g0(map.entrySet(), null, "{", "}", 0, new rlh(new String[]{"body"}, 20), 25) : map.toString();
            case 12:
                ((k9b) obj).invoke();
                return s3q0.a;
            case 13:
                return ((NarrativeComponent) ((k7m) m7m.f((s8i0) obj)).a(fpf0.a(NarrativeComponent.class))).Ic();
            case 14:
                return ((DatePickerComponent) ((k7m) m7m.f((f3j0) obj)).mo408a(fpf0.a(DatePickerComponent.class))).u0();
            case 15:
                v6j0.c cVar = v6j0.p1;
                return (SharingComponent) m7m.d((v6j0) obj).a(fpf0.a(SharingComponent.class));
            case 16:
                return Boolean.valueOf(((g7s0) obj).J().o());
            case 17:
                return new com.vk.im.ui.components.msg_search.vc.d(((LayoutInflater) obj).getContext());
            case 18:
                return com.vk.clips.sdk.shared.item.static_ads.c.k((com.vk.clips.sdk.shared.item.static_ads.c) obj);
            case 19:
                ncl0 ncl0Var = (ncl0) obj;
                return new pdl0(ncl0Var.f, ncl0Var.h, ncl0Var.o, ncl0Var.p, ncl0Var.k, (VmojiPromoInSuggestsRepositoryImpl) ncl0Var.i.getValue(), (bcl0) ncl0Var.l.getValue(), (myb0) ncl0Var.j.getValue(), (xi30) ncl0Var.n.getValue(), ncl0Var.d);
            case 20:
                int i5 = StickyMusicPlayerBottomSheet.c0;
                return ((PlayerUIComponent) ((k7m) m7m.c((StickyMusicPlayerBottomSheet) obj)).a(fpf0.a(PlayerUIComponent.class))).J9();
            case 21:
                ((hll0) obj).d = null;
                return s3q0.a;
            case 22:
                ((wh50) obj).setValue(Boolean.TRUE);
                return s3q0.a;
            case 23:
                qcy<Object>[] qcyVarArr2 = StoriesComponentImpl.N;
                return ((StoriesComponentImpl) obj).w();
            case 24:
                StoryMediaPickerFragment storyMediaPickerFragment = (StoryMediaPickerFragment) obj;
                int i6 = StoryMediaPickerFragment.d0;
                VkTopBar vkTopBar = new VkTopBar(storyMediaPickerFragment.ho(), r2, 6, z ? 1 : 0);
                vkTopBar.setBefore(new VkTopBar.c.d(null, new d3j0(storyMediaPickerFragment, 5), null, com.vk.core.compose.component.semantics.b.a(null, new rj60(vkTopBar, 28), 3), 5));
                vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(tq.h(tlo0.Companion, R.string.story_catalog_ideas), null, null, null, null, 30), null, 0 == true ? 1 : 0, com.vk.core.compose.component.semantics.b.a(null, new gj80(storyMediaPickerFragment, 19), 3), 6));
                return vkTopBar;
            case 25:
                ((n3n0) obj).a.f();
                return s3q0.a;
            case 26:
                return ((pzp0) obj).m;
            case 27:
                UserProfileFragment userProfileFragment = (UserProfileFragment) obj;
                qfa0 F4 = ((PhotosComponent) userProfileFragment.b0.getValue()).F4();
                Bundle arguments = userProfileFragment.getArguments();
                if (arguments == null || (userId = (UserId) arguments.getParcelable("id")) == null) {
                    userId = UserId.d;
                }
                return F4.c(userId);
            case 28:
                return (StoryViewerComponent) ((k7m) m7m.f((mxq0) obj)).a(fpf0.a(StoryViewerComponent.class));
            default:
                boolean z3 = VKAndroidAutoCatalogMediaService.o;
                return ((OfflineAudioComponent) ((k7m) m7m.b((VKAndroidAutoCatalogMediaService) obj)).a(fpf0.a(OfflineAudioComponent.class))).Ja();
        }
    }

    public /* synthetic */ ye80(a4b0 a4b0Var, g1k0 g1k0Var) {
        this.b = 3;
        this.c = g1k0Var;
    }

    public /* synthetic */ ye80(v1f0 v1f0Var, FrameLayout frameLayout, k9b k9bVar, z1f0 z1f0Var) {
        this.b = 12;
        this.c = k9bVar;
    }
}
