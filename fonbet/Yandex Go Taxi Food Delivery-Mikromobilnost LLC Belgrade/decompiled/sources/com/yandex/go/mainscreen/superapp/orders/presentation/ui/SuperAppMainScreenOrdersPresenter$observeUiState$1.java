package com.yandex.go.mainscreen.superapp.orders.presentation.ui;

import defpackage.d3p;
import defpackage.ibw0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r2w0;
import defpackage.tcc;
import defpackage.v9s0;
import defpackage.vez0;
import defpackage.w601;
import defpackage.wls;
import defpackage.x4e;
import defpackage.z2p;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lw201;", "trackings", "Lzy11;", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.mainscreen.superapp.orders.presentation.ui.SuperAppMainScreenOrdersPresenter$observeUiState$1", f = "SuperAppMainScreenOrdersPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class SuperAppMainScreenOrdersPresenter$observeUiState$1 extends SuspendLambda implements wls {
    final /* synthetic */ w601 $params;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ r2w0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppMainScreenOrdersPresenter$observeUiState$1(r2w0 r2w0Var, w601 w601Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = r2w0Var;
        this.$params = w601Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SuperAppMainScreenOrdersPresenter$observeUiState$1 superAppMainScreenOrdersPresenter$observeUiState$1 = new SuperAppMainScreenOrdersPresenter$observeUiState$1(this.this$0, this.$params, continuation);
        superAppMainScreenOrdersPresenter$observeUiState$1.L$0 = obj;
        return superAppMainScreenOrdersPresenter$observeUiState$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SuperAppMainScreenOrdersPresenter$observeUiState$1 superAppMainScreenOrdersPresenter$observeUiState$1 = (SuperAppMainScreenOrdersPresenter$observeUiState$1) create((List) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        superAppMainScreenOrdersPresenter$observeUiState$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        v9s0 v9s0Var = this.this$0.G;
        String D = vez0.D(this.$params.a);
        v9s0Var.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof d3p) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!v9s0Var.b.contains((d3p) next)) {
                arrayList2.add(next);
            }
        }
        v9s0Var.b = arrayList;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            d3p d3pVar = (d3p) it2.next();
            ibw0 ibw0Var = v9s0Var.a;
            String str = d3pVar.a;
            String str2 = d3pVar.d;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = d3pVar.e;
            String str4 = str3 != null ? str3 : "";
            String value = d3pVar.c.getValue();
            List list2 = d3pVar.k;
            ArrayList arrayList3 = new ArrayList(tcc.n(list2, 10));
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((z2p) it3.next()).a());
            }
            ibw0Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("button_list", arrayList3);
            hashMap.put("service_w_active_order", value);
            hashMap.put("active_order_id", str);
            if (D != null) {
                hashMap.put("filter", D);
            }
            ibw0Var.a.a("SuperappMain.ActiveOrderOffer.Shown", hashMap, 1, x4e.q(hashMap, "title", str2, "subtitle", str4));
        }
        return zy11.a;
    }
}
