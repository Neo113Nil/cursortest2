package xsna;

import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.fa30;

/* compiled from: SuspendAnimation.kt */
/* loaded from: classes11.dex */
public final class nkn0 {
    public static final Object a(float f, float f2, float f3, iq2 iq2Var, wzs wzsVar, ContinuationImpl continuationImpl) {
        jtp0 jtp0Var = rte0.e;
        Float f4 = new Float(f);
        Float f5 = new Float(f2);
        Float f6 = new Float(f3);
        izs<T, V> izsVar = jtp0Var.a;
        wq2 wq2Var = (wq2) izsVar.invoke(f6);
        if (wq2Var == null) {
            wq2Var = ((wq2) izsVar.invoke(f4)).c();
        }
        wq2 wq2Var2 = wq2Var;
        Object b = b(new kq2(jtp0Var, f4, wq2Var2, 56), new w3o0(iq2Var, jtp0Var, f4, f5, wq2Var2), Long.MIN_VALUE, new xvl0(wzsVar, 4), continuationImpl);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (b != coroutineSingletons) {
            b = s3q0.a;
        }
        return b == coroutineSingletons ? b : s3q0.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0114 A[Catch: CancellationException -> 0x0041, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0041, blocks: (B:13:0x003c, B:15:0x0100, B:17:0x0114, B:22:0x0137, B:24:0x0147, B:31:0x014c), top: B:12:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r12v0, types: [T, xsna.gq2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(kq2 kq2Var, rm2 rm2Var, long j, final izs izsVar, ContinuationImpl continuationImpl) {
        mkn0 mkn0Var;
        int i;
        final Ref$ObjectRef ref$ObjectRef;
        final kq2 kq2Var2;
        kq2 kq2Var3;
        izs izsVar2;
        Ref$ObjectRef ref$ObjectRef2;
        Object k;
        izs izsVar3;
        gq2 gq2Var;
        gq2 gq2Var2;
        Object k2;
        final rm2 rm2Var2 = rm2Var;
        if (continuationImpl instanceof mkn0) {
            mkn0Var = (mkn0) continuationImpl;
            int i2 = mkn0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mkn0Var.label = i2 - Integer.MIN_VALUE;
                mkn0 mkn0Var2 = mkn0Var;
                Object obj = mkn0Var2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mkn0Var2.label;
                if (i == 0) {
                    if (i == 1) {
                        ref$ObjectRef = (Ref$ObjectRef) mkn0Var2.L$3;
                        izsVar3 = (izs) mkn0Var2.L$2;
                        rm2Var2 = (rm2) mkn0Var2.L$1;
                        kq2Var3 = (kq2) mkn0Var2.L$0;
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ref$ObjectRef = (Ref$ObjectRef) mkn0Var2.L$3;
                        izsVar3 = (izs) mkn0Var2.L$2;
                        rm2Var2 = (rm2) mkn0Var2.L$1;
                        kq2Var3 = (kq2) mkn0Var2.L$0;
                    }
                    try {
                        kotlin.a.a(obj);
                    } catch (CancellationException e) {
                        e = e;
                        gq2Var = (gq2) ref$ObjectRef.element;
                        if (gq2Var != null) {
                        }
                        gq2Var2 = (gq2) ref$ObjectRef.element;
                        if (gq2Var2 != null) {
                        }
                        throw e;
                    }
                } else {
                    kotlin.a.a(obj);
                    final Object e2 = rm2Var2.e(0L);
                    final wq2 g = rm2Var2.g(0L);
                    ref$ObjectRef = new Ref$ObjectRef();
                    if (j == Long.MIN_VALUE) {
                        try {
                            final float h = h(mkn0Var2.getContext());
                            kq2Var2 = kq2Var;
                            try {
                                izsVar2 = new izs() { // from class: xsna.kkn0
                                    /* JADX WARN: Type inference failed for: r0v0, types: [T, xsna.gq2] */
                                    @Override // xsna.izs
                                    public final Object invoke(Object obj2) {
                                        long longValue = ((Long) obj2).longValue();
                                        rm2 rm2Var3 = rm2Var2;
                                        itp0 d = rm2Var3.d();
                                        Object f = rm2Var3.f();
                                        kq2 kq2Var4 = kq2Var2;
                                        ?? gq2Var3 = new gq2(e2, d, g, longValue, f, longValue, new p1d0(kq2Var4, 22));
                                        nkn0.g(gq2Var3, longValue, h, rm2Var3, kq2Var4, izsVar);
                                        Ref$ObjectRef.this.element = gq2Var3;
                                        return s3q0.a;
                                    }
                                };
                                ref$ObjectRef2 = ref$ObjectRef;
                            } catch (CancellationException e3) {
                                e = e3;
                                kq2Var3 = kq2Var2;
                                gq2Var = (gq2) ref$ObjectRef.element;
                                if (gq2Var != null) {
                                    ((zak0) gq2Var.i).setValue(Boolean.FALSE);
                                }
                                gq2Var2 = (gq2) ref$ObjectRef.element;
                                if (gq2Var2 != null && gq2Var2.g == kq2Var3.e) {
                                    kq2Var3.g = false;
                                }
                                throw e;
                            }
                            try {
                                mkn0Var2.L$0 = kq2Var2;
                                mkn0Var2.L$1 = rm2Var2;
                                mkn0Var2.L$2 = izsVar;
                                mkn0Var2.L$3 = ref$ObjectRef2;
                                mkn0Var2.label = 1;
                                if (rm2Var2.a()) {
                                    k = wuw.a(izsVar2, mkn0Var2);
                                } else {
                                    k = i830.a(mkn0Var2.getContext()).k(new ph70(izsVar2, 1), mkn0Var2);
                                }
                                if (k != coroutineSingletons) {
                                    kq2Var3 = kq2Var2;
                                    izsVar3 = izsVar;
                                }
                                return coroutineSingletons;
                            } catch (CancellationException e4) {
                                e = e4;
                                kq2Var3 = kq2Var2;
                                ref$ObjectRef = ref$ObjectRef2;
                                gq2Var = (gq2) ref$ObjectRef.element;
                                if (gq2Var != null) {
                                }
                                gq2Var2 = (gq2) ref$ObjectRef.element;
                                if (gq2Var2 != null) {
                                }
                                throw e;
                            }
                        } catch (CancellationException e5) {
                            e = e5;
                            kq2Var2 = kq2Var;
                        }
                    } else {
                        ref$ObjectRef2 = ref$ObjectRef;
                        try {
                            ?? gq2Var3 = new gq2(e2, rm2Var2.d(), g, j, rm2Var2.f(), j, new icn0(kq2Var, 1));
                            g(gq2Var3, j, h(mkn0Var2.getContext()), rm2Var2, kq2Var, izsVar);
                            ref$ObjectRef2.element = gq2Var3;
                            kq2Var3 = kq2Var;
                            rm2Var2 = rm2Var;
                            izsVar3 = izsVar;
                        } catch (CancellationException e6) {
                            e = e6;
                            kq2Var3 = kq2Var;
                            ref$ObjectRef = ref$ObjectRef2;
                            gq2Var = (gq2) ref$ObjectRef.element;
                            if (gq2Var != null) {
                            }
                            gq2Var2 = (gq2) ref$ObjectRef.element;
                            if (gq2Var2 != null) {
                            }
                            throw e;
                        }
                    }
                    ref$ObjectRef = ref$ObjectRef2;
                }
                while (((Boolean) ((zak0) ((gq2) ref$ObjectRef.element).i).getValue()).booleanValue()) {
                    Ref$ObjectRef ref$ObjectRef3 = ref$ObjectRef;
                    izs izsVar4 = izsVar3;
                    rm2 rm2Var3 = rm2Var2;
                    kq2 kq2Var4 = kq2Var3;
                    try {
                        lkn0 lkn0Var = new lkn0(ref$ObjectRef3, h(mkn0Var2.getContext()), rm2Var3, kq2Var4, izsVar4);
                        ref$ObjectRef = ref$ObjectRef3;
                        rm2Var2 = rm2Var3;
                        kq2Var3 = kq2Var4;
                        izsVar3 = izsVar4;
                        mkn0Var2.L$0 = kq2Var3;
                        mkn0Var2.L$1 = rm2Var2;
                        mkn0Var2.L$2 = izsVar3;
                        mkn0Var2.L$3 = ref$ObjectRef;
                        mkn0Var2.label = 2;
                        if (rm2Var2.a()) {
                            k2 = wuw.a(lkn0Var, mkn0Var2);
                        } else {
                            k2 = i830.a(mkn0Var2.getContext()).k(new ph70(lkn0Var, 1), mkn0Var2);
                        }
                        if (k2 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } catch (CancellationException e7) {
                        e = e7;
                        ref$ObjectRef = ref$ObjectRef3;
                        kq2Var3 = kq2Var4;
                        gq2Var = (gq2) ref$ObjectRef.element;
                        if (gq2Var != null) {
                        }
                        gq2Var2 = (gq2) ref$ObjectRef.element;
                        if (gq2Var2 != null) {
                            kq2Var3.g = false;
                        }
                        throw e;
                    }
                }
                return s3q0.a;
            }
        }
        mkn0Var = new mkn0(continuationImpl);
        mkn0 mkn0Var22 = mkn0Var;
        Object obj2 = mkn0Var22.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mkn0Var22.label;
        if (i == 0) {
        }
        while (((Boolean) ((zak0) ((gq2) ref$ObjectRef.element).i).getValue()).booleanValue()) {
        }
        return s3q0.a;
    }

    public static /* synthetic */ Object c(float f, float f2, float f3, iq2 iq2Var, wzs wzsVar, ContinuationImpl continuationImpl, int i) {
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            iq2Var = jq2.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 7);
        }
        return a(f, f2, f3, iq2Var, wzsVar, continuationImpl);
    }

    public static final Object d(kq2 kq2Var, l7l l7lVar, boolean z, izs izsVar, ContinuationImpl continuationImpl) {
        Object b = b(kq2Var, new k7l(l7lVar, kq2Var.b, ((zak0) kq2Var.c).getValue(), kq2Var.d), z ? kq2Var.e : Long.MIN_VALUE, izsVar, continuationImpl);
        return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : s3q0.a;
    }

    public static final Object e(kq2 kq2Var, Float f, iq2 iq2Var, boolean z, izs izsVar, ContinuationImpl continuationImpl) {
        Object b = b(kq2Var, new w3o0(iq2Var, kq2Var.b, ((zak0) kq2Var.c).getValue(), f, kq2Var.d), z ? kq2Var.e : Long.MIN_VALUE, izsVar, continuationImpl);
        return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : s3q0.a;
    }

    public static /* synthetic */ Object f(kq2 kq2Var, Float f, iq2 iq2Var, boolean z, izs izsVar, ContinuationImpl continuationImpl, int i) {
        if ((i & 2) != 0) {
            iq2Var = jq2.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 7);
        }
        iq2 iq2Var2 = iq2Var;
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            izsVar = new zsw(25);
        }
        return e(kq2Var, f, iq2Var2, z2, izsVar, continuationImpl);
    }

    public static final <T, V extends wq2> void g(gq2<T, V> gq2Var, long j, float f, rm2<T, V> rm2Var, kq2<T, V> kq2Var, izs<? super gq2<T, V>, s3q0> izsVar) {
        long b = f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? rm2Var.b() : (long) ((j - gq2Var.c) / f);
        gq2Var.g = j;
        ((zak0) gq2Var.e).setValue(rm2Var.e(b));
        gq2Var.f = rm2Var.g(b);
        if (rm2Var.c(b)) {
            gq2Var.h = gq2Var.g;
            ((zak0) gq2Var.i).setValue(Boolean.FALSE);
        }
        i(gq2Var, kq2Var);
        izsVar.invoke(gq2Var);
    }

    public static final float h(kotlin.coroutines.d dVar) {
        fa30 fa30Var = (fa30) dVar.get(fa30.a.b);
        float w = fa30Var != null ? fa30Var.w() : 1.0f;
        if (w >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return w;
        }
        ixc0.b("negative scale factor");
        return w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, V extends wq2> void i(gq2<T, V> gq2Var, kq2<T, V> kq2Var) {
        ((zak0) kq2Var.c).setValue(((zak0) gq2Var.e).getValue());
        V v = kq2Var.d;
        V v2 = gq2Var.f;
        int b = v.b();
        for (int i = 0; i < b; i++) {
            v.e(v2.a(i), i);
        }
        kq2Var.f = gq2Var.h;
        kq2Var.e = gq2Var.g;
        kq2Var.g = ((Boolean) ((zak0) gq2Var.i).getValue()).booleanValue();
    }
}
