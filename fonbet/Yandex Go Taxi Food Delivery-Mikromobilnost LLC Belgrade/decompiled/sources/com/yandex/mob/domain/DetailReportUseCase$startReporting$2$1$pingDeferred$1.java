package com.yandex.mob.domain;

import defpackage.cma1;
import defpackage.dq20;
import defpackage.ljo;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lcom/yandex/mob/api/network/PingResult;", "<anonymous>", "(Ltse;)Ljava/lang/String;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mob.domain.DetailReportUseCase$startReporting$2$1$pingDeferred$1", f = "DetailReportUseCase.kt", l = {HProv.PP_HASHOID}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class DetailReportUseCase$startReporting$2$1$pingDeferred$1 extends SuspendLambda implements wls {
    final /* synthetic */ dq20 $entry;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailReportUseCase$startReporting$2$1$pingDeferred$1(h hVar, dq20 dq20Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
        this.$entry = dq20Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DetailReportUseCase$startReporting$2$1$pingDeferred$1(this.this$0, this.$entry, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DetailReportUseCase$startReporting$2$1$pingDeferred$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        com.yandex.mob.k kVar = this.this$0.b;
        String str = this.$entry.b;
        this.label = 1;
        kotlinx.coroutines.sync.a aVar = com.yandex.mob.p.a;
        try {
            b = kotlin.collections.a.X(cma1.t0(new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("ping -c 1 ".concat(str)).getInputStream()))), "\n", null, null, null, 62);
        } catch (Throwable th) {
            b = ljo.b(th);
        }
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
