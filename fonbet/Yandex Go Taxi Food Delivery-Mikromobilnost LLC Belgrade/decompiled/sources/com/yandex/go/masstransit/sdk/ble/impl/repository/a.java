package com.yandex.go.masstransit.sdk.ble.impl.repository;

import defpackage.cm30;
import defpackage.fkn;
import defpackage.jup0;
import defpackage.ny61;
import defpackage.p2v;
import defpackage.tcc;
import defpackage.u26;
import defpackage.uj40;
import defpackage.uvp0;
import defpackage.vpr;
import defpackage.w26;
import defpackage.x26;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class a implements vpr {
    public final /* synthetic */ b a;
    public final /* synthetic */ u26 b;

    public a(b bVar, u26 u26Var) {
        this.a = bVar;
        this.b = u26Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(List list, Continuation continuation) {
        MtGeoVehiclesRepository$listenBleScanResults$1$1$emit$1 mtGeoVehiclesRepository$listenBleScanResults$1$1$emit$1;
        int i;
        b bVar;
        boolean z;
        List list2;
        Object value;
        boolean contains;
        Object value2;
        Object value3;
        List list3;
        if (continuation instanceof MtGeoVehiclesRepository$listenBleScanResults$1$1$emit$1) {
            mtGeoVehiclesRepository$listenBleScanResults$1$1$emit$1 = (MtGeoVehiclesRepository$listenBleScanResults$1$1$emit$1) continuation;
            int i2 = mtGeoVehiclesRepository$listenBleScanResults$1$1$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtGeoVehiclesRepository$listenBleScanResults$1$1$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtGeoVehiclesRepository$listenBleScanResults$1$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtGeoVehiclesRepository$listenBleScanResults$1$1$emit$1.label;
                bVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    z = false;
                    if (list == null) {
                        r0 r0Var = bVar.l;
                        do {
                            value3 = r0Var.getValue();
                        } while (!r0Var.k(value3, uj40.d));
                    } else {
                        if (!list.isEmpty()) {
                            boolean isEmpty = bVar.i.isEmpty();
                            u26 u26Var = this.b;
                            if (isEmpty) {
                                bVar.i = new ArrayList(list);
                                mtGeoVehiclesRepository$listenBleScanResults$1$1$emit$1.L$0 = list;
                                mtGeoVehiclesRepository$listenBleScanResults$1$1$emit$1.I$0 = 0;
                                mtGeoVehiclesRepository$listenBleScanResults$1$1$emit$1.label = 1;
                                obj = b.a(bVar, u26Var, list, mtGeoVehiclesRepository$listenBleScanResults$1$1$emit$1);
                                if (obj != coroutineSingletons) {
                                    list2 = list;
                                    z = ((cm30) obj).a;
                                }
                            } else {
                                List list4 = list;
                                List k0 = kotlin.collections.a.k0(list4, kotlin.collections.a.N0(bVar.i));
                                List k02 = kotlin.collections.a.k0(bVar.i, kotlin.collections.a.N0(list4));
                                bVar.i = new ArrayList(list);
                                if (!k02.isEmpty()) {
                                    r0 r0Var2 = bVar.l;
                                    List list5 = k02;
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj2 : list5) {
                                        if (obj2 instanceof x26) {
                                            arrayList.add(obj2);
                                        }
                                    }
                                    Set N0 = kotlin.collections.a.N0(arrayList);
                                    ArrayList arrayList2 = new ArrayList();
                                    for (Object obj3 : list5) {
                                        if (obj3 instanceof w26) {
                                            arrayList2.add(obj3);
                                        }
                                    }
                                    ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
                                    Iterator it = arrayList2.iterator();
                                    while (it.hasNext()) {
                                        arrayList3.add(((w26) it.next()).a);
                                    }
                                    Set N02 = kotlin.collections.a.N0(arrayList3);
                                    List list6 = ((uj40) r0Var2.getValue()).a;
                                    ArrayList arrayList4 = new ArrayList();
                                    for (Object obj4 : list6) {
                                        uvp0 c = ((jup0) obj4).c();
                                        if (c instanceof p2v) {
                                            p2v p2vVar = (p2v) c;
                                            contains = N0.contains(new x26(p2vVar.a, p2vVar.b, p2vVar.c));
                                        } else {
                                            contains = c instanceof fkn ? N02.contains(((fkn) c).a) : false;
                                        }
                                        if (!contains) {
                                            arrayList4.add(obj4);
                                        }
                                    }
                                    do {
                                        value = r0Var2.getValue();
                                    } while (!r0Var2.k(value, uj40.a((uj40) value, arrayList4)));
                                }
                                if (k0.isEmpty()) {
                                    z = false;
                                } else {
                                    mtGeoVehiclesRepository$listenBleScanResults$1$1$emit$1.L$0 = list;
                                    mtGeoVehiclesRepository$listenBleScanResults$1$1$emit$1.L$1 = null;
                                    mtGeoVehiclesRepository$listenBleScanResults$1$1$emit$1.L$2 = null;
                                    mtGeoVehiclesRepository$listenBleScanResults$1$1$emit$1.I$0 = 0;
                                    mtGeoVehiclesRepository$listenBleScanResults$1$1$emit$1.label = 2;
                                    obj = b.a(bVar, u26Var, k0, mtGeoVehiclesRepository$listenBleScanResults$1$1$emit$1);
                                    if (obj != coroutineSingletons) {
                                        list2 = list;
                                        z = ((cm30) obj).a;
                                    }
                                }
                            }
                            return coroutineSingletons;
                        }
                        r0 r0Var3 = bVar.l;
                        do {
                            value2 = r0Var3.getValue();
                        } while (!r0Var3.k(value2, uj40.e));
                    }
                    list2 = list;
                } else if (i == 1) {
                    list2 = (List) mtGeoVehiclesRepository$listenBleScanResults$1$1$emit$1.L$0;
                    kotlin.b.b(obj);
                    z = ((cm30) obj).a;
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list2 = (List) mtGeoVehiclesRepository$listenBleScanResults$1$1$emit$1.L$0;
                    kotlin.b.b(obj);
                    z = ((cm30) obj).a;
                }
                list3 = list2;
                if (list3 != null && !list3.isEmpty() && !z) {
                    bVar.c.c();
                }
                return zy11.a;
            }
        }
        mtGeoVehiclesRepository$listenBleScanResults$1$1$emit$1 = new MtGeoVehiclesRepository$listenBleScanResults$1$1$emit$1(this, continuation);
        Object obj5 = mtGeoVehiclesRepository$listenBleScanResults$1$1$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtGeoVehiclesRepository$listenBleScanResults$1$1$emit$1.label;
        bVar = this.a;
        if (i != 0) {
        }
        list3 = list2;
        if (list3 != null) {
            bVar.c.c();
        }
        return zy11.a;
    }
}
