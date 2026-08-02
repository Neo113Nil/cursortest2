package com.yandex.go.payments.sbp.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.sbp.domain.PaymentsBindingStatusController$onLargestContentfulPaint$1$1$1$job$1", f = "PaymentsBindingStatusController.kt", l = {65}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PaymentsBindingStatusController$onLargestContentfulPaint$1$1$1$job$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $bindingId;
    final /* synthetic */ String $type;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentsBindingStatusController$onLargestContentfulPaint$1$1$1$job$1(b bVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$bindingId = str;
        this.$type = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaymentsBindingStatusController$onLargestContentfulPaint$1$1$1$job$1(this.this$0, this.$bindingId, this.$type, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentsBindingStatusController$onLargestContentfulPaint$1$1$1$job$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CancellationException e;
        b bVar;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = (String) this.L$1;
            bVar = (b) this.L$0;
            try {
                kotlin.b.b(obj);
            } catch (CancellationException e2) {
                e = e2;
                try {
                    throw e;
                } finally {
                    bVar.l.remove(str);
                }
            } catch (Throwable unused) {
            }
            return zy11.a;
        }
        kotlin.b.b(obj);
        b bVar2 = this.this$0;
        String str2 = this.$bindingId;
        String str3 = this.$type;
        try {
            this.L$0 = bVar2;
            this.L$1 = str2;
            this.label = 1;
            if (b.d(bVar2, str2, str3, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } catch (CancellationException e3) {
            e = e3;
            bVar = bVar2;
            str = str2;
            throw e;
        } catch (Throwable unused2) {
        }
        bVar = bVar2;
        str = str2;
        return zy11.a;
    }
}
