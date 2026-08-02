package xsna;

import java.util.Iterator;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: GamesCatalogEventBusImpl.kt */
@b6l(c = "com.vk.games.event.GamesCatalogEventBusImpl$1", f = "GamesCatalogEventBusImpl.kt", l = {28}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class mbt extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ rbt this$0;

    /* compiled from: GamesCatalogEventBusImpl.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ rbt b;

        public a(rbt rbtVar) {
            this.b = rbtVar;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            sct sctVar = (sct) obj;
            Iterator<T> it = this.b.d.iterator();
            while (it.hasNext()) {
                ((izs) it.next()).invoke(sctVar);
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mbt(rbt rbtVar, spj<? super mbt> spjVar) {
        super(2, spjVar);
        this.this$0 = rbtVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new mbt(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((mbt) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            rbt rbtVar = this.this$0;
            caj0 caj0Var = rbtVar.c;
            a aVar = new a(rbtVar);
            this.label = 1;
            caj0Var.getClass();
            if (caj0.k(caj0Var, aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        throw new KotlinNothingValueException();
    }
}
