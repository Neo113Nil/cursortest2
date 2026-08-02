package com.yandex.go.chargers.order.active;

import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersActiveOrderCardButtonNameV2;
import com.yandex.go.chargers.analytics.ChargersAnalytics$ChargersActiveOrderCardScreenState;
import defpackage.cl9;
import defpackage.dl9;
import defpackage.el9;
import defpackage.fl9;
import defpackage.gl9;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.vpr;
import defpackage.ycc;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class m implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ q b;

    public m(vpr vprVar, q qVar) {
        this.a = vprVar;
        this.b = qVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.ArrayList] */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ChargersActiveOrderPresenter$observeUiState$$inlined$map$1$2$1 chargersActiveOrderPresenter$observeUiState$$inlined$map$1$2$1;
        int i;
        q qVar;
        ?? singletonList;
        if (continuation instanceof ChargersActiveOrderPresenter$observeUiState$$inlined$map$1$2$1) {
            chargersActiveOrderPresenter$observeUiState$$inlined$map$1$2$1 = (ChargersActiveOrderPresenter$observeUiState$$inlined$map$1$2$1) continuation;
            int i2 = chargersActiveOrderPresenter$observeUiState$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersActiveOrderPresenter$observeUiState$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = chargersActiveOrderPresenter$observeUiState$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersActiveOrderPresenter$observeUiState$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    gl9 gl9Var = (gl9) obj;
                    List list = gl9Var.b;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        qVar = this.b;
                        if (!hasNext) {
                            break;
                        }
                        el9 el9Var = (el9) it.next();
                        if (el9Var instanceof dl9) {
                            List list2 = ((dl9) el9Var).a;
                            singletonList = new ArrayList(tcc.n(list2, 10));
                            Iterator it2 = list2.iterator();
                            while (it2.hasNext()) {
                                singletonList.add(q.Kg(qVar, ((cl9) it2.next()).b));
                            }
                        } else {
                            singletonList = Collections.singletonList(q.Kg(qVar, el9Var.getAction()));
                        }
                        ycc.r((Iterable) singletonList, arrayList);
                    }
                    fl9 fl9Var = gl9Var.e;
                    qVar.getClass();
                    ArrayList m0 = kotlin.collections.a.m0(fl9Var != null ? Collections.singletonList(ChargersAnalytics$ChargersActiveOrderCardButtonNameV2.Switcher) : EmptyList.a, arrayList);
                    Integer num = gl9Var.d;
                    Pair pair = new Pair(kotlin.collections.a.M(m0), (num == null || num.intValue() <= 0) ? ChargersAnalytics$ChargersActiveOrderCardScreenState.Default : ChargersAnalytics$ChargersActiveOrderCardScreenState.HoldoutStart);
                    chargersActiveOrderPresenter$observeUiState$$inlined$map$1$2$1.L$0 = null;
                    chargersActiveOrderPresenter$observeUiState$$inlined$map$1$2$1.L$1 = null;
                    chargersActiveOrderPresenter$observeUiState$$inlined$map$1$2$1.L$2 = null;
                    chargersActiveOrderPresenter$observeUiState$$inlined$map$1$2$1.L$3 = null;
                    chargersActiveOrderPresenter$observeUiState$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(pair, chargersActiveOrderPresenter$observeUiState$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        chargersActiveOrderPresenter$observeUiState$$inlined$map$1$2$1 = new ChargersActiveOrderPresenter$observeUiState$$inlined$map$1$2$1(this, continuation);
        Object obj22 = chargersActiveOrderPresenter$observeUiState$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersActiveOrderPresenter$observeUiState$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
