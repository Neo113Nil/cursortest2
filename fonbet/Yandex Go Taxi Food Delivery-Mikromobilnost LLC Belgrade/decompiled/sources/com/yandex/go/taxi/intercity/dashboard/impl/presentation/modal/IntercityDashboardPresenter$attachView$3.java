package com.yandex.go.taxi.intercity.dashboard.impl.presentation.modal;

import com.yandex.go.zone.dto.objects.BulletsOrderPopup;
import defpackage.agw;
import defpackage.dgw;
import defpackage.gjw;
import defpackage.glw;
import defpackage.hjw;
import defpackage.ifw;
import defpackage.jl40;
import defpackage.jlw;
import defpackage.khe;
import defpackage.mkw;
import defpackage.mp60;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pkw;
import defpackage.qow;
import defpackage.wls;
import defpackage.xge;
import defpackage.zcr;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljlw;", "uiState", "Lzy11;", "<anonymous>", "(Ljlw;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.intercity.dashboard.impl.presentation.modal.IntercityDashboardPresenter$attachView$3", f = "IntercityDashboardPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class IntercityDashboardPresenter$attachView$3 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntercityDashboardPresenter$attachView$3(g gVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        IntercityDashboardPresenter$attachView$3 intercityDashboardPresenter$attachView$3 = new IntercityDashboardPresenter$attachView$3(this.this$0, continuation);
        intercityDashboardPresenter$attachView$3.L$0 = obj;
        return intercityDashboardPresenter$attachView$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        IntercityDashboardPresenter$attachView$3 intercityDashboardPresenter$attachView$3 = (IntercityDashboardPresenter$attachView$3) create((jlw) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        intercityDashboardPresenter$attachView$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        List list;
        BulletsOrderPopup bulletsOrderPopup;
        jlw jlwVar = (jlw) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        Boolean bool = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        g gVar = this.this$0;
        ifw ifwVar = gVar.C;
        boolean z = true;
        if (gVar.U < 1 && (jlwVar instanceof glw) && (((ifwVar.a() instanceof dgw) || (ifwVar.a() instanceof agw)) && (bulletsOrderPopup = ((glw) jlwVar).e.a) != null)) {
            gVar.U++;
            gVar.x.a(bulletsOrderPopup, false);
        }
        if (jlwVar instanceof glw) {
            mp60 mp60Var = ((glw) jlwVar).c;
            Object[] objArr = mp60Var.a;
            int i = mp60Var.b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    obj2 = null;
                    break;
                }
                obj2 = objArr[i2];
                if (((hjw) obj2) instanceof gjw) {
                    break;
                }
                i2++;
            }
            if (!(obj2 instanceof gjw)) {
                obj2 = null;
            }
            gjw gjwVar = (gjw) obj2;
            if (gjwVar != null && (list = gjwVar.b) != null) {
                List list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if (((pkw) it.next()).b().e instanceof mkw) {
                            break;
                        }
                    }
                }
                z = false;
                bool = Boolean.valueOf(z);
            }
            if (jl40.l(bool, Boolean.TRUE)) {
                ((qow) this.this$0.L).c(khe.e);
            }
            ((qow) this.this$0.L).c(xge.e);
            ((qow) this.this$0.L).c(zcr.e);
        }
        return zy11.a;
    }
}
