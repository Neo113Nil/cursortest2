package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.util.Size;
import androidx.lifecycle.Lifecycle;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.friends.dto.FriendsFriendsListDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullAgeMarkDto;
import com.vk.auth.validation.VkValidatePhoneInfo;
import com.vk.catalog.mvi.block.video.impl.video.trailer.VideoTrailerView$State;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.channelrestrictions.ChannelRestrictionsComponent;
import com.vk.channelrestrictions.RestrictionBadge;
import com.vk.channelrestrictions.WarningNotification;
import com.vk.channelrestrictions.WarningReason;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.common.links.LaunchContext;
import com.vk.core.tool.view.vkblur.VkBlurContentView;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.Image;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.im.engine.models.attaches.AttachWall;
import com.vk.log.L;
import com.vk.newsfeed.impl.requests.WallWithCounters;
import com.vk.permission.PermissionHelper;
import com.vk.search.ui.api.di.SearchUiComponent;
import com.vk.stat.scheme.CommonVideoStat$ContentWarningBlockType;
import com.vk.stat.scheme.CommonVideoStat$TypeVideoContentWarningModalView;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeSystemPushClick;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoOpenAuthorCabinetClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeView;
import com.vk.stickers.keyboard.page.StickersRecyclerView;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.video.profile.presentation.VideoProfileFragmentOld;
import com.vk.video.profile.presentation.VideoProfileSource;
import com.vk.video.profile.presentation.a;
import com.vk.video.profile.presentation.catalog.VideoProfileCatalogFragment;
import com.vk.video.profile.presentation.catalog.holders.VideoProfileCatalogContentVh;
import com.vk.video.profile.presentation.h;
import com.vk.video.profile.presentation.models.StateSubscribeNotification;
import com.vk.video.profile.presentation.views.VideoNewProfileHeaderViewV2;
import com.vk.video.profile.presentation.views.creatoronboarding.items.VideoProfileCreatorOnboardingItemType;
import com.vk.video.ui.discovery.minimizable.related_videos.h;
import com.vk.vmoji.character.model.VmojiProductUnlockInfoButtonModel;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.bex0;
import xsna.c9t0;
import xsna.dwv0;
import xsna.f8t0;
import xsna.gm50;
import xsna.h7u0;
import xsna.ikv0;
import xsna.khm0;
import xsna.l9s0;
import xsna.m7t0;
import xsna.njm0;
import xsna.qlw;
import xsna.qn60;
import xsna.qtk0;
import xsna.sw50;
import xsna.tra0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class b8e0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b8e0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v134, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v194, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v86, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        Activity h;
        CommonVideoStat$ContentWarningBlockType commonVideoStat$ContentWarningBlockType;
        f8t0.c.d dVar;
        int i = this.b;
        int i2 = 29;
        int i3 = 8;
        int i4 = 15;
        int i5 = 5;
        int i6 = 2;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((f880) obj2).invoke();
                return s3q0.a;
            case 1:
                return new sze0((io.reactivex.rxjava3.disposables.b) obj2);
            case 2:
                ((hqj) obj2).a(obj);
                return s3q0.a;
            case 3:
                ((ikv0) obj).a();
                ((geh0) obj2).c.invoke();
                return s3q0.a;
            case 4:
                ixi0 ixi0Var = (ixi0) obj2;
                int i7 = r9i0.j1;
                ixi0Var.h = EmptyList.b;
                ixi0Var.b();
                ixi0Var.a(null);
                return s3q0.a;
            case 5:
                return Boolean.valueOf(epx.f(((mdi0) obj).a, (q4t) obj2));
            case 6:
                ((VkBlurContentView) obj).setCaptureEnabled(!((a9k0) obj2).f());
                return s3q0.a;
            case 7:
                vjk0 vjk0Var = ((bkk0) obj2).G;
                if (vjk0Var != null) {
                    vjk0Var.a0();
                }
                return s3q0.a;
            case 8:
                int i8 = StickersRecyclerView.w;
                ((StickersRecyclerView) obj2).getClass();
                return Boolean.valueOf(obj instanceof a9w0);
            case 9:
                ((x3m0) obj2).m.h((String) obj);
                return s3q0.a;
            case 10:
                mfm0 mfm0Var = (mfm0) obj2;
                khm0.a aVar = (khm0.a) obj;
                gm50.a.a(mfm0Var, aVar.a, new c230(mfm0Var, i2));
                gm50.a.a(mfm0Var, aVar.b, new ksg0(mfm0Var, i3));
                return s3q0.a;
            case 11:
                Throwable th = (Throwable) obj;
                L.i(th);
                ((ajm0) obj2).i.b(new njm0.b(th));
                return s3q0.a;
            case 12:
                g3n0 g3n0Var = (g3n0) obj2;
                lgb lgbVar = g3n0Var.m;
                f3n0 f3n0Var = g3n0Var.n;
                lgbVar.J(f3n0Var == null ? null : f3n0Var);
                return s3q0.a;
            case 13:
                r4n0 r4n0Var = (r4n0) obj2;
                WallWithCounters wallWithCounters = (WallWithCounters) obj;
                i5n0 i5n0Var = r4n0Var.f;
                i5n0Var.b.a();
                return new io.reactivex.rxjava3.internal.operators.single.b(new nvc0(i5n0Var.a, new qn60.b[]{new aic(), new xc3(wallWithCounters, null, i5n0Var.b, r4n0Var.g, null, true, null)}, 1)).l(new mvc0(new bjm0(wallWithCounters, i6), i5));
            case 14:
                mg6 mg6Var = (mg6) obj2;
                nao0 nao0Var = (nao0) mg6Var.b;
                String str2 = (String) obj;
                if (str2.equals("service_terms")) {
                    nao0Var.U();
                } else if (str2.equals("service_policy")) {
                    nao0Var.j();
                } else {
                    ((q1z) mg6Var.f.getValue()).a(str2);
                }
                return s3q0.a;
            case 15:
                ((tra0.a) obj).q((tra0) obj2, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return s3q0.a;
            case 16:
                ((AttachWall) obj).q = ((s7q0) obj2).c;
                return s3q0.a;
            case 17:
                isq0 isq0Var = (isq0) obj2;
                WallWithCounters wallWithCounters2 = (WallWithCounters) obj;
                return new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.r(io.reactivex.rxjava3.core.x.k(wallWithCounters2), new ie40(new gsq0(isq0Var, 0), 18)).l(new je40(new hsq0(isq0Var, null == true ? 1 : 0), i4)), new rt10(new bl30(isq0Var, i2), 20)).l(new wii0(new mdk0(wallWithCounters2, 7), 11));
            case 18:
                ((ubr0) obj2).c.j(JsApiMethodType.SHOW_INVITE_BOX, VkAppsErrors.b((Throwable) obj));
                return s3q0.a;
            case 19:
                sbs0 sbs0Var = (sbs0) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    sbs0Var.b();
                }
                return s3q0.a;
            case 20:
                ((com.vk.video.ui.discovery.minimizable.related_videos.k) obj2).l(h.b.a);
                return s3q0.a;
            case 21:
                ((cls0) obj2).a.j(k15.A((SdkVideoFile) obj));
                return s3q0.a;
            case 22:
                ezn eznVar = (ezn) obj;
                izs<? super ezn, s3q0> izsVar = ((VideoNewProfileHeaderViewV2) obj2).v;
                if (izsVar != null) {
                    izsVar.invoke(eznVar);
                }
                return s3q0.a;
            case 23:
                VideoProfileFragmentOld videoProfileFragmentOld = (VideoProfileFragmentOld) obj2;
                ?? r2 = videoProfileFragmentOld.d0;
                com.vk.video.profile.presentation.h hVar = (com.vk.video.profile.presentation.h) obj;
                int i9 = VideoProfileFragmentOld.p0;
                if (hVar instanceof h.i) {
                    h.i iVar = (h.i) hVar;
                    videoProfileFragmentOld.go().a().f(videoProfileFragmentOld.kn(), iVar.a, iVar.b);
                } else if (hVar instanceof h.s) {
                    int i10 = ((h.s) hVar).a;
                    RestrictionBadge restrictionBadge = i10 == GroupsGroupFullAgeMarkDto.OVER_18.i() ? RestrictionBadge.OVER_18 : i10 == GroupsGroupFullAgeMarkDto.OVER_16.i() ? RestrictionBadge.OVER_16 : null;
                    if (restrictionBadge != null) {
                        ((ChannelRestrictionsComponent) r2.getValue()).h2().a(restrictionBadge, videoProfileFragmentOld.kn().getSupportFragmentManager());
                    }
                } else if (hVar instanceof h.a0) {
                    h.a0 a0Var = (h.a0) hVar;
                    UserId userId = a0Var.a;
                    WarningNotification warningNotification = a0Var.b;
                    videoProfileFragmentOld.go().a().d(videoProfileFragmentOld.kn());
                    WarningReason.a aVar2 = WarningReason.Companion;
                    int i11 = warningNotification.b;
                    aVar2.getClass();
                    WarningReason a = WarningReason.a.a(i11);
                    m7t0 m7t0Var = new m7t0();
                    long j = userId.b;
                    int i12 = m7t0.a.$EnumSwitchMapping$0[a.ordinal()];
                    if (i12 == 1) {
                        commonVideoStat$ContentWarningBlockType = CommonVideoStat$ContentWarningBlockType.CONTROVERSIAL;
                    } else if (i12 == 2 || i12 == 3 || i12 == 4) {
                        commonVideoStat$ContentWarningBlockType = CommonVideoStat$ContentWarningBlockType.FALSE_INFO;
                    } else {
                        if (i12 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        commonVideoStat$ContentWarningBlockType = null;
                    }
                    if (commonVideoStat$ContentWarningBlockType != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        UiTracker uiTracker = UiTracker.a;
                        new bvt0(UiTracker.c(), SchemeStat$TypeView.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.BANNER, null, null, null, null, null, 62, null), String.valueOf(currentTimeMillis), String.valueOf(currentTimeMillis), null, new CommonVideoStat$TypeVideoContentWarningModalView(CommonVideoStat$TypeVideoContentWarningModalView.EventType.WARNING_NOTIFICATION_VIEW, commonVideoStat$ContentWarningBlockType, j), 8)).q();
                    }
                    ((ChannelRestrictionsComponent) r2.getValue()).ad().a(videoProfileFragmentOld.kn(), a, false, new j2b(m7t0Var, a, userId, videoProfileFragmentOld), new qc3(m7t0Var, a, userId, videoProfileFragmentOld, warningNotification), new xm6(m7t0Var, a, userId), warningNotification);
                } else if (hVar instanceof h.c) {
                    ((ChannelRestrictionsComponent) r2.getValue()).ad().b(videoProfileFragmentOld.kn());
                } else if (hVar.equals(h.j.a)) {
                    videoProfileFragmentOld.go().a().g(videoProfileFragmentOld.kn());
                } else if (hVar instanceof h.k) {
                    videoProfileFragmentOld.go().a().a(videoProfileFragmentOld.kn(), ((h.k) hVar).a);
                } else if (hVar instanceof h.r) {
                    h.r rVar = (h.r) hVar;
                    String str3 = rVar.a;
                    UserId userId2 = rVar.b;
                    StringBuilder sb = new StringBuilder("https://vkvideo.ru/@");
                    if (str3 == null) {
                        str3 = userId2;
                    }
                    sb.append((Object) str3);
                    String sb2 = sb.toString();
                    if (o25.a().b()) {
                        kbj0.c(nr4.b(), videoProfileFragmentOld.requireContext(), sb2, fkq0.b(userId2), null, null, false, 120);
                    } else {
                        nr4.b().y(videoProfileFragmentOld.requireContext(), sb2);
                    }
                    ((lzh0) videoProfileFragmentOld.k0.getValue()).a(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SHARE_OUT);
                } else if (hVar.equals(h.d.a)) {
                    videoProfileFragmentOld.go().a().e(videoProfileFragmentOld.kn());
                } else if (hVar instanceof h.o) {
                    videoProfileFragmentOld.go().a().b(videoProfileFragmentOld.kn(), ((h.o) hVar).a);
                } else if (hVar instanceof h.p) {
                    VideoProfileCatalogFragment fo = videoProfileFragmentOld.fo();
                    if (fo != null) {
                        CatalogRootViewHolder catalogRootViewHolder = fo.P;
                        VideoProfileCatalogContentVh videoProfileCatalogContentVh = catalogRootViewHolder instanceof VideoProfileCatalogContentVh ? (VideoProfileCatalogContentVh) catalogRootViewHolder : null;
                        if (videoProfileCatalogContentVh != null) {
                            videoProfileCatalogContentVh.s.d();
                        }
                    }
                } else if (hVar instanceof h.l) {
                    ((SearchUiComponent) videoProfileFragmentOld.T.getValue()).G9(videoProfileFragmentOld.requireContext(), new SearchUiComponent.a.InterfaceC1776a.b(((h.l) hVar).a.b));
                } else if (hVar instanceof h.x) {
                    xn50.a.c(videoProfileFragmentOld, a.z.b);
                    if (fxc0.B().J().u0()) {
                        edt0 edt0Var = videoProfileFragmentOld.f0;
                        if (edt0Var != null) {
                            edt0Var.a();
                        }
                    } else {
                        ikv0.a aVar3 = new ikv0.a(videoProfileFragmentOld.requireContext());
                        aVar3.k = 1;
                        aVar3.l = 1;
                        aVar3.u = new ikv0.d(videoProfileFragmentOld.requireContext().getString(R.string.video_profile_video_offline_open_online), (String) null, (ikv0.d.a) null, 6);
                        aVar3.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, videoProfileFragmentOld.requireContext().getString(R.string.video_profile_video_offline_open_catalog), new xim0(videoProfileFragmentOld, 10));
                        aVar3.n();
                    }
                } else if (hVar instanceof h.z) {
                    nht0 nht0Var = videoProfileFragmentOld.e0;
                    if (nht0Var != null) {
                        nht0Var.a();
                    }
                } else if (hVar instanceof h.C1963h) {
                    videoProfileFragmentOld.go().a().c(videoProfileFragmentOld.kn());
                } else if (hVar instanceof h.v) {
                    e4h.l(xwk.e().h0(), videoProfileFragmentOld.requireContext(), ((h.v) hVar).a, new hij0(videoProfileFragmentOld, i4), null, 24);
                } else {
                    int i13 = 12;
                    if (hVar instanceof h.t) {
                        StateSubscribeNotification stateSubscribeNotification = ((h.t) hVar).a;
                        Context mo2getContext = videoProfileFragmentOld.mo2getContext();
                        if (mo2getContext != null) {
                            ikv0.a aVar4 = new ikv0.a(mo2getContext);
                            aVar4.k = 1;
                            aVar4.l = 1;
                            aVar4.o = Integer.valueOf(iah0.a(8));
                            aVar4.h = new qjg0(videoProfileFragmentOld, 16);
                            int i14 = VideoProfileFragmentOld.b.$EnumSwitchMapping$0[stateSubscribeNotification.ordinal()];
                            if (i14 == 1) {
                                aVar4.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_accent_themed), (Size) null, 12);
                                aVar4.u = new ikv0.d(mo2getContext.getString(R.string.community_subscribed), (String) null, (ikv0.d.a) null, 6);
                            } else if (i14 == 2) {
                                aVar4.t = new ikv0.c.C3058c(R.drawable.vk_icon_minus_square_outline_28, Integer.valueOf(R.attr.vk_ui_icon_accent_themed), (Size) null, 12);
                                aVar4.u = new ikv0.d(mo2getContext.getString(R.string.community_unsubscribed), (String) null, (ikv0.d.a) null, 6);
                                aVar4.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, mo2getContext.getString(R.string.cancel), new vgs0(videoProfileFragmentOld, r11));
                            } else if (i14 == 3) {
                                aVar4.t = new ikv0.c.C3058c(R.drawable.vk_icon_notification_waves_28, Integer.valueOf(R.attr.vk_ui_icon_accent_themed), (Size) null, 12);
                                aVar4.u = new ikv0.d(mo2getContext.getString(R.string.live_notifications_enabled), (String) null, (ikv0.d.a) null, 6);
                            } else if (i14 == 4) {
                                aVar4.t = new ikv0.c.C3058c(R.drawable.vk_icon_notification_outline_24, Integer.valueOf(R.attr.vk_ui_icon_accent_themed), (Size) null, 12);
                                aVar4.u = new ikv0.d(mo2getContext.getString(R.string.live_notifications_enabled_prefer), (String) null, (ikv0.d.a) null, 6);
                            } else {
                                if (i14 != 5) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar4.t = new ikv0.c.C3058c(R.drawable.vk_icon_notification_slash_outline_24, Integer.valueOf(R.attr.vk_ui_icon_accent_themed), (Size) null, 12);
                                aVar4.u = new ikv0.d(mo2getContext.getString(R.string.live_notifications_disabled_subscribe), (String) null, (ikv0.d.a) null, 6);
                            }
                            pkv0.e(aVar4);
                            videoProfileFragmentOld.g0 = pkv0.f(aVar4);
                        }
                    } else if (hVar.equals(h.m.a)) {
                        new bjc(MobileOfficialAppsCoreNavStat$EventScreen.VIDEO_PROFILE, SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), new MobileOfficialAppsVideoStat$TypeSystemPushClick(null, 1, null == true ? 1 : 0), 2)).q();
                        Context mo2getContext2 = videoProfileFragmentOld.mo2getContext();
                        if (mo2getContext2 != null && (h = e3m.h(mo2getContext2)) != null) {
                            PermissionHelper.v(PermissionHelper.a, h);
                        }
                    } else if (hVar instanceof h.w) {
                        Context mo2getContext3 = videoProfileFragmentOld.mo2getContext();
                        if (mo2getContext3 != null) {
                            ikv0.a aVar5 = new ikv0.a(mo2getContext3);
                            aVar5.k = 1;
                            aVar5.l = 1;
                            Context mo2getContext4 = videoProfileFragmentOld.mo2getContext();
                            aVar5.u = new ikv0.d(mo2getContext4 != null ? mo2getContext4.getString(R.string.vk_video_loading_error_text) : null, (String) null, (ikv0.d.a) null, 6);
                            aVar5.n();
                        }
                    } else if (hVar instanceof h.a) {
                        h.a aVar6 = (h.a) hVar;
                        Owner owner = aVar6.a;
                        boolean z = aVar6.b;
                        bpn0 bpn0Var = rwi.d;
                        sw50.f g = ((sw50) (bpn0Var != null ? bpn0Var : null).getValue()).g();
                        jbs jbsVar = new jbs(videoProfileFragmentOld);
                        int i15 = z ? 3912 : 3901;
                        UserId userId3 = owner.b;
                        String str4 = owner.c;
                        g.c(jbsVar, userId3, str4 != null ? str4 : "", i15);
                    } else if (hVar instanceof h.f) {
                        h.f fVar = (h.f) hVar;
                        UserId userId4 = fVar.a;
                        String str5 = fVar.b;
                        bpn0 bpn0Var2 = xg5.a;
                        ((cpu) (bpn0Var2 != null ? bpn0Var2 : null).getValue()).s(videoProfileFragmentOld.requireContext(), userId4, (r13 & 4) != 0 ? null : "open_page", (r13 & 8) != 0 ? null : "info", (r13 & 16) == 0 ? "co_owners" : null);
                    } else if (hVar instanceof h.n) {
                        l9s0.a.a(videoProfileFragmentOld.requireContext(), ((h.n) hVar).a);
                    } else if (hVar instanceof h.e) {
                        ydt0 Y = fxc0.B().Y();
                        videoProfileFragmentOld.requireContext();
                        Y.getClass();
                        new bjc(MobileOfficialAppsCoreNavStat$EventScreen.VIDEO_PROFILE, SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), new MobileOfficialAppsVideoStat$TypeVideoOpenAuthorCabinetClick(null, 1, null == true ? 1 : 0), 2)).q();
                    } else if (hVar instanceof h.g) {
                        VideoProfileCatalogFragment fo2 = videoProfileFragmentOld.fo();
                        if (fo2 != null) {
                            CatalogRootViewHolder catalogRootViewHolder2 = fo2.P;
                            VideoProfileCatalogContentVh videoProfileCatalogContentVh2 = catalogRootViewHolder2 instanceof VideoProfileCatalogContentVh ? (VideoProfileCatalogContentVh) catalogRootViewHolder2 : null;
                            if (videoProfileCatalogContentVh2 != null && (str = videoProfileCatalogContentVh2.y) != null) {
                                videoProfileCatalogContentVh2.A(str);
                            }
                        }
                    } else if (hVar instanceof h.u) {
                        cys0 cys0Var = videoProfileFragmentOld.h0;
                        if (cys0Var != null) {
                            String str6 = ((h.u) hVar).a;
                            tsk0 tsk0Var = new tsk0(videoProfileFragmentOld, 24);
                            VkButton vkButton = cys0Var.i0.l;
                            if (vkButton != null) {
                                bwt0.j(vkButton, new dnh0(i13, str6, tsk0Var));
                            }
                        }
                    } else if (hVar instanceof h.y) {
                        cys0 cys0Var2 = videoProfileFragmentOld.h0;
                        if (cys0Var2 != null) {
                            String str7 = ((h.y) hVar).a;
                            d8t0 d8t0Var = new d8t0(videoProfileFragmentOld, 0);
                            VkButton vkButton2 = cys0Var2.i0.o;
                            if (vkButton2 != null) {
                                bwt0.j(vkButton2, new snj0(str7, d8t0Var));
                            }
                        }
                    } else if (hVar instanceof h.b) {
                        cys0 cys0Var3 = videoProfileFragmentOld.h0;
                        if (cys0Var3 != null) {
                            String string = videoProfileFragmentOld.getString(R.string.video_profile_creator_onboarding_tooltip);
                            gd0 gd0Var = new gd0(19, videoProfileFragmentOld, hVar);
                            ofc0 ofc0Var = new ofc0(videoProfileFragmentOld, 28);
                            VideoNewProfileHeaderViewV2 videoNewProfileHeaderViewV2 = cys0Var3.i0;
                            Lifecycle lifecycle = cys0Var3.V;
                            VkButton vkButton3 = videoNewProfileHeaderViewV2.p;
                            if (vkButton3 != null) {
                                bwt0.n(vkButton3, new ka2(vkButton3, string, lifecycle, ofc0Var, gd0Var, 1));
                                s3q0 s3q0Var = s3q0.a;
                            }
                        }
                    } else {
                        if (!(hVar instanceof h.q)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        VideoProfileCatalogFragment fo3 = videoProfileFragmentOld.fo();
                        if (fo3 != null) {
                            h.q qVar = (h.q) hVar;
                            n3a n3aVar = qVar.a;
                            boolean z2 = qVar.b;
                            CatalogRootViewHolder catalogRootViewHolder3 = fo3.P;
                            VideoProfileCatalogContentVh videoProfileCatalogContentVh3 = catalogRootViewHolder3 instanceof VideoProfileCatalogContentVh ? (VideoProfileCatalogContentVh) catalogRootViewHolder3 : null;
                            if (videoProfileCatalogContentVh3 != null) {
                                videoProfileCatalogContentVh3.m.b.e.b(n3aVar, z2);
                            }
                        }
                    }
                }
                return s3q0.a;
            case 24:
                o9t0 o9t0Var = (o9t0) obj2;
                Resources resources = o9t0Var.a;
                c9t0 c9t0Var = (c9t0) obj;
                boolean z3 = o9t0Var.g;
                if (c9t0Var instanceof c9t0.a) {
                    return f8t0.a.a;
                }
                if (!(c9t0Var instanceof c9t0.e)) {
                    if (c9t0Var instanceof c9t0.c) {
                        return f8t0.a.a;
                    }
                    if (c9t0Var instanceof c9t0.d) {
                        return f8t0.b.a;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                c9t0.e eVar = (c9t0.e) c9t0Var;
                VideoProfileSource videoProfileSource = eVar.c;
                qtk0<u490> qtk0Var = eVar.e;
                if (qtk0Var instanceof qtk0.b) {
                    return f8t0.b.a;
                }
                if (!(qtk0Var instanceof qtk0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                T t = ((qtk0.a) qtk0Var).a;
                Owner owner2 = ((u490) t).a;
                Image image = owner2.g;
                boolean b = fkq0.b(owner2.b);
                u490 u490Var = (u490) t;
                zog zogVar = u490Var.b;
                qlw bVar = image != null ? new qlw.b(image) : new qlw.a();
                String str8 = u490Var.a.c;
                f8t0.c.k bVar2 = (str8 == null || drm0.N(str8)) ? f8t0.c.k.a.a : new f8t0.c.k.b(str8);
                StringBuilder sb3 = new StringBuilder();
                gpt0 gpt0Var = gpt0.a;
                long j2 = u490Var.f;
                DecimalFormat decimalFormat = z8s.a;
                sb3.append((CharSequence) z8s.b(resources, j2, R.plurals.vk_video_counter_followers, R.string.vk_video_counter_followers_default_plural));
                sb3.append(" · ");
                sb3.append((CharSequence) z8s.b(resources, u490Var.d, R.plurals.vk_video_counter_videos, R.string.vk_video_counter_videos_default_plural));
                String sb4 = sb3.toString();
                f8t0.c.g bVar3 = !drm0.N(sb4) ? new f8t0.c.g.b(sb4) : f8t0.c.g.a.a;
                String str9 = u490Var.h;
                f8t0.c.j.a aVar7 = new f8t0.c.j.a(str9 != null ? str9 : "");
                qtk0<List<u490>> qtk0Var2 = eVar.d;
                boolean z4 = videoProfileSource instanceof VideoProfileSource.OwnProfile;
                f8t0.c.b aVar8 = (!z4 || (qtk0Var2 instanceof qtk0.a ? (List) ((qtk0.a) qtk0Var2).a : EmptyList.b).isEmpty()) ? f8t0.c.b.C2855b.a : new f8t0.c.b.a(eVar.f);
                Integer num = u490Var.t;
                f8t0.c.a aVar9 = (num != null && num.intValue() == 2) ? f8t0.c.a.C2853a.a : (num != null && num.intValue() == 3) ? f8t0.c.a.b.a : f8t0.c.a.C2854c.a;
                boolean z5 = eVar.g;
                boolean z6 = zogVar.a;
                boolean z7 = zogVar.b;
                boolean z8 = z6 || z7;
                UserId userId5 = u490Var.a.b;
                bpn0 bpn0Var3 = o25.a;
                if (bpn0Var3 == null) {
                    bpn0Var3 = null;
                }
                f8t0.c.i bVar4 = (epx.f(userId5, ((b25) bpn0Var3.getValue()).c()) || (fkq0.b(u490Var.a.b) && z8)) ? f8t0.c.i.a.a : new f8t0.c.i.b(u490Var.j, u490Var.i, !z5);
                VerifyInfo verifyInfo = u490Var.a.f;
                boolean z9 = verifyInfo != null && verifyInfo.b;
                f8t0.c.f fVar2 = (b && z6) ? f8t0.c.f.b.a : f8t0.c.f.a.a;
                boolean z10 = z6 || z7;
                s75 c = com.vk.toggle.d.c();
                f8t0.c.h hVar2 = (c == null || c.c.length() <= 0 || !b || !z10) ? f8t0.c.h.a.a : f8t0.c.h.b.a;
                f8t0.c.l lVar = (b && (z6 || z7)) ? f8t0.c.l.b.a : f8t0.c.l.a.a;
                f8t0.c.e eVar2 = new f8t0.c.e(o9t0Var.f.a(z4 || u490Var.b.a, u490Var.q, u490Var.r, false));
                p7t0 p7t0Var = u490Var.s;
                if (p7t0Var != null && z3 && resources.getConfiguration().orientation == 1 && z6) {
                    zrp<VideoProfileCreatorOnboardingItemType> h2 = VideoProfileCreatorOnboardingItemType.h();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : h2) {
                        VideoProfileCreatorOnboardingItemType videoProfileCreatorOnboardingItemType = (VideoProfileCreatorOnboardingItemType) obj3;
                        if (videoProfileCreatorOnboardingItemType != VideoProfileCreatorOnboardingItemType.AVATAR || !p7t0Var.a) {
                            if (videoProfileCreatorOnboardingItemType != VideoProfileCreatorOnboardingItemType.COVER || !p7t0Var.c) {
                                if (videoProfileCreatorOnboardingItemType != VideoProfileCreatorOnboardingItemType.DESCRIPTION || !p7t0Var.b) {
                                    arrayList.add(obj3);
                                }
                            }
                        }
                    }
                    dVar = new f8t0.c.d.b(arrayList);
                } else {
                    dVar = f8t0.c.d.a.a;
                }
                f8t0.c.d dVar2 = dVar;
                p7t0 p7t0Var2 = u490Var.s;
                return new f8t0.c(bVar, bVar2, bVar3, aVar7, fVar2, hVar2, lVar, aVar8, aVar9, bVar4, eVar2, dVar2, (p7t0Var2 != null && z3 && resources.getConfiguration().orientation == 1 && z6) ? new f8t0.c.InterfaceC2856c.b(p7t0Var2.d ? 3 : p7t0Var2.e) : f8t0.c.InterfaceC2856c.a.a, z9, u490Var.u != null, ((Boolean) o9t0Var.h.getValue()).booleanValue() && u490Var.a.w);
            case 25:
                return VideoTrailerView$State.a((VideoTrailerView$State) obj, null, null, null, null, null, null, false, ((VideoTrailerView$State) ((b2a) ((ylt0) obj2).b.b).getCurrentState()).g.m, false, 5119);
            case 26:
                ((u3a0) obj).b((VkValidatePhoneInfo) obj2);
                return s3q0.a;
            case 27:
                return Boolean.valueOf(epx.f(((piq) obj).a, (l7k0) obj2));
            case 28:
                final dwv0 dwv0Var = (dwv0) obj2;
                dwv0.b bVar5 = (dwv0.b) obj;
                final List<FriendsFriendsListDto> list = bVar5.c;
                String[] strArr = bVar5.a;
                final boolean[] zArr = bVar5.b;
                h7u0.a aVar10 = new h7u0.a(dwv0Var.e.kn());
                aVar10.g0(R.string.pick_lists);
                aVar10.V(strArr, zArr, new DialogInterface.OnMultiChoiceClickListener() { // from class: xsna.awv0
                    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
                    public final void onClick(DialogInterface dialogInterface, int i16, boolean z11) {
                        zArr[i16] = z11;
                    }
                });
                aVar10.a.n = new DialogInterface.OnCancelListener() { // from class: xsna.bwv0
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        r6y r6yVar = dwv0.this.b;
                        if (r6yVar != null) {
                            bex0.a.b(r6yVar, JsApiMethodType.FRIENDS_SEARCH, dwv0.a.b(new ArrayList()), null, 12);
                        }
                    }
                };
                aVar10.setPositiveButton(R.string.vk_ok, new DialogInterface.OnClickListener() { // from class: xsna.cwv0
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i16) {
                        ArrayList arrayList2 = new ArrayList();
                        boolean[] zArr2 = zArr;
                        int length = zArr2.length;
                        for (int i17 = 0; i17 < length; i17++) {
                            if (zArr2[i17]) {
                                arrayList2.add(Long.valueOf(((FriendsFriendsListDto) list.get(i17)).getId()));
                            }
                        }
                        r6y r6yVar = dwv0Var.b;
                        if (r6yVar != null) {
                            bex0.a.b(r6yVar, JsApiMethodType.FRIENDS_SEARCH, dwv0.a.b(arrayList2), null, 12);
                        }
                    }
                });
                aVar10.setNegativeButton(R.string.cancel, new d0p(dwv0Var, r11));
                aVar10.m();
                return s3q0.a;
            default:
                maz.c(xwk.d().e(), ((aaw0) obj2).b, ((VmojiProductUnlockInfoButtonModel) obj).c, LaunchContext.A, null, null, 24);
                return s3q0.a;
        }
    }
}
