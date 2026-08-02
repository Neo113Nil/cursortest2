package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: FilterTextureSource.kt */
@b6l(c = "com.vk.photo.editor.features.collage.gl.textures.FilterTextureSource$1", f = "FilterTextureSource.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class eer extends SuspendLambda implements wzs<edr, spj<? super s3q0>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ fer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eer(fer ferVar, spj<? super eer> spjVar) {
        super(2, spjVar);
        this.this$0 = ferVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        eer eerVar = new eer(this.this$0, spjVar);
        eerVar.L$0 = obj;
        return eerVar;
    }

    @Override // xsna.wzs
    public final Object invoke(edr edrVar, spj<? super s3q0> spjVar) {
        return ((eer) create(edrVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        edr edrVar = (edr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        this.this$0.h = edrVar;
        return s3q0.a;
    }
}
