package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: CoreTextField.kt */
@b6l(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1", f = "CoreTextField.kt", l = {363}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class fuj extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ rnw $imeOptions;
    final /* synthetic */ gho0 $manager;
    final /* synthetic */ j1z $state;
    final /* synthetic */ mio0 $textInputService;
    final /* synthetic */ mtk0<Boolean> $writeable$delegate;
    int label;

    /* compiled from: CoreTextField.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ j1z b;
        public final /* synthetic */ mio0 c;
        public final /* synthetic */ gho0 d;
        public final /* synthetic */ rnw e;

        public a(j1z j1zVar, mio0 mio0Var, gho0 gho0Var, rnw rnwVar) {
            this.b = j1zVar;
            this.c = mio0Var;
            this.d = gho0Var;
            this.e = rnwVar;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            j1z j1zVar = this.b;
            if (booleanValue && j1zVar.b()) {
                gho0 gho0Var = this.d;
                kuj.g(this.c, j1zVar, gho0Var.p(), this.e, gho0Var.b);
            } else {
                kuj.e(j1zVar);
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fuj(j1z j1zVar, mtk0<Boolean> mtk0Var, mio0 mio0Var, gho0 gho0Var, rnw rnwVar, spj<? super fuj> spjVar) {
        super(2, spjVar);
        this.$state = j1zVar;
        this.$writeable$delegate = mtk0Var;
        this.$textInputService = mio0Var;
        this.$manager = gho0Var;
        this.$imeOptions = rnwVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new fuj(this.$state, this.$writeable$delegate, this.$textInputService, this.$manager, this.$imeOptions, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((fuj) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                izg0 M = nr2.M(new x3i(this.$writeable$delegate, 4));
                a aVar = new a(this.$state, this.$textInputService, this.$manager, this.$imeOptions);
                this.label = 1;
                if (M.collect(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            kuj.e(this.$state);
            return s3q0.a;
        } catch (Throwable th) {
            kuj.e(this.$state);
            throw th;
        }
    }
}
