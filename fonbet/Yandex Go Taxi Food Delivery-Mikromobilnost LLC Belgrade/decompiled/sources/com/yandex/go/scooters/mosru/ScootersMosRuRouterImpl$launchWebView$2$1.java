package com.yandex.go.scooters.mosru;

import com.yandex.go.scooters.mosru.api.analytics.ScootersMosRuAnalyticsEvent$WebViewClosed$AuthStatus;
import com.yandex.go.scooters.mosru.api.domain.model.ScootersMosRuAuthStatus;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pzn0;
import defpackage.tse;
import defpackage.wls;
import defpackage.xyn0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.mosru.ScootersMosRuRouterImpl$launchWebView$2$1", f = "ScootersMosRuRouterImpl.kt", l = {216, 217, 221, 227}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersMosRuRouterImpl$launchWebView$2$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersMosRuRouterImpl$launchWebView$2$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersMosRuRouterImpl$launchWebView$2$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersMosRuRouterImpl$launchWebView$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
    
        if (r8.e(r1, false, r7) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0092, code lost:
    
        if (r8.e(r1, false, r7) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0047, code lost:
    
        if (r8 == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003a, code lost:
    
        if (r8.e(r1, true, r7) == r0) goto L28;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.scooters.mosru.domain.a aVar = this.this$0.E;
            ScootersMosRuAuthStatus scootersMosRuAuthStatus = ScootersMosRuAuthStatus.PENDING;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        kotlin.b.b(obj);
                        this.this$0.r(new pzn0(0));
                        return zy11.a;
                    }
                    if (i != 4) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    this.this$0.r(new pzn0(1));
                    return zy11.a;
                }
                kotlin.b.b(obj);
                boolean booleanValue = ((Boolean) obj).booleanValue();
                c cVar = this.this$0;
                if (booleanValue) {
                    cVar.G.b(new xyn0(ScootersMosRuAnalyticsEvent$WebViewClosed$AuthStatus.CANCELED));
                    com.yandex.go.scooters.mosru.domain.a aVar2 = this.this$0.E;
                    ScootersMosRuAuthStatus scootersMosRuAuthStatus2 = ScootersMosRuAuthStatus.UNAUTHORIZED;
                    this.label = 3;
                } else {
                    cVar.G.b(new xyn0(ScootersMosRuAnalyticsEvent$WebViewClosed$AuthStatus.SUCCESS));
                    com.yandex.go.scooters.mosru.domain.a aVar3 = this.this$0.E;
                    ScootersMosRuAuthStatus scootersMosRuAuthStatus3 = ScootersMosRuAuthStatus.SUCCESS;
                    this.label = 4;
                }
                return coroutineSingletons;
            }
            kotlin.b.b(obj);
        }
        com.yandex.go.scooters.mosru.domain.a aVar4 = this.this$0.E;
        this.label = 2;
        obj = aVar4.d(this);
    }
}
