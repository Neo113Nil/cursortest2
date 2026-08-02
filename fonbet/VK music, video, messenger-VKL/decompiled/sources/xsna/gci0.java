package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: SelectionContainer.kt */
@b6l(c = "androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$3$1$1", f = "SelectionContainer.kt", l = {108}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class gci0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ wfd $clipboard;
    final /* synthetic */ us2 $textToCopy;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gci0(wfd wfdVar, us2 us2Var, spj<? super gci0> spjVar) {
        super(2, spjVar);
        this.$clipboard = wfdVar;
        this.$textToCopy = us2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new gci0(this.$clipboard, this.$textToCopy, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((gci0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            wfd wfdVar = this.$clipboard;
            nvc a = yfd.a(this.$textToCopy);
            this.label = 1;
            if (wfdVar.c(a) == coroutineSingletons) {
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
