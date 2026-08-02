package com.yandex.go.taxi.order.cancel.popup.mvp;

import com.yandex.go.taxi.order.cancel.popup.analytics.event.AfterCancelDetailedModalCardAnalytics$ActionType;
import com.yandex.go.taxi.order.cancel.popup.model.a;
import com.yandex.go.taxi.order.models.api.cancel.DetailedCancelNotification;
import defpackage.a2j;
import defpackage.b1;
import defpackage.g2j;
import defpackage.h2j;
import defpackage.ief;
import defpackage.j2j;
import defpackage.l2j;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.cancel.popup.mvp.DetailedCancelPopupPresenter$attachView$1", f = "DetailedCancelPopupPresenter.kt", l = {25}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class DetailedCancelPopupPresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ g2j $mvpView;
    int label;
    final /* synthetic */ h2j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailedCancelPopupPresenter$attachView$1(h2j h2jVar, g2j g2jVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = h2jVar;
        this.$mvpView = g2jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DetailedCancelPopupPresenter$attachView$1(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DetailedCancelPopupPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            h2j h2jVar = this.this$0;
            a aVar = h2jVar.z;
            DetailedCancelNotification detailedCancelNotification = h2jVar.x;
            ief iefVar = h2jVar.y.V().K;
            this.label = 1;
            obj = aVar.a(detailedCancelNotification, iefVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        l2j l2jVar = (l2j) obj;
        this.$mvpView.Z2(l2jVar);
        a2j a2jVar = this.this$0.B;
        a2jVar.getClass();
        String str = l2jVar.b;
        j2j j2jVar = l2jVar.e;
        AfterCancelDetailedModalCardAnalytics$ActionType b = j2jVar != null ? a2j.b(j2jVar.d.a()) : null;
        Iterable singletonList = b != null ? Collections.singletonList(b) : EmptyList.a;
        b1 b1Var = a2jVar.a;
        b1Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("title", str);
        Iterable iterable = singletonList;
        ArrayList arrayList = new ArrayList(tcc.n(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((AfterCancelDetailedModalCardAnalytics$ActionType) it.next()).getEventValue());
        }
        hashMap.put("button_list", arrayList);
        b1Var.a.a("AfterCancelDetailedModalCard.Shown", hashMap, 1, new HashMap());
        return zy11.a;
    }
}
