package com.yandex.go.taxi.order.domain.repositories;

import defpackage.cne0;
import defpackage.dne0;
import defpackage.n20;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.tcc;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class f {
    public final n20 a;
    public final cne0 b;

    public f(dne0 dne0Var, n20 n20Var) {
        this.a = n20Var;
        this.b = dne0Var.a("SearchAcceptanceStorage");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055 A[LOOP:0: B:11:0x004f->B:13:0x0055, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        SearchAcceptanceRepository$cleanupOutdatedOrders$1 searchAcceptanceRepository$cleanupOutdatedOrders$1;
        int i;
        Iterator it;
        if (continuationImpl instanceof SearchAcceptanceRepository$cleanupOutdatedOrders$1) {
            searchAcceptanceRepository$cleanupOutdatedOrders$1 = (SearchAcceptanceRepository$cleanupOutdatedOrders$1) continuationImpl;
            int i2 = searchAcceptanceRepository$cleanupOutdatedOrders$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                searchAcceptanceRepository$cleanupOutdatedOrders$1.label = i2 - Integer.MIN_VALUE;
                Object obj = searchAcceptanceRepository$cleanupOutdatedOrders$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = searchAcceptanceRepository$cleanupOutdatedOrders$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    searchAcceptanceRepository$cleanupOutdatedOrders$1.label = 1;
                    obj = ((com.yandex.go.taxi.order.provider.a) this.a).k(searchAcceptanceRepository$cleanupOutdatedOrders$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(tcc.n(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((o2y0) it.next()).b().a);
                }
                cne0 cne0Var = this.b;
                cne0Var.t("Acceptance", kotlin.collections.a.U(arrayList, cne0Var.n("Acceptance")));
                return zy11.a;
            }
        }
        searchAcceptanceRepository$cleanupOutdatedOrders$1 = new SearchAcceptanceRepository$cleanupOutdatedOrders$1(this, continuationImpl);
        Object obj2 = searchAcceptanceRepository$cleanupOutdatedOrders$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = searchAcceptanceRepository$cleanupOutdatedOrders$1.label;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(tcc.n(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        cne0 cne0Var2 = this.b;
        cne0Var2.t("Acceptance", kotlin.collections.a.U(arrayList2, cne0Var2.n("Acceptance")));
        return zy11.a;
    }
}
