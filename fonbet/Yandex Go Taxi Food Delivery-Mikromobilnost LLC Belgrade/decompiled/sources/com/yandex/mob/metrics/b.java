package com.yandex.mob.metrics;

import com.yandex.mob.data.MobVpnChangeTracker$VpnState;
import com.yandex.mob.datastore.d;
import defpackage.a041;
import defpackage.cs20;
import defpackage.hp20;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ a041 b;

    public b(vpr vprVar, a041 a041Var) {
        this.a = vprVar;
        this.b = a041Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0132, code lost:
    
        if (r7.emit(r12, r1) == r2) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        VpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1 vpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1;
        int i;
        hp20 hp20Var;
        int i2;
        Object j;
        vpr vprVar;
        int i3;
        cs20 cs20Var;
        vpr vprVar2;
        vpr vprVar3;
        MobVpnChangeTracker$VpnState mobVpnChangeTracker$VpnState;
        d dVar = this.b.b;
        if (continuation instanceof VpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1) {
            vpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1 = (VpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1) continuation;
            int i4 = vpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                vpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1.label = i4 - Integer.MIN_VALUE;
                Object obj2 = vpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = vpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    hp20Var = (hp20) obj;
                    vpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1.L$0 = null;
                    vpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1.L$1 = null;
                    vpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1.L$2 = null;
                    vpr vprVar4 = this.a;
                    vpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1.L$3 = vprVar4;
                    vpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1.L$4 = null;
                    vpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1.L$5 = hp20Var;
                    i2 = 0;
                    vpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1.I$0 = 0;
                    vpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1.I$1 = 0;
                    vpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1.label = 1;
                    j = dVar.j(vpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1);
                    if (j != coroutineSingletons) {
                        vprVar = vprVar4;
                        i3 = 0;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        i3 = vpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1.I$0;
                        vprVar3 = (vpr) vpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1.L$3;
                        kotlin.b.b(obj2);
                        vprVar = vprVar3;
                        mobVpnChangeTracker$VpnState = null;
                        if (mobVpnChangeTracker$VpnState != null) {
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
                    i3 = vpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1.I$0;
                    hp20Var = (hp20) vpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1.L$5;
                    vprVar2 = (vpr) vpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1.L$3;
                    kotlin.b.b(obj2);
                    mobVpnChangeTracker$VpnState = !hp20Var.a ? MobVpnChangeTracker$VpnState.On : MobVpnChangeTracker$VpnState.Off;
                    vprVar = vprVar2;
                    if (mobVpnChangeTracker$VpnState != null) {
                        vpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1.L$0 = null;
                        vpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1.L$1 = null;
                        vpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1.L$2 = null;
                        vpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1.L$3 = null;
                        vpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1.L$4 = null;
                        vpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1.L$5 = null;
                        vpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1.L$6 = null;
                        vpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1.I$0 = i3;
                        vpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1.label = 4;
                    }
                    return zy11.a;
                }
                int i5 = vpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1.I$1;
                int i6 = vpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1.I$0;
                hp20 hp20Var2 = (hp20) vpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1.L$5;
                vprVar = (vpr) vpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1.L$3;
                kotlin.b.b(obj2);
                i2 = i5;
                i3 = i6;
                hp20Var = hp20Var2;
                j = obj2;
                cs20Var = (cs20) j;
                if (cs20Var == null) {
                    boolean z = cs20Var.a;
                    boolean z2 = hp20Var.a;
                    if (z != z2) {
                        cs20 cs20Var2 = new cs20(z2);
                        vpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1.L$0 = null;
                        vpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1.L$1 = null;
                        vpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1.L$2 = null;
                        vpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1.L$3 = vprVar;
                        vpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1.L$4 = null;
                        vpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1.L$5 = hp20Var;
                        vpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1.L$6 = null;
                        vpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1.I$0 = i3;
                        vpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1.I$1 = i2;
                        vpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1.label = 3;
                        if (dVar.B(cs20Var2, vpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1) != coroutineSingletons) {
                            vprVar2 = vprVar;
                            if (!hp20Var.a) {
                            }
                            vprVar = vprVar2;
                            if (mobVpnChangeTracker$VpnState != null) {
                            }
                            return zy11.a;
                        }
                    }
                    mobVpnChangeTracker$VpnState = null;
                    if (mobVpnChangeTracker$VpnState != null) {
                    }
                    return zy11.a;
                }
                cs20 cs20Var3 = new cs20(hp20Var.a);
                vpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1.L$0 = null;
                vpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1.L$1 = null;
                vpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1.L$2 = null;
                vpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1.L$3 = vprVar;
                vpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1.L$4 = null;
                vpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1.L$5 = null;
                vpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1.L$6 = null;
                vpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1.I$0 = i3;
                vpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1.I$1 = i2;
                vpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1.label = 2;
                if (dVar.B(cs20Var3, vpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1) != coroutineSingletons) {
                    vprVar3 = vprVar;
                    vprVar = vprVar3;
                    mobVpnChangeTracker$VpnState = null;
                    if (mobVpnChangeTracker$VpnState != null) {
                    }
                    return zy11.a;
                }
                return coroutineSingletons;
            }
        }
        vpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1 = new VpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = vpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = vpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        cs20Var = (cs20) j;
        if (cs20Var == null) {
        }
        return coroutineSingletons2;
    }
}
