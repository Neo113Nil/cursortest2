package defpackage;

import android.media.AudioTrack;
import android.net.Uri;
import android.os.Handler;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessor;
import androidx.media3.exoplayer.audio.c;
import com.cloudwebrtc.webrtc.utils.AnyThreadResult;
import com.cloudwebrtc.webrtc.utils.AnyThreadSink;
import com.yandex.go.account.api.family.SharedPaymentContext;
import com.yandex.go.payments.shared.business.BusinessAccountFlowExperiment;
import com.yandex.go.payments.shared.business.accountcreation.d;
import com.yandex.go.payments.shared.business.onboarding.b;
import com.yandex.go.payments.shared.y;
import com.yandex.go.sharedpayments.api.analytics.SharedPaymentsOpenReason;
import com.yandex.go.superapp.order.multi.old.view.OrderViewContainer;
import com.yandex.go.tariffcard.ui.view.TariffTrailView;
import com.yandex.go.taxi.order.api.change.destination.RouteChangeType;
import com.yandex.go.taxi.order.communications.a;
import com.yandex.go.taxi.order.communications.i;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import com.yandex.go.yb.api.domain.model.YbScreenSource;
import com.yandex.images.FadingDrawable;
import com.yandex.messaging.core.net.entities.GetExperimentsResponse;
import com.yandex.messaging.core.net.entities.RequestUserData;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.HapticController$Effect;
import ru.yandex.taxi.analytics.Events$Suggest$ZeroSuggestAdditionalTapArea;
import ru.yandex.taxi.cashback.g;
import ru.yandex.taxi.communications.model.CommunicationItem;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.eatskit.internal.nativeapi.NativeApi;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.net.taxi.dto.objects.Dialog;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.order.view.OrderView;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.sharedpayments.AccountLinkingInfoFullscreenModalView;
import ru.yandex.taxi.widget.ModalView;
import ru.yandex.video.m3.player.impl.utils.ExoPlayerProperThreadRunner;
import ru.yandex.video.m3.preload_manager.JobResult;
import ru.yandex.video.m3.preload_manager.PreloadException;
import ru.yandex.video.m3.preload_manager.PreloadWorkerJobHandle;

