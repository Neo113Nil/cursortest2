package xsna;

import androidx.room.RoomDatabase;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: RoomDatabase.android.kt */
/* loaded from: classes12.dex */
public final class ylg0 implements Runnable {
    public final /* synthetic */ kotlin.coroutines.d b;
    public final /* synthetic */ lq9 c;
    public final /* synthetic */ RoomDatabase d;
    public final /* synthetic */ amg0 e;

    /* compiled from: RoomDatabase.android.kt */
    @b6l(c = "androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1$1", f = "RoomDatabase.android.kt", l = {2048}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ kq9<Object> $continuation;
        final /* synthetic */ RoomDatabase $this_startTransactionCoroutine;
        final /* synthetic */ wzs<yvj, spj<Object>, Object> $transactionBlock;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(RoomDatabase roomDatabase, kq9<Object> kq9Var, wzs<? super yvj, ? super spj<Object>, ? extends Object> wzsVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$this_startTransactionCoroutine = roomDatabase;
            this.$continuation = kq9Var;
            this.$transactionBlock = wzsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(this.$this_startTransactionCoroutine, this.$continuation, this.$transactionBlock, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            spj spjVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                kotlin.coroutines.c cVar = (kotlin.coroutines.c) ((yvj) this.L$0).getCoroutineContext().get(c.a.b);
                RoomDatabase roomDatabase = this.$this_startTransactionCoroutine;
                uip0 uip0Var = new uip0(cVar);
                kotlin.coroutines.d plus = cVar.plus(uip0Var).plus(new aro0(Integer.valueOf(System.identityHashCode(uip0Var)), roomDatabase.j));
                kq9<Object> kq9Var = this.$continuation;
                wzs<yvj, spj<Object>, Object> wzsVar = this.$transactionBlock;
                this.L$0 = kq9Var;
                this.label = 1;
                obj = myc0.k(plus, wzsVar, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                spjVar = kq9Var;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                spjVar = (spj) this.L$0;
                kotlin.a.a(obj);
            }
            spjVar.resumeWith(obj);
            return s3q0.a;
        }
    }

    public ylg0(kotlin.coroutines.d dVar, lq9 lq9Var, RoomDatabase roomDatabase, amg0 amg0Var) {
        this.b = dVar;
        this.c = lq9Var;
        this.d = roomDatabase;
        this.e = amg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lq9 lq9Var = this.c;
        try {
            myc0.i(this.b.minusKey(c.a.b), new a(this.d, lq9Var, this.e, null));
        } catch (Throwable th) {
            lq9Var.z(th);
        }
    }
}
