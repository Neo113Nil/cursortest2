package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: SolidColorTextureSource.kt */
@b6l(c = "com.vk.photo.editor.features.collage.gl.textures.SolidColorTextureSource$1", f = "SolidColorTextureSource.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class tek0 extends SuspendLambda implements wzs<Integer, spj<? super s3q0>, Object> {
    /* synthetic */ int I$0;
    int label;
    final /* synthetic */ uek0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tek0(uek0 uek0Var, spj<? super tek0> spjVar) {
        super(2, spjVar);
        this.this$0 = uek0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        tek0 tek0Var = new tek0(this.this$0, spjVar);
        tek0Var.I$0 = ((Number) obj).intValue();
        return tek0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Integer num, spj<? super s3q0> spjVar) {
        return ((tek0) create(Integer.valueOf(num.intValue()), spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.I$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        uek0 uek0Var = this.this$0;
        qcy<Object>[] qcyVarArr = uek0.j;
        uek0Var.h = i;
        uek0Var.i = true;
        this.this$0.i = true;
        return s3q0.a;
    }
}
