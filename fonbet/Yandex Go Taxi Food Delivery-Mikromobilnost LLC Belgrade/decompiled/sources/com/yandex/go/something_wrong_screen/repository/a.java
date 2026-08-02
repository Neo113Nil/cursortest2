package com.yandex.go.something_wrong_screen.repository;

import com.yandex.go.something_wrong_screen.domain.entities.SomethingWrongScreenEntryPoint;
import com.yandex.go.something_wrong_screen.experiment.SomethingWrongScreenExperiment;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.w511;
import defpackage.y8t0;
import defpackage.z8t0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class a implements vpr {
    public final /* synthetic */ SomethingWrongScreenEntryPoint a;
    public final /* synthetic */ b b;

    public a(SomethingWrongScreenEntryPoint somethingWrongScreenEntryPoint, b bVar) {
        this.a = somethingWrongScreenEntryPoint;
        this.b = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        if (r9 == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
    
        if (r9 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SomethingWrongScreenRepositoryImpl$initSomethingWrongScreen$$inlined$safeCollect$2$1 somethingWrongScreenRepositoryImpl$initSomethingWrongScreen$$inlined$safeCollect$2$1;
        int i;
        z8t0 z8t0Var;
        if (continuation instanceof SomethingWrongScreenRepositoryImpl$initSomethingWrongScreen$$inlined$safeCollect$2$1) {
            somethingWrongScreenRepositoryImpl$initSomethingWrongScreen$$inlined$safeCollect$2$1 = (SomethingWrongScreenRepositoryImpl$initSomethingWrongScreen$$inlined$safeCollect$2$1) continuation;
            int i2 = somethingWrongScreenRepositoryImpl$initSomethingWrongScreen$$inlined$safeCollect$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                somethingWrongScreenRepositoryImpl$initSomethingWrongScreen$$inlined$safeCollect$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = somethingWrongScreenRepositoryImpl$initSomethingWrongScreen$$inlined$safeCollect$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = somethingWrongScreenRepositoryImpl$initSomethingWrongScreen$$inlined$safeCollect$2$1.label;
                b bVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    SomethingWrongScreenExperiment somethingWrongScreenExperiment = (SomethingWrongScreenExperiment) obj;
                    int i3 = y8t0.a[this.a.ordinal()];
                    if (i3 == 1) {
                        somethingWrongScreenRepositoryImpl$initSomethingWrongScreen$$inlined$safeCollect$2$1.L$0 = null;
                        somethingWrongScreenRepositoryImpl$initSomethingWrongScreen$$inlined$safeCollect$2$1.L$1 = null;
                        somethingWrongScreenRepositoryImpl$initSomethingWrongScreen$$inlined$safeCollect$2$1.L$2 = null;
                        somethingWrongScreenRepositoryImpl$initSomethingWrongScreen$$inlined$safeCollect$2$1.label = 1;
                        obj2 = b.b(bVar, somethingWrongScreenExperiment, somethingWrongScreenRepositoryImpl$initSomethingWrongScreen$$inlined$safeCollect$2$1);
                    } else {
                        if (i3 != 2) {
                            w511.b();
                            return null;
                        }
                        somethingWrongScreenRepositoryImpl$initSomethingWrongScreen$$inlined$safeCollect$2$1.L$0 = null;
                        somethingWrongScreenRepositoryImpl$initSomethingWrongScreen$$inlined$safeCollect$2$1.L$1 = null;
                        somethingWrongScreenRepositoryImpl$initSomethingWrongScreen$$inlined$safeCollect$2$1.L$2 = null;
                        somethingWrongScreenRepositoryImpl$initSomethingWrongScreen$$inlined$safeCollect$2$1.label = 2;
                        obj2 = b.a(bVar, somethingWrongScreenExperiment, somethingWrongScreenRepositoryImpl$initSomethingWrongScreen$$inlined$safeCollect$2$1);
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    kotlin.b.b(obj2);
                    z8t0Var = (z8t0) obj2;
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    z8t0Var = (z8t0) obj2;
                }
                bVar.h.l(z8t0Var);
                return zy11.a;
            }
        }
        somethingWrongScreenRepositoryImpl$initSomethingWrongScreen$$inlined$safeCollect$2$1 = new SomethingWrongScreenRepositoryImpl$initSomethingWrongScreen$$inlined$safeCollect$2$1(this, continuation);
        Object obj22 = somethingWrongScreenRepositoryImpl$initSomethingWrongScreen$$inlined$safeCollect$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = somethingWrongScreenRepositoryImpl$initSomethingWrongScreen$$inlined$safeCollect$2$1.label;
        b bVar2 = this.b;
        if (i != 0) {
        }
        bVar2.h.l(z8t0Var);
        return zy11.a;
    }
}
