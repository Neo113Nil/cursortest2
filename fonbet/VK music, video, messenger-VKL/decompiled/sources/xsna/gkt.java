package xsna;

import com.vk.log.L;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: GeoFeature.kt */
@b6l(c = "com.vk.geo.impl.presentation.GeoFeature$7", f = "GeoFeature.kt", l = {252}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class gkt extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ com.vk.geo.impl.presentation.b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gkt(com.vk.geo.impl.presentation.b bVar, spj<? super gkt> spjVar) {
        super(2, spjVar);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new gkt(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((gkt) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            rpv X = this.this$0.X();
            this.label = 1;
            X.getClass();
            Object d = zvj.d(new spv(X, null), this);
            if (d != obj2) {
                d = s3q0.a;
            }
            if (d == obj2) {
                return obj2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        L.e("prefetch finish");
        return s3q0.a;
    }
}
