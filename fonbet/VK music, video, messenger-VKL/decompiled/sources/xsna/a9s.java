package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: FormatsViewController.kt */
@b6l(c = "com.vk.photo.editor.features.collage.controller.FormatsViewController$2", f = "FormatsViewController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class a9s extends SuspendLambda implements wzs<com.vk.photo.editor.ivm.collage.c, spj<? super s3q0>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b9s this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9s(b9s b9sVar, spj<? super a9s> spjVar) {
        super(2, spjVar);
        this.this$0 = b9sVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        a9s a9sVar = new a9s(this.this$0, spjVar);
        a9sVar.L$0 = obj;
        return a9sVar;
    }

    @Override // xsna.wzs
    public final Object invoke(com.vk.photo.editor.ivm.collage.c cVar, spj<? super s3q0> spjVar) {
        return ((a9s) create(cVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        com.vk.photo.editor.ivm.collage.c cVar = (com.vk.photo.editor.ivm.collage.c) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        b9s b9sVar = this.this$0;
        if (b9sVar.a == null) {
            return s3q0.a;
        }
        b9sVar.b.submitList(cVar.c);
        return s3q0.a;
    }
}
