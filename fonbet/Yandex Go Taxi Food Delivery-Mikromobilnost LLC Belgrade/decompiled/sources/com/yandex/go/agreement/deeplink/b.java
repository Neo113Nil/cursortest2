package com.yandex.go.agreement.deeplink;

import defpackage.dg41;
import defpackage.evu0;
import defpackage.ff41;
import defpackage.g8e;
import defpackage.gf41;
import defpackage.hxx;
import defpackage.i3y;
import defpackage.jj3;
import defpackage.jst;
import defpackage.mq61;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.pep0;
import defpackage.qzj0;
import defpackage.sbc;
import defpackage.scg;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.um3;
import defpackage.unr0;
import defpackage.v770;
import defpackage.xco;
import defpackage.yco;
import defpackage.zh11;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.deeplinks.DeeplinkSource;
import ru.yandex.taxi.startup.launch.h;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;

/* loaded from: classes.dex */
public final class b extends yco {
    public final tse b;
    public final h c;
    public final ru.yandex.taxi.am.token.a d;
    public final jj3 e;
    public final gf41 f;
    public final zh11 g;
    public final i3y h = kotlin.a.a(new sbc(22, this));

    public b(tse tseVar, h hVar, ru.yandex.taxi.am.token.a aVar, jj3 jj3Var, gf41 gf41Var, zh11 zh11Var) {
        this.b = tseVar;
        this.c = hVar;
        this.d = aVar;
        this.e = jj3Var;
        this.f = gf41Var;
        this.g = zh11Var;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v2, types: [T, java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v6, types: [T, java.lang.String] */
    @Override // com.yandex.go.deeplinks.typed.a
    public final Object c(final oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        xco xcoVar = (xco) obj;
        boolean c = this.g.b.c(xcoVar.a().toString());
        zy11 zy11Var = zy11.a;
        if (!c) {
            g8e.B(jst.e, "DEEPLINK_NOT_TRUSTED", null, unr0.n(xcoVar.a(), "Try to open not trusted agreement deeplink "), 2);
            return zy11Var;
        }
        String Hg = this.c.Hg();
        if (Hg != null && !evu0.J(Hg)) {
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ?? b = xcoVar.b();
            ref$ObjectRef.element = b;
            if (evu0.J(b)) {
                jst.e.k(new IllegalArgumentException("url parameter is empty"), "No url for eula");
                return zy11Var;
            }
            ref$ObjectRef.element = mq61.c((String) ref$ObjectRef.element, "user_id=".concat(Hg));
            if (this.d.g()) {
                return d(oep0Var, (String) ref$ObjectRef.element, (ContinuationImpl) continuation);
            }
            this.e.c(new um3(Events$Zalogin$LoginContext.DEEPLINK, new qzj0(null, new tls() { // from class: com.yandex.go.agreement.deeplink.a
                @Override // defpackage.tls
                public final Object invoke(Object obj2) {
                    if (!(((Result) obj2).getValue() instanceof Result.Failure)) {
                        b bVar = b.this;
                        tje.N(bVar.b, null, null, new EulaDeeplinkHandler$handleEulasAgreements$2$1(bVar, oep0Var, ref$ObjectRef, null), 3);
                    }
                    return zy11.a;
                }
            }), false, false, 28));
        }
        return zy11Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(oep0 oep0Var, String str, ContinuationImpl continuationImpl) {
        EulaDeeplinkHandler$openWebView$1 eulaDeeplinkHandler$openWebView$1;
        int i;
        oep0 oep0Var2;
        Object d;
        String str2;
        String str3;
        zy11 zy11Var;
        if (continuationImpl instanceof EulaDeeplinkHandler$openWebView$1) {
            eulaDeeplinkHandler$openWebView$1 = (EulaDeeplinkHandler$openWebView$1) continuationImpl;
            int i2 = eulaDeeplinkHandler$openWebView$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eulaDeeplinkHandler$openWebView$1.label = i2 - Integer.MIN_VALUE;
                Object obj = eulaDeeplinkHandler$openWebView$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = eulaDeeplinkHandler$openWebView$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    oep0Var2 = oep0Var;
                    eulaDeeplinkHandler$openWebView$1.L$0 = oep0Var2;
                    eulaDeeplinkHandler$openWebView$1.L$1 = str;
                    eulaDeeplinkHandler$openWebView$1.label = 1;
                    d = this.d.d(false, eulaDeeplinkHandler$openWebView$1);
                    if (d == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str2 = str;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = (String) eulaDeeplinkHandler$openWebView$1.L$1;
                    oep0 oep0Var3 = (oep0) eulaDeeplinkHandler$openWebView$1.L$0;
                    kotlin.b.b(obj);
                    d = ((Result) obj).getValue();
                    oep0Var2 = oep0Var3;
                }
                str3 = (String) (d instanceof Result.Failure ? null : d);
                zy11Var = zy11.a;
                if (str3 != null || evu0.J(str3)) {
                    jst.e.k(new IllegalStateException("Missed OAuth token"), "OAuth token is required to show eula");
                    return zy11Var;
                }
                CoreWebViewConfig.a aVar = new CoreWebViewConfig.a();
                aVar.j(str2);
                aVar.i(str3);
                ((pep0) oep0Var2).f(((scg) ((ff41) this.h.getValue())).b(), new dg41(new UiWebViewConfig(aVar.a(), null, false, false, false, false, null, true, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194174, null), null, null, null, null, null, null, 254), hxx.a);
                return zy11Var;
            }
        }
        eulaDeeplinkHandler$openWebView$1 = new EulaDeeplinkHandler$openWebView$1(this, continuationImpl);
        Object obj2 = eulaDeeplinkHandler$openWebView$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = eulaDeeplinkHandler$openWebView$1.label;
        if (i != 0) {
        }
        str3 = (String) (d instanceof Result.Failure ? null : d);
        zy11Var = zy11.a;
        if (str3 != null) {
        }
        jst.e.k(new IllegalStateException("Missed OAuth token"), "OAuth token is required to show eula");
        return zy11Var;
    }
}
