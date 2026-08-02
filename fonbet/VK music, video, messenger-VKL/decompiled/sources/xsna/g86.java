package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.NotificationCompat;
import com.facebook.soloader.MinElf;
import com.vk.api.generated.apps.dto.AppsAppDto;
import com.vk.api.generated.apps.dto.AppsAppEmbeddedUrlDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.api.generated.utils.dto.UtilsDomainResolvedWithDataDto;
import com.vk.catalog2.common.dto.ui.UIBlockTitleSubtitleAvatar;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;
import com.vk.catalog2.common.ui.core.analytics.tracking.VideoAlbumAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.friend.FriendsSuggestsVh;
import com.vk.catalog2.common.ui.mvp.holder.video.playlist.VideoPlaylistInfoVh;
import com.vk.clips.interests.impl.ui.ClipsInterestsViewState;
import com.vk.clips.reports.impl.ClipsReportFragment;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.common.links.LaunchContext;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.attaches.AttachGift;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.gift.GiftType;
import com.vk.dto.common.gift.ImageStatus;
import com.vk.dto.common.gift.ImageStatusPack;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.StoryMusicInfo;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.ecomm.product_list.presentation.e;
import com.vk.ecomm.product_list.presentation.j;
import com.vk.im.engine.models.attaches.AttachLink;
import com.vk.libvideo.autoplay.background.controller.a;
import com.vk.libvideo.autoplay.background.controller.h;
import com.vk.libvideo.autoplay.background.notification.VideoNotificationActionReceiver;
import com.vk.libvideo.autoplay.background.notification.VideoNotificationDeleteReceiver;
import com.vk.libvideo.video.queue.api.model.VideoApplyNewVideoSourceType;
import com.vk.money.subscription.MusicSubscriptionControlFragment;
import com.vk.stickers.bridge.b;
import com.vk.voip.ui.calls.presentation.base.fragment.VoipCallServiceFragment;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.aop0;
import xsna.bjw0;
import xsna.bsj0;
import xsna.cfa0;
import xsna.dop0;
import xsna.gm50;
import xsna.ikv0;
import xsna.lrd0;
import xsna.nf60;
import xsna.o0r0;
import xsna.oxb;
import xsna.p2s;
import xsna.r1r0;
import xsna.t310;
import xsna.xsw0;
import xsna.zst0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class g86 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g86(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v33, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ImageStatusPack imageStatusPack;
        String str;
        String str2;
        ats0 ats0Var;
        VideoApplyNewVideoSourceType videoApplyNewVideoSourceType;
        String f;
        int i = 1;
        int i2 = 0;
        switch (this.b) {
            case 0:
                ((k86) this.c).s.ki((Bitmap) obj, (String) this.d);
                return s3q0.a;
            case 1:
                bi9 bi9Var = (bi9) this.c;
                bi9Var.d = false;
                bi9Var.c((StoryMusicInfo) this.d, (Throwable) obj);
                return s3q0.a;
            case 2:
                return laa.s((laa) this.c, (String) this.d, null, null, (List) obj, null, null, null, null, null, 502);
            case 3:
                ((oxb.a) this.c).m.f((qxb) this.d);
                return s3q0.a;
            case 4:
                xle xleVar = (xle) this.c;
                izs izsVar = (izs) this.d;
                SdkClipVideoFile sdkClipVideoFile = xleVar.b;
                if (sdkClipVideoFile != null) {
                    izsVar.invoke(sdkClipVideoFile);
                }
                return s3q0.a;
            case 5:
                ClipsReportFragment clipsReportFragment = (ClipsReportFragment) this.c;
                View view = (View) this.d;
                n1f n1fVar = (n1f) obj;
                clipsReportFragment.U.setItems(n1fVar.a);
                view.setEnabled(n1fVar.b);
                return s3q0.a;
            case 6:
                StickerStockItem stickerStockItem = (StickerStockItem) obj;
                return new b.a(stickerStockItem, com.vk.stickers.bridge.b.I(stickerStockItem.b, (UserId) this.c, (Collection) this.d));
            case 7:
                mqj mqjVar = (mqj) this.c;
                mqjVar.c.execute(new i09(mqjVar, (op1) this.d, (ClipsInterestsViewState.d) obj, i));
                return s3q0.a;
            case 8:
                p2s p2sVar = (p2s) this.c;
                i2s i2sVar = (i2s) this.d;
                t2s t2sVar = (t2s) obj;
                List<hfz> list = t2sVar.a;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    hfz hfzVar = (hfz) obj2;
                    if (!(hfzVar instanceof yyr) || ((yyr) hfzVar).getId() != ((p2s.g) p2sVar).b.getId()) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(arrayList);
                p2s.g gVar = (p2s.g) p2sVar;
                yyr yyrVar = t2sVar.c.get(Integer.valueOf(gVar.b.getId()));
                if (yyrVar == null) {
                    yyrVar = gVar.b;
                }
                arrayList2.add(gVar.c, yyrVar);
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof yyr) {
                        arrayList3.add(next);
                    }
                }
                ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(Integer.valueOf(((yyr) it2.next()).getId()));
                }
                di6.a(i2sVar, i2sVar.j.o(arrayList4));
                return t2s.a(t2sVar, arrayList2, false, null, null, false, null, null, false, 0, 510);
            case 9:
                return rsg0.y0(yfb.x(r1r0.a.b((s1r0) ((FriendsSuggestsVh) this.c).l.getValue(), Collections.singletonList(((UIBlockProfile) this.d).A.c), e43.l(UsersFieldsDto.CAN_WRITE_PRIVATE_MESSAGE, UsersFieldsDto.FRIEND_STATUS, UsersFieldsDto.IS_FRIEND), null, null, 58)), null, null, 3);
            case 10:
                s8z s8zVar = (s8z) this.c;
                AttachLink attachLink = (AttachLink) this.d;
                j0u0 j0u0Var = s8zVar.a;
                if (j0u0Var != null) {
                    t8z t8zVar = (t8z) j0u0Var.b;
                    iwv.l(t8zVar.k.k(), t8zVar.t, attachLink, null, null, Long.valueOf(t8zVar.n.b), null, false, 108);
                }
                return s3q0.a;
            case 11:
                a410 a410Var = (a410) this.c;
                a410Var.Y(false, (x410) this.d);
                a410Var.l.b(new t310.e(tq.h(tlo0.Companion, R.string.market_all_reviews_delete_and_restore_error)));
                return s3q0.a;
            case 12:
                return tb20.a((tb20) obj, null, new dop0.a(((aop0.a) this.c).a, false), (unp0) this.d, null, false, 25);
            case 13:
                wq30 wq30Var = (wq30) this.c;
                AttachGift attachGift = (AttachGift) this.d;
                GiftType giftType = attachGift.l;
                if (giftType == GiftType.IMAGE_STATUS) {
                    ImageStatus imageStatus = attachGift.m;
                    if (imageStatus != null) {
                        str = imageStatus.b;
                        str2 = str;
                    }
                    str2 = null;
                } else {
                    if (giftType == GiftType.IMAGE_STATUS_PACK && (imageStatusPack = attachGift.n) != null) {
                        str = imageStatusPack.b;
                        str2 = str;
                    }
                    str2 = null;
                }
                if (str2 != null) {
                    maz e = xwk.d().e();
                    Context context = wq30Var.d;
                    maz.c(e, context == null ? null : context, str2, LaunchContext.A, null, null, 24);
                }
                return s3q0.a;
            case 14:
                return new uzm0((ViewGroup) obj, ((d950) this.c).j, (MusicSubscriptionControlFragment.c) this.d);
            case 15:
                nf60 nf60Var = (nf60) this.c;
                og60 og60Var = (og60) this.d;
                nf60.a aVar = (nf60.a) obj;
                return nf60Var.a.a(new vg60(og60Var.a, og60Var.b, og60Var.c, og60Var.d, og60Var.e, og60Var.f, aVar.a, aVar.b, aVar.c, aVar.d, og60Var.g));
            case 16:
                PhotoAlbum photoAlbum = (PhotoAlbum) this.c;
                g5a0 g5a0Var = (g5a0) this.d;
                VKList vKList = (VKList) obj;
                if (photoAlbum.f != vKList.i()) {
                    photoAlbum.f = vKList.i();
                    ((v4a0) g5a0Var.c).C1(photoAlbum);
                }
                return s3q0.a;
            case 17:
                com.vk.ecomm.product_list.presentation.a aVar2 = (com.vk.ecomm.product_list.presentation.a) this.c;
                com.vk.ecomm.product_list.presentation.j jVar = (com.vk.ecomm.product_list.presentation.j) this.d;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                bqd0 fo = aVar2.fo();
                vpd0 vpd0Var = ((j.b) jVar).a;
                fo.b(new e.d(vpd0Var.a, vpd0Var.b, booleanValue));
                return s3q0.a;
            case 18:
                lrd0.c cVar = (lrd0.c) this.c;
                krd0 krd0Var = (krd0) this.d;
                lrd0 lrd0Var = cVar.n;
                krd0 krd0Var2 = lrd0Var.g;
                if (krd0Var2 == null || krd0Var2.a != krd0Var.a) {
                    lrd0Var.f.V3(krd0Var, krd0Var2);
                    lrd0Var.L0(krd0Var);
                }
                return s3q0.a;
            case 19:
                Activity activity = (Activity) this.c;
                gzs gzsVar = (gzs) this.d;
                if (((Throwable) obj) instanceof NullPointerException) {
                    ikv0.a aVar3 = new ikv0.a(bwt0.u(activity));
                    aVar3.e = 2000L;
                    aVar3.u = new ikv0.d(activity.getString(R.string.qr_user_not_found), (String) null, (ikv0.d.a) null, 6);
                    aVar3.e(((Number) gzsVar.invoke()).intValue());
                    aVar3.n();
                }
                return s3q0.a;
            case 20:
                ((bsj0) this.c).e.invoke(((bsj0.a) this.d).m);
                return s3q0.a;
            case 21:
                return ((kwm0) this.c).l((UserId) this.d, null, null, ((jlu) obj).a, null);
            case 22:
                azl azlVar = (azl) this.c;
                uco ucoVar = (uco) obj;
                ((wh50) this.d).setValue(new q9x((azlVar.r0(uco.c(ucoVar.a)) << 32) | (azlVar.r0(uco.b(ucoVar.a)) & 4294967295L)));
                return s3q0.a;
            case 23:
                ddr0 ddr0Var = (ddr0) this.c;
                Context context2 = (Context) this.d;
                ikv0.a aVar4 = new ikv0.a(context2);
                aVar4.u = new ikv0.d(context2.getString(R.string.vk_apps_install_join_failed_title), context2.getString(R.string.vk_apps_install_join_failed_subtitle), (ikv0.d.a) null, 4);
                aVar4.o = Integer.valueOf(iah0.a(Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE));
                aVar4.n();
                ddr0Var.b(false);
                xgx0.a.getClass();
                xgx0.d((Throwable) obj);
                return s3q0.a;
            case 24:
                com.vk.libvideo.autoplay.background.controller.f fVar = (com.vk.libvideo.autoplay.background.controller.f) this.c;
                yg5 yg5Var = (yg5) this.d;
                uss0 uss0Var = (uss0) obj;
                dts0 dts0Var = fVar.n;
                if (dts0Var == null) {
                    dts0Var = fVar.h.a(fVar.b);
                    fVar.n = dts0Var;
                }
                Context context3 = fVar.b;
                h.a aVar5 = fVar.k;
                a.b bVar = fVar.l;
                cts0 cts0Var = fVar.h;
                if (dts0Var == null) {
                    return s3q0.a;
                }
                qys0 qys0Var = fVar.o;
                if (qys0Var != null) {
                    qys0Var.a = yg5Var;
                } else {
                    qys0Var = new qys0();
                    qys0Var.a = yg5Var;
                    fVar.d.j.add(qys0Var);
                }
                fVar.o = qys0Var;
                pys0 pys0Var = fVar.p;
                if (pys0Var != null) {
                    pys0Var.a = yg5Var;
                } else {
                    pys0Var = new pys0(bVar);
                    pys0Var.a = yg5Var;
                    if (cts0Var.b(dts0Var) && (ats0Var = cts0Var.d) != null) {
                        ats0Var.a.add(pys0Var);
                    }
                }
                fVar.p = pys0Var;
                VideoNotificationActionReceiver videoNotificationActionReceiver = fVar.q;
                if (videoNotificationActionReceiver != null) {
                    s4s0 s4s0Var = new s4s0(i2, fVar, yg5Var);
                    j8n0 j8n0Var = new j8n0(fVar, 8);
                    videoNotificationActionReceiver.c = yg5Var;
                    videoNotificationActionReceiver.d = s4s0Var;
                    videoNotificationActionReceiver.e = j8n0Var;
                } else {
                    videoNotificationActionReceiver = new VideoNotificationActionReceiver(aVar5, bVar);
                    com.vk.movika.tools.controls.seekbar.f fVar2 = new com.vk.movika.tools.controls.seekbar.f(24, fVar, yg5Var);
                    uho0 uho0Var = new uho0(fVar, 5);
                    videoNotificationActionReceiver.c = yg5Var;
                    videoNotificationActionReceiver.d = fVar2;
                    videoNotificationActionReceiver.e = uho0Var;
                    anj.d(context3, videoNotificationActionReceiver, new IntentFilter(VideoNotificationActionReceiver.f), null, 2);
                }
                fVar.q = videoNotificationActionReceiver;
                VideoNotificationDeleteReceiver videoNotificationDeleteReceiver = fVar.r;
                if (videoNotificationDeleteReceiver != null) {
                    videoNotificationDeleteReceiver.b = yg5Var;
                } else {
                    videoNotificationDeleteReceiver = new VideoNotificationDeleteReceiver(aVar5);
                    videoNotificationDeleteReceiver.b = yg5Var;
                    anj.d(context3, videoNotificationDeleteReceiver, new IntentFilter(VideoNotificationDeleteReceiver.c), null, 2);
                }
                fVar.r = videoNotificationDeleteReceiver;
                nys0 nys0Var = fVar.s;
                if (nys0Var != null) {
                    yg5 yg5Var2 = nys0Var.b;
                    if (yg5Var2 != null) {
                        yg5Var2.T(nys0Var);
                    }
                    nys0Var.b = null;
                    nys0Var.c = null;
                    nys0Var.d = null;
                    nys0Var.e = null;
                } else {
                    nys0Var = new nys0(fVar.m);
                }
                fqd fqdVar = new fqd(16, fVar, yg5Var);
                b8j0 b8j0Var = new b8j0(fVar, 13);
                q8w q8wVar = new q8w(29);
                nys0Var.b = yg5Var;
                nys0Var.c = fqdVar;
                nys0Var.d = b8j0Var;
                nys0Var.e = q8wVar;
                yg5Var.f0(nys0Var);
                zst0.a u = ((zst0) nys0Var.f.getValue()).u();
                att0 att0Var = (att0) nys0Var.g.getValue();
                VideoFile A = yg5Var.A();
                zst0 zst0Var = (zst0) nys0Var.f.getValue();
                if (u instanceof zst0.a.C4199a) {
                    videoApplyNewVideoSourceType = VideoApplyNewVideoSourceType.FromRecommendations;
                } else {
                    if (!(u instanceof zst0.a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    videoApplyNewVideoSourceType = ((zst0.a.b) u).a ? VideoApplyNewVideoSourceType.Other : VideoApplyNewVideoSourceType.FromRelatedVideoDialog;
                }
                att0Var.c(A, zst0Var, videoApplyNewVideoSourceType);
                fVar.s = nys0Var;
                xss0 a = fVar.j.a(yg5Var);
                cts0Var.f(dts0Var, uss0Var);
                cts0Var.g(dts0Var, a);
                fVar.E(dts0Var, uss0Var, a);
                return s3q0.a;
            case 25:
                VideoPlaylistInfoVh videoPlaylistInfoVh = (VideoPlaylistInfoVh) this.c;
                UIBlockTitleSubtitleAvatar uIBlockTitleSubtitleAvatar = (UIBlockTitleSubtitleAvatar) this.d;
                Context context4 = ((View) obj).getContext();
                if (!BuildInfo.r()) {
                    xwk.e().m(context4, uIBlockTitleSubtitleAvatar.g, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                    videoPlaylistInfoVh.b.a(new cfp0(uIBlockTitleSubtitleAvatar, new VideoAlbumAnalyticsInfo(VideoAlbumAnalyticsInfo.ClickTarget.ShowAuthor, null)));
                }
                return s3q0.a;
            case 26:
                Photo photo = (Photo) this.c;
                izs izsVar2 = (izs) this.d;
                cfa0.a aVar6 = (cfa0.a) obj;
                photo.h = aVar6.a;
                photo.j = aVar6.b;
                photo.i = aVar6.c;
                photo.k = aVar6.d;
                photo.n = aVar6.e;
                photo.o = aVar6.f;
                photo.q = aVar6.g;
                photo.r = aVar6.h;
                photo.l = true;
                photo.I = aVar6.j;
                photo.J = aVar6.i;
                if (izsVar2 != null) {
                    izsVar2.invoke(photo);
                }
                return s3q0.a;
            case 27:
                VoipCallServiceFragment.c cVar2 = (VoipCallServiceFragment.c) this.c;
                VoipCallServiceFragment voipCallServiceFragment = (VoipCallServiceFragment) this.d;
                int i3 = VoipCallServiceFragment.Y;
                sp.g(cVar2.a, 2);
                gm50.a.a(voipCallServiceFragment, ((bjw0.f) obj).a, new u5p0(voipCallServiceFragment, 17));
                return s3q0.a;
            default:
                xsw0.b bVar2 = (xsw0.b) this.c;
                Context context5 = (Context) this.d;
                UtilsDomainResolvedWithDataDto utilsDomainResolvedWithDataDto = (UtilsDomainResolvedWithDataDto) obj;
                AppsAppDto d = utilsDomainResolvedWithDataDto.d();
                if (d == null) {
                    throw new IllegalArgumentException("Url is not for app");
                }
                AppsAppEmbeddedUrlDto e2 = utilsDomainResolvedWithDataDto.e();
                if (e2 == null || (f = e2.f()) == null) {
                    throw new IllegalStateException("No view url returned");
                }
                int id = d.getId();
                mq20 mq20Var = new mq20(f, (String) null, (String) null, (String) null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, (String) null, (String) null);
                Integer num = bVar2.c;
                return hf3.a(new np20(id, context5, mq20Var, new iq20(null, NotificationCompat.CATEGORY_CALL, null, null, null, null, null, null, 253), new aq20(null, null, null, null, null, num != null ? num.intValue() == 1 ? 2 : num.intValue() == 0 ? 1 : 0 : null, null, false, null, false, 4031)));
        }
    }

    public /* synthetic */ g86(ysw0 ysw0Var, xsw0.b bVar, Context context) {
        this.b = 28;
        this.c = bVar;
        this.d = context;
    }
}
