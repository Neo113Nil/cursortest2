package com.yandex.go.yb;

import com.yandex.go.taxi.order.models.api.status.RequiredCardBalance;
import defpackage.bav0;
import defpackage.be9;
import defpackage.cv51;
import defpackage.dv51;
import defpackage.ew51;
import defpackage.fv51;
import defpackage.mv51;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xv51;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.yb.SuggestYbCardInRideRouterImpl$openTopupScreen$1", f = "SuggestYbCardInRideRouterImpl.kt", l = {85}, m = "invokeSuspend", v = 2)
/* loaded from: classes15.dex */
final class SuggestYbCardInRideRouterImpl$openTopupScreen$1 extends SuspendLambda implements wls {
    final /* synthetic */ mv51 $balanceBeforeTopup;
    final /* synthetic */ RequiredCardBalance $cardBalance;
    final /* synthetic */ xv51 $changePaymentAfterDismissCallback;
    final /* synthetic */ be9 $changePaymentSuggest;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestYbCardInRideRouterImpl$openTopupScreen$1(b bVar, be9 be9Var, RequiredCardBalance requiredCardBalance, mv51 mv51Var, xv51 xv51Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$changePaymentSuggest = be9Var;
        this.$cardBalance = requiredCardBalance;
        this.$balanceBeforeTopup = mv51Var;
        this.$changePaymentAfterDismissCallback = xv51Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuggestYbCardInRideRouterImpl$openTopupScreen$1(this.this$0, this.$changePaymentSuggest, this.$cardBalance, this.$balanceBeforeTopup, this.$changePaymentAfterDismissCallback, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuggestYbCardInRideRouterImpl$openTopupScreen$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            String str = this.$changePaymentSuggest.a;
            RequiredCardBalance requiredCardBalance = this.$cardBalance;
            mv51 mv51Var = this.$balanceBeforeTopup;
            this.label = 1;
            obj = b.a(bVar, str, requiredCardBalance, mv51Var, this);
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
        ((dv51) ((cv51) this.this$0.j.get())).b(new fv51((ew51) obj, true), new bav0(this.$changePaymentAfterDismissCallback, 0));
        return zy11.a;
    }
}
