package com.yandex.mob.domain;

import defpackage.evu0;
import defpackage.ffx;
import defpackage.jl40;
import defpackage.jr20;
import defpackage.npt;
import defpackage.ny61;
import defpackage.tn20;
import defpackage.tpr;
import defpackage.un20;
import defpackage.ym20;
import defpackage.zp7;
import defpackage.zy11;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes8.dex */
public final class f implements un20 {
    public final com.yandex.mob.datastore.d a;
    public final npt b;
    public final l c;
    public final jr20 d;
    public final AtomicReference e = new AtomicReference(null);
    public final AtomicReference f = new AtomicReference(null);
    public final AtomicReference g = new AtomicReference(null);
    public final n0 h = ffx.c(0, 1, BufferOverflow.DROP_OLDEST, 1);

    public f(com.yandex.mob.datastore.d dVar, npt nptVar, l lVar, jr20 jr20Var) {
        this.a = dVar;
        this.b = nptVar;
        this.c = lVar;
        this.d = jr20Var;
    }

    @Override // defpackage.un20
    public final tpr a() {
        return this.h;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.un20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Continuation continuation) {
        CurrentMobContourTracker$currentContour$1 currentMobContourTracker$currentContour$1;
        int i;
        tn20 tn20Var;
        long j;
        int intValue;
        if (continuation instanceof CurrentMobContourTracker$currentContour$1) {
            currentMobContourTracker$currentContour$1 = (CurrentMobContourTracker$currentContour$1) continuation;
            int i2 = currentMobContourTracker$currentContour$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                currentMobContourTracker$currentContour$1.label = i2 - Integer.MIN_VALUE;
                Object obj = currentMobContourTracker$currentContour$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = currentMobContourTracker$currentContour$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tn20 tn20Var2 = (tn20) this.e.get();
                    if (tn20Var2 != null) {
                        long b = this.b.b();
                        currentMobContourTracker$currentContour$1.L$0 = tn20Var2;
                        currentMobContourTracker$currentContour$1.J$0 = b;
                        currentMobContourTracker$currentContour$1.label = 1;
                        Object f = this.c.f(currentMobContourTracker$currentContour$1);
                        if (f == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        tn20Var = tn20Var2;
                        obj = f;
                        j = b;
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j = currentMobContourTracker$currentContour$1.J$0;
                tn20Var = (tn20) currentMobContourTracker$currentContour$1.L$0;
                kotlin.b.b(obj);
                intValue = ((Number) obj).intValue();
                this.g.set(new Integer(intValue));
                if (j - tn20Var.b <= intValue) {
                    return tn20Var.a;
                }
                return null;
            }
        }
        currentMobContourTracker$currentContour$1 = new CurrentMobContourTracker$currentContour$1(this, (ContinuationImpl) continuation);
        Object obj2 = currentMobContourTracker$currentContour$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = currentMobContourTracker$currentContour$1.label;
        if (i != 0) {
        }
        intValue = ((Number) obj2).intValue();
        this.g.set(new Integer(intValue));
        if (j - tn20Var.b <= intValue) {
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x005a, code lost:
    
        if (r7 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x005c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x004a, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.un20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Continuation continuation) {
        CurrentMobContourTracker$init$1 currentMobContourTracker$init$1;
        int i;
        AtomicReference atomicReference;
        String str;
        AtomicReference atomicReference2;
        AtomicReference atomicReference3;
        if (continuation instanceof CurrentMobContourTracker$init$1) {
            currentMobContourTracker$init$1 = (CurrentMobContourTracker$init$1) continuation;
            int i2 = currentMobContourTracker$init$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                currentMobContourTracker$init$1.label = i2 - Integer.MIN_VALUE;
                Object obj = currentMobContourTracker$init$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = currentMobContourTracker$init$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    atomicReference = this.g;
                    currentMobContourTracker$init$1.L$0 = atomicReference;
                    currentMobContourTracker$init$1.label = 1;
                    obj = this.c.f(currentMobContourTracker$init$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        tn20 tn20Var = (tn20) obj;
                        if (tn20Var != null && (str = tn20Var.a) != null && (!evu0.J(str)) && !jl40.l(str, "default")) {
                            do {
                                atomicReference2 = this.e;
                                if (atomicReference2.compareAndSet(null, tn20Var)) {
                                    break;
                                }
                            } while (atomicReference2.get() == null);
                            do {
                                atomicReference3 = this.f;
                                if (atomicReference3.compareAndSet(null, tn20Var)) {
                                    break;
                                }
                            } while (atomicReference3.get() == null);
                        }
                        return zy11.a;
                    }
                    atomicReference = (AtomicReference) currentMobContourTracker$init$1.L$0;
                    kotlin.b.b(obj);
                }
                atomicReference.set(obj);
                currentMobContourTracker$init$1.L$0 = null;
                currentMobContourTracker$init$1.label = 2;
                obj = this.a.f(currentMobContourTracker$init$1);
            }
        }
        currentMobContourTracker$init$1 = new CurrentMobContourTracker$init$1(this, (ContinuationImpl) continuation);
        Object obj2 = currentMobContourTracker$init$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = currentMobContourTracker$init$1.label;
        if (i != 0) {
        }
        atomicReference.set(obj2);
        currentMobContourTracker$init$1.L$0 = null;
        currentMobContourTracker$init$1.label = 2;
        obj2 = this.a.f(currentMobContourTracker$init$1);
    }

    @Override // defpackage.un20
    public final void d(String str) {
        if (evu0.J(str) || str.equals("default")) {
            return;
        }
        long b = this.b.b();
        tn20 tn20Var = new tn20(str, b);
        tn20 tn20Var2 = (tn20) this.e.getAndSet(tn20Var);
        boolean l = jl40.l(tn20Var2 != null ? tn20Var2.a : null, str);
        jr20 jr20Var = this.d;
        AtomicReference atomicReference = this.f;
        n0 n0Var = this.h;
        if (!l) {
            atomicReference.set(tn20Var);
            jr20.b(jr20Var, null, new CurrentMobContourTracker$persistAsync$1(this, tn20Var, null), 3);
            n0Var.g(new ym20(str));
            return;
        }
        if (((Integer) this.g.get()) != null && b - tn20Var2.b > r5.intValue()) {
            atomicReference.set(tn20Var);
            jr20.b(jr20Var, null, new CurrentMobContourTracker$persistAsync$1(this, tn20Var, null), 3);
            n0Var.g(new ym20(str));
        } else {
            tn20 tn20Var3 = (tn20) atomicReference.getAndUpdate(new zp7(2, tn20Var));
            if (!jl40.l(tn20Var3 != null ? tn20Var3.a : null, str) || b - tn20Var3.b >= 10) {
                jr20.b(jr20Var, null, new CurrentMobContourTracker$persistAsyncThrottled$1(this, tn20Var, null), 3);
            }
        }
    }
}
