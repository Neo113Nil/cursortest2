package xsna;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.vk.api.generated.accountVerification.dto.AccountVerificationGetSessionInfoResponseDto;
import com.vk.api.generated.accountVerification.dto.AccountVerificationVerificationUserInfoDto;
import com.vk.api.generated.calls.dto.CallsGetHistoryResponseDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.im.Image;
import com.vk.libvideo.tracker.VideoSimilarAnalytics;
import com.vk.log.L;
import com.vk.posting.presentation.video.c;
import com.vk.profile.user.impl.ui.edit.UserEditProfileModalBottomSheet;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeVkConnectNavigationItem;
import com.vk.superapp.verification.account.b;
import com.vk.video.profile.presentation.a;
import com.vk.video.profile.presentation.views.creatoronboarding.items.VideoProfileCreatorOnboardingItemType;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.c;
import com.vk.video.ui.discovery.minimizable.motion.scene.state.DiscoveryScreenMotionStates$Landscape;
import com.vk.voip.ui.call_by_link.ui.a;
import com.vk.voip.ui.feedback.ui.FeedbackGroupCallFlyView;
import com.vk.voip.ui.feedback.ui.FeedbackP2PCallFlyView;
import com.vkontakte.android.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import xsna.aiq0;
import xsna.e2x0;
import xsna.f6x0;
import xsna.fkw0;
import xsna.nnj0;
import xsna.tj50;
import xsna.wuw0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class gyo0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gyo0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v48, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v75, types: [T, xsna.tny] */
    /* JADX WARN: Type inference failed for: r2v46, types: [androidx.fragment.app.Fragment, xsna.e0v0] */
    /* JADX WARN: Type inference failed for: r5v6, types: [io.reactivex.rxjava3.internal.operators.mixed.o] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        io.reactivex.rxjava3.internal.operators.observable.g1 T;
        VideoFile videoFile;
        int i = this.b;
        int i2 = 2;
        ?? r7 = 1;
        int i3 = 0;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                float[] fArr = (float[]) obj2;
                kyo0 kyo0Var = (kyo0) obj;
                vkr0 vkr0Var = kyo0Var.b;
                float f = fArr[0] * 0.8f;
                float f2 = 1 - 0.8f;
                float f3 = vkr0Var.a;
                float f4 = (f2 * f3) + f;
                fArr[0] = f4;
                float f5 = fArr[1] * 0.8f;
                float f6 = vkr0Var.b;
                float f7 = (f2 * f6) + f5;
                fArr[1] = f7;
                float f8 = 0.8f * fArr[2];
                float f9 = vkr0Var.c;
                float f10 = (f2 * f9) + f8;
                fArr[2] = f10;
                return new kyo0(kyo0Var.a, new vkr0(f3 - f4, f6 - f7, f9 - f10));
            case 1:
                qcy<Object>[] qcyVarArr = UserEditProfileModalBottomSheet.s1;
                xn50.a.c((UserEditProfileModalBottomSheet) obj2, new aiq0.n(((Boolean) obj).booleanValue()));
                return s3q0.a;
            case 2:
                ((nrr0) obj2).l.s();
                return s3q0.a;
            case 3:
                com.vk.video.ui.discovery.minimizable.dialog.about.b bVar = (com.vk.video.ui.discovery.minimizable.dialog.about.b) obj2;
                VideoFile videoFile2 = (VideoFile) ((Optional) obj).orElse(null);
                if (videoFile2 == null) {
                    return io.reactivex.rxjava3.core.q.T(EmptyList.b);
                }
                ListBuilder e = e43.e();
                t8 t8Var = bVar.g;
                e.add(t8Var.b(videoFile2));
                boolean j = fxc0.B().J().j();
                if (j) {
                    com.vk.video.ui.discovery.minimizable.dialog.about.b.U(videoFile2, e, bVar);
                }
                if (!fxc0.B().J().a2() || !videoFile2.T1()) {
                    e.add(t8Var.e(videoFile2));
                }
                String j1 = videoFile2.j1();
                if (j1 != null && !drm0.N(j1)) {
                    e.add(new io.reactivex.rxjava3.internal.operators.observable.s0(new f7(videoFile2, i3)).U(new g7(new n8(1, t8Var, t8.class, "toBlock", "toBlock(Lcom/vk/core/ui/adapter_delegate/ListItem;)Ljava/util/List;", 0, 0), i3)));
                }
                if (drm0.D(videoFile2.ra(), "vksport.vkvideo", false)) {
                    e.add(new io.reactivex.rxjava3.internal.operators.observable.s0(new u7()).U(new e8(new p8(t8Var, 0), i3)));
                }
                if (!j) {
                    com.vk.video.ui.discovery.minimizable.dialog.about.b.U(videoFile2, e, bVar);
                }
                jsf0 jsf0Var = t8Var.a;
                if (jsf0Var == null) {
                    T = io.reactivex.rxjava3.core.q.T(EmptyList.b);
                } else if (jsf0Var.b(videoFile2.o0(), videoFile2.a6())) {
                    io.reactivex.rxjava3.core.q<s3q0> p0 = jsf0Var.f().p0(s3q0.a);
                    k7 k7Var = new k7(new com.vk.movika.sdk.base.logic.interactor.i(r7 == true ? 1 : 0, jsf0Var, videoFile2), i3);
                    p0.getClass();
                    T = new io.reactivex.rxjava3.internal.operators.mixed.o(p0, k7Var);
                } else {
                    T = io.reactivex.rxjava3.core.q.T(EmptyList.b);
                }
                e.add(T);
                if (videoFile2.Y3().size() > 0 && (!fxc0.B().J().a2() || !videoFile2.T1())) {
                    e.add(t8Var.c(videoFile2));
                }
                ListBuilder g = e.g();
                int size = g.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i4 = 0; i4 < size; i4++) {
                    arrayList.add(null);
                }
                io.reactivex.rxjava3.core.q L = io.reactivex.rxjava3.core.q.O(j5g.W0(g)).L(new hhj0(new d220(24), 6), false);
                asu0.a.getClass();
                return L.a0(asu0.w()).U(new utg0(new pod0(arrayList, 22), 7));
            case 4:
                ((b9s0) obj2).D.getClass();
                return s3q0.a;
            case 5:
                return nts0.a((nts0) obj2);
            case 6:
                VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = (VideoMinimizableDiscoveryFragment) obj2;
                nnj0 nnj0Var = (nnj0) obj;
                int i5 = VideoMinimizableDiscoveryFragment.p1;
                if (nnj0Var.equals(pnj0.a)) {
                    coj0 coj0Var = (coj0) videoMinimizableDiscoveryFragment.l0.getValue();
                    if (coj0Var.e) {
                        coj0Var.e = false;
                    } else {
                        VideoSimilarAnalytics.EventSource eventSource = coj0Var.d;
                        VideoSimilarAnalytics.EventSource eventSource2 = VideoSimilarAnalytics.EventSource.SWIPE;
                        if (eventSource == eventSource2 && (videoFile = (VideoFile) coj0Var.a.invoke()) != null) {
                            coj0Var.c.invoke(coj0Var.b.invoke(), videoFile, eventSource2);
                        }
                    }
                    coj0Var.d = null;
                    xn50.a.c(videoMinimizableDiscoveryFragment, zts0.b);
                } else if (nnj0Var.equals(qnj0.a)) {
                    xn50.a.c(videoMinimizableDiscoveryFragment, aus0.b);
                } else if (nnj0Var.equals(onj0.a)) {
                    xn50.a.c(videoMinimizableDiscoveryFragment, yts0.b);
                } else if (nnj0Var instanceof nnj0.e) {
                    xn50.a.c(videoMinimizableDiscoveryFragment, c.m.b);
                    xn50.a.c(videoMinimizableDiscoveryFragment, new c.c1(((nnj0.e) nnj0Var).a.b.a, false));
                } else if (nnj0Var.equals(nnj0.a.a)) {
                    com.vk.video.ui.discovery.minimizable.m mVar = videoMinimizableDiscoveryFragment.J0;
                    if (mVar != null && mVar.c() == DiscoveryScreenMotionStates$Landscape.FullscreenWithSimilar && mVar.r) {
                        mVar.r(DiscoveryScreenMotionStates$Landscape.Fullscreen);
                    }
                } else if (nnj0Var instanceof nnj0.c) {
                    xn50.a.c(videoMinimizableDiscoveryFragment, new c.e(((nnj0.c) nnj0Var).a));
                } else if (nnj0Var instanceof nnj0.d) {
                    xn50.a.c(videoMinimizableDiscoveryFragment, new c.f(((nnj0.d) nnj0Var).a));
                } else {
                    if (!nnj0Var.equals(nnj0.b.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    xn50.a.c(videoMinimizableDiscoveryFragment, c.t0.b);
                }
                return s3q0.a;
            case 7:
                ((cys0) obj2).b0.invoke(new a.i((VideoProfileCreatorOnboardingItemType) obj));
                return s3q0.a;
            case 8:
                com.vk.catalog2.common.ui.mvp.holder.video.a aVar = (com.vk.catalog2.common.ui.mvp.holder.video.a) obj2;
                long longValue = ((Long) obj).longValue();
                wb7 wb7Var = aVar.b;
                ttz ttzVar = aVar.h;
                if (ttzVar.c == longValue && wb7Var.a()) {
                    aVar.e.a(true);
                    ttzVar.a(true);
                    VideoCatalogRootVh videoCatalogRootVh = (VideoCatalogRootVh) wb7Var.b;
                    videoCatalogRootVh.U.clear();
                    videoCatalogRootVh.P.m.e();
                    if (aVar.a.a) {
                        aVar.c.getClass();
                    }
                    ((VideoCatalogRootVh) wb7Var.b).rg(new IOException());
                }
                return s3q0.a;
            case 9:
                k2t0 k2t0Var = (k2t0) obj2;
                wia0 wia0Var = (wia0) obj;
                k2t0Var.g.d(wia0Var.b);
                k2t0Var.T(new c.b.d(wia0Var));
                return s3q0.a;
            case 10:
                ((bpf0) obj2).a = (tny) obj;
                return s3q0.a;
            case 11:
                String str = ((w73) obj2).d;
                return str == null ? "" : str;
            case 12:
                g4f0 g4f0Var = (g4f0) obj2;
                Throwable th = (Throwable) obj;
                if (th instanceof VKApiException) {
                    ((Fragment) g4f0Var.b).R0((VKApiException) th);
                }
                g4f0Var.c = null;
                return s3q0.a;
            case 13:
                ((wh50) obj2).setValue((ktv0) obj);
                return s3q0.a;
            case 14:
                com.vk.superapp.verification.account.f fVar = (com.vk.superapp.verification.account.f) obj2;
                AccountVerificationGetSessionInfoResponseDto accountVerificationGetSessionInfoResponseDto = (AccountVerificationGetSessionInfoResponseDto) obj;
                String d = accountVerificationGetSessionInfoResponseDto.d();
                com.vk.superapp.verification.account.c cVar = fVar.d;
                AccountVerificationVerificationUserInfoDto e2 = accountVerificationGetSessionInfoResponseDto.e();
                cVar.getClass();
                String g0 = j5g.g0(rl3.I(new String[]{e2.e(), e2.f()}), " ", null, null, 0, null, 62);
                wdx0 wdx0Var = e370.f;
                if (wdx0Var == null) {
                    wdx0Var = null;
                }
                String f11 = wdx0Var.f();
                String str2 = f11 != null ? f11 : "";
                AccountVerificationVerificationUserInfoDto e3 = accountVerificationGetSessionInfoResponseDto.e();
                AccountVerificationVerificationUserInfoDto f12 = accountVerificationGetSessionInfoResponseDto.f();
                cVar.getClass();
                fVar.j = new com.vk.superapp.verification.account.g(d, g0, str2, rl3.I(new b.f[]{com.vk.superapp.verification.account.c.c(R.string.vk_auth_sign_up_first_name, f12 != null ? f12.e() : null, e3.e(), "first_name"), com.vk.superapp.verification.account.c.c(R.string.vk_auth_sign_up_last_name, f12 != null ? f12.f() : null, e3.f(), "last_name"), com.vk.superapp.verification.account.c.c(R.string.vk_verification_account_middle_name, f12 != null ? f12.g() : null, e3.g(), "middle_name"), com.vk.superapp.verification.account.c.c(R.string.vk_verification_account_birthday, f12 != null ? f12.d() : null, e3.d(), "dob"), com.vk.superapp.verification.account.c.c(R.string.vk_verification_account_phone_number, f12 != null ? f12.i() : null, e3.i(), "phone"), com.vk.superapp.verification.account.c.c(R.string.vk_verification_account_sex, cVar.a(f12 != null ? f12.j() : null), cVar.a(e3.j()), "sex")}));
                com.vk.superapp.verification.account.e eVar = fVar.a;
                com.vk.superapp.verification.account.e.c(eVar, SchemeStatSak$TypeVkConnectNavigationItem.EventType.GO, eVar.a(), SchemeStatSak$EventScreen.NOWHERE, SchemeStatSak$EventScreen.OTHER, null, 36);
                fVar.h();
                return s3q0.a;
            case 15:
                return new k7w0((ViewGroup) obj, (fyd0) obj2);
            case 16:
                ((lcw0) obj2).d.invoke();
                return s3q0.a;
            case 17:
                L.C(((nfw0) ((few0) obj2)).g, (Throwable) obj);
                return s3q0.a;
            case 18:
                ((wfw0) obj2).l.a(a.AbstractC2032a.C2033a.a);
                return s3q0.a;
            case 19:
                L.f("VoipCallHints", "Can't get info about broadcast interrupter " + ((jf8) obj2).b.a, (Throwable) obj);
                return s3q0.a;
            case 20:
                mjw0 mjw0Var = (mjw0) obj2;
                a6r a6rVar = (a6r) obj;
                if (a6rVar instanceof ygw0) {
                    j6r j6rVar = mjw0Var.U0;
                    ArrayList arrayList2 = ((ygw0) a6rVar).a;
                    boolean s0 = com.vk.voip.ui.c.b.s0();
                    l7s l7sVar = j6rVar.e;
                    dow0 dow0Var = j6rVar.c;
                    if (!arrayList2.isEmpty()) {
                        if (s0) {
                            FeedbackGroupCallFlyView feedbackGroupCallFlyView = j6rVar.f;
                            if (feedbackGroupCallFlyView != null) {
                                int imageSizePx = feedbackGroupCallFlyView.getImageSizePx();
                                ArrayList arrayList3 = new ArrayList();
                                Iterator it = arrayList2.iterator();
                                while (it.hasNext()) {
                                    b69 a = dow0Var.a(((a69) it.next()).a);
                                    Image Gb = a != null ? a.b.Gb(imageSizePx) : null;
                                    if (Gb != null) {
                                        arrayList3.add(Gb);
                                    }
                                }
                                Iterator it2 = arrayList3.iterator();
                                while (it2.hasNext()) {
                                    feedbackGroupCallFlyView.a((Image) it2.next());
                                }
                                j6rVar.c(arrayList2);
                            }
                        } else {
                            FeedbackP2PCallFlyView feedbackP2PCallFlyView = j6rVar.g;
                            if (feedbackP2PCallFlyView != null) {
                                int h = feedbackP2PCallFlyView.getLoadImageSize().h();
                                ArrayList arrayList4 = new ArrayList();
                                Iterator it3 = arrayList2.iterator();
                                while (it3.hasNext()) {
                                    b69 a2 = dow0Var.a(((a69) it3.next()).a);
                                    Image Gb2 = a2 != null ? a2.b.Gb(h) : null;
                                    if (Gb2 != null) {
                                        arrayList4.add(Gb2);
                                    }
                                }
                                Iterator it4 = arrayList4.iterator();
                                while (it4.hasNext()) {
                                    Image image = (Image) it4.next();
                                    long j2 = feedbackP2PCallFlyView.c;
                                    int i6 = feedbackP2PCallFlyView.b;
                                    long j3 = j2 / i6;
                                    for (int i7 = 0; i7 < i6; i7++) {
                                        feedbackP2PCallFlyView.postDelayed(new mx5(i2, feedbackP2PCallFlyView, image), i7 * j3);
                                    }
                                }
                                j6rVar.c(arrayList2);
                            }
                        }
                    }
                } else if (a6rVar instanceof bhw0) {
                    mjw0Var.a1.f.onNext(new fkw0.a(((bhw0) a6rVar).a));
                }
                return s3q0.a;
            case 21:
                dhw0 L2 = ((nmw0) obj2).a.L();
                return Long.valueOf(L2 != null ? L2.b : 0L);
            case 22:
                puw0 puw0Var = (puw0) obj2;
                CallsGetHistoryResponseDto callsGetHistoryResponseDto = (CallsGetHistoryResponseDto) obj;
                puw0Var.o.getClass();
                ArrayList a3 = qp90.a(callsGetHistoryResponseDto);
                xx1 xx1Var = puw0Var.n;
                List<UsersUserFullDto> j4 = callsGetHistoryResponseDto.j();
                xx1Var.getClass();
                LinkedHashMap n = xx1.n(j4);
                LinkedHashMap l = xx1.l(callsGetHistoryResponseDto.e());
                LinkedHashMap i8 = xx1.i(callsGetHistoryResponseDto.d());
                Long i9 = callsGetHistoryResponseDto.i();
                return new wuw0.b(a3, n, l, i8, i9 != null ? i9.longValue() : 0L, callsGetHistoryResponseDto.f());
            case 23:
                return new dxw0((ViewGroup) obj, (qxw0) obj2);
            case 24:
                return new e2x0.b(((tj50.a) obj).a(new vyq0((zyw0) obj2, 16), ao8.d));
            case 25:
                Pair pair = (Pair) obj;
                bwt0.p0(((f6x0) obj2).l, ((f6x0.b) pair.d()) == f6x0.b.NO_VMOJI && ((Boolean) pair.g()).booleanValue());
                return s3q0.a;
            default:
                t1y0 t1y0Var = (t1y0) obj2;
                if (t1y0Var != null) {
                    t1y0Var.b();
                }
                return s3q0.a;
        }
    }
}
