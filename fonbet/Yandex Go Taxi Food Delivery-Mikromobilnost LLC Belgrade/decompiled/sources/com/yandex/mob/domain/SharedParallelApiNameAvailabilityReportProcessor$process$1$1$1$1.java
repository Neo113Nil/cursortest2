package com.yandex.mob.domain;

import defpackage.lq20;
import defpackage.mq20;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oq20;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lmq20;", "<anonymous>", "(Ltse;)Lmq20;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mob.domain.SharedParallelApiNameAvailabilityReportProcessor$process$1$1$1$1", f = "SharedParallelApiNameAvailabilityReportProcessor.kt", l = {HProv.ALG_SID_NO_HASH}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class SharedParallelApiNameAvailabilityReportProcessor$process$1$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $dedupKey;
    final /* synthetic */ ConcurrentHashMap<String, mq20> $hostResults;
    final /* synthetic */ oq20 $mobQueryParams;
    final /* synthetic */ Map<String, List<Pair<String, lq20>>> $proxiesToCheck;
    int I$0;
    Object L$0;
    int label;
    final /* synthetic */ t this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedParallelApiNameAvailabilityReportProcessor$process$1$1$1$1(ConcurrentHashMap concurrentHashMap, String str, Map map, t tVar, oq20 oq20Var, Continuation continuation) {
        super(2, continuation);
        this.$hostResults = concurrentHashMap;
        this.$dedupKey = str;
        this.$proxiesToCheck = map;
        this.this$0 = tVar;
        this.$mobQueryParams = oq20Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SharedParallelApiNameAvailabilityReportProcessor$process$1$1$1$1(this.$hostResults, this.$dedupKey, this.$proxiesToCheck, this.this$0, this.$mobQueryParams, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SharedParallelApiNameAvailabilityReportProcessor$process$1$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Pair pair;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            mq20 mq20Var = this.$hostResults.get(this.$dedupKey);
            if (mq20Var != null) {
                return mq20Var;
            }
            List<Pair<String, lq20>> list = this.$proxiesToCheck.get(this.$dedupKey);
            if (list == null || (pair = (Pair) kotlin.collections.a.R(list)) == null) {
                return null;
            }
            t tVar = this.this$0;
            oq20 oq20Var = this.$mobQueryParams;
            lq20 lq20Var = (lq20) pair.getSecond();
            this.L$0 = null;
            this.I$0 = 0;
            this.label = 1;
            obj = t.a(tVar, oq20Var, lq20Var, this);
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
        return (mq20) obj;
    }
}
