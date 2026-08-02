package com.yandex.go.drive.sdkintegration.domain.session;

import defpackage.ny61;
import defpackage.t1r0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ e b;

    public c(vpr vprVar, e eVar) {
        this.a = vprVar;
        this.b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DriveSessionInteractorImpl$fetchSessionState$$inlined$map$1$2$1 driveSessionInteractorImpl$fetchSessionState$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof DriveSessionInteractorImpl$fetchSessionState$$inlined$map$1$2$1) {
            driveSessionInteractorImpl$fetchSessionState$$inlined$map$1$2$1 = (DriveSessionInteractorImpl$fetchSessionState$$inlined$map$1$2$1) continuation;
            int i2 = driveSessionInteractorImpl$fetchSessionState$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                driveSessionInteractorImpl$fetchSessionState$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = driveSessionInteractorImpl$fetchSessionState$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = driveSessionInteractorImpl$fetchSessionState$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    e eVar = this.b;
                    t1r0 t1r0Var = booleanValue ? (t1r0) eVar.e.get() : (t1r0) eVar.d.get();
                    driveSessionInteractorImpl$fetchSessionState$$inlined$map$1$2$1.L$0 = null;
                    driveSessionInteractorImpl$fetchSessionState$$inlined$map$1$2$1.L$1 = null;
                    driveSessionInteractorImpl$fetchSessionState$$inlined$map$1$2$1.L$2 = null;
                    driveSessionInteractorImpl$fetchSessionState$$inlined$map$1$2$1.L$3 = null;
                    driveSessionInteractorImpl$fetchSessionState$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(t1r0Var, driveSessionInteractorImpl$fetchSessionState$$inlined$map$1$2$1) == coroutineSingletons) {
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
        driveSessionInteractorImpl$fetchSessionState$$inlined$map$1$2$1 = new DriveSessionInteractorImpl$fetchSessionState$$inlined$map$1$2$1(this, continuation);
        Object obj22 = driveSessionInteractorImpl$fetchSessionState$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = driveSessionInteractorImpl$fetchSessionState$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
