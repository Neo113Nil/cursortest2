package com.yandex.go.scooters.ignition.domain;

import defpackage.mdh;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.ssn0;
import defpackage.uyj;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class o implements vpr {
    public final /* synthetic */ ssn0 a;

    public o(ssn0 ssn0Var) {
        this.a = ssn0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007d, code lost:
    
        if (defpackage.tje.k0(r8, r2, r0) != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0060, code lost:
    
        if (r8.e(r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ScootersIgnitionUserStateProcessingInteractor$onFirstContentfulPaint$$inlined$collectIn$1$1$1 scootersIgnitionUserStateProcessingInteractor$onFirstContentfulPaint$$inlined$collectIn$1$1$1;
        int i;
        boolean booleanValue;
        if (continuation instanceof ScootersIgnitionUserStateProcessingInteractor$onFirstContentfulPaint$$inlined$collectIn$1$1$1) {
            scootersIgnitionUserStateProcessingInteractor$onFirstContentfulPaint$$inlined$collectIn$1$1$1 = (ScootersIgnitionUserStateProcessingInteractor$onFirstContentfulPaint$$inlined$collectIn$1$1$1) continuation;
            int i2 = scootersIgnitionUserStateProcessingInteractor$onFirstContentfulPaint$$inlined$collectIn$1$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersIgnitionUserStateProcessingInteractor$onFirstContentfulPaint$$inlined$collectIn$1$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersIgnitionUserStateProcessingInteractor$onFirstContentfulPaint$$inlined$collectIn$1$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersIgnitionUserStateProcessingInteractor$onFirstContentfulPaint$$inlined$collectIn$1$1$1.label;
                ssn0 ssn0Var = this.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    booleanValue = ((Boolean) obj).booleanValue();
                    if (!booleanValue) {
                        k kVar = (k) ssn0Var.c.get();
                        scootersIgnitionUserStateProcessingInteractor$onFirstContentfulPaint$$inlined$collectIn$1$1$1.L$0 = null;
                        scootersIgnitionUserStateProcessingInteractor$onFirstContentfulPaint$$inlined$collectIn$1$1$1.L$1 = null;
                        scootersIgnitionUserStateProcessingInteractor$onFirstContentfulPaint$$inlined$collectIn$1$1$1.Z$0 = booleanValue;
                        scootersIgnitionUserStateProcessingInteractor$onFirstContentfulPaint$$inlined$collectIn$1$1$1.label = 1;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    booleanValue = scootersIgnitionUserStateProcessingInteractor$onFirstContentfulPaint$$inlined$collectIn$1$1$1.Z$0;
                    kotlin.b.b(obj2);
                }
                ssn0Var.a.getClass();
                sjh sjhVar = uyj.a;
                mdh mdhVar = mdh.b;
                ScootersIgnitionUserStateProcessingInteractor$onFirstContentfulPaint$2$1 scootersIgnitionUserStateProcessingInteractor$onFirstContentfulPaint$2$1 = new ScootersIgnitionUserStateProcessingInteractor$onFirstContentfulPaint$2$1(ssn0Var, booleanValue, null);
                scootersIgnitionUserStateProcessingInteractor$onFirstContentfulPaint$$inlined$collectIn$1$1$1.L$0 = null;
                scootersIgnitionUserStateProcessingInteractor$onFirstContentfulPaint$$inlined$collectIn$1$1$1.L$1 = null;
                scootersIgnitionUserStateProcessingInteractor$onFirstContentfulPaint$$inlined$collectIn$1$1$1.Z$0 = booleanValue;
                scootersIgnitionUserStateProcessingInteractor$onFirstContentfulPaint$$inlined$collectIn$1$1$1.label = 2;
            }
        }
        scootersIgnitionUserStateProcessingInteractor$onFirstContentfulPaint$$inlined$collectIn$1$1$1 = new ScootersIgnitionUserStateProcessingInteractor$onFirstContentfulPaint$$inlined$collectIn$1$1$1(this, continuation);
        Object obj22 = scootersIgnitionUserStateProcessingInteractor$onFirstContentfulPaint$$inlined$collectIn$1$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersIgnitionUserStateProcessingInteractor$onFirstContentfulPaint$$inlined$collectIn$1$1$1.label;
        ssn0 ssn0Var2 = this.a;
        if (i != 0) {
        }
        ssn0Var2.a.getClass();
        sjh sjhVar2 = uyj.a;
        mdh mdhVar2 = mdh.b;
        ScootersIgnitionUserStateProcessingInteractor$onFirstContentfulPaint$2$1 scootersIgnitionUserStateProcessingInteractor$onFirstContentfulPaint$2$12 = new ScootersIgnitionUserStateProcessingInteractor$onFirstContentfulPaint$2$1(ssn0Var2, booleanValue, null);
        scootersIgnitionUserStateProcessingInteractor$onFirstContentfulPaint$$inlined$collectIn$1$1$1.L$0 = null;
        scootersIgnitionUserStateProcessingInteractor$onFirstContentfulPaint$$inlined$collectIn$1$1$1.L$1 = null;
        scootersIgnitionUserStateProcessingInteractor$onFirstContentfulPaint$$inlined$collectIn$1$1$1.Z$0 = booleanValue;
        scootersIgnitionUserStateProcessingInteractor$onFirstContentfulPaint$$inlined$collectIn$1$1$1.label = 2;
    }
}
