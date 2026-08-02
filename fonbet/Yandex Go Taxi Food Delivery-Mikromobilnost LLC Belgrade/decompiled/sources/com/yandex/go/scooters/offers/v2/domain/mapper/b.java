package com.yandex.go.scooters.offers.v2.domain.mapper;

import defpackage.bpm0;
import defpackage.k7x0;
import defpackage.m7x0;
import defpackage.ny61;
import defpackage.q4o0;
import defpackage.r7p0;
import defpackage.t4o0;
import defpackage.tbn0;
import defpackage.tcc;
import defpackage.ubn0;
import defpackage.v4o0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes13.dex */
public final class b {
    public final k7x0 a;
    public final e b;
    public final q4o0 c;

    public b(k7x0 k7x0Var, e eVar, q4o0 q4o0Var) {
        this.a = k7x0Var;
        this.b = eVar;
        this.c = q4o0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ubn0 ubn0Var, boolean z, ContinuationImpl continuationImpl) {
        ScootersOnParkingMapper$handleListState$1 scootersOnParkingMapper$handleListState$1;
        int i;
        List list;
        boolean z2;
        if (continuationImpl instanceof ScootersOnParkingMapper$handleListState$1) {
            scootersOnParkingMapper$handleListState$1 = (ScootersOnParkingMapper$handleListState$1) continuationImpl;
            int i2 = scootersOnParkingMapper$handleListState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersOnParkingMapper$handleListState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersOnParkingMapper$handleListState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersOnParkingMapper$handleListState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List list2 = ubn0Var.g;
                    r7p0 r7p0Var = ubn0Var.e.a;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list2) {
                        if (!((tbn0) obj2).a.equals(r7p0Var)) {
                            arrayList.add(obj2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        tbn0 tbn0Var = (tbn0) it.next();
                        arrayList2.add(new bpm0(tbn0Var.a, ((m7x0) this.a).a(tbn0Var.d), tbn0Var.c, tbn0Var.e, tbn0Var.b));
                    }
                    if (arrayList2.isEmpty()) {
                        return v4o0.a;
                    }
                    FormattedText formattedText = ubn0Var.f;
                    scootersOnParkingMapper$handleListState$1.L$0 = null;
                    scootersOnParkingMapper$handleListState$1.L$1 = arrayList2;
                    scootersOnParkingMapper$handleListState$1.Z$0 = z;
                    scootersOnParkingMapper$handleListState$1.label = 1;
                    Object t = this.b.t(formattedText, scootersOnParkingMapper$handleListState$1);
                    if (t == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    list = arrayList2;
                    obj = t;
                    z2 = z;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z2 = scootersOnParkingMapper$handleListState$1.Z$0;
                    list = (List) scootersOnParkingMapper$handleListState$1.L$1;
                    kotlin.b.b(obj);
                }
                return new t4o0((CharSequence) obj, z2, list);
            }
        }
        scootersOnParkingMapper$handleListState$1 = new ScootersOnParkingMapper$handleListState$1(this, continuationImpl);
        Object obj3 = scootersOnParkingMapper$handleListState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersOnParkingMapper$handleListState$1.label;
        if (i != 0) {
        }
        return new t4o0((CharSequence) obj3, z2, list);
    }
}
