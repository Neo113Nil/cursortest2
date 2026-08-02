package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: CollageTextureSource.kt */
@b6l(c = "com.vk.photo.editor.features.collage.gl.textures.CollageTextureSource$3", f = "CollageTextureSource.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class k2g extends SuspendLambda implements wzs<n1t, spj<? super s3q0>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ l2g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2g(l2g l2gVar, spj<? super k2g> spjVar) {
        super(2, spjVar);
        this.this$0 = l2gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        k2g k2gVar = new k2g(this.this$0, spjVar);
        k2gVar.L$0 = obj;
        return k2gVar;
    }

    @Override // xsna.wzs
    public final Object invoke(n1t n1tVar, spj<? super s3q0> spjVar) {
        return ((k2g) create(n1tVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        n1t n1tVar = (n1t) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        l2g l2gVar = this.this$0;
        float f = n1tVar != null ? n1tVar.f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        qcy<Object>[] qcyVarArr = l2g.x;
        l2gVar.u = f;
        l2gVar.v = true;
        return s3q0.a;
    }
}
