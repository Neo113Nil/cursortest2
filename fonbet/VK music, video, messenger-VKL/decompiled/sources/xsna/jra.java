package xsna;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PlatformTextInputModifierNode.kt */
@b6l(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2", f = "PlatformTextInputModifierNode.kt", l = {248}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class jra extends SuspendLambda implements wzs<qua0, spj<?>, Object> {
    final /* synthetic */ wzs<qua0, spj<?>, Object> $session;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ kra this$0;

    /* compiled from: PlatformTextInputModifierNode.kt */
    public static final class a implements qua0 {
        public final /* synthetic */ qua0 b;
        public final /* synthetic */ qua0 c;
        public final /* synthetic */ AtomicReference<jui0<s3q0>> d;
        public final /* synthetic */ kra e;

        public a(qua0 qua0Var, AtomicReference<jui0<s3q0>> atomicReference, kra kraVar) {
            this.c = qua0Var;
            this.d = atomicReference;
            this.e = kraVar;
            this.b = qua0Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // xsna.pua0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final CoroutineSingletons a(k1z k1zVar, ContinuationImpl continuationImpl) {
            gra graVar;
            int i;
            if (continuationImpl instanceof gra) {
                graVar = (gra) continuationImpl;
                int i2 = graVar.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    graVar.label = i2 - Integer.MIN_VALUE;
                    Object obj = graVar.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = graVar.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        ira iraVar = new ira(this.e, k1zVar, this.c, null);
                        graVar.label = 1;
                        if (zvj.d(new kui0(hra.i, this.d, iraVar, null), graVar) == coroutineSingletons) {
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
            graVar = new gra(this, continuationImpl);
            Object obj2 = graVar.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = graVar.label;
            if (i != 0) {
            }
            throw new KotlinNothingValueException();
        }

        @Override // xsna.yvj
        public final kotlin.coroutines.d getCoroutineContext() {
            return this.b.getCoroutineContext();
        }

        @Override // xsna.pua0
        public final View getView() {
            return this.b.getView();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public jra(wzs<? super qua0, ? super spj<?>, ? extends Object> wzsVar, kra kraVar, spj<? super jra> spjVar) {
        super(2, spjVar);
        this.$session = wzsVar;
        this.this$0 = kraVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        jra jraVar = new jra(this.$session, this.this$0, spjVar);
        jraVar.L$0 = obj;
        return jraVar;
    }

    @Override // xsna.wzs
    public final Object invoke(qua0 qua0Var, spj<?> spjVar) {
        return ((jra) create(qua0Var, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            a aVar = new a((qua0) this.L$0, new AtomicReference(null), this.this$0);
            wzs<qua0, spj<?>, Object> wzsVar = this.$session;
            this.label = 1;
            if (wzsVar.invoke(aVar, this) == coroutineSingletons) {
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
