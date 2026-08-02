package com.yandex.go.taxi.order.search.ui.search_views;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.cta1;
import defpackage.mvg;
import defpackage.n20;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.tse;
import defpackage.vup0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.order.f;
import ru.yandex.taxi.order.i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.search.ui.search_views.SearchMapPresenter$onChangeSourcePointPinClicked$1", f = "SearchMapPresenter.kt", l = {56, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SearchMapPresenter$onChangeSourcePointPinClicked$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ vup0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchMapPresenter$onChangeSourcePointPinClicked$1(vup0 vup0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = vup0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SearchMapPresenter$onChangeSourcePointPinClicked$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SearchMapPresenter$onChangeSourcePointPinClicked$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x002e, code lost:
    
        if (r6 == r0) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        o2y0 o2y0Var;
        boolean booleanValue;
        i presenter;
        o2y0 o2y0Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            n20 n20Var = this.this$0.A;
            this.label = 1;
            obj = ((com.yandex.go.taxi.order.provider.a) n20Var).t(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o2y0Var = (o2y0) this.L$0;
                kotlin.b.b(obj);
                booleanValue = ((Boolean) obj).booleanValue();
                if (booleanValue && (o2y0Var2 = (presenter = this.this$0.D.a.getPresenter()).y0) != null) {
                    ((f) presenter.J).Y(o2y0Var2, null, null);
                }
                this.this$0.C.b(cta1.d(o2y0Var != null ? o2y0Var.c() : null), booleanValue);
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        o2y0 o2y0Var3 = (o2y0) obj;
        com.yandex.go.taxi.order.change.source.pin.b bVar = this.this$0.B;
        this.L$0 = o2y0Var3;
        this.label = 2;
        Object a = bVar.a(o2y0Var3, this);
        if (a != coroutineSingletons) {
            o2y0Var = o2y0Var3;
            obj = a;
            booleanValue = ((Boolean) obj).booleanValue();
            if (booleanValue) {
                ((f) presenter.J).Y(o2y0Var2, null, null);
            }
            this.this$0.C.b(cta1.d(o2y0Var != null ? o2y0Var.c() : null), booleanValue);
            return zy11.a;
        }
        return coroutineSingletons;
    }
}
