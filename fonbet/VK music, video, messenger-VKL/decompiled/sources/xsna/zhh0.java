package xsna;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import xsna.q630;

/* compiled from: Scrollable.kt */
/* loaded from: classes11.dex */
public final class zhh0 {
    public khh0 a;
    public e490 b;
    public tpr c;
    public Orientation d;
    public boolean e;
    public e160 f;
    public final androidx.compose.foundation.gestures.l g;
    public final in60 h;
    public boolean i;
    public int j = 1;
    public ggh0 k = ahh0.b;
    public final whh0 l = new whh0(this);
    public final z6f0 m = new z6f0(this, 4);

    public zhh0(khh0 khh0Var, e490 e490Var, tpr tprVar, Orientation orientation, boolean z, e160 e160Var, androidx.compose.foundation.gestures.l lVar, in60 in60Var) {
        this.a = khh0Var;
        this.b = e490Var;
        this.c = tprVar;
        this.d = orientation;
        this.e = z;
        this.f = e160Var;
        this.g = lVar;
        this.h = in60Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j, ContinuationImpl continuationImpl) {
        uhh0 uhh0Var;
        int i;
        zhh0 zhh0Var;
        Throwable th;
        Ref$LongRef ref$LongRef;
        if (continuationImpl instanceof uhh0) {
            uhh0Var = (uhh0) continuationImpl;
            int i2 = uhh0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uhh0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = uhh0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = uhh0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    Ref$LongRef ref$LongRef2 = new Ref$LongRef();
                    ref$LongRef2.element = j;
                    this.i = true;
                    try {
                        MutatePriority mutatePriority = MutatePriority.Default;
                        zhh0Var = this;
                        try {
                            vhh0 vhh0Var = new vhh0(zhh0Var, ref$LongRef2, j, null);
                            uhh0Var.L$0 = ref$LongRef2;
                            uhh0Var.label = 1;
                            if (f(mutatePriority, vhh0Var, uhh0Var) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            ref$LongRef = ref$LongRef2;
                        } catch (Throwable th2) {
                            th = th2;
                            th = th;
                            zhh0Var.i = false;
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        zhh0Var = this;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ref$LongRef = (Ref$LongRef) uhh0Var.L$0;
                    try {
                        kotlin.a.a(obj);
                        zhh0Var = this;
                    } catch (Throwable th4) {
                        th = th4;
                        zhh0Var = this;
                        zhh0Var.i = false;
                        throw th;
                    }
                }
                zhh0Var.i = false;
                return new jmr0(ref$LongRef.element);
            }
        }
        uhh0Var = new uhh0(this, continuationImpl);
        Object obj2 = uhh0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = uhh0Var.label;
        if (i != 0) {
        }
        zhh0Var.i = false;
        return new jmr0(ref$LongRef.element);
    }

    public final Object b(long j, boolean z, SuspendLambda suspendLambda) {
        if (z) {
            tpr tprVar = this.c;
            j6e0 j6e0Var = ahh0.a;
            if (tprVar instanceof zel) {
                return s3q0.a;
            }
        }
        long a = jmr0.a(j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.d == Orientation.Horizontal ? 1 : 2);
        xhh0 xhh0Var = new xhh0(this, null);
        e490 e490Var = this.b;
        if (e490Var != null && (this.a.c() || this.a.e())) {
            Object b = e490Var.b(a, xhh0Var, suspendLambda);
            return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : s3q0.a;
        }
        xhh0 xhh0Var2 = new xhh0(xhh0Var.this$0, suspendLambda);
        xhh0Var2.J$0 = a;
        Object invokeSuspend = xhh0Var2.invokeSuspend(s3q0.a);
        return invokeSuspend == CoroutineSingletons.COROUTINE_SUSPENDED ? invokeSuspend : s3q0.a;
    }

    public final long c(ggh0 ggh0Var, long j, int i) {
        int i2;
        k160 k160Var;
        k160 k160Var2;
        long j2;
        long j3;
        npp0 npp0Var;
        u470 u470Var;
        int i3;
        char c;
        npp0 npp0Var2;
        u470 u470Var2;
        k160 k160Var3 = this.f.a;
        char c2 = 16;
        int i4 = SQLiteDatabase.OPEN_PRIVATECACHE;
        int i5 = 1;
        if (k160Var3 == null || !k160Var3.o) {
            i2 = 262144;
            k160Var = null;
        } else {
            if (!k160Var3.b.o) {
                uzw.b("visitAncestors called on an unattached node");
            }
            q630.c cVar = k160Var3.b.f;
            LayoutNode f = itl.f(k160Var3);
            loop0: while (true) {
                if (f == null) {
                    i2 = i4;
                    npp0Var2 = null;
                    break;
                }
                if ((f.G.f.e & i4) != 0) {
                    while (cVar != null) {
                        if ((cVar.d & i4) != 0) {
                            q630.c cVar2 = cVar;
                            ci50 ci50Var = null;
                            while (cVar2 != null) {
                                if (cVar2 instanceof npp0) {
                                    npp0Var2 = (npp0) cVar2;
                                    i2 = i4;
                                    if (epx.f(k160Var3.s, npp0Var2.g0()) && k160.class == npp0Var2.getClass()) {
                                        break loop0;
                                    }
                                } else {
                                    i2 = i4;
                                }
                                if ((cVar2.d & i2) != 0 && (cVar2 instanceof ytl)) {
                                    int i6 = 0;
                                    for (q630.c cVar3 = ((ytl) cVar2).q; cVar3 != null; cVar3 = cVar3.g) {
                                        if ((cVar3.d & i2) != 0) {
                                            i6++;
                                            if (i6 == 1) {
                                                cVar2 = cVar3;
                                            } else {
                                                if (ci50Var == null) {
                                                    ci50Var = new ci50(new q630.c[16]);
                                                }
                                                if (cVar2 != null) {
                                                    ci50Var.b(cVar2);
                                                    cVar2 = null;
                                                }
                                                ci50Var.b(cVar3);
                                            }
                                        }
                                    }
                                    if (i6 == 1) {
                                        i4 = i2;
                                    }
                                }
                                cVar2 = itl.b(ci50Var);
                                i4 = i2;
                            }
                        }
                        cVar = cVar.f;
                        i4 = i4;
                    }
                }
                int i7 = i4;
                f = f.I();
                cVar = (f == null || (u470Var2 = f.G) == null) ? null : u470Var2.e;
                i4 = i7;
            }
            k160Var = (k160) npp0Var2;
        }
        long R0 = k160Var != null ? k160Var.R0(i, j) : 0L;
        long e = ov70.e(j, R0);
        long e2 = e(h(ggh0Var.f(g(e(this.d == Orientation.Horizontal ? ov70.a(1, e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) : ov70.a(2, e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))))));
        androidx.compose.foundation.gestures.l lVar = this.g;
        if (lVar.o) {
            itl.g(lVar).o();
        }
        long e3 = ov70.e(e, e2);
        k160 k160Var4 = this.f.a;
        if (k160Var4 == null || !k160Var4.o) {
            k160Var2 = null;
        } else {
            if (!k160Var4.b.o) {
                uzw.b("visitAncestors called on an unattached node");
            }
            q630.c cVar4 = k160Var4.b.f;
            LayoutNode f2 = itl.f(k160Var4);
            loop3: while (true) {
                if (f2 == null) {
                    npp0Var = null;
                    break;
                }
                if ((f2.G.f.e & i2) != 0) {
                    while (cVar4 != null) {
                        if ((cVar4.d & i2) != 0) {
                            q630.c cVar5 = cVar4;
                            ci50 ci50Var2 = null;
                            while (cVar5 != null) {
                                if (cVar5 instanceof npp0) {
                                    npp0 npp0Var3 = (npp0) cVar5;
                                    if (epx.f(k160Var4.s, npp0Var3.g0()) && k160.class == npp0Var3.getClass()) {
                                        npp0Var = npp0Var3;
                                        break loop3;
                                    }
                                }
                                if ((cVar5.d & i2) == 0 || !(cVar5 instanceof ytl)) {
                                    i3 = i5;
                                    c = 16;
                                } else {
                                    q630.c cVar6 = ((ytl) cVar5).q;
                                    int i8 = 0;
                                    while (cVar6 != null) {
                                        if ((cVar6.d & i2) != 0) {
                                            i8++;
                                            if (i8 == i5) {
                                                cVar5 = cVar6;
                                            } else {
                                                if (ci50Var2 == null) {
                                                    ci50Var2 = new ci50(new q630.c[16]);
                                                }
                                                if (cVar5 != null) {
                                                    ci50Var2.b(cVar5);
                                                    cVar5 = null;
                                                }
                                                ci50Var2.b(cVar6);
                                                cVar6 = cVar6.g;
                                                i5 = 1;
                                            }
                                        }
                                        cVar6 = cVar6.g;
                                        i5 = 1;
                                    }
                                    i3 = i5;
                                    c = 16;
                                    if (i8 == i3) {
                                        i5 = i3;
                                        c2 = c;
                                    }
                                }
                                cVar5 = itl.b(ci50Var2);
                                i5 = i3;
                                c2 = c;
                            }
                        }
                        cVar4 = cVar4.f;
                        i5 = i5;
                        c2 = c2;
                    }
                }
                char c3 = c2;
                int i9 = i5;
                f2 = f2.I();
                cVar4 = (f2 == null || (u470Var = f2.G) == null) ? null : u470Var.e;
                i5 = i9;
                c2 = c3;
            }
            k160Var2 = (k160) npp0Var;
        }
        if (k160Var2 != null) {
            j3 = k160Var2.W0(i, e2, e3);
            j2 = e2;
        } else {
            j2 = e2;
            j3 = 0;
        }
        return ov70.f(ov70.f(R0, j2), j3);
    }

    public final float d(float f) {
        return this.e ? f * (-1) : f;
    }

    public final long e(long j) {
        return this.e ? ov70.g(-1.0f, j) : j;
    }

    public final Object f(MutatePriority mutatePriority, wzs wzsVar, ContinuationImpl continuationImpl) {
        Object b = this.a.b(mutatePriority, new yhh0(null, wzsVar, this), continuationImpl);
        return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : s3q0.a;
    }

    public final float g(long j) {
        return Float.intBitsToFloat((int) (this.d == Orientation.Horizontal ? j >> 32 : j & 4294967295L));
    }

    public final long h(float f) {
        long floatToRawIntBits;
        long j;
        if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return 0L;
        }
        if (this.d == Orientation.Horizontal) {
            long floatToRawIntBits2 = Float.floatToRawIntBits(f);
            floatToRawIntBits = Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            j = floatToRawIntBits2 << 32;
        } else {
            long floatToRawIntBits3 = Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            floatToRawIntBits = Float.floatToRawIntBits(f);
            j = floatToRawIntBits3 << 32;
        }
        return j | (floatToRawIntBits & 4294967295L);
    }

    public final float i(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        return ((double) ((float) Math.atan2((double) Math.abs(Float.intBitsToFloat(i)), (double) Math.abs(Float.intBitsToFloat(i2))))) >= 0.7853981633974483d ? this.d == Orientation.Vertical ? Float.intBitsToFloat(i) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : this.d == Orientation.Horizontal ? Float.intBitsToFloat(i2) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }
}
