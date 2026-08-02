package com.yandex.go.shortcuts.impl.interactors;

import defpackage.bms;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.unr0;
import defpackage.zy11;
import java.net.SocketTimeoutException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lvpr;", "Lcom/yandex/go/shortcuts/dto/response/ProductsScreenResponse;", "", "throwable", "", "count", "", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;J)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.shortcuts.impl.interactors.ProductsScreenInteractorImpl$fetchScreenProducts$4$1", f = "ProductsScreenInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ProductsScreenInteractorImpl$fetchScreenProducts$4$1 extends SuspendLambda implements bms {
    /* synthetic */ long J$0;
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        long longValue = ((Number) obj3).longValue();
        ProductsScreenInteractorImpl$fetchScreenProducts$4$1 productsScreenInteractorImpl$fetchScreenProducts$4$1 = new ProductsScreenInteractorImpl$fetchScreenProducts$4$1(4, (Continuation) obj4);
        productsScreenInteractorImpl$fetchScreenProducts$4$1.L$0 = (Throwable) obj2;
        productsScreenInteractorImpl$fetchScreenProducts$4$1.J$0 = longValue;
        return productsScreenInteractorImpl$fetchScreenProducts$4$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th = (Throwable) this.L$0;
        long j = this.J$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        unr0.C(new Object[]{new Long(j)}, 1, "Retry(%d) products request", jst.e);
        return Boolean.valueOf(j < 5 && (th instanceof SocketTimeoutException));
    }
}
