package xsna;

import android.view.textclassifier.TextClassifier;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PlatformSelectionBehaviors.android.kt */
@b6l(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2", f = "PlatformSelectionBehaviors.android.kt", l = {172}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class cua0 extends SuspendLambda implements wzs<TextClassifier, spj<? super s3q0>, Object> {
    final /* synthetic */ long $selection;
    final /* synthetic */ CharSequence $text;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ fua0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cua0(long j, CharSequence charSequence, spj spjVar, fua0 fua0Var) {
        super(2, spjVar);
        this.this$0 = fua0Var;
        this.$text = charSequence;
        this.$selection = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        fua0 fua0Var = this.this$0;
        cua0 cua0Var = new cua0(this.$selection, this.$text, spjVar, fua0Var);
        cua0Var.L$0 = obj;
        return cua0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(TextClassifier textClassifier, spj<? super s3q0> spjVar) {
        return ((cua0) create(textClassifier, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            TextClassifier textClassifier = (TextClassifier) this.L$0;
            fua0 fua0Var = this.this$0;
            CharSequence charSequence = this.$text;
            long j = this.$selection;
            this.label = 1;
            if (fua0.d(fua0Var, charSequence, j, textClassifier, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
