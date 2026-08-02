package xsna;

import com.vk.photo.editor.ivm.EditorMessage;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AutoEnhanceViewModel.kt */
@b6l(c = "com.vk.photo.editor.features.auto.AutoEnhanceViewModel$handeUserIntensityValue$1", f = "AutoEnhanceViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class jg5 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ float $intensity;
    int label;
    final /* synthetic */ ig5 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jg5(ig5 ig5Var, float f, spj<? super jg5> spjVar) {
        super(2, spjVar);
        this.this$0 = ig5Var;
        this.$intensity = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new jg5(this.this$0, this.$intensity, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((jg5) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        com.vk.photo.editor.ivm.d dVar = this.this$0.b;
        if (dVar == null) {
            dVar = null;
        }
        dVar.a(new EditorMessage.i(new ag5(this.$intensity), EditorMessage.Source.UserInput, 4));
        return s3q0.a;
    }
}
