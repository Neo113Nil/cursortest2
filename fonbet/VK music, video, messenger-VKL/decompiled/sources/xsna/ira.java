package xsna;

import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;

/* compiled from: PlatformTextInputModifierNode.kt */
@b6l(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3", f = "PlatformTextInputModifierNode.kt", l = {237}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class ira extends SuspendLambda implements wzs<s3q0, spj<?>, Object> {
    final /* synthetic */ qua0 $parentSession;
    final /* synthetic */ jua0 $request;
    int label;
    final /* synthetic */ kra this$0;

    /* compiled from: PlatformTextInputModifierNode.kt */
    public static final class a extends Lambda implements gzs<iua0> {
        final /* synthetic */ kra this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kra kraVar) {
            super(0);
            this.this$0 = kraVar;
        }

        @Override // xsna.gzs
        public final iua0 invoke() {
            this.this$0.getClass();
            throw null;
        }
    }

    /* compiled from: PlatformTextInputModifierNode.kt */
    @b6l(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3$2", f = "PlatformTextInputModifierNode.kt", l = {238}, m = "invokeSuspend", v = 1)
    public static final class b extends SuspendLambda implements wzs<iua0, spj<? super s3q0>, Object> {
        final /* synthetic */ qua0 $parentSession;
        final /* synthetic */ jua0 $request;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(jua0 jua0Var, qua0 qua0Var, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$request = jua0Var;
            this.$parentSession = qua0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            b bVar = new b(this.$request, this.$parentSession, spjVar);
            bVar.L$0 = obj;
            return bVar;
        }

        @Override // xsna.wzs
        public final Object invoke(iua0 iua0Var, spj<? super s3q0> spjVar) {
            return ((b) create(iua0Var, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                iua0 iua0Var = (iua0) this.L$0;
                this.label = 1;
                if (iua0Var.a() == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ira(kra kraVar, jua0 jua0Var, qua0 qua0Var, spj<? super ira> spjVar) {
        super(2, spjVar);
        this.this$0 = kraVar;
        this.$request = jua0Var;
        this.$parentSession = qua0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ira(this.this$0, this.$request, this.$parentSession, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(s3q0 s3q0Var, spj<?> spjVar) {
        return ((ira) create(s3q0Var, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            izg0 M = nr2.M(new a(this.this$0));
            b bVar = new b(this.$request, this.$parentSession, null);
            this.label = 1;
            if (rsr.k(M, bVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        throw new IllegalStateException("Interceptors flow should never terminate.");
    }
}
