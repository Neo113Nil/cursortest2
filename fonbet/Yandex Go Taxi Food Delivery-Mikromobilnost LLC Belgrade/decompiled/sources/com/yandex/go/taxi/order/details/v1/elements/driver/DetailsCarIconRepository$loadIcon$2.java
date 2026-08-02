package com.yandex.go.taxi.order.details.v1.elements.driver;

import android.graphics.drawable.Drawable;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.avj0;
import defpackage.mvg;
import defpackage.n4h0;
import defpackage.ny61;
import defpackage.q5z;
import defpackage.tse;
import defpackage.vng;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.widget.FormattedTextConverter$EmptyDrawable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/graphics/drawable/Drawable;", "<anonymous>", "(Ltse;)Landroid/graphics/drawable/Drawable;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v1.elements.driver.DetailsCarIconRepository$loadIcon$2", f = "DetailsCarIconRepository.kt", l = {38}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class DetailsCarIconRepository$loadIcon$2 extends SuspendLambda implements wls {
    final /* synthetic */ TaxiOrder $order;
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailsCarIconRepository$loadIcon$2(b bVar, TaxiOrder taxiOrder, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$order = taxiOrder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DetailsCarIconRepository$loadIcon$2(this.this$0, this.$order, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DetailsCarIconRepository$loadIcon$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            TaxiOrder taxiOrder = this.$order;
            bVar.getClass();
            Integer S = q5z.S(b.c(taxiOrder));
            if (S != null) {
                b bVar2 = this.this$0;
                TaxiOrder taxiOrder2 = this.$order;
                int intValue = S.intValue();
                int intValue2 = S.intValue();
                this.L$0 = null;
                this.L$1 = null;
                this.I$0 = intValue;
                this.label = 1;
                obj = bVar2.a(taxiOrder2, intValue2, false, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            Drawable t = vng.t(n4h0.car_icon_fallback_yellow, ((avj0) this.this$0.d).a);
            return t != null ? new FormattedTextConverter$EmptyDrawable() : t;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        Drawable drawable = (Drawable) obj;
        if (drawable != null) {
            return drawable;
        }
        Drawable t2 = vng.t(n4h0.car_icon_fallback_yellow, ((avj0) this.this$0.d).a);
        if (t2 != null) {
        }
    }
}
