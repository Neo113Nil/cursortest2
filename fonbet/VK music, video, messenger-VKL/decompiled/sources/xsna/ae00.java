package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MainContent.kt */
@b6l(c = "com.vk.clips.attachments.impl.publish.geolocation.presentation.view.MainContentKt$SearchItem$6$1", f = "MainContent.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class ae00 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ qc8 $inputRelocator;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae00(qc8 qc8Var, spj<? super ae00> spjVar) {
        super(2, spjVar);
        this.$inputRelocator = qc8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ae00(this.$inputRelocator, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ae00) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        this.$inputRelocator.a();
        return s3q0.a;
    }
}
