package com.yandex.go.superapp.orders.bundle.modal.impl.presentation.ui;

import defpackage.d380;
import defpackage.gc80;
import defpackage.h151;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.vez0;
import defpackage.w201;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.orders.bundle.modal.impl.presentation.ui.SuperAppOrderBundlePresenter$sendOrderListShownAnalytics$1", f = "SuperAppOrderBundlePresenter.kt", l = {HProv.PP_NK_SYNC}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SuperAppOrderBundlePresenter$sendOrderListShownAnalytics$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<w201> $orders;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppOrderBundlePresenter$sendOrderListShownAnalytics$1(f fVar, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$orders = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperAppOrderBundlePresenter$sendOrderListShownAnalytics$1(this.this$0, this.$orders, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperAppOrderBundlePresenter$sendOrderListShownAnalytics$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        f fVar = this.this$0;
        h151 h151Var = fVar.H;
        String e0 = vez0.e0(fVar.C);
        List<w201> list = this.$orders;
        gc80 gc80Var = this.this$0.I;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            d380 a = gc80Var.a((w201) it.next());
            if (a != null) {
                arrayList.add(a);
            }
        }
        this.label = 1;
        h151Var.a(e0, arrayList);
        return zy11Var == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
