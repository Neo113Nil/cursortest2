package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: CollageTool.kt */
@b6l(c = "com.vk.photo.editor.features.collage.CollageTool$3", f = "CollageTool.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class p2g extends SuspendLambda implements wzs<com.vk.photo.editor.features.colorgrading.a, spj<? super s3q0>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ r2g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2g(r2g r2gVar, spj<? super p2g> spjVar) {
        super(2, spjVar);
        this.this$0 = r2gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        p2g p2gVar = new p2g(this.this$0, spjVar);
        p2gVar.L$0 = obj;
        return p2gVar;
    }

    @Override // xsna.wzs
    public final Object invoke(com.vk.photo.editor.features.colorgrading.a aVar, spj<? super s3q0> spjVar) {
        return ((p2g) create(aVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        com.vk.photo.editor.features.colorgrading.a aVar = (com.vk.photo.editor.features.colorgrading.a) this.L$0;
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
            l1tVar.m = aVar;
            o1t o1tVar = l1tVar.n;
            if (o1tVar != null) {
                l1tVar.t.setValue(aVar != null ? l1t.a(aVar, o1tVar) : null);
                l1tVar.a.b();
            }
        }
        return s3q0.a;
    }
}
