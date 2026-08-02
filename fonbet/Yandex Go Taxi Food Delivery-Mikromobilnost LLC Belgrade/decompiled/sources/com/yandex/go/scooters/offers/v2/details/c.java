package com.yandex.go.scooters.offers.v2.details;

import defpackage.ad5;
import defpackage.c9j;
import defpackage.g1j;
import defpackage.h1j;
import defpackage.i1j;
import defpackage.j3o0;
import defpackage.lbn0;
import defpackage.n6n0;
import defpackage.ny61;
import defpackage.pwy0;
import defpackage.rcc;
import defpackage.sls;
import defpackage.y5p0;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class c extends ad5 {
    public final com.yandex.go.scooters.offers.v2.details.mapper.a A;
    public final lbn0 B;
    public final String C;
    public final sls D;
    public final List E;
    public volatile List F;
    public final pwy0 x;
    public final n6n0 y;
    public final y5p0 z;

    public c(pwy0 pwy0Var, n6n0 n6n0Var, y5p0 y5p0Var, com.yandex.go.scooters.offers.v2.details.mapper.a aVar, lbn0 lbn0Var, String str, sls slsVar, List list) {
        super(j3o0.class);
        this.x = pwy0Var;
        this.y = n6n0Var;
        this.z = y5p0Var;
        this.A = aVar;
        this.B = lbn0Var;
        this.C = str;
        this.D = slsVar;
        this.E = list;
        this.F = EmptyList.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00ac -> B:10:0x00ad). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable Kg(c cVar, String str, List list, ContinuationImpl continuationImpl) {
        ScootersOfferDetailsPresenter$configureDetailsScreenList$1 scootersOfferDetailsPresenter$configureDetailsScreenList$1;
        int i;
        Iterator it;
        List list2;
        List list3;
        cVar.getClass();
        if (continuationImpl instanceof ScootersOfferDetailsPresenter$configureDetailsScreenList$1) {
            scootersOfferDetailsPresenter$configureDetailsScreenList$1 = (ScootersOfferDetailsPresenter$configureDetailsScreenList$1) continuationImpl;
            int i2 = scootersOfferDetailsPresenter$configureDetailsScreenList$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersOfferDetailsPresenter$configureDetailsScreenList$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersOfferDetailsPresenter$configureDetailsScreenList$1.result;
                Serializable serializable = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersOfferDetailsPresenter$configureDetailsScreenList$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ListBuilder a = rcc.a();
                    a.add(new g1j(str));
                    it = list.iterator();
                    list2 = a;
                    list3 = list2;
                    if (it.hasNext()) {
                    }
                    return serializable;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list2 = (List) scootersOfferDetailsPresenter$configureDetailsScreenList$1.L$9;
                it = (Iterator) scootersOfferDetailsPresenter$configureDetailsScreenList$1.L$5;
                List list4 = (List) scootersOfferDetailsPresenter$configureDetailsScreenList$1.L$3;
                list3 = (List) scootersOfferDetailsPresenter$configureDetailsScreenList$1.L$2;
                kotlin.b.b(obj);
                list2.addAll((Collection) obj);
                list2 = list4;
                if (it.hasNext()) {
                    c9j c9jVar = (c9j) it.next();
                    String str2 = c9jVar.a;
                    if (str2 != null) {
                        list2.add(new h1j(str2));
                    } else {
                        list2.add(i1j.a);
                    }
                    com.yandex.go.scooters.offers.v2.details.mapper.a aVar = cVar.A;
                    List list5 = c9jVar.b;
                    scootersOfferDetailsPresenter$configureDetailsScreenList$1.L$0 = null;
                    scootersOfferDetailsPresenter$configureDetailsScreenList$1.L$1 = null;
                    scootersOfferDetailsPresenter$configureDetailsScreenList$1.L$2 = list3;
                    scootersOfferDetailsPresenter$configureDetailsScreenList$1.L$3 = list2;
                    scootersOfferDetailsPresenter$configureDetailsScreenList$1.L$4 = null;
                    scootersOfferDetailsPresenter$configureDetailsScreenList$1.L$5 = it;
                    scootersOfferDetailsPresenter$configureDetailsScreenList$1.L$6 = null;
                    scootersOfferDetailsPresenter$configureDetailsScreenList$1.L$7 = null;
                    scootersOfferDetailsPresenter$configureDetailsScreenList$1.L$8 = null;
                    scootersOfferDetailsPresenter$configureDetailsScreenList$1.L$9 = list2;
                    scootersOfferDetailsPresenter$configureDetailsScreenList$1.label = 1;
                    obj = aVar.b(list5, scootersOfferDetailsPresenter$configureDetailsScreenList$1);
                    if (obj != serializable) {
                        list4 = list2;
                        list2.addAll((Collection) obj);
                        list2 = list4;
                        if (it.hasNext()) {
                        }
                    }
                } else {
                    serializable = ((ListBuilder) list3).j();
                }
                return serializable;
            }
        }
        scootersOfferDetailsPresenter$configureDetailsScreenList$1 = new ScootersOfferDetailsPresenter$configureDetailsScreenList$1(cVar, continuationImpl);
        Object obj2 = scootersOfferDetailsPresenter$configureDetailsScreenList$1.result;
        Serializable serializable2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersOfferDetailsPresenter$configureDetailsScreenList$1.label;
        if (i != 0) {
        }
    }
}
