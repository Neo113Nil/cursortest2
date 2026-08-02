package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.x3p;

/* compiled from: CropTool.kt */
@b6l(c = "com.vk.photo.editor.features.crop.CropTool$2", f = "CropTool.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class fik extends SuspendLambda implements wzs<x3p, spj<? super s3q0>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ gik this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fik(gik gikVar, spj<? super fik> spjVar) {
        super(2, spjVar);
        this.this$0 = gikVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        fik fikVar = new fik(this.this$0, spjVar);
        fikVar.L$0 = obj;
        return fikVar;
    }

    @Override // xsna.wzs
    public final Object invoke(x3p x3pVar, spj<? super s3q0> spjVar) {
        return ((fik) create(x3pVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        x3p x3pVar = (x3p) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        if (x3pVar instanceof x3p.a) {
            this.this$0.K();
        }
        return s3q0.a;
    }
}
