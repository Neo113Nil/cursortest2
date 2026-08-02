package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MusicMixTextureSource.kt */
@b6l(c = "com.vk.music.view.vkmix.gl.textures.MusicMixTextureSource$2", f = "MusicMixTextureSource.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ho40 extends SuspendLambda implements wzs<Float, spj<? super s3q0>, Object> {
    /* synthetic */ float F$0;
    int label;
    final /* synthetic */ io40 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ho40(io40 io40Var, spj<? super ho40> spjVar) {
        super(2, spjVar);
        this.this$0 = io40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        ho40 ho40Var = new ho40(this.this$0, spjVar);
        ho40Var.F$0 = ((Number) obj).floatValue();
        return ho40Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Float f, spj<? super s3q0> spjVar) {
        return ((ho40) create(Float.valueOf(f.floatValue()), spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        float f = this.F$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        this.this$0.h = new Float(f);
        return s3q0.a;
    }
}
