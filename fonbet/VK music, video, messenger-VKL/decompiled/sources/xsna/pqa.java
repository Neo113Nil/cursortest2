package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: CgTextureSource.kt */
@b6l(c = "com.vk.photo.editor.features.collage.gl.textures.CgTextureSource$1", f = "CgTextureSource.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class pqa extends SuspendLambda implements wzs<n1t, spj<? super s3q0>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ qqa this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pqa(qqa qqaVar, spj<? super pqa> spjVar) {
        super(2, spjVar);
        this.this$0 = qqaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        pqa pqaVar = new pqa(this.this$0, spjVar);
        pqaVar.L$0 = obj;
        return pqaVar;
    }

    @Override // xsna.wzs
    public final Object invoke(n1t n1tVar, spj<? super s3q0> spjVar) {
        return ((pqa) create(n1tVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        n1t n1tVar = (n1t) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        qqa qqaVar = this.this$0;
        if (n1tVar == null) {
            n1tVar = (n1t) n1t.m.getValue();
        }
        qcy<Object>[] qcyVarArr = qqa.m;
        qqaVar.k = n1tVar;
        qqaVar.l = true;
        return s3q0.a;
    }
}
