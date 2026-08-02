package defpackage;

import android.net.Uri;
import android.util.ArrayMap;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.camera2.internal.b;
import androidx.camera.video.internal.audio.d;
import androidx.lifecycle.v;
import androidx.media3.common.a;
import com.yandex.go.charity.models.OpenCharitySource;
import com.yandex.go.sharedpayments.api.analytics.SharedPaymentsOpenReason;
import com.yandex.go.sharedpayments.api.model.SharedAccountScreen;
import com.yandex.go.taxi.order.communications.h;
import com.yandex.go.zone.dto.objects.ServiceLevel;
import com.yandex.messaging.ChatRequest;
import com.yandex.mobile.drive.sdk.full.internal.DriveException;
import com.yandex.payment.divkit.bind.DKBindCardFragment;
import com.yandex.payment.sdk.ui.CardInputView;
import com.ybsdk.feature.card.internal.presentation.carddetails.CardDetailsFragment;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.flow.r0;
import retrofit2.Response;
import ru.yandex.taxi.HapticController$Effect;
import ru.yandex.taxi.banners.c;
import ru.yandex.taxi.costcenters.base.CostCenterBaseModalView;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.settings.main.MainMenuProcessor$MenuEntry;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;
import ru.yandex.taxi.widget.progress.SimpleSpinnerModalView;

