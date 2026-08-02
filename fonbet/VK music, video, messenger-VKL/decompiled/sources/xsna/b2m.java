package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: DescriptionInputForm.kt */
@b6l(c = "com.vk.profile.user.impl.ui.edit.mvi.view.main.settings.name.DescriptionInputFormKt$DescriptionInputForm$5$1", f = "DescriptionInputForm.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class b2m extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ qc8 $descriptionRelocator;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2m(qc8 qc8Var, spj<? super b2m> spjVar) {
        super(2, spjVar);
        this.$descriptionRelocator = qc8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new b2m(this.$descriptionRelocator, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((b2m) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        this.$descriptionRelocator.a();
        return s3q0.a;
    }
}
