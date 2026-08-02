package com.yandex.mob.domain;

import defpackage.ha4;
import defpackage.ny61;
import defpackage.pl20;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ c b;
    public final /* synthetic */ ha4 c;

    public b(vpr vprVar, c cVar, ha4 ha4Var) {
        this.a = vprVar;
        this.b = cVar;
        this.c = ha4Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x008d, code lost:
    
        if (r7.emit(r8, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AvailabilityCheckProcessor$processChecks$$inlined$mapNotNull$1$2$1 availabilityCheckProcessor$processChecks$$inlined$mapNotNull$1$2$1;
        Object obj2;
        int i;
        vpr vprVar;
        int i2;
        if (continuation instanceof AvailabilityCheckProcessor$processChecks$$inlined$mapNotNull$1$2$1) {
            availabilityCheckProcessor$processChecks$$inlined$mapNotNull$1$2$1 = (AvailabilityCheckProcessor$processChecks$$inlined$mapNotNull$1$2$1) continuation;
            int i3 = availabilityCheckProcessor$processChecks$$inlined$mapNotNull$1$2$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                availabilityCheckProcessor$processChecks$$inlined$mapNotNull$1$2$1.label = i3 - Integer.MIN_VALUE;
                obj2 = availabilityCheckProcessor$processChecks$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = availabilityCheckProcessor$processChecks$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    availabilityCheckProcessor$processChecks$$inlined$mapNotNull$1$2$1.L$0 = null;
                    availabilityCheckProcessor$processChecks$$inlined$mapNotNull$1$2$1.L$1 = null;
                    availabilityCheckProcessor$processChecks$$inlined$mapNotNull$1$2$1.L$2 = null;
                    vpr vprVar2 = this.a;
                    availabilityCheckProcessor$processChecks$$inlined$mapNotNull$1$2$1.L$3 = vprVar2;
                    availabilityCheckProcessor$processChecks$$inlined$mapNotNull$1$2$1.L$4 = null;
                    availabilityCheckProcessor$processChecks$$inlined$mapNotNull$1$2$1.L$5 = null;
                    availabilityCheckProcessor$processChecks$$inlined$mapNotNull$1$2$1.I$0 = 0;
                    availabilityCheckProcessor$processChecks$$inlined$mapNotNull$1$2$1.I$1 = 0;
                    availabilityCheckProcessor$processChecks$$inlined$mapNotNull$1$2$1.label = 1;
                    Object e = c.e(this.b, (pl20) obj, this.c, availabilityCheckProcessor$processChecks$$inlined$mapNotNull$1$2$1);
                    if (e != coroutineSingletons) {
                        vprVar = vprVar2;
                        obj2 = e;
                        i2 = 0;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11.a;
                }
                i2 = availabilityCheckProcessor$processChecks$$inlined$mapNotNull$1$2$1.I$0;
                vprVar = (vpr) availabilityCheckProcessor$processChecks$$inlined$mapNotNull$1$2$1.L$3;
                kotlin.b.b(obj2);
                if (obj2 != null) {
                    availabilityCheckProcessor$processChecks$$inlined$mapNotNull$1$2$1.L$0 = null;
                    availabilityCheckProcessor$processChecks$$inlined$mapNotNull$1$2$1.L$1 = null;
                    availabilityCheckProcessor$processChecks$$inlined$mapNotNull$1$2$1.L$2 = null;
                    availabilityCheckProcessor$processChecks$$inlined$mapNotNull$1$2$1.L$3 = null;
                    availabilityCheckProcessor$processChecks$$inlined$mapNotNull$1$2$1.L$4 = null;
                    availabilityCheckProcessor$processChecks$$inlined$mapNotNull$1$2$1.L$5 = null;
                    availabilityCheckProcessor$processChecks$$inlined$mapNotNull$1$2$1.I$0 = i2;
                    availabilityCheckProcessor$processChecks$$inlined$mapNotNull$1$2$1.label = 2;
                }
                return zy11.a;
            }
        }
        availabilityCheckProcessor$processChecks$$inlined$mapNotNull$1$2$1 = new AvailabilityCheckProcessor$processChecks$$inlined$mapNotNull$1$2$1(this, continuation);
        obj2 = availabilityCheckProcessor$processChecks$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = availabilityCheckProcessor$processChecks$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        if (obj2 != null) {
        }
        return zy11.a;
    }
}
