package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.api.base.VkPaginationList;
import com.vk.attachpicker.base.BaseAttachPickerFragment;
import com.vk.auth.verification.base.states.MethodSelectorCodeState;
import com.vk.catalog.mvi.block.video.impl.p002short.ClipListView;
import com.vk.catalog2.feature.music.holders.MusicTrackCellVh;
import com.vk.clips.internal.nps.api.model.QuestionsTexts;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.core.preference.Preference;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.music.audiobook.AudioBookChapter;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.ecomm.cart.impl.common.models.geo.Coordinates;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.imageloader.view.VKCircleImageView;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlaySource;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vk.newsfeed.api.friendslists.FriendsListParams;
import com.vk.newsfeed.impl.posting.attachments.PostingAttachLocationFragment;
import com.vk.newsfeed.posting.impl.domain.model.LocalMediaEntry;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerSelectedItem;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.domain.model.e;
import com.vk.notifications.CommunityGroupedNotificationsFragment;
import com.vk.notifications.settings.CommunityNotificationSettingsFragment;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.search.params.api.VkGroupsSearchParams;
import com.vk.search.params.api.domain.model.SearchLocation;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeClipViewerItem;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.common.js.bridge.api.events.GyroscopeChanged$Response;
import com.vkontakte.android.R;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import xsna.bzd0;
import xsna.dvv;
import xsna.e890;
import xsna.fzd0;
import xsna.j0j;
import xsna.kyl;
import xsna.npf;
import xsna.px9;
import xsna.rv9;
import xsna.t2x;
import xsna.uuf;
import xsna.wk50;
import xsna.xn50;
import xsna.ytm;
import xsna.yuq0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class rh4 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rh4(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c1  */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v17, types: [xsna.vj00] */
    /* JADX WARN: Type inference failed for: r5v20, types: [xsna.t2x$b] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        wo6 wo6Var;
        ClipFeedTab Ka;
        SchemeStat$TypeClipViewerItem.ScreenType b;
        SchemeStat$TypeClipViewerItem.EventType eventType;
        oj00 oj00Var;
        ImageSize Cb;
        nhr nhrVar;
        int i = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ukb ukbVar = ((sh4) obj3).b;
                UserId userId = (UserId) obj2;
                List<AudioBookChapter> list = ((AudioBook) obj).k;
                if (list == null) {
                    return s3q0.a;
                }
                for (AudioBookChapter audioBookChapter : list) {
                    Integer d = ukbVar.d(String.valueOf(userId.b), audioBookChapter.b);
                    if (d != null && d.intValue() < audioBookChapter.e) {
                        ukbVar.g(audioBookChapter.e, String.valueOf(userId.b), audioBookChapter.b, audioBookChapter.f.i());
                    }
                }
                return s3q0.a;
            case 1:
                BaseAttachPickerFragment baseAttachPickerFragment = (BaseAttachPickerFragment) obj3;
                com.vk.lists.c cVar = (com.vk.lists.c) obj2;
                VkPaginationList vkPaginationList = (VkPaginationList) obj;
                b34 b34Var = baseAttachPickerFragment.a0;
                if (b34Var != null) {
                    b34Var.n0(vkPaginationList.b);
                }
                b34 b34Var2 = baseAttachPickerFragment.a0;
                if (b34Var2 != null) {
                    boolean z = baseAttachPickerFragment instanceof PostingAttachLocationFragment;
                    h2u h2uVar = b34Var2.k;
                    b34Var2.n = !z;
                    if (z) {
                        b34Var2.T0(h2uVar);
                    } else {
                        b34Var2.K0(h2uVar);
                    }
                }
                cVar.l(vkPaginationList.c);
                return s3q0.a;
            case 2:
                zo6 zo6Var = (zo6) obj3;
                WebApiApplication webApiApplication = (WebApiApplication) obj2;
                String str = (String) obj;
                lgn0 lgn0Var = zo6Var.b;
                if (!(lgn0Var != null ? lgn0Var.a() : false) && (wo6Var = zo6Var.d) != null) {
                    SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                    SuperappUiRouterBridge superappUiRouterBridge2 = superappUiRouterBridge != null ? superappUiRouterBridge : null;
                    Context context = wo6Var.m;
                    SuperappUiRouterBridge.b.b(superappUiRouterBridge2, context == null ? null : context, webApiApplication, new nex0(str, str), null, null, null, null, 248);
                }
                return s3q0.a;
            case 3:
                kt8 kt8Var = (kt8) obj3;
                ((kcl0) kt8Var.k.b).V0((StickerStockItem) obj2, true, new c80(r4 ? 1 : 0));
                is8 is8Var = kt8Var.i;
                if (is8Var != null) {
                    is8Var.c();
                }
                return s3q0.a;
            case 4:
                ((ha) obj3).invoke(bzl0.a(((ak9) obj2).e, (Bitmap) obj));
                return s3q0.a;
            case 5:
                return laa.s((laa) obj3, (String) obj2, null, (List) obj, null, null, null, null, null, null, IronSourceError.ERROR_CODE_INVALID_KEY_VALUE);
            case 6:
                s2u0 s2u0Var = (s2u0) obj;
                ((izs) obj3).invoke(new ClipListView.b.c(((ClipListView.c) obj2).b, s2u0Var.a, s2u0Var.b));
                return s3q0.a;
            case 7:
                ClipsWrapperFragment clipsWrapperFragment = (ClipsWrapperFragment) obj3;
                int intValue = ((Integer) obj).intValue();
                ffe ffeVar = (ffe) clipsWrapperFragment.j0.getValue();
                wrf wrfVar = (wrf) j5g.b0(intValue, ((uuf.j) obj2).getItems().getItems());
                ClipFeedTab c = wrfVar != null ? wrfVar.c() : null;
                d9e d9eVar = (d9e) ffeVar.a.invoke();
                if (d9eVar != null && (Ka = d9eVar.Ka()) != null && (b = fzc.b(Ka)) != null) {
                    if (c instanceof ClipFeedTab.ClipsFromShopsSource.Top) {
                        eventType = SchemeStat$TypeClipViewerItem.EventType.CLICK_TAB_SHOPS;
                    } else if (c instanceof ClipFeedTab.ClipsFromTrendsSource.Top) {
                        eventType = SchemeStat$TypeClipViewerItem.EventType.CLICK_TAB_TRENDS;
                    } else if (c instanceof ClipFeedTab.UserSubscriptions) {
                        eventType = SchemeStat$TypeClipViewerItem.EventType.CLICK_TAB_SUBSCRIPTIONS;
                    } else if (c instanceof ClipFeedTab.TopVideo) {
                        eventType = SchemeStat$TypeClipViewerItem.EventType.CLICK_TAB_RECOMMENDATIONS;
                    }
                    SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), new SchemeStat$TypeClipViewerItem(b, eventType, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741820, null), 2);
                    UiTracker uiTracker = UiTracker.a;
                    MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
                    uzp0 uzp0Var = UiTracker.h;
                    uzp0Var.getClass();
                    new bjc(c2, b2, uzp0Var.a).q();
                }
                xn50.a.c(clipsWrapperFragment, new npf.b(intValue));
                return s3q0.a;
            case 8:
                ((wk50.a) obj3).b(new px9.l(((rv9.a.f) obj2).b));
                return s3q0.a;
            case 9:
                CommunityNotificationSettingsFragment.e.a aVar = (CommunityNotificationSettingsFragment.e.a) obj3;
                CommunityNotificationSettingsFragment communityNotificationSettingsFragment = (CommunityNotificationSettingsFragment) obj2;
                q3j0 q3j0Var = ((CommunityNotificationSettingsFragment.e) aVar.m).g;
                String str2 = q3j0Var.b;
                if (str2 != null) {
                    long j = communityNotificationSettingsFragment.T;
                    boolean z2 = !q3j0Var.d;
                    if (str2.equals("messages_push")) {
                        gmu.a(j, z2, true);
                    } else if (str2.equals("group_msg_notify")) {
                        gmu.a(j, z2, false);
                    }
                }
                ((CommunityNotificationSettingsFragment.e) aVar.m).g.d = !r1.d;
                int i2 = CommunityNotificationSettingsFragment.b0;
                ((rj70) communityNotificationSettingsFragment.S.getValue()).b();
                int i3 = CommunityGroupedNotificationsFragment.i0;
                ysg0.b.a(new CommunityGroupedNotificationsFragment.b(communityNotificationSettingsFragment.T));
                return s3q0.a;
            case 10:
                wh50 wh50Var = (wh50) obj3;
                kyl.c cVar2 = (kyl.c) obj2;
                oj00 oj00Var2 = (oj00) wh50Var.getValue();
                if (!epx.f(oj00Var2 != null ? sua.v(oj00Var2.h()) : null, cVar2.a) && (oj00Var = (oj00) wh50Var.getValue()) != null) {
                    gk9 gk9Var = cVar2.a;
                    ?? r4 = ofx.a;
                    (r4 != 0 ? r4 : null).getClass();
                    Coordinates coordinates = gk9Var.a;
                    double d2 = coordinates.b;
                    double d3 = coordinates.c;
                    float f = gk9Var.b.a;
                    CameraPosition.a i4 = CameraPosition.i();
                    i4.b(new LatLng(d2, d3));
                    i4.c(f);
                    oj00Var.c(new tar0(xa4.C(i4.a())));
                }
                return s3q0.a;
            case 11:
                w2w w2wVar = (w2w) obj3;
                w2wVar.I0().b().c().k.f(((dqm) obj2).c);
                w2wVar.I0().b().c().b.I0().k().putInt("folders_counters_phase", cq.a(w2wVar));
                return s3q0.a;
            case 12:
                int size = ((oum) obj).a.size() - ((ytm.i) ((ytm) obj3)).b;
                esm esmVar = ((psm) obj2).h;
                if (size <= esmVar.o()) {
                    esmVar.m().a(esmVar.o());
                }
                return s3q0.a;
            case 13:
                ((eqo) obj3).d((hqo) obj2);
                return s3q0.a;
            case 14:
                VkGroupsSearchParams vkGroupsSearchParams = (VkGroupsSearchParams) obj3;
                VkGroupsSearchParams vkGroupsSearchParams2 = (VkGroupsSearchParams) obj2;
                xwz xwzVar = (xwz) obj;
                VkGroupsSearchParams.SortType sortType = vkGroupsSearchParams.d;
                if (sortType != VkGroupsSearchParams.n) {
                    int j2 = sortType.j();
                    xwzVar.getClass();
                    xwzVar.b(xwz.e(j2), true);
                }
                VkGroupsSearchParams.CommunityType communityType = vkGroupsSearchParams.c;
                if (communityType != VkGroupsSearchParams.m) {
                    int j3 = communityType.j();
                    xwzVar.getClass();
                    xwzVar.b(xwz.e(j3), true);
                }
                SearchLocation searchLocation = vkGroupsSearchParams2.f;
                if (searchLocation instanceof SearchLocation.City) {
                    exz exzVar = new exz(((SearchLocation.City) searchLocation).b.c);
                    xwzVar.getClass();
                    xwzVar.b(xwz.c(exzVar), false);
                } else if (searchLocation instanceof SearchLocation.CurrentLocation) {
                    xwzVar.b(new exz(((SearchLocation.CurrentLocation) searchLocation).b), false);
                } else {
                    if (searchLocation != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    b920.l(xwzVar, vkGroupsSearchParams2);
                    s3q0 s3q0Var = s3q0.a;
                }
                if (!vkGroupsSearchParams.e) {
                    xwzVar.getClass();
                    xwzVar.b(xwz.e(R.string.vk_discover_search_only_future_disabled), true);
                }
                return s3q0.a;
            case 15:
                dvv dvvVar = (dvv) obj3;
                dvvVar.d.invoke(dvvVar.c, ((wuv) dvvVar.e.get(((dvv.a) obj2).getAdapterPosition())).b);
                return s3q0.a;
            case 16:
                ((wh50) obj3).setValue(((Boolean) obj).booleanValue() ? (t2x.b) obj2 : null);
                return s3q0.a;
            case 17:
                String str3 = (String) obj2;
                vkr0 vkr0Var = (vkr0) obj;
                ((i4y) obj3).b.a.n(new JsMethod("VKWebAppGyroscopeChanged"), new GyroscopeChanged$Response(null, new GyroscopeChanged$Response.Data(vkr0Var.a, vkr0Var.c, vkr0Var.b, str3), str3, 1, null));
                return s3q0.a;
            case 18:
                Image image = (Image) obj2;
                ((VKCircleImageView) obj3).o0((image == null || (Cb = image.Cb(((VKCircleImageView) obj).getWidth(), true, false)) == null) ? null : Cb.d.d, null);
                return s3q0.a;
            case 19:
                ((io10) obj3).b.a(((MethodSelectorCodeState.MaxMessenger) obj2).e, false);
                return s3q0.a;
            case 20:
                st10 st10Var = (st10) obj2;
                LocalMediaEntry localMediaEntry = (LocalMediaEntry) obj;
                st10Var.e(((PostingState.Editing) ((PostingState) obj3)).c.b.b.b, localMediaEntry);
                st10Var.a.a(new e.b.h.c(new MediaPickerSelectedItem.LocalMedia(localMediaEntry), true));
                return s3q0.a;
            case 21:
                Set<String> set = MusicTrackCellVh.A;
                ((MusicTrackCellVh) obj3).g((View) obj2);
                return s3q0.a;
            case 22:
                List<String> list2 = (List) obj;
                ((e890.a) obj3).d.onNext(list2);
                HashMap<String, e890.a> hashMap = e890.a;
                Preference.K(j5g.S0(list2), "package_verifier", go9.b("package_cert_hashes_", (String) obj2));
                return s3q0.a;
            case 23:
                exd0 exd0Var = (exd0) obj3;
                String str4 = (String) obj2;
                if (((Boolean) obj).booleanValue()) {
                    exd0Var.i = true;
                    ((FriendsListParams.FriendsList) exd0Var.d).c = str4;
                    exd0Var.c.jo(str4);
                }
                return s3q0.a;
            case 24:
                bzd0.b bVar = (bzd0.b) obj;
                hzd0.d((Context) obj3, Uri.fromFile(bVar.b).toString(), bVar.a.b, (fzd0.b) obj2);
                return s3q0.a;
            case 25:
                aqe0 aqe0Var = (aqe0) obj3;
                FrameLayout frameLayout = (FrameLayout) obj2;
                int i5 = aqe0.m1;
                nf0 nf0Var = aqe0Var.k1;
                Handler handler = aqe0Var.l1;
                if (frameLayout.getChildCount() == 1) {
                    View childAt = frameLayout.getChildAt(0);
                    if (childAt instanceof nhr) {
                        nhrVar = (nhr) childAt;
                        if (nhrVar == null) {
                            aqe0Var.sj("");
                            Context requireContext = aqe0Var.requireContext();
                            nhr nhrVar2 = new nhr(requireContext, null, 0);
                            LayoutInflater.from(requireContext).inflate(R.layout.internal_nps_finished_questionnaire, (ViewGroup) nhrVar2, true);
                            QuestionsTexts questionsTexts = (QuestionsTexts) aqe0Var.requireArguments().getParcelable("LOCALES_KEY");
                            ((VkText) nhrVar2.findViewById(R.id.internal_nps_finished_title)).setText(questionsTexts.d);
                            ((VkText) nhrVar2.findViewById(R.id.internal_nps_finished_subtitle)).setText(questionsTexts.e);
                            float f2 = 48;
                            f4m.y(iah0.a(f2), nhrVar2);
                            f4m.v(iah0.a(f2), nhrVar2);
                            p2u0.a(frameLayout, nhrVar2);
                        }
                        handler.removeCallbacks(nf0Var);
                        handler.postDelayed(nf0Var, 3000L);
                        return s3q0.a;
                    }
                }
                nhrVar = null;
                if (nhrVar == null) {
                }
                handler.removeCallbacks(nf0Var);
                handler.postDelayed(nf0Var, 3000L);
                return s3q0.a;
            case 26:
                ((nri0) obj3).e.invoke(new UserProfileAction.m.i(((yuq0.b) obj2).b));
                return s3q0.a;
            case 27:
                ParticipantId participantId = (ParticipantId) obj2;
                lvi0 lvi0Var = (lvi0) obj;
                s0j s0jVar = ((nvi0) obj3).f1;
                if (s0jVar != null) {
                    s0jVar.C(new j0j.f(participantId, lvi0Var.a.a));
                }
                return s3q0.a;
            case 28:
                x9j0 x9j0Var = (x9j0) obj3;
                ProfilesSimpleInfo profilesSimpleInfo = (ProfilesSimpleInfo) obj2;
                Dialog dialog = (Dialog) obj;
                String d4 = x9j0Var.h.d(dialog, profilesSimpleInfo);
                ChatSettings Hb = dialog.Hb();
                return new v9j0(d4, enj.f(R.plurals.vkim_chat_settings_members_count, Hb != null ? Hb.f : 0, x9j0Var.d), dialog, profilesSimpleInfo);
            default:
                ian0 ian0Var = (ian0) obj3;
                MusicPlaybackLaunchContext musicPlaybackLaunchContext = (MusicPlaybackLaunchContext) obj2;
                List list3 = (List) obj;
                List list4 = list3;
                if (list4 != null && !list4.isEmpty()) {
                    ((u2b0) ian0Var.b.getValue()).N0(new lqk0((StartPlaySource) null, (MusicTrack) null, list3, musicPlaybackLaunchContext, 0, (ShuffleMode) null, PlayRequestTrigger.FAST_PLAY_TRACK_LIST, (AdsAudioPixelsContainer) null, 0L, 883));
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ rh4(VkGroupsSearchParams vkGroupsSearchParams, iqu iquVar, VkGroupsSearchParams vkGroupsSearchParams2) {
        this.b = 14;
        this.c = vkGroupsSearchParams;
        this.d = vkGroupsSearchParams2;
    }

    public /* synthetic */ rh4(hzd0 hzd0Var, Context context, fzd0.b bVar) {
        this.b = 24;
        this.c = context;
        this.d = bVar;
    }
}
