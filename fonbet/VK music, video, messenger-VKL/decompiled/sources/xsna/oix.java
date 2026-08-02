package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: InternalModalBottomSheet.kt */
@b6l(c = "com.vk.core.compose.component.internal.InternalModalBottomSheetKt$SheetSurface$4$1", f = "InternalModalBottomSheet.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class oix extends SuspendLambda implements yzs<yvj, Float, spj<? super s3q0>, Object> {
    final /* synthetic */ fw20 $params;
    /* synthetic */ float F$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oix(fw20 fw20Var, spj<? super oix> spjVar) {
        super(3, spjVar);
        this.$params = fw20Var;
    }

    @Override // xsna.yzs
    public final Object invoke(yvj yvjVar, Float f, spj<? super s3q0> spjVar) {
        float floatValue = f.floatValue();
        oix oixVar = new oix(this.$params, spjVar);
        oixVar.F$0 = floatValue;
        return oixVar.invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        this.$params.d.invoke(new Float(this.F$0));
        return s3q0.a;
    }
}
