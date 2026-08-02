package xsna;

import androidx.room.RoomDatabase;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: RoomDatabase.android.kt */
@b6l(c = "androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$withTransaction$2", f = "RoomDatabase.android.kt", l = {2001}, m = "invokeSuspend")
/* loaded from: classes12.dex */
public final class zlg0 extends SuspendLambda implements izs<spj<Object>, Object> {
    final /* synthetic */ izs<spj<Object>, Object> $block;
    final /* synthetic */ RoomDatabase $this_withTransaction;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public zlg0(RoomDatabase roomDatabase, izs<? super spj<Object>, ? extends Object> izsVar, spj<? super zlg0> spjVar) {
        super(1, spjVar);
        this.$this_withTransaction = roomDatabase;
        this.$block = izsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new zlg0(this.$this_withTransaction, this.$block, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<Object> spjVar) {
        return ((zlg0) create(spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                this.$this_withTransaction.c();
                izs<spj<Object>, Object> izsVar = this.$block;
                this.label = 1;
                obj = izsVar.invoke(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            this.$this_withTransaction.w();
            return obj;
        } finally {
            this.$this_withTransaction.q();
        }
    }
}
