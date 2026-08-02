package xsna;

import com.vk.photo.editor.ivm.collage.CollageMessage;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: BorderViewController.kt */
@b6l(c = "com.vk.photo.editor.features.collage.controller.BorderViewController$10", f = "BorderViewController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class b28 extends SuspendLambda implements wzs<com.vk.photo.editor.ivm.collage.c, spj<? super s3q0>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e28 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b28(e28 e28Var, spj<? super b28> spjVar) {
        super(2, spjVar);
        this.this$0 = e28Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        b28 b28Var = new b28(this.this$0, spjVar);
        b28Var.L$0 = obj;
        return b28Var;
    }

    @Override // xsna.wzs
    public final Object invoke(com.vk.photo.editor.ivm.collage.c cVar, spj<? super s3q0> spjVar) {
        return ((b28) create(cVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        com.vk.photo.editor.ivm.collage.c cVar = (com.vk.photo.editor.ivm.collage.c) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        e28 e28Var = this.this$0;
        if (e28Var.a == null) {
            return s3q0.a;
        }
        if (cVar.i != CollageMessage.Source.Synthetic) {
            e28Var.a(cVar);
        }
        if (this.this$0.l.getVisibility() == 0) {
            this.this$0.m.submitList(cVar.d);
        }
        return s3q0.a;
    }
}
