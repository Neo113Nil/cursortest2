package com.yandex.go.promocodes.base.impl.promo_codes.data.repositories;

import defpackage.dms;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lknf0;", "<unused var>", "", "", "<anonymous>", "(Lknf0;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.promocodes.base.impl.promo_codes.data.repositories.PromoCodesRepositoryImpl$activePromoCodeFlow$1", f = "PromoCodesRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class PromoCodesRepositoryImpl$activePromoCodeFlow$1 extends SuspendLambda implements dms {
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromoCodesRepositoryImpl$activePromoCodeFlow$1(c cVar, Continuation continuation) {
        super(5, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Boolean) obj4).booleanValue();
        return new PromoCodesRepositoryImpl$activePromoCodeFlow$1(this.this$0, (Continuation) obj5).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return this.this$0.g();
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
