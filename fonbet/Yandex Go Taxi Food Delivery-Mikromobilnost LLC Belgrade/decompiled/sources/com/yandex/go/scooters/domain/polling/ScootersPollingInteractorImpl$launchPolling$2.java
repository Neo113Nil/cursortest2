package com.yandex.go.scooters.domain.polling;

import defpackage.cne0;
import defpackage.kdd0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qwo0;
import defpackage.tse;
import defpackage.v4r0;
import defpackage.wls;
import defpackage.zy11;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.domain.polling.ScootersPollingInteractorImpl$launchPolling$2", f = "ScootersPollingInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPollingInteractorImpl$launchPolling$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $pollingId;
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPollingInteractorImpl$launchPolling$2(j jVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jVar;
        this.$pollingId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersPollingInteractorImpl$launchPolling$2(this.this$0, this.$pollingId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ScootersPollingInteractorImpl$launchPolling$2 scootersPollingInteractorImpl$launchPolling$2 = (ScootersPollingInteractorImpl$launchPolling$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        scootersPollingInteractorImpl$launchPolling$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        try {
            kdd0 kdd0Var = this.this$0.i;
            String str = this.$pollingId;
            synchronized (kdd0Var.d) {
                cne0 cne0Var = ((qwo0) kdd0Var.c).a;
                cne0Var.t("polling_execution_ids", v4r0.i(cne0Var.n("polling_execution_ids"), str));
            }
            kdd0Var.l(str);
            r0 r0Var = this.this$0.g;
            String str2 = this.$pollingId;
            do {
                value2 = r0Var.getValue();
            } while (!r0Var.k(value2, v4r0.f((Set) value2, str2)));
            return zy11.a;
        } catch (Throwable th) {
            r0 r0Var2 = this.this$0.g;
            String str3 = this.$pollingId;
            do {
                value = r0Var2.getValue();
            } while (!r0Var2.k(value, v4r0.f((Set) value, str3)));
            throw th;
        }
    }
}
