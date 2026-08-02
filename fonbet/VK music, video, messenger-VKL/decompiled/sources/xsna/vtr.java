package xsna;

import java.util.NoSuchElementException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: Share.kt */
@b6l(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1", f = "Share.kt", l = {337}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class vtr extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ n7i<Result<ttk0<Object>>> $result;
    final /* synthetic */ ksr<Object> $upstream;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: Share.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ Ref$ObjectRef<xh50<T>> b;
        public final /* synthetic */ yvj c;
        public final /* synthetic */ n7i<Result<ttk0<T>>> d;

        public a(Ref$ObjectRef<xh50<T>> ref$ObjectRef, yvj yvjVar, n7i<Result<ttk0<T>>> n7iVar) {
            this.b = ref$ObjectRef;
            this.c = yvjVar;
            this.d = n7iVar;
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [T, xsna.utk0, xsna.xh50] */
        @Override // xsna.lsr
        public final Object emit(T t, spj<? super s3q0> spjVar) {
            Ref$ObjectRef<xh50<T>> ref$ObjectRef = this.b;
            xh50<T> xh50Var = ref$ObjectRef.element;
            if (xh50Var != null) {
                xh50Var.setValue(t);
            } else {
                ?? r3 = (T) vtk0.a(t);
                this.d.h(new Result<>(new b8f0(r3, iyx.f(this.c.getCoroutineContext()))));
                ref$ObjectRef.element = r3;
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vtr(ksr<Object> ksrVar, n7i<Result<ttk0<Object>>> n7iVar, spj<? super vtr> spjVar) {
        super(2, spjVar);
        this.$upstream = ksrVar;
        this.$result = n7iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        vtr vtrVar = new vtr(this.$upstream, this.$result, spjVar);
        vtrVar.L$0 = obj;
        return vtrVar;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((vtr) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref$ObjectRef ref$ObjectRef;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                yvj yvjVar = (yvj) this.L$0;
                Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                ksr<Object> ksrVar = this.$upstream;
                a aVar = new a(ref$ObjectRef2, yvjVar, this.$result);
                this.L$0 = ref$ObjectRef2;
                this.label = 1;
                if (ksrVar.collect(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                ref$ObjectRef = ref$ObjectRef2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ref$ObjectRef = (Ref$ObjectRef) this.L$0;
                kotlin.a.a(obj);
            }
            if (ref$ObjectRef.element == 0) {
                this.$result.h(new Result<>(new Result.Failure(new NoSuchElementException("Flow is empty"))));
            }
            return s3q0.a;
        } catch (Throwable th) {
            this.$result.A(th);
            throw th;
        }
    }
}
