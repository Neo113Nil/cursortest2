package com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain;

import com.yandex.go.mainscreen.superapp.analytics.SuperappMainAnalytics$LocationUpdateType;
import defpackage.fdz;
import defpackage.j1w0;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class p implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ v b;

    public p(vpr vprVar, v vVar) {
        this.a = vprVar;
        this.b = vVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ae, code lost:
    
        if (r9.emit(r10, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SuperAppMainScreenAddressInteractorImpl$listenToUserLocation$$inlined$mapNotNull$1$2$1 superAppMainScreenAddressInteractorImpl$listenToUserLocation$$inlined$mapNotNull$1$2$1;
        int i;
        vpr vprVar;
        j1w0 j1w0Var;
        mo21 mo21Var;
        if (continuation instanceof SuperAppMainScreenAddressInteractorImpl$listenToUserLocation$$inlined$mapNotNull$1$2$1) {
            superAppMainScreenAddressInteractorImpl$listenToUserLocation$$inlined$mapNotNull$1$2$1 = (SuperAppMainScreenAddressInteractorImpl$listenToUserLocation$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = superAppMainScreenAddressInteractorImpl$listenToUserLocation$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppMainScreenAddressInteractorImpl$listenToUserLocation$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = superAppMainScreenAddressInteractorImpl$listenToUserLocation$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppMainScreenAddressInteractorImpl$listenToUserLocation$$inlined$mapNotNull$1$2$1.label;
                v vVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    j1w0 j1w0Var2 = (j1w0) obj;
                    ru.yandex.taxi.main.map.f fVar = vVar.g;
                    mo21 mo21Var2 = j1w0Var2.a;
                    superAppMainScreenAddressInteractorImpl$listenToUserLocation$$inlined$mapNotNull$1$2$1.L$0 = null;
                    superAppMainScreenAddressInteractorImpl$listenToUserLocation$$inlined$mapNotNull$1$2$1.L$1 = null;
                    superAppMainScreenAddressInteractorImpl$listenToUserLocation$$inlined$mapNotNull$1$2$1.L$2 = null;
                    vpr vprVar2 = this.a;
                    superAppMainScreenAddressInteractorImpl$listenToUserLocation$$inlined$mapNotNull$1$2$1.L$3 = vprVar2;
                    superAppMainScreenAddressInteractorImpl$listenToUserLocation$$inlined$mapNotNull$1$2$1.L$4 = null;
                    superAppMainScreenAddressInteractorImpl$listenToUserLocation$$inlined$mapNotNull$1$2$1.L$5 = j1w0Var2;
                    superAppMainScreenAddressInteractorImpl$listenToUserLocation$$inlined$mapNotNull$1$2$1.label = 1;
                    obj2 = fVar.f(mo21Var2, superAppMainScreenAddressInteractorImpl$listenToUserLocation$$inlined$mapNotNull$1$2$1);
                    if (obj2 != coroutineSingletons) {
                        vprVar = vprVar2;
                        j1w0Var = j1w0Var2;
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
                j1w0Var = (j1w0) superAppMainScreenAddressInteractorImpl$listenToUserLocation$$inlined$mapNotNull$1$2$1.L$5;
                vprVar = (vpr) superAppMainScreenAddressInteractorImpl$listenToUserLocation$$inlined$mapNotNull$1$2$1.L$3;
                kotlin.b.b(obj2);
                mo21Var = (mo21) obj2;
                if (mo21Var == null) {
                    fdz fdzVar = vVar.k;
                    if (j1w0Var.b) {
                        fdzVar.getClass();
                    } else if (!fdzVar.f.getAndSet(true)) {
                        fdzVar.a.a(SuperappMainAnalytics$LocationUpdateType.FirstUpdateAfterFilter, fdzVar.a(mo21Var));
                    }
                } else {
                    mo21Var = null;
                }
                if (mo21Var != null) {
                    superAppMainScreenAddressInteractorImpl$listenToUserLocation$$inlined$mapNotNull$1$2$1.L$0 = null;
                    superAppMainScreenAddressInteractorImpl$listenToUserLocation$$inlined$mapNotNull$1$2$1.L$1 = null;
                    superAppMainScreenAddressInteractorImpl$listenToUserLocation$$inlined$mapNotNull$1$2$1.L$2 = null;
                    superAppMainScreenAddressInteractorImpl$listenToUserLocation$$inlined$mapNotNull$1$2$1.L$3 = null;
                    superAppMainScreenAddressInteractorImpl$listenToUserLocation$$inlined$mapNotNull$1$2$1.L$4 = null;
                    superAppMainScreenAddressInteractorImpl$listenToUserLocation$$inlined$mapNotNull$1$2$1.L$5 = null;
                    superAppMainScreenAddressInteractorImpl$listenToUserLocation$$inlined$mapNotNull$1$2$1.label = 2;
                }
                return zy11.a;
            }
        }
        superAppMainScreenAddressInteractorImpl$listenToUserLocation$$inlined$mapNotNull$1$2$1 = new SuperAppMainScreenAddressInteractorImpl$listenToUserLocation$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = superAppMainScreenAddressInteractorImpl$listenToUserLocation$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppMainScreenAddressInteractorImpl$listenToUserLocation$$inlined$mapNotNull$1$2$1.label;
        v vVar2 = this.b;
        if (i != 0) {
        }
        mo21Var = (mo21) obj22;
        if (mo21Var == null) {
        }
        if (mo21Var != null) {
        }
        return zy11.a;
    }
}
