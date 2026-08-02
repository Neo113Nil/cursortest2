package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: CollageTool.kt */
@b6l(c = "com.vk.photo.editor.features.collage.CollageTool$2", f = "CollageTool.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class o2g extends SuspendLambda implements wzs<ag5, spj<? super s3q0>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ r2g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2g(r2g r2gVar, spj<? super o2g> spjVar) {
        super(2, spjVar);
        this.this$0 = r2gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        o2g o2gVar = new o2g(this.this$0, spjVar);
        o2gVar.L$0 = obj;
        return o2gVar;
    }

    @Override // xsna.wzs
    public final Object invoke(ag5 ag5Var, spj<? super s3q0> spjVar) {
        return ((o2g) create(ag5Var, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ag5 ag5Var = (ag5) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        k3g k3gVar = this.this$0.v;
        if (k3gVar != null && k3gVar.getVisibility() == 0) {
            l1t l1tVar = k3gVar.x;
            if (l1tVar == null) {
                l1tVar = null;
            }
            l1tVar.b(ag5Var);
        }
        return s3q0.a;
    }
}
