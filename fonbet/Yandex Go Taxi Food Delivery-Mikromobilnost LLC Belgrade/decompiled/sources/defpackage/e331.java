package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JsPromptResult;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.a;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.summary.mobilityhub.analytics.TransitRoutesHubAnalytics$HubGeneration;
import com.yandex.go.taxi.summary.mobilityhub.analytics.TransitRoutesHubAnalytics$MobilityHubOrigin;
import com.yandex.go.taxi.summary.mobilityhub.analytics.TransitRoutesHubAnalytics$TransportCardStatus;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.f;
import com.yandex.go.vault.flexsdk.descriptors.widget.view.b;
import com.yandex.go.zone.model.Zone;
import com.yandex.mapkit.transport.masstransit.MasstransitLayer;
import com.yandex.mapkit.transport.masstransit.Route;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.webview.api.WebViewAppearanceOption;
import com.ybsdk.feature.webview.api.WebViewControl;
import com.ybsdk.feature.webview.internal.presentation.WebViewFragment;
import com.ybsdk.feature.webview.internal.presentation.c;
import com.ybsdk.widgets.common.checkbox.CheckBoxView;
import defpackage.tje;
import defpackage.x341;
import defpackage.z341;
import defpackage.zy11;
import io.flutter.plugins.webviewflutter.WebChromeClientProxyApi$WebChromeClientImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.collections.EmptyList;
import okhttp3.OkHttpClient;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ClickableImageView;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.masstransit.overlay.e;
import ru.yandex.taxi.masstransit.paymentcards.TransportCardStatus;
import ru.yandex.taxi.widget.ShimmeringBar;
import ru.yandex.taxi.zonemodes.j;

