package androidx.compose.animation.core;

import androidx.compose.animation.core.e;
import defpackage.fse;
import defpackage.fvb;
import defpackage.fxg;
import defpackage.gl11;
import defpackage.gtq0;
import defpackage.gxg;
import defpackage.ja30;
import defpackage.jj2;
import defpackage.jl40;
import defpackage.kj2;
import defpackage.lax0;
import defpackage.mhe0;
import defpackage.mj1;
import defpackage.ngd0;
import defpackage.ny61;
import defpackage.oxv0;
import defpackage.sb2;
import defpackage.sj2;
import defpackage.tls;
import defpackage.twt0;
import defpackage.uwl0;
import defpackage.vg2;
import defpackage.vww0;
import defpackage.w5b1;
import defpackage.wls;
import defpackage.xi2;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes.dex */
public abstract class e {
    public static final Object a(float f, float f2, float f3, jj2 jj2Var, wls wlsVar, Continuation continuation) {
        gl11 gl11Var = gtq0.f;
        Float f4 = new Float(f);
        Float f5 = new Float(f2);
        Float f6 = new Float(f3);
        tls tlsVar = gl11Var.a;
        sj2 sj2Var = (sj2) tlsVar.invoke(f6);
        if (sj2Var == null) {
            sj2Var = ((sj2) tlsVar.invoke(f4)).c();
        }
        sj2 sj2Var2 = sj2Var;
        Object b = b(new kj2(gl11Var, f4, sj2Var2, 56), new lax0(jj2Var, gl11Var, f4, f5, sj2Var2), Long.MIN_VALUE, new mj1(wlsVar, 11), continuation);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        zy11 zy11Var = zy11.a;
        if (b != coroutineSingletons) {
            b = zy11Var;
        }
        return b == coroutineSingletons ? b : zy11Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00fa A[Catch: CancellationException -> 0x0044, TRY_LEAVE, TryCatch #3 {CancellationException -> 0x0044, blocks: (B:16:0x003f, B:18:0x00f0, B:20:0x00fa, B:25:0x011d, B:27:0x012d, B:33:0x0132), top: B:15:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Type inference failed for: r14v0, types: [T, xi2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(kj2 kj2Var, vg2 vg2Var, long j, final tls tlsVar, Continuation continuation) {
        SuspendAnimationKt$animate$4 suspendAnimationKt$animate$4;
        int i;
        final Ref$ObjectRef ref$ObjectRef;
        final kj2 kj2Var2;
        kj2 kj2Var3;
        tls tlsVar2;
        Ref$ObjectRef ref$ObjectRef2;
        Object v;
        tls tlsVar3;
        xi2 xi2Var;
        xi2 xi2Var2;
        Object v2;
        final vg2 vg2Var2 = vg2Var;
        if (continuation instanceof SuspendAnimationKt$animate$4) {
            suspendAnimationKt$animate$4 = (SuspendAnimationKt$animate$4) continuation;
            int i2 = suspendAnimationKt$animate$4.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                suspendAnimationKt$animate$4.label = i2 - Integer.MIN_VALUE;
                SuspendAnimationKt$animate$4 suspendAnimationKt$animate$42 = suspendAnimationKt$animate$4;
                Object obj = suspendAnimationKt$animate$42.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = suspendAnimationKt$animate$42.label;
                int i3 = 21;
                if (i != 0) {
                    kotlin.b.b(obj);
                    final Object f = vg2Var2.f(0L);
                    final sj2 h = vg2Var2.h(0L);
                    ref$ObjectRef = new Ref$ObjectRef();
                    if (j == Long.MIN_VALUE) {
                        try {
                            final float h2 = h(suspendAnimationKt$animate$42.get_context());
                            kj2Var2 = kj2Var;
                            try {
                                tlsVar2 = new tls() { // from class: uww0
                                    /* JADX WARN: Type inference failed for: r0v0, types: [T, xi2] */
                                    @Override // defpackage.tls
                                    public final Object invoke(Object obj2) {
                                        long longValue = ((Long) obj2).longValue();
                                        vg2 vg2Var3 = vg2Var2;
                                        gl11 e = vg2Var3.e();
                                        Object g = vg2Var3.g();
                                        kj2 kj2Var4 = kj2Var2;
                                        ?? xi2Var3 = new xi2(f, e, h, longValue, g, longValue, new vww0(1, kj2Var4));
                                        e.g(xi2Var3, longValue, h2, vg2Var3, kj2Var4, tlsVar);
                                        Ref$ObjectRef.this.element = xi2Var3;
                                        return zy11.a;
                                    }
                                };
                                ref$ObjectRef2 = ref$ObjectRef;
                            } catch (CancellationException e) {
                                e = e;
                                kj2Var3 = kj2Var2;
                                xi2Var = (xi2) ref$ObjectRef.element;
                                if (xi2Var != null) {
                                }
                                xi2Var2 = (xi2) ref$ObjectRef.element;
                                if (xi2Var2 != null) {
                                    kj2Var3.j(false);
                                }
                                throw e;
                            }
                            try {
                                suspendAnimationKt$animate$42.L$0 = kj2Var2;
                                suspendAnimationKt$animate$42.L$1 = vg2Var2;
                                suspendAnimationKt$animate$42.L$2 = tlsVar;
                                suspendAnimationKt$animate$42.L$3 = ref$ObjectRef2;
                                suspendAnimationKt$animate$42.label = 1;
                                if (vg2Var2.b()) {
                                    v = w5b1.e(tlsVar2, suspendAnimationKt$animate$42);
                                } else {
                                    v = jl40.z(suspendAnimationKt$animate$42.get_context()).v(new uwl0(i3, tlsVar2), suspendAnimationKt$animate$42);
                                }
                                if (v != coroutineSingletons) {
                                    kj2Var3 = kj2Var2;
                                    tlsVar3 = tlsVar;
                                }
                                return coroutineSingletons;
                            } catch (CancellationException e2) {
                                e = e2;
                                kj2Var3 = kj2Var2;
                                ref$ObjectRef = ref$ObjectRef2;
                                xi2Var = (xi2) ref$ObjectRef.element;
                                if (xi2Var != null) {
                                }
                                xi2Var2 = (xi2) ref$ObjectRef.element;
                                if (xi2Var2 != null) {
                                }
                                throw e;
                            }
                        } catch (CancellationException e3) {
                            e = e3;
                            kj2Var2 = kj2Var;
                        }
                    } else {
                        ref$ObjectRef2 = ref$ObjectRef;
                        try {
                            ?? xi2Var3 = new xi2(f, vg2Var2.e(), h, j, vg2Var2.g(), j, new vww0(0, kj2Var));
                            g(xi2Var3, j, h(suspendAnimationKt$animate$42.get_context()), vg2Var2, kj2Var, tlsVar);
                            ref$ObjectRef2.element = xi2Var3;
                            kj2Var3 = kj2Var;
                            vg2Var2 = vg2Var;
                            tlsVar3 = tlsVar;
                        } catch (CancellationException e4) {
                            e = e4;
                            kj2Var3 = kj2Var;
                            ref$ObjectRef = ref$ObjectRef2;
                            xi2Var = (xi2) ref$ObjectRef.element;
                            if (xi2Var != null) {
                                xi2Var.k();
                            }
                            xi2Var2 = (xi2) ref$ObjectRef.element;
                            if (xi2Var2 != null && xi2Var2.c() == kj2Var3.b()) {
                                kj2Var3.j(false);
                            }
                            throw e;
                        }
                    }
                    ref$ObjectRef = ref$ObjectRef2;
                } else {
                    if (i != 1 && i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ref$ObjectRef = (Ref$ObjectRef) suspendAnimationKt$animate$42.L$3;
                    tlsVar3 = (tls) suspendAnimationKt$animate$42.L$2;
                    vg2Var2 = (vg2) suspendAnimationKt$animate$42.L$1;
                    kj2Var3 = (kj2) suspendAnimationKt$animate$42.L$0;
                    try {
                        kotlin.b.b(obj);
                    } catch (CancellationException e5) {
                        e = e5;
                        xi2Var = (xi2) ref$ObjectRef.element;
                        if (xi2Var != null) {
                        }
                        xi2Var2 = (xi2) ref$ObjectRef.element;
                        if (xi2Var2 != null) {
                        }
                        throw e;
                    }
                }
                while (((xi2) ref$ObjectRef.element).h()) {
                    Ref$ObjectRef ref$ObjectRef3 = ref$ObjectRef;
                    tls tlsVar4 = tlsVar3;
                    vg2 vg2Var3 = vg2Var2;
                    kj2 kj2Var4 = kj2Var3;
                    try {
                        fvb fvbVar = new fvb(ref$ObjectRef3, h(suspendAnimationKt$animate$42.get_context()), vg2Var3, kj2Var4, tlsVar4);
                        ref$ObjectRef = ref$ObjectRef3;
                        vg2Var2 = vg2Var3;
                        kj2Var3 = kj2Var4;
                        tlsVar3 = tlsVar4;
                        suspendAnimationKt$animate$42.L$0 = kj2Var3;
                        suspendAnimationKt$animate$42.L$1 = vg2Var2;
                        suspendAnimationKt$animate$42.L$2 = tlsVar3;
                        suspendAnimationKt$animate$42.L$3 = ref$ObjectRef;
                        suspendAnimationKt$animate$42.label = 2;
                        if (vg2Var2.b()) {
                            v2 = w5b1.e(fvbVar, suspendAnimationKt$animate$42);
                        } else {
                            v2 = jl40.z(suspendAnimationKt$animate$42.get_context()).v(new uwl0(i3, fvbVar), suspendAnimationKt$animate$42);
                        }
                        if (v2 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } catch (CancellationException e6) {
                        e = e6;
                        ref$ObjectRef = ref$ObjectRef3;
                        kj2Var3 = kj2Var4;
                        xi2Var = (xi2) ref$ObjectRef.element;
                        if (xi2Var != null) {
                        }
                        xi2Var2 = (xi2) ref$ObjectRef.element;
                        if (xi2Var2 != null) {
                        }
                        throw e;
                    }
                }
                return zy11.a;
            }
        }
        suspendAnimationKt$animate$4 = new SuspendAnimationKt$animate$4(continuation);
        SuspendAnimationKt$animate$4 suspendAnimationKt$animate$422 = suspendAnimationKt$animate$4;
        Object obj2 = suspendAnimationKt$animate$422.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = suspendAnimationKt$animate$422.label;
        int i32 = 21;
        if (i != 0) {
        }
        while (((xi2) ref$ObjectRef.element).h()) {
        }
        return zy11.a;
    }

    public static /* synthetic */ Object c(float f, float f2, jj2 jj2Var, wls wlsVar, Continuation continuation, int i) {
        if ((i & 8) != 0) {
            jj2Var = sb2.G(0.0f, 0.0f, 7, null);
        }
        return a(f, f2, 0.0f, jj2Var, wlsVar, continuation);
    }

    public static final Object d(kj2 kj2Var, gxg gxgVar, boolean z, tls tlsVar, ContinuationImpl continuationImpl) {
        Object b = b(kj2Var, new fxg(gxgVar, kj2Var.d(), kj2Var.getValue(), kj2Var.f()), z ? kj2Var.b() : Long.MIN_VALUE, tlsVar, continuationImpl);
        return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : zy11.a;
    }

    public static final Object e(kj2 kj2Var, Float f, jj2 jj2Var, boolean z, tls tlsVar, ContinuationImpl continuationImpl) {
        Object b = b(kj2Var, new lax0(jj2Var, kj2Var.d(), kj2Var.getValue(), f, kj2Var.f()), z ? kj2Var.b() : Long.MIN_VALUE, tlsVar, continuationImpl);
        return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : zy11.a;
    }

    public static /* synthetic */ Object f(kj2 kj2Var, Float f, twt0 twt0Var, boolean z, tls tlsVar, ContinuationImpl continuationImpl, int i) {
        if ((i & 2) != 0) {
            twt0Var = sb2.G(0.0f, 0.0f, 7, null);
        }
        twt0 twt0Var2 = twt0Var;
        if ((i & 8) != 0) {
            tlsVar = new oxv0(13);
        }
        return e(kj2Var, f, twt0Var2, z, tlsVar, continuationImpl);
    }

    public static final void g(xi2 xi2Var, long j, float f, vg2 vg2Var, kj2 kj2Var, tls tlsVar) {
        long d = f == 0.0f ? vg2Var.d() : (long) ((j - xi2Var.d()) / f);
        xi2Var.j(j);
        xi2Var.l(vg2Var.f(d));
        xi2Var.m(vg2Var.h(d));
        if (vg2Var.c(d)) {
            xi2Var.i(xi2Var.c());
            xi2Var.k();
        }
        i(xi2Var, kj2Var);
        tlsVar.invoke(xi2Var);
    }

    public static final float h(fse fseVar) {
        ja30 ja30Var = (ja30) fseVar.get(ngd0.C);
        float scaleFactor = ja30Var != null ? ja30Var.getScaleFactor() : 1.0f;
        if (scaleFactor >= 0.0f) {
            return scaleFactor;
        }
        mhe0.b("negative scale factor");
        return scaleFactor;
    }

    public static final void i(xi2 xi2Var, kj2 kj2Var) {
        kj2Var.k(xi2Var.e());
        sj2 f = kj2Var.f();
        sj2 g = xi2Var.g();
        int b = f.b();
        for (int i = 0; i < b; i++) {
            f.e(g.a(i), i);
        }
        kj2Var.h(xi2Var.b());
        kj2Var.i(xi2Var.c());
        kj2Var.j(xi2Var.h());
    }
}
