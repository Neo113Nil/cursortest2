package com.yandex.go.payments.shared.business.accountcreation.corp.personalaccount;

import android.graphics.drawable.Drawable;
import com.yandex.go.payments.shared.business.accountcreation.corp.experiment.CorpAccountFlowExperiment;
import com.yandex.go.shortcuts.dto.response.PromoMode;
import defpackage.aoh;
import defpackage.b1;
import defpackage.cj7;
import defpackage.dy60;
import defpackage.e90;
import defpackage.evu0;
import defpackage.g8e;
import defpackage.gyc;
import defpackage.hxx;
import defpackage.i7w0;
import defpackage.k7w0;
import defpackage.ma41;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ogn;
import defpackage.pep0;
import defpackage.pne;
import defpackage.pve;
import defpackage.ra9;
import defpackage.rve;
import defpackage.sae;
import defpackage.scc;
import defpackage.syb;
import defpackage.tse;
import defpackage.ua41;
import defpackage.wls;
import defpackage.xjg;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONObject;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.am.AuthType;
import ru.yandex.taxi.am.o;
import ru.yandex.taxi.eatskit.dto.ServiceHeaderMode;
import ru.yandex.taxi.eatskit.widget.splash.EatsKitSplash$ShimmeringSplash;
import ru.yandex.taxi.themes.dto.WebViewThemeChangeMode;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.shared.business.accountcreation.corp.personalaccount.CorpPersonalAccountWebViewRouter$showUrlWithPassport$1", f = "CorpPersonalAccountWebViewRouter.kt", l = {HProv.ALG_SID_GR3410_12_256}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class CorpPersonalAccountWebViewRouter$showUrlWithPassport$1 extends SuspendLambda implements wls {
    final /* synthetic */ ogn $eatskitShowingParams;
    final /* synthetic */ String $fullscreenScreenName;
    final /* synthetic */ List<String> $locationHostWhiteList;
    final /* synthetic */ dy60 $onCreateWindowDelegate;
    final /* synthetic */ boolean $shouldShowCloseButton;
    final /* synthetic */ String $url;
    final /* synthetic */ String $userAgent;
    int label;
    final /* synthetic */ rve this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CorpPersonalAccountWebViewRouter$showUrlWithPassport$1(rve rveVar, String str, ogn ognVar, String str2, dy60 dy60Var, boolean z, String str3, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = rveVar;
        this.$url = str;
        this.$eatskitShowingParams = ognVar;
        this.$userAgent = str2;
        this.$onCreateWindowDelegate = dy60Var;
        this.$shouldShowCloseButton = z;
        this.$fullscreenScreenName = str3;
        this.$locationHostWhiteList = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CorpPersonalAccountWebViewRouter$showUrlWithPassport$1(this.this$0, this.$url, this.$eatskitShowingParams, this.$userAgent, this.$onCreateWindowDelegate, this.$shouldShowCloseButton, this.$fullscreenScreenName, this.$locationHostWhiteList, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CorpPersonalAccountWebViewRouter$showUrlWithPassport$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        Drawable logo;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        gyc gycVar = null;
        final int i2 = 1;
        if (i == 0) {
            b.b(obj);
            o oVar = this.this$0.b;
            String str = this.$url;
            AuthType authType = AuthType.COOKIES;
            this.label = 1;
            b = oVar.b(str, authType, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            b = obj;
        }
        ua41 ua41Var = (ua41) b;
        boolean z = ua41Var instanceof pne;
        zy11 zy11Var = zy11.a;
        if (!z) {
            this.$eatskitShowingParams.d.accept(ua41Var);
            return zy11Var;
        }
        PromoMode promoMode = (PromoMode) this.this$0.k.b.a.getValue();
        if (promoMode == null) {
            promoMode = PromoMode.UNKNOWN;
        }
        sae saeVar = this.this$0.i;
        String value = promoMode.getValue();
        b1 b1Var = (b1) saeVar.b;
        b1Var.getClass();
        HashMap hashMap = new HashMap();
        if (value != null) {
            hashMap.put("value", value);
        }
        b1Var.a.a("B2BHome.WebView.Promomode", hashMap, 1, new HashMap());
        PromoMode promoMode2 = PromoMode.UNKNOWN;
        String str2 = this.$userAgent;
        if (promoMode != promoMode2) {
            List g = scc.g(str2, g8e.o("promo_mode/", promoMode.getValue()));
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : g) {
                if (!evu0.J((String) obj2)) {
                    arrayList.add(obj2);
                }
            }
            str2 = kotlin.collections.a.X(arrayList, " ", null, null, null, 62);
        }
        String str3 = str2;
        final rve rveVar = this.this$0;
        String str4 = ((pne) ua41Var).a;
        dy60 dy60Var = this.$onCreateWindowDelegate;
        ogn ognVar = this.$eatskitShowingParams;
        boolean z2 = this.$shouldShowCloseButton;
        String str5 = this.$fullscreenScreenName;
        List<String> list = this.$locationHostWhiteList;
        rveVar.getClass();
        syb sybVar = new syb(1, str5, rveVar);
        e90 e90Var = !list.isEmpty() ? new e90(11, rveVar, list) : null;
        ra9 a = rveVar.m.a(rveVar.c);
        sae saeVar2 = new sae(7, ognVar);
        i7w0 i7w0Var = i7w0.b;
        pve pveVar = rveVar.l;
        if (((CorpAccountFlowExperiment) pveVar.a.a.b()).h.c && (logo = pveVar.b.getLogo()) != null) {
            gycVar = new gyc(logo);
        }
        gyc gycVar2 = gycVar;
        xjg xjgVar = rveVar.o;
        xjgVar.getClass();
        aoh aohVar = new aoh(i2, xjgVar);
        EatsKitSplash$ShimmeringSplash eatsKitSplash$ShimmeringSplash = EatsKitSplash$ShimmeringSplash.WebStyle;
        ArrayList arrayList2 = new ArrayList();
        final int i3 = 0;
        arrayList2.add(new cj7("corp_account_email", new wls() { // from class: qve
            @Override // defpackage.wls
            public final Object invoke(Object obj3, Object obj4) {
                kj Ig;
                int i4 = i3;
                zy11 zy11Var2 = zy11.a;
                rve rveVar2 = rveVar;
                gcn gcnVar = (gcn) obj4;
                switch (i4) {
                    case 0:
                        aue a2 = bue.a(rveVar2.g);
                        JSONObject jSONObject = new JSONObject();
                        String a3 = a2.a();
                        sae saeVar3 = rveVar2.i;
                        boolean J = evu0.J(a3);
                        b1 b1Var2 = (b1) saeVar3.b;
                        Boolean valueOf = Boolean.valueOf(J);
                        b1Var2.getClass();
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("isBlank", valueOf);
                        b1Var2.a.a("B2BHome.WebView.SendDataFromClient.Email", hashMap2, 1, new HashMap());
                        jSONObject.put("email", a3);
                        gcnVar.a(new ck7(jSONObject.toString(), null));
                        break;
                    case 1:
                        aue a4 = bue.a(rveVar2.g);
                        JSONObject jSONObject2 = new JSONObject();
                        String b2 = a4.b();
                        sae saeVar4 = rveVar2.i;
                        boolean J2 = evu0.J(b2);
                        b1 b1Var3 = (b1) saeVar4.b;
                        Boolean valueOf2 = Boolean.valueOf(J2);
                        b1Var3.getClass();
                        HashMap hashMap3 = new HashMap();
                        hashMap3.put("isBlank", valueOf2);
                        b1Var3.a.a("B2BHome.WebView.SendDataFromClient.Phone", hashMap3, 1, new HashMap());
                        jSONObject2.put("phone", b2);
                        gcnVar.a(new ck7(jSONObject2.toString(), null));
                        break;
                    default:
                        JSONObject jSONObject3 = new JSONObject();
                        String l = ((cne0) rveVar2.j.b).l("user_first_name", null);
                        if ((l == null || evu0.J(l)) && ((Ig = rveVar2.h.a.Ig()) == null || (l = Ig.b) == null)) {
                            l = "";
                        }
                        sae saeVar5 = rveVar2.i;
                        boolean J3 = evu0.J(l);
                        b1 b1Var4 = (b1) saeVar5.b;
                        Boolean valueOf3 = Boolean.valueOf(J3);
                        b1Var4.getClass();
                        HashMap hashMap4 = new HashMap();
                        hashMap4.put("isBlank", valueOf3);
                        b1Var4.a.a("B2BHome.WebView.SendDataFromClient.Name", hashMap4, 1, new HashMap());
                        jSONObject3.put("contact", l);
                        gcnVar.a(new ck7(jSONObject3.toString(), null));
                        break;
                }
                return zy11Var2;
            }
        }));
        arrayList2.add(new cj7("corp_account_phone", new wls() { // from class: qve
            @Override // defpackage.wls
            public final Object invoke(Object obj3, Object obj4) {
                kj Ig;
                int i4 = i2;
                zy11 zy11Var2 = zy11.a;
                rve rveVar2 = rveVar;
                gcn gcnVar = (gcn) obj4;
                switch (i4) {
                    case 0:
                        aue a2 = bue.a(rveVar2.g);
                        JSONObject jSONObject = new JSONObject();
                        String a3 = a2.a();
                        sae saeVar3 = rveVar2.i;
                        boolean J = evu0.J(a3);
                        b1 b1Var2 = (b1) saeVar3.b;
                        Boolean valueOf = Boolean.valueOf(J);
                        b1Var2.getClass();
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("isBlank", valueOf);
                        b1Var2.a.a("B2BHome.WebView.SendDataFromClient.Email", hashMap2, 1, new HashMap());
                        jSONObject.put("email", a3);
                        gcnVar.a(new ck7(jSONObject.toString(), null));
                        break;
                    case 1:
                        aue a4 = bue.a(rveVar2.g);
                        JSONObject jSONObject2 = new JSONObject();
                        String b2 = a4.b();
                        sae saeVar4 = rveVar2.i;
                        boolean J2 = evu0.J(b2);
                        b1 b1Var3 = (b1) saeVar4.b;
                        Boolean valueOf2 = Boolean.valueOf(J2);
                        b1Var3.getClass();
                        HashMap hashMap3 = new HashMap();
                        hashMap3.put("isBlank", valueOf2);
                        b1Var3.a.a("B2BHome.WebView.SendDataFromClient.Phone", hashMap3, 1, new HashMap());
                        jSONObject2.put("phone", b2);
                        gcnVar.a(new ck7(jSONObject2.toString(), null));
                        break;
                    default:
                        JSONObject jSONObject3 = new JSONObject();
                        String l = ((cne0) rveVar2.j.b).l("user_first_name", null);
                        if ((l == null || evu0.J(l)) && ((Ig = rveVar2.h.a.Ig()) == null || (l = Ig.b) == null)) {
                            l = "";
                        }
                        sae saeVar5 = rveVar2.i;
                        boolean J3 = evu0.J(l);
                        b1 b1Var4 = (b1) saeVar5.b;
                        Boolean valueOf3 = Boolean.valueOf(J3);
                        b1Var4.getClass();
                        HashMap hashMap4 = new HashMap();
                        hashMap4.put("isBlank", valueOf3);
                        b1Var4.a.a("B2BHome.WebView.SendDataFromClient.Name", hashMap4, 1, new HashMap());
                        jSONObject3.put("contact", l);
                        gcnVar.a(new ck7(jSONObject3.toString(), null));
                        break;
                }
                return zy11Var2;
            }
        }));
        final int i4 = 2;
        arrayList2.add(new cj7("corp_account_contact", new wls() { // from class: qve
            @Override // defpackage.wls
            public final Object invoke(Object obj3, Object obj4) {
                kj Ig;
                int i42 = i4;
                zy11 zy11Var2 = zy11.a;
                rve rveVar2 = rveVar;
                gcn gcnVar = (gcn) obj4;
                switch (i42) {
                    case 0:
                        aue a2 = bue.a(rveVar2.g);
                        JSONObject jSONObject = new JSONObject();
                        String a3 = a2.a();
                        sae saeVar3 = rveVar2.i;
                        boolean J = evu0.J(a3);
                        b1 b1Var2 = (b1) saeVar3.b;
                        Boolean valueOf = Boolean.valueOf(J);
                        b1Var2.getClass();
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("isBlank", valueOf);
                        b1Var2.a.a("B2BHome.WebView.SendDataFromClient.Email", hashMap2, 1, new HashMap());
                        jSONObject.put("email", a3);
                        gcnVar.a(new ck7(jSONObject.toString(), null));
                        break;
                    case 1:
                        aue a4 = bue.a(rveVar2.g);
                        JSONObject jSONObject2 = new JSONObject();
                        String b2 = a4.b();
                        sae saeVar4 = rveVar2.i;
                        boolean J2 = evu0.J(b2);
                        b1 b1Var3 = (b1) saeVar4.b;
                        Boolean valueOf2 = Boolean.valueOf(J2);
                        b1Var3.getClass();
                        HashMap hashMap3 = new HashMap();
                        hashMap3.put("isBlank", valueOf2);
                        b1Var3.a.a("B2BHome.WebView.SendDataFromClient.Phone", hashMap3, 1, new HashMap());
                        jSONObject2.put("phone", b2);
                        gcnVar.a(new ck7(jSONObject2.toString(), null));
                        break;
                    default:
                        JSONObject jSONObject3 = new JSONObject();
                        String l = ((cne0) rveVar2.j.b).l("user_first_name", null);
                        if ((l == null || evu0.J(l)) && ((Ig = rveVar2.h.a.Ig()) == null || (l = Ig.b) == null)) {
                            l = "";
                        }
                        sae saeVar5 = rveVar2.i;
                        boolean J3 = evu0.J(l);
                        b1 b1Var4 = (b1) saeVar5.b;
                        Boolean valueOf3 = Boolean.valueOf(J3);
                        b1Var4.getClass();
                        HashMap hashMap4 = new HashMap();
                        hashMap4.put("isBlank", valueOf3);
                        b1Var4.a.a("B2BHome.WebView.SendDataFromClient.Name", hashMap4, 1, new HashMap());
                        jSONObject3.put("contact", l);
                        gcnVar.a(new ck7(jSONObject3.toString(), null));
                        break;
                }
                return zy11Var2;
            }
        }));
        ((pep0) rveVar.a).f(a, new k7w0(str4, true, false, saeVar2, i7w0Var, ma41.C4, true, 7, true, sybVar, z2, gycVar2, str3, aohVar, eatsKitSplash$ShimmeringSplash, dy60Var, arrayList2, WebViewThemeChangeMode.PREFERS_COLOR_SCHEME, ServiceHeaderMode.HEADER_INVISIBLE, e90Var), hxx.a);
        rveVar.d.a.add(rve.p);
        return zy11Var;
    }
}
