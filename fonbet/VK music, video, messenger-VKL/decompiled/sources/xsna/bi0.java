package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.os.Trace;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.facebook.soloader.MinElf;
import com.unity3d.services.UnityAdsConstants;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.auth.verification.base.stats.VerificationStatStartedFromReg;
import com.vk.catalog.mvi.block.video.impl.video.largelist.entity.VideoLargeListState;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UiBlockAdBanner;
import com.vk.catalog2.common.ui.holders.ads.AdShowCaseBannerVh;
import com.vk.catalog2.common.ui.mvp.holder.sticker.StickerTopBarBonusBalanceVh;
import com.vk.comments.api.model.MarketItemCommentsArgs;
import com.vk.core.serialize.Serializer;
import com.vk.core.tool.view.vkblur.VkBlurView;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.badge.VkContentBadge;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.ads.AdBannerStyle;
import com.vk.dto.attaches.AttachForMediaViewer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.ecomm.cart.impl.cart.feature.state.a;
import com.vk.ecomm.design.view.feed.FeedProductContentBadge;
import com.vk.games.model.GamesCatalogScreenTab;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogsHistory;
import com.vk.im.ui.components.chat_profile.ChatProfileActionItem$Notifications;
import com.vk.im.ui.components.common.DndPeriodAndSound;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.design.view.ads.AdBlockBadgeView;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.newsfeed.api.data.CommentThread;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.onboarding.api.dto.VkOnboardingType;
import com.vk.superapp.api.analytics.RegistrationStatFlowType;
import com.vk.superapp.api.analytics.RegistrationStatParamsFactory;
import com.vk.superapp.api.dto.auth.VkAuthValidatePhoneResult;
import com.vk.voip.ui.broadcast.list.ui.PastBroadcastsFragment;
import com.vk.voip.ui.broadcast.list.ui.a;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import io.reactivex.rxjava3.internal.functions.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.cg80;
import xsna.d110;
import xsna.e8v0;
import xsna.edt;
import xsna.eqe;
import xsna.gyh;
import xsna.hrm;
import xsna.ipz;
import xsna.kqe;
import xsna.m010;
import xsna.o0r0;
import xsna.ore;
import xsna.r46;
import xsna.rv9;
import xsna.sir0;
import xsna.vre;
import xsna.wqs0;
import xsna.xxd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class bi0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ bi0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03b8  */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        String str;
        l0n l0nVar;
        kiw kiwVar;
        Bitmap a;
        kiw kiwVar2;
        Bitmap a2;
        VideoFile A;
        ArrayList arrayList;
        drm drmVar;
        Set<Long> set;
        int i = this.b;
        int i2 = 6;
        int i3 = 8;
        int i4 = 9;
        int i5 = 3;
        boolean z = false;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                AdShowCaseBannerVh adShowCaseBannerVh = (AdShowCaseBannerVh) obj3;
                AdBannerStyle adBannerStyle = ((UiBlockAdBanner) obj2).z;
                zu50 zu50Var = (zu50) obj;
                adShowCaseBannerVh.q = zu50Var;
                if (zu50Var != null) {
                    zu50Var.l = new AdShowCaseBannerVh.a(adShowCaseBannerVh);
                }
                cw50 d = zu50Var != null ? zu50Var.d() : null;
                if (d != null && (kiwVar2 = d.v) != null && (a2 = kiwVar2.a()) != null) {
                    VKImageView vKImageView = adShowCaseBannerVh.c;
                    if (vKImageView == null) {
                        vKImageView = null;
                    }
                    vKImageView.setImageBitmap(a2);
                }
                if (d != null && (kiwVar = d.q) != null && (a = kiwVar.a()) != null) {
                    VkAvatar vkAvatar = adShowCaseBannerVh.i;
                    if (vkAvatar == null) {
                        vkAvatar = null;
                    }
                    vkAvatar.setImageBitmap(a);
                }
                Integer valueOf = (d == null || (l0nVar = d.k) == null) ? null : Integer.valueOf(l0nVar.a);
                Integer valueOf2 = ((valueOf != null && valueOf.intValue() == 6) || (valueOf != null && valueOf.intValue() == 8)) ? Integer.valueOf(R.drawable.vk_icon_illustration_contraindications_26h) : (valueOf != null && valueOf.intValue() == 9) ? Integer.valueOf(R.drawable.vk_icon_illustration_bud) : (valueOf != null && valueOf.intValue() == 11) ? Integer.valueOf(R.drawable.vk_icon_illustration_credits_79h) : null;
                float f = (valueOf != null && valueOf.intValue() == 6) ? 0.05f : ((valueOf != null && valueOf.intValue() == 8) || (valueOf != null && valueOf.intValue() == 9) || (valueOf != null && valueOf.intValue() == 11)) ? 0.1f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                Guideline guideline = adShowCaseBannerVh.o;
                if (guideline == null) {
                    guideline = null;
                }
                ViewGroup.LayoutParams layoutParams = guideline.getLayoutParams();
                ConstraintLayout.b bVar = layoutParams instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams : null;
                if (bVar != null) {
                    bVar.c = 1.0f - f;
                    Guideline guideline2 = adShowCaseBannerVh.o;
                    if (guideline2 == null) {
                        guideline2 = null;
                    }
                    guideline2.setLayoutParams(bVar);
                }
                if (valueOf2 != null) {
                    VkImageSimple vkImageSimple = adShowCaseBannerVh.d;
                    if (vkImageSimple == null) {
                        vkImageSimple = null;
                    }
                    vkImageSimple.setVisibility(0);
                    VkImageSimple vkImageSimple2 = adShowCaseBannerVh.d;
                    if (vkImageSimple2 == null) {
                        vkImageSimple2 = null;
                    }
                    vkImageSimple2.setImageResource(valueOf2.intValue());
                }
                VkText vkText = adShowCaseBannerVh.e;
                if (vkText == null) {
                    vkText = null;
                }
                vkText.setText(d != null ? d.g : null);
                VkText vkText2 = adShowCaseBannerVh.j;
                if (vkText2 == null) {
                    vkText2 = null;
                }
                if (adBannerStyle == AdBannerStyle.BOTTOM_BUTTON) {
                    if (d != null) {
                        str = d.n;
                    }
                    str = null;
                } else {
                    if (d != null) {
                        str = d.i;
                    }
                    str = null;
                }
                vkText2.setText(str);
                VkButton vkButton = adShowCaseBannerVh.k;
                if (vkButton == null) {
                    vkButton = null;
                }
                vkButton.setText(d != null ? d.h : null);
                AdBlockBadgeView adBlockBadgeView = adShowCaseBannerVh.h;
                if (adBlockBadgeView == null) {
                    adBlockBadgeView = null;
                }
                adBlockBadgeView.setText(j5g.g0(rl3.I(new String[]{d != null ? d.o : null, d != null ? d.l : null}), " ", null, null, 0, null, 62));
                AdBlockBadgeView adBlockBadgeView2 = adShowCaseBannerVh.h;
                if (adBlockBadgeView2 == null) {
                    adBlockBadgeView2 = null;
                }
                adBlockBadgeView2.setVisibility(0);
                zu50 zu50Var2 = adShowCaseBannerVh.q;
                if (zu50Var2 != null) {
                    AdShowCaseBannerVh.b bVar2 = (AdShowCaseBannerVh.b) adShowCaseBannerVh.p.getValue();
                    ConstraintLayout constraintLayout = adShowCaseBannerVh.n;
                    if (constraintLayout == null) {
                        constraintLayout = null;
                    }
                    zu50Var2.h(bVar2, Collections.singletonList(constraintLayout));
                }
                int i6 = adBannerStyle == null ? -1 : AdShowCaseBannerVh.c.$EnumSwitchMapping$0[adBannerStyle.ordinal()];
                if (i6 == 1) {
                    LinearLayout linearLayout = adShowCaseBannerVh.m;
                    if (linearLayout == null) {
                        linearLayout = null;
                    }
                    ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
                    ConstraintLayout.b bVar3 = layoutParams2 instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams2 : null;
                    if (bVar3 != null) {
                        VkAvatar vkAvatar2 = adShowCaseBannerVh.i;
                        if (vkAvatar2 == null) {
                            vkAvatar2 = null;
                        }
                        bVar3.l = vkAvatar2.getId();
                        VkButton vkButton2 = adShowCaseBannerVh.k;
                        if (vkButton2 == null) {
                            vkButton2 = null;
                        }
                        bVar3.u = vkButton2.getId();
                        LinearLayout linearLayout2 = adShowCaseBannerVh.m;
                        if (linearLayout2 == null) {
                            linearLayout2 = null;
                        }
                        linearLayout2.setLayoutParams(bVar3);
                    }
                    VkText vkText3 = adShowCaseBannerVh.e;
                    if (vkText3 == null) {
                        vkText3 = null;
                    }
                    vkText3.setMaxLines(1);
                    VkText vkText4 = adShowCaseBannerVh.j;
                    if (vkText4 == null) {
                        vkText4 = null;
                    }
                    vkText4.setMaxLines(1);
                    VkText vkText5 = adShowCaseBannerVh.e;
                    if (vkText5 == null) {
                        vkText5 = null;
                    }
                    vkText5.setVisibility(0);
                    VkText vkText6 = adShowCaseBannerVh.j;
                    if (vkText6 == null) {
                        vkText6 = null;
                    }
                    vkText6.setVisibility(0);
                    VkContentBadge vkContentBadge = adShowCaseBannerVh.f;
                    if (vkContentBadge == null) {
                        vkContentBadge = null;
                    }
                    vkContentBadge.setVisibility(0);
                    VkButton vkButton3 = adShowCaseBannerVh.k;
                    if (vkButton3 == null) {
                        vkButton3 = null;
                    }
                    vkButton3.setVisibility(0);
                    ImageView imageView = adShowCaseBannerVh.l;
                    if (imageView == null) {
                        imageView = null;
                    }
                    f4m.j(imageView);
                    VkContentBadge vkContentBadge2 = adShowCaseBannerVh.g;
                    if (vkContentBadge2 == null) {
                        vkContentBadge2 = null;
                    }
                    vkContentBadge2.setVisibility(0);
                    VkContentBadge vkContentBadge3 = adShowCaseBannerVh.f;
                    (vkContentBadge3 == null ? null : vkContentBadge3).setOnClickListener(adShowCaseBannerVh.r);
                } else if (i6 != 2) {
                    adShowCaseBannerVh.a();
                } else {
                    adShowCaseBannerVh.a();
                }
                return s3q0.a;
            case 1:
                r46 r46Var = (r46) obj2;
                xxd0.b bVar4 = (xxd0.b) obj;
                int i7 = r46.a.$EnumSwitchMapping$0[((DndPeriodAndSound) obj3).ordinal()];
                ChatProfileActionItem$Notifications.State state = i7 != 1 ? i7 != 2 ? i7 != 3 ? ChatProfileActionItem$Notifications.State.DISABLED : ChatProfileActionItem$Notifications.State.ENABLED : ChatProfileActionItem$Notifications.State.ENABLED : ChatProfileActionItem$Notifications.State.NO_SOUND;
                List<xub> list = bVar4.n;
                ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
                for (Object obj4 : list) {
                    if (obj4 instanceof ChatProfileActionItem$Notifications) {
                        obj4 = new ChatProfileActionItem$Notifications(r46Var.b, state);
                    }
                    arrayList2.add(obj4);
                }
                return xxd0.b.a(bVar4, arrayList2, null, null, 4186111);
            case 2:
                io.reactivex.rxjava3.internal.operators.observable.j1 f0 = com.vk.cameraui.impl.a.f0((yz10) obj3);
                b00 b00Var = new b00(new tm9((Ref$BooleanRef) obj2, 0), i2);
                a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
                a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
                return f0.E(b00Var, lVar, kVar, kVar);
            case 3:
                StickerTopBarBonusBalanceVh stickerTopBarBonusBalanceVh = (StickerTopBarBonusBalanceVh) obj2;
                hda hdaVar = (hda) obj;
                UIBlock uIBlock = (UIBlock) j5g.a0(jda.a(((d2a) obj3).b, hdaVar.a, hdaVar.b, false, false, 12));
                if (uIBlock != null) {
                    stickerTopBarBonusBalanceVh.N6(uIBlock);
                }
                return s3q0.a;
            case 4:
                return ((Boolean) obj).booleanValue() ? ((laa) obj3).c.g((String) obj2) : io.reactivex.rxjava3.core.x.k(EmptyList.b);
            case 5:
                ChatFragment chatFragment = (ChatFragment) obj2;
                int intValue = ((Integer) obj).intValue();
                ChatFragment.d dVar = ChatFragment.w1;
                AttachForMediaViewer attachForMediaViewer = (AttachForMediaViewer) j5g.b0(intValue, (List) obj3);
                if (attachForMediaViewer == null) {
                    return null;
                }
                int xb = attachForMediaViewer.xb();
                com.vk.im.ui.components.msg_list.a aVar = chatFragment.H0;
                return (aVar == null ? null : aVar).m1(xb);
            case 6:
                nre nreVar = (nre) obj2;
                vre.b bVar5 = (vre.b) ((vre) obj3);
                List<VideoFile> list2 = bVar5.f;
                UserId userId = bVar5.q;
                ad0.D(userId, bVar5.j, list2);
                vve vveVar = nreVar.i;
                boolean z2 = nreVar.f.d;
                vveVar.getClass();
                vve.d(tve.a, z2, true);
                iqe.a.onNext(new kqe.a(userId));
                nreVar.m.b(ore.a.a);
                hqe hqeVar = nreVar.o;
                if (hqeVar != null) {
                    hqeVar.b(new eqe.c(userId));
                }
                return s3q0.a;
            case 7:
                mdg mdgVar = (mdg) obj3;
                io.reactivex.rxjava3.core.q qVar = (io.reactivex.rxjava3.core.q) obj2;
                NewsComment newsComment = (NewsComment) obj;
                CommentThread commentThread = newsComment.L;
                if (commentThread != null) {
                    newsComment.L = new CommentThread(0, commentThread.c, commentThread.d, commentThread.e, new ArrayList(), commentThread.g, null, commentThread.i, commentThread.j);
                }
                mdgVar.n8(newsComment);
                return qVar;
            case 8:
                fzg fzgVar = (fzg) obj2;
                long j = fzgVar.d.b;
                Float f2 = fzgVar.k;
                Integer num = fzgVar.l;
                Integer valueOf3 = Integer.valueOf(fzgVar.i);
                String str2 = fzgVar.f;
                ((yyg) obj3).g.a(new gyh.b(j, f2, num, valueOf3, str2, fzgVar.o, Integer.valueOf(str2.length())));
                return s3q0.a;
            case 9:
                return kn00.a((kn00) obj, (r8h) obj3, null, null, 0, null, null, (kdh) obj2, 1789);
            case 10:
                vuh vuhVar = (vuh) obj3;
                VideoFile videoFile = (VideoFile) obj2;
                bpn0 bpn0Var = VideoOverlayView.I;
                VkImage vkImage = vuhVar.u;
                VideoOverlayView videoOverlayView = vuhVar.v;
                uuh uuhVar = new uuh(1, vuhVar.G, io.reactivex.rxjava3.disposables.g.class, "set", "set(Lio/reactivex/rxjava3/disposables/Disposable;)Z", 8, 0);
                boolean c = fxc0.B().c(videoFile);
                VideoRestriction O = videoFile.O();
                com.vk.libvideo.design.view.overlay.b a3 = O != null ? ((a390) vuhVar.r.getValue()).a(O) : null;
                boolean z3 = videoFile.d8() || videoFile.z0();
                VideoPipStateHolder.a.getClass();
                yg5 c2 = VideoPipStateHolder.c();
                VideoOverlayView.b.a(new VideoOverlayView.a(vkImage, videoOverlayView, new s(i4, vuhVar, videoFile), uuhVar, null, false, false, c, new pce(videoFile, i4), new ks2(i3, vuhVar, videoFile), a3, z3, epx.f((c2 == null || (A = c2.A()) == null) ? null : A.a1(), videoFile.a1()), new b1h(vuhVar, i5), (i1t0) vuhVar.s.getValue(), null, 65776));
                return s3q0.a;
            case 11:
                return new gig0((ViewGroup) obj, new eyh((fyh) obj2), ((Boolean) ((com.vk.movika.sdk.base.logic.interactor.h) obj3).invoke()).booleanValue(), cn70.b(16));
            case 12:
                gkj gkjVar = (gkj) obj3;
                hpd0 hpd0Var = (hpd0) obj2;
                mkj mkjVar = (mkj) obj;
                return mkj.a(mkjVar, null, dkj.b(mkjVar.c, gkjVar.c, hpd0Var, true), dkj.b(mkjVar.d, gkjVar.c, hpd0Var, true), false, null, false, 0, null, 249);
            case 13:
                j1z j1zVar = (j1z) obj3;
                yk8 yk8Var = (yk8) obj2;
                ggj ggjVar = (ggj) obj;
                ggjVar.s1();
                if (((Boolean) ((zak0) j1zVar.s).getValue()).booleanValue() || ((Boolean) ((zak0) j1zVar.t).getValue()).booleanValue()) {
                    oio.x1(ggjVar, yk8Var, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 0, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                }
                return s3q0.a;
            case 14:
                ((wh50) obj3).setValue((List) obj);
                ((wh50) obj2).setValue(Boolean.FALSE);
                return s3q0.a;
            case 15:
                w2w w2wVar = (w2w) obj3;
                drm drmVar2 = (drm) obj2;
                hrm hrmVar = hrm.a;
                xgl0 I0 = w2wVar.I0();
                gkx0 gkx0Var = drmVar2.a;
                pum pumVar = drmVar2.b;
                int i8 = drmVar2.c;
                hrm.b bVar6 = (hrm.b) I0.c(new vl1(new hrm.c(gkx0Var, pumVar, i8), 26));
                Trace.beginSection(ndp0.f("DialogsHistoryGetByCacheHelper.load dialogsHistory"));
                try {
                    List<arm> list3 = bVar6.a;
                    Set<Long> set2 = bVar6.c;
                    List<arm> list4 = list3;
                    ArrayList arrayList3 = new ArrayList(c5g.u(list4, 10));
                    for (arm armVar : list4) {
                        Serializer.c<Peer> cVar = Peer.CREATOR;
                        arrayList3.add(Peer.a.b(armVar.a));
                    }
                    if (arrayList3.isEmpty()) {
                        arrayList3 = null;
                    }
                    if (arrayList3 != null) {
                        wpp wppVar = (wpp) w2wVar.b1(hrmVar, new tqm(arrayList3, Source.CACHE));
                        if (!wppVar.a.isEmpty() && i8 > 1) {
                            L l = L.a;
                            l.getClass();
                            if (!L.m(LoggerOutputTarget.NONE)) {
                                L.u(l, L.LogType.d, new Object[]{"DialogMissedIssue", "Can't load dialogs " + wppVar.a + ' ' + drmVar2});
                            }
                        }
                        List<arm> list5 = bVar6.a;
                        arrayList = new ArrayList();
                        for (arm armVar2 : list5) {
                            drm drmVar3 = drmVar2;
                            Dialog dialog = (Dialog) wppVar.c.get(Long.valueOf(armVar2.a));
                            if (dialog != null) {
                                dialog.Bd(armVar2.d);
                            } else {
                                dialog = null;
                            }
                            if (dialog != null) {
                                arrayList.add(dialog);
                            }
                            drmVar2 = drmVar3;
                        }
                    } else {
                        arrayList = null;
                    }
                    drm drmVar4 = drmVar2;
                    RandomAccess randomAccess = arrayList;
                    if (arrayList == null) {
                        randomAccess = EmptyList.b;
                    }
                    Trace.endSection();
                    Trace.beginSection(ndp0.f("DialogsHistoryGetByCacheHelper.load latestMsgs"));
                    try {
                        LinkedHashMap a4 = hrm.a(w2wVar, bVar6);
                        Trace.endSection();
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj5 : (Iterable) randomAccess) {
                            if (((Dialog) obj5).Bc()) {
                                arrayList4.add(obj5);
                            }
                        }
                        ArrayList arrayList5 = new ArrayList(c5g.u(arrayList4, 10));
                        Iterator it = arrayList4.iterator();
                        while (it.hasNext()) {
                            arrayList5.add(((Dialog) it.next()).Sb());
                        }
                        if (!arrayList5.isEmpty() && i8 > 1) {
                            L l2 = L.a;
                            l2.getClass();
                            if (!L.m(LoggerOutputTarget.NONE)) {
                                L.LogType logType = L.LogType.d;
                                StringBuilder sb = new StringBuilder("DialogCacheHelper: pinned dialogs ");
                                sb.append(arrayList5);
                                sb.append(' ');
                                drmVar = drmVar4;
                                sb.append(drmVar);
                                L.u(l2, logType, new Object[]{"DialogMissedIssue", sb.toString()});
                                set = set2;
                                if (!set.isEmpty() && i8 > 1) {
                                    L l3 = L.a;
                                    l3.getClass();
                                    if (!L.m(LoggerOutputTarget.NONE)) {
                                        L.u(l3, L.LogType.d, new Object[]{"DialogMissedIssue", "Expired dialogs " + set2 + ' ' + drmVar});
                                    }
                                }
                                DialogsHistory dialogsHistory = new DialogsHistory(z ? 1 : 0, 31);
                                dialogsHistory.k().addAll((Collection) randomAccess);
                                dialogsHistory.A(a4);
                                dialogsHistory.d().addAll(set);
                                dialogsHistory.w(bVar6.d);
                                dialogsHistory.x(bVar6.e);
                                dialogsHistory.y(bVar6.f);
                                dialogsHistory.z(bVar6.g);
                                return dialogsHistory;
                            }
                        }
                        drmVar = drmVar4;
                        set = set2;
                        if (!set.isEmpty()) {
                            L l32 = L.a;
                            l32.getClass();
                            if (!L.m(LoggerOutputTarget.NONE)) {
                            }
                        }
                        DialogsHistory dialogsHistory2 = new DialogsHistory(z ? 1 : 0, 31);
                        dialogsHistory2.k().addAll((Collection) randomAccess);
                        dialogsHistory2.A(a4);
                        dialogsHistory2.d().addAll(set);
                        dialogsHistory2.w(bVar6.d);
                        dialogsHistory2.x(bVar6.e);
                        dialogsHistory2.y(bVar6.f);
                        dialogsHistory2.z(bVar6.g);
                        return dialogsHistory2;
                    } finally {
                        Trace.endSection();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            case 16:
                vop vopVar = (vop) obj3;
                String str3 = (String) obj2;
                VkAuthValidatePhoneResult vkAuthValidatePhoneResult = (VkAuthValidatePhoneResult) obj;
                RegistrationStatParamsFactory.a = RegistrationStatFlowType.AUTH_WITHOUT_PASSWORD;
                SignUpDataHolder signUpDataHolder = vopVar.p;
                if (signUpDataHolder == null) {
                    signUpDataHolder = null;
                }
                signUpDataHolder.f = true;
                sir0 sir0Var = sir0.a;
                com.vk.auth.main.e eVar = vopVar.o;
                if (eVar == null) {
                    eVar = null;
                }
                sir0.a aVar2 = new sir0.a(null, str3, vkAuthValidatePhoneResult);
                VerificationStatStartedFromReg verificationStatStartedFromReg = new VerificationStatStartedFromReg(false);
                sir0Var.getClass();
                sir0.d(eVar, aVar2, verificationStatStartedFromReg, false);
                return s3q0.a;
            case 17:
                VkBlurView vkBlurView = (VkBlurView) obj3;
                BitmapShader bitmapShader = (BitmapShader) obj2;
                int i9 = FeedProductContentBadge.q;
                vkBlurView.setColorOverlayShader(bitmapShader);
                vkBlurView.setFallbackColorOverlay(bitmapShader);
                return s3q0.a;
            case 18:
                ((etv0) obj).b(false);
                ((lrs) obj3).a.a((VkOnboardingCampaign) obj2, VkOnboardingType.Tooltip, e8v0.e.b);
                return s3q0.a;
            case 19:
                ((xbt) obj3).T(new edt.f.a((GamesCatalogScreenTab) obj2, h03.a((Throwable) obj)));
                return s3q0.a;
            case 20:
                ofy ofyVar = (ofy) obj2;
                y4l0 y4l0Var = ((nfy) obj3).l;
                if (y4l0Var != null) {
                    y4l0Var.j(ofyVar.b);
                }
                return s3q0.a;
            case 21:
                wqs0.l.a aVar3 = (wqs0.l.a) obj2;
                return VideoLargeListState.a((VideoLargeListState) obj, null, false, false, null, null, null, false, null, null, null, null, null, null, (fjz) obj3, new WeakReference(aVar3.d), new WeakReference(aVar3.c), null, null, 0, 59768831);
            case 22:
                Context context = (Context) obj2;
                UserId Ab = ((ptz) obj3).b.Ab();
                if (fkq0.c(Ab)) {
                    xwk.e().m(context, Ab, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                }
                return s3q0.a;
            case 23:
                n010 n010Var = (n010) obj3;
                MarketItemCommentsArgs marketItemCommentsArgs = (MarketItemCommentsArgs) obj2;
                b110 b110Var = (b110) obj;
                Boolean bool = b110Var.d;
                mzp0 mzp0Var = n010Var.g;
                if (mzp0Var != null) {
                    mzp0Var.c(false);
                }
                n010Var.i.b(new m010.a(marketItemCommentsArgs.b, marketItemCommentsArgs.d, marketItemCommentsArgs.c, bool != null ? bool.booleanValue() : false, marketItemCommentsArgs.e, marketItemCommentsArgs.f));
                n010Var.T(new d110.a.d(marketItemCommentsArgs.b, marketItemCommentsArgs.c, b110Var.c, bool != null ? bool.booleanValue() : false, b110Var.a, b110Var.b));
                return s3q0.a;
            case 24:
                w920 w920Var = (w920) obj2;
                io.reactivex.rxjava3.disposables.c cVar2 = (io.reactivex.rxjava3.disposables.c) obj;
                if (((ipz.a) obj3).b != Source.CACHE) {
                    w920Var.u.b(cVar2);
                }
                return s3q0.a;
            case 25:
                String str4 = (String) obj3;
                String str5 = (String) obj2;
                qyg0 V0 = ((hyg0) obj).V0("UPDATE playlists_to_tracks SET music_track_id = ? WHERE music_track_id == ?");
                try {
                    V0.D3(1, str4);
                    V0.D3(2, str5);
                    V0.step();
                    V0.close();
                    return s3q0.a;
                } catch (Throwable th2) {
                    V0.close();
                    throw th2;
                }
            case 26:
                myc0.h((yvj) obj3, null, null, new cg80.a((mc90) obj2, ((Float) obj).floatValue(), null), 3);
                return s3q0.a;
            case 27:
                int i10 = PastBroadcastsFragment.U;
                ((PastBroadcastsFragment) obj3).fo((a.C2011a) obj, (PastBroadcastsFragment.c) obj2);
                return s3q0.a;
            case 28:
                ((p1a0) obj3).d.a((VkOnboardingCampaign) obj2, VkOnboardingType.Tooltip, e8v0.m.b);
                return s3q0.a;
            default:
                izs izsVar = (izs) obj3;
                a.C0919a c0919a = (a.C0919a) obj2;
                int i11 = trd0.$EnumSwitchMapping$0[((srd0) srd0.h().get(((ModalActionSheetListItem) obj).a)).ordinal()];
                if (i11 == 1) {
                    izsVar.invoke(new rv9.i.e(c0919a));
                } else {
                    if (i11 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    izsVar.invoke(new rv9.i.g(c0919a));
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ bi0(com.vk.cameraui.impl.a aVar, yz10 yz10Var, Ref$BooleanRef ref$BooleanRef) {
        this.b = 2;
        this.c = yz10Var;
        this.d = ref$BooleanRef;
    }
}
