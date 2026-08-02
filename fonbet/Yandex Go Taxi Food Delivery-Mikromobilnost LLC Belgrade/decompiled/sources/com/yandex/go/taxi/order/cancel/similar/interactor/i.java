package com.yandex.go.taxi.order.cancel.similar.interactor;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.cancel.CancelSimilarOrdersNotification;
import defpackage.g08;
import defpackage.g6u;
import defpackage.gtq0;
import defpackage.n08;
import defpackage.n20;
import defpackage.ny61;
import defpackage.o08;
import defpackage.o2y0;
import defpackage.o400;
import defpackage.o8s0;
import defpackage.oep0;
import defpackage.sjh;
import defpackage.t9s0;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.xh60;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class i {
    public final o08 a;
    public final n20 b;
    public final ru.yandex.taxi.communications.data.a c;
    public final tt2 d;
    public final oep0 e;
    public final g08 f;
    public n08 g;

    public i(o08 o08Var, n20 n20Var, ru.yandex.taxi.communications.data.a aVar, tt2 tt2Var, oep0 oep0Var, g08 g08Var) {
        this.a = o08Var;
        this.b = n20Var;
        this.c = aVar;
        this.d = tt2Var;
        this.e = oep0Var;
        this.f = g08Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d1, code lost:
    
        if (r15 == r1) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0131 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(TaxiOrder taxiOrder, Continuation continuation) {
        CancelSimilarOrdersInteractor$tryToShowCancelSimilar$1 cancelSimilarOrdersInteractor$tryToShowCancelSimilar$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        tt2 tt2Var;
        xh60 b;
        boolean z;
        g6u g6uVar;
        CancelSimilarOrdersInteractor$tryToShowCancelSimilar$3 cancelSimilarOrdersInteractor$tryToShowCancelSimilar$3;
        if (continuation instanceof CancelSimilarOrdersInteractor$tryToShowCancelSimilar$1) {
            cancelSimilarOrdersInteractor$tryToShowCancelSimilar$1 = (CancelSimilarOrdersInteractor$tryToShowCancelSimilar$1) continuation;
            int i2 = cancelSimilarOrdersInteractor$tryToShowCancelSimilar$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cancelSimilarOrdersInteractor$tryToShowCancelSimilar$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cancelSimilarOrdersInteractor$tryToShowCancelSimilar$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cancelSimilarOrdersInteractor$tryToShowCancelSimilar$1.label;
                tt2Var = this.d;
                zy11 zy11Var = zy11.a;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            b = (xh60) cancelSimilarOrdersInteractor$tryToShowCancelSimilar$1.L$1;
                            kotlin.b.b(obj);
                        } else if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                kotlin.b.b(obj);
                b = taxiOrder.V().P.b("cancel_similar_orders");
                if (b != null) {
                    CancelSimilarOrdersNotification cancelSimilarOrdersNotification = (CancelSimilarOrdersNotification) b.b;
                    ArrayList o0 = kotlin.collections.a.o0(cancelSimilarOrdersNotification.c, cancelSimilarOrdersNotification.b);
                    List l = ((com.yandex.go.taxi.order.provider.a) this.b).l();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : l) {
                        if (o0.contains(((o2y0) obj2).b().a)) {
                            arrayList.add(obj2);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (((o2y0) it.next()).c() != DriveState.DRIVING) {
                            }
                        }
                    }
                    this.f.a.l(cancelSimilarOrdersNotification);
                    String str = cancelSimilarOrdersNotification.a;
                    cancelSimilarOrdersInteractor$tryToShowCancelSimilar$1.L$0 = null;
                    cancelSimilarOrdersInteractor$tryToShowCancelSimilar$1.L$1 = b;
                    cancelSimilarOrdersInteractor$tryToShowCancelSimilar$1.label = 2;
                    obj = this.c.b(str, cancelSimilarOrdersInteractor$tryToShowCancelSimilar$1);
                }
                if (gtq0.u(this.g)) {
                    tt2Var.getClass();
                    sjh sjhVar = uyj.a;
                    g6u g6uVar2 = o400.a;
                    CancelSimilarOrdersInteractor$tryToShowCancelSimilar$2 cancelSimilarOrdersInteractor$tryToShowCancelSimilar$2 = new CancelSimilarOrdersInteractor$tryToShowCancelSimilar$2(this, null);
                    cancelSimilarOrdersInteractor$tryToShowCancelSimilar$1.L$0 = null;
                    cancelSimilarOrdersInteractor$tryToShowCancelSimilar$1.L$1 = null;
                    cancelSimilarOrdersInteractor$tryToShowCancelSimilar$1.label = 1;
                    if (tje.k0(g6uVar2, cancelSimilarOrdersInteractor$tryToShowCancelSimilar$2, cancelSimilarOrdersInteractor$tryToShowCancelSimilar$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11Var;
                t9s0 t9s0Var = (t9s0) obj;
                z = t9s0Var.b >= new o8s0(14).a;
                boolean z2 = t9s0Var.c < Integer.MAX_VALUE;
                if (z && z2 && t9s0Var.d < Integer.MAX_VALUE) {
                    tt2Var.getClass();
                    sjh sjhVar2 = uyj.a;
                    g6uVar = o400.a;
                    cancelSimilarOrdersInteractor$tryToShowCancelSimilar$3 = new CancelSimilarOrdersInteractor$tryToShowCancelSimilar$3(this, b, null);
                    cancelSimilarOrdersInteractor$tryToShowCancelSimilar$1.L$0 = null;
                    cancelSimilarOrdersInteractor$tryToShowCancelSimilar$1.L$1 = null;
                    cancelSimilarOrdersInteractor$tryToShowCancelSimilar$1.label = 3;
                    if (tje.k0(g6uVar, cancelSimilarOrdersInteractor$tryToShowCancelSimilar$3, cancelSimilarOrdersInteractor$tryToShowCancelSimilar$1) != coroutineSingletons) {
                    }
                }
                return zy11Var;
            }
        }
        cancelSimilarOrdersInteractor$tryToShowCancelSimilar$1 = new CancelSimilarOrdersInteractor$tryToShowCancelSimilar$1(this, continuation);
        Object obj3 = cancelSimilarOrdersInteractor$tryToShowCancelSimilar$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cancelSimilarOrdersInteractor$tryToShowCancelSimilar$1.label;
        tt2Var = this.d;
        zy11 zy11Var2 = zy11.a;
        if (i == 0) {
        }
        t9s0 t9s0Var2 = (t9s0) obj3;
        if (t9s0Var2.b >= new o8s0(14).a) {
        }
        if (t9s0Var2.c < Integer.MAX_VALUE) {
        }
        if (z) {
            tt2Var.getClass();
            sjh sjhVar22 = uyj.a;
            g6uVar = o400.a;
            cancelSimilarOrdersInteractor$tryToShowCancelSimilar$3 = new CancelSimilarOrdersInteractor$tryToShowCancelSimilar$3(this, b, null);
            cancelSimilarOrdersInteractor$tryToShowCancelSimilar$1.L$0 = null;
            cancelSimilarOrdersInteractor$tryToShowCancelSimilar$1.L$1 = null;
            cancelSimilarOrdersInteractor$tryToShowCancelSimilar$1.label = 3;
            if (tje.k0(g6uVar, cancelSimilarOrdersInteractor$tryToShowCancelSimilar$3, cancelSimilarOrdersInteractor$tryToShowCancelSimilar$1) != coroutineSingletons) {
            }
        }
        return zy11Var2;
    }
}
