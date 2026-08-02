package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.fa30;

/* compiled from: UpdatableAnimationState.kt */
/* loaded from: classes11.dex */
public final class o7q0 {
    public static final sq2 f = new sq2(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    public final tlr0<sq2> a;
    public long b = Long.MIN_VALUE;
    public sq2 c = f;
    public boolean d;
    public float e;

    public o7q0(iq2<Float> iq2Var) {
        this.a = iq2Var.a(rte0.e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ce, code lost:
    
        if (xsna.i830.a(r0.getContext()).k(r15, r0) == r1) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b5 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:12:0x0030, B:13:0x00d1, B:21:0x004a, B:23:0x00a2, B:25:0x0077, B:28:0x00aa, B:31:0x00b5, B:34:0x0086), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:12:0x0030, B:13:0x00d1, B:21:0x004a, B:23:0x00a2, B:25:0x0077, B:28:0x00aa, B:31:0x00b5, B:34:0x0086), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r14v10, types: [xsna.gzs] */
    /* JADX WARN: Type inference failed for: r2v10, types: [xsna.izs] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x009f -> B:23:0x00a2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(on7 on7Var, kad kadVar, ContinuationImpl continuationImpl) {
        n7q0 n7q0Var;
        int i;
        sq2 sq2Var;
        final on7 on7Var2;
        final float f2;
        kad kadVar2;
        gzs gzsVar;
        try {
            if (continuationImpl instanceof n7q0) {
                n7q0Var = (n7q0) continuationImpl;
                int i2 = n7q0Var.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    n7q0Var.label = i2 - Integer.MIN_VALUE;
                    Object obj = n7q0Var.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = n7q0Var.label;
                    sq2Var = f;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        if (this.d) {
                            xzw.c("animateToZero called while previous animation is running");
                        }
                        fa30 fa30Var = (fa30) n7q0Var.getContext().get(fa30.a.b);
                        float w = fa30Var != null ? fa30Var.w() : 1.0f;
                        this.d = true;
                        on7Var2 = on7Var;
                        f2 = w;
                        kadVar2 = kadVar;
                        if (Math.abs(this.e) >= 0.01f) {
                        }
                        gzsVar = kadVar2;
                        if (Math.abs(this.e) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            gzsVar = (gzs) n7q0Var.L$0;
                            kotlin.a.a(obj);
                            gzsVar.invoke();
                            this.b = Long.MIN_VALUE;
                            this.c = sq2Var;
                            this.d = false;
                            return s3q0.a;
                        }
                        f2 = n7q0Var.F$0;
                        ?? r14 = (gzs) n7q0Var.L$1;
                        ?? r2 = (izs) n7q0Var.L$0;
                        kotlin.a.a(obj);
                        kadVar2 = r14;
                        on7Var2 = r2;
                        kadVar2.invoke();
                        if (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            gzsVar = kadVar2;
                            if (Math.abs(this.e) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                this.b = Long.MIN_VALUE;
                                this.c = sq2Var;
                                this.d = false;
                                return s3q0.a;
                            }
                            een0 een0Var = new een0(3, this, on7Var2);
                            n7q0Var.L$0 = gzsVar;
                            n7q0Var.L$1 = null;
                            n7q0Var.label = 2;
                        }
                        if (Math.abs(this.e) >= 0.01f) {
                            izs izsVar = new izs() { // from class: xsna.m7q0
                                @Override // xsna.izs
                                public final Object invoke(Object obj2) {
                                    long longValue = ((Long) obj2).longValue();
                                    o7q0 o7q0Var = o7q0.this;
                                    if (o7q0Var.b == Long.MIN_VALUE) {
                                        o7q0Var.b = longValue;
                                    }
                                    sq2 sq2Var2 = new sq2(o7q0Var.e);
                                    long c = f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? o7q0Var.a.c(new sq2(o7q0Var.e), o7q0.f, o7q0Var.c) : an10.c((longValue - o7q0Var.b) / r3);
                                    tlr0<sq2> tlr0Var = o7q0Var.a;
                                    sq2 sq2Var3 = o7q0.f;
                                    float f3 = tlr0Var.g(c, sq2Var2, sq2Var3, o7q0Var.c).a;
                                    o7q0Var.c = o7q0Var.a.d(c, sq2Var2, sq2Var3, o7q0Var.c);
                                    o7q0Var.b = longValue;
                                    float f4 = o7q0Var.e - f3;
                                    o7q0Var.e = f3;
                                    on7Var2.invoke(Float.valueOf(f4));
                                    return s3q0.a;
                                }
                            };
                            n7q0Var.L$0 = on7Var2;
                            n7q0Var.L$1 = kadVar2;
                            n7q0Var.F$0 = f2;
                            n7q0Var.label = 1;
                            if (i830.a(n7q0Var.getContext()).k(izsVar, n7q0Var) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            kadVar2.invoke();
                            if (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            }
                            if (Math.abs(this.e) >= 0.01f) {
                            }
                        }
                        gzsVar = kadVar2;
                        if (Math.abs(this.e) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        }
                    }
                }
            }
            if (i != 0) {
            }
        } catch (Throwable th) {
            this.b = Long.MIN_VALUE;
            this.c = sq2Var;
            this.d = false;
            throw th;
        }
        n7q0Var = new n7q0(this, continuationImpl);
        Object obj2 = n7q0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = n7q0Var.label;
        sq2Var = f;
    }
}
