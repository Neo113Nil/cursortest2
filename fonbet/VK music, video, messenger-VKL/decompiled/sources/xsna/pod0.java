package xsna;

import android.app.Dialog;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Base64;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.clips.editor.state.model.ClipsEditorAudioItem;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.design.compose.base.datacontent.presets.VideoMetaViewState;
import com.vk.libvideo.design.compose.base.placeholder.PlaceholderViewState;
import com.vk.libvideo.design.compose.base.preview.PreviewViewState;
import com.vk.libvideo.design.compose.video.videocell.VideoCellViewState;
import com.vk.libvideo.design.view.autoplay.seekbar.VideoAutoPlaySeekBarView2;
import com.vk.mediastore.media.VideoCacheIdImpl;
import com.vk.mediastore.storage.ClipsVideoStorage;
import com.vk.metrics.performance.thermal.DeviceThermalStatusChecker;
import com.vk.posting.presentation.video.c;
import com.vk.profile.user.impl.ui.UserProfileFragment;
import com.vk.reefton.Reef;
import com.vk.stickers.bottomsheets.StickersBottomSheetDialog;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import ru.ok.android.webrtc.signaling.transport.log.LogThrottler;
import ru.ok.android.webrtc.signaling.transport.log.SignalingLogger;
import xsna.asl0;
import xsna.awn0;
import xsna.d4f0;
import xsna.gm50;
import xsna.lam0;
import xsna.mno0;
import xsna.n9q0;
import xsna.rmw;
import xsna.uam0;
import xsna.vas0;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class pod0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pod0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        AtomicLong atomicLong;
        huj0 huj0Var;
        com.vk.clips.editor.state.model.a c;
        ww50<?> ww50Var;
        io.reactivex.rxjava3.core.a aVar;
        int i = 12;
        int i2 = 4;
        boolean z = false;
        switch (this.b) {
            case 0:
                qgi0.r((tgi0) obj, "filter_item_" + ((wzk0) this.c).b);
                return s3q0.a;
            case 1:
                ((j4f0) this.c).c(new d4f0.a(new yo60.g.a((Throwable) obj)));
                return s3q0.a;
            case 2:
                anf0 anf0Var = (anf0) this.c;
                List<vof0> list = (List) obj;
                anf0Var.j.addAndGet(-list.size());
                byte[] a = anf0Var.b.a(list);
                if (anf0Var.b("data[]=" + Base64.encodeToString(a, 11))) {
                    AtomicInteger atomicInteger = Reef.i;
                    com.vk.reefton.c cVar = Reef.j;
                    if (cVar != null && (atomicLong = cVar.b) != null) {
                        atomicLong.addAndGet(-list.size());
                    }
                } else {
                    anf0Var.i.onNext(new Pair<>(a, Integer.valueOf(list.size())));
                }
                return s3q0.a;
            case 3:
                DeviceThermalStatusChecker deviceThermalStatusChecker = (DeviceThermalStatusChecker) this.c;
                Intent registerReceiver = deviceThermalStatusChecker.a.registerReceiver(deviceThermalStatusChecker.c, new IntentFilter("android.intent.action.BATTERY_CHANGED"), 4);
                int intExtra = registerReceiver != null ? registerReceiver.getIntExtra("temperature", Integer.MIN_VALUE) : Integer.MIN_VALUE;
                if (intExtra != Integer.MIN_VALUE) {
                    deviceThermalStatusChecker.b = intExtra / 10.0f;
                }
                return s3q0.a;
            case 4:
                uam0.a aVar2 = (uam0.a) this.c;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                VkButton vkButton = aVar2.i;
                if (vkButton != null) {
                    vkButton.getBackground().setTint(aVar2.c.getColor(booleanValue ? R.color.vk_white : R.color.vk_gray_300));
                    vkButton.setEnabled(booleanValue);
                }
                return s3q0.a;
            case 5:
                nvi0 nvi0Var = (nvi0) this.c;
                int i3 = nvi0.k1;
                return Boolean.valueOf(!epx.f(((lvi0) obj).a.a, nvi0Var.i1));
            case 6:
                return SignalingLogger.b((SignalingLogger) this.c, (LogThrottler.ThrottleInfo) obj);
            case 7:
                huj0 huj0Var2 = (huj0) this.c;
                guj0 guj0Var = huj0Var2.g;
                List<wzd> c2 = huj0Var2.c();
                boolean isChecked = huj0Var2.k.u.isChecked();
                rzd rzdVar = guj0Var.b;
                if (isChecked) {
                    com.vk.clips.editor.state.model.a state = rzdVar.getState();
                    kyd kydVar = guj0Var.e;
                    if (kydVar == null) {
                        kydVar = null;
                    }
                    if (kydVar instanceof com.vk.clips.editor.state.model.c) {
                        List<com.vk.clips.editor.state.model.c> list2 = state.c;
                        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                        for (com.vk.clips.editor.state.model.c cVar2 : list2) {
                            huj0 huj0Var3 = guj0Var.c;
                            if (huj0Var3 == null) {
                                huj0Var3 = null;
                            }
                            arrayList.add((com.vk.clips.editor.state.model.c) huj0Var3.a(kydVar, cVar2));
                        }
                        c = com.vk.clips.editor.state.model.a.c(state, null, arrayList, null, null, null, null, 123);
                        huj0Var = null;
                    } else if (kydVar instanceof com.vk.clips.editor.state.model.b) {
                        huj0Var = null;
                        c = com.vk.clips.editor.state.model.a.c(state, null, null, null, null, l4p.b(state.f, new u6(28, guj0Var, (com.vk.clips.editor.state.model.b) kydVar), null), null, 95);
                    } else {
                        huj0Var = null;
                        if (!(kydVar instanceof ClipsEditorAudioItem)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ClipsEditorAudioItem clipsEditorAudioItem = (ClipsEditorAudioItem) kydVar;
                        c = com.vk.clips.editor.state.model.a.c(state, null, null, null, l4p.b(state.e, new d50(26, guj0Var, clipsEditorAudioItem), new h630(clipsEditorAudioItem, 29)), null, null, 111);
                    }
                } else {
                    huj0Var = null;
                    com.vk.clips.editor.state.model.a state2 = rzdVar.getState();
                    kyd kydVar2 = guj0Var.e;
                    if (kydVar2 == null) {
                        kydVar2 = null;
                    }
                    c = guj0.c(state2, kydVar2);
                }
                rzdVar.c(c, c2);
                huj0 huj0Var4 = guj0Var.c;
                if (huj0Var4 != null) {
                    huj0Var = huj0Var4;
                }
                huj0Var.d();
                return s3q0.a;
            case 8:
                int i4 = 14;
                int i5 = 6;
                s3l0 s3l0Var = (s3l0) this.c;
                d790 d790Var = s3l0Var.d;
                if (d790Var == null) {
                    d790Var = null;
                }
                StickerStockItem stickerStockItem = d790Var.a;
                rdf0 rdf0Var = s3l0Var.c;
                int i6 = stickerStockItem.b;
                rdf0Var.getClass();
                nil0 nil0Var = new nil0("store.getStickerPacksRecommendationBlocks");
                nil0Var.C(i6, "pack_id");
                io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(nil0Var, null, null, 3);
                n3t n3tVar = new n3t(new qz40(rdf0Var, 18), 21);
                a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
                a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
                io.reactivex.rxjava3.internal.operators.observable.b0 E = y0.E(n3tVar, lVar, kVar, kVar);
                xk30 xk30Var = new xk30(new q8i0(s3l0Var, i5), 20);
                a.l lVar2 = io.reactivex.rxjava3.internal.functions.a.d;
                a.k kVar2 = io.reactivex.rxjava3.internal.functions.a.c;
                return E.E(xk30Var, lVar2, kVar2, kVar2).F(new tmz(new l850(s3l0Var, 15), i4));
            case 9:
                com.vk.stickers.settings.i iVar = (com.vk.stickers.settings.i) this.c;
                bwt0.p0(iVar.e, false);
                bwt0.p0(iVar.f, true);
                return s3q0.a;
            case 10:
                StickersBottomSheetDialog stickersBottomSheetDialog = (StickersBottomSheetDialog) this.c;
                int i7 = StickersBottomSheetDialog.a0;
                Dialog dialog = stickersBottomSheetDialog.s;
                if (dialog != null) {
                    dialog.dismiss();
                }
                StickersBottomSheetDialog.b bVar = stickersBottomSheetDialog.Z;
                if (bVar != null && (ww50Var = bVar.b) != null) {
                    ww50Var.H(bVar);
                }
                return s3q0.a;
            case 11:
                jzl0 jzl0Var = (jzl0) this.c;
                jzl0Var.v.removeCallbacks(jzl0Var.w);
                ((ikv0) obj).a();
                return s3q0.a;
            case 12:
                String str = (String) obj;
                h420 h420Var = ((u6m0) this.c).b.m;
                h420 h420Var2 = h420Var != null ? h420Var : null;
                Pattern pattern = n420.a;
                if (brm0.B(str, "@", false)) {
                    str = erm0.v0(1, str);
                }
                h420Var2.j(str);
                return s3q0.a;
            case 13:
                jam0 jam0Var = (jam0) this.c;
                gm50.a.a(jam0Var, ((lam0.a) obj).a, new u2k0(jam0Var, 7));
                return s3q0.a;
            case 14:
                String str2 = (String) obj;
                ((io.reactivex.rxjava3.core.r) this.c).onNext(str2 != null ? str2 : "");
                return s3q0.a;
            case 15:
                ((nvn0) this.c).T(awn0.b.b);
                return s3q0.a;
            case 16:
                oio.x1((oio) obj, (y7z) this.c, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 0, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                return s3q0.a;
            case 17:
                ((nwp0) this.c).d = (Map) obj;
                return s3q0.a;
            case 18:
                ((bp7) this.c).invoke((n9q0.a) obj);
                return s3q0.a;
            case 19:
                asl0.a aVar3 = (asl0.a) obj;
                com.vk.profile.user.impl.ui.i iVar2 = ((UserProfileFragment) this.c).Q;
                (iVar2 == null ? null : iVar2).i.d(aVar3.a);
                return s3q0.a;
            case 20:
                mfu0 mfu0Var = ((kfr0) this.c).c;
                Throwable th = (Throwable) obj;
                if ((th instanceof VKApiExecutionException) && ((VKApiExecutionException) th).s() == -1) {
                    mfu0Var.m(JsApiMethodType.RECOMMEND_APP, VkAppsErrors.Client.CONNECTION_LOST, null, null);
                } else {
                    mfu0Var.A(JsApiMethodType.RECOMMEND_APP, null);
                }
                return s3q0.a;
            case 21:
                ((nrr0) this.c).l.m();
                return s3q0.a;
            case 22:
                ArrayList arrayList2 = (ArrayList) this.c;
                Pair pair = (Pair) obj;
                arrayList2.set(((Number) pair.d()).intValue(), (List) pair.g());
                return c5g.v(j5g.V(arrayList2));
            case 23:
                int i8 = 8;
                int i9 = 15;
                VideoAutoPlay videoAutoPlay = (VideoAutoPlay) this.c;
                VideoAutoPlay.e eVar = (VideoAutoPlay.e) obj;
                m7q m7qVar = eVar.b;
                sht0 e = jgz.e(m7qVar);
                ay8 ay8Var = e instanceof ay8 ? (ay8) e : null;
                if (ay8Var != null) {
                    mx8 mx8Var = videoAutoPlay.b;
                    mx8Var.getClass();
                    r7s0 r7s0Var = ay8Var.e;
                    aVar = r7s0Var == VideoCacheIdImpl.MESSAGES ? mx8Var.a(ay8Var).o(asu0.a.d()).c(new io.reactivex.rxjava3.internal.operators.completable.e(new sj7(1, mx8Var, ay8Var))) : r7s0Var == VideoCacheIdImpl.STORY ? pk90.b : mx8Var.a(ay8Var);
                } else if (m7qVar.p && m7qVar.E) {
                    ClipsVideoStorage.a.f();
                    aVar = ClipsVideoStorage.d;
                } else {
                    aVar = io.reactivex.rxjava3.internal.operators.completable.i.b;
                }
                o8c0 o8c0Var = new o8c0(new m2l0(m7qVar, i9), i8);
                aVar.getClass();
                return new io.reactivex.rxjava3.internal.operators.completable.x(aVar, o8c0Var).t(eVar);
            case 24:
                VideoAutoPlaySeekBarView2 videoAutoPlaySeekBarView2 = (VideoAutoPlaySeekBarView2) this.c;
                ((Integer) obj).intValue();
                VideoAutoPlaySeekBarView2.a aVar4 = VideoAutoPlaySeekBarView2.r;
                videoAutoPlaySeekBarView2.invalidate();
                return s3q0.a;
            case 25:
                vas0 vas0Var = (vas0) this.c;
                nvy nvyVar = (nvy) obj;
                vas0.a.b bVar2 = new vas0.a.b("Medium");
                vas0.a.c cVar3 = new vas0.a.c("Default");
                PreviewViewState.a0 a0Var = PreviewViewState.a0.a;
                vas0.a.C3879a c3879a = new vas0.a.C3879a(new VideoCellViewState(PreviewViewState.a0.b(new rmw.h("https://sun9-74.userapi.com/ND830wK2WZU5cr0HM5PlM2mckshPjZqRB1gbqA/QJKq-CK0a_g.jpg"), true, vas0.c(), null, null, null, null, null, null, null, null, IronSourceError.ERROR_INIT_ALREADY_FINISHED), vas0.e(), vas0.f(), vas0.d(), null, 16));
                vas0.a.c cVar4 = new vas0.a.c("No Image");
                vas0.a.C3879a c3879a2 = new vas0.a.C3879a(new VideoCellViewState(PreviewViewState.a0.b(new rmw.h("https://sun9-67.userapi.com/no_image.jpg"), true, vas0.c(), null, null, null, null, null, null, null, null, IronSourceError.ERROR_INIT_ALREADY_FINISHED), vas0.e(), vas0.f(), vas0.d(), null, 16));
                vas0.a.c cVar5 = new vas0.a.c("Placeholder");
                vas0.a.C3879a c3879a3 = new vas0.a.C3879a(new VideoCellViewState(a0Var.d(true, new PlaceholderViewState(new rmw.d(R.drawable.vk_icon_users_outline_28), new mno0.i("Только для подписчиков"), null, null, null, 28)), vas0.e(), vas0.f(), vas0.d(), null, 16));
                vas0.a.c cVar6 = new vas0.a.c("Donut");
                vas0.a.C3879a c3879a4 = new vas0.a.C3879a(new VideoCellViewState(PreviewViewState.a0.b(new rmw.h("https://sun9-74.userapi.com/ND830wK2WZU5cr0HM5PlM2mckshPjZqRB1gbqA/QJKq-CK0a_g.jpg"), true, vas0.c(), new PreviewViewState.l(new mno0.i("300 ₽/мес"), new mno0.i("")), null, null, null, null, null, null, null, 2032), vas0.e(), vas0.f(), null, null, 24));
                vas0.a.c cVar7 = new vas0.a.c("Playlist");
                vas0.a.C3879a c3879a5 = new vas0.a.C3879a(new VideoCellViewState(PreviewViewState.a0.e(new rmw.h("https://sun9-74.userapi.com/ND830wK2WZU5cr0HM5PlM2mckshPjZqRB1gbqA/QJKq-CK0a_g.jpg"), 1, null, null, 56), vas0.e(), vas0.f(), null, null, 24));
                vas0.a.c cVar8 = new vas0.a.c("Playlist / No Image");
                vas0.a.C3879a c3879a6 = new vas0.a.C3879a(new VideoCellViewState(PreviewViewState.a0.e(new rmw.h("https://sun9-67.userapi.com/no_image.jpg"), 1, null, null, 56), vas0.e(), vas0.f(), null, null, 24));
                vas0.a.c cVar9 = new vas0.a.c("Blur");
                vas0.a.C3879a c3879a7 = new vas0.a.C3879a(new VideoCellViewState(a0Var.a(new rmw.h("https://sun9-74.userapi.com/ND830wK2WZU5cr0HM5PlM2mckshPjZqRB1gbqA/QJKq-CK0a_g.jpg"), true, new PlaceholderViewState(new rmw.d(R.drawable.vk_icon_hide_outline_24), new mno0.i("Возможно, это неприятный контент"), null, null, null, 28)), vas0.e(), vas0.f(), vas0.d(), null, 16));
                vas0.a.c cVar10 = new vas0.a.c("Skeleton");
                float f = kqu0.e;
                PreviewViewState previewViewState = new PreviewViewState(new q020(null, null, null, null, new pco(f), null, false, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE), null, null, null, null, null, 1.7777778f, 510);
                VideoCellViewState.f fVar = VideoCellViewState.f.a;
                List l = e43.l(bVar2, cVar3, c3879a, cVar4, c3879a2, cVar5, c3879a3, cVar6, c3879a4, cVar7, c3879a5, cVar8, c3879a6, cVar9, c3879a7, cVar10, new vas0.a.C3879a(new VideoCellViewState(previewViewState, fVar, null, null, null, 28)));
                nvyVar.e(l.size(), null, new ze70(l), new jai(802480018, new mu80(1, vas0Var, l), true));
                List l2 = e43.l(new vas0.a.b("Small"), new vas0.a.c("Default"), new vas0.a.C3879a(new VideoCellViewState(PreviewViewState.a0.b(new rmw.h("https://sun9-74.userapi.com/ND830wK2WZU5cr0HM5PlM2mckshPjZqRB1gbqA/QJKq-CK0a_g.jpg"), true, vas0.c(), null, null, null, null, null, null, null, null, IronSourceError.ERROR_INIT_ALREADY_FINISHED), vas0.g(vas0Var, 31), vas0.f(), null, null, 24)), new vas0.a.c("No Image"), new vas0.a.C3879a(new VideoCellViewState(PreviewViewState.a0.b(new rmw.h("https://sun9-67.userapi.com/no_image.jpg"), true, vas0.c(), null, null, null, null, null, null, null, null, IronSourceError.ERROR_INIT_ALREADY_FINISHED), vas0.g(vas0Var, 31), vas0.f(), null, null, 24)), new vas0.a.c("Placeholder"), new vas0.a.C3879a(new VideoCellViewState(a0Var.d(true, new PlaceholderViewState(new rmw.d(R.drawable.vk_icon_users_outline_28), new mno0.i("Только для подписчиков"), null, null, null, 28)), vas0.g(vas0Var, 31), vas0.f(), null, null, 24)), new vas0.a.c("Donut"), new vas0.a.C3879a(new VideoCellViewState(PreviewViewState.a0.b(new rmw.h("https://sun9-74.userapi.com/ND830wK2WZU5cr0HM5PlM2mckshPjZqRB1gbqA/QJKq-CK0a_g.jpg"), true, vas0.c(), null, null, null, null, null, null, null, null, IronSourceError.ERROR_INIT_ALREADY_FINISHED), vas0.g(vas0Var, 3), vas0.f(), null, null, 24)), new vas0.a.c("Playlist"), new vas0.a.C3879a(new VideoCellViewState(PreviewViewState.a0.e(new rmw.h("https://sun9-74.userapi.com/ND830wK2WZU5cr0HM5PlM2mckshPjZqRB1gbqA/QJKq-CK0a_g.jpg"), 1, null, null, 56), vas0.g(vas0Var, 31), vas0.f(), null, null, 24)), new vas0.a.c("Playlist / No Image"), new vas0.a.C3879a(new VideoCellViewState(PreviewViewState.a0.e(new rmw.h("https://sun9-67.userapi.com/no_image.jpg"), 1, null, null, 56), vas0.g(vas0Var, 31), vas0.f(), null, null, 24)), new vas0.a.c("Playlist / Added"), new vas0.a.C3879a(new VideoCellViewState(PreviewViewState.a0.e(new rmw.h("https://sun9-74.userapi.com/ND830wK2WZU5cr0HM5PlM2mckshPjZqRB1gbqA/QJKq-CK0a_g.jpg"), 1, null, null, 56), vas0.g(vas0Var, 26), vas0.f(), null, null, 24)), new vas0.a.c("Playlist / Added / No Image"), new vas0.a.C3879a(new VideoCellViewState(PreviewViewState.a0.e(new rmw.h("https://sun9-67.userapi.com/no_image.jpg"), 1, null, null, 56), vas0.g(vas0Var, 26), vas0.f(), null, null, 24)), new vas0.a.c("Playlist / User"), new vas0.a.C3879a(new VideoCellViewState(PreviewViewState.a0.e(new rmw.h("https://sun9-74.userapi.com/ND830wK2WZU5cr0HM5PlM2mckshPjZqRB1gbqA/QJKq-CK0a_g.jpg"), 1, null, null, 56), vas0.g(vas0Var, 25), vas0.f(), null, null, 24)), new vas0.a.c("Playlist / User / No Image"), new vas0.a.C3879a(new VideoCellViewState(PreviewViewState.a0.e(new rmw.h("https://sun9-67.userapi.com/no_image.jpg"), 1, null, null, 56), vas0.g(vas0Var, 25), vas0.f(), null, null, 24)), new vas0.a.c("Playlist / User / Selecting"), new vas0.a.C3879a(new VideoCellViewState(PreviewViewState.a0.e(new rmw.h("https://sun9-74.userapi.com/ND830wK2WZU5cr0HM5PlM2mckshPjZqRB1gbqA/QJKq-CK0a_g.jpg"), 1, null, null, 56), vas0.g(vas0Var, 25), vas0.f(), null, null, 24)), new vas0.a.c("Episode"), new vas0.a.C3879a(new VideoCellViewState(PreviewViewState.a0.b(new rmw.h("https://sun9-74.userapi.com/ND830wK2WZU5cr0HM5PlM2mckshPjZqRB1gbqA/QJKq-CK0a_g.jpg"), true, null, null, null, null, null, null, null, null, null, 2044), vas0.i(), new VideoCellViewState.c(new rmw.d(R.drawable.vk_icon_share_outline_24)), null, null, 24)), new vas0.a.c("Episode / Playing"), new vas0.a.C3879a(new VideoCellViewState(PreviewViewState.a0.b(new rmw.h("https://sun9-74.userapi.com/ND830wK2WZU5cr0HM5PlM2mckshPjZqRB1gbqA/QJKq-CK0a_g.jpg"), true, null, null, null, null, new PreviewViewState.n(new rmw.d(R.drawable.vk_icon_poll_24), null, VkColorToken.OverlayPrimary, VkColorToken.IconContrast, 2), null, null, null, null, 1980), vas0.i(), new VideoCellViewState.c(new rmw.d(R.drawable.vk_icon_share_outline_24)), null, null, 24)), new vas0.a.c("Blur"), new vas0.a.C3879a(new VideoCellViewState(a0Var.a(new rmw.h("https://sun9-74.userapi.com/ND830wK2WZU5cr0HM5PlM2mckshPjZqRB1gbqA/QJKq-CK0a_g.jpg"), true, new PlaceholderViewState(new rmw.d(R.drawable.vk_icon_hide_outline_24), new mno0.i("Возможно, это неприятный контент"), null, null, null, 28)), vas0.g(vas0Var, 31), vas0.f(), null, null, 24)), new vas0.a.c("Live"), new vas0.a.C3879a(new VideoCellViewState(PreviewViewState.a0.b(new rmw.h("https://sun9-74.userapi.com/ND830wK2WZU5cr0HM5PlM2mckshPjZqRB1gbqA/QJKq-CK0a_g.jpg"), true, new PreviewViewState.DurationBadge(new mno0.i("LIVE"), true, null, i2), null, null, null, null, null, null, null, null, IronSourceError.ERROR_INIT_ALREADY_FINISHED), vas0.g(vas0Var, 31), vas0.f(), null, null, 24)), new vas0.a.c("Live / Inactive"), new vas0.a.C3879a(new VideoCellViewState(PreviewViewState.a0.b(new rmw.h("https://sun9-74.userapi.com/ND830wK2WZU5cr0HM5PlM2mckshPjZqRB1gbqA/QJKq-CK0a_g.jpg"), true, new PreviewViewState.DurationBadge(new mno0.i("LIVE"), z, null, 4), null, null, null, null, null, null, null, null, IronSourceError.ERROR_INIT_ALREADY_FINISHED), vas0.g(vas0Var, 31), vas0.f(), null, null, 24)), new vas0.a.c("Downloading"), new vas0.a.C3879a(new VideoCellViewState(PreviewViewState.a0.b(new rmw.h("https://sun9-74.userapi.com/ND830wK2WZU5cr0HM5PlM2mckshPjZqRB1gbqA/QJKq-CK0a_g.jpg"), true, vas0.c(), null, null, null, null, null, null, null, null, IronSourceError.ERROR_INIT_ALREADY_FINISHED), new VideoCellViewState.g(new VideoMetaViewState(new VideoMetaViewState.i(new mno0.i("Обучение основам дизайн-системы +V. Урок номер 1. Большой компонент видео-карточки"), 2), VideoMetaViewState.DownloadStatus.Downloading, new VideoMetaViewState.d(new mno0.i("495,4 МБ"), new mno0.i("11%"), null, 4))), vas0.f(), null, null, 24)), new vas0.a.c("Downloaded"), new vas0.a.C3879a(new VideoCellViewState(PreviewViewState.a0.b(new rmw.h("https://sun9-74.userapi.com/ND830wK2WZU5cr0HM5PlM2mckshPjZqRB1gbqA/QJKq-CK0a_g.jpg"), true, vas0.c(), null, null, null, null, null, null, null, null, IronSourceError.ERROR_INIT_ALREADY_FINISHED), vas0.h(false), vas0.f(), null, null, 24)), new vas0.a.c("Downloaded / Donut"), new vas0.a.C3879a(new VideoCellViewState(PreviewViewState.a0.b(new rmw.h("https://sun9-74.userapi.com/ND830wK2WZU5cr0HM5PlM2mckshPjZqRB1gbqA/QJKq-CK0a_g.jpg"), true, vas0.c(), null, null, null, null, null, null, null, null, IronSourceError.ERROR_INIT_ALREADY_FINISHED), vas0.h(true), vas0.f(), null, null, 24)), new vas0.a.c("Skeleton"), new vas0.a.C3879a(new VideoCellViewState(new PreviewViewState(new q020(null, null, null, null, new pco(f), null, false, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE), null, null, null, null, null, 1.7777778f, 510), fVar, null, null, null, 28)));
                int i10 = 1;
                nvyVar.e(l2.size(), null, new rrv(l2, i10), new jai(802480018, new e9d0(i10, vas0Var, l2), true));
                return s3q0.a;
            case 26:
                kfs0 kfs0Var = (kfs0) this.c;
                ((Boolean) obj).booleanValue();
                kfs0Var.l.b.invoke();
                return s3q0.a;
            case 27:
                dis0 dis0Var = (dis0) this.c;
                if (dis0Var.f != null) {
                    dis0Var.setClickable(false);
                    dis0Var.c.setVisibility(4);
                    VkSpinner vkSpinner = dis0Var.f;
                    if (vkSpinner != null) {
                        vkSpinner.setVisibility(0);
                    }
                    dis0Var.h(new oqh0(dis0Var, i));
                } else {
                    dis0Var.h(null);
                }
                return s3q0.a;
            case 28:
                cys0 cys0Var = (cys0) this.c;
                cys0Var.getClass();
                cys0Var.setRefreshing(((u8t0) obj).a);
                return s3q0.a;
            default:
                ((k2t0) this.c).T(new c.b.a(new ewp((Throwable) obj)));
                return s3q0.a;
        }
    }
}
