package com.yandex.go.masstransit.sdk.ble.impl.repository;

import com.yandex.go.masstransit.sdk.ble.impl.ble.f;
import com.yandex.go.masstransit.sdk.ble.impl.domain.ResponseLoadingState;
import com.yandex.go.masstransit.sdk.ble.impl.network.MtPaymentBleParam;
import com.yandex.go.masstransit.sdk.ble.impl.network.MtPaymentBleResponse;
import com.yandex.go.masstransit.sdk.ble.impl.network.PaymentBleApi;
import defpackage.b64;
import defpackage.bvf0;
import defpackage.cm30;
import defpackage.cmt;
import defpackage.em30;
import defpackage.fkn;
import defpackage.fmt;
import defpackage.fwp0;
import defpackage.gm30;
import defpackage.gtq0;
import defpackage.i3y;
import defpackage.j26;
import defpackage.jl40;
import defpackage.jo2;
import defpackage.jup0;
import defpackage.m020;
import defpackage.n310;
import defpackage.ny61;
import defpackage.on2;
import defpackage.oyr;
import defpackage.p2v;
import defpackage.p310;
import defpackage.pzt0;
import defpackage.s8o;
import defpackage.sj40;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.u26;
import defpackage.u310;
import defpackage.uj40;
import defpackage.uvp0;
import defpackage.v26;
import defpackage.w26;
import defpackage.w511;
import defpackage.wk30;
import defpackage.x26;
import defpackage.x4e;
import defpackage.xby;
import defpackage.yk30;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class b {
    public final com.yandex.go.masstransit.sdk.client_api.a a;
    public final on2 b;
    public final f c;
    public final j26 d;
    public final yk30 e;
    public final u310 f;
    public final p310 g;
    public int j;
    public Integer k;
    public pzt0 n;
    public final i3y h = kotlin.a.a(new m020(24, this));
    public ArrayList i = new ArrayList();
    public final r0 l = bvf0.c(uj40.d);
    public final r0 m = bvf0.c(Boolean.FALSE);

    public b(com.yandex.go.masstransit.sdk.client_api.a aVar, on2 on2Var, f fVar, j26 j26Var, yk30 yk30Var, u310 u310Var, p310 p310Var) {
        this.a = aVar;
        this.b = on2Var;
        this.c = fVar;
        this.d = j26Var;
        this.e = yk30Var;
        this.f = u310Var;
        this.g = p310Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0101 A[LOOP:0: B:13:0x0101->B:15:0x0117, LOOP_START, PHI: r2
      0x0101: PHI (r2v34 com.yandex.go.masstransit.sdk.ble.impl.ble.f) = (r2v13 com.yandex.go.masstransit.sdk.ble.impl.ble.f), (r2v37 com.yandex.go.masstransit.sdk.ble.impl.ble.f) binds: [B:12:0x00ff, B:15:0x0117] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00ba  */
    /* JADX WARN: Type inference failed for: r22v0, types: [com.yandex.go.masstransit.sdk.ble.impl.repository.b] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x00e2 -> B:10:0x005c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, u26 u26Var, List list, ContinuationImpl continuationImpl) {
        MtGeoVehiclesRepository$requestBatches$1 mtGeoVehiclesRepository$requestBatches$1;
        int i;
        int i2;
        String str;
        Iterator it;
        int i3;
        String str2;
        int i4;
        int i5;
        int i6;
        ArrayList arrayList;
        List list2;
        int i7;
        int i8;
        String str3;
        int i9;
        cm30 cm30Var;
        boolean z;
        int size;
        Integer num;
        f fVar;
        Object value;
        Object value2;
        Object value3;
        Object value4;
        f fVar2 = bVar.c;
        r0 r0Var = bVar.m;
        r0 r0Var2 = bVar.l;
        if (continuationImpl instanceof MtGeoVehiclesRepository$requestBatches$1) {
            mtGeoVehiclesRepository$requestBatches$1 = (MtGeoVehiclesRepository$requestBatches$1) continuationImpl;
            int i10 = mtGeoVehiclesRepository$requestBatches$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                mtGeoVehiclesRepository$requestBatches$1.label = i10 - Integer.MIN_VALUE;
                Object obj = mtGeoVehiclesRepository$requestBatches$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtGeoVehiclesRepository$requestBatches$1.label;
                if (i != 0) {
                    i2 = 1;
                    str = null;
                    kotlin.b.b(obj);
                    boolean isEmpty = list.isEmpty();
                    int i11 = bVar.j;
                    if (isEmpty) {
                        return new cm30(0, i11, null, false, false);
                    }
                    int i12 = i11 + 1;
                    bVar.j = i12;
                    while (true) {
                        Object value5 = r0Var.getValue();
                        ((Boolean) value5).getClass();
                        if (r0Var.k(value5, Boolean.TRUE)) {
                            break;
                        }
                        str = null;
                    }
                    ArrayList F = kotlin.collections.a.F(list, u26Var.c);
                    it = F.iterator();
                    i3 = i12;
                    str2 = str;
                    i4 = 0;
                    i5 = 0;
                    i6 = 0;
                    arrayList = F;
                    list2 = list;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i13 = mtGeoVehiclesRepository$requestBatches$1.I$3;
                    i5 = mtGeoVehiclesRepository$requestBatches$1.I$2;
                    i6 = mtGeoVehiclesRepository$requestBatches$1.I$1;
                    i3 = mtGeoVehiclesRepository$requestBatches$1.I$0;
                    List list3 = (List) mtGeoVehiclesRepository$requestBatches$1.L$5;
                    it = (Iterator) mtGeoVehiclesRepository$requestBatches$1.L$4;
                    ?? r9 = (List) mtGeoVehiclesRepository$requestBatches$1.L$3;
                    str2 = (String) mtGeoVehiclesRepository$requestBatches$1.L$2;
                    List list4 = (List) mtGeoVehiclesRepository$requestBatches$1.L$1;
                    kotlin.b.b(obj);
                    int i14 = i13;
                    List list5 = list3;
                    ArrayList arrayList2 = r9;
                    Object obj2 = obj;
                    Iterator it2 = it;
                    int i15 = i3;
                    uj40 uj40Var = (uj40) obj2;
                    if (jl40.l(list5, arrayList2.get(arrayList2.size() - 1))) {
                        fVar = fVar2;
                    } else {
                        while (true) {
                            Object value6 = r0Var.getValue();
                            ((Boolean) value6).getClass();
                            fVar = fVar2;
                            if (r0Var.k(value6, Boolean.FALSE)) {
                                break;
                            }
                            fVar2 = fVar;
                        }
                    }
                    ResponseLoadingState responseLoadingState = uj40Var.b;
                    List list6 = uj40Var.a;
                    r0 r0Var3 = r0Var;
                    if (responseLoadingState != ResponseLoadingState.ERROR) {
                        sj40 sj40Var = uj40Var.c;
                        Integer M = sj40Var != null ? s8o.M(sj40Var.a) : null;
                        if ((M != null && M.intValue() == 500) || (M != null && M.intValue() == 504)) {
                            bVar.i.removeAll(list5);
                            if (bVar.i.isEmpty()) {
                                fVar.a();
                                do {
                                    value4 = r0Var2.getValue();
                                } while (!r0Var2.k(value4, uj40Var));
                                i4 = 1;
                            } else {
                                i4 = i14;
                            }
                            list2 = list4;
                            i7 = i5;
                            i8 = i6;
                        } else {
                            bVar.i.clear();
                            fVar.a();
                            do {
                                value3 = r0Var2.getValue();
                            } while (!r0Var2.k(value3, uj40Var));
                            list2 = list4;
                            i7 = i5;
                            i8 = i6;
                            i4 = 1;
                        }
                        str3 = str2;
                        i9 = i15;
                        boolean z2 = i4 == 0;
                        boolean z3 = i7 == 0;
                        cm30Var = new cm30(i8, i9, str3, z2, z3);
                        z = z3;
                        size = list2.size();
                        if (!z || ((num = bVar.k) != null && num.intValue() == i9)) {
                            return cm30Var;
                        }
                        bVar.k = Integer.valueOf(i9);
                        p310 p310Var = bVar.g;
                        int size2 = ((uj40) r0Var2.getValue()).a.size();
                        n310 n310Var = p310Var.a;
                        n310Var.getClass();
                        HashMap hashMap = new HashMap();
                        if (str3 != null) {
                            hashMap.put("request_id", str3);
                        }
                        b64.B(size, hashMap, "beacons_scanned_count", i8, "items_received_count");
                        n310Var.a.a("MasstransitPayment.BleVehicles.BleAlgorithmFinished", hashMap, 1, x4e.n(size2, hashMap, "vehicles_displayed_count"));
                        return cm30Var;
                    }
                    int size3 = list6.size() + i6;
                    String str4 = bVar.e.a.a;
                    ArrayList m0 = kotlin.collections.a.m0(list6, ((uj40) r0Var2.getValue()).a);
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it3 = m0.iterator();
                    while (it3.hasNext()) {
                        Object next = it3.next();
                        if (((jup0) next).b() != null) {
                            arrayList3.add(next);
                        }
                    }
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it4 = arrayList3.iterator();
                    while (it4.hasNext()) {
                        Object next2 = it4.next();
                        if (hashSet.add(((jup0) next2).b())) {
                            arrayList4.add(next2);
                        }
                    }
                    if (((uj40) r0Var2.getValue()).b != ResponseLoadingState.LOADED) {
                        do {
                            value2 = r0Var2.getValue();
                        } while (!r0Var2.k(value2, uj40.a(uj40Var, arrayList4)));
                    } else {
                        do {
                            value = r0Var2.getValue();
                        } while (!r0Var2.k(value, uj40.a((uj40) value, arrayList4)));
                    }
                    i6 = size3;
                    str2 = str4;
                    list2 = list4;
                    i4 = i14;
                    arrayList = arrayList2;
                    i3 = i15;
                    it = it2;
                    fVar2 = fVar;
                    r0Var = r0Var3;
                    i5 = 1;
                    i2 = 1;
                    str = null;
                    if (it.hasNext()) {
                        i7 = i5;
                        i8 = i6;
                        str3 = str2;
                        i9 = i3;
                        if (i4 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        cm30Var = new cm30(i8, i9, str3, z2, z3);
                        z = z3;
                        size = list2.size();
                        if (!z) {
                            bVar.k = Integer.valueOf(i9);
                            p310 p310Var2 = bVar.g;
                            int size22 = ((uj40) r0Var2.getValue()).a.size();
                            n310 n310Var2 = p310Var2.a;
                            n310Var2.getClass();
                            HashMap hashMap2 = new HashMap();
                            if (str3 != null) {
                            }
                            b64.B(size, hashMap2, "beacons_scanned_count", i8, "items_received_count");
                            n310Var2.a.a("MasstransitPayment.BleVehicles.BleAlgorithmFinished", hashMap2, 1, x4e.n(size22, hashMap2, "vehicles_displayed_count"));
                            return cm30Var;
                        }
                        return cm30Var;
                    }
                    List list7 = (List) it.next();
                    mtGeoVehiclesRepository$requestBatches$1.L$0 = str;
                    mtGeoVehiclesRepository$requestBatches$1.L$1 = list2;
                    mtGeoVehiclesRepository$requestBatches$1.L$2 = str2;
                    mtGeoVehiclesRepository$requestBatches$1.L$3 = arrayList;
                    mtGeoVehiclesRepository$requestBatches$1.L$4 = it;
                    mtGeoVehiclesRepository$requestBatches$1.L$5 = list7;
                    mtGeoVehiclesRepository$requestBatches$1.I$0 = i3;
                    mtGeoVehiclesRepository$requestBatches$1.I$1 = i6;
                    mtGeoVehiclesRepository$requestBatches$1.I$2 = i5;
                    mtGeoVehiclesRepository$requestBatches$1.I$3 = i4;
                    mtGeoVehiclesRepository$requestBatches$1.label = i2;
                    Object e = bVar.e(list7, mtGeoVehiclesRepository$requestBatches$1);
                    if (e == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    list4 = list2;
                    obj2 = e;
                    ArrayList arrayList5 = arrayList;
                    i14 = i4;
                    list5 = list7;
                    arrayList2 = arrayList5;
                    Iterator it22 = it;
                    int i152 = i3;
                    uj40 uj40Var2 = (uj40) obj2;
                    if (jl40.l(list5, arrayList2.get(arrayList2.size() - 1))) {
                    }
                    ResponseLoadingState responseLoadingState2 = uj40Var2.b;
                    List list62 = uj40Var2.a;
                    r0 r0Var32 = r0Var;
                    if (responseLoadingState2 != ResponseLoadingState.ERROR) {
                    }
                }
            }
        }
        mtGeoVehiclesRepository$requestBatches$1 = new MtGeoVehiclesRepository$requestBatches$1(bVar, continuationImpl);
        Object obj3 = mtGeoVehiclesRepository$requestBatches$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtGeoVehiclesRepository$requestBatches$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005e A[Catch: all -> 0x002e, CancellationException -> 0x0075, TryCatch #2 {CancellationException -> 0x0075, all -> 0x002e, blocks: (B:11:0x002a, B:12:0x0050, B:14:0x005e, B:15:0x0069, B:22:0x0039), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(b bVar, MtPaymentBleParam mtPaymentBleParam, ContinuationImpl continuationImpl) {
        MtGeoVehiclesRepository$requestPaymentBleUUIDsFromNet$1 mtGeoVehiclesRepository$requestPaymentBleUUIDsFromNet$1;
        int i;
        fmt fmtVar;
        u310 u310Var = bVar.f;
        try {
            if (continuationImpl instanceof MtGeoVehiclesRepository$requestPaymentBleUUIDsFromNet$1) {
                mtGeoVehiclesRepository$requestPaymentBleUUIDsFromNet$1 = (MtGeoVehiclesRepository$requestPaymentBleUUIDsFromNet$1) continuationImpl;
                int i2 = mtGeoVehiclesRepository$requestPaymentBleUUIDsFromNet$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    mtGeoVehiclesRepository$requestPaymentBleUUIDsFromNet$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = mtGeoVehiclesRepository$requestPaymentBleUUIDsFromNet$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = mtGeoVehiclesRepository$requestPaymentBleUUIDsFromNet$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        cmt<MtPaymentBleResponse> a = ((PaymentBleApi) bVar.h.getValue()).a(mtPaymentBleParam);
                        mtGeoVehiclesRepository$requestPaymentBleUUIDsFromNet$1.L$0 = null;
                        mtGeoVehiclesRepository$requestPaymentBleUUIDsFromNet$1.label = 1;
                        obj = ru.yandex.taxi.network.api.a.b(a, null, mtGeoVehiclesRepository$requestPaymentBleUUIDsFromNet$1);
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
                    fmtVar = (fmt) obj;
                    if (((MtPaymentBleResponse) fmtVar.a).a.isEmpty()) {
                        u310Var.a(fmtVar.e.a("X-YaMasstransitRequestId"));
                    }
                    return new gm30(((MtPaymentBleResponse) fmtVar.a).a);
                }
            }
            if (i != 0) {
            }
            fmtVar = (fmt) obj;
            if (((MtPaymentBleResponse) fmtVar.a).a.isEmpty()) {
            }
            return new gm30(((MtPaymentBleResponse) fmtVar.a).a);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            xby.d.k(th, "Error getting payment ble uuids");
            u310Var.a(gtq0.y(s8o.O(th)));
            return new em30(th);
        }
        mtGeoVehiclesRepository$requestPaymentBleUUIDsFromNet$1 = new MtGeoVehiclesRepository$requestPaymentBleUUIDsFromNet$1(bVar, continuationImpl);
        Object obj2 = mtGeoVehiclesRepository$requestPaymentBleUUIDsFromNet$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtGeoVehiclesRepository$requestPaymentBleUUIDsFromNet$1.label;
    }

    public final void c(u26 u26Var, tse tseVar) {
        tje.N(tseVar, null, null, new MtGeoVehiclesRepository$listenBleScanResults$1(u26Var, this, null), 3);
    }

    public final void d(u26 u26Var, tse tseVar) {
        pzt0 pzt0Var = this.n;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.n = tje.N(tseVar, null, null, new MtGeoVehiclesRepository$refreshScan$1(u26Var, this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(List list, ContinuationImpl continuationImpl) {
        MtGeoVehiclesRepository$requestSearchFromNet$1 mtGeoVehiclesRepository$requestSearchFromNet$1;
        int i;
        uvp0 fknVar;
        Throwable a;
        if (continuationImpl instanceof MtGeoVehiclesRepository$requestSearchFromNet$1) {
            mtGeoVehiclesRepository$requestSearchFromNet$1 = (MtGeoVehiclesRepository$requestSearchFromNet$1) continuationImpl;
            int i2 = mtGeoVehiclesRepository$requestSearchFromNet$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtGeoVehiclesRepository$requestSearchFromNet$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtGeoVehiclesRepository$requestSearchFromNet$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtGeoVehiclesRepository$requestSearchFromNet$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    zzs a2 = this.d.a();
                    String p = a2 != null ? oyr.p("[", a2.b(), "]") : null;
                    List<v26> list2 = list;
                    ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                    for (v26 v26Var : list2) {
                        if (v26Var instanceof x26) {
                            x26 x26Var = (x26) v26Var;
                            fknVar = new p2v(x26Var.a, x26Var.b, x26Var.c);
                        } else {
                            if (!(v26Var instanceof w26)) {
                                w511.b();
                                return null;
                            }
                            w26 w26Var = (w26) v26Var;
                            fknVar = new fkn(w26Var.a, String.valueOf(w26Var.b));
                        }
                        arrayList.add(fknVar);
                    }
                    mtGeoVehiclesRepository$requestSearchFromNet$1.L$0 = null;
                    mtGeoVehiclesRepository$requestSearchFromNet$1.L$1 = null;
                    mtGeoVehiclesRepository$requestSearchFromNet$1.label = 1;
                    obj = this.a.g(p, arrayList, mtGeoVehiclesRepository$requestSearchFromNet$1);
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
                jo2 jo2Var = (jo2) obj;
                Object obj2 = jo2Var.a;
                a = Result.a(obj2);
                String str = jo2Var.b;
                if (a != null) {
                    yk30 yk30Var = this.e;
                    yk30Var.a = new wk30(str, yk30Var.a.b);
                    return new uj40(((fwp0) obj2).a, ResponseLoadingState.LOADED, null);
                }
                xby.d.k(a, "Error getting search info");
                n310 n310Var = this.f.a;
                n310Var.getClass();
                HashMap hashMap = new HashMap();
                if (str != null) {
                    hashMap.put("request_id", str);
                }
                n310Var.a.a("MasstransitPayment.BleVehicles.SearchRequestFailed", hashMap, 1, new HashMap());
                return new uj40(EmptyList.a, ResponseLoadingState.ERROR, new sj40(a, str));
            }
        }
        mtGeoVehiclesRepository$requestSearchFromNet$1 = new MtGeoVehiclesRepository$requestSearchFromNet$1(this, continuationImpl);
        Object obj3 = mtGeoVehiclesRepository$requestSearchFromNet$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtGeoVehiclesRepository$requestSearchFromNet$1.label;
        if (i != 0) {
        }
        jo2 jo2Var2 = (jo2) obj3;
        Object obj22 = jo2Var2.a;
        a = Result.a(obj22);
        String str2 = jo2Var2.b;
        if (a != null) {
        }
    }
}
