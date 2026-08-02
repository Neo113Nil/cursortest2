package com.yandex.mob.domain;

import com.yandex.mob.reporting.MobTrigger;
import defpackage.dq20;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mob.domain.DetailReportUseCase$tryToRestoreReporting$2", f = "DetailReportUseCase.kt", l = {HProv.ALG_SID_SHA3_384}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class DetailReportUseCase$tryToRestoreReporting$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<dq20> $cachedHosts;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailReportUseCase$tryToRestoreReporting$2(h hVar, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
        this.$cachedHosts = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DetailReportUseCase$tryToRestoreReporting$2(this.this$0, this.$cachedHosts, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DetailReportUseCase$tryToRestoreReporting$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            h hVar = this.this$0;
            MobTrigger mobTrigger = MobTrigger.PendingTrigger;
            List<dq20> list = this.$cachedHosts;
            this.label = 1;
            if (hVar.c(mobTrigger, list, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
