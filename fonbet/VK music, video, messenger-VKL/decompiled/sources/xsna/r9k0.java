package xsna;

import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$FloatRef;

/* compiled from: SnapFlingBehavior.kt */
/* loaded from: classes11.dex */
public final class r9k0 {
    public static final float a = 400;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(final ggh0 ggh0Var, final float f, kq2 kq2Var, l7l l7lVar, final izs izsVar, ContinuationImpl continuationImpl) {
        p9k0 p9k0Var;
        int i;
        Ref$FloatRef ref$FloatRef;
        if (continuationImpl instanceof p9k0) {
            p9k0Var = (p9k0) continuationImpl;
            int i2 = p9k0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p9k0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = p9k0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = p9k0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    final Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
                    boolean z = ((Number) kq2Var.c()).floatValue() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    izs izsVar2 = new izs() { // from class: xsna.n9k0
                        @Override // xsna.izs
                        public final Object invoke(Object obj2) {
                            gq2 gq2Var = (gq2) obj2;
                            zak0 zak0Var = (zak0) gq2Var.e;
                            float abs = Math.abs(((Number) zak0Var.getValue()).floatValue());
                            float f2 = f;
                            float abs2 = Math.abs(f2);
                            Ref$FloatRef ref$FloatRef3 = ref$FloatRef2;
                            ggh0 ggh0Var2 = ggh0Var;
                            izs izsVar3 = izsVar;
                            if (abs >= abs2) {
                                float d = r9k0.d(((Number) zak0Var.getValue()).floatValue(), f2);
                                r9k0.c(gq2Var, ggh0Var2, izsVar3, d - ref$FloatRef3.element);
                                gq2Var.a();
                                ref$FloatRef3.element = d;
                            } else {
                                r9k0.c(gq2Var, ggh0Var2, izsVar3, ((Number) zak0Var.getValue()).floatValue() - ref$FloatRef3.element);
                                ref$FloatRef3.element = ((Number) zak0Var.getValue()).floatValue();
                            }
                            return s3q0.a;
                        }
                    };
                    p9k0Var.L$0 = kq2Var;
                    p9k0Var.L$1 = ref$FloatRef2;
                    p9k0Var.F$0 = f;
                    p9k0Var.label = 1;
                    if (nkn0.d(kq2Var, l7lVar, !z, izsVar2, p9k0Var) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    ref$FloatRef = ref$FloatRef2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f = p9k0Var.F$0;
                    ref$FloatRef = (Ref$FloatRef) p9k0Var.L$1;
                    kq2Var = (kq2) p9k0Var.L$0;
                    kotlin.a.a(obj);
                }
                return new eq2(new Float(f - ref$FloatRef.element), kq2Var);
            }
        }
        p9k0Var = new p9k0(continuationImpl);
        Object obj2 = p9k0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = p9k0Var.label;
        if (i != 0) {
        }
        return new eq2(new Float(f - ref$FloatRef.element), kq2Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(final ggh0 ggh0Var, float f, final float f2, kq2 kq2Var, iq2 iq2Var, final izs izsVar, ContinuationImpl continuationImpl) {
        q9k0 q9k0Var;
        int i;
        Ref$FloatRef ref$FloatRef;
        kq2 kq2Var2;
        float f3;
        if (continuationImpl instanceof q9k0) {
            q9k0Var = (q9k0) continuationImpl;
            int i2 = q9k0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q9k0Var.label = i2 - Integer.MIN_VALUE;
                q9k0 q9k0Var2 = q9k0Var;
                Object obj = q9k0Var2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = q9k0Var2.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    final Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
                    float floatValue = ((Number) kq2Var.c()).floatValue();
                    Float f4 = new Float(f);
                    boolean z = ((Number) kq2Var.c()).floatValue() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    izs izsVar2 = new izs() { // from class: xsna.o9k0
                        @Override // xsna.izs
                        public final Object invoke(Object obj2) {
                            float f5;
                            ggh0 ggh0Var2 = ggh0Var;
                            gq2 gq2Var = (gq2) obj2;
                            float d = r9k0.d(((Number) ((zak0) gq2Var.e).getValue()).floatValue(), f2);
                            Ref$FloatRef ref$FloatRef3 = ref$FloatRef2;
                            float f6 = d - ref$FloatRef3.element;
                            try {
                                f5 = ggh0Var2.f(f6);
                            } catch (CancellationException unused) {
                                gq2Var.a();
                                f5 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            }
                            izsVar.invoke(Float.valueOf(f5));
                            if (Math.abs(f6 - f5) > 0.5f || d != ((Number) ((zak0) gq2Var.e).getValue()).floatValue()) {
                                gq2Var.a();
                            }
                            ref$FloatRef3.element += f5;
                            return s3q0.a;
                        }
                    };
                    q9k0Var2.L$0 = kq2Var;
                    q9k0Var2.L$1 = ref$FloatRef2;
                    q9k0Var2.F$0 = f;
                    q9k0Var2.F$1 = floatValue;
                    q9k0Var2.label = 1;
                    if (nkn0.e(kq2Var, f4, iq2Var, !z, izsVar2, q9k0Var2) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    ref$FloatRef = ref$FloatRef2;
                    kq2Var2 = kq2Var;
                    f3 = floatValue;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f3 = q9k0Var2.F$1;
                    f = q9k0Var2.F$0;
                    ref$FloatRef = (Ref$FloatRef) q9k0Var2.L$1;
                    kq2Var2 = (kq2) q9k0Var2.L$0;
                    kotlin.a.a(obj);
                }
                return new eq2(new Float(f - ref$FloatRef.element), s1v.c(kq2Var2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, d(((Number) kq2Var2.c()).floatValue(), f3), 29));
            }
        }
        q9k0Var = new q9k0(continuationImpl);
        q9k0 q9k0Var22 = q9k0Var;
        Object obj2 = q9k0Var22.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = q9k0Var22.label;
        if (i != 0) {
        }
        return new eq2(new Float(f - ref$FloatRef.element), s1v.c(kq2Var2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, d(((Number) kq2Var2.c()).floatValue(), f3), 29));
    }

    public static final void c(gq2<Float, sq2> gq2Var, ggh0 ggh0Var, izs<? super Float, s3q0> izsVar, float f) {
        float f2;
        try {
            f2 = ggh0Var.f(f);
        } catch (CancellationException unused) {
            gq2Var.a();
            f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        izsVar.invoke(Float.valueOf(f2));
        if (Math.abs(f - f2) > 0.5f) {
            gq2Var.a();
        }
    }

    public static final float d(float f, float f2) {
        return f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : (f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? f >= f2 : f <= f2) ? f : f2;
    }
}
