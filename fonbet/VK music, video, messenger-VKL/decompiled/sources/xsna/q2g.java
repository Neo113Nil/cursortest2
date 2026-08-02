package xsna;

import android.widget.ImageButton;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: CollageTool.kt */
@b6l(c = "com.vk.photo.editor.features.collage.CollageTool$4", f = "CollageTool.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class q2g extends SuspendLambda implements wzs<com.vk.photo.editor.ivm.collage.c, spj<? super s3q0>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ r2g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2g(r2g r2gVar, spj<? super q2g> spjVar) {
        super(2, spjVar);
        this.this$0 = r2gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        q2g q2gVar = new q2g(this.this$0, spjVar);
        q2gVar.L$0 = obj;
        return q2gVar;
    }

    @Override // xsna.wzs
    public final Object invoke(com.vk.photo.editor.ivm.collage.c cVar, spj<? super s3q0> spjVar) {
        return ((q2g) create(cVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        com.vk.photo.editor.ivm.collage.c cVar = (com.vk.photo.editor.ivm.collage.c) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        ImageButton imageButton = this.this$0.o;
        if (imageButton != null) {
            imageButton.setVisibility(cVar.h == null ? 4 : 0);
        }
        k3g k3gVar = this.this$0.v;
        if (k3gVar != null) {
            k3gVar.f(cVar.h);
        }
        return s3q0.a;
    }
}
