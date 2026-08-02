package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ObjectSearchHistoryProvider.kt */
@b6l(c = "com.vk.catalog2.feature.music.search.history.provider.ObjectSearchHistoryProvider$addToSearchHistory$1", f = "ObjectSearchHistoryProvider.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class wp70 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ vp70 $searchHistoryModel;
    int label;
    final /* synthetic */ yp70 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wp70(yp70 yp70Var, vp70 vp70Var, spj<? super wp70> spjVar) {
        super(2, spjVar);
        this.this$0 = yp70Var;
        this.$searchHistoryModel = vp70Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new wp70(this.this$0, this.$searchHistoryModel, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((wp70) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        this.this$0.a.b(this.$searchHistoryModel);
        return s3q0.a;
    }
}
