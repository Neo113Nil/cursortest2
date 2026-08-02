package com.yandex.go.taxi.order;

import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.a3y0;
import defpackage.cne0;
import defpackage.kqe0;
import defpackage.ny61;
import defpackage.ozi0;
import defpackage.p2y0;
import defpackage.pzt0;
import defpackage.r780;
import defpackage.tje;
import defpackage.tse;
import defpackage.xzi0;
import java.util.HashSet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.exception.UnauthorizedUserException;

/* loaded from: classes14.dex */
public final class g0 {
    public final tse a;
    public final String b;
    public final ozi0 c;
    public final xzi0 d;
    public final p2y0 e;
    public final f0 f;
    public final a3y0 g = new a3y0(TaxiOrderLogGroup.CORE.getTag(), "ReorderHandler");
    public pzt0 h;

    public g0(tse tseVar, String str, ozi0 ozi0Var, xzi0 xzi0Var, p2y0 p2y0Var, f0 f0Var) {
        this.a = tseVar;
        this.b = str;
        this.c = ozi0Var;
        this.d = xzi0Var;
        this.e = p2y0Var;
        this.f = f0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(g0 g0Var, String str, String str2, Throwable th, ContinuationImpl continuationImpl) {
        ReorderHandler$handleReorderError$1 reorderHandler$handleReorderError$1;
        int i;
        TaxiOrder taxiOrder;
        g0Var.getClass();
        if (continuationImpl instanceof ReorderHandler$handleReorderError$1) {
            reorderHandler$handleReorderError$1 = (ReorderHandler$handleReorderError$1) continuationImpl;
            int i2 = reorderHandler$handleReorderError$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                reorderHandler$handleReorderError$1.label = i2 - Integer.MIN_VALUE;
                Object obj = reorderHandler$handleReorderError$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = reorderHandler$handleReorderError$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (th instanceof UnauthorizedUserException) {
                        throw th;
                    }
                    f0 f0Var = g0Var.f;
                    kqe0 kqe0Var = new kqe0(8, g0Var, str, str2);
                    reorderHandler$handleReorderError$1.L$0 = null;
                    reorderHandler$handleReorderError$1.L$1 = null;
                    reorderHandler$handleReorderError$1.L$2 = th;
                    reorderHandler$handleReorderError$1.label = 1;
                    obj = f0Var.a(kqe0Var, reorderHandler$handleReorderError$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    th = (Throwable) reorderHandler$handleReorderError$1.L$2;
                    kotlin.b.b(obj);
                }
                taxiOrder = (TaxiOrder) obj;
                if (taxiOrder == null) {
                    return taxiOrder;
                }
                throw th;
            }
        }
        reorderHandler$handleReorderError$1 = new ReorderHandler$handleReorderError$1(g0Var, continuationImpl);
        Object obj2 = reorderHandler$handleReorderError$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = reorderHandler$handleReorderError$1.label;
        if (i != 0) {
        }
        taxiOrder = (TaxiOrder) obj2;
        if (taxiOrder == null) {
        }
    }

    public final void b(String str, r780 r780Var) {
        pzt0 pzt0Var = this.h;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        xzi0 xzi0Var = this.d;
        xzi0Var.getClass();
        String str2 = "ru.yandex.taxi.order.HANDLED_REORDERS_" + this.b;
        cne0 cne0Var = xzi0Var.a;
        HashSet hashSet = new HashSet(cne0Var.n(str2));
        hashSet.add(str);
        cne0Var.t(str2, hashSet);
        this.h = tje.N(this.a, null, null, new ReorderHandler$reorder$1(r780Var, this, str, null), 3);
    }
}
