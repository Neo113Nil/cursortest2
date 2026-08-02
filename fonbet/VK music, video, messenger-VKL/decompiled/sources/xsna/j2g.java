package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: CollageTextureSource.kt */
@b6l(c = "com.vk.photo.editor.features.collage.gl.textures.CollageTextureSource$2", f = "CollageTextureSource.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class j2g extends SuspendLambda implements wzs<ag5, spj<? super s3q0>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ l2g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2g(l2g l2gVar, spj<? super j2g> spjVar) {
        super(2, spjVar);
        this.this$0 = l2gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        j2g j2gVar = new j2g(this.this$0, spjVar);
        j2gVar.L$0 = obj;
        return j2gVar;
    }

    @Override // xsna.wzs
    public final Object invoke(ag5 ag5Var, spj<? super s3q0> spjVar) {
        return ((j2g) create(ag5Var, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ag5 ag5Var = (ag5) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        l2g l2gVar = this.this$0;
        float f = ag5Var != null ? ag5Var.a : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        qcy<Object>[] qcyVarArr = l2g.x;
        l2gVar.s = f / 100.0f;
        l2gVar.t = true;
        return s3q0.a;
    }
}
