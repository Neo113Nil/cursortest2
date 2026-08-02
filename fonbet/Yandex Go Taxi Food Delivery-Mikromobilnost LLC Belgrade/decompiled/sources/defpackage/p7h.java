package defpackage;

import android.content.Intent;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.Pair;
import android.util.Rational;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.core.CameraControl$OperationCanceledException;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessor;
import androidx.fragment.app.DefaultSpecialEffectsController$AnimationEffect$onCommit$1;
import androidx.fragment.app.b;
import androidx.fragment.app.f;
import com.airbnb.lottie.LottieAnimationView;
import com.google.common.collect.ImmutableList;
import com.google.firebase.messaging.EnhancedIntentService;
import com.yandex.go.drive.delegates.a;
import com.yandex.go.navigator.gas_stations.filters.GasStationsFiltersListModalView;
import com.yandex.go.navigator.gas_stations.filters.GasStationsFiltersModalView;
import com.yandex.go.sharedpayments.api.analytics.SharedPaymentsOpenReason;
import com.yandex.go.sharedpayments.api.model.SharedAccountScreen;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.component.IntercityDashboardBannersContainerView;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.component.IntercityDashboardPromoBannerContainerView;
import com.yandex.go.taxi.order.view.driver.DriverCircleButton;
import com.yandex.messaging.internal.net.file.FileProgressObservable$Listener$Status;
import com.ybsdk.feature.savings.internal.views.diffrate.DiffRateCalendarView;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.webrtc.EglRenderer;
import ru.yandex.taxi.gopayments.dto.SharedAccountType;

