package xsna;

import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: DebugFileManagerScreen.kt */
@b6l(c = "com.vk.debug.design.DebugFileManagerScreenKt$DebugFileManagerScreen$3$1", f = "DebugFileManagerScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class r5l extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ wh50<String> $currentPath$delegate;
    final /* synthetic */ wh50<List<s8r>> $entries$delegate;
    final /* synthetic */ wh50<Boolean> $isLoading$delegate;
    final /* synthetic */ wzs<String, izs<? super List<s8r>, s3q0>, s3q0> $loadDirectory;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r5l(wzs<? super String, ? super izs<? super List<s8r>, s3q0>, s3q0> wzsVar, wh50<Boolean> wh50Var, wh50<String> wh50Var2, wh50<List<s8r>> wh50Var3, spj<? super r5l> spjVar) {
        super(2, spjVar);
        this.$loadDirectory = wzsVar;
        this.$isLoading$delegate = wh50Var;
        this.$currentPath$delegate = wh50Var2;
        this.$entries$delegate = wh50Var3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new r5l(this.$loadDirectory, this.$isLoading$delegate, this.$currentPath$delegate, this.$entries$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((r5l) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        this.$isLoading$delegate.setValue(Boolean.TRUE);
        this.$loadDirectory.invoke(this.$currentPath$delegate.getValue(), new bi0(14, this.$entries$delegate, this.$isLoading$delegate));
        return s3q0.a;
    }
}
