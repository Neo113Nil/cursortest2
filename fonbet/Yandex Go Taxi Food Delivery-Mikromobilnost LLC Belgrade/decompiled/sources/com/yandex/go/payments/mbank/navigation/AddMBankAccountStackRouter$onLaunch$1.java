package com.yandex.go.payments.mbank.navigation;

import com.adjust.sdk.Constants;
import defpackage.jf0;
import defpackage.kf0;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.mbank.navigation.AddMBankAccountStackRouter$onLaunch$1", f = "AddMBankAccountStackRouter.kt", l = {30}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class AddMBankAccountStackRouter$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ jf0 $payload;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddMBankAccountStackRouter$onLaunch$1(d dVar, jf0 jf0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$payload = jf0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddMBankAccountStackRouter$onLaunch$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AddMBankAccountStackRouter$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        d dVar;
        m950 m950Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            dVar = this.this$0;
            b a = dVar.H.a(new c(dVar));
            d dVar2 = this.this$0;
            this.$payload.getClass();
            String str = this.$payload.a;
            this.L$0 = dVar;
            this.L$1 = a;
            this.label = 1;
            Object P = d.P(dVar2, Constants.DEEPLINK, str, this);
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
            dVar = (d) this.L$0;
            kotlin.b.b(obj);
        }
        dVar.A(m950Var, obj, new kf0(this.this$0, 0));
        return zy11.a;
    }
}