/* loaded from: classes14.dex */
public final /* synthetic */ class e331 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e331(j jVar, Zone zone, TaxiOrder taxiOrder) {
        this.a = 25;
        this.b = zone;
        this.c = taxiOrder;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String str;
        jyj0 jyj0Var;
        Object obj2;
        Object obj3;
        Object obj4;
        zy11 lambda$onJsPrompt$10;
        stz0 renderToolbar$lambda$27;
        nry nryVar;
        boolean z;
        boolean z2;
        int i = 8;
        switch (this.a) {
            case 0:
                nzm nzmVar = (nzm) this.b;
                Context context = (Context) this.c;
                t1w t1wVar = (t1w) obj;
                ButtonComponent buttonComponent = (ButtonComponent) nzmVar.c;
                ViewGroup.LayoutParams layoutParams = buttonComponent.getLayoutParams();
                if (layoutParams == null) {
                    ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, t1wVar.d > 0 ? tje.u(21, context) + t1wVar.d : tje.u(42, context));
                buttonComponent.setLayoutParams(marginLayoutParams);
                return Boolean.FALSE;
            case 1:
                ClickableImageView clickableImageView = (ClickableImageView) this.b;
                ShimmeringBar shimmeringBar = (ShimmeringBar) this.c;
                clickableImageView.setImageBitmap((Bitmap) obj);
                shimmeringBar.setVisibility(8);
                shimmeringBar.setShimmering(false);
                return zy11.a;
            case 2:
                final kcz0 kcz0Var = (kcz0) this.b;
                final String str2 = (String) this.c;
                return new okx() { // from class: j431
                    @Override // defpackage.okx
                    public final v0x a(Object obj5) {
                        return new t8a0(new a201(18, (b) ((h0l0) ((q431) kcz0.this.a).a.a).get(), str2));
                    }
                };
            case 3:
                e eVar = (e) this.b;
                List list = (List) this.c;
                MasstransitLayer masstransitLayer = (MasstransitLayer) obj;
                if (eVar.f.d()) {
                    masstransitLayer.addListener(eVar.h);
                    masstransitLayer.clearLineFilter();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        masstransitLayer.addLineFilter(((a631) it.next()).a);
                    }
                    masstransitLayer.setVehicleTapListener(eVar.i);
                    masstransitLayer.setVehiclesVisible(true);
                }
                return zy11.a;
            case 4:
                tls tlsVar = (tls) this.b;
                GoFrameLayout goFrameLayout = (GoFrameLayout) this.c;
                tlsVar.invoke(de31.a);
                long j = ((wu60) obj).a;
                long currentTimeMillis = System.currentTimeMillis();
                long currentTimeMillis2 = System.currentTimeMillis();
                int i2 = (int) (j >> 32);
                float intBitsToFloat = Float.intBitsToFloat(i2);
                int i3 = (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                goFrameLayout.dispatchTouchEvent(MotionEvent.obtain(currentTimeMillis, currentTimeMillis2, 0, intBitsToFloat, Float.intBitsToFloat(i3), 0));
                goFrameLayout.dispatchTouchEvent(MotionEvent.obtain(System.currentTimeMillis(), System.currentTimeMillis(), 1, Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), 0));
                return zy11.a;
            case 5:
                tls tlsVar2 = (tls) this.b;
                FrameLayout frameLayout = (FrameLayout) this.c;
                tlsVar2.invoke(ee31.a);
                long j2 = ((wu60) obj).a;
                long currentTimeMillis3 = System.currentTimeMillis();
                long currentTimeMillis4 = System.currentTimeMillis();
                int i4 = (int) (j2 >> 32);
                float intBitsToFloat2 = Float.intBitsToFloat(i4);
                int i5 = (int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                frameLayout.dispatchTouchEvent(MotionEvent.obtain(currentTimeMillis3, currentTimeMillis4, 0, intBitsToFloat2, Float.intBitsToFloat(i5), 0));
                frameLayout.dispatchTouchEvent(MotionEvent.obtain(System.currentTimeMillis(), System.currentTimeMillis(), 1, Float.intBitsToFloat(i4), Float.intBitsToFloat(i5), 0));
                return zy11.a;
            case 6:
                ((vw20) obj).n1((Route) this.b, (List) this.c, EmptyList.a);
                return zy11.a;
            case 7:
                vzu vzuVar = (vzu) this.b;
                ((z3y) obj).b.a(vzuVar.b.size(), new y3y(z3y.c, av0.A, new a(-1073209845, new nhu0(4, vzuVar, (tls) this.c), true)));
                return zy11.a;
            case 8:
                f fVar = (f) this.b;
                lv90 lv90Var = (lv90) this.c;
                fx01 fx01Var = (fx01) obj;
                o7r0 o7r0Var = fVar.g;
                PaymentMethod$Type a = lv90Var.a().a();
                if (a == null || (str = a.getCode()) == null) {
                    str = "";
                }
                if (lv90Var.c() && !lv90Var.equals(lv90.g)) {
                    r11 = true;
                }
                TransitRoutesHubAnalytics$HubGeneration transitRoutesHubAnalytics$HubGeneration = TransitRoutesHubAnalytics$HubGeneration.Second;
                String a2 = fVar.q.a.a();
                TransitRoutesHubAnalytics$MobilityHubOrigin a3 = rnb1.a(fVar.t);
                HashMap p = x4e.p("payment_method", str);
                p.put("payment_method_available", Boolean.valueOf(r11));
                p.put("offer", fx01Var.b);
                p.put("generation", transitRoutesHubAnalytics$HubGeneration.getEventValue());
                p.put("hub_session_id", a2);
                p.put("origin", a3.getEventValue());
                o7r0Var.a.a("TransitRoutesHub.Payment.Tapped", p, 2, new HashMap());
                return zy11.a;
            case 9:
                f fVar2 = (f) this.b;
                p011 p011Var = (p011) this.c;
                fx01 fx01Var2 = (fx01) obj;
                o7r0 o7r0Var2 = fVar2.g;
                TransitRoutesHubAnalytics$HubGeneration transitRoutesHubAnalytics$HubGeneration2 = TransitRoutesHubAnalytics$HubGeneration.Second;
                String a4 = fVar2.q.a.a();
                TransitRoutesHubAnalytics$MobilityHubOrigin a5 = rnb1.a(fVar2.t);
                TransportCardStatus transportCardStatus = p011Var.b;
                TransitRoutesHubAnalytics$TransportCardStatus e = transportCardStatus != null ? hta1.e(transportCardStatus) : null;
                r011 r011Var = p011Var.c;
                kx01 kx01Var = r011Var != null ? new kx01(r011Var.a, r011Var.b, r011Var.c) : null;
                String str3 = p011Var.a;
                HashMap hashMap = new HashMap();
                if (e != null) {
                    hashMap.put("card_status", e.getEventValue());
                }
                if (kx01Var != null) {
                    hashMap.put("card_balance", kx01Var.d);
                }
                if (str3 != null) {
                    hashMap.put("card_id", str3);
                }
                hashMap.put("offer", fx01Var2.b);
                hashMap.put("generation", transitRoutesHubAnalytics$HubGeneration2.getEventValue());
                hashMap.put("hub_session_id", a4);
                hashMap.put("origin", a5.getEventValue());
                o7r0Var2.a.a("TransitRoutesHub.PaymentCard.Shown", hashMap, 2, new HashMap());
                return zy11.a;
            case 10:
                f fVar3 = (f) this.b;
                String str4 = (String) this.c;
                o7r0 o7r0Var3 = fVar3.g;
                TransitRoutesHubAnalytics$HubGeneration transitRoutesHubAnalytics$HubGeneration3 = TransitRoutesHubAnalytics$HubGeneration.Second;
                String a6 = fVar3.q.a.a();
                TransitRoutesHubAnalytics$MobilityHubOrigin a7 = rnb1.a(fVar3.t);
                HashMap p2 = x4e.p("payment_method", str4);
                p2.put("offer", ((fx01) obj).b);
                p2.put("generation", transitRoutesHubAnalytics$HubGeneration3.getEventValue());
                p2.put("hub_session_id", a6);
                p2.put("origin", a7.getEventValue());
                o7r0Var3.a.a("TransitRoutesHub.Payment.Shown", p2, 2, new HashMap());
                return zy11.a;
            case 11:
                ((com.yandex.go.walking.navigation.impl.guidance.e) this.b).U((m341) obj, ((o341) this.c).h);
                return zy11.a;
            case 12:
                final x341 x341Var = (x341) this.b;
                com.yandex.go.walking.navigation.impl.location_mock.settings.interactor.a aVar = (com.yandex.go.walking.navigation.impl.location_mock.settings.interactor.a) this.c;
                yfd yfdVar = (yfd) obj;
                final w341 w341Var = new w341(x341Var);
                ((agd) yfdVar).c = aVar.a();
                agd agdVar = (agd) yfdVar;
                agdVar.e = new tls() { // from class: com.yandex.go.walking.navigation.impl.location_mock.settings.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj5) {
                        x341 x341Var2 = x341.this;
                        tje.N(x341Var2.o(), null, null, new WalkNavMockSettingsRouter$content$1$1$1(x341Var2, (z341) obj5, w341Var, null), 3);
                        return zy11.a;
                    }
                };
                lfd.a.getClass();
                agdVar.g = lfd.b;
                return zy11.a;
            case 13:
                lc41 lc41Var = (lc41) this.b;
                jc41 jc41Var = (jc41) this.c;
                smj smjVar = (smj) obj;
                gnj gnjVar = smjVar.b;
                String str5 = smjVar.a;
                String str6 = jc41Var.a;
                zwf0 zwf0Var = lc41Var.a;
                int i6 = kc41.a[lc41Var.w.ordinal()];
                if (i6 != 1) {
                    if (i6 != 2) {
                        w511.b();
                        return null;
                    }
                    if (gnjVar instanceof enj) {
                        obj2 = new lyj0(smjVar);
                    } else {
                        if (!(gnjVar instanceof fnj)) {
                            w511.b();
                            return null;
                        }
                        jyj0Var = new jyj0(new hnj(str5));
                        obj2 = jyj0Var;
                    }
                } else if (gnjVar instanceof fnj) {
                    obj2 = new lyj0(smjVar);
                } else {
                    if (!(gnjVar instanceof enj)) {
                        w511.b();
                        return null;
                    }
                    jyj0Var = new jyj0(new hnj(str5));
                    obj2 = jyj0Var;
                }
                if (obj2 instanceof lyj0) {
                    obj3 = ((lyj0) obj2).a;
                } else {
                    if (!(obj2 instanceof jyj0)) {
                        w511.b();
                        return null;
                    }
                    obj3 = smjVar;
                }
                syj0 a8 = anj.a((smj) obj3, lc41Var.c, zwf0Var);
                if (a8 instanceof lyj0) {
                    syj0 b = lc41Var.b.x.b(new zjc("handleWebDirective", new yjc(str6, str5, (png) ((lyj0) a8).a)));
                    jyj0 jyj0Var2 = b instanceof jyj0 ? (jyj0) b : null;
                    if (jyj0Var2 != null && (obj4 = jyj0Var2.a) != null) {
                        zwf0Var.f("WebCapabilityRegistry", "Failed to handle web directive ".concat(z28.a(str6)) + Extension.COLON_SPACE + ((plc) obj4).a);
                    }
                } else {
                    if (!(a8 instanceof jyj0)) {
                        w511.b();
                        return null;
                    }
                    zwf0Var.e("WebCapabilityRegistry", unr0.p("Impossible handle directive ", dnj.a(str5), Extension.COLON_SPACE, ((wmj) ((jyj0) a8).a).a, "!"));
                }
                return zy11.a;
            case 14:
                lambda$onJsPrompt$10 = ((WebChromeClientProxyApi$WebChromeClientImpl) this.b).lambda$onJsPrompt$10((JsPromptResult) this.c, (bzj0) obj);
                return lambda$onJsPrompt$10;
            case 15:
                renderToolbar$lambda$27 = WebViewFragment.renderToolbar$lambda$27((WebViewAppearanceOption) this.b, (WebViewControl) this.c, (stz0) obj);
                return renderToolbar$lambda$27;
            case 16:
                c cVar = (c) this.b;
                sls slsVar = (sls) this.c;
                boolean z3 = ((Throwable) obj) instanceof CancellationException;
                AppAnalyticsReporter appAnalyticsReporter = cVar.M;
                if (z3) {
                    appAnalyticsReporter.v0.a.a("tech.webview.load_with_auth.cancelled", null);
                } else {
                    gw41 gw41Var = appAnalyticsReporter.v0;
                    r11 = slsVar != null;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(1);
                    linkedHashMap.put("has_invoke_on_completion", Boolean.valueOf(r11));
                    gw41Var.a.a("tech.webview.load_with_auth.completed", linkedHashMap);
                    if (slsVar != null) {
                        slsVar.invoke();
                    }
                }
                return zy11.a;
            case 17:
                tls tlsVar3 = (tls) this.b;
                ix3 ix3Var = (ix3) this.c;
                n70 n70Var = (n70) obj;
                f361 f361Var = (f361) n70Var.N;
                LinearLayout linearLayout = f361Var.a;
                linearLayout.setPadding(linearLayout.getPaddingLeft(), kp50.r(20), linearLayout.getPaddingRight(), kp50.r(20));
                f361Var.a.setOnClickListener(new os3(11, n70Var, tlsVar3));
                f361Var.b.setOnClickListener(new os3(12, n70Var, tlsVar3));
                n70Var.W(new e331(18, ix3Var, n70Var));
                return zy11.a;
            case 18:
                ix3 ix3Var2 = (ix3) this.b;
                n70 n70Var2 = (n70) this.c;
                nryVar = ix3Var2.b.selectedDay;
                f361 f361Var2 = (f361) n70Var2.N;
                CheckBoxView checkBoxView = f361Var2.b;
                CheckBoxView checkBoxView2 = f361Var2.b;
                if ((checkBoxView.getChecked() && !jl40.l(nryVar, n70Var2.Z())) || (jl40.l(nryVar, n70Var2.Z()) && !checkBoxView2.getChecked())) {
                    r11 = true;
                }
                checkBoxView2.setChecked(jl40.l(nryVar, n70Var2.Z()), r11);
                f361Var2.c.setText(d.a(n70Var2.P, ((nry) n70Var2.Z()).b));
                return zy11.a;
            case 19:
                androidx.compose.foundation.layout.a aVar2 = (androidx.compose.foundation.layout.a) this.b;
                View view = (View) this.c;
                aVar2.a(view);
                return new te4(24, aVar2, view);
            case 20:
                ((x951) this.b).b.d((oll0) obj, (w951) this.c);
                return zy11.a;
            case 21:
                ((ia51) this.b).c.c((oll0) obj, (fa51) this.c);
                return zy11.a;
            case 22:
                ((oy60) this.b).a((String) this.c, (rzx) obj);
                return zy11.a;
            case 23:
                xd51 xd51Var = (xd51) this.b;
                s421 s421Var = (s421) this.c;
                d5j0 d5j0Var = (d5j0) obj;
                Handler handler = xd51Var.w;
                Object obj5 = xd51Var.b;
                z83.g(null, handler.getLooper(), Looper.myLooper());
                z83.f(xd51Var.A, null);
                if (ydz.a.a()) {
                    d5j0Var.toString();
                    ydz.a();
                }
                xd51Var.z = null;
                xd51Var.A = ((OkHttpClient) ((yj41) s421Var.b)).c(d5j0Var, xd51Var);
                handler.removeCallbacksAndMessages(obj5);
                long j3 = 4000 * (1 << xd51Var.B);
                h3s0 h3s0Var = new h3s0(i, xd51Var);
                if (obj5 == null) {
                    handler.postDelayed(h3s0Var, j3);
                } else {
                    handler.postDelayed(h3s0Var, obj5, j3);
                }
                return zy11.a;
            case 24:
                de51 de51Var = (de51) this.b;
                String str7 = (String) this.c;
                ne51 ne51Var = (ne51) obj;
                z83.g(null, de51Var.d, Looper.myLooper());
                String str8 = ne51Var.a;
                z83.b(null, str7, str8);
                de51Var.f = null;
                de51Var.a.edit().putString("xiva_secret_user", str8).putString("xiva_secret_sign", ne51Var.b).putLong("xiva_secret_ts", ne51Var.c).apply();
                zq60 zq60Var = de51Var.e;
                zq60Var.getClass();
                zq60Var.b++;
                ArrayList arrayList = zq60Var.a;
                int size = arrayList.size();
                int i7 = 0;
                boolean z4 = false;
                while (true) {
                    int i8 = i7;
                    while (i8 < size && arrayList.get(i8) == null) {
                        i8++;
                    }
                    if (i8 < size) {
                        z = true;
                        z2 = z4;
                    } else {
                        if (!z4) {
                            zq60.a(zq60Var);
                            z4 = true;
                        }
                        z = false;
                        z2 = z4;
                    }
                    if (!z) {
                        zq60Var.clear();
                        return zy11.a;
                    }
                    while (i7 < size && arrayList.get(i7) == null) {
                        i7++;
                    }
                    if (i7 >= size) {
                        if (!z2) {
                            zq60.a(zq60Var);
                        }
                        ny61.p();
                        return null;
                    }
                    ((tls) arrayList.get(i7)).invoke(ne51Var);
                    i7++;
                    z4 = z2;
                }
            default:
                Zone zone = (Zone) this.b;
                TaxiOrder taxiOrder = (TaxiOrder) this.c;
                return j.b(zone, taxiOrder.x(), taxiOrder.b.V);
        }
    }

    public /* synthetic */ e331(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
