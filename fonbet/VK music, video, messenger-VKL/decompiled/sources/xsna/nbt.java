package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.sct;

/* compiled from: GamesCatalogEventBusImpl.kt */
@b6l(c = "com.vk.games.event.GamesCatalogEventBusImpl$deleteGame$1", f = "GamesCatalogEventBusImpl.kt", l = {79}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class nbt extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ long $appId;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ rbt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nbt(rbt rbtVar, long j, spj<? super nbt> spjVar) {
        super(2, spjVar);
        this.this$0 = rbtVar;
        this.$appId = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        nbt nbtVar = new nbt(this.this$0, this.$appId, spjVar);
        nbtVar.L$0 = obj;
        return nbtVar;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((nbt) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                rbt rbtVar = this.this$0;
                long j = this.$appId;
                kdt kdtVar = rbtVar.a;
                this.L$0 = null;
                this.L$1 = null;
                this.I$0 = 0;
                this.label = 1;
                if (kdtVar.f(j, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            failure = s3q0.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        rbt rbtVar2 = this.this$0;
        long j2 = this.$appId;
        if (!(failure instanceof Result.Failure)) {
            rbtVar2.c.e(new sct.b(j2, true));
        }
        rbt rbtVar3 = this.this$0;
        long j3 = this.$appId;
        if (Result.a(failure) != null) {
            rbtVar3.c.e(new sct.b(j3, false));
        }
        return s3q0.a;
    }
}
