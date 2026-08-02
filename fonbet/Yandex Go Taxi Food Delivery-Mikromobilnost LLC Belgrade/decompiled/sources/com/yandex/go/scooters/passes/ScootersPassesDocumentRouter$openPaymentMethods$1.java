package com.yandex.go.scooters.passes;

import defpackage.c7n0;
import defpackage.m950;
import defpackage.mo21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.po21;
import defpackage.sgo0;
import defpackage.sls;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.passes.ScootersPassesDocumentRouter$openPaymentMethods$1", f = "ScootersPassesDocumentRouter.kt", l = {HProv.PP_CACHE_SIZE}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPassesDocumentRouter$openPaymentMethods$1 extends SuspendLambda implements wls {
    final /* synthetic */ sls $onClose;
    final /* synthetic */ tls $onPaymentSelected;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPassesDocumentRouter$openPaymentMethods$1(c cVar, tls tlsVar, sls slsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$onPaymentSelected = tlsVar;
        this.$onClose = slsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersPassesDocumentRouter$openPaymentMethods$1(this.this$0, this.$onPaymentSelected, this.$onClose, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPassesDocumentRouter$openPaymentMethods$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            po21 po21Var = this.this$0.E;
            this.label = 1;
            obj = ((ru.yandex.taxi.preorder.source.userposition.e) po21Var).f(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        sgo0 sgo0Var = new sgo0(((mo21) obj).a(), true, this.this$0.K.c().d());
        c cVar = this.this$0;
        cVar.A((m950) cVar.F.get(), sgo0Var, new c7n0(this.$onPaymentSelected, this.$onClose, 1));
        return zy11.a;
    }
}
