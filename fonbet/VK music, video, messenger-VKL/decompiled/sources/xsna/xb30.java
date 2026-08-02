package xsna;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.input.pointer.util.VelocityTracker1D;
import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.kbb;

/* compiled from: MouseWheelScrollingLogic.kt */
/* loaded from: classes11.dex */
public final class xb30 extends j670 {
    public final p62 f;
    public final nm8 g;
    public yok0 h;

    /* compiled from: MouseWheelScrollingLogic.kt */
    public static final class a {
        public final long a;
        public final long b;
        public final boolean c;

        public a(long j, long j2, boolean z) {
            this.a = j;
            this.b = j2;
            this.c = z;
        }

        public final a a(a aVar) {
            return new a(ov70.f(this.a, aVar.a), Math.max(this.b, aVar.b), this.c);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return ov70.c(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + bh10.a(Long.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MouseWheelScrollDelta(value=");
            sb.append((Object) ov70.h(this.a));
            sb.append(", timeMillis=");
            sb.append(this.b);
            sb.append(", shouldApplyImmediately=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    public xb30(zhh0 zhh0Var, p62 p62Var, ehh0 ehh0Var, azl azlVar) {
        super(zhh0Var, ehh0Var, azlVar);
        this.f = p62Var;
        this.g = w0b.a(Integer.MAX_VALUE, null, null, 6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0167, code lost:
    
        if (r0.invoke(r1, r10) != r11) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /* JADX WARN: Type inference failed for: r0v12, types: [T, xsna.kq2] */
    /* JADX WARN: Type inference failed for: r0v17, types: [T, xsna.xb30$a] */
    /* JADX WARN: Type inference failed for: r0v19, types: [kotlin.jvm.internal.AdaptedFunctionReference, xsna.wzs] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(xb30 xb30Var, zhh0 zhh0Var, a aVar, float f, float f2, ContinuationImpl continuationImpl) {
        yb30 yb30Var;
        int i;
        Ref$FloatRef ref$FloatRef;
        float f3;
        zhh0 zhh0Var2;
        long b;
        xb30 xb30Var2 = xb30Var;
        xb30Var2.getClass();
        wxm wxmVar = xb30Var2.e;
        if (continuationImpl instanceof yb30) {
            yb30Var = (yb30) continuationImpl;
            int i2 = yb30Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yb30Var.label = i2 - Integer.MIN_VALUE;
                yb30 yb30Var2 = yb30Var;
                Object obj = yb30Var2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = yb30Var2.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    ref$ObjectRef.element = aVar;
                    long j = aVar.b;
                    long j2 = aVar.a;
                    ((VelocityTracker1D) wxmVar.b).a(Float.intBitsToFloat((int) (j2 >> 32)), j);
                    ((VelocityTracker1D) wxmVar.c).a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
                    a g = g(xb30Var2.g);
                    if (g != null) {
                        long j3 = g.b;
                        long j4 = g.a;
                        ((VelocityTracker1D) wxmVar.b).a(Float.intBitsToFloat((int) (j4 >> 32)), j3);
                        ((VelocityTracker1D) wxmVar.c).a(Float.intBitsToFloat((int) (j4 & 4294967295L)), j3);
                        ref$ObjectRef.element = ((a) ref$ObjectRef.element).a(g);
                    }
                    Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
                    float g2 = zhh0Var.g(zhh0Var.e(((a) ref$ObjectRef.element).a));
                    ref$FloatRef2.element = g2;
                    if (ec30.a(g2)) {
                        return s3q0.a;
                    }
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    ref$ObjectRef2.element = s1v.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 30);
                    xb30Var2 = xb30Var;
                    ac30 ac30Var = new ac30(ref$FloatRef2, ref$ObjectRef2, ref$ObjectRef, f, xb30Var2, f2, zhh0Var, null);
                    yb30Var2.L$0 = zhh0Var;
                    yb30Var2.L$1 = ref$FloatRef2;
                    yb30Var2.F$0 = f2;
                    yb30Var2.label = 1;
                    if (xb30Var2.b(ac30Var, yb30Var2) != coroutineSingletons) {
                        ref$FloatRef = ref$FloatRef2;
                        f3 = f2;
                        zhh0Var2 = zhh0Var;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return s3q0.a;
                }
                f3 = yb30Var2.F$0;
                ref$FloatRef = (Ref$FloatRef) yb30Var2.L$1;
                zhh0Var2 = (zhh0) yb30Var2.L$0;
                kotlin.a.a(obj);
                b = m200.b(((VelocityTracker1D) wxmVar.b).b(Float.MAX_VALUE), ((VelocityTracker1D) wxmVar.c).b(Float.MAX_VALUE));
                if (b == 0) {
                    float d = zhh0Var2.d(Math.signum(ref$FloatRef.element)) * Math.min(Math.abs(ref$FloatRef.element) / 100, f3) * 1000;
                    if (d == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        b = 0;
                    } else {
                        b = zhh0Var2.d == Orientation.Horizontal ? m200.b(d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) : m200.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, d);
                    }
                }
                ?? r0 = xb30Var2.b;
                jmr0 jmr0Var = new jmr0(b);
                yb30Var2.L$0 = null;
                yb30Var2.L$1 = null;
                yb30Var2.label = 2;
            }
        }
        yb30Var = new yb30(xb30Var2, continuationImpl);
        yb30 yb30Var22 = yb30Var;
        Object obj2 = yb30Var22.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = yb30Var22.label;
        if (i != 0) {
        }
        b = m200.b(((VelocityTracker1D) wxmVar.b).b(Float.MAX_VALUE), ((VelocityTracker1D) wxmVar.c).b(Float.MAX_VALUE));
        if (b == 0) {
        }
        ?? r02 = xb30Var2.b;
        jmr0 jmr0Var2 = new jmr0(b);
        yb30Var22.L$0 = null;
        yb30Var22.L$1 = null;
        yb30Var22.label = 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, xsna.kq2] */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, xsna.xb30$a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(xb30 xb30Var, Ref$ObjectRef ref$ObjectRef, Ref$FloatRef ref$FloatRef, zhh0 zhh0Var, Ref$ObjectRef ref$ObjectRef2, long j, ContinuationImpl continuationImpl) {
        bc30 bc30Var;
        int i;
        zhh0 zhh0Var2;
        Ref$ObjectRef ref$ObjectRef3;
        Ref$ObjectRef ref$ObjectRef4;
        Ref$FloatRef ref$FloatRef2;
        a aVar;
        boolean z;
        if (continuationImpl instanceof bc30) {
            bc30Var = (bc30) continuationImpl;
            int i2 = bc30Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bc30Var.label = i2 - Integer.MIN_VALUE;
                Object obj = bc30Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bc30Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    if (j < 0) {
                        return Boolean.FALSE;
                    }
                    cc30 cc30Var = new cc30(xb30Var, null);
                    bc30Var.L$0 = xb30Var;
                    bc30Var.L$1 = ref$ObjectRef;
                    bc30Var.L$2 = ref$FloatRef;
                    zhh0Var2 = zhh0Var;
                    bc30Var.L$3 = zhh0Var2;
                    ref$ObjectRef3 = ref$ObjectRef2;
                    bc30Var.L$4 = ref$ObjectRef3;
                    bc30Var.label = 1;
                    obj = oxo0.c(j, cc30Var, bc30Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    ref$ObjectRef4 = ref$ObjectRef;
                    ref$FloatRef2 = ref$FloatRef;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Ref$ObjectRef ref$ObjectRef5 = (Ref$ObjectRef) bc30Var.L$4;
                    zhh0 zhh0Var3 = (zhh0) bc30Var.L$3;
                    ref$FloatRef2 = (Ref$FloatRef) bc30Var.L$2;
                    ref$ObjectRef4 = (Ref$ObjectRef) bc30Var.L$1;
                    xb30 xb30Var2 = (xb30) bc30Var.L$0;
                    kotlin.a.a(obj);
                    ref$ObjectRef3 = ref$ObjectRef5;
                    zhh0Var2 = zhh0Var3;
                    xb30Var = xb30Var2;
                }
                aVar = (a) obj;
                if (aVar == null) {
                    boolean z2 = ((a) ref$ObjectRef4.element).c;
                    long j2 = aVar.a;
                    ref$ObjectRef4.element = new a(j2, aVar.b, z2);
                    ref$FloatRef2.element = zhh0Var2.i(zhh0Var2.e(j2));
                    ref$ObjectRef3.element = s1v.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 30);
                    wxm wxmVar = xb30Var.e;
                    long j3 = aVar.b;
                    long j4 = aVar.a;
                    ((VelocityTracker1D) wxmVar.b).a(Float.intBitsToFloat((int) (j4 >> 32)), j3);
                    ((VelocityTracker1D) wxmVar.c).a(Float.intBitsToFloat((int) (j4 & 4294967295L)), j3);
                    z = !ec30.a(ref$FloatRef2.element);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }
        bc30Var = new bc30(continuationImpl);
        Object obj2 = bc30Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bc30Var.label;
        if (i != 0) {
        }
        aVar = (a) obj2;
        if (aVar == null) {
        }
        return Boolean.valueOf(z);
    }

    public static a g(nm8 nm8Var) {
        a aVar = null;
        vki0 b = g5z.b(new l670(new vb30(nm8Var, 0), null));
        while (b.hasNext()) {
            a aVar2 = (a) b.next();
            if (aVar != null) {
                aVar2 = aVar.a(aVar2);
            }
            aVar = aVar2;
        }
        return aVar;
    }

    public final float e(n160 n160Var, float f) {
        zhh0 zhh0Var = this.a;
        return zhh0Var.g(zhh0Var.e(n160Var.b(zhh0Var.h(zhh0Var.d(f)))));
    }

    public final boolean f(plb0 plb0Var, long j) {
        long a2 = this.f.a(plb0Var);
        zhh0 zhh0Var = this.a;
        float i = zhh0Var.i(zhh0Var.e(a2));
        if (i == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? false : i > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? zhh0Var.a.c() : zhh0Var.a.e()) {
            return !(this.g.f(new a(a2, ((xlb0) j5g.Y(plb0Var.a)).b, false)) instanceof kbb.b);
        }
        return this.d;
    }
}
