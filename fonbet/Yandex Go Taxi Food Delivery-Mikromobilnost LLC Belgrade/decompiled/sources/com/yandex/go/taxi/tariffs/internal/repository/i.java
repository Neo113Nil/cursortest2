package com.yandex.go.taxi.tariffs.internal.repository;

import defpackage.dk31;
import defpackage.fnx0;
import defpackage.ik31;
import defpackage.jl40;
import defpackage.mi31;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.za31;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class i implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ k b;
    public final /* synthetic */ String c;

    public i(vpr vprVar, k kVar, String str) {
        this.a = vprVar;
        this.b = kVar;
        this.c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TariffsRepository$verticalSnapshotFlowInternal$$inlined$mapNotNull$1$2$1 tariffsRepository$verticalSnapshotFlowInternal$$inlined$mapNotNull$1$2$1;
        int i;
        String str;
        mi31 c;
        if (continuation instanceof TariffsRepository$verticalSnapshotFlowInternal$$inlined$mapNotNull$1$2$1) {
            tariffsRepository$verticalSnapshotFlowInternal$$inlined$mapNotNull$1$2$1 = (TariffsRepository$verticalSnapshotFlowInternal$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = tariffsRepository$verticalSnapshotFlowInternal$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffsRepository$verticalSnapshotFlowInternal$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = tariffsRepository$verticalSnapshotFlowInternal$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffsRepository$verticalSnapshotFlowInternal$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ik31 ik31Var = (ik31) obj;
                    List list = ik31Var.a.a;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        str = this.c;
                        if (!hasNext) {
                            break;
                        }
                        Object next = it.next();
                        if (jl40.l(((za31) next).a.a, str)) {
                            arrayList.add(next);
                        }
                    }
                    k kVar = this.b;
                    if (jl40.l(kVar.h(), str)) {
                        fnx0 n = kVar.n();
                        c = n != null ? n.a : null;
                    } else {
                        c = kVar.c.c((String) kVar.j.e.get(str), str, arrayList);
                    }
                    ik31 ik31Var2 = c != null ? new ik31(dk31.a(ik31Var.a, arrayList), c, ik31Var.c, true) : null;
                    if (ik31Var2 != null) {
                        tariffsRepository$verticalSnapshotFlowInternal$$inlined$mapNotNull$1$2$1.L$0 = null;
                        tariffsRepository$verticalSnapshotFlowInternal$$inlined$mapNotNull$1$2$1.L$1 = null;
                        tariffsRepository$verticalSnapshotFlowInternal$$inlined$mapNotNull$1$2$1.L$2 = null;
                        tariffsRepository$verticalSnapshotFlowInternal$$inlined$mapNotNull$1$2$1.L$3 = null;
                        tariffsRepository$verticalSnapshotFlowInternal$$inlined$mapNotNull$1$2$1.L$4 = null;
                        tariffsRepository$verticalSnapshotFlowInternal$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(ik31Var2, tariffsRepository$verticalSnapshotFlowInternal$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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
        tariffsRepository$verticalSnapshotFlowInternal$$inlined$mapNotNull$1$2$1 = new TariffsRepository$verticalSnapshotFlowInternal$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = tariffsRepository$verticalSnapshotFlowInternal$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffsRepository$verticalSnapshotFlowInternal$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
