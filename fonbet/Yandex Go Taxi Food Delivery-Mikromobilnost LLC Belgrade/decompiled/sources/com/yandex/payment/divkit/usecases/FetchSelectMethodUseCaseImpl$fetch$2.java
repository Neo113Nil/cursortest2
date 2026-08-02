package com.yandex.payment.divkit.usecases;

import com.yandex.xplat.payment.sdk.DivCardForAnalytics;
import defpackage.dtf;
import defpackage.iho;
import defpackage.lwq;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qv90;
import defpackage.sv90;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONObject;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lorg/json/JSONObject;", "<anonymous>", "(Ltse;)Lorg/json/JSONObject;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.payment.divkit.usecases.FetchSelectMethodUseCaseImpl$fetch$2", f = "FetchSelectMethodUsecase.kt", l = {74, HProv.ALG_SID_SHA3_256}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
final class FetchSelectMethodUseCaseImpl$fetch$2 extends SuspendLambda implements wls {
    final /* synthetic */ dtf $methods;
    Object L$0;
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchSelectMethodUseCaseImpl$fetch$2(l lVar, dtf dtfVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = lVar;
        this.$methods = dtfVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FetchSelectMethodUseCaseImpl$fetch$2(this.this$0, this.$methods, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FetchSelectMethodUseCaseImpl$fetch$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
    
        if (r6 != r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (Throwable th) {
            sv90 sv90Var = qv90.a;
            DivCardForAnalytics divCardForAnalytics = DivCardForAnalytics.SELECT;
            sv90Var.getClass();
            iho.b(sv90.f0(divCardForAnalytics), th.getMessage(), 2).c();
            l lVar = this.this$0;
            dtf dtfVar = this.$methods;
            this.L$0 = null;
            this.label = 2;
            obj = lVar.a(dtfVar);
        }
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.payment.divkit.repository.a aVar = this.this$0.a;
            JSONObject a = lwq.a(this.$methods);
            this.label = 1;
            obj = aVar.a(a, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return (JSONObject) obj;
            }
            kotlin.b.b(obj);
        }
        return (JSONObject) obj;
    }
}
