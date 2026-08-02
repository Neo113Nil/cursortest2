package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: RoomDatabase.android.kt */
@b6l(c = "androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1", f = "RoomDatabase.android.kt", l = {2015}, m = "invokeSuspend")
/* loaded from: classes12.dex */
public final class amg0 extends SuspendLambda implements wzs<yvj, spj<Object>, Object> {
    final /* synthetic */ izs<spj<Object>, Object> $block;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public amg0(izs<? super spj<Object>, ? extends Object> izsVar, spj<? super amg0> spjVar) {
        super(2, spjVar);
        this.$block = izsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        amg0 amg0Var = new amg0(this.$block, spjVar);
        amg0Var.L$0 = obj;
        return amg0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<Object> spjVar) {
        return ((amg0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        uip0 uip0Var;
        Throwable th;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            uip0 uip0Var2 = (uip0) ((yvj) this.L$0).getCoroutineContext().get(uip0.d);
            uip0Var2.c.incrementAndGet();
            try {
                izs<spj<Object>, Object> izsVar = this.$block;
                this.L$0 = uip0Var2;
                this.label = 1;
                Object invoke = izsVar.invoke(this);
                if (invoke == coroutineSingletons) {
                    return coroutineSingletons;
                }
                uip0Var = uip0Var2;
                obj = invoke;
            } catch (Throwable th2) {
                uip0Var = uip0Var2;
                th = th2;
                if (uip0Var.c.decrementAndGet() < 0) {
                    throw th;
                }
                throw new IllegalStateException("Transaction was never started or was already released.");
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uip0Var = (uip0) this.L$0;
            try {
                kotlin.a.a(obj);
            } catch (Throwable th3) {
                th = th3;
                if (uip0Var.c.decrementAndGet() < 0) {
                }
            }
        }
        if (uip0Var.c.decrementAndGet() >= 0) {
            return obj;
        }
        throw new IllegalStateException("Transaction was never started or was already released.");
    }
}
