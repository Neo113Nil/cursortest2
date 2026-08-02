package com.yandex.go.chargers.discovery.shortcuts;

import defpackage.ny61;
import defpackage.rl9;
import defpackage.taa;
import defpackage.tcc;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ChargersDiscoveryShortcutGridViewFactory$activeOrdersTriggerFlow$$inlined$map$1$2$1 chargersDiscoveryShortcutGridViewFactory$activeOrdersTriggerFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ChargersDiscoveryShortcutGridViewFactory$activeOrdersTriggerFlow$$inlined$map$1$2$1) {
            chargersDiscoveryShortcutGridViewFactory$activeOrdersTriggerFlow$$inlined$map$1$2$1 = (ChargersDiscoveryShortcutGridViewFactory$activeOrdersTriggerFlow$$inlined$map$1$2$1) continuation;
            int i2 = chargersDiscoveryShortcutGridViewFactory$activeOrdersTriggerFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersDiscoveryShortcutGridViewFactory$activeOrdersTriggerFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = chargersDiscoveryShortcutGridViewFactory$activeOrdersTriggerFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersDiscoveryShortcutGridViewFactory$activeOrdersTriggerFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List list = ((rl9) obj).a;
                    ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((taa) it.next()).a());
                    }
                    Set N0 = kotlin.collections.a.N0(arrayList);
                    chargersDiscoveryShortcutGridViewFactory$activeOrdersTriggerFlow$$inlined$map$1$2$1.L$0 = null;
                    chargersDiscoveryShortcutGridViewFactory$activeOrdersTriggerFlow$$inlined$map$1$2$1.L$1 = null;
                    chargersDiscoveryShortcutGridViewFactory$activeOrdersTriggerFlow$$inlined$map$1$2$1.L$2 = null;
                    chargersDiscoveryShortcutGridViewFactory$activeOrdersTriggerFlow$$inlined$map$1$2$1.L$3 = null;
                    chargersDiscoveryShortcutGridViewFactory$activeOrdersTriggerFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(N0, chargersDiscoveryShortcutGridViewFactory$activeOrdersTriggerFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
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
        chargersDiscoveryShortcutGridViewFactory$activeOrdersTriggerFlow$$inlined$map$1$2$1 = new ChargersDiscoveryShortcutGridViewFactory$activeOrdersTriggerFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = chargersDiscoveryShortcutGridViewFactory$activeOrdersTriggerFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersDiscoveryShortcutGridViewFactory$activeOrdersTriggerFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
