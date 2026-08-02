package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.e;
import androidx.compose.ui.platform.j;
import defpackage.bts;
import defpackage.did;
import defpackage.fid;
import defpackage.fwi;
import defpackage.gxg;
import defpackage.i1t0;
import defpackage.iip0;
import defpackage.ist0;
import defpackage.j1t0;
import defpackage.jj2;
import defpackage.kj2;
import defpackage.ny61;
import defpackage.sb2;
import defpackage.tls;
import defpackage.uh6;
import defpackage.vi2;
import defpackage.xi2;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$FloatRef;

/* loaded from: classes10.dex */
public abstract class b {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(iip0 iip0Var, float f, kj2 kj2Var, gxg gxgVar, tls tlsVar, ContinuationImpl continuationImpl) {
        SnapFlingBehaviorKt$animateDecay$1 snapFlingBehaviorKt$animateDecay$1;
        int i;
        float f2;
        Ref$FloatRef ref$FloatRef;
        if (continuationImpl instanceof SnapFlingBehaviorKt$animateDecay$1) {
            snapFlingBehaviorKt$animateDecay$1 = (SnapFlingBehaviorKt$animateDecay$1) continuationImpl;
            int i2 = snapFlingBehaviorKt$animateDecay$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                snapFlingBehaviorKt$animateDecay$1.label = i2 - Integer.MIN_VALUE;
                Object obj = snapFlingBehaviorKt$animateDecay$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = snapFlingBehaviorKt$animateDecay$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
                    boolean z = ((Number) kj2Var.e()).floatValue() == 0.0f;
                    i1t0 i1t0Var = new i1t0(f, ref$FloatRef2, iip0Var, tlsVar, 0);
                    snapFlingBehaviorKt$animateDecay$1.L$0 = kj2Var;
                    snapFlingBehaviorKt$animateDecay$1.L$1 = ref$FloatRef2;
                    snapFlingBehaviorKt$animateDecay$1.F$0 = f;
                    snapFlingBehaviorKt$animateDecay$1.label = 1;
                    if (e.d(kj2Var, gxgVar, !z, i1t0Var, snapFlingBehaviorKt$animateDecay$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    f2 = f;
                    ref$FloatRef = ref$FloatRef2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f2 = snapFlingBehaviorKt$animateDecay$1.F$0;
                    ref$FloatRef = (Ref$FloatRef) snapFlingBehaviorKt$animateDecay$1.L$1;
                    kj2Var = (kj2) snapFlingBehaviorKt$animateDecay$1.L$0;
                    kotlin.b.b(obj);
                }
                return new vi2(new Float(f2 - ref$FloatRef.element), kj2Var);
            }
        }
        snapFlingBehaviorKt$animateDecay$1 = new SnapFlingBehaviorKt$animateDecay$1(continuationImpl);
        Object obj2 = snapFlingBehaviorKt$animateDecay$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = snapFlingBehaviorKt$animateDecay$1.label;
        if (i != 0) {
        }
        return new vi2(new Float(f2 - ref$FloatRef.element), kj2Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(iip0 iip0Var, float f, float f2, kj2 kj2Var, jj2 jj2Var, tls tlsVar, ContinuationImpl continuationImpl) {
        SnapFlingBehaviorKt$animateWithTarget$1 snapFlingBehaviorKt$animateWithTarget$1;
        int i;
        float floatValue;
        kj2 kj2Var2;
        Ref$FloatRef ref$FloatRef;
        float f3 = f;
        if (continuationImpl instanceof SnapFlingBehaviorKt$animateWithTarget$1) {
            snapFlingBehaviorKt$animateWithTarget$1 = (SnapFlingBehaviorKt$animateWithTarget$1) continuationImpl;
            int i2 = snapFlingBehaviorKt$animateWithTarget$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                snapFlingBehaviorKt$animateWithTarget$1.label = i2 - Integer.MIN_VALUE;
                SnapFlingBehaviorKt$animateWithTarget$1 snapFlingBehaviorKt$animateWithTarget$12 = snapFlingBehaviorKt$animateWithTarget$1;
                Object obj = snapFlingBehaviorKt$animateWithTarget$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = snapFlingBehaviorKt$animateWithTarget$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
                    floatValue = ((Number) kj2Var.e()).floatValue();
                    Float f4 = new Float(f3);
                    boolean z = ((Number) kj2Var.e()).floatValue() == 0.0f;
                    i1t0 i1t0Var = new i1t0(f2, ref$FloatRef2, iip0Var, tlsVar, 1);
                    snapFlingBehaviorKt$animateWithTarget$12.L$0 = kj2Var;
                    snapFlingBehaviorKt$animateWithTarget$12.L$1 = ref$FloatRef2;
                    snapFlingBehaviorKt$animateWithTarget$12.F$0 = f3;
                    snapFlingBehaviorKt$animateWithTarget$12.F$1 = floatValue;
                    snapFlingBehaviorKt$animateWithTarget$12.label = 1;
                    if (e.e(kj2Var, f4, jj2Var, !z, i1t0Var, snapFlingBehaviorKt$animateWithTarget$12) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    kj2Var2 = kj2Var;
                    ref$FloatRef = ref$FloatRef2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    float f5 = snapFlingBehaviorKt$animateWithTarget$12.F$1;
                    float f6 = snapFlingBehaviorKt$animateWithTarget$12.F$0;
                    ref$FloatRef = (Ref$FloatRef) snapFlingBehaviorKt$animateWithTarget$12.L$1;
                    kj2Var2 = (kj2) snapFlingBehaviorKt$animateWithTarget$12.L$0;
                    kotlin.b.b(obj);
                    floatValue = f5;
                    f3 = f6;
                }
                return new vi2(new Float(f3 - ref$FloatRef.element), uh6.l(kj2Var2, 0.0f, d(((Number) kj2Var2.e()).floatValue(), floatValue), 29));
            }
        }
        snapFlingBehaviorKt$animateWithTarget$1 = new SnapFlingBehaviorKt$animateWithTarget$1(continuationImpl);
        SnapFlingBehaviorKt$animateWithTarget$1 snapFlingBehaviorKt$animateWithTarget$122 = snapFlingBehaviorKt$animateWithTarget$1;
        Object obj2 = snapFlingBehaviorKt$animateWithTarget$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = snapFlingBehaviorKt$animateWithTarget$122.label;
        if (i != 0) {
        }
        return new vi2(new Float(f3 - ref$FloatRef.element), uh6.l(kj2Var2, 0.0f, d(((Number) kj2Var2.e()).floatValue(), floatValue), 29));
    }

    public static final void c(xi2 xi2Var, iip0 iip0Var, tls tlsVar, float f) {
        float f2;
        try {
            f2 = iip0Var.a(f);
        } catch (CancellationException unused) {
            xi2Var.a();
            f2 = 0.0f;
        }
        tlsVar.invoke(Float.valueOf(f2));
        if (Math.abs(f - f2) > 0.5f) {
            xi2Var.a();
        }
    }

    public static final float d(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return (f2 <= 0.0f ? f >= f2 : f <= f2) ? f : f2;
    }

    public static final a e(j1t0 j1t0Var, fid fidVar) {
        bts btsVar = (bts) fidVar;
        fwi fwiVar = (fwi) btsVar.m(j.h);
        gxg a = ist0.a(btsVar);
        boolean k = btsVar.k(fwiVar) | btsVar.k(j1t0Var) | btsVar.k(a);
        Object Q = btsVar.Q();
        if (k || Q == did.a) {
            Q = new a(j1t0Var, a, sb2.G(0.0f, 400.0f, 5, null));
            btsVar.o0(Q);
        }
        return (a) Q;
    }
}
