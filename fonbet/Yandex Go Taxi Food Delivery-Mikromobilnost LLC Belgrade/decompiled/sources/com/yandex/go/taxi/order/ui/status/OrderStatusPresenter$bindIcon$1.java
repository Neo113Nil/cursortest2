package com.yandex.go.taxi.order.ui.status;

import android.graphics.Bitmap;
import defpackage.d880;
import defpackage.g16;
import defpackage.m7x0;
import defpackage.m880;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.ui.status.OrderStatusPresenter$bindIcon$1", f = "OrderStatusPresenter.kt", l = {230}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderStatusPresenter$bindIcon$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ m880 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderStatusPresenter$bindIcon$1(m880 m880Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = m880Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderStatusPresenter$bindIcon$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderStatusPresenter$bindIcon$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            b.b(obj);
            m880 m880Var = this.this$0;
            String str = m880Var.F.h;
            if (str != null && (a = ((m7x0) m880Var.B).a(str)) != null) {
                g16 b = this.this$0.C.b().b(a);
                this.L$0 = null;
                this.label = 1;
                obj = ru.yandex.taxi.utils.a.b(b, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return zy11Var;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            ((d880) this.this$0.Dg()).f7(bitmap);
        }
        return zy11Var;
    }
}
