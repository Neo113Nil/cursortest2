package com.yandex.go.scooters.mosru;

import com.yandex.go.scooters.mosru.api.analytics.ScootersMosRuAnalyticsEvent$WebViewOpened$OpenReason;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w8p0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.Key.foreign.JCSP3DesKeyGenerator;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.mosru.ScootersMosRuRouterImpl$handleButtonAction$1", f = "ScootersMosRuRouterImpl.kt", l = {JCSP3DesKeyGenerator.KEY_LEN_3DES_SUN}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersMosRuRouterImpl$handleButtonAction$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $authorizationUrl;
    Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersMosRuRouterImpl$handleButtonAction$1(c cVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$authorizationUrl = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersMosRuRouterImpl$handleButtonAction$1(this.this$0, this.$authorizationUrl, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersMosRuRouterImpl$handleButtonAction$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        c cVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar2 = this.this$0;
            String str = this.$authorizationUrl;
            this.L$0 = cVar2;
            this.label = 1;
            Object S = c.S(cVar2, str, this);
            if (S == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = S;
            cVar = cVar2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cVar = (c) this.L$0;
            kotlin.b.b(obj);
        }
        c.R(cVar, (w8p0) obj, ScootersMosRuAnalyticsEvent$WebViewOpened$OpenReason.MODAL);
        return zy11.a;
    }
}
