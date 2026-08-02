package com.yandex.go.taxi.order.recalculation.ui;

import android.graphics.Bitmap;
import defpackage.c0f0;
import defpackage.g16;
import defpackage.m7x0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.recalculation.ui.PriceRecalculationPresenter$bindPriceLoadErrorState$1", f = "PriceRecalculationPresenter.kt", l = {255}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class PriceRecalculationPresenter$bindPriceLoadErrorState$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceRecalculationPresenter$bindPriceLoadErrorState$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PriceRecalculationPresenter$bindPriceLoadErrorState$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PriceRecalculationPresenter$bindPriceLoadErrorState$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Bitmap bitmap = null;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                b bVar = this.this$0;
                g16 b = this.this$0.I.b().b(((m7x0) bVar.H).a(bVar.A.d().f.j));
                this.L$0 = null;
                this.label = 1;
                obj = b.a(this);
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
            bitmap = (Bitmap) obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
        ((c0f0) this.this$0.Dg()).t7(bitmap);
        return zy11.a;
    }
}
