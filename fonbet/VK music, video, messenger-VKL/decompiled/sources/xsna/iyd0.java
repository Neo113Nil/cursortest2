package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionFilter;
import com.vk.catalog2.common.ui.mvp.video.VideoPlaylistPlaceHolder;
import com.vk.clips.models.SdkClipOrdData;
import com.vk.clips.sdk.models.ImageUrl;
import com.vk.clips.sdk.models.SdkActionLink;
import com.vk.clips.viewer.edit.api.domain.model.ClipCoauthorSdkItem;
import com.vk.clips.viewer.edit.api.domain.model.ClipEditAttachedVideo;
import com.vk.clips.viewer.edit.api.domain.model.ClipEditSdkItem;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.ImageSizeKey;
import com.vk.dto.common.OrdAdInfo;
import com.vk.dto.common.OrdAdvertiser;
import com.vk.dto.common.clips.CoOwnerItem;
import com.vk.dto.common.id.UserId;
import com.vk.dto.hints.HintId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.stories.entities.OrdData;
import com.vk.photos.ui.base.BasePhotoListFragment;
import com.vk.photos.ui.profile.ProfilePhotoTag;
import com.vk.pin.views.dots.PinDotsView;
import com.vk.profile.design.view.profileheader.UserProfileBaseInfoState;
import com.vk.stickers.ContextUser;
import com.vk.stickers.keyboard.StickersView;
import com.vk.stickers.keyboard.b;
import com.vk.stickers.views.VKStickerImageView;
import com.vk.stickers.views.animation.VKAnimationView;
import com.vk.stories.design.view.editor.verticalization.VerticalizationPickerView;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.VideoRelatedVideosFragment;
import com.vk.voip.ui.menu.ui.actions.PrimaryActionsView;
import com.vk.voip.ui.whiteboard.presentation.main.ui.WhiteboardFragment;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import ru.ok.android.externcalls.sdk.api.retry.RetryKt;
import ru.ok.android.webrtc.RTCLog;
import xsna.xn50;
import xsna.zeo0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class iyd0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ iyd0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04e1  */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        s3q0 retryApiWithBackoff$lambda$1;
        Pair pair;
        Object[] objArr;
        OrdAdInfo ordAdInfo;
        Context context;
        int i = this.b;
        int i2 = 23;
        int i3 = 7;
        int i4 = 10;
        int i5 = 22;
        int i6 = 2;
        int i7 = 1;
        r12 = null;
        String str = null;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                kyd0 kyd0Var = (kyd0) obj2;
                wea0 wea0Var = (wea0) obj;
                BasePhotoListFragment basePhotoListFragment = kyd0Var.c;
                ((gyd0) basePhotoListFragment).P(wea0Var.a);
                kyd0Var.l.getClass();
                ArrayList<ProfilePhotoTag> b = dzd0.b(wea0Var);
                kyd0Var.m = b;
                gyd0 gyd0Var = (gyd0) basePhotoListFragment;
                gyd0Var.sh(b);
                gyd0Var.q();
                return s3q0.a;
            case 1:
                c0e0 c0e0Var = (c0e0) obj2;
                int i8 = c0e0.m1;
                c0e0Var.getClass();
                xn50.a.c(c0e0Var, (zzd0) obj);
                return s3q0.a;
            case 2:
                return ((q7r) obj2).i0.getDependencies().y.b().d((List) obj);
            case 3:
                retryApiWithBackoff$lambda$1 = RetryKt.retryApiWithBackoff$lambda$1((RTCLog) obj2, (Throwable) obj);
                return retryApiWithBackoff$lambda$1;
            case 4:
                bei0 bei0Var = (bei0) obj2;
                tny tnyVar = (tny) obj;
                bei0Var.m = tnyVar;
                if (((Boolean) ((zak0) bei0Var.j).getValue()).booleanValue() && bei0Var.f() != null) {
                    ov70 ov70Var = tnyVar != null ? new ov70(tnyVar.U(0L)) : null;
                    if (!epx.f(bei0Var.l, ov70Var)) {
                        bei0Var.l = ov70Var;
                        bei0Var.m();
                        bei0Var.o();
                    }
                }
                return s3q0.a;
            case 5:
                StickersView stickersView = (StickersView) obj2;
                ContextUser e = stickersView.D.e();
                UserId userId = e != null ? e.b : null;
                com.vk.stickers.keyboard.b bVar = stickersView.L;
                if (bVar instanceof b.c) {
                    pair = userId != null ? new Pair("keyboard_gifts_direct", userId) : new Pair("keyboard_gifts_chat", j5g.a0(stickersView.D.h()));
                } else if (bVar instanceof b.d.a) {
                    pair = new Pair("keyboard_gifts_story_answer", userId);
                } else if (bVar instanceof b.d.C1800b) {
                    if (userId == null) {
                        userId = ((b.d.C1800b) bVar).a;
                    }
                    pair = new Pair("keyboard_gifts_story_answer", userId);
                } else {
                    pair = new Pair("keyboard_gifts_comment", userId);
                }
                zal0.e(g2v.d().a(), stickersView.getContext(), e43.m((UserId) pair.g()), (String) pair.d(), 20);
                stickersView.D.k();
                return s3q0.a;
            case 6:
                qgi0.h((tgi0) obj, ((zem0) obj2).c);
                return s3q0.a;
            case 7:
                UIBlockActionFilter uIBlockActionFilter = (UIBlockActionFilter) obj2;
                UIBlockList uIBlockList = (UIBlockList) obj;
                ArrayList<UIBlock> arrayList = uIBlockList.y;
                if (arrayList == null || !arrayList.isEmpty()) {
                    Iterator<T> it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (epx.f(((UIBlock) it.next()).b, uIBlockActionFilter.A)) {
                            objArr = true;
                            return Boolean.valueOf(!objArr == true || (dd80.f(uIBlockList, new b8j0(uIBlockActionFilter, 8)) == null) == true || (!epx.f(uIBlockActionFilter.B, "video_seasons_block_filter") && dd80.f(uIBlockList, new e9i0(uIBlockActionFilter, 11)) != null) == true);
                        }
                    }
                }
                objArr = false;
                return Boolean.valueOf(!objArr == true || (dd80.f(uIBlockList, new b8j0(uIBlockActionFilter, 8)) == null) == true || (!epx.f(uIBlockActionFilter.B, "video_seasons_block_filter") && dd80.f(uIBlockList, new e9i0(uIBlockActionFilter, 11)) != null) == true);
            case 8:
                qvn0 qvn0Var = (qvn0) obj2;
                if (((Boolean) obj).booleanValue()) {
                    qvn0Var.d.b(HintId.GROUP_MANAGED_GROUP.getId());
                }
                return s3q0.a;
            case 9:
                zeo0 zeo0Var = (zeo0) obj2;
                Canvas canvas = (Canvas) obj;
                Matrix matrix = zeo0Var.b;
                int save = canvas.save();
                canvas.concat(matrix);
                try {
                    int save2 = canvas.save();
                    int i9 = zeo0.a.$EnumSwitchMapping$0[zeo0Var.d.a.g.ordinal()];
                    if (i9 == 1) {
                        canvas.translate((tni.j(zeo0Var.h) - zeo0Var.h()) / 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    } else if (i9 == 2) {
                        canvas.translate(tni.j(zeo0Var.h) - zeo0Var.h(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                    s5j0 s5j0Var = zeo0Var.i;
                    if (s5j0Var != null) {
                        s5j0Var.draw(canvas);
                    }
                    zeo0Var.h.draw(canvas);
                    canvas.restoreToCount(save2);
                    canvas.restoreToCount(save);
                    return s3q0.a;
                } catch (Throwable th) {
                    canvas.restoreToCount(save);
                    throw th;
                }
            case 10:
                ((g7q0) obj2).t(true);
                return s3q0.a;
            case 11:
                qgi0.h((tgi0) obj, ((UserProfileBaseInfoState.c) obj2).e);
                return s3q0.a;
            case 12:
                ClipVideoFile clipVideoFile = (ClipVideoFile) obj2;
                ClipEditSdkItem clipEditSdkItem = (ClipEditSdkItem) obj;
                String str2 = clipEditSdkItem.h;
                List<ClipCoauthorSdkItem> list = clipEditSdkItem.m;
                ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
                for (ClipCoauthorSdkItem clipCoauthorSdkItem : list) {
                    UserId userId2 = clipCoauthorSdkItem.b;
                    String str3 = clipCoauthorSdkItem.d;
                    CoOwnerItem.StatusDto statusDto = clipCoauthorSdkItem.f ? CoOwnerItem.StatusDto.APPROVED : CoOwnerItem.StatusDto.PENDING;
                    Serializer.c<Image> cVar = Image.CREATOR;
                    arrayList2.add(new CoOwnerItem(userId2, statusDto, new Owner(userId2, clipCoauthorSdkItem.c, str3, null, null, Image.b.c(str3, 50, 50, ImageSizeKey.SIZE_KEY_UNDEFINED), null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194264, null), clipCoauthorSdkItem.g, null));
                }
                ClipVideoFile Kb = ClipVideoFile.Kb(clipVideoFile, false, str2, null, arrayList2, null, null, null, 8353791);
                List<ImageUrl> list2 = clipEditSdkItem.i.b;
                ArrayList arrayList3 = new ArrayList(c5g.u(list2, 10));
                for (ImageUrl imageUrl : list2) {
                    arrayList3.add(new ImageSize(imageUrl.b, imageUrl.f, (char) 0, false, 12, (zcl) null));
                }
                Kb.I0 = new Image(arrayList3);
                Kb.m = clipEditSdkItem.h;
                SdkClipOrdData sdkClipOrdData = clipEditSdkItem.k;
                if (sdkClipOrdData != null) {
                    String str4 = sdkClipOrdData.e;
                    if (str4 == null) {
                        str4 = "";
                    }
                    String str5 = sdkClipOrdData.d;
                    ordAdInfo = new OrdAdInfo(str4, e43.m(str5 != null ? new OrdAdvertiser("", str5) : null));
                } else {
                    ordAdInfo = null;
                }
                Kb.d0 = ordAdInfo;
                ActionLink actionLink = clipVideoFile.Y;
                boolean f = epx.f(actionLink != null ? actionLink.c : null, "video");
                ClipEditAttachedVideo clipEditAttachedVideo = clipEditSdkItem.l;
                boolean z = clipEditAttachedVideo instanceof ClipEditAttachedVideo.Full;
                if (f || z) {
                    SdkActionLink sdkActionLink = z ? ((ClipEditAttachedVideo.Full) clipEditAttachedVideo).b : null;
                    Kb.Y = sdkActionLink != null ? x10.a(sdkActionLink) : null;
                }
                wjs0.a(new fyr0(Kb));
                return s3q0.a;
            case 13:
                Throwable th2 = (Throwable) obj;
                a780 a780Var = ((VKAnimationView) obj2).p;
                if (a780Var != null) {
                    a780Var.a();
                }
                com.vk.metrics.eventtracking.b.a.a(th2);
                return s3q0.a;
            case 14:
                PorterDuffColorFilter porterDuffColorFilter = VKStickerImageView.p;
                ((VKStickerImageView) obj2).getClass();
                return Boolean.valueOf(obj instanceof hcl0);
            case 15:
                VerticalizationPickerView.a aVar = ((VerticalizationPickerView) obj2).y;
                if (aVar != null) {
                    aVar.a();
                }
                return s3q0.a;
            case 16:
                ((io.reactivex.rxjava3.core.y) obj2).onError((Throwable) obj);
                return s3q0.a;
            case 17:
                gu80 gu80Var = (gu80) obj;
                OrdData ordData = new OrdData(gu80Var.a, gu80Var.b, gu80Var.c);
                whg0 whg0Var = ((f1t0) obj2).a;
                if (whg0Var != null) {
                    whg0Var.invoke(ordData);
                }
                return s3q0.a;
            case 18:
                d2t0 d2t0Var = ((com.vk.posting.presentation.video.f) obj2).i;
                wia0 wia0Var = (wia0) obj;
                if (wia0Var.c) {
                    d2t0Var.clear();
                }
                d2t0Var.n0(wia0Var.a);
                return s3q0.a;
            case 19:
                tgi0 tgi0Var = (tgi0) obj;
                View view = ((VideoPlaylistPlaceHolder) obj2).y;
                if (view != null && (context = view.getContext()) != null) {
                    str = context.getString(R.string.more);
                }
                qgi0.h(tgi0Var, str != null ? str : "");
                return s3q0.a;
            case 20:
                ((VideoRelatedVideosFragment) obj2).a0 = null;
                return s3q0.a;
            case 21:
                ((com.vk.auth.ui.password.askpassword.a) obj2).b.I();
                return s3q0.a;
            case 22:
                ((wh50) obj2).setValue(Boolean.valueOf(!((Boolean) r13.getValue()).booleanValue()));
                return s3q0.a;
            case 23:
                xbv0 xbv0Var = (xbv0) obj2;
                ijp0 ijp0Var = (ijp0) ((s730) obj);
                PinDotsView pinDotsView = xbv0Var.f.V;
                if (pinDotsView == null) {
                    pinDotsView = null;
                }
                List<? extends r5o> list3 = pinDotsView.b;
                for (r5o r5oVar : list3 != null ? list3 : null) {
                    PinDotsView.DotState dotState = PinDotsView.DotState.Success;
                    r5oVar.b = dotState;
                    r5oVar.setBackground(r5oVar.a(dotState));
                    r5oVar.c(dotState);
                }
                io.reactivex.rxjava3.core.q<R> L = io.reactivex.rxjava3.core.q.R(2L, TimeUnit.SECONDS).L(new x310(new gqq0(ijp0Var, 9), i5), false);
                r2v r2vVar = new r2v(new epj0(13), 25);
                L.getClass();
                io.reactivex.rxjava3.internal.operators.observable.j1 U = new io.reactivex.rxjava3.internal.operators.observable.i0(new io.reactivex.rxjava3.internal.operators.observable.q2(L, r2vVar), new or20(new d7l0(16), i5)).U(new ohl0(new p6e0(24), i3));
                d8u0 d8u0Var = new d8u0(new waf0(xbv0Var, 27), i7);
                a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
                a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
                return U.E(d8u0Var, lVar, kVar, kVar).F(new v5u0(new r9c0(xbv0Var, i2), i6));
            case 24:
                VkText vkText = (VkText) obj2;
                String str6 = (String) obj;
                rex0 rex0Var = e370.j;
                (rex0Var != null ? rex0Var : null).c(vkText.getContext(), str6);
                return s3q0.a;
            case 25:
                xjw0 xjw0Var = (xjw0) obj2;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ViewGroup viewGroup = xjw0Var.c;
                ViewParent parent = viewGroup.getParent();
                ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup2 == null) {
                    viewGroup2 = viewGroup;
                }
                mk5 mk5Var = new mk5();
                mk5Var.g(0);
                zmp0.a(viewGroup2, mk5Var);
                bwt0.p0(viewGroup, booleanValue);
                if (booleanValue) {
                    aw3 aw3Var = new aw3(xjw0Var.a);
                    ViewGroup viewGroup3 = aw3Var.b;
                    viewGroup.addView(viewGroup3);
                    ov3 ov3Var = xjw0Var.b;
                    ov3Var.b();
                    io.reactivex.rxjava3.disposables.c subscribe = new io.reactivex.rxjava3.internal.operators.observable.i0(ov3Var.c.a0(asu0.a.d()).U(new ga40(new ifw0(xjw0Var, i6), 19)), new r2v(new wjw0(), 26)).subscribe(new qgs0(new b3m0(aw3Var, i5), 5));
                    io.reactivex.rxjava3.disposables.b bVar2 = xjw0Var.g;
                    bVar2.b(subscribe);
                    if (!aw3Var.k) {
                        tv4.b("AsrRecordInProgressView View is destroyed", com.vk.metrics.eventtracking.b.a);
                    }
                    bVar2.b(new io.reactivex.rxjava3.internal.operators.observable.i0(aw3Var.i.U(new xhb0(new c4q0(xjw0Var, i4), 17)), new xb20(new u5u0(i6), 28)).subscribe(new j990(new i9u0(xjw0Var, i3), i2)));
                    r0u0.a(viewGroup3, new kaa(xjw0Var, i7));
                    xjw0Var.e = aw3Var;
                } else {
                    xjw0Var.a();
                }
                return s3q0.a;
            case 26:
                return new wzw0((ViewGroup) obj, ((uzw0) obj2).i);
            default:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                com.vk.voip.ui.whiteboard.presentation.main.ui.a aVar2 = ((WhiteboardFragment) obj2).Q;
                if (aVar2 != null) {
                    View view2 = aVar2.l;
                    PrimaryActionsView primaryActionsView = aVar2.k;
                    View view3 = aVar2.j;
                    Context context2 = aVar2.g;
                    if (booleanValue2) {
                        view3.animate().translationY(-e3m.a(R.dimen.voip_whiteboard_expand_translation, context2)).rotation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).start();
                        view3.setContentDescription(context2.getString(R.string.voip_whiteboard_hide_buttons_accessibility));
                        primaryActionsView.animate().translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).start();
                        view2.animate().translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).start();
                    } else {
                        view3.animate().translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).rotation(180.0f).start();
                        view3.setContentDescription(context2.getString(R.string.voip_whiteboard_show_buttons_accessibility));
                        primaryActionsView.animate().translationY(e3m.a(R.dimen.voip_whiteboard_actions_translation, context2)).start();
                        view2.animate().translationY(e3m.a(R.dimen.voip_whiteboard_actions_background_height, context2)).start();
                    }
                }
                return s3q0.a;
        }
    }
}
