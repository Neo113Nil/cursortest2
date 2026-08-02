package com.yandex.go.chargers.data;

import com.yandex.go.chargers.api.ChargersActiveOrderStatus;
import defpackage.bvf0;
import defpackage.ffx;
import defpackage.i2a;
import defpackage.ny61;
import defpackage.rl9;
import defpackage.taa;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes.dex */
public final class e {
    public final r0 a = bvf0.c(Boolean.TRUE);
    public final n0 b = ffx.c(0, 0, null, 7);
    public final n0 c = ffx.c(0, 0, null, 7);
    public final r0 d = bvf0.c(new rl9(0));

    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((taa) obj).b().compareTo(ChargersActiveOrderStatus.LEASING) <= 0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final ArrayList b() {
        List list = ((rl9) this.d.getValue()).a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!(((taa) obj) instanceof i2a)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(rl9 rl9Var, ContinuationImpl continuationImpl) {
        ChargersActiveOrdersStateRepository$pushActiveOrdersState$1 chargersActiveOrdersStateRepository$pushActiveOrdersState$1;
        int i;
        if (continuationImpl instanceof ChargersActiveOrdersStateRepository$pushActiveOrdersState$1) {
            chargersActiveOrdersStateRepository$pushActiveOrdersState$1 = (ChargersActiveOrdersStateRepository$pushActiveOrdersState$1) continuationImpl;
            int i2 = chargersActiveOrdersStateRepository$pushActiveOrdersState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersActiveOrdersStateRepository$pushActiveOrdersState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersActiveOrdersStateRepository$pushActiveOrdersState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersActiveOrdersStateRepository$pushActiveOrdersState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    chargersActiveOrdersStateRepository$pushActiveOrdersState$1.L$0 = rl9Var;
                    chargersActiveOrdersStateRepository$pushActiveOrdersState$1.label = 1;
                    if (this.b.emit(rl9Var, chargersActiveOrdersStateRepository$pushActiveOrdersState$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rl9Var = (rl9) chargersActiveOrdersStateRepository$pushActiveOrdersState$1.L$0;
                    kotlin.b.b(obj);
                }
                this.d.l(rl9Var);
                return zy11.a;
            }
        }
        chargersActiveOrdersStateRepository$pushActiveOrdersState$1 = new ChargersActiveOrdersStateRepository$pushActiveOrdersState$1(this, continuationImpl);
        Object obj2 = chargersActiveOrdersStateRepository$pushActiveOrdersState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersActiveOrdersStateRepository$pushActiveOrdersState$1.label;
        if (i != 0) {
        }
        this.d.l(rl9Var);
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(rl9 rl9Var, ContinuationImpl continuationImpl) {
        ChargersActiveOrdersStateRepository$pushUnifiedPollingActiveOrdersState$1 chargersActiveOrdersStateRepository$pushUnifiedPollingActiveOrdersState$1;
        int i;
        if (continuationImpl instanceof ChargersActiveOrdersStateRepository$pushUnifiedPollingActiveOrdersState$1) {
            chargersActiveOrdersStateRepository$pushUnifiedPollingActiveOrdersState$1 = (ChargersActiveOrdersStateRepository$pushUnifiedPollingActiveOrdersState$1) continuationImpl;
            int i2 = chargersActiveOrdersStateRepository$pushUnifiedPollingActiveOrdersState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersActiveOrdersStateRepository$pushUnifiedPollingActiveOrdersState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersActiveOrdersStateRepository$pushUnifiedPollingActiveOrdersState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersActiveOrdersStateRepository$pushUnifiedPollingActiveOrdersState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    chargersActiveOrdersStateRepository$pushUnifiedPollingActiveOrdersState$1.L$0 = rl9Var;
                    chargersActiveOrdersStateRepository$pushUnifiedPollingActiveOrdersState$1.label = 1;
                    if (this.c.emit(rl9Var, chargersActiveOrdersStateRepository$pushUnifiedPollingActiveOrdersState$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rl9Var = (rl9) chargersActiveOrdersStateRepository$pushUnifiedPollingActiveOrdersState$1.L$0;
                    kotlin.b.b(obj);
                }
                if (((Boolean) this.a.getValue()).booleanValue()) {
                    this.d.l(rl9Var);
                }
                return zy11.a;
            }
        }
        chargersActiveOrdersStateRepository$pushUnifiedPollingActiveOrdersState$1 = new ChargersActiveOrdersStateRepository$pushUnifiedPollingActiveOrdersState$1(this, continuationImpl);
        Object obj2 = chargersActiveOrdersStateRepository$pushUnifiedPollingActiveOrdersState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersActiveOrdersStateRepository$pushUnifiedPollingActiveOrdersState$1.label;
        if (i != 0) {
        }
        if (((Boolean) this.a.getValue()).booleanValue()) {
        }
        return zy11.a;
    }
}
