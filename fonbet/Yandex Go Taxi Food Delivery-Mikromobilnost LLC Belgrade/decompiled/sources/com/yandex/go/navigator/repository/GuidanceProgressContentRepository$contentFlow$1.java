package com.yandex.go.navigator.repository;

import defpackage.h901;
import defpackage.hua1;
import defpackage.mg50;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sif0;
import defpackage.t1l0;
import defpackage.t7s;
import defpackage.zls;
import defpackage.zy11;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lt1l0;", "routeData", "Lh901;", "trafficLineContent", "Lsif0;", "<anonymous>", "(Lt1l0;Lh901;)Lsif0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.repository.GuidanceProgressContentRepository$contentFlow$1", f = "GuidanceProgressContentRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class GuidanceProgressContentRepository$contentFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuidanceProgressContentRepository$contentFlow$1(c cVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GuidanceProgressContentRepository$contentFlow$1 guidanceProgressContentRepository$contentFlow$1 = new GuidanceProgressContentRepository$contentFlow$1(this.this$0, (Continuation) obj3);
        guidanceProgressContentRepository$contentFlow$1.L$0 = (t1l0) obj;
        guidanceProgressContentRepository$contentFlow$1.L$1 = (h901) obj2;
        return guidanceProgressContentRepository$contentFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        t1l0 t1l0Var = (t1l0) this.L$0;
        h901 h901Var = (h901) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        double d = t1l0Var.a;
        double d2 = t1l0Var.b;
        String c = hua1.c(this.this$0.b, d);
        long j = (long) d2;
        String a = this.this$0.a.a(j);
        mg50 mg50Var = this.this$0.a;
        mg50Var.getClass();
        Calendar calendar = Calendar.getInstance();
        calendar.add(13, (int) d2);
        return new sif0(d, c, j, a, t7s.c(mg50Var.a, calendar, HProv.PP_SECURITY_LEVEL), t1l0Var.c / t1l0Var.d.size(), h901Var, this.this$0.c);
    }
}
