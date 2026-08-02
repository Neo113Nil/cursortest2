package com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor;

import defpackage.acw;
import defpackage.d0l0;
import defpackage.gjw;
import defpackage.glw;
import defpackage.hjw;
import defpackage.jhw;
import defpackage.jl40;
import defpackage.jlw;
import defpackage.jpw;
import defpackage.klw;
import defpackage.knx0;
import defpackage.mcw;
import defpackage.mnx0;
import defpackage.mp60;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.pkw;
import defpackage.qkw;
import defpackage.tcc;
import defpackage.wls;
import defpackage.xfw;
import defpackage.xuv;
import defpackage.xy40;
import defpackage.ybw;
import defpackage.zhw;
import defpackage.zzk0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.tariffs.model.PriceUpdate$PriceLoadingState;

/* loaded from: classes14.dex */
public final class m {
    public final qkw a;
    public final zhw b;
    public final com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.impl.i c;
    public final jhw d;
    public final com.yandex.go.taxi.intercity.dashboard.impl.data.repository.a e;
    public final ybw f;
    public final klw g;

    public m(qkw qkwVar, zhw zhwVar, com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.impl.i iVar, jhw jhwVar, com.yandex.go.taxi.intercity.dashboard.impl.data.repository.a aVar, ybw ybwVar, klw klwVar) {
        this.a = qkwVar;
        this.b = zhwVar;
        this.c = iVar;
        this.d = jhwVar;
        this.e = aVar;
        this.f = ybwVar;
        this.g = klwVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(m mVar, pkw pkwVar, PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState, ContinuationImpl continuationImpl) {
        UpdateIntercityDashboardSectionsInteractor$updateAndGetTariffSelectorItemByPriceLoadingState$1 updateIntercityDashboardSectionsInteractor$updateAndGetTariffSelectorItemByPriceLoadingState$1;
        int i;
        qkw qkwVar = mVar.a;
        if (continuationImpl instanceof UpdateIntercityDashboardSectionsInteractor$updateAndGetTariffSelectorItemByPriceLoadingState$1) {
            updateIntercityDashboardSectionsInteractor$updateAndGetTariffSelectorItemByPriceLoadingState$1 = (UpdateIntercityDashboardSectionsInteractor$updateAndGetTariffSelectorItemByPriceLoadingState$1) continuationImpl;
            int i2 = updateIntercityDashboardSectionsInteractor$updateAndGetTariffSelectorItemByPriceLoadingState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                updateIntercityDashboardSectionsInteractor$updateAndGetTariffSelectorItemByPriceLoadingState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = updateIntercityDashboardSectionsInteractor$updateAndGetTariffSelectorItemByPriceLoadingState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = updateIntercityDashboardSectionsInteractor$updateAndGetTariffSelectorItemByPriceLoadingState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (priceUpdate$PriceLoadingState == PriceUpdate$PriceLoadingState.LOADING) {
                        qkwVar.getClass();
                        return qkw.a(pkwVar, knx0.b);
                    }
                    if (!mVar.c.b()) {
                        return pkwVar;
                    }
                    jhw jhwVar = mVar.d;
                    String str = pkwVar.b;
                    updateIntercityDashboardSectionsInteractor$updateAndGetTariffSelectorItemByPriceLoadingState$1.L$0 = pkwVar;
                    updateIntercityDashboardSectionsInteractor$updateAndGetTariffSelectorItemByPriceLoadingState$1.L$1 = null;
                    updateIntercityDashboardSectionsInteractor$updateAndGetTariffSelectorItemByPriceLoadingState$1.label = 1;
                    obj = ((com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.impl.b) jhwVar).a(str, updateIntercityDashboardSectionsInteractor$updateAndGetTariffSelectorItemByPriceLoadingState$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pkwVar = (pkw) updateIntercityDashboardSectionsInteractor$updateAndGetTariffSelectorItemByPriceLoadingState$1.L$0;
                    kotlin.b.b(obj);
                }
                mnx0 mnx0Var = new mnx0((jpw) obj, mVar.e.a().g);
                qkwVar.getClass();
                return qkw.a(pkwVar, mnx0Var);
            }
        }
        updateIntercityDashboardSectionsInteractor$updateAndGetTariffSelectorItemByPriceLoadingState$1 = new UpdateIntercityDashboardSectionsInteractor$updateAndGetTariffSelectorItemByPriceLoadingState$1(mVar, continuationImpl);
        Object obj2 = updateIntercityDashboardSectionsInteractor$updateAndGetTariffSelectorItemByPriceLoadingState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = updateIntercityDashboardSectionsInteractor$updateAndGetTariffSelectorItemByPriceLoadingState$1.label;
        if (i != 0) {
        }
        mnx0 mnx0Var2 = new mnx0((jpw) obj2, mVar.e.a().g);
        qkwVar.getClass();
        return qkw.a(pkwVar, mnx0Var2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0098 -> B:10:0x009c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(m mVar, gjw gjwVar, wls wlsVar, ContinuationImpl continuationImpl) {
        UpdateIntercityDashboardSectionsInteractor$updateTariffSelectorItems$1 updateIntercityDashboardSectionsInteractor$updateTariffSelectorItems$1;
        int i;
        Iterator it;
        gjw gjwVar2;
        Collection collection;
        mVar.getClass();
        if (continuationImpl instanceof UpdateIntercityDashboardSectionsInteractor$updateTariffSelectorItems$1) {
            updateIntercityDashboardSectionsInteractor$updateTariffSelectorItems$1 = (UpdateIntercityDashboardSectionsInteractor$updateTariffSelectorItems$1) continuationImpl;
            int i2 = updateIntercityDashboardSectionsInteractor$updateTariffSelectorItems$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                updateIntercityDashboardSectionsInteractor$updateTariffSelectorItems$1.label = i2 - Integer.MIN_VALUE;
                Object obj = updateIntercityDashboardSectionsInteractor$updateTariffSelectorItems$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = updateIntercityDashboardSectionsInteractor$updateTariffSelectorItems$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List list = gjwVar.b;
                    ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                    it = list.iterator();
                    gjwVar2 = gjwVar;
                    collection = arrayList;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    collection = (Collection) updateIntercityDashboardSectionsInteractor$updateTariffSelectorItems$1.L$9;
                    gjw gjwVar3 = (gjw) updateIntercityDashboardSectionsInteractor$updateTariffSelectorItems$1.L$8;
                    it = (Iterator) updateIntercityDashboardSectionsInteractor$updateTariffSelectorItems$1.L$5;
                    Collection collection2 = (Collection) updateIntercityDashboardSectionsInteractor$updateTariffSelectorItems$1.L$4;
                    wls wlsVar2 = (wls) updateIntercityDashboardSectionsInteractor$updateTariffSelectorItems$1.L$1;
                    kotlin.b.b(obj);
                    collection.add((pkw) obj);
                    gjwVar2 = gjwVar3;
                    collection = collection2;
                    wlsVar = wlsVar2;
                    if (it.hasNext()) {
                        pkw pkwVar = (pkw) it.next();
                        updateIntercityDashboardSectionsInteractor$updateTariffSelectorItems$1.L$0 = null;
                        updateIntercityDashboardSectionsInteractor$updateTariffSelectorItems$1.L$1 = wlsVar;
                        updateIntercityDashboardSectionsInteractor$updateTariffSelectorItems$1.L$2 = null;
                        updateIntercityDashboardSectionsInteractor$updateTariffSelectorItems$1.L$3 = null;
                        updateIntercityDashboardSectionsInteractor$updateTariffSelectorItems$1.L$4 = collection;
                        updateIntercityDashboardSectionsInteractor$updateTariffSelectorItems$1.L$5 = it;
                        updateIntercityDashboardSectionsInteractor$updateTariffSelectorItems$1.L$6 = null;
                        updateIntercityDashboardSectionsInteractor$updateTariffSelectorItems$1.L$7 = null;
                        updateIntercityDashboardSectionsInteractor$updateTariffSelectorItems$1.L$8 = gjwVar2;
                        updateIntercityDashboardSectionsInteractor$updateTariffSelectorItems$1.L$9 = collection;
                        updateIntercityDashboardSectionsInteractor$updateTariffSelectorItems$1.label = 1;
                        Object invoke = wlsVar.invoke(pkwVar, updateIntercityDashboardSectionsInteractor$updateTariffSelectorItems$1);
                        if (invoke == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        wlsVar2 = wlsVar;
                        gjwVar3 = gjwVar2;
                        obj = invoke;
                        collection2 = collection;
                        collection.add((pkw) obj);
                        gjwVar2 = gjwVar3;
                        collection = collection2;
                        wlsVar = wlsVar2;
                        if (it.hasNext()) {
                            return new gjw(gjwVar2.a, (List) collection);
                        }
                    }
                }
            }
        }
        updateIntercityDashboardSectionsInteractor$updateTariffSelectorItems$1 = new UpdateIntercityDashboardSectionsInteractor$updateTariffSelectorItems$1(mVar, continuationImpl);
        Object obj2 = updateIntercityDashboardSectionsInteractor$updateTariffSelectorItems$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = updateIntercityDashboardSectionsInteractor$updateTariffSelectorItems$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x008b, code lost:
    
        if (r3 != r5) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x008d, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0073, code lost:
    
        if (r3 == r5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:82:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(glw glwVar, PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState, ContinuationImpl continuationImpl) {
        UpdateIntercityDashboardSectionsInteractor$applyPrices$1 updateIntercityDashboardSectionsInteractor$applyPrices$1;
        int i;
        Object obj;
        gjw gjwVar;
        pex0 m;
        String str;
        String str2;
        Object obj2;
        glw glwVar2 = glwVar;
        PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState2 = priceUpdate$PriceLoadingState;
        if (continuationImpl instanceof UpdateIntercityDashboardSectionsInteractor$applyPrices$1) {
            updateIntercityDashboardSectionsInteractor$applyPrices$1 = (UpdateIntercityDashboardSectionsInteractor$applyPrices$1) continuationImpl;
            int i2 = updateIntercityDashboardSectionsInteractor$applyPrices$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                updateIntercityDashboardSectionsInteractor$applyPrices$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = updateIntercityDashboardSectionsInteractor$applyPrices$1.result;
                Object obj4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = updateIntercityDashboardSectionsInteractor$applyPrices$1.label;
                mcw mcwVar = null;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    mp60 mp60Var = glwVar2.c;
                    UpdateIntercityDashboardSectionsInteractor$applyPrices$dashboardSections$1 updateIntercityDashboardSectionsInteractor$applyPrices$dashboardSections$1 = new UpdateIntercityDashboardSectionsInteractor$applyPrices$dashboardSections$1(this, priceUpdate$PriceLoadingState2, null);
                    updateIntercityDashboardSectionsInteractor$applyPrices$1.L$0 = glwVar2;
                    updateIntercityDashboardSectionsInteractor$applyPrices$1.L$1 = priceUpdate$PriceLoadingState2;
                    updateIntercityDashboardSectionsInteractor$applyPrices$1.label = 1;
                    obj3 = e(mp60Var, new UpdateIntercityDashboardSectionsInteractor$updateTariffSelectorItemsInSection$2(this, updateIntercityDashboardSectionsInteractor$applyPrices$dashboardSections$1, null), updateIntercityDashboardSectionsInteractor$applyPrices$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        glwVar2 = (glw) updateIntercityDashboardSectionsInteractor$applyPrices$1.L$3;
                        priceUpdate$PriceLoadingState2 = (PriceUpdate$PriceLoadingState) updateIntercityDashboardSectionsInteractor$applyPrices$1.L$1;
                        kotlin.b.b(obj3);
                        glw a = glw.a(glwVar2, null, (mp60) obj3, false, HProv.PP_PASSWD_TERM);
                        if (priceUpdate$PriceLoadingState2 == PriceUpdate$PriceLoadingState.LOADED) {
                            mp60 mp60Var2 = a.c;
                            Object[] objArr = mp60Var2.a;
                            int i3 = mp60Var2.b;
                            int i4 = 0;
                            while (true) {
                                if (i4 >= i3) {
                                    obj = null;
                                    break;
                                }
                                obj = objArr[i4];
                                if (((hjw) obj) instanceof gjw) {
                                    break;
                                }
                                i4++;
                            }
                            if (!(obj instanceof gjw)) {
                                obj = null;
                            }
                            gjw gjwVar2 = (gjw) obj;
                            if (gjwVar2 != null) {
                                List list = gjwVar2.b;
                                if (!(list instanceof Collection) || !list.isEmpty()) {
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        if (((pkw) it.next()).d) {
                                            break;
                                        }
                                    }
                                }
                                jlw a2 = this.g.a();
                                glw glwVar3 = a2 instanceof glw ? (glw) a2 : null;
                                if (glwVar3 != null) {
                                    mp60 mp60Var3 = glwVar3.c;
                                    Object[] objArr2 = mp60Var3.a;
                                    int i5 = mp60Var3.b;
                                    int i6 = 0;
                                    while (true) {
                                        if (i6 >= i5) {
                                            obj2 = null;
                                            break;
                                        }
                                        obj2 = objArr2[i6];
                                        if (((hjw) obj2) instanceof gjw) {
                                            break;
                                        }
                                        i6++;
                                    }
                                    if (!(obj2 instanceof gjw)) {
                                        obj2 = null;
                                    }
                                    gjwVar = (gjw) obj2;
                                } else {
                                    gjwVar = null;
                                }
                                if (!jl40.l(gjwVar, gjwVar2)) {
                                    ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                                    Iterator it2 = list.iterator();
                                    while (it2.hasNext()) {
                                        arrayList.add(((pkw) it2.next()).b);
                                    }
                                    ybw ybwVar = this.f;
                                    acw acwVar = ybwVar.a;
                                    com.yandex.go.route.interactor.b bVar = acwVar.d;
                                    String a3 = acwVar.a();
                                    if (a3 != null && (m = ((com.yandex.go.taxi.tariffs.internal.repository.k) acwVar.c).m()) != null && (str = m.b) != null && (str2 = acwVar.b.a().h) != null) {
                                        Pair pair = new Pair("open_origin", a3);
                                        Pair pair2 = new Pair("preorder_tariff", str);
                                        Pair pair3 = new Pair("displayed_tariff", str2);
                                        Pair pair4 = new Pair("route", kotlin.collections.a.X(bVar.c().a(), null, null, null, new xuv(15), 31));
                                        d0l0 c = bVar.c();
                                        zzk0 zzk0Var = d0l0.Companion;
                                        mcwVar = new mcw("IntercityError.IntercityMain.EmptyTariffPrices", kotlin.collections.b.i(pair, pair2, pair3, pair4, new Pair("raw_route", kotlin.collections.a.X(c.d(false, false), null, null, null, new xuv(14), 31)), new Pair("fetch_price_tariff_classes", kotlin.collections.a.X(arrayList, Extension.FIX_SPACE, null, null, null, 62))));
                                    }
                                    if (mcwVar != null) {
                                        ybwVar.b.E(mcwVar);
                                    }
                                }
                            }
                        }
                        return a;
                    }
                    PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState3 = (PriceUpdate$PriceLoadingState) updateIntercityDashboardSectionsInteractor$applyPrices$1.L$1;
                    glw glwVar4 = (glw) updateIntercityDashboardSectionsInteractor$applyPrices$1.L$0;
                    kotlin.b.b(obj3);
                    priceUpdate$PriceLoadingState2 = priceUpdate$PriceLoadingState3;
                    glwVar2 = glwVar4;
                }
                updateIntercityDashboardSectionsInteractor$applyPrices$1.L$0 = null;
                updateIntercityDashboardSectionsInteractor$applyPrices$1.L$1 = priceUpdate$PriceLoadingState2;
                updateIntercityDashboardSectionsInteractor$applyPrices$1.L$2 = null;
                updateIntercityDashboardSectionsInteractor$applyPrices$1.L$3 = glwVar2;
                updateIntercityDashboardSectionsInteractor$applyPrices$1.label = 2;
                obj3 = e((mp60) obj3, new UpdateIntercityDashboardSectionsInteractor$updatePriceStateInTariffSelectorSection$2(this, null), updateIntercityDashboardSectionsInteractor$applyPrices$1);
            }
        }
        updateIntercityDashboardSectionsInteractor$applyPrices$1 = new UpdateIntercityDashboardSectionsInteractor$applyPrices$1(this, continuationImpl);
        Object obj32 = updateIntercityDashboardSectionsInteractor$applyPrices$1.result;
        Object obj42 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = updateIntercityDashboardSectionsInteractor$applyPrices$1.label;
        mcw mcwVar2 = null;
        if (i != 0) {
        }
        updateIntercityDashboardSectionsInteractor$applyPrices$1.L$0 = null;
        updateIntercityDashboardSectionsInteractor$applyPrices$1.L$1 = priceUpdate$PriceLoadingState2;
        updateIntercityDashboardSectionsInteractor$applyPrices$1.L$2 = null;
        updateIntercityDashboardSectionsInteractor$applyPrices$1.L$3 = glwVar2;
        updateIntercityDashboardSectionsInteractor$applyPrices$1.label = 2;
        obj32 = e((mp60) obj32, new UpdateIntercityDashboardSectionsInteractor$updatePriceStateInTariffSelectorSection$2(this, null), updateIntercityDashboardSectionsInteractor$applyPrices$1);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(glw glwVar, xfw xfwVar, ContinuationImpl continuationImpl) {
        UpdateIntercityDashboardSectionsInteractor$applyTariffChange$1 updateIntercityDashboardSectionsInteractor$applyTariffChange$1;
        int i;
        String str;
        if (continuationImpl instanceof UpdateIntercityDashboardSectionsInteractor$applyTariffChange$1) {
            updateIntercityDashboardSectionsInteractor$applyTariffChange$1 = (UpdateIntercityDashboardSectionsInteractor$applyTariffChange$1) continuationImpl;
            int i2 = updateIntercityDashboardSectionsInteractor$applyTariffChange$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                updateIntercityDashboardSectionsInteractor$applyTariffChange$1.label = i2 - Integer.MIN_VALUE;
                Object obj = updateIntercityDashboardSectionsInteractor$applyTariffChange$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = updateIntercityDashboardSectionsInteractor$applyTariffChange$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str2 = xfwVar.a;
                    mp60 mp60Var = glwVar.c;
                    UpdateIntercityDashboardSectionsInteractor$applyTariffChange$2 updateIntercityDashboardSectionsInteractor$applyTariffChange$2 = new UpdateIntercityDashboardSectionsInteractor$applyTariffChange$2(this, xfwVar, null);
                    updateIntercityDashboardSectionsInteractor$applyTariffChange$1.L$0 = null;
                    updateIntercityDashboardSectionsInteractor$applyTariffChange$1.L$1 = null;
                    updateIntercityDashboardSectionsInteractor$applyTariffChange$1.L$2 = glwVar;
                    updateIntercityDashboardSectionsInteractor$applyTariffChange$1.L$3 = str2;
                    updateIntercityDashboardSectionsInteractor$applyTariffChange$1.label = 1;
                    Object e = e(mp60Var, new UpdateIntercityDashboardSectionsInteractor$updateTariffSelectorItemsInSection$2(this, updateIntercityDashboardSectionsInteractor$applyTariffChange$2, null), updateIntercityDashboardSectionsInteractor$applyTariffChange$1);
                    if (e == obj2) {
                        return obj2;
                    }
                    obj = e;
                    str = str2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) updateIntercityDashboardSectionsInteractor$applyTariffChange$1.L$3;
                    glwVar = (glw) updateIntercityDashboardSectionsInteractor$applyTariffChange$1.L$2;
                    kotlin.b.b(obj);
                }
                return glw.a(glwVar, str, (mp60) obj, false, 122);
            }
        }
        updateIntercityDashboardSectionsInteractor$applyTariffChange$1 = new UpdateIntercityDashboardSectionsInteractor$applyTariffChange$1(this, continuationImpl);
        Object obj3 = updateIntercityDashboardSectionsInteractor$applyTariffChange$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = updateIntercityDashboardSectionsInteractor$applyTariffChange$1.label;
        if (i != 0) {
        }
        return glw.a(glwVar, str, (mp60) obj3, false, 122);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x008d -> B:10:0x0090). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0097 -> B:11:0x009a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(mp60 mp60Var, wls wlsVar, ContinuationImpl continuationImpl) {
        UpdateIntercityDashboardSectionsInteractor$copyTariffSelectorSection$1 updateIntercityDashboardSectionsInteractor$copyTariffSelectorSection$1;
        int i;
        int i2;
        xy40 xy40Var;
        wls wlsVar2;
        int i3;
        Object[] objArr;
        xy40 xy40Var2;
        if (continuationImpl instanceof UpdateIntercityDashboardSectionsInteractor$copyTariffSelectorSection$1) {
            updateIntercityDashboardSectionsInteractor$copyTariffSelectorSection$1 = (UpdateIntercityDashboardSectionsInteractor$copyTariffSelectorSection$1) continuationImpl;
            int i4 = updateIntercityDashboardSectionsInteractor$copyTariffSelectorSection$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                updateIntercityDashboardSectionsInteractor$copyTariffSelectorSection$1.label = i4 - Integer.MIN_VALUE;
                Object obj = updateIntercityDashboardSectionsInteractor$copyTariffSelectorSection$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = updateIntercityDashboardSectionsInteractor$copyTariffSelectorSection$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    xy40 xy40Var3 = new xy40(mp60Var.b);
                    Object[] objArr2 = mp60Var.a;
                    i2 = mp60Var.b;
                    xy40Var = xy40Var3;
                    wlsVar2 = wlsVar;
                    i3 = 0;
                    objArr = objArr2;
                    xy40Var2 = xy40Var;
                    if (i3 >= i2) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = updateIntercityDashboardSectionsInteractor$copyTariffSelectorSection$1.I$1;
                    i3 = updateIntercityDashboardSectionsInteractor$copyTariffSelectorSection$1.I$0;
                    xy40Var2 = (xy40) updateIntercityDashboardSectionsInteractor$copyTariffSelectorSection$1.L$7;
                    objArr = (Object[]) updateIntercityDashboardSectionsInteractor$copyTariffSelectorSection$1.L$5;
                    xy40 xy40Var4 = (xy40) updateIntercityDashboardSectionsInteractor$copyTariffSelectorSection$1.L$3;
                    xy40Var = (xy40) updateIntercityDashboardSectionsInteractor$copyTariffSelectorSection$1.L$2;
                    wls wlsVar3 = (wls) updateIntercityDashboardSectionsInteractor$copyTariffSelectorSection$1.L$1;
                    kotlin.b.b(obj);
                    xy40 xy40Var5 = xy40Var;
                    hjw hjwVar = (hjw) obj;
                    wlsVar2 = wlsVar3;
                    xy40 xy40Var6 = xy40Var5;
                    xy40Var2.g(hjwVar);
                    i3++;
                    xy40Var2 = xy40Var4;
                    xy40Var = xy40Var6;
                    if (i3 >= i2) {
                        hjw hjwVar2 = (hjw) objArr[i3];
                        if (hjwVar2 instanceof gjw) {
                            updateIntercityDashboardSectionsInteractor$copyTariffSelectorSection$1.L$0 = null;
                            updateIntercityDashboardSectionsInteractor$copyTariffSelectorSection$1.L$1 = wlsVar2;
                            updateIntercityDashboardSectionsInteractor$copyTariffSelectorSection$1.L$2 = xy40Var;
                            updateIntercityDashboardSectionsInteractor$copyTariffSelectorSection$1.L$3 = xy40Var2;
                            updateIntercityDashboardSectionsInteractor$copyTariffSelectorSection$1.L$4 = null;
                            updateIntercityDashboardSectionsInteractor$copyTariffSelectorSection$1.L$5 = objArr;
                            updateIntercityDashboardSectionsInteractor$copyTariffSelectorSection$1.L$6 = null;
                            updateIntercityDashboardSectionsInteractor$copyTariffSelectorSection$1.L$7 = xy40Var2;
                            updateIntercityDashboardSectionsInteractor$copyTariffSelectorSection$1.I$0 = i3;
                            updateIntercityDashboardSectionsInteractor$copyTariffSelectorSection$1.I$1 = i2;
                            updateIntercityDashboardSectionsInteractor$copyTariffSelectorSection$1.label = 1;
                            Object invoke = wlsVar2.invoke(hjwVar2, updateIntercityDashboardSectionsInteractor$copyTariffSelectorSection$1);
                            if (invoke == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            wlsVar3 = wlsVar2;
                            obj = invoke;
                            xy40Var4 = xy40Var2;
                            xy40 xy40Var52 = xy40Var;
                            hjw hjwVar3 = (hjw) obj;
                            wlsVar2 = wlsVar3;
                            xy40 xy40Var62 = xy40Var52;
                            xy40Var2.g(hjwVar3);
                            i3++;
                            xy40Var2 = xy40Var4;
                            xy40Var = xy40Var62;
                            if (i3 >= i2) {
                                return xy40Var;
                            }
                        } else {
                            xy40Var62 = xy40Var;
                            hjwVar3 = hjwVar2;
                            xy40Var4 = xy40Var2;
                            xy40Var2.g(hjwVar3);
                            i3++;
                            xy40Var2 = xy40Var4;
                            xy40Var = xy40Var62;
                            if (i3 >= i2) {
                            }
                        }
                    }
                }
            }
        }
        updateIntercityDashboardSectionsInteractor$copyTariffSelectorSection$1 = new UpdateIntercityDashboardSectionsInteractor$copyTariffSelectorSection$1(this, continuationImpl);
        Object obj2 = updateIntercityDashboardSectionsInteractor$copyTariffSelectorSection$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = updateIntercityDashboardSectionsInteractor$copyTariffSelectorSection$1.label;
        if (i != 0) {
        }
    }
}
