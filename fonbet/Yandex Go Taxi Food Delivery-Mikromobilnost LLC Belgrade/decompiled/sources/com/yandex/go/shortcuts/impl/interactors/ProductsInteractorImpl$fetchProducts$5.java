package com.yandex.go.shortcuts.impl.interactors;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.qaf0;
import defpackage.wls;
import defpackage.zaf0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lzaf0;", "it", "Luaf0;", "<anonymous>", "(Lzaf0;)Luaf0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.shortcuts.impl.interactors.ProductsInteractorImpl$fetchProducts$5", f = "ProductsInteractorImpl.kt", l = {HProv.PP_PASSWD_TERM}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ProductsInteractorImpl$fetchProducts$5 extends SuspendLambda implements wls {
    final /* synthetic */ qaf0 $screenInstance;
    int label;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductsInteractorImpl$fetchProducts$5(m mVar, qaf0 qaf0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mVar;
        this.$screenInstance = qaf0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProductsInteractorImpl$fetchProducts$5(this.this$0, this.$screenInstance, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ProductsInteractorImpl$fetchProducts$5) create((zaf0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        m mVar = this.this$0;
        qaf0 qaf0Var = this.$screenInstance;
        this.label = 1;
        Object a = m.a(mVar, qaf0Var, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
