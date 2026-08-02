package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: TextFieldSelectionManager.kt */
@b6l(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$maybeSuggestSelection$1", f = "TextFieldSelectionManager.kt", l = {571}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class fho0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ uv70 $offsetMapping;
    final /* synthetic */ aua0 $platformSelectionBehaviors;
    final /* synthetic */ qko0 $selection;
    final /* synthetic */ String $text;
    final /* synthetic */ long $transformedSelection;
    int label;
    final /* synthetic */ gho0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fho0(aua0 aua0Var, String str, long j, qko0 qko0Var, gho0 gho0Var, uv70 uv70Var, spj<? super fho0> spjVar) {
        super(2, spjVar);
        this.$platformSelectionBehaviors = aua0Var;
        this.$text = str;
        this.$transformedSelection = j;
        this.$selection = qko0Var;
        this.this$0 = gho0Var;
        this.$offsetMapping = uv70Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new fho0(this.$platformSelectionBehaviors, this.$text, this.$transformedSelection, this.$selection, this.this$0, this.$offsetMapping, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((fho0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            aua0 aua0Var = this.$platformSelectionBehaviors;
            String str = this.$text;
            long j = this.$transformedSelection;
            this.label = 1;
            obj = aua0Var.c(str, j, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        qko0 qko0Var = (qko0) obj;
        if (qko0Var == null) {
            return s3q0.a;
        }
        uv70 uv70Var = this.$offsetMapping;
        long j2 = qko0Var.a;
        long c = jgz.c(uv70Var.a((int) (j2 >> 32)), uv70Var.a((int) (j2 & 4294967295L)));
        if (!qko0.a(c, this.$selection) && epx.f(this.this$0.p().a.c, this.$text)) {
            uv70 uv70Var2 = this.$offsetMapping;
            gho0 gho0Var = this.this$0;
            if (uv70Var2 == gho0Var.b) {
                gho0Var.c.invoke(gho0.g(gho0Var.p().a, c));
                this.this$0.x = new qko0(c);
            }
        }
        return s3q0.a;
    }
}
