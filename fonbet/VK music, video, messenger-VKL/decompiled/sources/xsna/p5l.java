package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: DebugFileManagerScreen.kt */
@b6l(c = "com.vk.debug.design.DebugFileManagerScreenKt$DebugFileManagerScreen$1$1", f = "DebugFileManagerScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class p5l extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ boolean $isAtBoundary;
    final /* synthetic */ izs<Boolean, s3q0> $onBoundaryStateChanged;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5l(spj spjVar, izs izsVar, boolean z) {
        super(2, spjVar);
        this.$onBoundaryStateChanged = izsVar;
        this.$isAtBoundary = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new p5l(spjVar, this.$onBoundaryStateChanged, this.$isAtBoundary);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((p5l) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        izs<Boolean, s3q0> izsVar = this.$onBoundaryStateChanged;
        if (izsVar != null) {
            izsVar.invoke(Boolean.valueOf(this.$isAtBoundary));
        }
        return s3q0.a;
    }
}
