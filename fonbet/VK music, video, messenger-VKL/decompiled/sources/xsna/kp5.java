package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.Size;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.groups.dto.GroupsGroupTypeDto;
import com.vk.api.generated.utils.dto.UtilsDomainResolvedWithDataDto;
import com.vk.clips.editor.templates.impl.domain.ClipsTemplateEditorVideoItem;
import com.vk.clips.interests.api.di.ClipsInterestsComponent;
import com.vk.clips.playlists.ClipsPlaylistsFolderLaunchParams;
import com.vk.clips.playlists.di.ClipsPlaylistsComponent;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.clips.upload.model.ClipUploadData;
import com.vk.clips.upload.model.ClipUploadParams;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.clips.viewer.impl.grid.ClipsGridFragment;
import com.vk.core.compose.utils.swipable.DismissValue;
import com.vk.dto.clips.media.ClipsEncoderParameters;
import com.vk.dto.common.Peer;
import com.vk.dto.common.clips.VideoTemplatePublishInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.AudioFromMusicCatalogInfo;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.StoryMusicInfo;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.im.engine.models.dialogs.DialogMember;
import com.vk.im.ui.components.common.MemberAction;
import com.vk.log.L;
import com.vk.media.MediaUtils;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerList;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.onboarding.api.dto.VkOnboardingType;
import com.vk.photos.ui.profile.ProfilePhotoTag;
import com.vk.pushes.receivers.c;
import com.vk.qrcode.QRStatsTracker;
import com.vk.qrcode.QRTypes$SubType;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipUploadItem;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.stickers.bottomsheets.StickersBottomSheetDialog;
import com.vk.stories.design.view.stickerbutton.ReactionStickerButton;
import com.vk.stories.design.view.stickerbutton.a;
import com.vk.superapp.auth.js.bridge.api.events.SaveCredentials$Response;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.common.js.bridge.api.events.CustomMessage$Error;
import com.vk.superapp.ui.widgets.menu.ExpandableMenuState;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PodcastAttachment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.cxb;
import xsna.e8v0;
import xsna.f0r;
import xsna.gm50;
import xsna.hxe;
import xsna.ikv0;
import xsna.jcm0;
import xsna.qvq;
import xsna.s4r;
import xsna.tbq0;
import xsna.tra0;
import xsna.tuv;
import xsna.ubx;
import xsna.uxd0;
import xsna.wk50;
import xsna.z0o;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class kp5 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ kp5(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v42, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean z;
        QRTypes$SubType qRTypes$SubType;
        Iterable iterable;
        int i = this.b;
        int i2 = 4;
        int i3 = 2;
        long j = 0;
        int i4 = 3;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                Bitmap bitmap = (Bitmap) obj;
                ((mp5) obj3).g.getClass();
                return ls5.a(bitmap, (RectF) obj2);
            case 1:
                kt8 kt8Var = (kt8) obj3;
                d790 d790Var = (d790) obj2;
                View view = (View) obj;
                ucl0 ucl0Var = kt8Var.m;
                if (ucl0Var != null) {
                    ucl0Var.a(d790Var.a.b, MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.BUY_OUT);
                }
                if (!kt8Var.l && d790Var.a.Q) {
                    d6w0.a(b6m.e(), view.getContext(), "stickers_preview", "create", 8);
                    return s3q0.a;
                }
                ArrayList g = d790Var.g();
                StickerStockItem stickerStockItem = d790Var.a;
                Iterator it = g.iterator();
                while (it.hasNext()) {
                    StickerStockItem stickerStockItem2 = (StickerStockItem) it.next();
                    if (stickerStockItem2.O == null) {
                        stickerStockItem2.O = kt8Var.f;
                    }
                    ucl0 ucl0Var2 = kt8Var.m;
                    if (ucl0Var2 != null) {
                        int i5 = stickerStockItem.b;
                        String str = ((long) i5) == ucl0Var2.b ? ucl0Var2.a : null;
                        if (str != null && stickerStockItem2.b == i5) {
                            stickerStockItem2.P = str;
                        }
                    }
                }
                if (g.isEmpty()) {
                    cvk.u(R.string.error, false);
                    L.l("Nothing to purchase among selected packs: " + d790Var);
                } else {
                    kt8Var.h.Kk(g, new y61(i3, d790Var, kt8Var));
                }
                return s3q0.a;
            case 2:
                ((a6b) obj3).a.a((VkOnboardingCampaign) obj2, VkOnboardingType.Tooltip, ((Boolean) obj).booleanValue() ? e8v0.i.b : e8v0.g.b);
                return s3q0.a;
            case 3:
                cxb cxbVar = (cxb) obj3;
                ftb ftbVar = cxbVar.x;
                DialogMember dialogMember = (DialogMember) obj2;
                switch (cxb.b.$EnumSwitchMapping$0[((MemberAction) obj).ordinal()]) {
                    case 1:
                    case 2:
                        boolean z2 = dialogMember.h;
                        Peer peer = dialogMember.b;
                        if (z2) {
                            ftbVar.g(peer);
                            break;
                        } else {
                            ftbVar.f(peer);
                            break;
                        }
                    case 3:
                        cxbVar.k(new uxd0.y(new rs0(i4, cxbVar, dialogMember)));
                        break;
                    case 4:
                        cxbVar.k(new uxd0.k0(new ww(5, cxbVar, dialogMember)));
                        break;
                    case 5:
                        cxbVar.k(new uxd0.i(new he3(7, cxbVar, dialogMember)));
                        break;
                    case 6:
                        ftbVar.c(dialogMember.b);
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return s3q0.a;
            case 4:
                ClipsGridFragment clipsGridFragment = (ClipsGridFragment) obj3;
                UserId userId = (UserId) obj2;
                hxe.a aVar = (hxe.a) obj;
                qcy<Object>[] qcyVarArr = ClipsGridFragment.H0;
                if (aVar.equals(hxe.a.C3026a.c)) {
                    sjd sjdVar = clipsGridFragment.u0;
                    if (sjdVar != null) {
                        sjdVar.d(new t9f(userId));
                    }
                } else if (aVar instanceof hxe.a.c) {
                    ((ClipsInterestsComponent) clipsGridFragment.W.getValue()).e().a(clipsGridFragment.requireContext());
                } else if (aVar instanceof hxe.a.d) {
                    ClipsPlaylistsFolderLaunchParams clipsPlaylistsFolderLaunchParams = new ClipsPlaylistsFolderLaunchParams(ClipsPlaylistsFolderLaunchParams.FoldersLaunchType.Reorder.b, clipsGridFragment.ko(), null, Collections.singletonList(((hxe.a.d) aVar).c));
                    Object activity = clipsGridFragment.getActivity();
                    Object obj4 = activity;
                    if (activity != null) {
                        while (true) {
                            z = obj4 instanceof FragmentActivity;
                            if (!z && (obj4 instanceof ContextWrapper)) {
                                obj4 = ((ContextWrapper) obj4).getBaseContext();
                            }
                        }
                        ((ClipsPlaylistsComponent) clipsGridFragment.x0.getValue()).e().e(clipsPlaylistsFolderLaunchParams, ((FragmentActivity) (z ? (Activity) obj4 : null)).getSupportFragmentManager());
                    }
                } else if (aVar instanceof hxe.a.e) {
                    sjd sjdVar2 = clipsGridFragment.u0;
                    if (sjdVar2 != null) {
                        sjdVar2.d(new u9f(userId));
                    }
                } else {
                    if (!(aVar instanceof hxe.a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ClipsRouter.c(g620.f().a(), clipsGridFragment.requireContext(), Collections.singletonList(new ClipFeedTab.CoauthorInvitations(((hxe.a.b) aVar).c)), null, null, fpf0.a(ClipFeedTab.CoauthorInvitations.class), null, null, true, null, 1900);
                }
                return s3q0.a;
            case 5:
                return io.reactivex.rxjava3.core.x.B(io.reactivex.rxjava3.core.x.k((e8b0) obj), (io.reactivex.rxjava3.internal.operators.single.y) obj3, new e10(new dv4((List) obj2, i2), 16));
            case 6:
                c8f c8fVar = (c8f) obj3;
                jhd0 jhd0Var = (jhd0) obj2;
                ClipsEncoderParameters clipsEncoderParameters = (ClipsEncoderParameters) obj;
                StoryMusicInfo storyMusicInfo = jhd0Var.c;
                t8o0 t8o0Var = jhd0Var.b;
                MobileOfficialAppsClipsStat$ClipsCreateContext mobileOfficialAppsClipsStat$ClipsCreateContext = jhd0Var.f;
                ArrayList<ClipsTemplateEditorVideoItem> arrayList = jhd0Var.d;
                MusicTrack musicTrack = storyMusicInfo.b;
                int i6 = musicTrack.b;
                UserId userId2 = musicTrack.c;
                AudioFromMusicCatalogInfo audioFromMusicCatalogInfo = storyMusicInfo.l;
                ClipUploadParams.LicensedAudioInfo licensedAudioInfo = new ClipUploadParams.LicensedAudioInfo(i6, userId2, audioFromMusicCatalogInfo != null ? audioFromMusicCatalogInfo.b : null, audioFromMusicCatalogInfo != null ? audioFromMusicCatalogInfo.c : null, audioFromMusicCatalogInfo != null ? audioFromMusicCatalogInfo.d : null, audioFromMusicCatalogInfo != null ? audioFromMusicCatalogInfo.f : null);
                int size = arrayList.size();
                long j2 = 0;
                for (ClipsTemplateEditorVideoItem clipsTemplateEditorVideoItem : arrayList) {
                    long j3 = clipsTemplateEditorVideoItem.g;
                    j2 += j3 != j ? j3 - clipsTemplateEditorVideoItem.f : clipsTemplateEditorVideoItem.e;
                    j = 0;
                }
                ClipUploadData clipUploadData = new ClipUploadData(new ClipUploadParams(mobileOfficialAppsClipsStat$ClipsCreateContext.b(), wrp.b(mobileOfficialAppsClipsStat$ClipsCreateContext.a()), (int) j2, jhd0Var.e, null, false, null, null, false, false, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new VideoTemplatePublishInfo(jhd0Var.a, t8o0Var != null ? Integer.valueOf(t8o0Var.a) : null, t8o0Var != null ? Long.valueOf(t8o0Var.b) : null), null, licensedAudioInfo, null, null, null, null, size, MobileOfficialAppsClipsStat$TypeClipUploadItem.CameraType.GALLERY, null, false, storyMusicInfo.k, false, false, false, false, false, null, false, -335544336, 8153, null), clipsEncoderParameters, 0, null, 12, null);
                y7f y7fVar = y7f.this;
                y7f.z(y7fVar, clipUploadData.c.f, new com.vk.movika.sdk.base.ui.r(i2, y7fVar, clipUploadData));
                return s3q0.a;
            case 7:
                MediaUtils.d dVar = (MediaUtils.d) obj2;
                Bitmap bitmap2 = (Bitmap) obj;
                Bitmap h = kd7.h(((k9f) obj3).a, bitmap2, k9f.g);
                bitmap2.recycle();
                if (h.getWidth() == dVar.a && h.getHeight() == dVar.b) {
                    return h;
                }
                Bitmap createBitmap = Bitmap.createBitmap(dVar.a, dVar.b, Bitmap.Config.ARGB_8888);
                Matrix matrix = new Matrix();
                float height = (dVar.b * 1.0f) / h.getHeight();
                matrix.setScale(height, height);
                matrix.postTranslate(yq.a(h.getWidth(), height, dVar.a, 2.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                new Canvas(createBitmap).drawBitmap(h, matrix, null);
                h.recycle();
                return createBitmap;
            case 8:
                String str2 = (String) obj2;
                Throwable th = (Throwable) obj;
                svp svpVar = ((onk) obj3).d;
                svpVar.getClass();
                if (fco0.d(th)) {
                    svpVar.e(fco0.h(str2, th));
                } else {
                    com.vk.superapp.base.js.bridge.b.o(svpVar.a, new JsMethod("VKWebAppCustomMessage"), new CustomMessage$Error(null, new CustomMessage$Error.Data(CustomMessage$Error.Data.Type.API_ERROR, str2, null, fco0.g(th), 4, null), 1, null), null, null, 12);
                }
                return s3q0.a;
            case 9:
                return new ccn((DismissValue) obj, (izs) obj3, (wzs) obj2);
            case 10:
                vs9 vs9Var = (vs9) obj3;
                gzs gzsVar = (gzs) obj2;
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.n(tgi0Var, 0);
                String str3 = vs9Var.b;
                if (str3 == null) {
                    str3 = vs9Var.a.c;
                }
                qgi0.h(tgi0Var, str3);
                qgi0.e(tgi0Var, null, new xe4(2, gzsVar));
                return s3q0.a;
            case 11:
                z0o z0oVar = (z0o) obj2;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ((z0o.a) obj3).o = false;
                if (booleanValue) {
                    z0oVar.j.invoke();
                }
                return s3q0.a;
            case 12:
                f0r.l lVar = (f0r.l) obj3;
                wk50.a aVar2 = (wk50.a) obj2;
                SdkVideoFile sdkVideoFile = (SdkVideoFile) obj;
                List<? extends FeedItem> singletonList = Collections.singletonList(myc.d(lVar.f, sdkVideoFile, null, 6));
                f0r.m mVar = new f0r.m(PaginationKey.LoadedFull.b, PaginationKey.Initial.b);
                String str4 = lVar.b.b;
                lVar.i(aVar2, singletonList, mVar, str4 != null ? new s4r.b(str4) : s4r.a.a, ubx.b.a, null, null);
                aVar2.a(new qvq.q(sdkVideoFile));
                return s3q0.a;
            case 13:
                tuv tuvVar = (tuv) obj3;
                tuvVar.f.invoke(tuvVar.d, Integer.valueOf(((yuv) tuvVar.g.get(((tuv.b) obj2).getAdapterPosition())).b.zb()), tuvVar.c);
                return s3q0.a;
            case 14:
                ((wh50) obj3).setValue(((Boolean) obj).booleanValue() ? (tzy) obj2 : null);
                return s3q0.a;
            case 15:
                String str5 = (String) obj2;
                com.vk.superapp.base.js.bridge.b.p(((l2y) obj3).e, new JsMethod("VKWebAppSaveCredentials"), new SaveCredentials$Response(null, new SaveCredentials$Response.Data(((Boolean) obj).booleanValue(), str5), str5, 1, null), null, null, false, null, 60);
                return s3q0.a;
            case 16:
                tra0.a aVar3 = (tra0.a) obj;
                ArrayList d = bu6.d((List) obj3, ((xdz) obj2).a);
                if (d != null) {
                    int size2 = d.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        Pair pair = (Pair) d.get(i7);
                        tra0 tra0Var = (tra0) pair.d();
                        gzs gzsVar2 = (gzs) pair.g();
                        tra0.a.w(aVar3, tra0Var, gzsVar2 != null ? ((h9x) gzsVar2.invoke()).a : 0L);
                    }
                }
                return s3q0.a;
            case 17:
                ((qs40) obj3).T(new tt40((MusicPickerList) obj2, (sa90) obj));
                return s3q0.a;
            case 18:
                c.a aVar4 = com.vk.pushes.receivers.c.b;
                c.a.e((Context) obj3, (Intent) obj2, (Throwable) obj);
                return s3q0.a;
            case 19:
                PodcastAttachment podcastAttachment = (PodcastAttachment) obj3;
                boolean X = podcastAttachment.X();
                podcastAttachment.s0(!X);
                ((ohb0) obj2).Y6(X);
                if (X) {
                    cvk.u(R.string.podcast_toast_fave_failed, false);
                } else {
                    cvk.u(R.string.podcast_toast_unfave_failed, false);
                }
                return s3q0.a;
            case 20:
                asd0 asd0Var = (asd0) obj3;
                Integer num = (Integer) obj;
                num.getClass();
                asd0Var.h(num);
                ((ood0) obj2).l.invoke(asd0Var);
                return s3q0.a;
            case 21:
                dzd0 dzd0Var = (dzd0) obj3;
                ProfilePhotoTag profilePhotoTag = (ProfilePhotoTag) obj2;
                if (((Boolean) obj).booleanValue()) {
                    FragmentActivity activity2 = dzd0Var.b.getActivity();
                    if (activity2 != null) {
                        String f = profilePhotoTag.d ? y8g0.f(R.string.profile_photo_recognition_tag_added, "") : y8g0.e(R.string.profile_photo_tag_added);
                        ikv0.a aVar5 = new ikv0.a(activity2);
                        aVar5.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_filled_blue_24, (Integer) null, (Size) null, 14);
                        aVar5.u = new ikv0.d(f, (String) null, (ikv0.d.a) null, 6);
                        aVar5.n();
                    }
                    dzd0.a(profilePhotoTag);
                }
                return s3q0.a;
            case 22:
                com.vk.qrcode.c cVar = (com.vk.qrcode.c) obj3;
                cme0 cme0Var = (cme0) obj2;
                UtilsDomainResolvedWithDataDto utilsDomainResolvedWithDataDto = (UtilsDomainResolvedWithDataDto) obj;
                String type = utilsDomainResolvedWithDataDto.getType();
                int hashCode = type.hashCode();
                if (hashCode == -814983785) {
                    if (type.equals("vk_app")) {
                        qRTypes$SubType = QRTypes$SubType.LINK_VK_APP;
                    }
                    qRTypes$SubType = cVar.o();
                } else if (hashCode != 3599307) {
                    if (hashCode == 98629247 && type.equals("group")) {
                        GroupsGroupFullDto f2 = utilsDomainResolvedWithDataDto.f();
                        qRTypes$SubType = (f2 != null ? f2.L2() : null) == GroupsGroupTypeDto.GROUP ? QRTypes$SubType.LINK_VK_EVENT : QRTypes$SubType.LINK_GROUP;
                    }
                    qRTypes$SubType = cVar.o();
                } else {
                    if (type.equals("user")) {
                        qRTypes$SubType = QRTypes$SubType.LINK_USER;
                    }
                    qRTypes$SubType = cVar.o();
                }
                QRStatsTracker qRStatsTracker = QRStatsTracker.a;
                QRStatsTracker.g(cVar.q(), qRTypes$SubType, cme0Var.g);
                return s3q0.a;
            case 23:
                aqe0 aqe0Var = (aqe0) obj3;
                aqe0Var.l1.removeCallbacks(aqe0Var.k1);
                gm50.a.a(aqe0Var, ((zjx) obj).a, new k22(18, aqe0Var, (FrameLayout) obj2));
                return s3q0.a;
            case 24:
                a.C1830a c1830a = (a.C1830a) obj3;
                int i8 = ReactionStickerButton.c;
                z2x z2xVar = new z2x(1, (wh50) obj2);
                c1830a.b = z2xVar;
                z2xVar.invoke(Boolean.valueOf(c1830a.a));
                return new ReactionStickerButton.a(c1830a);
            case 25:
                ((izs) obj3).invoke(obj);
                ((izs) obj2).invoke(obj);
                return s3q0.a;
            case 26:
                StickersBottomSheetDialog stickersBottomSheetDialog = (StickersBottomSheetDialog) obj3;
                nw20 nw20Var = (nw20) obj2;
                Collection<UserId> collection = stickersBottomSheetDialog.S.b;
                if (collection == null || (iterable = j5g.O0(collection)) == null) {
                    iterable = EmptyList.b;
                }
                String str6 = stickersBottomSheetDialog.V;
                if (str6 == null) {
                    str6 = "pack_details";
                }
                String str7 = str6;
                zal0 a = g2v.d().a();
                Context context = nw20Var.getContext();
                Iterable iterable2 = iterable;
                ArrayList arrayList2 = new ArrayList(c5g.u(iterable2, 10));
                Iterator it2 = iterable2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Long.valueOf(((UserId) it2.next()).b));
                }
                a.u(context, true, arrayList2, stickersBottomSheetDialog.T, str7);
                return s3q0.a;
            case 27:
                jcm0 jcm0Var = (jcm0) obj2;
                MediaStoreEntry mediaStoreEntry = ((jcm0.b) obj3).m;
                if (mediaStoreEntry != null) {
                    jcm0Var.c.invoke(mediaStoreEntry);
                }
                return s3q0.a;
            case 28:
                ((z7n0) obj3).q.h1((j8q) obj2, ExpandableMenuState.COLLAPSED);
                return s3q0.a;
            default:
                dwj dwjVar = (dwj) obj;
                return dwjVar.m(myc0.h(dwjVar.getScope(), null, null, new tbq0.a((dot0) obj3, (tbq0) obj2, null), 3));
        }
    }
}
