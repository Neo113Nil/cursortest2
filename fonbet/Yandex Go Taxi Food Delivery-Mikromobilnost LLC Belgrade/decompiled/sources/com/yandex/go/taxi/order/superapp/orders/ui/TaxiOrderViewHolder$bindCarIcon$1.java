package com.yandex.go.taxi.order.superapp.orders.ui;

import android.graphics.Bitmap;
import defpackage.f2z;
import defpackage.f58;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p8h0;
import defpackage.q48;
import defpackage.q6y0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.carplates.ui.CarIndexContainerView;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.superapp.orders.ui.TaxiOrderViewHolder$bindCarIcon$1", f = "TaxiOrderViewHolder.kt", l = {791}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TaxiOrderViewHolder$bindCarIcon$1 extends SuspendLambda implements wls {
    final /* synthetic */ Integer $currentColor;
    final /* synthetic */ q6y0 $data;
    final /* synthetic */ Integer $localCarImageColor;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiOrderViewHolder$bindCarIcon$1(b bVar, Integer num, Integer num2, q6y0 q6y0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$currentColor = num;
        this.$localCarImageColor = num2;
        this.$data = q6y0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TaxiOrderViewHolder$bindCarIcon$1(this.this$0, this.$currentColor, this.$localCarImageColor, this.$data, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TaxiOrderViewHolder$bindCarIcon$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ((CarIndexContainerView) this.this$0.C0.b).setTag(p8h0.car_cache_tag, this.$currentColor);
            f2z f2zVar = this.this$0.m0;
            int intValue = this.$localCarImageColor.intValue();
            this.label = 1;
            obj = ((com.yandex.go.order.ui.presentation.car.a) f2zVar).b(intValue, this);
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
        Bitmap bitmap = (Bitmap) obj;
        f58 f58Var = this.this$0.C0;
        q48 q48Var = this.$data.k;
        ((CarIndexContainerView) f58Var.b).bind(q48Var != null ? q48Var.c() : null, bitmap);
        return zy11.a;
    }
}
