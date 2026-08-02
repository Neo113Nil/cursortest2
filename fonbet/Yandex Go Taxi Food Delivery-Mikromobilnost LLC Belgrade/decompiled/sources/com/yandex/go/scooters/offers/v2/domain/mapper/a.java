package com.yandex.go.scooters.offers.v2.domain.mapper;

import com.yandex.go.scooters.data.e;
import com.yandex.go.scooters.domain.ScootersBeginnerInteractor$ShowForBeginner;
import com.yandex.go.scooters.domain.c;
import defpackage.awn0;
import defpackage.b4p0;
import defpackage.b590;
import defpackage.d4o0;
import defpackage.e8p0;
import defpackage.eer;
import defpackage.hfa0;
import defpackage.i5p0;
import defpackage.j5p0;
import defpackage.j9p0;
import defpackage.jl40;
import defpackage.m3o0;
import defpackage.n3o0;
import defpackage.ny61;
import defpackage.p3o0;
import defpackage.q1b1;
import defpackage.q3o0;
import defpackage.qwo0;
import defpackage.sco0;
import defpackage.tcc;
import defpackage.vbn0;
import defpackage.w511;
import defpackage.w5n0;
import defpackage.x5n0;
import defpackage.xzt0;
import defpackage.y2p0;
import defpackage.y5n0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a {
    public final qwo0 a;
    public final c b;
    public final e c;
    public final j9p0 d;

    public a(qwo0 qwo0Var, c cVar, e eVar, j9p0 j9p0Var) {
        this.a = qwo0Var;
        this.b = cVar;
        this.c = eVar;
        this.d = j9p0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0328 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Type inference failed for: r11v2, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r13v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v23, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v21, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(p3o0 p3o0Var, b4p0 b4p0Var, ContinuationImpl continuationImpl) {
        ScootersOffersStateMapper$mapToResult$1 scootersOffersStateMapper$mapToResult$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        vbn0 vbn0Var;
        ArrayList arrayList;
        hfa0 hfa0Var;
        Object obj;
        n3o0 n3o0Var;
        boolean z;
        p3o0 p3o0Var2;
        int i2;
        n3o0 n3o0Var2;
        Object b;
        ArrayList arrayList2;
        sco0 sco0Var;
        vbn0 vbn0Var2;
        hfa0 hfa0Var2;
        int i3;
        boolean z2;
        n3o0 n3o0Var3;
        boolean z3;
        Serializable d;
        boolean z4;
        int i4;
        boolean z5;
        n3o0 n3o0Var4;
        ArrayList arrayList3;
        vbn0 vbn0Var3;
        boolean z6;
        Iterator it;
        Object obj2;
        awn0 awn0Var;
        a aVar = this;
        if (continuationImpl instanceof ScootersOffersStateMapper$mapToResult$1) {
            scootersOffersStateMapper$mapToResult$1 = (ScootersOffersStateMapper$mapToResult$1) continuationImpl;
            int i5 = scootersOffersStateMapper$mapToResult$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                scootersOffersStateMapper$mapToResult$1.label = i5 - Integer.MIN_VALUE;
                Object obj3 = scootersOffersStateMapper$mapToResult$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersOffersStateMapper$mapToResult$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    if (!(p3o0Var instanceof d4o0)) {
                        if (p3o0Var instanceof q3o0) {
                            return new x5n0(((q3o0) p3o0Var).a);
                        }
                        if (p3o0Var instanceof m3o0) {
                            return new w5n0(((m3o0) p3o0Var).a);
                        }
                        w511.b();
                        return null;
                    }
                    if (b4p0Var == null) {
                        return new w5n0(new IllegalStateException("No selected scooters tariff."));
                    }
                    String str = b4p0Var.a;
                    d4o0 d4o0Var = (d4o0) p3o0Var;
                    vbn0Var = d4o0Var.c;
                    List list = vbn0Var.c;
                    int i6 = !aVar.a.d() ? 1 : 0;
                    List list2 = list;
                    ArrayList arrayList4 = new ArrayList(tcc.n(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        b4p0 b4p0Var2 = (b4p0) it2.next();
                        String str2 = b4p0Var2.c;
                        String str3 = b4p0Var2.d;
                        CharSequence charSequence = b4p0Var2.g;
                        List list3 = list;
                        y2p0 y2p0Var = b4p0Var2.k;
                        Iterator it3 = it2;
                        String str4 = y2p0Var != null ? y2p0Var.b : null;
                        String str5 = str4 == null ? "" : str4;
                        String str6 = y2p0Var != null ? y2p0Var.c : null;
                        arrayList4.add(new i5p0(str2, str3, b4p0Var2 == b4p0Var || (b4p0Var2.getClass() == b4p0Var.getClass() && jl40.l(b4p0Var2.a, str)), charSequence, str5, b4p0Var2, str6 == null ? "" : str6));
                        list = list3;
                        it2 = it3;
                    }
                    List list4 = list;
                    ArrayList arrayList5 = new ArrayList(arrayList4);
                    arrayList = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it4 = arrayList5.iterator();
                    while (it4.hasNext()) {
                        Object next = it4.next();
                        j5p0 j5p0Var = (j5p0) next;
                        if ((j5p0Var instanceof i5p0) && (((i5p0) j5p0Var).f instanceof xzt0)) {
                            arrayList6.add(next);
                        }
                    }
                    boolean isEmpty = arrayList6.isEmpty();
                    ?? r11 = EmptyList.a;
                    if (isEmpty || !arrayList5.removeAll(arrayList6)) {
                        arrayList6 = r11;
                    }
                    arrayList.addAll(arrayList6);
                    ArrayList arrayList7 = new ArrayList();
                    Iterator it5 = arrayList5.iterator();
                    while (it5.hasNext()) {
                        Object next2 = it5.next();
                        j5p0 j5p0Var2 = (j5p0) next2;
                        Iterator it6 = it5;
                        if ((j5p0Var2 instanceof i5p0) && (((i5p0) j5p0Var2).f instanceof b590)) {
                            arrayList7.add(next2);
                        }
                        it5 = it6;
                    }
                    if (arrayList7.isEmpty() || !arrayList5.removeAll(arrayList7)) {
                        arrayList7 = r11;
                    }
                    arrayList.addAll(arrayList7);
                    ArrayList arrayList8 = new ArrayList();
                    Iterator it7 = arrayList5.iterator();
                    while (it7.hasNext()) {
                        Object next3 = it7.next();
                        j5p0 j5p0Var3 = (j5p0) next3;
                        Iterator it8 = it7;
                        if ((j5p0Var3 instanceof i5p0) && (((i5p0) j5p0Var3).f instanceof eer)) {
                            arrayList8.add(next3);
                        }
                        it7 = it8;
                    }
                    ArrayList arrayList9 = r11;
                    if (!arrayList8.isEmpty()) {
                        arrayList9 = r11;
                        if (arrayList5.removeAll(arrayList8)) {
                            arrayList9 = arrayList8;
                        }
                    }
                    arrayList.addAll(arrayList9);
                    if (!arrayList5.isEmpty()) {
                        arrayList.addAll(arrayList5);
                    }
                    hfa0Var = d4o0Var.a;
                    Iterator it9 = list4.iterator();
                    while (true) {
                        if (!it9.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it9.next();
                        b4p0 b4p0Var3 = (b4p0) obj;
                        if (b4p0Var3 == b4p0Var || (b4p0Var3.getClass() == b4p0Var.getClass() && jl40.l(b4p0Var3.a, str))) {
                            break;
                        }
                    }
                    b4p0 b4p0Var4 = (b4p0) obj;
                    if (b4p0Var4 == null || (n3o0Var = b4p0Var4.l) == null) {
                        n3o0Var = n3o0.g;
                    }
                    String str7 = b4p0Var.i;
                    scootersOffersStateMapper$mapToResult$1.L$0 = null;
                    scootersOffersStateMapper$mapToResult$1.L$1 = null;
                    scootersOffersStateMapper$mapToResult$1.L$2 = p3o0Var;
                    scootersOffersStateMapper$mapToResult$1.L$3 = vbn0Var;
                    scootersOffersStateMapper$mapToResult$1.L$4 = arrayList;
                    scootersOffersStateMapper$mapToResult$1.L$5 = hfa0Var;
                    scootersOffersStateMapper$mapToResult$1.L$6 = n3o0Var;
                    scootersOffersStateMapper$mapToResult$1.I$0 = i6;
                    z = true;
                    scootersOffersStateMapper$mapToResult$1.label = 1;
                    Enum a = aVar.b.a(str7, scootersOffersStateMapper$mapToResult$1);
                    if (a != coroutineSingletons) {
                        p3o0Var2 = p3o0Var;
                        i2 = i6;
                        n3o0 n3o0Var5 = n3o0Var;
                        obj3 = a;
                        n3o0Var2 = n3o0Var5;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        boolean z7 = scootersOffersStateMapper$mapToResult$1.Z$2;
                        boolean z8 = scootersOffersStateMapper$mapToResult$1.Z$1;
                        boolean z9 = scootersOffersStateMapper$mapToResult$1.Z$0;
                        i4 = scootersOffersStateMapper$mapToResult$1.I$0;
                        a aVar2 = (a) scootersOffersStateMapper$mapToResult$1.L$8;
                        sco0Var = (sco0) scootersOffersStateMapper$mapToResult$1.L$7;
                        n3o0 n3o0Var6 = (n3o0) scootersOffersStateMapper$mapToResult$1.L$6;
                        hfa0Var2 = (hfa0) scootersOffersStateMapper$mapToResult$1.L$5;
                        ?? r13 = (List) scootersOffersStateMapper$mapToResult$1.L$4;
                        vbn0 vbn0Var4 = (vbn0) scootersOffersStateMapper$mapToResult$1.L$3;
                        kotlin.b.b(obj3);
                        z4 = z7;
                        aVar = aVar2;
                        z = true;
                        n3o0Var4 = n3o0Var6;
                        arrayList3 = r13;
                        vbn0Var3 = vbn0Var4;
                        z6 = z8;
                        z5 = z9;
                        sco0 sco0Var2 = sco0Var;
                        List list5 = (List) obj3;
                        e8p0 e8p0Var = q1b1.d(vbn0Var3).a.b;
                        aVar.getClass();
                        it = list5.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            if (jl40.l(((awn0) obj2).c, e8p0Var)) {
                                break;
                            }
                        }
                        awn0Var = (awn0) obj2;
                        if (awn0Var == null) {
                            awn0Var = (awn0) kotlin.collections.a.R(list5);
                        }
                        return new y5n0(sco0Var2, z5, z4, hfa0Var2, z6, awn0Var, n3o0Var4, arrayList3, i4 != 0 ? z : false, vbn0Var3);
                    }
                    z2 = scootersOffersStateMapper$mapToResult$1.Z$1;
                    z3 = scootersOffersStateMapper$mapToResult$1.Z$0;
                    i3 = scootersOffersStateMapper$mapToResult$1.I$0;
                    sco0 sco0Var3 = (sco0) scootersOffersStateMapper$mapToResult$1.L$7;
                    n3o0 n3o0Var7 = (n3o0) scootersOffersStateMapper$mapToResult$1.L$6;
                    hfa0 hfa0Var3 = (hfa0) scootersOffersStateMapper$mapToResult$1.L$5;
                    ?? r14 = (List) scootersOffersStateMapper$mapToResult$1.L$4;
                    vbn0 vbn0Var5 = (vbn0) scootersOffersStateMapper$mapToResult$1.L$3;
                    kotlin.b.b(obj3);
                    sco0Var = sco0Var3;
                    z = true;
                    n3o0Var3 = n3o0Var7;
                    hfa0Var2 = hfa0Var3;
                    arrayList2 = r14;
                    vbn0Var2 = vbn0Var5;
                    boolean booleanValue = ((Boolean) obj3).booleanValue();
                    scootersOffersStateMapper$mapToResult$1.L$0 = null;
                    scootersOffersStateMapper$mapToResult$1.L$1 = null;
                    scootersOffersStateMapper$mapToResult$1.L$2 = null;
                    scootersOffersStateMapper$mapToResult$1.L$3 = vbn0Var2;
                    scootersOffersStateMapper$mapToResult$1.L$4 = arrayList2;
                    scootersOffersStateMapper$mapToResult$1.L$5 = hfa0Var2;
                    scootersOffersStateMapper$mapToResult$1.L$6 = n3o0Var3;
                    scootersOffersStateMapper$mapToResult$1.L$7 = sco0Var;
                    scootersOffersStateMapper$mapToResult$1.L$8 = aVar;
                    scootersOffersStateMapper$mapToResult$1.I$0 = i3;
                    scootersOffersStateMapper$mapToResult$1.Z$0 = z3;
                    scootersOffersStateMapper$mapToResult$1.Z$1 = z2;
                    scootersOffersStateMapper$mapToResult$1.Z$2 = booleanValue;
                    scootersOffersStateMapper$mapToResult$1.label = 3;
                    d = aVar.c.d(scootersOffersStateMapper$mapToResult$1);
                    if (d != coroutineSingletons) {
                        z4 = booleanValue;
                        obj3 = d;
                        i4 = i3;
                        z5 = z3;
                        n3o0Var4 = n3o0Var3;
                        arrayList3 = arrayList2;
                        vbn0Var3 = vbn0Var2;
                        z6 = z2;
                        sco0 sco0Var22 = sco0Var;
                        List list52 = (List) obj3;
                        e8p0 e8p0Var2 = q1b1.d(vbn0Var3).a.b;
                        aVar.getClass();
                        it = list52.iterator();
                        while (true) {
                            if (it.hasNext()) {
                            }
                        }
                        awn0Var = (awn0) obj2;
                        if (awn0Var == null) {
                        }
                        return new y5n0(sco0Var22, z5, z4, hfa0Var2, z6, awn0Var, n3o0Var4, arrayList3, i4 != 0 ? z : false, vbn0Var3);
                    }
                    return coroutineSingletons;
                }
                i2 = scootersOffersStateMapper$mapToResult$1.I$0;
                n3o0Var2 = (n3o0) scootersOffersStateMapper$mapToResult$1.L$6;
                hfa0Var = (hfa0) scootersOffersStateMapper$mapToResult$1.L$5;
                ?? r7 = (List) scootersOffersStateMapper$mapToResult$1.L$4;
                vbn0Var = (vbn0) scootersOffersStateMapper$mapToResult$1.L$3;
                p3o0Var2 = (p3o0) scootersOffersStateMapper$mapToResult$1.L$2;
                kotlin.b.b(obj3);
                arrayList = r7;
                z = true;
                boolean z10 = ((ScootersBeginnerInteractor$ShowForBeginner) obj3) == ScootersBeginnerInteractor$ShowForBeginner.NOTHING ? z : false;
                boolean z11 = ((d4o0) p3o0Var2).b;
                sco0 sco0Var4 = vbn0Var.a;
                scootersOffersStateMapper$mapToResult$1.L$0 = null;
                scootersOffersStateMapper$mapToResult$1.L$1 = null;
                scootersOffersStateMapper$mapToResult$1.L$2 = null;
                scootersOffersStateMapper$mapToResult$1.L$3 = vbn0Var;
                scootersOffersStateMapper$mapToResult$1.L$4 = arrayList;
                scootersOffersStateMapper$mapToResult$1.L$5 = hfa0Var;
                scootersOffersStateMapper$mapToResult$1.L$6 = n3o0Var2;
                scootersOffersStateMapper$mapToResult$1.L$7 = sco0Var4;
                scootersOffersStateMapper$mapToResult$1.I$0 = i2;
                scootersOffersStateMapper$mapToResult$1.Z$0 = z10;
                scootersOffersStateMapper$mapToResult$1.Z$1 = z11;
                scootersOffersStateMapper$mapToResult$1.label = 2;
                b = aVar.d.a.b(scootersOffersStateMapper$mapToResult$1);
                if (b != coroutineSingletons) {
                    arrayList2 = arrayList;
                    sco0Var = sco0Var4;
                    vbn0Var2 = vbn0Var;
                    hfa0Var2 = hfa0Var;
                    i3 = i2;
                    z2 = z11;
                    n3o0Var3 = n3o0Var2;
                    z3 = z10;
                    obj3 = b;
                    boolean booleanValue2 = ((Boolean) obj3).booleanValue();
                    scootersOffersStateMapper$mapToResult$1.L$0 = null;
                    scootersOffersStateMapper$mapToResult$1.L$1 = null;
                    scootersOffersStateMapper$mapToResult$1.L$2 = null;
                    scootersOffersStateMapper$mapToResult$1.L$3 = vbn0Var2;
                    scootersOffersStateMapper$mapToResult$1.L$4 = arrayList2;
                    scootersOffersStateMapper$mapToResult$1.L$5 = hfa0Var2;
                    scootersOffersStateMapper$mapToResult$1.L$6 = n3o0Var3;
                    scootersOffersStateMapper$mapToResult$1.L$7 = sco0Var;
                    scootersOffersStateMapper$mapToResult$1.L$8 = aVar;
                    scootersOffersStateMapper$mapToResult$1.I$0 = i3;
                    scootersOffersStateMapper$mapToResult$1.Z$0 = z3;
                    scootersOffersStateMapper$mapToResult$1.Z$1 = z2;
                    scootersOffersStateMapper$mapToResult$1.Z$2 = booleanValue2;
                    scootersOffersStateMapper$mapToResult$1.label = 3;
                    d = aVar.c.d(scootersOffersStateMapper$mapToResult$1);
                    if (d != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        scootersOffersStateMapper$mapToResult$1 = new ScootersOffersStateMapper$mapToResult$1(aVar, continuationImpl);
        Object obj32 = scootersOffersStateMapper$mapToResult$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersOffersStateMapper$mapToResult$1.label;
        if (i != 0) {
        }
        if (((ScootersBeginnerInteractor$ShowForBeginner) obj32) == ScootersBeginnerInteractor$ShowForBeginner.NOTHING) {
        }
        boolean z112 = ((d4o0) p3o0Var2).b;
        sco0 sco0Var42 = vbn0Var.a;
        scootersOffersStateMapper$mapToResult$1.L$0 = null;
        scootersOffersStateMapper$mapToResult$1.L$1 = null;
        scootersOffersStateMapper$mapToResult$1.L$2 = null;
        scootersOffersStateMapper$mapToResult$1.L$3 = vbn0Var;
        scootersOffersStateMapper$mapToResult$1.L$4 = arrayList;
        scootersOffersStateMapper$mapToResult$1.L$5 = hfa0Var;
        scootersOffersStateMapper$mapToResult$1.L$6 = n3o0Var2;
        scootersOffersStateMapper$mapToResult$1.L$7 = sco0Var42;
        scootersOffersStateMapper$mapToResult$1.I$0 = i2;
        scootersOffersStateMapper$mapToResult$1.Z$0 = z10;
        scootersOffersStateMapper$mapToResult$1.Z$1 = z112;
        scootersOffersStateMapper$mapToResult$1.label = 2;
        b = aVar.d.a.b(scootersOffersStateMapper$mapToResult$1);
        if (b != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
