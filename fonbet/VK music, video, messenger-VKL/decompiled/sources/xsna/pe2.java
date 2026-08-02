package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AndroidVkUiEditText.kt */
@b6l(c = "com.vk.newsfeed.posting.poll_editor.presentation.base.view.components.AndroidVkUiEditTextKt$scrollToTextField$2", f = "AndroidVkUiEditText.kt", l = {170}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class pe2 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ tny $inputCoordinates;
    final /* synthetic */ yc8 $requester;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pe2(yc8 yc8Var, tny tnyVar, spj<? super pe2> spjVar) {
        super(2, spjVar);
        this.$requester = yc8Var;
        this.$inputCoordinates = tnyVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new pe2(this.$requester, this.$inputCoordinates, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((pe2) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            yc8 yc8Var = this.$requester;
            tny tnyVar = this.$inputCoordinates;
            zhf0 e = tnyVar != null ? p490.e(0L, pli.w(tnyVar.a())) : null;
            this.label = 1;
            if (yc8Var.a(e, this) == coroutineSingletons) {
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