/* loaded from: classes13.dex */
public final /* synthetic */ class l9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ l9(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
        this.x = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        kpf0 kpf0Var;
        TaxiOrder b;
        OrderStatusInfo V;
        DriveState driveState;
        DriveState c;
        String name;
        DriveState c2;
        String name2;
        int i2 = 3;
        int i3 = 1;
        tls tlsVar = null;
        r5 = null;
        r5 = null;
        String str = null;
        switch (this.a) {
            case 0:
                m9 m9Var = (m9) this.b;
                eoh eohVar = (eoh) this.c;
                tls tlsVar2 = (tls) this.w;
                tls tlsVar3 = (tls) this.x;
                if (m9Var.d.isDone()) {
                    try {
                        hlf0 hlf0Var = (hlf0) m9Var.d.get();
                        if (hlf0Var instanceof glf0) {
                            eohVar.b(tlsVar2.invoke(((glf0) hlf0Var).a));
                            return;
                        } else {
                            if (!(hlf0Var instanceof flf0)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (tlsVar3 != null) {
                                eohVar.b(tlsVar3.invoke(((flf0) hlf0Var).a));
                                return;
                            } else {
                                eohVar.a(((flf0) hlf0Var).a);
                                return;
                            }
                        }
                    } catch (Throwable th) {
                        eohVar.a(m83.a(th));
                        return;
                    }
                }
                return;
            case 1:
                AccountLinkingInfoFullscreenModalView._init_$lambda$0((aap) this.b, (SharedPaymentContext) this.c, (Runnable) this.w, (AccountLinkingInfoFullscreenModalView) this.x);
                return;
            case 2:
                a aVar = (a) this.b;
                CommunicationItem communicationItem = (CommunicationItem) this.c;
                List list = (List) this.w;
                kpf0 kpf0Var2 = (kpf0) this.x;
                tls tlsVar4 = aVar.n0;
                String str2 = communicationItem.a;
                o2y0 o2y0Var = aVar.m0;
                tlsVar4.invoke(new apf0(new dpf0(str2, o2y0Var != null ? o2y0Var.b().a : null, (o2y0Var == null || (c = o2y0Var.c()) == null || (name = c.name()) == null) ? null : name.toLowerCase(Locale.ROOT), aVar.G(), list, communicationItem.k)));
                pr prVar = aVar.l0;
                prVar.getClass();
                g00 g00Var = kpf0Var2.a.g.f;
                List<baq0> list2 = g00Var != null ? g00Var.c : null;
                if (list2 == null) {
                    list2 = EmptyList.a;
                }
                for (baq0 baq0Var : list2) {
                    int i4 = or.a[baq0Var.a.ordinal()];
                    if (i4 != i3) {
                        if (i4 == 2) {
                            kpf0Var = kpf0Var2;
                            yfj0 yfj0Var = prVar.b;
                            String obj = baq0Var.c.toString();
                            o2y0 o2y0Var2 = prVar.g;
                            yfj0Var.a(obj, (o2y0Var2 == null || (b = o2y0Var2.b()) == null || (V = b.V()) == null || (driveState = V.i) == null) ? null : driveState.name());
                        } else if (i4 == i2) {
                            kpf0Var = kpf0Var2;
                            swz0 swz0Var = baq0Var.i;
                            ((dv51) ((cv51) prVar.d.get())).b(new fv51(new aw51(swz0Var != null ? new zv51(swz0Var.b, swz0Var.a) : null, YbScreenSource.RIDE), true), new bgc(12));
                        } else if (i4 == 4) {
                            String str3 = kpf0Var2.a.a;
                            o2y0 o2y0Var3 = prVar.g;
                            String valueOf = String.valueOf(o2y0Var3 != null ? o2y0Var3.c() : tlsVar);
                            oep0 oep0Var = prVar.f;
                            m950 m950Var = (m950) prVar.c.get();
                            String str4 = baq0Var.d;
                            String str5 = baq0Var.e;
                            List<z3b0> list3 = baq0Var.f;
                            ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
                            for (z3b0 z3b0Var : list3) {
                                arrayList.add(new g4b0(z3b0Var.d, z3b0Var.e, z3b0Var.a, z3b0Var.b, z3b0Var.c, z3b0Var.f, z3b0Var.g, z3b0Var.h, z3b0Var.i, z3b0Var.j));
                                kpf0Var2 = kpf0Var2;
                            }
                            kpf0Var = kpf0Var2;
                            ((pep0) oep0Var).f(m950Var, new h4b0(str3, valueOf, str4, str5, baq0Var.g, baq0Var.h, arrayList), hxx.a);
                        } else if (i4 != 5) {
                            TaxiOrderLogGroup.EMPTY.getClass();
                            j73.L(new String[]{"onClick"}, Extension.DOT_CHAR, Extension.DOT_CHAR, tlsVar, 60);
                            hst hstVar = jst.e;
                        }
                        i2 = 3;
                        kpf0Var2 = kpf0Var;
                        i3 = 1;
                    } else {
                        kpf0 kpf0Var3 = kpf0Var2;
                        o2y0 o2y0Var4 = prVar.g;
                        if (o2y0Var4 == null) {
                            i = 1;
                        } else {
                            ((v2y0) prVar.a).a(o2y0Var4);
                            u8w u8wVar = prVar.e;
                            u8wVar.getClass();
                            i = 1;
                            u8wVar.a.a("Promoblock.ShareRoute.Tap", new HashMap(), 1, new HashMap());
                        }
                        kpf0Var2 = kpf0Var3;
                        i3 = i;
                        i2 = 3;
                    }
                    tlsVar = null;
                }
                return;
            case 3:
                ((ru.yandex.taxi.preorder.suggested.selection.a) this.b).P.Ue((yn0) this.c, (String) this.w, (String) this.x, Events$Suggest$ZeroSuggestAdditionalTapArea.TRAIL);
                return;
            case 4:
                ((AnyThreadResult) this.b).lambda$error$1((String) this.c, (String) this.w, this.x);
                return;
            case 5:
                ((AnyThreadSink) this.b).lambda$error$1((String) this.c, (String) this.w, this.x);
                return;
            case 6:
                d dVar = (d) this.b;
                tmr0 tmr0Var = (tmr0) this.c;
                SharedPaymentsOpenReason sharedPaymentsOpenReason = (SharedPaymentsOpenReason) this.w;
                Runnable runnable = (Runnable) this.x;
                b bVar = dVar.a;
                bVar.f.getClass();
                if ("business".equals(tmr0Var.a)) {
                    BusinessAccountFlowExperiment.CreateBusinessAccountFullscreen createBusinessAccountFullscreen = ((BusinessAccountFlowExperiment) bVar.e.a.b()).c;
                    BusinessAccountFlowExperiment.CreateBusinessAccountFullscreen.Companion.getClass();
                    boolean l = jl40.l(createBusinessAccountFullscreen, BusinessAccountFlowExperiment.CreateBusinessAccountFullscreen.d);
                    if (l) {
                        bVar.g.getClass();
                        xby.l(jst.e, "B2B.TOKEN_ERROR:SHOW_BUSINESS_ACCOUNT", null, new IllegalArgumentException(), "Creating business account without onboarding", 2);
                    }
                    if (!l) {
                        ((y) dVar.e.get()).c();
                        bVar.c(sharedPaymentsOpenReason, runnable);
                        return;
                    }
                }
                ((y) ((tnr0) dVar.d.get())).k(tmr0Var, sharedPaymentsOpenReason);
                return;
            case 7:
                i iVar = (i) this.b;
                kpf0 kpf0Var4 = (kpf0) this.c;
                String str6 = (String) this.w;
                ListItemComponent listItemComponent = (ListItemComponent) this.x;
                tls tlsVar5 = iVar.l0;
                String str7 = kpf0Var4.a.a;
                o2y0 o2y0Var5 = iVar.k0;
                String str8 = o2y0Var5 != null ? o2y0Var5.b().a : null;
                if (o2y0Var5 != null && (c2 = o2y0Var5.c()) != null && (name2 = c2.name()) != null) {
                    str = name2.toLowerCase(Locale.ROOT);
                }
                tlsVar5.invoke(new cpf0(new dpf0(str7, str8, str, iVar.G(), Collections.singletonList("DEEPLINK".toLowerCase(Locale.ROOT)), kpf0Var4.a.k), str6));
                qke.E(listItemComponent.getContext(), HapticController$Effect.CLICK_MEDIUM, false, 8);
                return;
            case 8:
                AudioTrack audioTrack = (AudioTrack) this.b;
                bh3 bh3Var = (bh3) this.c;
                Handler handler = (Handler) this.w;
                ah3 ah3Var = (ah3) this.x;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (bh3Var != null && handler.getLooper().getThread().isAlive()) {
                        handler.post(new zvg(i2, bh3Var, ah3Var));
                    }
                    synchronized (c.k0) {
                        try {
                            int i5 = c.m0 - 1;
                            c.m0 = i5;
                            if (i5 == 0) {
                                c.l0.shutdown();
                                c.l0 = null;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    if (bh3Var != null && handler.getLooper().getThread().isAlive()) {
                        handler.post(new zvg(i2, bh3Var, ah3Var));
                    }
                    synchronized (c.k0) {
                        try {
                            int i6 = c.m0 - 1;
                            c.m0 = i6;
                            if (i6 == 0) {
                                c.l0.shutdown();
                                c.l0 = null;
                            }
                            throw th2;
                        } finally {
                        }
                    }
                }
            case 9:
                ((DefaultSurfaceProcessor) this.b).lambda$initGlRenderer$9((q8n) this.c, (Map) this.w, (androidx.concurrent.futures.b) this.x);
                return;
            case 10:
                ru.yandex.taxi.discovery.b bVar2 = (ru.yandex.taxi.discovery.b) this.b;
                mwj mwjVar = (mwj) this.c;
                ModalView modalView = (ModalView) this.w;
                sy60 sy60Var = (sy60) this.x;
                kf00 kf00Var = bVar2.w;
                String str9 = mwjVar.a;
                HashMap A = oyr.A(kf00Var);
                if (str9 != null) {
                    A.put(Constants.KEY_SERVICE, str9);
                }
                x4e.B(kf00Var.a, "Map.ModeClosed", A, 1);
                bVar2.z.f(modalView, new uxh(20, sy60Var));
                bVar2.D = null;
                return;
            case 11:
                ((DualSurfaceProcessor) this.b).lambda$initGlRenderer$5((q8n) this.c, (Map) this.w, (androidx.concurrent.futures.b) this.x);
                return;
            case 12:
                ExoPlayerProperThreadRunner.runOnProperThread$lambda$0((AtomicReference) this.b, (sls) this.c, (AtomicReference) this.w, (CountDownLatch) this.x);
                return;
            case 13:
                edr edrVar = (edr) this.b;
                long j = ((lwa0) this.c).a;
                lwa0 lwa0Var = (lwa0) this.w;
                String str10 = (String) this.x;
                if (edrVar.d) {
                    av20 av20Var = edrVar.a;
                    long j2 = lwa0Var.a - j;
                    ev20 ev20Var = av20Var.a;
                    ev20Var.a("FirstInputDelay", j2, str10, ev20Var.n);
                    ev20Var.a.reportAdditionalMetric(ev20Var.r, "FirstInputTime", j - ev20Var.b().a, str10, ev20Var.q.b);
                    return;
                }
                return;
            case 14:
                ba20 ba20Var = (ba20) this.b;
                String str11 = (String) this.c;
                String str12 = (String) this.w;
                StringBuilder sb = (StringBuilder) this.x;
                Uri uri = nrs.x;
                ba20Var.error(str11, str12, sb.toString());
                return;
            case 15:
                ((w8v) this.b).O((r1s) this.c, (Executor) this.w, (u8v) this.x);
                return;
            case 16:
                pk20 pk20Var = (pk20) this.b;
                HashMap hashMap = (HashMap) this.c;
                x4r0 x4r0Var = (x4r0) this.w;
                HashMap hashMap2 = (HashMap) this.x;
                ot7 ot7Var = pk20Var.c;
                x4r0Var.x.getTimestamp();
                ot7Var.accept(new ok20(hashMap, hashMap2));
                return;
            case 17:
                ((an40) ((wrr) this.b).A).a(((ikx0) this.c).b.a, ((pex0) this.w).b, ((TariffTrailView) this.x).toggleCheckbox());
                return;
            case 18:
                ((uq40) this.b).f((mq40) this.c, (jr40) this.w, (wq40) this.x);
                return;
            case 19:
                NativeApi.call$lambda$0$0((wls) this.b, (String) this.c, (NativeApi) this.w, (String) this.x);
                return;
            case 20:
                yn50 yn50Var = (yn50) this.b;
                ImageView imageView = (ImageView) this.c;
                k9v k9vVar = (k9v) this.w;
                ad7 ad7Var = (ad7) this.x;
                if (imageView != null) {
                    yn50Var.a.h(imageView);
                    FadingDrawable.setBitmap(imageView, ad7Var.a, false, ad7Var.d);
                }
                if (k9vVar != null) {
                    k9vVar.e(ad7Var);
                    return;
                }
                return;
            case 21:
                TaxiOrder taxiOrder = (TaxiOrder) this.b;
                rp70 rp70Var = (rp70) this.c;
                Dialog.a aVar2 = (Dialog.a) this.w;
                at20 at20Var = (at20) this.x;
                synchronized (taxiOrder) {
                    taxiOrder.l = taxiOrder.l.I();
                }
                rp70Var.d.d(taxiOrder.a, aVar2.a);
                ((ru.yandex.taxi.order.i) at20Var.a).k0.a((o2y0) at20Var.b, RouteChangeType.CHANGE_DESTINATION);
                return;
            case 22:
                OrderViewContainer.animateOrderViewDisappearing$lambda$0((OrderViewContainer) this.b, (ViewPropertyAnimator) this.c, (OrderView) this.w, (Runnable) this.x);
                return;
            case 23:
                so3 so3Var = (so3) this.b;
                RequestUserData requestUserData = (RequestUserData) this.c;
                op90 op90Var = (op90) this.w;
                GetExperimentsResponse getExperimentsResponse = (GetExperimentsResponse) this.x;
                kp90 kp90Var = ((mp90) so3Var.y).x;
                if (kp90Var != null) {
                    kp90Var.a(requestUserData.user, op90Var.a, getExperimentsResponse);
                    return;
                }
                return;
            case 24:
                com.yandex.go.payments.paymentlist.domain.i iVar2 = (com.yandex.go.payments.paymentlist.domain.i) this.b;
                PaymentMethod$Type paymentMethod$Type = (PaymentMethod$Type) this.c;
                lv90 lv90Var = (lv90) this.w;
                rif0 rif0Var = (rif0) this.x;
                String str13 = lv90Var.b;
                lv90.Companion.getClass();
                iVar2.y.a(kv90.a(paymentMethod$Type, str13, null));
                rif0Var.og(true);
                return;
            case 25:
                ((fva0) this.b).a((String) this.c, (PerformanceAnalytics$Type) this.w, (dia0) this.x);
                return;
            case 26:
                ((g) this.b).a((String) this.c, (Consumer) this.w, (Consumer) this.x);
                return;
            case 27:
                PreloadWorkerJobHandle.reportFinish$lambda$2((PreloadWorkerJobHandle) this.b, (JobResult) this.c, (List) this.w, (PreloadException) this.x);
                return;
            case 28:
                Method method = (Method) this.b;
                i2k0 i2k0Var = (i2k0) this.c;
                Object[] objArr = (Object[]) this.w;
                Throwable th3 = (Throwable) this.x;
                try {
                    method.invoke(i2k0Var, Arrays.copyOf(objArr, objArr.length));
                    return;
                } catch (Exception e) {
                    th3.initCause(e);
                    jst.e.x(th3, "Terrible error during handling in ui");
                    return;
                }
            default:
                ((ba20) this.b).error((String) this.c, (String) this.w, this.x);
                return;
        }
    }
}
