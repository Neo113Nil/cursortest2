package com.yandex.go.summary.branding_pin;

import defpackage.fnx0;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.rj6;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class g implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ i b;

    public g(vpr vprVar, i iVar) {
        this.a = vprVar;
        this.b = iVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ad, code lost:
    
        if (r8.emit(r7, r0) != r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        BrandingPinInteractorImpl$hasSourceBrandingPinStateFlow$$inlined$map$1$2$1 brandingPinInteractorImpl$hasSourceBrandingPinStateFlow$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        rj6 rj6Var;
        if (continuation instanceof BrandingPinInteractorImpl$hasSourceBrandingPinStateFlow$$inlined$map$1$2$1) {
            brandingPinInteractorImpl$hasSourceBrandingPinStateFlow$$inlined$map$1$2$1 = (BrandingPinInteractorImpl$hasSourceBrandingPinStateFlow$$inlined$map$1$2$1) continuation;
            int i2 = brandingPinInteractorImpl$hasSourceBrandingPinStateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                brandingPinInteractorImpl$hasSourceBrandingPinStateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = brandingPinInteractorImpl$hasSourceBrandingPinStateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = brandingPinInteractorImpl$hasSourceBrandingPinStateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    pex0 pex0Var = ((fnx0) obj).c;
                    i iVar = this.b;
                    rj6 a = i.a(iVar, pex0Var);
                    brandingPinInteractorImpl$hasSourceBrandingPinStateFlow$$inlined$map$1$2$1.L$0 = null;
                    brandingPinInteractorImpl$hasSourceBrandingPinStateFlow$$inlined$map$1$2$1.L$1 = null;
                    brandingPinInteractorImpl$hasSourceBrandingPinStateFlow$$inlined$map$1$2$1.L$2 = null;
                    brandingPinInteractorImpl$hasSourceBrandingPinStateFlow$$inlined$map$1$2$1.L$3 = null;
                    vpr vprVar2 = this.a;
                    brandingPinInteractorImpl$hasSourceBrandingPinStateFlow$$inlined$map$1$2$1.L$4 = vprVar2;
                    brandingPinInteractorImpl$hasSourceBrandingPinStateFlow$$inlined$map$1$2$1.L$5 = null;
                    brandingPinInteractorImpl$hasSourceBrandingPinStateFlow$$inlined$map$1$2$1.L$6 = null;
                    brandingPinInteractorImpl$hasSourceBrandingPinStateFlow$$inlined$map$1$2$1.L$7 = a;
                    brandingPinInteractorImpl$hasSourceBrandingPinStateFlow$$inlined$map$1$2$1.label = 1;
                    obj2 = i.b(iVar, brandingPinInteractorImpl$hasSourceBrandingPinStateFlow$$inlined$map$1$2$1);
                    if (obj2 != coroutineSingletons) {
                        vprVar = vprVar2;
                        rj6Var = a;
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
                rj6Var = (rj6) brandingPinInteractorImpl$hasSourceBrandingPinStateFlow$$inlined$map$1$2$1.L$7;
                vprVar = (vpr) brandingPinInteractorImpl$hasSourceBrandingPinStateFlow$$inlined$map$1$2$1.L$4;
                kotlin.b.b(obj2);
                Boolean valueOf = Boolean.valueOf((((Boolean) obj2).booleanValue() || rj6Var.equals(rj6.e)) ? false : true);
                brandingPinInteractorImpl$hasSourceBrandingPinStateFlow$$inlined$map$1$2$1.L$0 = null;
                brandingPinInteractorImpl$hasSourceBrandingPinStateFlow$$inlined$map$1$2$1.L$1 = null;
                brandingPinInteractorImpl$hasSourceBrandingPinStateFlow$$inlined$map$1$2$1.L$2 = null;
                brandingPinInteractorImpl$hasSourceBrandingPinStateFlow$$inlined$map$1$2$1.L$3 = null;
                brandingPinInteractorImpl$hasSourceBrandingPinStateFlow$$inlined$map$1$2$1.L$4 = null;
                brandingPinInteractorImpl$hasSourceBrandingPinStateFlow$$inlined$map$1$2$1.L$5 = null;
                brandingPinInteractorImpl$hasSourceBrandingPinStateFlow$$inlined$map$1$2$1.L$6 = null;
                brandingPinInteractorImpl$hasSourceBrandingPinStateFlow$$inlined$map$1$2$1.L$7 = null;
                brandingPinInteractorImpl$hasSourceBrandingPinStateFlow$$inlined$map$1$2$1.label = 2;
            }
        }
        brandingPinInteractorImpl$hasSourceBrandingPinStateFlow$$inlined$map$1$2$1 = new BrandingPinInteractorImpl$hasSourceBrandingPinStateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = brandingPinInteractorImpl$hasSourceBrandingPinStateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = brandingPinInteractorImpl$hasSourceBrandingPinStateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        Boolean valueOf2 = Boolean.valueOf((((Boolean) obj22).booleanValue() || rj6Var.equals(rj6.e)) ? false : true);
        brandingPinInteractorImpl$hasSourceBrandingPinStateFlow$$inlined$map$1$2$1.L$0 = null;
        brandingPinInteractorImpl$hasSourceBrandingPinStateFlow$$inlined$map$1$2$1.L$1 = null;
        brandingPinInteractorImpl$hasSourceBrandingPinStateFlow$$inlined$map$1$2$1.L$2 = null;
        brandingPinInteractorImpl$hasSourceBrandingPinStateFlow$$inlined$map$1$2$1.L$3 = null;
        brandingPinInteractorImpl$hasSourceBrandingPinStateFlow$$inlined$map$1$2$1.L$4 = null;
        brandingPinInteractorImpl$hasSourceBrandingPinStateFlow$$inlined$map$1$2$1.L$5 = null;
        brandingPinInteractorImpl$hasSourceBrandingPinStateFlow$$inlined$map$1$2$1.L$6 = null;
        brandingPinInteractorImpl$hasSourceBrandingPinStateFlow$$inlined$map$1$2$1.L$7 = null;
        brandingPinInteractorImpl$hasSourceBrandingPinStateFlow$$inlined$map$1$2$1.label = 2;
    }
}
