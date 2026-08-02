package com.yandex.go.scooters.offers.v2.components.options;

import defpackage.i5p0;
import defpackage.j5n0;
import defpackage.m4b1;
import defpackage.n3o0;
import defpackage.ny61;
import defpackage.q5n0;
import defpackage.s5n0;
import defpackage.t5n0;
import defpackage.u5n0;
import defpackage.vpr;
import defpackage.w511;
import defpackage.w5n0;
import defpackage.x5n0;
import defpackage.xzt0;
import defpackage.y5n0;
import defpackage.z5n0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ q5n0 b;

    public a(vpr vprVar, q5n0 q5n0Var) {
        this.a = vprVar;
        this.b = q5n0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ScootersCardOptionsListPresenter$listenToUiState$$inlined$map$1$2$1 scootersCardOptionsListPresenter$listenToUiState$$inlined$map$1$2$1;
        int i;
        Object obj2;
        if (continuation instanceof ScootersCardOptionsListPresenter$listenToUiState$$inlined$map$1$2$1) {
            scootersCardOptionsListPresenter$listenToUiState$$inlined$map$1$2$1 = (ScootersCardOptionsListPresenter$listenToUiState$$inlined$map$1$2$1) continuation;
            int i2 = scootersCardOptionsListPresenter$listenToUiState$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersCardOptionsListPresenter$listenToUiState$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = scootersCardOptionsListPresenter$listenToUiState$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersCardOptionsListPresenter$listenToUiState$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    z5n0 z5n0Var = (z5n0) obj;
                    this.b.getClass();
                    boolean z = z5n0Var instanceof w5n0;
                    Object obj4 = s5n0.a;
                    if (!z) {
                        if (z5n0Var instanceof x5n0) {
                            obj4 = new t5n0(((x5n0) z5n0Var).a);
                        } else {
                            if (!(z5n0Var instanceof y5n0)) {
                                w511.b();
                                return null;
                            }
                            y5n0 y5n0Var = (y5n0) z5n0Var;
                            List list = y5n0Var.h;
                            i5p0 b = m4b1.b(list);
                            if (b != null) {
                                ArrayList arrayList = new ArrayList();
                                for (Object obj5 : list) {
                                    if (obj5 instanceof i5p0) {
                                        arrayList.add(obj5);
                                    }
                                }
                                Iterator it = arrayList.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        obj2 = null;
                                        break;
                                    }
                                    obj2 = it.next();
                                    if (((i5p0) obj2).f instanceof xzt0) {
                                        break;
                                    }
                                }
                                i5p0 i5p0Var = (i5p0) obj2;
                                if (i5p0Var != null) {
                                    b = i5p0Var;
                                }
                                n3o0 n3o0Var = b.f.l;
                                obj4 = new u5n0(new j5n0(n3o0Var.a, n3o0Var.b, n3o0Var.e), y5n0Var.j.a);
                            }
                        }
                    }
                    scootersCardOptionsListPresenter$listenToUiState$$inlined$map$1$2$1.L$0 = null;
                    scootersCardOptionsListPresenter$listenToUiState$$inlined$map$1$2$1.L$1 = null;
                    scootersCardOptionsListPresenter$listenToUiState$$inlined$map$1$2$1.L$2 = null;
                    scootersCardOptionsListPresenter$listenToUiState$$inlined$map$1$2$1.L$3 = null;
                    scootersCardOptionsListPresenter$listenToUiState$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(obj4, scootersCardOptionsListPresenter$listenToUiState$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj3);
                }
                return zy11.a;
            }
        }
        scootersCardOptionsListPresenter$listenToUiState$$inlined$map$1$2$1 = new ScootersCardOptionsListPresenter$listenToUiState$$inlined$map$1$2$1(this, continuation);
        Object obj32 = scootersCardOptionsListPresenter$listenToUiState$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersCardOptionsListPresenter$listenToUiState$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
