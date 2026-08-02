package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.io40;

/* compiled from: MusicMixTextureSource.kt */
@b6l(c = "com.vk.music.view.vkmix.gl.textures.MusicMixTextureSource$1", f = "MusicMixTextureSource.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class go40 extends SuspendLambda implements wzs<io40.a, spj<? super s3q0>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ io40 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public go40(io40 io40Var, spj<? super go40> spjVar) {
        super(2, spjVar);
        this.this$0 = io40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        go40 go40Var = new go40(this.this$0, spjVar);
        go40Var.L$0 = obj;
        return go40Var;
    }

    @Override // xsna.wzs
    public final Object invoke(io40.a aVar, spj<? super s3q0> spjVar) {
        return ((go40) create(aVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        io40.a aVar = (io40.a) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        this.this$0.f = aVar;
        return s3q0.a;
    }
}
