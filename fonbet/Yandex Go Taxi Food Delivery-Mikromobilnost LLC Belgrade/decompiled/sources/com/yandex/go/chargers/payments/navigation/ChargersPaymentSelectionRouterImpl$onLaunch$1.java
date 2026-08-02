package com.yandex.go.chargers.payments.navigation;

import com.yandex.go.payments.lpm.navigation.d;
import defpackage.ama;
import defpackage.dy90;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zla;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.payments.navigation.ChargersPaymentSelectionRouterImpl$onLaunch$1", f = "ChargersPaymentSelectionRouterImpl.kt", l = {31}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersPaymentSelectionRouterImpl$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ zla $payload;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersPaymentSelectionRouterImpl$onLaunch$1(a aVar, zla zlaVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$payload = zlaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersPaymentSelectionRouterImpl$onLaunch$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersPaymentSelectionRouterImpl$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a aVar;
        m950 m950Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            aVar = this.this$0;
            d a = ((dy90) ((com.yandex.go.chargers.payments.domain.d) aVar.E).b()).a.a();
            a aVar2 = this.this$0;
            zla zlaVar = this.$payload;
            this.L$0 = aVar;
            this.L$1 = a;
            this.label = 1;
            Object P = a.P(aVar2, zlaVar, this);
            if (P == coroutineSingletons) {
                return coroutineSingletons;
            }
            m950Var = a;
            obj = P;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            m950Var = (m950) this.L$1;
            aVar = (a) this.L$0;
            b.b(obj);
        }
        aVar.A(m950Var, obj, new ama(0, this.this$0));
        return zy11.a;
    }
}
