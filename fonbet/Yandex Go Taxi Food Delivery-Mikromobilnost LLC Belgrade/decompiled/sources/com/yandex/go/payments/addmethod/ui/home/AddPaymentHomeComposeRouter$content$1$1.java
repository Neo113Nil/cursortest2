package com.yandex.go.payments.addmethod.ui.home;

import defpackage.agd;
import defpackage.gg0;
import defpackage.lg0;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.yfd;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.addmethod.ui.home.AddPaymentHomeComposeRouter$content$1$1", f = "AddPaymentHomeComposeRouter.kt", l = {44, 45}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class AddPaymentHomeComposeRouter$content$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ yfd $this_buildContent;
    int label;
    final /* synthetic */ gg0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddPaymentHomeComposeRouter$content$1$1(gg0 gg0Var, yfd yfdVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gg0Var;
        this.$this_buildContent = yfdVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddPaymentHomeComposeRouter$content$1$1(this.this$0, this.$this_buildContent, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AddPaymentHomeComposeRouter$content$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0028, code lost:
    
        if (kotlinx.coroutines.a.i(300, r10) == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            this.label = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        e eVar = this.this$0.L;
        Object obj2 = ((agd) this.$this_buildContent).a;
        PaymentMethod$Type paymentMethod$Type = ((lg0) obj2).a;
        List list = ((lg0) obj2).b;
        String str = ((lg0) obj2).c;
        this.label = 2;
        eVar.a.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(mdh.b, new AddPaymentHomeUiStateInteractor$updateUiState$2(paymentMethod$Type, list, str, eVar, null), this);
        if (k0 != coroutineSingletons) {
            k0 = zy11Var;
        }
        return k0 == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
