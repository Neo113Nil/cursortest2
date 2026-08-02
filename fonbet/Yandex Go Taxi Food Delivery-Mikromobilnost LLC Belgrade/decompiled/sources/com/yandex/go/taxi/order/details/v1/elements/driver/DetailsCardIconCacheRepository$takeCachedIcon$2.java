package com.yandex.go.taxi.order.details.v1.elements.driver;

import android.graphics.drawable.Drawable;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.jl40;
import defpackage.m6j;
import defpackage.mvg;
import defpackage.n6j;
import defpackage.ny61;
import defpackage.q5z;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/graphics/drawable/Drawable;", "<anonymous>", "(Ltse;)Landroid/graphics/drawable/Drawable;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v1.elements.driver.DetailsCardIconCacheRepository$takeCachedIcon$2", f = "DetailsCardIconCacheRepository.kt", l = {33}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class DetailsCardIconCacheRepository$takeCachedIcon$2 extends SuspendLambda implements wls {
    final /* synthetic */ TaxiOrder $order;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ n6j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsCardIconCacheRepository$takeCachedIcon$2(n6j n6jVar, TaxiOrder taxiOrder, Continuation continuation) {
        super(2, continuation);
        this.this$0 = n6jVar;
        this.$order = taxiOrder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DetailsCardIconCacheRepository$takeCachedIcon$2(this.this$0, this.$order, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DetailsCardIconCacheRepository$takeCachedIcon$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0.b;
            TaxiOrder taxiOrder = this.$order;
            bVar.getClass();
            String c = b.c(taxiOrder);
            Integer S = q5z.S(c);
            if (jl40.l(c, this.this$0.c.a)) {
                return this.this$0.c.b;
            }
            if (S == null) {
                return null;
            }
            b bVar2 = this.this$0.b;
            TaxiOrder taxiOrder2 = this.$order;
            int intValue = S.intValue();
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            obj = bVar2.a(taxiOrder2, intValue, true, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        Drawable drawable = (Drawable) obj;
        if (drawable != null) {
            n6j n6jVar = this.this$0;
            TaxiOrder taxiOrder3 = this.$order;
            n6jVar.b.getClass();
            String c2 = b.c(taxiOrder3);
            if (c2 == null) {
                c2 = "";
            }
            n6jVar.c = new m6j(c2, drawable);
        }
        return drawable;
    }
}
