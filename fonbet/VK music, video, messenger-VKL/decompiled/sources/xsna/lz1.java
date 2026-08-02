package xsna;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.Orientation;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;

/* compiled from: AnchoredDraggable.kt */
/* loaded from: classes11.dex */
public final class lz1 {
    public static final qm0 a = new qm0(1);
    public static final m7l b = new m7l(new a());

    /* compiled from: AnchoredDraggable.kt */
    public static final class a implements eqr {
        @Override // xsna.eqr
        public final long a(float f) {
            return 0L;
        }

        @Override // xsna.eqr
        public final float b(float f, float f2) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }

        @Override // xsna.eqr
        public final float c(float f, long j) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }

        @Override // xsna.eqr
        public final float d(long j, float f, float f2) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }

        @Override // xsna.eqr
        public final float e() {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
    }

    public static final mdl a(izs izsVar) {
        wgo wgoVar = new wgo();
        izsVar.invoke(wgoVar);
        float[] fArr = wgoVar.b;
        ArrayList arrayList = wgoVar.a;
        int size = arrayList.size();
        jw5.n(size, fArr.length);
        return new mdl(Arrays.copyOfRange(fArr, 0, size), arrayList);
    }

    public static final Object b(f12 f12Var, float f, fz1 fz1Var, vgo vgoVar, Object obj, iq2 iq2Var, SuspendLambda suspendLambda) {
        Object a2;
        float c = vgoVar.c(obj);
        Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
        ref$FloatRef.element = Float.isNaN(((vak0) f12Var.j).getFloatValue()) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : ((vak0) f12Var.j).getFloatValue();
        if (!Float.isNaN(c)) {
            float f2 = ref$FloatRef.element;
            if (f2 != c && (a2 = nkn0.a(f2, c, f, iq2Var, new jz1(0, fz1Var, ref$FloatRef), suspendLambda)) == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return a2;
            }
        }
        return s3q0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(vgo vgoVar, float f, float f2, izs izsVar, gzs gzsVar) {
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException("The offset provided to computeTarget must not be NaN.");
        }
        boolean z = Math.abs(f2) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        boolean z2 = z && f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (!z) {
            return vgoVar.a(f);
        }
        if (Math.abs(f2) >= Math.abs(((Number) gzsVar.invoke()).floatValue())) {
            return vgoVar.b(f, z2);
        }
        Object b2 = vgoVar.b(f, false);
        float c = vgoVar.c(b2);
        Object b3 = vgoVar.b(f, true);
        float c2 = vgoVar.c(b3);
        float abs = Math.abs(((Number) izsVar.invoke(Float.valueOf(Math.abs(c - c2)))).floatValue());
        if (!z2) {
            c = c2;
        }
        boolean z3 = Math.abs(c - f) >= abs;
        if (z3) {
            return z2 ? b3 : b2;
        }
        if (z3) {
            throw new NoWhenBranchMatchedException();
        }
        if (z2) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(gzs gzsVar, wzs wzsVar, ContinuationImpl continuationImpl) {
        xz1 xz1Var;
        int i;
        if (continuationImpl instanceof xz1) {
            xz1Var = (xz1) continuationImpl;
            int i2 = xz1Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xz1Var.label = i2 - Integer.MIN_VALUE;
                Object obj = xz1Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = xz1Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    b02 b02Var = new b02(gzsVar, wzsVar, null);
                    xz1Var.label = 1;
                    if (zvj.d(b02Var, xz1Var) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return s3q0.a;
            }
        }
        xz1Var = new xz1(continuationImpl);
        Object obj2 = xz1Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = xz1Var.label;
        if (i != 0) {
        }
        return s3q0.a;
    }

    public static q630 e(q630 q630Var, f12 f12Var, Orientation orientation, boolean z, int i) {
        if ((i & 4) != 0) {
            z = true;
        }
        return q630Var.g(new iz1(f12Var, orientation, z));
    }

    public static Object f(f12 f12Var, Enum r4, SuspendLambda suspendLambda) {
        iq2 iq2Var;
        if (f12Var.d()) {
            iq2Var = f12Var.d;
            if (iq2Var == null) {
                iq2Var = null;
            }
        } else {
            iq2Var = hz1.a;
        }
        Object a2 = f12Var.a(r4, MutatePriority.Default, new qz1(f12Var, iq2Var, null), suspendLambda);
        return a2 == CoroutineSingletons.COROUTINE_SUSPENDED ? a2 : s3q0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(f12 f12Var, Object obj, float f, iq2 iq2Var, l7l l7lVar, ContinuationImpl continuationImpl) {
        rz1 rz1Var;
        int i;
        float f2;
        Ref$FloatRef ref$FloatRef;
        if (continuationImpl instanceof rz1) {
            rz1Var = (rz1) continuationImpl;
            int i2 = rz1Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rz1Var.label = i2 - Integer.MIN_VALUE;
                rz1 rz1Var2 = rz1Var;
                Object obj2 = rz1Var2.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rz1Var2.label;
                if (i != 0) {
                    kotlin.a.a(obj2);
                    Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
                    ref$FloatRef2.element = f;
                    zzs tz1Var = new tz1(f12Var, f, iq2Var, ref$FloatRef2, l7lVar, null);
                    rz1Var2.L$0 = ref$FloatRef2;
                    rz1Var2.F$0 = f;
                    rz1Var2.label = 1;
                    if (f12Var.a(obj, MutatePriority.Default, tz1Var, rz1Var2) == obj3) {
                        return obj3;
                    }
                    f2 = f;
                    ref$FloatRef = ref$FloatRef2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f2 = rz1Var2.F$0;
                    ref$FloatRef = (Ref$FloatRef) rz1Var2.L$0;
                    kotlin.a.a(obj2);
                }
                return new Float(f2 - ref$FloatRef.element);
            }
        }
        rz1Var = new rz1(continuationImpl);
        rz1 rz1Var22 = rz1Var;
        Object obj22 = rz1Var22.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rz1Var22.label;
        if (i != 0) {
        }
        return new Float(f2 - ref$FloatRef.element);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object h(f12 f12Var, Object obj, float f, ContinuationImpl continuationImpl) {
        iq2 iq2Var;
        l7l l7lVar = null;
        if (f12Var.d()) {
            iq2Var = f12Var.d;
            if (iq2Var == null) {
                iq2Var = null;
            }
        } else {
            iq2Var = hz1.a;
        }
        iq2 iq2Var2 = iq2Var;
        if (f12Var.d()) {
            l7l l7lVar2 = f12Var.e;
            if (l7lVar2 != null) {
                l7lVar = l7lVar2;
            }
        } else {
            l7lVar = hz1.c;
        }
        return g(f12Var, obj, f, iq2Var2, l7lVar, continuationImpl);
    }
}
