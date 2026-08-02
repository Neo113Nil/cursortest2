package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: GridsViewController.kt */
@b6l(c = "com.vk.photo.editor.features.collage.controller.GridsViewController$2", f = "GridsViewController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ugu extends SuspendLambda implements wzs<com.vk.photo.editor.ivm.collage.c, spj<? super s3q0>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ vgu this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ugu(vgu vguVar, spj<? super ugu> spjVar) {
        super(2, spjVar);
        this.this$0 = vguVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        ugu uguVar = new ugu(this.this$0, spjVar);
        uguVar.L$0 = obj;
        return uguVar;
    }

    @Override // xsna.wzs
    public final Object invoke(com.vk.photo.editor.ivm.collage.c cVar, spj<? super s3q0> spjVar) {
        return ((ugu) create(cVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        com.vk.photo.editor.ivm.collage.c cVar = (com.vk.photo.editor.ivm.collage.c) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        vgu vguVar = this.this$0;
        if (vguVar.a == null) {
            return s3q0.a;
        }
        vguVar.c.submitList(cVar.a);
        vgu vguVar2 = this.this$0;
        fyt0.b(vguVar2.b, new defpackage.s(16, vguVar2, cVar));
        return s3q0.a;
    }
}
