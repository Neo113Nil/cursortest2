package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ViewsHistoryDataSource.kt */
@b6l(c = "com.vk.im.messageviews.impl.domain.loading.ViewsHistoryDataSource$load$1", f = "ViewsHistoryDataSource.kt", l = {16}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class f4u0 extends SuspendLambda implements wzs<yvj, spj<? super nc20>, Object> {
    final /* synthetic */ int $anchor;
    int label;
    final /* synthetic */ g4u0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4u0(g4u0 g4u0Var, int i, spj<? super f4u0> spjVar) {
        super(2, spjVar);
        this.this$0 = g4u0Var;
        this.$anchor = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new f4u0(this.this$0, this.$anchor, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super nc20> spjVar) {
        return ((f4u0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            return obj;
        }
        kotlin.a.a(obj);
        g4u0 g4u0Var = this.this$0;
        xc20 xc20Var = g4u0Var.d;
        int i2 = g4u0Var.b;
        long j = g4u0Var.c;
        int i3 = this.$anchor;
        this.label = 1;
        Object b = xc20Var.b(i2, j, i3, this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
