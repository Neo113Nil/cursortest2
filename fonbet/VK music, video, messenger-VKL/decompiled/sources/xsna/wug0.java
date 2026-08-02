package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.util.Size;
import android.view.View;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogHeaderDebrandedVh;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.core.view.components.topbar.a;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stickers.VmojiAvatarModel;
import com.vk.im.engine.models.LongPollType;
import com.vk.im.ui.fragments.SimpleDialogsFilterFragment;
import com.vk.log.L;
import com.vk.newsfeed.common.helpers.SelectTextActionModeCallback;
import com.vk.newsfeed.impl.requests.WallWithCounters;
import com.vk.profile.user.impl.ui.view.header.UserProfileHeaderView;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedPostTextAction;
import com.vk.stickers.details.fragment.StickerDetailsFragment;
import com.vk.stickers.keyboard.StickersView;
import com.vk.stickers.keyboard.page.StickersRecyclerView;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.superapp.navigation.api.data.AppShareType;
import com.vk.superapp.ui.widgets.SuperAppWidget;
import com.vk.video.profile.presentation.views.VideoNewProfileHeaderViewV2;
import com.vk.video.profile.presentation.views.a;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.c;
import com.vk.voip.ui.settings.participants_view.j;
import com.vkontakte.android.R;
import com.vkontakte.android.data.FriendsUtils;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import xsna.bwq0;
import xsna.ern0;
import xsna.h1o0;
import xsna.hjm0;
import xsna.ikv0;
import xsna.qn60;
import xsna.u3m0;
import xsna.x9m0;
import xsna.xn50;
import xsna.yno0;
import xsna.zhg;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class wug0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wug0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v42, types: [com.vk.feed.core.models.news.NewsEntry] */
    /* JADX WARN: Type inference failed for: r2v59, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v28, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        MobileOfficialAppsFeedStat$TypeFeedPostTextAction.Subtype subtype;
        int i = this.b;
        int i2 = 3;
        int i3 = 2;
        boolean z = false;
        wvn0 wvn0Var = null;
        StickerStockItem stickerStockItem = null;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                io.reactivex.rxjava3.core.w wVar = (io.reactivex.rxjava3.core.w) obj2;
                io.reactivex.rxjava3.core.x k = io.reactivex.rxjava3.core.x.k((io.reactivex.rxjava3.core.p) obj);
                if (!epx.f(Looper.getMainLooper(), Looper.myLooper())) {
                    k = k.m(wVar);
                }
                return new io.reactivex.rxjava3.internal.operators.single.g(k, new io.reactivex.rxjava3.internal.operators.mixed.n(26, new nyq(24))).s();
            case 1:
                ((c7h0) obj2).o.b(new zhg.a((Throwable) obj));
                return s3q0.a;
            case 2:
                geh0 geh0Var = (geh0) obj2;
                Context context = geh0Var.a;
                c63 c63Var = c63.a;
                Activity b = c63.b();
                if (b == null) {
                    return s3q0.a;
                }
                ikv0.a aVar = new ikv0.a(b);
                aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_negative), (Size) null, 12);
                aVar.u = new ikv0.d(context.getString(R.string.bl_screenshots_unavailable_alert), (String) null, (ikv0.d.a) null, 6);
                aVar.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, context.getString(R.string.bl_configure), new b8e0(geh0Var, i2));
                aVar.n();
                return s3q0.a;
            case 3:
                mbj0 mbj0Var = (mbj0) obj2;
                mfu0 mfu0Var = mbj0Var.a;
                ern0 ern0Var = (ern0) obj;
                io.reactivex.rxjava3.disposables.c cVar = mbj0Var.d;
                if (cVar != null) {
                    cVar.dispose();
                }
                if (ern0Var instanceof ern0.b) {
                    JSONObject jSONObject = new JSONObject();
                    AppShareType appShareType = AppShareType.OTHER;
                    jSONObject.put("type", appShareType.h());
                    mbj0Var.b.invoke(appShareType);
                    mfu0Var.n(JsApiMethodType.SHARE, jSONObject);
                } else {
                    if (!(ern0Var instanceof ern0.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    mfu0Var.m(JsApiMethodType.SHARE, VkAppsErrors.Client.UNKNOWN_ERROR, null, null);
                }
                return s3q0.a;
            case 4:
                SimpleDialogsFilterFragment simpleDialogsFilterFragment = (SimpleDialogsFilterFragment) obj2;
                qcy<Object>[] qcyVarArr = SimpleDialogsFilterFragment.Y;
                simpleDialogsFilterFragment.V = ((u180) obj).b.a(LongPollType.MESSAGES);
                simpleDialogsFilterFragment.ho();
                return s3q0.a;
            case 5:
                vjk0 vjk0Var = ((bkk0) obj2).G;
                if (vjk0Var != null) {
                    vjk0Var.U();
                }
                return s3q0.a;
            case 6:
                StickerDetailsFragment stickerDetailsFragment = (StickerDetailsFragment) obj2;
                g4l0 g4l0Var = (g4l0) obj;
                int i4 = StickerDetailsFragment.h0;
                Integer valueOf = g4l0Var instanceof s1l0 ? Integer.valueOf(((s1l0) g4l0Var).a) : g4l0Var instanceof q1l0 ? Integer.valueOf(((q1l0) g4l0Var).a) : null;
                StickerStockItem stickerStockItem2 = stickerDetailsFragment.c0;
                if (stickerStockItem2 == null) {
                    return s3q0.a;
                }
                int i5 = stickerStockItem2.b;
                if (valueOf != null && valueOf.intValue() == i5) {
                    StickerStockItem Ab = StickerStockItem.Ab(stickerStockItem2, false, 0, null, null, -65, 8191);
                    stickerDetailsFragment.c0 = Ab;
                    Bundle arguments = stickerDetailsFragment.getArguments();
                    if (arguments != null) {
                        arguments.putParcelable("sticker_pack_data", stickerDetailsFragment.c0);
                    }
                    if (stickerDetailsFragment.isVisible()) {
                        VmojiAvatarModel p = Ab.Q ? t6g0.d().p() : null;
                        i3l0 i3l0Var = (i3l0) stickerDetailsFragment.S;
                        if (i3l0Var != null) {
                            i3l0Var.g1(Ab, p);
                        }
                    } else {
                        stickerDetailsFragment.V = true;
                    }
                } else {
                    stickerDetailsFragment.V = true;
                }
                return s3q0.a;
            case 7:
                com.vk.stickers.keyboard.d dVar = ((w7l0) obj2).c;
                if (dVar != null) {
                    StickersView stickersView = dVar.a;
                    Long c = stickersView.D.c();
                    if (c != null) {
                        int i6 = 25;
                        stickersView.M.b(stickersView.h.d(c.longValue()).m(asu0.a.d()).subscribe(new eeh0(new yka0(stickersView, 11), i3), new c120(new xsq(i6), i6)));
                    }
                }
                return s3q0.a;
            case 8:
                StickersRecyclerView stickersRecyclerView = (StickersRecyclerView) obj2;
                int i7 = StickersRecyclerView.w;
                if (((icl0) obj) instanceof q7w0) {
                    t6g0 t6g0Var = t6g0.b;
                    Iterator it = t6g0.d().U().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            ?? next = it.next();
                            if (((StickerStockItem) next).k) {
                                stickerStockItem = next;
                            }
                        }
                    }
                    if (stickerStockItem != null) {
                        mhy.j(stickersRecyclerView);
                        y4l0 y4l0Var = stickersRecyclerView.t;
                        if (y4l0Var != null) {
                            y4l0Var.a(stickersRecyclerView.getId());
                        }
                    }
                }
                return s3q0.a;
            case 9:
                u3m0 u3m0Var = (u3m0) obj2;
                u3m0.a aVar2 = u3m0Var.m;
                Object obj3 = u3m0Var.l;
                aVar2.f(((v3m0) (obj3 != null ? obj3 : null)).a);
                return s3q0.a;
            case 10:
                ((p9m0) obj2).T(new x9m0.a((List) obj));
                return s3q0.a;
            case 11:
                L.i((Throwable) obj);
                ((ajm0) obj2).T(hjm0.c.b);
                return s3q0.a;
            case 12:
                FriendsUtils.d(0, (UserId) obj2);
                return s3q0.a;
            case 13:
                ((mre) obj2).invoke((SdkClipVideoFile) ((SdkVideoFile) obj));
                return s3q0.a;
            case 14:
                r4n0 r4n0Var = (r4n0) obj2;
                WallWithCounters wallWithCounters = (WallWithCounters) obj;
                i5n0 i5n0Var = r4n0Var.f;
                return new io.reactivex.rxjava3.internal.operators.single.b(new nvc0(i5n0Var.a, new qn60.b[]{new xc3(wallWithCounters, null, i5n0Var.b, r4n0Var.g, null, false, null)}, 1)).l(new u9c0(new j5b0(wallWithCounters, 18), 7));
            case 15:
                com.vk.superapp.ui.a.S1().g((SuperAppWidget) obj2);
                String message = ((Throwable) obj).getMessage();
                if (message == null) {
                    message = "";
                }
                cvk.w(message, false);
                return s3q0.a;
            case 16:
                vvn0 vvn0Var = (vvn0) obj2;
                ArrayList arrayList = vvn0Var.h;
                wtn0 wtn0Var = vvn0Var.a;
                List list = (List) obj;
                Iterator it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        ?? next2 = it2.next();
                        String str = ((wvn0) next2).a;
                        nvn0.o.getClass();
                        if (epx.f(str, nvn0.r)) {
                            wvn0Var = next2;
                        }
                    }
                }
                wvn0 wvn0Var2 = wvn0Var;
                if (wvn0Var2 != null) {
                    UserId userId = wvn0Var2.f;
                    if (userId != null) {
                        wtn0Var.g(userId);
                    } else {
                        wtn0Var.l();
                    }
                }
                arrayList.clear();
                arrayList.addAll(list);
                return s3q0.a;
            case 17:
                ((f1o0) obj2).T(new h1o0.b.a());
                return s3q0.a;
            case 18:
                yno0 yno0Var = (yno0) obj2;
                SelectTextActionModeCallback.Action action = (SelectTextActionModeCallback.Action) obj;
                if (action == SelectTextActionModeCallback.Action.Copy && Build.VERSION.SDK_INT <= 32) {
                    cvk.u(R.string.actions_popup_text_copied, false);
                }
                int i8 = yno0.S;
                yno0.c cVar2 = (yno0.c) yno0Var.P.getValue();
                yno0 yno0Var2 = yno0.this;
                int i9 = yno0.c.a.$EnumSwitchMapping$0[action.ordinal()];
                if (i9 == 1) {
                    subtype = MobileOfficialAppsFeedStat$TypeFeedPostTextAction.Subtype.SELECT;
                } else if (i9 == 2) {
                    subtype = MobileOfficialAppsFeedStat$TypeFeedPostTextAction.Subtype.SELECT_ALL;
                } else {
                    if (i9 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    subtype = MobileOfficialAppsFeedStat$TypeFeedPostTextAction.Subtype.COPY;
                }
                ?? q6 = yno0Var2.q6();
                if (q6 != 0) {
                    p4r p4rVar = (p4r) cVar2.a.getValue();
                    UserId o = k9q0.o(q6);
                    int n = di60.n(q6);
                    String str2 = yno0Var2.v;
                    Integer valueOf2 = Integer.valueOf(n);
                    p4rVar.getClass();
                    p4r.i(str2, o, valueOf2, subtype);
                }
                return s3q0.a;
            case 19:
                ((tdu) obj).b(((Number) ((mtk0) obj2).getValue()).floatValue());
                return s3q0.a;
            case 20:
                jsp0 jsp0Var = jsp0.a;
                Context context2 = (Context) ((k140) obj2).b;
                jsp0Var.getClass();
                ((Bundle) obj).putBoolean("backup", jsp0.a(context2));
                return s3q0.a;
            case 21:
                Context context3 = (Context) obj2;
                gau.e(context3, 4, context3.getPackageName());
                return s3q0.a;
            case 22:
                UserProfileHeaderView userProfileHeaderView = (UserProfileHeaderView) obj2;
                com.vk.core.view.components.topbar.a aVar3 = (com.vk.core.view.components.topbar.a) obj;
                int i10 = UserProfileHeaderView.G;
                RectF o2 = zjq.o(aVar3.a());
                Rect rect = new Rect();
                o2.roundOut(rect);
                if (o19.b(rect) > 0 && !(aVar3 instanceof a.b)) {
                    userProfileHeaderView.getOnToolbarComposedCallback().onNext(aVar3);
                }
                return s3q0.a;
            case 23:
                isq0 isq0Var = (isq0) obj2;
                WallWithCounters wallWithCounters2 = (WallWithCounters) obj;
                int size = wallWithCounters2.size();
                isq0Var.x(wallWithCounters2, true);
                isq0Var.e(new bwq0.a.m(size));
                return s3q0.a;
            case 24:
                com.vk.movika.sdk.base.observable.a aVar4 = ((com.vk.voip.ui.settings.participants_view.k) obj2).l;
                if (aVar4 != null) {
                    aVar4.invoke(j.d.b.a);
                }
                return s3q0.a;
            case 25:
                VideoCatalogHeaderDebrandedVh videoCatalogHeaderDebrandedVh = (VideoCatalogHeaderDebrandedVh) obj2;
                View view = videoCatalogHeaderDebrandedVh.k;
                if (view != null && ((xz9) videoCatalogHeaderDebrandedVh.v.getValue()) != null) {
                    view.getContext();
                }
                return s3q0.a;
            case 26:
                VideoFile videoFile = (VideoFile) obj2;
                ArrayList<UIBlock> arrayList2 = ((UIBlockList) obj).y;
                if (arrayList2 == null || !arrayList2.isEmpty()) {
                    Iterator it3 = arrayList2.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            UIBlock uIBlock = (UIBlock) it3.next();
                            if (uIBlock instanceof UIBlockVideo) {
                                UIBlockVideo uIBlockVideo = (UIBlockVideo) uIBlock;
                                if (uIBlockVideo.B.C2() && epx.f(uIBlockVideo.B.r1(), videoFile.r1())) {
                                    z = true;
                                }
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 27:
                ((com.vk.video.ui.discovery.minimizable.g) obj2).S0();
                return s3q0.a;
            case 28:
                VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = (VideoMinimizableDiscoveryFragment) obj2;
                int i11 = VideoMinimizableDiscoveryFragment.p1;
                c.o0.h hVar = new c.o0.h((vts0) obj);
                videoMinimizableDiscoveryFragment.getClass();
                xn50.a.c(videoMinimizableDiscoveryFragment, hVar);
                return s3q0.a;
            default:
                VideoNewProfileHeaderViewV2 videoNewProfileHeaderViewV2 = (VideoNewProfileHeaderViewV2) obj2;
                if (((com.vk.video.profile.presentation.views.a) obj) instanceof a.b) {
                    gzs<s3q0> gzsVar = videoNewProfileHeaderViewV2.h;
                    if (gzsVar != null) {
                        gzsVar.invoke();
                    }
                } else {
                    int i12 = VideoNewProfileHeaderViewV2.y;
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ wug0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
