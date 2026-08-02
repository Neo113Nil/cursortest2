package defpackage;

import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import android.view.View;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.l;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.e;
import androidx.camera.core.f;
import androidx.camera.core.g;
import androidx.concurrent.futures.b;
import com.airbnb.lottie.LottieAnimationView;
import com.yandex.go.chargers.design.components.ChargersButtonsView;
import com.yandex.go.chargers.discovery.ui.ChargersDiscoveryModalView;
import com.yandex.go.chargers.error.ChargersErrorModalView;
import com.yandex.go.chargers.multiorder.ui.ChargersMultiOrderModalView;
import com.yandex.go.taxi.order.cancel.reasons.view.v2.CancelReasonsV2View;
import com.yandex.go.ui.CameraModalView;
import com.yandex.payment.sdk.cardscanner.CardScannerActivity;
import com.yandex.payment.sdk.core.camerascanner.CardScanData;
import com.yandex.payment.sdk.ui.CardInput$State;
import com.yandex.payment.sdk.ui.view.ChallengerInputView;
import com.yandex.payment.sdk.ui.view.card.CardNumberInput;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.Executor;
import kotlin.collections.a;
import ru.yandex.taxi.banners.CardBannerV1ModalView;
import ru.yandex.taxi.banners.CardBannerV2ModalView;
import ru.yandex.taxi.communications.api.dto.BannerWidgets;

