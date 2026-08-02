package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: LoadingTimeoutGuard.kt */
@b6l(c = "com.vk.core.concurrent.LoadingTimeoutGuard$start$1", f = "LoadingTimeoutGuard.kt", l = {20}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class stz extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ long $newSessionId;
    final /* synthetic */ long $timeoutMs;
    int label;
    final /* synthetic */ ttz this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public stz(long j, ttz ttzVar, long j2, spj<? super stz> spjVar) {
        super(2, spjVar);
        this.$timeoutMs = j;
        this.this$0 = ttzVar;
        this.$newSessionId = j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new stz(this.$timeoutMs, this.this$0, this.$newSessionId, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((stz) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            long j = this.$timeoutMs;
            this.label = 1;
            if (qsl.b(j, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        ttz ttzVar = this.this$0;
        long j2 = ttzVar.c;
        long j3 = this.$newSessionId;
        if (j2 == j3) {
            ttzVar.a.invoke(new Long(j3));
        }
        return s3q0.a;
    }
}
