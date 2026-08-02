package com.yandex.go.payments.acceptance.domain;

import defpackage.hxx;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ne;
import defpackage.ny61;
import defpackage.pep0;
import defpackage.qe;
import defpackage.tse;
import defpackage.we;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.acceptance.domain.AcceptancePaymentNotificationManager$ensureAttached$1", f = "AcceptancePaymentNotificationManager.kt", l = {187}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class AcceptancePaymentNotificationManager$ensureAttached$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $dismissible;
    final /* synthetic */ String $orderId;
    final /* synthetic */ we $state;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcceptancePaymentNotificationManager$ensureAttached$1(d dVar, String str, we weVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$orderId = str;
        this.$state = weVar;
        this.$dismissible = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AcceptancePaymentNotificationManager$ensureAttached$1(this.this$0, this.$orderId, this.$state, this.$dismissible, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AcceptancePaymentNotificationManager$ensureAttached$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x002c */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.this$0.d.b(this.$orderId, null);
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        while (r5.c.containsKey(this.$orderId)) {
            this.label = 1;
            if (kotlinx.coroutines.a.i(16L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        this.this$0.d.b(this.$orderId, this.$state);
        qe qeVar = this.this$0.d;
        qeVar.c.put(this.$orderId, Boolean.valueOf(this.$dismissible));
        d dVar = this.this$0;
        ((pep0) dVar.b).f((m950) dVar.c.get(), new ne(this.$orderId), hxx.a);
        return zy11.a;
    }
}
