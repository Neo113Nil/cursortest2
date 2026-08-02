package androidx.compose.foundation.gestures;

import defpackage.b92;
import defpackage.dl01;
import defpackage.f531;
import defpackage.f89;
import defpackage.gtq0;
import defpackage.ja30;
import defpackage.jj2;
import defpackage.jl40;
import defpackage.lxv;
import defpackage.ngd0;
import defpackage.ny61;
import defpackage.oj2;
import defpackage.sb0;
import defpackage.sls;
import defpackage.tls;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes10.dex */
public final class b0 {
    public static final oj2 f = new oj2(0.0f);
    public final f531 a;
    public long b = Long.MIN_VALUE;
    public oj2 c = f;
    public boolean d;
    public float e;

    public b0(jj2 jj2Var) {
        this.a = jj2Var.a(gtq0.f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ae, code lost:
    
        if (r13 != 0.0f) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d4, code lost:
    
        if (defpackage.jl40.z(r4.get_context()).v(r9, r4) == r3) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* JADX WARN: Type inference failed for: r14v7, types: [tls] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00a6 -> B:23:0x00a9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(f89 f89Var, sb0 sb0Var, ContinuationImpl continuationImpl) {
        UpdatableAnimationState$animateToZero$1 updatableAnimationState$animateToZero$1;
        int i;
        oj2 oj2Var;
        float f2;
        UpdatableAnimationState$animateToZero$1 updatableAnimationState$animateToZero$12;
        f89 f89Var2;
        sls slsVar;
        try {
            if (continuationImpl instanceof UpdatableAnimationState$animateToZero$1) {
                updatableAnimationState$animateToZero$1 = (UpdatableAnimationState$animateToZero$1) continuationImpl;
                int i2 = updatableAnimationState$animateToZero$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    updatableAnimationState$animateToZero$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = updatableAnimationState$animateToZero$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = updatableAnimationState$animateToZero$1.label;
                    oj2Var = f;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        if (this.d) {
                            lxv.c("animateToZero called while previous animation is running");
                        }
                        ja30 ja30Var = (ja30) updatableAnimationState$animateToZero$1.get_context().get(ngd0.C);
                        float scaleFactor = ja30Var != null ? ja30Var.getScaleFactor() : 1.0f;
                        this.d = true;
                        f2 = scaleFactor;
                        updatableAnimationState$animateToZero$12 = updatableAnimationState$animateToZero$1;
                        f89Var2 = f89Var;
                        slsVar = sb0Var;
                        if (Math.abs(this.e) >= 0.01f) {
                            b92 b92Var = new b92(this, f2, f89Var2);
                            updatableAnimationState$animateToZero$12.L$0 = f89Var2;
                            updatableAnimationState$animateToZero$12.L$1 = slsVar;
                            updatableAnimationState$animateToZero$12.F$0 = f2;
                            updatableAnimationState$animateToZero$12.label = 1;
                            if (jl40.z(updatableAnimationState$animateToZero$12.get_context()).v(b92Var, updatableAnimationState$animateToZero$12) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            slsVar.invoke();
                        } else {
                            if (Math.abs(this.e) == 0.0f) {
                                this.b = Long.MIN_VALUE;
                                this.c = oj2Var;
                                this.d = false;
                                return zy11.a;
                            }
                            dl01 dl01Var = new dl01(19, this, f89Var2);
                            updatableAnimationState$animateToZero$12.L$0 = slsVar;
                            updatableAnimationState$animateToZero$12.L$1 = null;
                            updatableAnimationState$animateToZero$12.label = 2;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            slsVar = (sls) updatableAnimationState$animateToZero$1.L$0;
                            kotlin.b.b(obj);
                            slsVar.invoke();
                            this.b = Long.MIN_VALUE;
                            this.c = oj2Var;
                            this.d = false;
                            return zy11.a;
                        }
                        float f3 = updatableAnimationState$animateToZero$1.F$0;
                        sls slsVar2 = (sls) updatableAnimationState$animateToZero$1.L$1;
                        ?? r14 = (tls) updatableAnimationState$animateToZero$1.L$0;
                        kotlin.b.b(obj);
                        updatableAnimationState$animateToZero$12 = updatableAnimationState$animateToZero$1;
                        slsVar = slsVar2;
                        f2 = f3;
                        f89Var2 = r14;
                        slsVar.invoke();
                    }
                }
            }
            if (i != 0) {
            }
        } catch (Throwable th) {
            this.b = Long.MIN_VALUE;
            this.c = oj2Var;
            this.d = false;
            throw th;
        }
        updatableAnimationState$animateToZero$1 = new UpdatableAnimationState$animateToZero$1(this, continuationImpl);
        Object obj2 = updatableAnimationState$animateToZero$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = updatableAnimationState$animateToZero$1.label;
        oj2Var = f;
    }
}
