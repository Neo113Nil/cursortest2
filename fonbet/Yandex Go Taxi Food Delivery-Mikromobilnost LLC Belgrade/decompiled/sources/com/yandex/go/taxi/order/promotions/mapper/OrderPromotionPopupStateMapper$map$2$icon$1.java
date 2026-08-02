package com.yandex.go.taxi.order.promotions.mapper;

import android.graphics.drawable.Drawable;
import defpackage.c4v;
import defpackage.e480;
import defpackage.evu0;
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
import ru.yandex.taxi.widget.utils.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/graphics/drawable/Drawable;", "<anonymous>", "(Ltse;)Landroid/graphics/drawable/Drawable;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.promotions.mapper.OrderPromotionPopupStateMapper$map$2$icon$1", f = "OrderPromotionPopupStateMapper.kt", l = {26}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderPromotionPopupStateMapper$map$2$icon$1 extends SuspendLambda implements wls {
    final /* synthetic */ e480 $modal;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderPromotionPopupStateMapper$map$2$icon$1(e480 e480Var, a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$modal = e480Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrderPromotionPopupStateMapper$map$2$icon$1(this.$modal, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrderPromotionPopupStateMapper$map$2$icon$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Object obj2 = null;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        c4v c4vVar = this.$modal.e;
        this.label = 1;
        aVar.getClass();
        e eVar = aVar.c;
        String str = c4vVar.b;
        if (str == null) {
            str = "";
        }
        String str2 = c4vVar.a;
        String str3 = str2 != null ? str2 : "";
        if (!evu0.J(str)) {
            obj2 = e.k(eVar, str, null, this, 14);
            if (obj2 != coroutineSingletons) {
                obj2 = (Drawable) obj2;
            }
        } else if (!evu0.J(str3) && (obj2 = e.f(eVar, str3, null, this, 6)) != coroutineSingletons) {
            obj2 = (Drawable) obj2;
        }
        return obj2 == coroutineSingletons ? coroutineSingletons : obj2;
    }
}