/* loaded from: classes15.dex */
public final /* synthetic */ class d1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ d1(v2f v2fVar, Throwable th) {
        this.a = 26;
        Map map = Collections.EMPTY_MAP;
        this.b = v2fVar;
        this.c = th;
        this.w = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        v a;
        DriveState c;
        String name;
        CardInputView cardInputView;
        int i = this.a;
        Object obj = null;
        Object obj2 = this.w;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                e1 e1Var = (e1) obj4;
                Future future = e1Var.a;
                zvi zviVar = (zvi) obj3;
                try {
                    try {
                        pyj0 pyj0Var = (pyj0) ((p0) obj2).invoke(e1Var);
                        if (future != null && !future.isCancelled()) {
                            zviVar.invoke(pyj0Var);
                            break;
                        }
                    } catch (Throwable unused) {
                        return;
                    }
                } catch (Throwable th) {
                    if (future == null || future.isCancelled()) {
                        return;
                    }
                    if (th instanceof DriveException) {
                        zviVar.invoke(new lzj0(th));
                        return;
                    }
                    String message = th.getMessage();
                    if (message == null && (message = th.getLocalizedMessage()) == null) {
                        message = "";
                    }
                    zviVar.invoke(new lzj0(new DriveException(-1, message, th)));
                    return;
                }
                break;
            case 1:
                Throwable th2 = (Throwable) obj4;
                w6 w6Var = (w6) obj3;
                List list = (List) obj2;
                if (th2 == null) {
                    w6Var.b.a(list);
                    break;
                } else {
                    w6Var.b.onError(th2);
                    break;
                }
            case 2:
                xg3 xg3Var = (xg3) ((h0w) obj4).c;
                int i2 = tw21.a;
                xg3Var.onAudioInputFormatChanged((a) obj3, (qyg) obj2);
                break;
            case 3:
                d dVar = (d) obj4;
                Executor executor = (Executor) obj3;
                o8g0 o8g0Var = (o8g0) obj2;
                int ordinal = dVar.g.ordinal();
                if (ordinal == 0) {
                    dVar.j = executor;
                    dVar.k = o8g0Var;
                    break;
                } else if (ordinal == 1 || ordinal == 2) {
                    ny61.f("The audio recording callback must be registered before the audio source is started.");
                    break;
                }
            case 4:
                Runnable runnable = (Runnable) obj4;
                c cVar = (c) obj3;
                Runnable runnable2 = (Runnable) obj2;
                if (runnable != null) {
                    runnable.run();
                }
                pzt0 pzt0Var = cVar.p;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                cVar.p = null;
                yes0 yes0Var = SimpleSpinnerModalView.Companion;
                ViewGroup viewGroup = cVar.a.a;
                yes0Var.getClass();
                SimpleSpinnerModalView a2 = yes0.a(viewGroup);
                if (a2 != null) {
                    a2.dismiss(runnable2);
                    break;
                }
                break;
            case 5:
                u500 u500Var = ((zw6) obj4).g;
                u500Var.getClass();
                u500Var.d(MainMenuProcessor$MenuEntry.CREATE_BUSINESS_ACCOUNT_WITHOUT_ONBORDING, new umr0((tmr0) obj3, (SharedPaymentsOpenReason) obj2, null));
                break;
            case 6:
                u500 u500Var2 = ((zw6) obj4).g;
                u500Var2.getClass();
                u500Var2.d(MainMenuProcessor$MenuEntry.SHARED_PAYMENT_EXISTS_DIALOG, new mmr0((snr0) obj3, (tmr0) obj2));
                break;
            case 7:
                u500 u500Var3 = ((zw6) obj4).g;
                SharedPaymentsOpenReason sharedPaymentsOpenReason = SharedPaymentsOpenReason.DEEPLINK;
                u500Var3.getClass();
                u500Var3.d(MainMenuProcessor$MenuEntry.CREATE_SHARED_PAYMENT_GROUP, new umr0((tmr0) obj3, sharedPaymentsOpenReason, (Uri) obj2));
                break;
            case 8:
                ((zw6) obj4).g.e((snr0) obj3, (SharedAccountScreen) obj2);
                break;
            case 9:
                uo7 uo7Var = (uo7) obj2;
                hm7 hm7Var = ((b) obj4).B;
                ((HashSet) hm7Var.b).add(uo7Var);
                ((ArrayMap) hm7Var.c).put(uo7Var, (Executor) obj3);
                break;
            case 10:
                sgb1.g(3, "Camera2CapturePipeline");
                ((gn7) obj4).d.a(System.currentTimeMillis() + 3000, (en7) ((AtomicReference) obj3).get());
                ((androidx.concurrent.futures.b) obj2).b(null);
                break;
            case 11:
                pq60 pq60Var = (pq60) obj3;
                String str = (String) obj2;
                try {
                    Iterator it = ((ArrayList) obj4).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (jl40.l(((ar7) next).c(), str)) {
                                obj = next;
                            }
                        }
                    }
                    ar7 ar7Var = (ar7) obj;
                    if (ar7Var != null && (a = ar7Var.a()) != null) {
                        a.j(pq60Var);
                        break;
                    }
                } catch (IllegalArgumentException unused2) {
                    return;
                }
                break;
            case 12:
                CardDetailsFragment.renderCarousel$lambda$47((cp8) obj4, (CardDetailsFragment) obj3, (g661) obj2);
                break;
            case 13:
                mh8 mh8Var = (mh8) obj4;
                mh8Var.d.setExternalPreparedNumber((String) obj3);
                mh8Var.e.setExternalDate((String) obj2);
                break;
            case 14:
                h29 h29Var = (h29) obj4;
                h29Var.c((pex0) obj3);
                String str2 = ((ServiceLevel.Branding) obj2).l;
                if (str2 != null) {
                    ru.yandex.taxi.summary.deeplink.a aVar = h29Var.f;
                    aVar.getClass();
                    aVar.a(str2, v770.b, SelectionOrigin.DEEPLINK);
                    break;
                }
                break;
            case 15:
                h29 h29Var2 = (h29) obj4;
                String str3 = (String) obj2;
                h29Var2.c((pex0) obj3);
                md6 md6Var = h29Var2.b;
                d49 d49Var = (d49) md6Var.c;
                if (str3 != null && !evu0.J(str3)) {
                    c.l((c) md6Var.b, str3, "cashback_branding_tariff", null, new dn7(17, d49Var), null, 20);
                    break;
                } else {
                    d49Var.a();
                    break;
                }
            case 16:
                ((pep0) ((oep0) obj4)).f((m950) ((kza) obj3).b.get(), new oza(((iza) obj2).a, OpenCharitySource.DEEPLINK), hxx.a);
                break;
            case 17:
                com.yandex.messaging.internal.authorized.chat.b bVar = (com.yandex.messaging.internal.authorized.chat.b) obj4;
                s020 s020Var = (s020) obj2;
                HashMap hashMap = bVar.i;
                ChatRequest chatRequest = (ChatRequest) ((an8) obj3).c;
                if (hashMap.get(chatRequest) == null) {
                    bVar.i.put(chatRequest, ((m8g) s020Var).a);
                    break;
                }
                break;
            case 18:
                com.yandex.messaging.internal.authorized.chat.b bVar2 = (com.yandex.messaging.internal.authorized.chat.b) obj4;
                ChatRequest chatRequest2 = (ChatRequest) obj3;
                s020 s020Var2 = (s020) obj2;
                if (bVar2.i.get(chatRequest2) == null) {
                    bVar2.i.put(chatRequest2, ((m8g) s020Var2).a);
                    break;
                }
                break;
            case 19:
                vtb vtbVar = (vtb) obj4;
                View view = (View) obj3;
                amb1 amb1Var = (amb1) obj2;
                vtbVar.a.endViewTransition(view);
                vtbVar.b.remove(view);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                view.setTranslationZ(0.0f);
                view.setAlpha(amb1Var instanceof utb ? ((Number) ((utb) amb1Var).d.c()).floatValue() : ((Number) amb1Var.a().f()).floatValue());
                break;
            case 20:
                ru.yandex.taxi.clarifypoint.b bVar3 = (ru.yandex.taxi.clarifypoint.b) obj4;
                vbb vbbVar = (vbb) obj3;
                r0 r0Var = bVar3.f.d;
                vyb vybVar = vyb.b;
                r0Var.getClass();
                r0Var.m(null, vybVar);
                boolean g = ((d0l0) obj2).g(bVar3.d.c());
                x880 x880Var = (x880) vbbVar.a;
                if (!g) {
                    x880Var.o();
                    ((azb) vbbVar.b).a.a();
                    break;
                } else {
                    x880Var.n();
                    break;
                }
            case 21:
                ((une) obj4).d.e((snr0) obj3, (SharedAccountScreen) obj2);
                break;
            case 22:
                u500 u500Var4 = ((une) obj4).d;
                SharedPaymentsOpenReason sharedPaymentsOpenReason2 = SharedPaymentsOpenReason.DEEPLINK;
                u500Var4.getClass();
                u500Var4.d(MainMenuProcessor$MenuEntry.CREATE_SHARED_PAYMENT_GROUP, new umr0((tmr0) obj3, sharedPaymentsOpenReason2, (Uri) obj2));
                break;
            case 23:
                u500 u500Var5 = ((une) obj4).d;
                u500Var5.getClass();
                u500Var5.d(MainMenuProcessor$MenuEntry.SHARED_PAYMENT_EXISTS_DIALOG, new mmr0((snr0) obj3, (tmr0) obj2));
                break;
            case 24:
                CostCenterBaseModalView.dismissInternal$lambda$0((Runnable) obj4, (Runnable) obj3, (CostCenterBaseModalView) obj2);
                break;
            case 25:
                h hVar = (h) obj4;
                kpf0 kpf0Var = (kpf0) obj3;
                String str4 = (String) obj2;
                tls tlsVar = hVar.l0;
                String str5 = kpf0Var.a.a;
                o2y0 o2y0Var = hVar.k0;
                String str6 = o2y0Var != null ? o2y0Var.b().a : null;
                if (o2y0Var != null && (c = o2y0Var.c()) != null && (name = c.name()) != null) {
                    obj = name.toLowerCase(Locale.ROOT);
                }
                tlsVar.invoke(new cpf0(new dpf0(str5, str6, obj, hVar.G(), Collections.singletonList("counter_arrow_button"), kpf0Var.a.k), str4));
                qke.E(hVar.j0.getContext(), HapticController$Effect.CLICK_MEDIUM, false, 8);
                break;
            case 26:
                Throwable th3 = (Throwable) obj3;
                Map map = Collections.EMPTY_MAP;
                com.google.firebase.crashlytics.internal.common.a aVar2 = ((v2f) obj4).h;
                Thread currentThread = Thread.currentThread();
                long currentTimeMillis = System.currentTimeMillis();
                j3f j3fVar = aVar2.n;
                if (j3fVar == null || !j3fVar.e.get()) {
                    long j = currentTimeMillis / 1000;
                    String f = aVar2.f();
                    if (f != null) {
                        pgo pgoVar = new pgo(f, j, map);
                        u0r0 u0r0Var = aVar2.m;
                        u0r0Var.getClass();
                        Log.isLoggable("FirebaseCrashlytics", 2);
                        u0r0Var.f(th3, currentThread, "error", pgoVar, false);
                        break;
                    }
                }
                break;
            case 27:
                String str7 = (String) obj3;
                String str8 = (String) obj2;
                cardInputView = ((DKBindCardFragment) obj4).cardInput;
                if (cardInputView != null) {
                    cardInputView.setNfcCardAndDate(str7, str8);
                    break;
                }
                break;
            case 28:
                com.yandex.payment.divkit.bind.view.a aVar3 = (com.yandex.payment.divkit.bind.view.a) obj4;
                aVar3.e.setExternalPreparedNumber((String) obj3);
                aVar3.f.setDate((String) obj2);
                break;
            default:
                yk7 yk7Var = (yk7) obj3;
                Response response = (Response) obj2;
                q7h q7hVar = (q7h) ((j0g) obj4).b;
                if (!q7hVar.b.n()) {
                    yk7Var.o(q7hVar, response);
                    break;
                } else {
                    yk7Var.k(q7hVar, new IOException("Canceled"));
                    break;
                }
        }
    }

    public /* synthetic */ d1(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }
}
