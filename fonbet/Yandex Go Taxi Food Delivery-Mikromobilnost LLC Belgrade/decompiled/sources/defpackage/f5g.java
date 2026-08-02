package defpackage;

import android.content.Context;
import androidx.lifecycle.p;
import com.adjust.sdk.Constants;
import com.yandex.fintechsdk.adapters.flex.sdk.api.FlexAdapter;
import com.yandex.fintechsdk.core.nfc.impl.internal.a;
import com.yandex.fintechsdk.entities.config.payment.paymentkit.PaymentKitConfig;
import com.yandex.fintechsdk.entities.environment.DefaultEnvironment;
import com.yandex.fintechsdk.entities.region.Region;
import com.yandex.fintechsdk.flows.payment.kit.api.model.AdditionalSettings;
import com.yandex.fintechsdk.flows.payment.kit.api.model.Merchant;
import com.yandex.fintechsdk.flows.payment.kit.api.model.Payer;
import com.yandex.fintechsdk.flows.payment.kit.api.model.VerificationParams;
import com.yandex.fintechsdk.flows.payment.kit.internal.analytics.OperationType;
import com.yandex.fintechsdk.flows.payment.kit.internal.model.Scenario;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import kotlin.Result;
import kotlin.collections.b;
import kotlin.collections.builders.MapBuilder;
import okhttp3.OkHttpClient;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class f5g implements w2a0 {
    public final Merchant A;
    public final xvf0 A0;
    public final Payer B;
    public final xvf0 B0;
    public final s3a0 C;
    public final xvf0 C0;
    public final h5g D;
    public final xvf0 D0;
    public final b2w E;
    public final Region F;
    public final nw70 G;
    public final n3w H;
    public final n3w I;
    public final n3w J;
    public final xvf0 K = i5m.b(yzd.a);
    public final n3w L;
    public final n3w M;
    public final n3w N;
    public final n3w O;
    public final xvf0 P;
    public final n3w Q;
    public final peb R;
    public final wif S;
    public final peb T;
    public final k0n U;
    public final xvf0 V;
    public final g5g W;
    public final xvf0 Z;
    public final Context a;
    public final xvf0 a0;
    public final v2a0 b;
    public final xvf0 b0;
    public final p c;
    public final xvf0 c0;
    public final xvf0 d0;
    public final c1 e0;
    public final xvf0 f0;
    public final xvf0 g0;
    public final tl3 h0;
    public final nt0 i0;
    public final xvf0 j0;
    public final xvf0 k0;
    public final xvf0 l0;
    public final t160 m0;
    public final zi60 n0;
    public final xvf0 o0;
    public final xvf0 p0;
    public final xvf0 q0;
    public final wvq r0;
    public final xvf0 s0;
    public final xvf0 t0;
    public final xvf0 u0;
    public final xvf0 v0;
    public final Scenario w;
    public final xvf0 w0;
    public final lz40 x;
    public final xvf0 x0;
    public final DefaultEnvironment y;
    public final xvf0 y0;
    public final AdditionalSettings z;
    public final xvf0 z0;

    /* JADX WARN: Multi-variable type inference failed */
    public f5g(jxk jxkVar, kh5 kh5Var, a8o a8oVar, rqt0 rqt0Var, h5g h5gVar, AdditionalSettings additionalSettings, v2a0 v2a0Var, Context context, p pVar, DefaultEnvironment defaultEnvironment, b2w b2wVar, Merchant merchant, nw70 nw70Var, Payer payer, Region region, Scenario scenario, s3a0 s3a0Var, lz40 lz40Var) {
        this.a = context;
        this.b = v2a0Var;
        this.c = pVar;
        this.w = scenario;
        this.x = lz40Var;
        this.y = defaultEnvironment;
        this.z = additionalSettings;
        this.A = merchant;
        this.B = payer;
        this.C = s3a0Var;
        this.D = h5gVar;
        this.E = b2wVar;
        this.F = region;
        this.G = nw70Var;
        this.H = n3w.a(context);
        this.I = n3w.a(defaultEnvironment);
        this.J = n3w.a(v2a0Var);
        this.L = n3w.a(merchant);
        this.M = n3w.a(payer);
        this.N = n3w.a(scenario);
        n3w a = n3w.a(s3a0Var);
        this.O = a;
        this.P = i5m.b(new b15(this.H, this.J, this.K, this.I, this.L, this.M, this.N, a, 0));
        n3w a2 = n3w.a(additionalSettings);
        this.Q = a2;
        n3w n3wVar = this.H;
        peb pebVar = new peb(n3wVar, 26);
        this.R = pebVar;
        wif wifVar = new wif((Object) tif.a, (xvf0) pebVar, 0);
        this.S = wifVar;
        peb pebVar2 = new peb(this.I, 25);
        this.T = pebVar2;
        int i = 16;
        k0n k0nVar = new k0n(wifVar, pebVar2, i);
        this.U = k0nVar;
        xvf0 b = i5m.b(new xea(a2, n3wVar, cqe.a, k0nVar, 24));
        this.V = b;
        g5g g5gVar = new g5g(b, 0);
        this.W = g5gVar;
        this.Z = i5m.b(new sb1(nkl0.a, this.H, this.I, this.P, pv2.a, e6o.a, g5gVar, 1));
        int i2 = 22;
        this.a0 = i5m.b(new p4(i5m.b(nj3.a), (xvf0) new oto0(this.H, aqr.a, i2), 14));
        this.b0 = i5m.b(t2a0.a);
        this.c0 = i5m.b(new b55(13, jxkVar));
        n3w n3wVar2 = this.H;
        int i3 = 18;
        this.d0 = i5m.b(new e3u((xvf0) new njp(n3wVar2, i2), (xvf0) new q720(n3wVar2, 17), (xvf0) new q720(n3wVar2, i3), 3));
        int i4 = 7;
        c1 c1Var = new c1(this.Z, i4);
        this.e0 = c1Var;
        this.f0 = i5m.b(new up41(c1Var, 2));
        this.g0 = i5m.b(upe.a);
        this.h0 = new tl3(this.a0, 0 == true ? 1 : 0);
        n3w n3wVar3 = this.Q;
        n3w n3wVar4 = this.H;
        ze zeVar = new ze(n3wVar3, n3wVar4, 20);
        int i5 = 11;
        jpf0 jpf0Var = new jpf0((Object) new p6f(n3wVar4, i5), (xvf0) this.R, 6);
        xvf0 xvf0Var = this.K;
        this.i0 = new nt0(n3wVar4, n3wVar3, zeVar, xvf0Var, this.d0, this.L, this.M, new jpf0(xvf0Var, (xvf0) jpf0Var, i4), this.O, this.f0, 2);
        int i6 = 27;
        xvf0 b2 = i5m.b(new mvy(n3wVar4, i6));
        this.j0 = b2;
        xvf0 b3 = i5m.b(new h0z(this.Z, b2, i5));
        this.k0 = b3;
        xvf0 b4 = i5m.b(new vm80(this.Z, b3, i4));
        this.l0 = b4;
        this.m0 = new t160(b4, 0 == true ? 1 : 0);
        wif wifVar2 = this.S;
        this.n0 = new zi60(wifVar2, this.U, new ibz0(wifVar2, this.I, i6), 19, false);
        xvf0 b5 = i5m.b(new l180(this.e0, i));
        this.o0 = b5;
        n3w n3wVar5 = this.I;
        this.p0 = i5m.b(new mz70(this.Z, this.a0, this.H, n3wVar5, b5, new l180(n3wVar5, i3), 6));
        this.q0 = i5m.b(new rs0(this.U, this.Z, this.a0, this.p0, i5m.b(new l180(this.h0, 20)), 27));
        n3w n3wVar6 = y2r0.c;
        ArrayList arrayList = new ArrayList(2);
        List list = Collections.EMPTY_LIST;
        arrayList.add(this.q0);
        arrayList.add(qfh.a);
        y2r0 y2r0Var = new y2r0(arrayList, list);
        xvf0 xvf0Var2 = this.Z;
        vfg0 vfg0Var = new vfg0(this.h0, this.i0, new ix50(new jx50(y2r0.c, this.m0, this.W, this.n0, new ssj(xvf0Var2, y2r0Var, 3))), new nb11(this.H, 17), 6);
        int i7 = 5;
        oti otiVar = new oti((Object) vfg0Var, xvf0Var2, i7, (boolean) (0 == true ? 1 : 0));
        kt5 kt5Var = new kt5(otiVar, 0 == true ? 1 : 0);
        int i8 = 19;
        wvq wvqVar = new wvq((v7p) this.U, (xvf0) vfg0Var, xvf0Var2, (xvf0) this.T, (xvf0) new njp(this.L, i8), (xvf0) this.S, 3);
        this.r0 = wvqVar;
        this.s0 = i5m.b(new dx7(ub8.a, new kj7(kt5Var, new h1t(wvqVar, 13), new kt5(otiVar, 1), i4), 2));
        wvq wvqVar2 = this.r0;
        xvf0 b6 = i5m.b(new fwc(new f2b(new njp(wvqVar2, i6), new xat((xvf0) wvqVar2, (int) (0 == true ? 1 : 0)), new xat(wvqVar2, 3), 14), this.K, 4));
        this.t0 = b6;
        this.u0 = i5m.b(new faj(b6, 0 == true ? 1 : 0));
        this.v0 = i5m.b(new nb11(this.M, 22));
        this.w0 = i5m.b(new njp(this.e0, 10));
        this.x0 = i5m.b(new f9t(this.Z, this.I, 12));
        this.y0 = i5m.b(new ys10((v7p) new t160(this.w0, i7), this.Z, i8));
        int i9 = 22;
        this.z0 = i5m.b(new vqa0(this.Z, i9));
        this.A0 = i5m.b(new c1(i5m.b(new c1(this.Z, i9)), 23));
        this.B0 = i5m.b(new k1w(i5m.b(new k1w(this.Z, 17)), i3));
        this.C0 = i5m.b(new ret(this.H, i5m.b(new mvy(this.Z, 26)), this.j0, 15));
        this.D0 = i5m.b(new pmn0(this.A0, this.B0, this.C0, this.k0, i5m.b(new vm80(this.H, i5m.b(new jde0(this.Z, i7)), 21)), 18));
    }

    @Override // defpackage.x6o
    public final v7o A() {
        return new w7o(this.E);
    }

    @Override // defpackage.sg5
    public final void B() {
    }

    @Override // defpackage.nqt0
    public final jp90 C() {
        return this.G;
    }

    @Override // defpackage.sg5
    public final bvt D() {
        return new cvt((avt) this.x0.get(), this.w);
    }

    @Override // defpackage.sg5
    public final ype E() {
        return new ype(new rgs(S(), peb.c(this.y)), 0);
    }

    @Override // defpackage.sg5
    public final gdr F() {
        return (gdr) this.l0.get();
    }

    @Override // defpackage.sg5
    public final azw G() {
        return new azw(false);
    }

    @Override // defpackage.sg5
    public final sl3 H() {
        return new sl3((hk3) this.a0.get(), 0);
    }

    @Override // defpackage.sg5
    public final j011 I() {
        me1 me1Var = new me1(peb.d(this.a), 4);
        U();
        sjh sjhVar = uyj.a;
        mdh mdhVar = mdh.b;
        g011 g011Var = (g011) this.D.a.get();
        q5z.h(g011Var);
        return new k011(me1Var, g011Var);
    }

    @Override // defpackage.sg5
    public final xb8 J() {
        return (xb8) this.s0.get();
    }

    @Override // defpackage.sg5
    public final pao K() {
        return new bbh();
    }

    @Override // defpackage.sg5
    public final uyi0 L() {
        return (uyi0) this.l0.get();
    }

    @Override // defpackage.sg5
    public final ryw M() {
        return new ryw(true);
    }

    @Override // defpackage.sg5
    public final fp51 N() {
        return (fp51) this.f0.get();
    }

    @Override // defpackage.sg5
    public final Region O() {
        return this.F;
    }

    @Override // defpackage.sg5
    public final d860 P() {
        return new e860((a) this.y0.get());
    }

    public final g25 Q() {
        wh5 R = R();
        xvf0 xvf0Var = this.K;
        xzd xzdVar = (xzd) xvf0Var.get();
        m6v m6vVar = (m6v) this.d0.get();
        xzd xzdVar2 = (xzd) xvf0Var.get();
        wbz0 wbz0Var = new wbz0();
        Context context = this.a;
        return new g25(context, this.z, R, xzdVar, m6vVar, this.A, this.B, new yxf0(xzdVar2, new sue0(wbz0Var, peb.d(context))), this.C, (fp51) this.f0.get());
    }

    public final wh5 R() {
        return new wh5(this.z, this.a);
    }

    public final vif S() {
        rif rifVar = new rif();
        peb.d(this.a);
        return new vif(rifVar);
    }

    public final com.yandex.fintechsdk.security.impl.internal.devicechallenge.a T() {
        return new com.yandex.fintechsdk.security.impl.internal.devicechallenge.a((z22) this.Z.get(), this.a, (eaj) this.u0.get(), (m6v) this.d0.get(), (mu21) this.v0.get());
    }

    public final jgs U() {
        vif S = S();
        DefaultEnvironment defaultEnvironment = this.y;
        boolean z = false;
        return new jgs(new rgs(S, peb.c(defaultEnvironment)), new h6j0(new sl3((hk3) this.a0.get(), 0), Q(), new OkHttpClient(c()), new abe(this.a, z, z)), (z22) this.Z.get(), peb.c(defaultEnvironment), new mgs(this.A), S());
    }

    public final s2a0 V() {
        return (s2a0) this.b0.get();
    }

    @Override // defpackage.sg5
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public final com.yandex.fintechsdk.core.navigation.impl.api.router.a getRouter() {
        return (com.yandex.fintechsdk.core.navigation.impl.api.router.a) this.g0.get();
    }

    @Override // defpackage.sg5, defpackage.nqt0
    public final hk3 a() {
        return (hk3) this.a0.get();
    }

    @Override // defpackage.sg5, defpackage.nqt0
    public final dn90 b() {
        return (dn90) this.o0.get();
    }

    @Override // defpackage.sg5
    public final OkHttpClient.a c() {
        Set set = Collections.EMPTY_SET;
        s160 s160Var = new s160((uva0) this.l0.get());
        Optional of = Optional.of((w870) this.V.get());
        S();
        S();
        peb.c(this.y);
        S();
        z22 z22Var = (z22) this.Z.get();
        ArrayList arrayList = new ArrayList(2);
        zz50 zz50Var = (zz50) this.q0.get();
        q5z.g(zz50Var, "Set contributions cannot be null");
        arrayList.add(zz50Var);
        arrayList.add(new pfh());
        return jx50.a(set, s160Var, of, new v1k0(z22Var, arrayList.isEmpty() ? set : arrayList.size() == 1 ? Collections.singleton(arrayList.get(0)) : Collections.unmodifiableSet(new HashSet(arrayList))));
    }

    @Override // defpackage.sg5, defpackage.nqt0
    public final pvr0 d() {
        return new wor0(this.E);
    }

    @Override // defpackage.sg5
    public final lg5 e() {
        z22 z22Var = (z22) this.Z.get();
        v2a0 v2a0Var = this.b;
        hh5 hh5Var = new hh5(0, v2a0Var);
        s2a0 s2a0Var = (s2a0) this.b0.get();
        com.yandex.fintechsdk.data.paymentKit.widget.impl.internal.datasources.network.a aVar = new com.yandex.fintechsdk.data.paymentKit.widget.impl.internal.datasources.network.a((kyk) this.c0.get(), new com.yandex.fintechsdk.data.paymentKit.widget.impl.internal.datasources.network.requesters.a(U()));
        w351 w351Var = (w351) this.D.b.get();
        q5z.h(w351Var);
        return new com.yandex.fintechsdk.flows.payment.kit.internal.di.paymentkit.features.bdui.action.a(z22Var, v2a0Var, this.c, hh5Var, s2a0Var, this.w, this.x, new com.yandex.fintechsdk.data.paymentKit.widget.impl.internal.a(aVar, w351Var));
    }

    @Override // defpackage.sg5
    public final ug5 f() {
        ug5 ug5Var;
        Object failure;
        Object failure2;
        Object b;
        z22 z22Var = (z22) this.Z.get();
        com.yandex.fintechsdk.data.config.impl.internal.a aVar = (com.yandex.fintechsdk.data.config.impl.internal.a) this.t0.get();
        com.yandex.fintechsdk.security.impl.internal.devicechallenge.a T = T();
        PaymentKitConfig a = aVar.b.a();
        boolean z = false;
        if (a != null) {
            String str = a.getFlags().get("finsdkEnableTroikaNfc");
            if (str == null) {
                failure2 = Boolean.FALSE;
            } else {
                try {
                    rbx rbxVar = sbx.d;
                    rbxVar.getClass();
                    b = rbxVar.b(z96.a, str);
                } catch (Throwable th) {
                    failure2 = new Result.Failure(th);
                }
                if (b == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                }
                failure2 = (Boolean) b;
                Object obj = Boolean.FALSE;
                if (failure2 instanceof Result.Failure) {
                    failure2 = obj;
                }
            }
            if (((Boolean) failure2).booleanValue()) {
                z = true;
            }
        }
        Scenario scenario = this.w;
        com.yandex.fintechsdk.core.analytics.impl.internal.a aVar2 = (com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var;
        aVar2.a(new li3(dab1.c(scenario).concat("_started")));
        MapBuilder mapBuilder = new MapBuilder();
        AdditionalSettings additionalSettings = this.z;
        mapBuilder.put("show_success_result_screen", Boolean.valueOf(additionalSettings.getShowSuccessScreen()));
        mapBuilder.put("show_fail_result_screen", Boolean.valueOf(additionalSettings.getShowFailureScreen()));
        String paymentTo = additionalSettings.getPaymentTo();
        if (paymentTo != null) {
            mapBuilder.put("payment_to", paymentTo);
        }
        Map<String, String> params = additionalSettings.getParams();
        if (params != null) {
            mapBuilder.put("additional_params", params);
        }
        MapBuilder j = mapBuilder.j();
        if (scenario instanceof Scenario.Payment) {
            Scenario.Payment payment = (Scenario.Payment) scenario;
            if (payment.isAnonym()) {
                MapBuilder mapBuilder2 = new MapBuilder();
                mapBuilder2.putAll(j);
                String email = payment.getEmail();
                if (email != null) {
                    mapBuilder2.put("email", email);
                }
                String token = payment.getToken().getToken();
                if (token != null) {
                    mapBuilder2.put("purchase_token", token);
                }
                return new ug5(6, "v2/screens/payment/anonymous", mapBuilder2.j(), null);
            }
            String d = T.d();
            if (d != null) {
                aVar2.a(new lz5(d, OperationType.PAYMENT));
            }
            MapBuilder mapBuilder3 = new MapBuilder();
            mapBuilder3.putAll(j);
            String token2 = payment.getToken().getToken();
            if (token2 != null) {
                mapBuilder3.put("purchase_token", token2);
            }
            if (d != null) {
                mapBuilder3.put("device_pubkey", d);
            }
            return new ug5(6, "v2/screens/payment", mapBuilder3.j(), null);
        }
        if (scenario instanceof Scenario.CardBinding) {
            MapBuilder mapBuilder4 = new MapBuilder();
            mapBuilder4.putAll(j);
            String pos = additionalSettings.getPos();
            if (pos != null) {
                mapBuilder4.put("pos_id", pos);
            }
            String currency = additionalSettings.getCurrency();
            if (currency != null) {
                mapBuilder4.put("currency", currency);
            }
            String verificationToken = ((Scenario.CardBinding) scenario).getVerificationToken();
            if (verificationToken != null) {
                mapBuilder4.put("verification_token", verificationToken);
            }
            return new ug5(6, "v2/screens/card_binding", mapBuilder4.j(), null);
        }
        if (scenario instanceof Scenario.SbpTokenBinding) {
            MapBuilder mapBuilder5 = new MapBuilder();
            mapBuilder5.putAll(j);
            String redirectURLForSbpTokenBinding = additionalSettings.getRedirectURLForSbpTokenBinding();
            if (redirectURLForSbpTokenBinding != null) {
                mapBuilder5.put("term_url", redirectURLForSbpTokenBinding);
            }
            String currency2 = additionalSettings.getCurrency();
            if (currency2 != null) {
                mapBuilder5.put("currency", currency2);
            }
            String pos2 = additionalSettings.getPos();
            if (pos2 != null) {
                mapBuilder5.put("pos_id", pos2);
            }
            String verificationToken2 = ((Scenario.SbpTokenBinding) scenario).getVerificationToken();
            if (verificationToken2 != null) {
                mapBuilder5.put("verification_token", verificationToken2);
            }
            return new ug5(6, "v2/screens/bind/sbp/startup", mapBuilder5.j(), null);
        }
        if (scenario instanceof Scenario.SelectMethod) {
            MapBuilder mapBuilder6 = new MapBuilder();
            mapBuilder6.putAll(j);
            String redirectURLForSbpTokenBinding2 = additionalSettings.getRedirectURLForSbpTokenBinding();
            if (redirectURLForSbpTokenBinding2 != null) {
                mapBuilder6.put("term_url", redirectURLForSbpTokenBinding2);
            }
            String currency3 = additionalSettings.getCurrency();
            if (currency3 != null) {
                mapBuilder6.put("currency", currency3);
            }
            String pos3 = additionalSettings.getPos();
            if (pos3 != null) {
                mapBuilder6.put("pos_id", pos3);
            }
            return new ug5(6, "v2/screens/preselect", mapBuilder6.j(), null);
        }
        if (scenario instanceof Scenario.TransportCards) {
            MapBuilder mapBuilder7 = new MapBuilder();
            mapBuilder7.putAll(j);
            Scenario.TransportCards transportCards = (Scenario.TransportCards) scenario;
            mapBuilder7.put(Constants.DEEPLINK, transportCards.getParams().getDeeplink$flows_payment_kit_release());
            mapBuilder7.put("is_nfc_supported", String.valueOf(z));
            mapBuilder7.putAll(transportCards.getParams().getBody$flows_payment_kit_release());
            return new ug5(6, "v2/transport/decide_next_action", mapBuilder7.j(), null);
        }
        if (scenario instanceof Scenario.DynamicLinkFlow) {
            Scenario.DynamicLinkFlow dynamicLinkFlow = (Scenario.DynamicLinkFlow) scenario;
            Set set = p8n.a;
            try {
                failure = p8n.e(new JSONObject(dynamicLinkFlow.getQueryParamsJson()));
            } catch (Throwable th2) {
                failure = new Result.Failure(th2);
            }
            if (Result.a(failure) != null) {
                failure = b.f();
            }
            LinkedHashMap c = p8n.c((Map) failure);
            String o = g8e.o("dynamic-link", dynamicLinkFlow.getPath());
            MapBuilder mapBuilder8 = new MapBuilder();
            mapBuilder8.putAll(j);
            mapBuilder8.put(Constants.DEEPLINK, dynamicLinkFlow.getDynamicLink());
            mapBuilder8.putAll(c);
            ug5Var = new ug5(6, o, mapBuilder8.j(), null);
        } else {
            if (scenario instanceof Scenario.Verification) {
                MapBuilder mapBuilder9 = new MapBuilder();
                mapBuilder9.putAll(j);
                String currency4 = additionalSettings.getCurrency();
                if (currency4 != null) {
                    mapBuilder9.put("currency", currency4);
                }
                String pos4 = additionalSettings.getPos();
                if (pos4 != null) {
                    mapBuilder9.put("pos_id", pos4);
                }
                Scenario.Verification verification = (Scenario.Verification) scenario;
                VerificationParams params2 = verification.getParams();
                if (params2 instanceof VerificationParams.ByBindingId) {
                    String bindingId = ((VerificationParams.ByBindingId) verification.getParams()).getBindingId();
                    if (bindingId != null) {
                        mapBuilder9.put("binding_id", bindingId);
                    }
                } else {
                    if (!(params2 instanceof VerificationParams.ByVerificationToken)) {
                        w511.b();
                        return null;
                    }
                    String verificationToken3 = ((VerificationParams.ByVerificationToken) verification.getParams()).getVerificationToken();
                    if (verificationToken3 != null) {
                        mapBuilder9.put("verification_token", verificationToken3);
                    }
                }
                return new ug5(6, "v2/screens/init_additional_verification", mapBuilder9.j(), null);
            }
            if (scenario instanceof Scenario.GooglePlayBinding) {
                MapBuilder mapBuilder10 = new MapBuilder();
                mapBuilder10.putAll(j);
                String currency5 = additionalSettings.getCurrency();
                if (currency5 != null) {
                    mapBuilder10.put("currency", currency5);
                }
                String pos5 = additionalSettings.getPos();
                if (pos5 != null) {
                    mapBuilder10.put("pos_id", pos5);
                }
                String verificationToken4 = ((Scenario.GooglePlayBinding) scenario).getParams().getVerificationToken();
                if (verificationToken4 != null) {
                    mapBuilder10.put("verification_token", verificationToken4);
                }
                return new ug5(6, "v2/screens/googlepay", mapBuilder10.j(), null);
            }
            if (scenario instanceof Scenario.Unbinding) {
                return new ug5(7, "", null, null);
            }
            if (scenario instanceof Scenario.TransportBanner) {
                ug5Var = new ug5(6, "", b.f(), null);
            } else {
                if (!(scenario instanceof Scenario.Widget)) {
                    w511.b();
                    return null;
                }
                ug5Var = new ug5(6, "", b.f(), null);
            }
        }
        return ug5Var;
    }

    @Override // defpackage.sg5
    public final com.yandex.fintechsdk.core.network.impl.internal.network.a g() {
        boolean z = false;
        return new com.yandex.fintechsdk.core.network.impl.internal.network.a(svn.a, (z22) this.Z.get(), new h6j0(new sl3((hk3) this.a0.get(), 0), Q(), new OkHttpClient(c()), new abe(this.a, z, z)));
    }

    @Override // defpackage.sg5, defpackage.nqt0
    public final z22 getAnalytics() {
        return (z22) this.Z.get();
    }

    @Override // defpackage.sg5
    public final Context getApplicationContext() {
        return this.a;
    }

    @Override // defpackage.sg5, defpackage.nqt0
    public final DefaultEnvironment getEnvironment() {
        return this.y;
    }

    @Override // defpackage.nqt0
    public final zn90 h() {
        return l180.g(this.y);
    }

    @Override // defpackage.sg5
    public final uva0 i() {
        return (uva0) this.l0.get();
    }

    @Override // defpackage.sg5
    public final void j() {
        if (this.z0.get() == null) {
            return;
        }
        ny61.u();
    }

    @Override // defpackage.sg5
    public final void k() {
        Map map = Collections.EMPTY_MAP;
    }

    @Override // defpackage.nqt0
    public final mqt0 l() {
        return new com.yandex.fintechsdk.flows.payment.kit.internal.di.paymentkit.features.splash.data.a((z22) this.Z.get(), (com.yandex.fintechsdk.data.config.impl.internal.a) this.t0.get(), (w870) this.V.get(), new dqt0(this.w));
    }

    @Override // defpackage.sg5
    public final FlexAdapter m() {
        return (FlexAdapter) this.w0.get();
    }

    @Override // defpackage.nqt0
    public final sqt0 n() {
        return new c8o((com.yandex.fintechsdk.core.navigation.impl.api.router.a) this.g0.get(), 2);
    }

    @Override // defpackage.sg5
    public final zyw o() {
        String str;
        Object failure;
        Object b;
        com.yandex.fintechsdk.data.config.impl.internal.a aVar = (com.yandex.fintechsdk.data.config.impl.internal.a) this.t0.get();
        Scenario scenario = this.w;
        vkp vkpVar = scenario instanceof Scenario.CardBinding ? vkp.c : scenario instanceof Scenario.SbpTokenBinding ? vkp.d : scenario instanceof Scenario.TransportCards ? vkp.f : vkp.e;
        Object obj = vkpVar.a;
        PaymentKitConfig a = aVar.b.a();
        if (a != null && (str = a.getFlags().get(vkpVar.b)) != null) {
            try {
                rbx rbxVar = sbx.d;
                rbxVar.getClass();
                b = rbxVar.b(z96.a, str);
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (b == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
            }
            failure = (Boolean) b;
            if (!(failure instanceof Result.Failure)) {
                obj = failure;
            }
        }
        return new zyw(((Boolean) obj).booleanValue());
    }

    @Override // defpackage.sg5
    public final dh5 p() {
        return new eh5();
    }

    @Override // defpackage.sg5
    public final oaj q() {
        return new paj(T());
    }

    @Override // defpackage.sg5
    public final ah5 r() {
        boolean z = false;
        return new bh5((hk3) this.a0.get(), Q(), new abe(this.a, z, z));
    }

    @Override // defpackage.nqt0
    public final cqt0 s() {
        return new dqt0(this.w);
    }

    @Override // defpackage.x6o
    public final b8o t() {
        return new c8o((com.yandex.fintechsdk.core.navigation.impl.api.router.a) this.g0.get(), 0);
    }

    @Override // defpackage.sg5
    public final b2w u() {
        return this.E;
    }

    @Override // defpackage.sg5
    public final lh5 v() {
        return new h0w(25, (z22) this.Z.get(), (com.yandex.fintechsdk.core.navigation.impl.api.router.a) this.g0.get());
    }

    @Override // defpackage.sg5
    public final abe w() {
        boolean z = false;
        return new abe(this.a, z, z);
    }

    @Override // defpackage.sg5
    public final vh5 x() {
        return R();
    }

    @Override // defpackage.sg5
    public final void y() {
    }

    @Override // defpackage.sg5
    public final qbj z() {
        return new paj(T());
    }
}
