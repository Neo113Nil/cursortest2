package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: IconCache.kt */
@b6l(c = "com.vk.geo.impl.presentation.map.markers.icons.IconCache$prefetch$2", f = "IconCache.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class spv extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ rpv this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public spv(rpv rpvVar, spj<? super spv> spjVar) {
        super(2, spjVar);
        this.this$0 = rpvVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new spv(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((spv) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        rpv rpvVar = this.this$0;
        rpvVar.n = rpvVar.b(true);
        rpv rpvVar2 = this.this$0;
        rpvVar2.o = rpvVar2.b(false);
        return s3q0.a;
    }
}
