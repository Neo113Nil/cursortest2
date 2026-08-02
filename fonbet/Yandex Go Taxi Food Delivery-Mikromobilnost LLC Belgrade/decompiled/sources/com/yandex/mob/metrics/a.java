package com.yandex.mob.metrics;

import com.yandex.mob.data.MobNetworkTypeChangeTracker$NetworkType;
import com.yandex.mob.datastore.d;
import defpackage.hp20;
import defpackage.jl40;
import defpackage.kp20;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.w511;
import defpackage.y160;
import defpackage.z160;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ z160 b;

    public a(vpr vprVar, z160 z160Var) {
        this.a = vprVar;
        this.b = z160Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0165, code lost:
    
        if (r7.emit(r12, r1) == r2) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        NetworkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1 networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1;
        int i;
        MobNetworkTypeChangeTracker$NetworkType mobNetworkTypeChangeTracker$NetworkType;
        int i2;
        Object i3;
        vpr vprVar;
        int i4;
        kp20 kp20Var;
        vpr vprVar2;
        vpr vprVar3;
        d dVar = this.b.b;
        if (continuation instanceof NetworkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1) {
            networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1 = (NetworkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1) continuation;
            int i5 = networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1.label = i5 - Integer.MIN_VALUE;
                Object obj2 = networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    int i6 = y160.a[((hp20) obj).b.ordinal()];
                    if (i6 == 1) {
                        mobNetworkTypeChangeTracker$NetworkType = MobNetworkTypeChangeTracker$NetworkType.Cellular;
                    } else if (i6 == 2) {
                        mobNetworkTypeChangeTracker$NetworkType = MobNetworkTypeChangeTracker$NetworkType.Wifi;
                    } else {
                        if (i6 != 3) {
                            w511.b();
                            return null;
                        }
                        mobNetworkTypeChangeTracker$NetworkType = MobNetworkTypeChangeTracker$NetworkType.Other;
                    }
                    networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1.L$0 = null;
                    networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1.L$1 = null;
                    networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1.L$2 = null;
                    vpr vprVar4 = this.a;
                    networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1.L$3 = vprVar4;
                    networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1.L$4 = null;
                    networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1.L$5 = null;
                    networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1.L$6 = mobNetworkTypeChangeTracker$NetworkType;
                    i2 = 0;
                    networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1.I$0 = 0;
                    networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1.I$1 = 0;
                    networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1.label = 1;
                    i3 = dVar.i(networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1);
                    if (i3 != coroutineSingletons) {
                        vprVar = vprVar4;
                        i4 = 0;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        i4 = networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1.I$0;
                        vprVar3 = (vpr) networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1.L$3;
                        kotlin.b.b(obj2);
                        vprVar = vprVar3;
                        mobNetworkTypeChangeTracker$NetworkType = null;
                        if (mobNetworkTypeChangeTracker$NetworkType != null) {
                        }
                        return zy11.a;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    i4 = networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1.I$0;
                    mobNetworkTypeChangeTracker$NetworkType = (MobNetworkTypeChangeTracker$NetworkType) networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1.L$6;
                    vprVar2 = (vpr) networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1.L$3;
                    kotlin.b.b(obj2);
                    vprVar = vprVar2;
                    if (mobNetworkTypeChangeTracker$NetworkType != null) {
                        networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1.L$0 = null;
                        networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1.L$1 = null;
                        networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1.L$2 = null;
                        networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1.L$3 = null;
                        networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1.L$4 = null;
                        networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1.L$5 = null;
                        networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1.L$6 = null;
                        networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1.L$7 = null;
                        networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1.I$0 = i4;
                        networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1.label = 4;
                    }
                    return zy11.a;
                }
                int i7 = networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1.I$1;
                int i8 = networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1.I$0;
                MobNetworkTypeChangeTracker$NetworkType mobNetworkTypeChangeTracker$NetworkType2 = (MobNetworkTypeChangeTracker$NetworkType) networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1.L$6;
                vprVar = (vpr) networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1.L$3;
                kotlin.b.b(obj2);
                i2 = i7;
                i4 = i8;
                mobNetworkTypeChangeTracker$NetworkType = mobNetworkTypeChangeTracker$NetworkType2;
                i3 = obj2;
                kp20Var = (kp20) i3;
                if (kp20Var == null) {
                    if (!jl40.l(kp20Var.a, mobNetworkTypeChangeTracker$NetworkType.getValue())) {
                        kp20 kp20Var2 = new kp20(mobNetworkTypeChangeTracker$NetworkType.getValue());
                        networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1.L$0 = null;
                        networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1.L$1 = null;
                        networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1.L$2 = null;
                        networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1.L$3 = vprVar;
                        networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1.L$4 = null;
                        networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1.L$5 = null;
                        networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1.L$6 = mobNetworkTypeChangeTracker$NetworkType;
                        networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1.L$7 = null;
                        networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1.I$0 = i4;
                        networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1.I$1 = i2;
                        networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1.label = 3;
                        if (dVar.x(kp20Var2, networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1) != coroutineSingletons) {
                            vprVar2 = vprVar;
                            vprVar = vprVar2;
                            if (mobNetworkTypeChangeTracker$NetworkType != null) {
                            }
                            return zy11.a;
                        }
                    }
                    mobNetworkTypeChangeTracker$NetworkType = null;
                    if (mobNetworkTypeChangeTracker$NetworkType != null) {
                    }
                    return zy11.a;
                }
                kp20 kp20Var3 = new kp20(mobNetworkTypeChangeTracker$NetworkType.getValue());
                networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1.L$0 = null;
                networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1.L$1 = null;
                networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1.L$2 = null;
                networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1.L$3 = vprVar;
                networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1.L$4 = null;
                networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1.L$5 = null;
                networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1.L$6 = null;
                networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1.L$7 = null;
                networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1.I$0 = i4;
                networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1.I$1 = i2;
                networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1.label = 2;
                if (dVar.x(kp20Var3, networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1) != coroutineSingletons) {
                    vprVar3 = vprVar;
                    vprVar = vprVar3;
                    mobNetworkTypeChangeTracker$NetworkType = null;
                    if (mobNetworkTypeChangeTracker$NetworkType != null) {
                    }
                    return zy11.a;
                }
                return coroutineSingletons;
            }
        }
        networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1 = new NetworkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = networkTypeChangeTracker$networkTypeFlow$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        kp20Var = (kp20) i3;
        if (kp20Var == null) {
        }
        return coroutineSingletons2;
    }
}