/* loaded from: classes10.dex */
public final /* synthetic */ class nm7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nm7(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ny9 ny9Var;
        ny9 ny9Var2;
        r4a r4aVar;
        switch (this.a) {
            case 0:
                l lVar = (l) this.b;
                b bVar = (b) this.c;
                v920 v920Var = lVar.U;
                bVar.b(Boolean.valueOf(v920Var != null ? lVar.a.e(l.z(v920Var)) : false));
                return;
            case 1:
                Surface surface = (Surface) this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.c;
                surface.release();
                surfaceTexture.release();
                return;
            case 2:
                l lVar2 = (l) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                androidx.camera.camera2.internal.b bVar2 = lVar2.A;
                try {
                    lVar2.J(arrayList);
                    return;
                } finally {
                    bVar2.s();
                }
            case 3:
                l lVar3 = (l) this.b;
                String str = (String) this.c;
                lVar3.w("Use case " + str + " INACTIVE");
                LinkedHashMap linkedHashMap = lVar3.a.a;
                if (linkedHashMap.containsKey(str)) {
                    ti21 ti21Var = (ti21) linkedHashMap.get(str);
                    ti21Var.f = false;
                    if (!ti21Var.e) {
                        linkedHashMap.remove(str);
                    }
                }
                lVar3.M();
                return;
            case 4:
                ((androidx.camera.camera2.internal.b) this.b).B((cn7) this.c);
                return;
            case 5:
                zn7 zn7Var = (zn7) this.b;
                b bVar3 = (b) this.c;
                try {
                    String[] b = zn7Var.f.b();
                    ArrayList arrayList2 = new ArrayList(b.length);
                    for (String str2 : b) {
                        arrayList2.add(new yq7(scc.i(str2), null));
                    }
                    a.X(arrayList2, null, null, null, null, 63);
                    zn7Var.f(arrayList2, null);
                    bVar3.b(arrayList2);
                    return;
                } catch (CameraAccessExceptionCompat e) {
                    Log.e("Camera2PresenceSrc", "[FetchData] Failed to get camera list for refresh.", e);
                    CameraUnavailableException b2 = ceb1.b(e);
                    zn7Var.f(null, b2);
                    bVar3.d(b2);
                    return;
                }
            case 6:
                o89 o89Var = (o89) this.b;
                hq7 hq7Var = (hq7) this.c;
                i5f0 i5f0Var = (i5f0) o89Var.get();
                g f = new pxe0().f();
                f.J(hq7Var.b);
                v7v v7vVar = new v7v();
                Size size = new Size(640, 480);
                yy40 yy40Var = v7vVar.a;
                yy40Var.w(icv.r2, size);
                yy40Var.w(b8v.b, 0);
                f f2 = v7vVar.f();
                f2.N(hq7Var.e, new xp7(false ? 1 : 0, hq7Var));
                hq7Var.h = f2;
                xs7 xs7Var = xs7.c;
                try {
                    i5f0Var.g();
                    i5f0Var.d(hq7Var.f, xs7Var, f, hq7Var.h);
                    return;
                } catch (Exception e2) {
                    hq7Var.d.invoke(e2);
                    return;
                }
            case 7:
                CameraModalView.showPreview$lambda$0$0((CameraModalView) this.b, (Uri) this.c);
                return;
            case 8:
                ((br7) this.b).f().a().j((pq60) this.c);
                return;
            case 9:
                ((ar7) this.b).a().g((hs7) this.c);
                return;
            case 10:
                us7 us7Var = (us7) this.b;
                br7 br7Var = (br7) this.c;
                synchronized (us7Var.a) {
                    try {
                        us7Var.c.remove(br7Var);
                        if (us7Var.c.isEmpty()) {
                            us7Var.e.getClass();
                            us7Var.e.b(null);
                            us7Var.e = null;
                            us7Var.d = null;
                        }
                    } finally {
                    }
                }
                return;
            case 11:
                e eVar = (e) this.b;
                b bVar4 = (b) this.c;
                lm7 lm7Var = eVar.g;
                jm7 jm7Var = lm7Var.b;
                synchronized (jm7Var.a) {
                    jm7Var.c.clear();
                    jm7Var.d.clear();
                    jm7Var.f.clear();
                    jm7Var.e.clear();
                    jm7Var.g = 0;
                }
                lm7Var.j.e();
                if (eVar.f != null) {
                    Executor executor = eVar.d;
                    if (executor instanceof nq7) {
                        nq7 nq7Var = (nq7) executor;
                        synchronized (nq7Var.a) {
                            try {
                                if (!nq7Var.b.isShutdown()) {
                                    nq7Var.b.shutdown();
                                }
                            } finally {
                            }
                        }
                    }
                    eVar.f.quit();
                }
                bVar4.b(null);
                return;
            case 12:
                CancelReasonsV2View.lambda$0$0((xx7) this.b, (CancelReasonsV2View) this.c);
                return;
            case 13:
                eja1.i((androidx.work.impl.b) this.b, ((UUID) this.c).toString());
                return;
            case 14:
                h28 h28Var = (h28) this.b;
                g28 g28Var = (g28) this.c;
                o1c o1cVar = h28Var.T;
                String str3 = g28Var.b;
                o1cVar.Mb(g28Var);
                return;
            case 15:
                z88 z88Var = (z88) this.b;
                String str4 = (String) this.c;
                z88Var.b.setVisibility(0);
                z88Var.c.setVisibility(8);
                z88Var.a.a.webView.loadUrl(str4);
                return;
            case 16:
                CardBannerV1ModalView.addActionButton$lambda$0((CardBannerV1ModalView) this.b, (BannerWidgets.b) this.c);
                return;
            case 17:
                CardBannerV1ModalView.setData$lambda$1((CardBannerV1ModalView) this.b, (BannerWidgets.f) this.c);
                return;
            case 18:
                CardBannerV2ModalView.addActionButton$lambda$0((CardBannerV2ModalView) this.b, (BannerWidgets.b) this.c);
                return;
            case 19:
                CardBannerV2ModalView.setData$lambda$7$0((CardBannerV2ModalView) this.b, (BannerWidgets.f) this.c);
                return;
            case 20:
                ((CardBannerV2ModalView) this.b).hideAndReset((LottieAnimationView) this.c);
                return;
            case 21:
                ((mh8) this.c).d(((CardNumberInput) this.b).getReady() ? CardInput$State.CARD_NUMBER_VALID : CardInput$State.CARD_NUMBER);
                return;
            case 22:
                ((CardScannerActivity) this.b).finishWithResult((CardScanData) this.c);
                return;
            case 23:
                ((ChallengerInputView.a) this.b).a((View) this.c);
                return;
            case 24:
                ChargersButtonsView.createButton$lambda$0$0((ChargersButtonsView) this.b, (uo9) this.c);
                return;
            case 25:
                ChargersDiscoveryModalView.setOnBackPressedListener$lambda$0((ChargersDiscoveryModalView) this.b, (Runnable) this.c);
                return;
            case 26:
                sls slsVar = (sls) this.b;
                com.yandex.go.chargers.dvizh_subscription.web.b bVar5 = (com.yandex.go.chargers.dvizh_subscription.web.b) this.c;
                slsVar.invoke();
                bVar5.D.h();
                return;
            case 27:
                ChargersErrorModalView chargersErrorModalView = (ChargersErrorModalView) this.b;
                sy9 sy9Var = (sy9) this.c;
                ny9Var = chargersErrorModalView.chargersErrorPresenter;
                ny9Var.Kg(sy9Var.c.b);
                return;
            case 28:
                ChargersErrorModalView chargersErrorModalView2 = (ChargersErrorModalView) this.b;
                ry9 ry9Var = (ry9) this.c;
                ny9Var2 = chargersErrorModalView2.chargersErrorPresenter;
                ny9Var2.Kg(ry9Var.b);
                return;
            default:
                ChargersMultiOrderModalView chargersMultiOrderModalView = (ChargersMultiOrderModalView) this.b;
                v5a v5aVar = (v5a) this.c;
                r4aVar = chargersMultiOrderModalView.presenter;
                r4aVar.Kg(((m5a) v5aVar.b).d);
                return;
        }
    }
}