/* loaded from: classes15.dex */
public final /* synthetic */ class p7h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ p7h(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v55, types: [im7, lur] */
    @Override // java.lang.Runnable
    public final void run() {
        Rational rational;
        final long F;
        float f;
        int i = 2;
        int i2 = 1;
        switch (this.a) {
            case 0:
                ((yk7) this.c).k((q7h) ((j0g) this.b).b, (Throwable) this.w);
                return;
            case 1:
                DefaultSpecialEffectsController$AnimationEffect$onCommit$1.onAnimationEnd$lambda$0((ViewGroup) this.b, (View) this.c, (b) this.w);
                return;
            case 2:
                iot0 iot0Var = (iot0) this.b;
                iot0 iot0Var2 = (iot0) this.c;
                f fVar = (f) this.w;
                ees.a(iot0Var.c, iot0Var2.c, fVar.o, fVar.n);
                return;
            case 3:
                ((DefaultSurfaceProcessor) this.b).lambda$executeSafely$12((Runnable) this.c, (Runnable) this.w);
                return;
            case 4:
                DiffRateCalendarView.renderContent$lambda$3((DiffRateCalendarView) this.b, (List) this.c, (tls) this.w);
                return;
            case 5:
                a aVar = (a) this.b;
                tls tlsVar = (tls) this.c;
                sls slsVar = (sls) this.w;
                ucm b = aVar.c.b();
                if (b != null) {
                    tlsVar.invoke(b);
                    return;
                } else {
                    aVar.b(slsVar, tlsVar);
                    return;
                }
            case 6:
                DriverCircleButton.setOnClickListener$lambda$0((DriverCircleButton) this.b, (qim) this.c, (Runnable) this.w);
                return;
            case 7:
                mmm mmmVar = (mmm) this.b;
                ((nmm) this.c).onDrmSessionManagerError(mmmVar.a, mmmVar.b, (Exception) this.w);
                return;
            case 8:
                ((DualSurfaceProcessor) this.b).lambda$executeSafely$8((Runnable) this.c, (Runnable) this.w);
                return;
            case 9:
                ((EglRenderer) this.b).lambda$removeFrameListener$2((CountDownLatch) this.c, (EglRenderer.FrameListener) this.w);
                return;
            case 10:
                abe abeVar = (abe) this.b;
                etn etnVar = (etn) this.c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.w;
                try {
                    syr g = q791.g(abeVar.a);
                    if (g == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    ryr ryrVar = (ryr) g.a;
                    synchronized (ryrVar.w) {
                        ryrVar.y = threadPoolExecutor;
                    }
                    g.a.a(new htn(etnVar, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    etnVar.a(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 11:
                fzn fznVar = (fzn) this.b;
                dq60 dq60Var = (dq60) this.c;
                Executor executor = (Executor) this.w;
                LinkedHashMap linkedHashMap = fznVar.a;
                dq60Var.getClass();
                executor.getClass();
                linkedHashMap.put(dq60Var, executor);
                executor.execute(new wqj(25, dq60Var, fznVar.b));
                return;
            case 12:
                ((EnhancedIntentService) this.b).lambda$processIntent$0((Intent) this.c, (atx0) this.w);
                return;
            case 13:
                v1b v1bVar = (v1b) this.b;
                wjm wjmVar = (wjm) this.c;
                m5z m5zVar = (m5z) this.w;
                w3i w3iVar = (w3i) wjmVar.c;
                u1n u1nVar = new u1n(18, wjmVar, v1bVar);
                bwu bwuVar = (bwu) w3iVar.c;
                io3 io3Var = new io3(26, w3iVar, m5zVar, u1nVar);
                bwuVar.getClass();
                String uuid = UUID.randomUUID().toString();
                hfy hfyVar = new hfy();
                xf7 xf7Var = bwuVar.a;
                com.yandex.messaging.internal.net.a aVar2 = bwuVar.b;
                c370 c370Var = bwuVar.c;
                x22 x22Var = bwuVar.d;
                String str = bwuVar.e.c;
                v1bVar.c = new awu(xf7Var, aVar2, c370Var, x22Var, str != null ? "android_".concat(str) : ConstantDeviceInfo.APP_PLATFORM, uuid, io3Var, hfyVar);
                return;
            case 14:
                a1r a1rVar = (a1r) this.b;
                String str2 = (String) this.c;
                IOException iOException = (IOException) this.w;
                a1rVar.b.remove(str2);
                a1rVar.c.put(str2, iOException);
                zq60 zq60Var = (zq60) a1rVar.a.get(str2);
                if (zq60Var == null) {
                    return;
                }
                Iterator it = zq60Var.iterator();
                while (true) {
                    sq60 sq60Var = (sq60) it;
                    if (!sq60Var.hasNext()) {
                        return;
                    } else {
                        ((z0r) sq60Var.next()).a(FileProgressObservable$Listener$Status.ERROR);
                    }
                }
            case 15:
                final mur murVar = (mur) this.b;
                androidx.concurrent.futures.b bVar = (androidx.concurrent.futures.b) this.c;
                fur furVar = (fur) this.w;
                if (!murVar.d) {
                    bVar.d(new CameraControl$OperationCanceledException("Camera is not active."));
                    return;
                }
                Rect j = ((ye61) murVar.a.i.y).j();
                if (murVar.e != null) {
                    rational = murVar.e;
                } else {
                    Rect j2 = ((ye61) murVar.a.i.y).j();
                    rational = new Rational(j2.width(), j2.height());
                }
                List list = furVar.a;
                Integer num = (Integer) murVar.a.e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
                List d = murVar.d(list, num == null ? 0 : num.intValue(), rational, j, 1);
                List list2 = furVar.b;
                Integer num2 = (Integer) murVar.a.e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
                List d2 = murVar.d(list2, num2 == null ? 0 : num2.intValue(), rational, j, 2);
                List list3 = furVar.c;
                Integer num3 = (Integer) murVar.a.e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB);
                List d3 = murVar.d(list3, num3 == null ? 0 : num3.intValue(), rational, j, 4);
                if (d.isEmpty() && d2.isEmpty() && d3.isEmpty()) {
                    bVar.d(new IllegalArgumentException("None of the specified AF/AE/AWB MeteringPoints is supported on this camera."));
                    return;
                }
                murVar.a.B(murVar.o);
                androidx.concurrent.futures.b bVar2 = murVar.t;
                if (bVar2 != null) {
                    bVar2.d(new CameraControl$OperationCanceledException("Cancelled by another startFocusAndMetering()"));
                    murVar.t = null;
                }
                murVar.a.B(murVar.p);
                androidx.concurrent.futures.b bVar3 = murVar.u;
                if (bVar3 != null) {
                    bVar3.d(new CameraControl$OperationCanceledException("Cancelled by another startFocusAndMetering()"));
                    murVar.u = null;
                }
                ScheduledFuture scheduledFuture = murVar.i;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                    murVar.i = null;
                }
                murVar.t = bVar;
                MeteringRectangle[] meteringRectangleArr = mur.x;
                MeteringRectangle[] meteringRectangleArr2 = (MeteringRectangle[]) d.toArray(meteringRectangleArr);
                MeteringRectangle[] meteringRectangleArr3 = (MeteringRectangle[]) d2.toArray(meteringRectangleArr);
                MeteringRectangle[] meteringRectangleArr4 = (MeteringRectangle[]) d3.toArray(meteringRectangleArr);
                k6u k6uVar = murVar.c;
                androidx.camera.camera2.internal.b bVar4 = murVar.a;
                bVar4.B(murVar.o);
                ScheduledFuture scheduledFuture2 = murVar.i;
                if (scheduledFuture2 != null) {
                    scheduledFuture2.cancel(true);
                    murVar.i = null;
                }
                ScheduledFuture scheduledFuture3 = murVar.j;
                if (scheduledFuture3 != null) {
                    scheduledFuture3.cancel(true);
                    murVar.j = null;
                }
                murVar.q = meteringRectangleArr2;
                murVar.r = meteringRectangleArr3;
                murVar.s = meteringRectangleArr4;
                if (meteringRectangleArr2.length > 0) {
                    murVar.g = true;
                    murVar.l = false;
                    murVar.m = false;
                    F = bVar4.F();
                    murVar.g(true);
                } else {
                    murVar.g = false;
                    murVar.l = true;
                    murVar.m = false;
                    F = bVar4.F();
                }
                murVar.h = 0;
                final boolean z = bVar4.w(1) == 1;
                ?? r0 = new im7() { // from class: lur
                    @Override // defpackage.im7
                    public final boolean b(TotalCaptureResult totalCaptureResult) {
                        mur murVar2 = mur.this;
                        murVar2.getClass();
                        Integer num4 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                        if (murVar2.q.length > 0) {
                            if (!z || num4 == null) {
                                murVar2.m = true;
                                murVar2.l = true;
                            } else if (murVar2.h.intValue() == 3) {
                                if (num4.intValue() == 4) {
                                    murVar2.m = true;
                                    murVar2.l = true;
                                } else if (num4.intValue() == 5) {
                                    murVar2.m = false;
                                    murVar2.l = true;
                                }
                            }
                        }
                        if (!murVar2.l || !androidx.camera.camera2.internal.b.A(totalCaptureResult, F)) {
                            if (!murVar2.h.equals(num4) && num4 != null) {
                                murVar2.h = num4;
                            }
                            return false;
                        }
                        boolean z2 = murVar2.m;
                        ScheduledFuture scheduledFuture4 = murVar2.j;
                        if (scheduledFuture4 != null) {
                            scheduledFuture4.cancel(true);
                            murVar2.j = null;
                        }
                        androidx.concurrent.futures.b bVar5 = murVar2.t;
                        if (bVar5 != null) {
                            bVar5.b(new nur(z2));
                            murVar2.t = null;
                        }
                        return true;
                    }
                };
                murVar.o = r0;
                bVar4.r(r0);
                long j3 = murVar.k + 1;
                murVar.k = j3;
                hur hurVar = new hur(i2, j3, murVar);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                murVar.j = k6uVar.schedule(hurVar, 5000L, timeUnit);
                long j4 = furVar.d;
                if (j4 > 0) {
                    murVar.i = k6uVar.schedule(new hur(i, j3, murVar), j4, timeUnit);
                    return;
                }
                return;
            case 16:
                GasStationsFiltersListModalView.adapter$lambda$0$1$0((GasStationsFiltersListModalView) this.b, (String) this.c, (wts) this.w);
                return;
            case 17:
                GasStationsFiltersModalView.createFiltersView$lambda$0$0((GasStationsFiltersModalView) this.b, (yts) this.c, (wts) this.w);
                return;
            case 18:
                GasStationsFiltersModalView.createServiceTrailView$lambda$0$0$0((GasStationsFiltersModalView) this.b, (yts) this.c, (List) this.w);
                return;
            case 19:
                lmw0 lmw0Var = (lmw0) this.b;
                com.yandex.go.requirements.order.a aVar3 = (com.yandex.go.requirements.order.a) this.c;
                pex0 pex0Var = (pex0) this.w;
                if (lmw0Var instanceof gmw0) {
                    gmw0 gmw0Var = (gmw0) lmw0Var;
                    aVar3.e.a(true, aVar3.d.a(gmw0Var, 0), pex0Var.b, gmw0Var.c);
                    return;
                }
                return;
            case 20:
                ((pep0) ((oep0) this.b)).f((m950) ((aku) this.c).b.get(), new hku(((zju) this.w).a), hxx.a);
                return;
            case 21:
                ((w8v) this.b).P((Executor) this.c, (t8v) this.w);
                return;
            case 22:
                IntercityDashboardBannersContainerView.setupBannerAction$lambda$0((IntercityDashboardBannersContainerView) this.b, (faw) this.c, (String) this.w);
                return;
            case 23:
                IntercityDashboardPromoBannerContainerView.render$lambda$0((ArrayList) this.b, (List) this.c, (IntercityDashboardPromoBannerContainerView) this.w);
                return;
            case 24:
                qow qowVar = (qow) this.b;
                row rowVar = (row) this.c;
                Exception exc = (Exception) this.w;
                qowVar.a(rowVar.c);
                hst hstVar = jst.e;
                String str3 = rowVar.c;
                String o = g8e.o("Intercity.Perf.Timeout::", str3);
                String message = exc.getMessage();
                if (message == null) {
                    message = g8e.o("Timeout for ", str3);
                }
                xby.t(hstVar, o, exc, message, 2);
                if (rowVar instanceof g270) {
                    qowVar.d.add(str3);
                    return;
                }
                return;
            case 25:
                no6 no6Var = (no6) this.b;
                String str4 = (String) this.c;
                String str5 = (String) this.w;
                if (no6Var.a) {
                    return;
                }
                uf60 uf60Var = (uf60) no6Var.c;
                uf60Var.getClass();
                tje.e();
                xqi0 xqi0Var = uf60Var.b;
                xqi0Var.c().putString("guid", str4).putString("yambtoken", str5).apply();
                xqi0Var.a(uf60Var, new yfy(xqi0Var, new sk7(str4, new ym3(str5, null == true ? 1 : 0))));
                return;
            case 26:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.b;
                nsz nszVar = (nsz) this.c;
                Runnable runnable = (Runnable) this.w;
                if (lottieAnimationView.getWidth() == 0 || lottieAnimationView.getHeight() == 0) {
                    f = 1.0f;
                } else {
                    f = nszVar.k.width() / lottieAnimationView.getWidth();
                    float height = nszVar.k.height() / lottieAnimationView.getHeight();
                    if (f < height) {
                        f = height;
                    }
                }
                lottieAnimationView.setScaleX(f);
                lottieAnimationView.setScaleY(f);
                lottieAnimationView.setComposition(nszVar);
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 27:
                snr0 snr0Var = (snr0) this.b;
                String str6 = (String) this.c;
                ru.yandex.taxi.settings.main.f fVar2 = (ru.yandex.taxi.settings.main.f) this.w;
                if (snr0Var.e) {
                    str6 = "";
                }
                com.yandex.go.payments.shared.a aVar4 = (com.yandex.go.payments.shared.a) fVar2.a0.get();
                aVar4.getClass();
                if (snr0Var.c == SharedAccountType.BUSINESS) {
                    aVar4.a.e(SharedPaymentsOpenReason.MENU, true);
                }
                vnr0 vnr0Var = fVar2.K;
                String str7 = snr0Var.a;
                rx2 rx2Var = vnr0Var.q;
                String k = vnr0Var.k(str7);
                rx2Var.getClass();
                HashMap hashMap = new HashMap();
                if (str7 != null) {
                    hashMap.put("group_id", str7);
                }
                if (k != null) {
                    hashMap.put("type_group", k);
                }
                if (str6 != null) {
                    hashMap.put("error", str6);
                }
                rx2Var.a.a("SettingsDidSelectSelectGroup", hashMap, 1, new HashMap());
                fVar2.D.e(snr0Var, SharedAccountScreen.DETAILS);
                return;
            case 28:
                af10 af10Var = (af10) this.b;
                ImmutableList.a aVar5 = (ImmutableList.a) this.c;
                sf10 sf10Var = (sf10) this.w;
                b32 b32Var = af10Var.c;
                ImmutableList g2 = aVar5.g();
                j5h j5hVar = (j5h) b32Var;
                i5h i5hVar = j5hVar.w;
                zxc0 zxc0Var = j5hVar.z;
                zxc0Var.getClass();
                i5hVar.getClass();
                i5hVar.b = ImmutableList.l(g2);
                if (!g2.isEmpty()) {
                    i5hVar.e = (sf10) g2.get(0);
                    sf10Var.getClass();
                    i5hVar.f = sf10Var;
                }
                if (i5hVar.d == null) {
                    i5hVar.d = i5h.b(zxc0Var, i5hVar.b, i5hVar.e, i5hVar.a);
                }
                i5hVar.d(zxc0Var.getCurrentTimeline());
                return;
            default:
                fg10 fg10Var = (fg10) this.b;
                Pair pair = (Pair) this.c;
                ((j5h) fg10Var.b.h).onDrmSessionManagerError(((Integer) pair.first).intValue(), (sf10) pair.second, (Exception) this.w);
                return;
        }
    }
}
