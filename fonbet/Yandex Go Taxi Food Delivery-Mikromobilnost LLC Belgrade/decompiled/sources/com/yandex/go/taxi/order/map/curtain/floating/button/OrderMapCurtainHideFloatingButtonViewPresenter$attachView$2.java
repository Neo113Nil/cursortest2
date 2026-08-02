package com.yandex.go.taxi.order.map.curtain.floating.button;

import com.yandex.go.taxi.order.provider.a;
import com.yandex.go.taxi.order.state.search.SearchState;
import defpackage.bms;
import defpackage.iz70;
import defpackage.jl40;
import defpackage.kz70;
import defpackage.mvg;
import defpackage.n20;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "curtainVisible", "externalFloatingButtonsVisible", "Lcom/yandex/go/taxi/order/state/search/SearchState;", "searchState", "Liz70;", "<anonymous>", "(ZZLcom/yandex/go/taxi/order/state/search/SearchState;)Liz70;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.map.curtain.floating.button.OrderMapCurtainHideFloatingButtonViewPresenter$attachView$2", f = "OrderMapCurtainHideFloatingButtonViewPresenter.kt", l = {48}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderMapCurtainHideFloatingButtonViewPresenter$attachView$2 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    Object L$1;
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    int label;
    final /* synthetic */ kz70 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderMapCurtainHideFloatingButtonViewPresenter$attachView$2(kz70 kz70Var, Continuation continuation) {
        super(4, continuation);
        this.this$0 = kz70Var;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        OrderMapCurtainHideFloatingButtonViewPresenter$attachView$2 orderMapCurtainHideFloatingButtonViewPresenter$attachView$2 = new OrderMapCurtainHideFloatingButtonViewPresenter$attachView$2(this.this$0, (Continuation) obj4);
        orderMapCurtainHideFloatingButtonViewPresenter$attachView$2.Z$0 = booleanValue;
        orderMapCurtainHideFloatingButtonViewPresenter$attachView$2.Z$1 = booleanValue2;
        orderMapCurtainHideFloatingButtonViewPresenter$attachView$2.L$0 = (SearchState) obj3;
        return orderMapCurtainHideFloatingButtonViewPresenter$attachView$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kz70 kz70Var;
        Object obj2;
        String str;
        boolean z = this.Z$0;
        boolean z2 = this.Z$1;
        SearchState searchState = (SearchState) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            kz70 kz70Var2 = this.this$0;
            n20 n20Var = kz70Var2.B;
            this.L$0 = searchState;
            this.L$1 = kz70Var2;
            this.Z$0 = z;
            this.Z$1 = z2;
            this.label = 1;
            Object k = ((a) n20Var).k(this);
            if (k == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = k;
            kz70Var = kz70Var2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kz70Var = (kz70) this.L$1;
            b.b(obj);
        }
        Iterator it = ((Iterable) obj).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (jl40.l(((o2y0) obj2).b().a, searchState.a)) {
                break;
            }
        }
        o2y0 o2y0Var = (o2y0) obj2;
        kz70Var.C = o2y0Var != null ? o2y0Var.d() : null;
        if (z && z2 && (str = searchState.x) != null && str.length() != 0) {
            String str2 = searchState.x;
            if (str2 != null) {
                return new iz70(str2, searchState.y);
            }
            ny61.g("Required value was null.");
        }
        return null;
    }
}
