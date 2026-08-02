package com.yandex.go.taxi.intercity.dashboard.impl.presentation.modal;

import com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.l;
import defpackage.b580;
import defpackage.fnx0;
import defpackage.glw;
import defpackage.jbn;
import defpackage.jl40;
import defpackage.jlw;
import defpackage.lmw0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qtb1;
import defpackage.w3r0;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfnx0;", "tariffSelection", "Lzy11;", "<anonymous>", "(Lfnx0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.intercity.dashboard.impl.presentation.modal.IntercityDashboardPresenter$attachView$10", f = "IntercityDashboardPresenter.kt", l = {162}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class IntercityDashboardPresenter$attachView$10 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntercityDashboardPresenter$attachView$10(g gVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        IntercityDashboardPresenter$attachView$10 intercityDashboardPresenter$attachView$10 = new IntercityDashboardPresenter$attachView$10(this.this$0, continuation);
        intercityDashboardPresenter$attachView$10.L$0 = obj;
        return intercityDashboardPresenter$attachView$10;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((IntercityDashboardPresenter$attachView$10) create((fnx0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
    
        if (r0 == r3) goto L56;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        zy11 zy11Var = zy11.a;
        fnx0 fnx0Var = (fnx0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        l lVar = this.this$0.G;
        this.L$0 = null;
        this.label = 1;
        qtb1 qtb1Var = qtb1.D;
        String str = lVar.a.a().h;
        if (fnx0Var.b.getType() != SelectionOrigin.Type.USER) {
            jlw a = lVar.d.a();
            glw glwVar = a instanceof glw ? (glw) a : null;
            String str2 = glwVar != null ? glwVar.f.b : null;
            if (!jl40.l(fnx0Var.c.b, str) && !jl40.l(fnx0Var.c.b, str2)) {
                z = false;
            }
            if (str != null && !z) {
                obj2 = lVar.a(str, this);
            }
        }
        ArrayList d = ((jbn) lVar.f).d();
        List list = lVar.h.a.x;
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : list) {
            if (d.contains(((b580) obj3).a)) {
                arrayList.add(obj3);
            }
        }
        List f = fnx0Var.c.f();
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            loop1: while (it.hasNext()) {
                b580 b580Var = (b580) it.next();
                List list2 = f;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (jl40.l(((lmw0) it2.next()).getName(), b580Var.a)) {
                            break;
                        }
                    }
                }
                w3r0.b(lVar.j, kotlin.collections.a.k0(lVar.h.a.x, arrayList), null, null, null, 14);
                lVar.i.b(false);
                lVar.g.a(qtb1Var);
            }
        }
        if (lVar.c.i()) {
            lVar.i.b(false);
            lVar.g.a(qtb1Var);
        }
        obj2 = zy11Var;
        return obj2 == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
