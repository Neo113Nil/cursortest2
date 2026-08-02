package com.yandex.go.safety.center.safetycenter_web;

import com.yandex.go.safety.center.analytics.SafetyCenterAnalytics$SafetyCenterNavigationSource;
import com.yandex.go.safety.center.experiment.SafetyCenterWebConfig;
import com.yandex.go.safety.center.safetycenter_web.domain.web.SafetyCenterWebJsApi;
import com.yandex.go.safety.center.safetycenter_web.domain.web.c;
import defpackage.c0g;
import defpackage.c7g;
import defpackage.dg41;
import defpackage.eul0;
import defpackage.f7g;
import defpackage.ff41;
import defpackage.fn21;
import defpackage.ful0;
import defpackage.gg41;
import defpackage.h55;
import defpackage.i6r;
import defpackage.jul0;
import defpackage.jvl0;
import defpackage.krl0;
import defpackage.lul0;
import defpackage.mo30;
import defpackage.mul0;
import defpackage.mvg;
import defpackage.mvl0;
import defpackage.n3w;
import defpackage.ny61;
import defpackage.o8k0;
import defpackage.oul0;
import defpackage.ovl0;
import defpackage.ppl0;
import defpackage.q5z;
import defpackage.qu;
import defpackage.qvl0;
import defpackage.s6k0;
import defpackage.scg;
import defpackage.sul0;
import defpackage.tig0;
import defpackage.tse;
import defpackage.tse0;
import defpackage.tt2;
import defpackage.tul0;
import defpackage.upk0;
import defpackage.uul0;
import defpackage.wls;
import defpackage.wnt;
import defpackage.xf41;
import defpackage.xvf0;
import defpackage.zy11;
import defpackage.zzf;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.web.UiWebViewConfig;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.safety.center.safetycenter_web.SafetyCenterWebFeatureRouter$onLaunch$1", f = "SafetyCenterWebFeatureRouter.kt", l = {HProv.ALG_SID_SHA3_224}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SafetyCenterWebFeatureRouter$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ SafetyCenterWebConfig $featureConfig;
    final /* synthetic */ sul0 $payload;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafetyCenterWebFeatureRouter$onLaunch$1(b bVar, sul0 sul0Var, SafetyCenterWebConfig safetyCenterWebConfig, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$payload = sul0Var;
        this.$featureConfig = safetyCenterWebConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SafetyCenterWebFeatureRouter$onLaunch$1(this.this$0, this.$payload, this.$featureConfig, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SafetyCenterWebFeatureRouter$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        f7g f7gVar;
        SafetyCenterWebFeatureRouter$onLaunch$1 safetyCenterWebFeatureRouter$onLaunch$1;
        SafetyCenterWebJsApi safetyCenterWebJsApi;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        String str = null;
        if (i == 0) {
            kotlin.b.b(obj);
            i6r i6rVar = (i6r) this.this$0.L.get();
            i6rVar.getClass();
            f7gVar = new f7g(new qvl0(), i6rVar);
            jvl0 jvl0Var = (jvl0) f7gVar.c.a;
            krl0 krl0Var = new krl0((h55) this.this$0, (Object) this.$payload);
            s6k0 s6k0Var = jvl0Var.a;
            SafetyCenterWebJsApi safetyCenterWebJsApi2 = new SafetyCenterWebJsApi((wnt) ((c7g) s6k0Var.a).get(), (tt2) ((c7g) s6k0Var.b).get(), (xf41) ((upk0) s6k0Var.c).get(), krl0Var);
            zzf zzfVar = ((c0g) i6rVar).z;
            ru.yandex.taxi.am.token.a aVar = (ru.yandex.taxi.am.token.a) zzfVar.C3.get();
            q5z.h(aVar);
            fn21 fn21Var = (fn21) zzfVar.a0.get();
            q5z.h(fn21Var);
            c cVar = new c(fn21Var, aVar);
            String str2 = this.$featureConfig.a;
            b bVar = this.this$0;
            sul0 sul0Var = this.$payload;
            bVar.getClass();
            String str3 = sul0Var.a;
            String str4 = (str3 == null || sul0Var.b) ? null : str3;
            String a = this.this$0.D.a();
            this.L$0 = f7gVar;
            this.L$1 = safetyCenterWebJsApi2;
            this.label = 1;
            safetyCenterWebFeatureRouter$onLaunch$1 = this;
            obj = cVar.a(str2, str4, safetyCenterWebJsApi2, a, safetyCenterWebFeatureRouter$onLaunch$1);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            safetyCenterWebJsApi = safetyCenterWebJsApi2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafetyCenterWebJsApi safetyCenterWebJsApi3 = (SafetyCenterWebJsApi) this.L$1;
            f7gVar = (f7g) this.L$0;
            kotlin.b.b(obj);
            safetyCenterWebFeatureRouter$onLaunch$1 = this;
            safetyCenterWebJsApi = safetyCenterWebJsApi3;
        }
        UiWebViewConfig uiWebViewConfig = (UiWebViewConfig) obj;
        b bVar2 = safetyCenterWebFeatureRouter$onLaunch$1.this$0;
        zy11 zy11Var = zy11.a;
        if (uiWebViewConfig == null) {
            bVar2.r(new qu(9));
            return zy11Var;
        }
        bVar2.R = new o8k0(17, f7gVar, uiWebViewConfig);
        eul0 eul0Var = bVar2.N;
        sul0 sul0Var2 = safetyCenterWebFeatureRouter$onLaunch$1.$payload;
        ppl0 ppl0Var = eul0Var.d;
        SafetyCenterAnalytics$SafetyCenterNavigationSource e = eul0.e(sul0Var2.d);
        boolean c = eul0Var.c();
        boolean z = sul0Var2.b;
        String b = eul0Var.b();
        String d = eul0Var.d();
        String str5 = sul0Var2.a;
        HashMap o = tse0.o(ppl0Var);
        o.put("source", e.getEventValue());
        o.put("has_account", Boolean.valueOf(c));
        o.put("is_checklist", Boolean.valueOf(z));
        if (b != null) {
            o.put("country", b);
        }
        if (d != null) {
            o.put("zone_name", d);
        }
        if (str5 != null) {
            o.put("source_order_id", str5);
        }
        ppl0Var.a.a("SafetyCenter.Web.Shown", o, 1, new HashMap());
        b bVar3 = safetyCenterWebFeatureRouter$onLaunch$1.this$0;
        qvl0 qvl0Var = f7gVar.a;
        gg41 b2 = ((scg) ((ff41) f7gVar.b.get())).b();
        q5z.i(b2);
        b bVar4 = safetyCenterWebFeatureRouter$onLaunch$1.this$0;
        SafetyCenterWebConfig safetyCenterWebConfig = safetyCenterWebFeatureRouter$onLaunch$1.$featureConfig;
        sul0 sul0Var3 = safetyCenterWebFeatureRouter$onLaunch$1.$payload;
        mul0 mul0Var = bVar4.P;
        Map map = sul0Var3.c.c;
        String str6 = sul0Var3.a;
        if (str6 != null && !sul0Var3.b) {
            str = str6;
        }
        ful0 ful0Var = new ful0(safetyCenterWebConfig, map, str);
        a aVar2 = new a(bVar4, sul0Var3);
        tig0 tig0Var = mul0Var.a;
        lul0 lul0Var = new lul0(ful0Var, aVar2, (jul0) ((xvf0) tig0Var.a).get(), (oul0) ((n3w) tig0Var.b).a);
        b bVar5 = safetyCenterWebFeatureRouter$onLaunch$1.this$0;
        bVar5.getClass();
        bVar3.A(b2, new dg41(uiWebViewConfig, safetyCenterWebJsApi, new tul0(safetyCenterWebFeatureRouter$onLaunch$1.this$0, safetyCenterWebFeatureRouter$onLaunch$1.$payload), null, null, lul0Var, new ovl0(new uul0(bVar5), (mvl0) bVar5.Q.a.a.a), 56), new mo30(24, safetyCenterWebFeatureRouter$onLaunch$1.this$0));
        return zy11Var;
    }
}
