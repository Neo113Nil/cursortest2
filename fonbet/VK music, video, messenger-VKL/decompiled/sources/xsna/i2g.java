package xsna;

import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: CollageTextureSource.kt */
@b6l(c = "com.vk.photo.editor.features.collage.gl.textures.CollageTextureSource$1", f = "CollageTextureSource.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class i2g extends SuspendLambda implements wzs<List<? extends m1t>, spj<? super s3q0>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ l2g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2g(l2g l2gVar, spj<? super i2g> spjVar) {
        super(2, spjVar);
        this.this$0 = l2gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        i2g i2gVar = new i2g(this.this$0, spjVar);
        i2gVar.L$0 = obj;
        return i2gVar;
    }

    @Override // xsna.wzs
    public final Object invoke(List<? extends m1t> list, spj<? super s3q0> spjVar) {
        return ((i2g) create(list, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List<m1t> list = (List) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        this.this$0.p = list;
        return s3q0.a;
    }
}
