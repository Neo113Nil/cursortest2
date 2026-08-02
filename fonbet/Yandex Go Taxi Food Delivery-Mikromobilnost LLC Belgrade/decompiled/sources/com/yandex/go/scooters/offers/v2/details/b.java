package com.yandex.go.scooters.offers.v2.details;

import defpackage.b4p0;
import defpackage.b590;
import defpackage.f1j;
import defpackage.j1j;
import defpackage.j3o0;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.vpr;
import defpackage.zy11;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class b implements vpr {
    public final /* synthetic */ c a;

    public b(c cVar) {
        this.a = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ScootersOfferDetailsPresenter$init$$inlined$collectIn$1$1$1 scootersOfferDetailsPresenter$init$$inlined$collectIn$1$1$1;
        int i;
        b4p0 b4p0Var;
        List list;
        c cVar;
        List list2;
        List list3;
        if (continuation instanceof ScootersOfferDetailsPresenter$init$$inlined$collectIn$1$1$1) {
            scootersOfferDetailsPresenter$init$$inlined$collectIn$1$1$1 = (ScootersOfferDetailsPresenter$init$$inlined$collectIn$1$1$1) continuation;
            int i2 = scootersOfferDetailsPresenter$init$$inlined$collectIn$1$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersOfferDetailsPresenter$init$$inlined$collectIn$1$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersOfferDetailsPresenter$init$$inlined$collectIn$1$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersOfferDetailsPresenter$init$$inlined$collectIn$1$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Pair pair = (Pair) obj;
                    b4p0Var = (b4p0) pair.getFirst();
                    List list4 = (List) pair.getSecond();
                    if (list4.isEmpty() || b4p0Var == null) {
                        c cVar2 = this.a;
                        List<Object> list5 = cVar2.F;
                        ArrayList arrayList = new ArrayList(tcc.n(list5, 10));
                        for (Object obj3 : list5) {
                            if (obj3 instanceof f1j) {
                                obj3 = j1j.a;
                            }
                            arrayList.add(obj3);
                        }
                        cVar2.F = arrayList;
                        ((j3o0) this.a.Dg()).O5(this.a.F);
                        return zy11.a;
                    }
                    c cVar3 = this.a;
                    String str = cVar3.C;
                    if (str == null || (list2 = cVar3.E) == null) {
                        String str2 = b4p0Var instanceof b590 ? ((b590) b4p0Var).o : b4p0Var.c;
                        List list6 = b4p0Var.j;
                        scootersOfferDetailsPresenter$init$$inlined$collectIn$1$1$1.L$0 = null;
                        scootersOfferDetailsPresenter$init$$inlined$collectIn$1$1$1.L$1 = null;
                        scootersOfferDetailsPresenter$init$$inlined$collectIn$1$1$1.L$2 = b4p0Var;
                        scootersOfferDetailsPresenter$init$$inlined$collectIn$1$1$1.L$3 = list4;
                        scootersOfferDetailsPresenter$init$$inlined$collectIn$1$1$1.L$4 = null;
                        scootersOfferDetailsPresenter$init$$inlined$collectIn$1$1$1.L$5 = cVar3;
                        scootersOfferDetailsPresenter$init$$inlined$collectIn$1$1$1.label = 2;
                        Serializable Kg = c.Kg(cVar3, str2, list6, scootersOfferDetailsPresenter$init$$inlined$collectIn$1$1$1);
                        if (Kg != coroutineSingletons) {
                            list = list4;
                            cVar = cVar3;
                            obj2 = Kg;
                            list3 = (List) obj2;
                        }
                    } else {
                        scootersOfferDetailsPresenter$init$$inlined$collectIn$1$1$1.L$0 = null;
                        scootersOfferDetailsPresenter$init$$inlined$collectIn$1$1$1.L$1 = null;
                        scootersOfferDetailsPresenter$init$$inlined$collectIn$1$1$1.L$2 = b4p0Var;
                        scootersOfferDetailsPresenter$init$$inlined$collectIn$1$1$1.L$3 = list4;
                        scootersOfferDetailsPresenter$init$$inlined$collectIn$1$1$1.L$4 = cVar3;
                        scootersOfferDetailsPresenter$init$$inlined$collectIn$1$1$1.label = 1;
                        Serializable Kg2 = c.Kg(cVar3, str, list2, scootersOfferDetailsPresenter$init$$inlined$collectIn$1$1$1);
                        if (Kg2 != coroutineSingletons) {
                            list = list4;
                            cVar = cVar3;
                            obj2 = Kg2;
                            list3 = (List) obj2;
                        }
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    cVar = (c) scootersOfferDetailsPresenter$init$$inlined$collectIn$1$1$1.L$4;
                    list = (List) scootersOfferDetailsPresenter$init$$inlined$collectIn$1$1$1.L$3;
                    b4p0Var = (b4p0) scootersOfferDetailsPresenter$init$$inlined$collectIn$1$1$1.L$2;
                    kotlin.b.b(obj2);
                    list3 = (List) obj2;
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cVar = (c) scootersOfferDetailsPresenter$init$$inlined$collectIn$1$1$1.L$5;
                    list = (List) scootersOfferDetailsPresenter$init$$inlined$collectIn$1$1$1.L$3;
                    b4p0Var = (b4p0) scootersOfferDetailsPresenter$init$$inlined$collectIn$1$1$1.L$2;
                    kotlin.b.b(obj2);
                    list3 = (List) obj2;
                }
                cVar.F = list3;
                ((j3o0) this.a.Dg()).h1(list, b4p0Var, this.a.F);
                return zy11.a;
            }
        }
        scootersOfferDetailsPresenter$init$$inlined$collectIn$1$1$1 = new ScootersOfferDetailsPresenter$init$$inlined$collectIn$1$1$1(this, continuation);
        Object obj22 = scootersOfferDetailsPresenter$init$$inlined$collectIn$1$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersOfferDetailsPresenter$init$$inlined$collectIn$1$1$1.label;
        if (i != 0) {
        }
        cVar.F = list3;
        ((j3o0) this.a.Dg()).h1(list, b4p0Var, this.a.F);
        return zy11.a;
    }
}
