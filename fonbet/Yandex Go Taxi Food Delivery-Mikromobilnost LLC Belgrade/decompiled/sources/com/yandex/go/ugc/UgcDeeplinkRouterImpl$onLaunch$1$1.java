package com.yandex.go.ugc;

import android.net.Uri;
import android.os.SystemClock;
import defpackage.dg41;
import defpackage.ds11;
import defpackage.gs11;
import defpackage.gw00;
import defpackage.hlx0;
import defpackage.ic01;
import defpackage.is11;
import defpackage.jl40;
import defpackage.js11;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qu;
import defpackage.scg;
import defpackage.tse;
import defpackage.wls;
import defpackage.yio0;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.web.UiWebViewConfig;
import ru.yandex.taxi.web.deeplink.WebViewFromDeeplinkExperiment;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.ugc.UgcDeeplinkRouterImpl$onLaunch$1$1", f = "UgcDeeplinkRouterImpl.kt", l = {90, 90}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class UgcDeeplinkRouterImpl$onLaunch$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ Uri $deeplink;
    final /* synthetic */ ds11 $payload;
    final /* synthetic */ WebViewFromDeeplinkExperiment.a $url;
    final /* synthetic */ String $urlId;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcDeeplinkRouterImpl$onLaunch$1$1(f fVar, String str, WebViewFromDeeplinkExperiment.a aVar, Uri uri, ds11 ds11Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$urlId = str;
        this.$url = aVar;
        this.$deeplink = uri;
        this.$payload = ds11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UgcDeeplinkRouterImpl$onLaunch$1$1(this.this$0, this.$urlId, this.$url, this.$deeplink, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UgcDeeplinkRouterImpl$onLaunch$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:2|(3:(1:(15:6|7|8|9|10|11|12|(1:14)(1:26)|15|(1:17)|18|(1:20)|21|(1:23)|24)(2:34|35))(4:36|37|38|39)|30|31)(5:51|52|53|(1:55)|43)|40|41|(12:44|10|11|12|(0)(0)|15|(0)|18|(0)|21|(0)|24)|43) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0125, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0126, code lost:
    
        r1 = r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a7  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        f fVar;
        String str;
        Object Q;
        WebViewFromDeeplinkExperiment.a aVar;
        String str2;
        f fVar2;
        Object S;
        WebViewFromDeeplinkExperiment.a aVar2;
        is11 is11Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        try {
            if (i != 0) {
                if (i == 1) {
                    fVar = (f) this.L$3;
                    str2 = (String) this.L$2;
                    f fVar3 = (f) this.L$1;
                    WebViewFromDeeplinkExperiment.a aVar3 = (WebViewFromDeeplinkExperiment.a) this.L$0;
                    try {
                        kotlin.b.b(obj);
                        aVar = aVar3;
                        fVar2 = fVar3;
                        Q = obj;
                    } catch (Throwable th) {
                        th = th;
                        str = str2;
                        fVar = fVar3;
                    }
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) this.L$2;
                    fVar = (f) this.L$1;
                    aVar2 = (WebViewFromDeeplinkExperiment.a) this.L$0;
                    try {
                        kotlin.b.b(obj);
                        fVar2 = fVar;
                        S = obj;
                        try {
                            Pair pair = new Pair(aVar2, (UiWebViewConfig) S);
                            f fVar4 = this.this$0;
                            WebViewFromDeeplinkExperiment.a aVar4 = (WebViewFromDeeplinkExperiment.a) pair.c();
                            UiWebViewConfig uiWebViewConfig = (UiWebViewConfig) pair.f();
                            String str3 = this.$urlId;
                            is11Var = jl40.l(str3, "payment_by_qr") ? null : new is11(str3, fVar4.I);
                            e eVar = new e(is11Var, fVar4, str3, aVar4);
                            if (is11Var != null) {
                                is11Var.d = SystemClock.elapsedRealtime();
                                hlx0 hlx0Var = is11Var.b;
                                hlx0Var.A("Ugc.WebViewCreateStarted", hlx0Var.p(is11Var.a, is11Var.c));
                            }
                            fVar4.A(((scg) fVar4.T()).b(), new dg41(uiWebViewConfig, eVar, null, null, is11Var != null ? new gs11(new ic01(1, is11Var)) : null, null, null, 220), new yio0(25, fVar4));
                            if (is11Var != null) {
                                long elapsedRealtime = SystemClock.elapsedRealtime() - is11Var.d;
                                hlx0 hlx0Var2 = is11Var.b;
                                hlx0Var2.A("Ugc.WebViewCreateFinished", kotlin.collections.b.n(hlx0Var2.p(is11Var.a, is11Var.c), gw00.e(new Pair("duration_ms", Long.valueOf(elapsedRealtime)))));
                            }
                            return zy11Var;
                        } catch (Throwable th2) {
                            th = th2;
                            fVar = fVar2;
                            fVar.getClass();
                            jst.e.k(th, "Ugc.Error");
                            fVar.I.q(str);
                            fVar.r(new qu(9));
                            return zy11Var;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                fVar.getClass();
                jst.e.k(th, "Ugc.Error");
                fVar.I.q(str);
                fVar.r(new qu(9));
                return zy11Var;
            }
            kotlin.b.b(obj);
            fVar = this.this$0;
            WebViewFromDeeplinkExperiment.a aVar5 = this.$url;
            Uri uri = this.$deeplink;
            ds11 ds11Var = this.$payload;
            String str4 = this.$urlId;
            try {
                js11 js11Var = ds11Var.b;
                this.L$0 = aVar5;
                this.L$1 = fVar;
                this.L$2 = str4;
                this.L$3 = fVar;
                this.label = 1;
                Q = f.Q(fVar, aVar5, uri, js11Var, this);
                if (Q != coroutineSingletons) {
                    aVar = aVar5;
                    str2 = str4;
                    fVar2 = fVar;
                }
                return coroutineSingletons;
            } catch (Throwable th4) {
                th = th4;
                str = str4;
            }
            this.L$0 = aVar;
            this.L$1 = fVar2;
            this.L$2 = str2;
            this.L$3 = null;
            this.label = 2;
            S = fVar.S((WebViewFromDeeplinkExperiment.a) Q, this);
            if (S != coroutineSingletons) {
                str = str2;
                aVar2 = aVar;
                Pair pair2 = new Pair(aVar2, (UiWebViewConfig) S);
                f fVar42 = this.this$0;
                WebViewFromDeeplinkExperiment.a aVar42 = (WebViewFromDeeplinkExperiment.a) pair2.c();
                UiWebViewConfig uiWebViewConfig2 = (UiWebViewConfig) pair2.f();
                String str32 = this.$urlId;
                if (jl40.l(str32, "payment_by_qr")) {
                }
                e eVar2 = new e(is11Var, fVar42, str32, aVar42);
                if (is11Var != null) {
                }
                fVar42.A(((scg) fVar42.T()).b(), new dg41(uiWebViewConfig2, eVar2, null, null, is11Var != null ? new gs11(new ic01(1, is11Var)) : null, null, null, 220), new yio0(25, fVar42));
                if (is11Var != null) {
                }
                return zy11Var;
            }
            return coroutineSingletons;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
