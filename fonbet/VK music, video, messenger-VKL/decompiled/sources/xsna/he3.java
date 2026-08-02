package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.facebook.soloader.MinElf;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.antispam.ChatSpamAction;
import com.vk.api.generated.base.dto.BaseCreateResponseDto;
import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.billing.StorePurchasesManager;
import com.vk.bridges.di.BridgeComponent;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.camera.clips.core.drafts.ClipsDraftVk;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.clips.playlists.ui.picker.ClipsPlaylistPickerFragment;
import com.vk.clips.playlists.ui.picker.f;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraftCommonData;
import com.vk.clips.sdk.shared.api.analytics.SdkClipViewerClick;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.snackbar.HideReason;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.debug.ui.dev.DebugMockApiResponsesFragment;
import com.vk.dto.clips.gallery.ClipsProcessedItem;
import com.vk.dto.clips.model.ClipsEditorInputAudioItem;
import com.vk.dto.clips.model.ClipsEditorInputData;
import com.vk.dto.clips.model.ClipsEditorInputVideoItem;
import com.vk.dto.clips.music.ClipsEditorMusicInfo;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.data.Subscription;
import com.vk.dto.common.id.UserId;
import com.vk.dto.live.LiveEventModel;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.dto.video.VideoAlbum;
import com.vk.ecomm.market.api.labels.MarketItemModalApproveInfoModel;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingButton;
import com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.a;
import com.vk.im.engine.models.dialogs.DialogMember;
import com.vk.im.popup.Popup;
import com.vk.imageloader.view.VKImageView;
import com.vk.newsfeed.posting.crop_editor.domain.model.LocalImageLink;
import com.vk.newsfeed.posting.impl.domain.model.LocalMediaEntry;
import com.vk.newsfeed.posting.impl.domain.model.attachment.LocalPhotoAttachment;
import com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerList;
import com.vk.photos.ui.editalbum.domain.g;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.storycamera.builder.StoryCameraParams;
import com.vk.superapp.api.dto.identity.WebIdentityEmail;
import com.vk.superapp.api.dto.identity.WebIdentityLabel;
import com.vk.superapp.miniapps.impl.BadgeEvent;
import com.vk.superapp.miniapps.impl.b;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.text.Regex;
import xsna.f0r;
import xsna.gwc;
import xsna.h7u0;
import xsna.m8v0;
import xsna.o0r0;
import xsna.ofk;
import xsna.qs80;
import xsna.sew0;
import xsna.tlo0;
import xsna.wfk;
import xsna.wk50;
import xsna.xn50;
import xsna.ys8;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class he3 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ he3(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i;
        zhf0 rightMainRect;
        int i2;
        ImageSize Cb;
        int i3 = 3;
        int i4 = 2;
        boolean z = false;
        z = false;
        boolean z2 = true;
        switch (this.b) {
            case 0:
                com.vk.superapp.miniapps.impl.b bVar = (com.vk.superapp.miniapps.impl.b) this.c;
                r6 r6Var = (r6) this.d;
                BadgeEvent.BadgeEventPayload badgeEventPayload = (BadgeEvent.BadgeEventPayload) obj;
                synchronized (com.vk.superapp.miniapps.impl.b.b) {
                    if (!epx.f(bVar.a, badgeEventPayload)) {
                        bVar.a = badgeEventPayload;
                        r6Var.invoke(new b.a(badgeEventPayload.b, badgeEventPayload.c, badgeEventPayload.d));
                    }
                }
                return s3q0.a;
            case 1:
                ((izs) this.c).invoke(new a.g((BookingButton.Action) obj, ((av7) this.d).e));
                return s3q0.a;
            case 2:
                sew0 sew0Var = (sew0) this.c;
                VKImageView vKImageView = (VKImageView) this.d;
                VKImageView vKImageView2 = (VKImageView) obj;
                if (vKImageView2.getWidth() > 0) {
                    int width = vKImageView2.getWidth();
                    fxj0 c = ixj0.c(((sew0.b) sew0Var).b, width, width);
                    String url = c != null ? c.getUrl() : null;
                    if (url != null) {
                        vKImageView.load(url);
                    }
                }
                return s3q0.a;
            case 3:
                fha fhaVar = (fha) this.c;
                UserId userId = (UserId) this.d;
                ArrayList<UIBlock> arrayList = ((UIBlockList) obj).y;
                fhaVar.getClass();
                com.vk.movika.sdk.base.hooks.p pVar = new com.vk.movika.sdk.base.hooks.p(userId, 23);
                if (arrayList == null || !arrayList.isEmpty()) {
                    Iterator<T> it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((Boolean) pVar.invoke(it.next())).booleanValue()) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 4:
                Context context = (Context) this.c;
                VideoAlbum videoAlbum = (VideoAlbum) this.d;
                if (((Boolean) obj).booleanValue()) {
                    return io.reactivex.rxjava3.internal.operators.completable.i.b;
                }
                return io.reactivex.rxjava3.core.a.k(new VKApiException(context.getString(videoAlbum.l ? R.string.video_playlist_unsubscribe_fail : R.string.video_playlist_subscribe_fail)));
            case 5:
                ((elb) this.c).c.h((hyg0) obj, (yj4) this.d);
                return s3q0.a;
            case 6:
                com.vk.libvideo.live.impl.views.chat.a aVar = (com.vk.libvideo.live.impl.views.chat.a) this.c;
                LiveEventModel liveEventModel = (LiveEventModel) this.d;
                aVar.getClass();
                boolean z3 = ((LiveEventModel) obj).m == liveEventModel.m;
                aVar.d.f2();
                return Boolean.valueOf(z3);
            case 7:
                ((cxb) this.c).x.b(((Integer) obj).intValue(), ((DialogMember) this.d).b);
                return s3q0.a;
            case 8:
                gwc gwcVar = (gwc) this.c;
                String str = (String) this.d;
                int i5 = gwc.a.$EnumSwitchMapping$0[((HideReason) obj).ordinal()];
                if (i5 == 1 || i5 == 2 || i5 == 3 || i5 == 4) {
                    gwcVar.c.gh(str);
                } else if (i5 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                return s3q0.a;
            case 9:
                ClipFeedListFragment clipFeedListFragment = (ClipFeedListFragment) this.c;
                SdkVideoFile sdkVideoFile = (SdkVideoFile) this.d;
                int i6 = ClipFeedListFragment.a2;
                if (((qs80) obj) instanceof qs80.c) {
                    clipFeedListFragment.o2(new SdkClipViewerClick.b(sdkVideoFile, true));
                } else {
                    clipFeedListFragment.Oo(sdkVideoFile);
                }
                return s3q0.a;
            case 10:
                jpd jpdVar = (jpd) this.c;
                qm1 qm1Var = (qm1) this.d;
                List list = (List) obj;
                if (!list.isEmpty()) {
                    StoryCameraParams storyCameraParams = jpdVar.x;
                    CameraUIView cameraUIView = jpdVar.c;
                    ClipsEditorInputData clipsEditorInputData = new ClipsEditorInputData(EmptyList.b, null, null, false, false, null, 0, storyCameraParams.t, cameraUIView.getIsFullHdCamera(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, IronSourceError.ERROR_BN_RELOAD_SKIP_BACKGROUND, null);
                    List list2 = list;
                    ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(jyd.a((ClipsProcessedItem) it2.next()));
                    }
                    int i7 = jpdVar.i.b;
                    ClipsEditorMusicInfo clipsEditorMusicInfo = jpdVar.z.c;
                    ClipsEditorInputData a = ClipsEditorInputData.a(clipsEditorInputData, arrayList2, clipsEditorMusicInfo != null ? new ClipsEditorInputAudioItem(clipsEditorMusicInfo, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14, null) : null, null, false, false, null, i7, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 932);
                    if (jpdVar.b.i.M) {
                        cameraUIView.ff(false, null, null);
                    }
                    qm1Var.invoke(a);
                }
                return s3q0.a;
            case 11:
                final lsd lsdVar = (lsd) this.c;
                n1d n1dVar = (n1d) this.d;
                ((ClipsDraftPersistentStore) obj).getClass();
                ClipsDraftVk j = ClipsDraftPersistentStore.j();
                if (j != null) {
                    CameraUIView cameraUIView2 = lsdVar.b;
                    if (lsdVar.h == null) {
                        ArrayList e = lsdVar.d.e();
                        ClipsDraftCommonData clipsDraftCommonData = j.b;
                        if (!e.containsAll(clipsDraftCommonData.d)) {
                            List<ClipsEditorInputVideoItem> list3 = clipsDraftCommonData.d;
                            if ((list3 instanceof Collection) && list3.isEmpty()) {
                                i = 0;
                            } else {
                                Iterator<T> it3 = list3.iterator();
                                i = 0;
                                while (it3.hasNext()) {
                                    File file = ((ClipsEditorInputVideoItem) it3.next()).b;
                                    Regex regex = com.vk.core.files.a.a;
                                    if (vhk0.g(file) && (i = i + 1) < 0) {
                                        e43.s();
                                        throw null;
                                    }
                                }
                            }
                            if (i != 0 && clipsDraftCommonData.g && j.c.i == null) {
                                z2 = false;
                            }
                        }
                    }
                    if (z2) {
                        ClipsDraftPersistentStore clipsDraftPersistentStore = ClipsDraftPersistentStore.b;
                        ve0 ve0Var = new ve0(13);
                        clipsDraftPersistentStore.getClass();
                        ClipsDraftPersistentStore.o(ve0Var);
                    } else {
                        cameraUIView2.m();
                        h7u0.a aVar2 = new h7u0.a(cameraUIView2.getContext());
                        aVar2.U(R.string.clips_has_draft);
                        aVar2.c0(R.string.continue_, new fsd(n1dVar, j, lsdVar, z ? 1 : 0));
                        aVar2.W(R.string.cancel, new gsd(lsdVar, z ? 1 : 0));
                        aVar2.a0(new DialogInterface.OnDismissListener() { // from class: xsna.hsd
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                lsd lsdVar2 = lsd.this;
                                lsdVar2.b.t();
                                lsdVar2.h = null;
                            }
                        });
                        aVar2.a.n = new DialogInterface.OnCancelListener() { // from class: xsna.isd
                            @Override // android.content.DialogInterface.OnCancelListener
                            public final void onCancel(DialogInterface dialogInterface) {
                                lsd.this.getClass();
                                ClipsDraftPersistentStore clipsDraftPersistentStore2 = ClipsDraftPersistentStore.b;
                                ve0 ve0Var2 = new ve0(13);
                                clipsDraftPersistentStore2.getClass();
                                ClipsDraftPersistentStore.o(ve0Var2);
                            }
                        };
                        lsdVar.h = aVar2.m();
                    }
                }
                return s3q0.a;
            case 12:
                ClipsPlaylistPickerFragment clipsPlaylistPickerFragment = (ClipsPlaylistPickerFragment) this.c;
                f.d.b.a aVar3 = (f.d.b.a) this.d;
                int i8 = ClipsPlaylistPickerFragment.V;
                com.vk.clips.playlists.ui.picker.a aVar4 = aVar3.a;
                clipsPlaylistPickerFragment.getClass();
                xn50.a.c(clipsPlaylistPickerFragment, aVar4);
                return s3q0.a;
            case 13:
                huf hufVar = (huf) this.c;
                ClipsWrapperFragment clipsWrapperFragment = (ClipsWrapperFragment) this.d;
                wuf wufVar = (wuf) obj;
                int i9 = ClipsWrapperFragment.Q0;
                VkTopBar topBar = wufVar.getTopBar();
                int i10 = ClipsWrapperFragment.b.$EnumSwitchMapping$0[hufVar.b.ordinal()];
                if (i10 == 1) {
                    rightMainRect = wufVar.getTopBar().getRightMainRect();
                } else {
                    if (i10 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    rightMainRect = wufVar.getTopBar().getRightExtraRect();
                }
                int i11 = m8v0.M;
                String str2 = hufVar.a.c;
                if (str2 == null) {
                    str2 = "";
                }
                m8v0.a.a(topBar, str2, new vf0(rightMainRect, 26), VkTooltip$MarkerStyle.Style4, VkTooltip$MarkerSize.Size48, VkOnboarding$TintColor.Lime, VkTooltip$BalloonPosition.BottomLeft, null, new rf(21), null, null, null, null, new mp3(r4, clipsWrapperFragment, hufVar), null, 0, true, null, null, false, null, false, 16686720);
                return s3q0.a;
            case 14:
                z5h z5hVar = (z5h) this.c;
                UserId userId2 = (UserId) this.d;
                int i12 = z5h.j1;
                ((BridgeComponent) m7m.d(z5hVar).a(fpf0.a(BridgeComponent.class))).F().m(z5hVar.requireContext(), userId2, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                z5hVar.dismiss();
                return s3q0.a;
            case 15:
                ((nfh) this.c).e.invoke(new CommunityProfileAction.f.m((CommunityProfileContentItem) this.d));
                return s3q0.a;
            case 16:
                ((uvj) this.c).n().c(((wvj) this.d).a);
                return s3q0.a;
            case 17:
                rfk rfkVar = (rfk) this.c;
                bhk bhkVar = (bhk) this.d;
                LocalPhotoAttachment localPhotoAttachment = new LocalPhotoAttachment((LocalMediaEntry) obj);
                Uri uri = localPhotoAttachment.getUri();
                int i13 = localPhotoAttachment.z;
                int i14 = localPhotoAttachment.A;
                rfkVar.T(new wfk.g(new mhk(new LocalImageLink(uri, i13, i14))));
                if (bhkVar.v()) {
                    rfkVar.C(new ofk.i(rfkVar.h.a(i13 / i14)));
                }
                rfkVar.C(ofk.g.b);
                return s3q0.a;
            case 18:
                ((wzs) this.c).invoke((Long) this.d, (Long) obj);
                return s3q0.a;
            case 19:
                DebugMockApiResponsesFragment.d dVar = (DebugMockApiResponsesFragment.d) this.c;
                wh50 wh50Var = (wh50) this.d;
                Boolean bool = (Boolean) obj;
                bool.getClass();
                wh50Var.setValue(bool);
                dVar.invoke(bool);
                return s3q0.a;
            case 20:
                dcl dclVar = (dcl) this.c;
                ys8.b bVar2 = (ys8.b) this.d;
                StorePurchasesManager.BillingAvailabilityStatus billingAvailabilityStatus = (StorePurchasesManager.BillingAvailabilityStatus) obj;
                if (billingAvailabilityStatus == StorePurchasesManager.BillingAvailabilityStatus.READY) {
                    Subscription subscription = dclVar.d;
                    if (subscription != null) {
                        bVar2.b(subscription);
                    } else if (dclVar.e == null) {
                        til0 til0Var = new til0(1);
                        Context context2 = e43.a;
                        Context context3 = context2 != null ? context2 : null;
                        int i15 = 16;
                        dclVar.e = new io.reactivex.rxjava3.internal.operators.observable.c0(fsk.P(til0Var, context3), io.reactivex.rxjava3.internal.functions.a.d, new g57(bVar2, i3)).subscribe(new vl0(new h57(7, dclVar, bVar2), i15), new mp0(new u6(15, dclVar, bVar2), i15));
                    }
                } else {
                    bVar2.onError(billingAvailabilityStatus != StorePurchasesManager.BillingAvailabilityStatus.NOT_AUTHORIZED ? 1 : 5);
                }
                return s3q0.a;
            case 21:
                xam xamVar = (xam) this.c;
                List list4 = (List) this.d;
                FragmentActivity fragmentActivity = xamVar.i;
                List<ChatSpamAction> list5 = list4;
                ArrayList arrayList3 = new ArrayList(c5g.u(list5, 10));
                for (ChatSpamAction chatSpamAction : list5) {
                    if (epx.f(chatSpamAction, ChatSpamAction.ExitChatAndClearHistory.b)) {
                        i2 = R.string.vkim_msg_header_delete_spam_chat_progress_desc;
                    } else {
                        if (!epx.f(chatSpamAction, ChatSpamAction.Report.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i2 = R.string.vkim_msg_header_report_spam_progress_desc;
                    }
                    arrayList3.add(fragmentActivity.getString(i2));
                }
                String g0 = arrayList3.size() < 2 ? (String) j5g.a0(arrayList3) : j5g.g0(arrayList3, ". ", null, ".", 0, null, 58);
                if (g0 == null) {
                    g0 = "";
                }
                String str3 = g0;
                zam zamVar = xamVar.u;
                if (zamVar != null) {
                    com.vk.im.popup.a a2 = zamVar.a();
                    ImFeatures imFeatures = ImFeatures.IM_CHAT_MODALS_REDESIGN;
                    imFeatures.getClass();
                    a2.b(new Popup.c(0, 3, null, str3, com.vk.toggle.b.A.a(imFeatures)), new nuj(zamVar, i4));
                }
                return s3q0.a;
            case 22:
                com.vk.photos.ui.editalbum.domain.c cVar = (com.vk.photos.ui.editalbum.domain.c) this.c;
                PhotoAlbum photoAlbum = (PhotoAlbum) this.d;
                tlo0.a aVar5 = tlo0.Companion;
                Object[] objArr = {photoAlbum.g};
                aVar5.getClass();
                cVar.g.b(new g.k(new j7k0(tlo0.a.c(R.string.album_details_delete_album_fail, objArr), Integer.valueOf(R.drawable.vk_icon_warning_triangle_outline_28), Integer.valueOf(R.attr.vk_ui_accent_orange), new tlo0.f(R.string.photos_retry), new dne(cVar, 20), null, 32)));
                return s3q0.a;
            case 23:
                ((f0r.e) this.c).h((wk50.a) this.d, (Throwable) obj);
                return s3q0.a;
            case 24:
                return new WebIdentityEmail((WebIdentityLabel) this.c, (String) this.d, ((BaseCreateResponseDto) obj).getId());
            case 25:
                VkImage vkImage = (VkImage) this.c;
                VkImage vkImage2 = (VkImage) obj;
                Image image = ((MarketItemModalApproveInfoModel) this.d).a;
                vkImage.o0((image == null || (Cb = image.Cb(vkImage2.getWidth(), true, false)) == null) ? null : Cb.d.d, null);
                return s3q0.a;
            case 26:
                ((l7v) this.c).d.remove((String) this.d);
                return s3q0.a;
            case 27:
                khy khyVar = (khy) this.c;
                lhy lhyVar = (lhy) this.d;
                y4l0 y4l0Var = khyVar.l;
                if (y4l0Var != null) {
                    y4l0Var.b(lhyVar.d);
                }
                return s3q0.a;
            case 28:
                xp40 xp40Var = (xp40) this.c;
                kea keaVar = (kea) this.d;
                xp40Var.A0().i((String) obj);
                keaVar.o();
                return s3q0.a;
            default:
                ((qs40) this.c).T(new ut40((MusicPickerList) this.d, (ta90) obj));
                return s3q0.a;
        }
    }
}
