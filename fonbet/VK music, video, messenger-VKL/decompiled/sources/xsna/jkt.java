package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: GeoFeature.kt */
@b6l(c = "com.vk.geo.impl.presentation.GeoFeature$processStaticPreviewState$3", f = "GeoFeature.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class jkt extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ izs<Object, s3q0> $processItems;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jkt(izs<Object, s3q0> izsVar, spj<? super jkt> spjVar) {
        super(2, spjVar);
        this.$processItems = izsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new jkt(this.$processItems, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((jkt) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        this.$processItems.invoke(null);
        return s3q0.a;
    }
}
