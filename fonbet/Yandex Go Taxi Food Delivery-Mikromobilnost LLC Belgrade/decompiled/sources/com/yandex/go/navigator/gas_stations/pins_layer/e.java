package com.yandex.go.navigator.gas_stations.pins_layer;

import defpackage.bl00;
import defpackage.cws;
import defpackage.dws;
import defpackage.g050;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.uts;
import defpackage.vpr;
import defpackage.xvs;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class e implements vpr {
    public final /* synthetic */ h a;

    public e(h hVar) {
        this.a = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00e7 A[Catch: all -> 0x008c, TryCatch #0 {all -> 0x008c, blocks: (B:20:0x0087, B:21:0x011b, B:22:0x00e1, B:24:0x00e7, B:29:0x0126, B:37:0x00c2), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0126 A[Catch: all -> 0x008c, TRY_LEAVE, TryCatch #0 {all -> 0x008c, blocks: (B:20:0x0087, B:21:0x011b, B:22:0x00e1, B:24:0x00e7, B:29:0x0126, B:37:0x00c2), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x011a -> B:21:0x011b). Please report as a decompilation issue!!! */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        GasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1 gasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1;
        int i;
        g050 g050Var;
        Collection arrayList;
        Set set;
        Iterator it;
        uts utsVar;
        xvs xvsVar;
        try {
            if (continuation instanceof GasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1) {
                gasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1 = (GasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1) continuation;
                int i2 = gasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    gasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1.label = i2 - Integer.MIN_VALUE;
                    Object obj2 = gasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = gasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1.label;
                    h hVar = this.a;
                    if (i != 0) {
                        kotlin.b.b(obj2);
                        kotlinx.coroutines.sync.a aVar = hVar.M;
                        gasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1.L$0 = null;
                        gasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1.L$1 = null;
                        gasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1.L$2 = null;
                        gasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1.L$3 = aVar;
                        gasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1.L$4 = null;
                        gasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1.label = 1;
                        if (aVar.a(gasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1) != coroutineSingletons) {
                            g050Var = aVar;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            xvsVar = (xvs) gasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1.L$7;
                            utsVar = (uts) gasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1.L$6;
                            kotlin.b.b(obj2);
                            xvsVar.render(new dws(uts.a(utsVar, (bl00) obj2)));
                            return zy11.a;
                        }
                        uts utsVar2 = (uts) gasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1.L$13;
                        arrayList = (Collection) gasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1.L$12;
                        it = (Iterator) gasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1.L$9;
                        Collection collection = (Collection) gasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1.L$8;
                        set = (Set) gasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1.L$5;
                        g050Var = (g050) gasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1.L$3;
                        kotlin.b.b(obj2);
                        arrayList.add(uts.a(utsVar2, (bl00) obj2));
                        arrayList = collection;
                        if (!it.hasNext()) {
                            utsVar2 = (uts) it.next();
                            gasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1.L$0 = null;
                            gasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1.L$1 = null;
                            gasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1.L$2 = null;
                            gasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1.L$3 = g050Var;
                            gasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1.L$4 = null;
                            gasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1.L$5 = set;
                            gasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1.L$6 = null;
                            gasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1.L$7 = null;
                            gasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1.L$8 = arrayList;
                            gasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1.L$9 = it;
                            gasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1.L$10 = null;
                            gasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1.L$11 = null;
                            gasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1.L$12 = arrayList;
                            gasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1.L$13 = utsVar2;
                            gasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1.label = 2;
                            obj2 = hVar.F.a(utsVar2.e, utsVar2.f, gasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1, false);
                            if (obj2 != coroutineSingletons) {
                                collection = arrayList;
                                arrayList.add(uts.a(utsVar2, (bl00) obj2));
                                arrayList = collection;
                                if (!it.hasNext()) {
                                    Pair pair = new Pair(set, (List) arrayList);
                                    g050Var.d(null);
                                    ((xvs) hVar.Dg()).render(new cws((Set) pair.getFirst(), (List) pair.getSecond()));
                                    uts utsVar3 = hVar.O;
                                    if (utsVar3 != null) {
                                        xvs xvsVar2 = (xvs) hVar.Dg();
                                        gasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1.L$0 = null;
                                        gasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1.L$1 = null;
                                        gasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1.L$2 = null;
                                        gasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1.L$3 = null;
                                        gasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1.L$4 = null;
                                        gasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1.L$5 = null;
                                        gasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1.L$6 = utsVar3;
                                        gasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1.L$7 = xvsVar2;
                                        gasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1.L$8 = null;
                                        gasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1.L$9 = null;
                                        gasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1.L$10 = null;
                                        gasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1.L$11 = null;
                                        gasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1.L$12 = null;
                                        gasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1.L$13 = null;
                                        gasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1.label = 3;
                                        Object a = hVar.F.a(utsVar3.e, utsVar3.f, gasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1, true);
                                        if (a != coroutineSingletons) {
                                            utsVar = utsVar3;
                                            obj2 = a;
                                            xvsVar = xvsVar2;
                                            xvsVar.render(new dws(uts.a(utsVar, (bl00) obj2)));
                                        }
                                    }
                                    return zy11.a;
                                }
                            }
                        }
                        return coroutineSingletons;
                    }
                    g050 g050Var2 = (g050) gasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1.L$3;
                    kotlin.b.b(obj2);
                    g050Var = g050Var2;
                    Set keySet = hVar.N.keySet();
                    Collection values = hVar.N.values();
                    arrayList = new ArrayList(tcc.n(values, 10));
                    set = keySet;
                    it = values.iterator();
                    if (!it.hasNext()) {
                    }
                    return coroutineSingletons;
                }
            }
            if (i != 0) {
            }
            Set keySet2 = hVar.N.keySet();
            Collection values2 = hVar.N.values();
            arrayList = new ArrayList(tcc.n(values2, 10));
            set = keySet2;
            it = values2.iterator();
            if (!it.hasNext()) {
            }
            return coroutineSingletons;
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
        gasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1 = new GasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1(this, continuation);
        Object obj22 = gasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = gasStationsPinsLayerPresenter$observeThemeChanged$$inlined$safeCollectIn$1$2$1.label;
        h hVar2 = this.a;
    }
}
