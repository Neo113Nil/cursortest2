package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.material3.SheetValue;
import androidx.compose.ui.input.pointer.PointerEventPass;
import defpackage.bms;
import defpackage.bvf0;
import defpackage.ck11;
import defpackage.dhj0;
import defpackage.f22;
import defpackage.f530;
import defpackage.gxg;
import defpackage.hwd0;
import defpackage.hxg;
import defpackage.i62;
import defpackage.jj2;
import defpackage.lah;
import defpackage.ny61;
import defpackage.o62;
import defpackage.q0v;
import defpackage.q501;
import defpackage.qar;
import defpackage.sls;
import defpackage.tls;
import defpackage.tvd0;
import defpackage.w511;
import defpackage.wkp0;
import defpackage.wls;
import defpackage.wu60;
import defpackage.zvd0;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public abstract class c {
    public static final f22 a = new f22(3);
    public static final hxg b = new hxg(new q501(6));

    public static final Object a(e eVar, float f, o62 o62Var, lah lahVar, Object obj, jj2 jj2Var, SuspendLambda suspendLambda) {
        Object a2;
        float f2 = lahVar.f(obj);
        Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
        ref$FloatRef.element = Float.isNaN(eVar.j.getFloatValue()) ? 0.0f : eVar.j.getFloatValue();
        if (!Float.isNaN(f2)) {
            float f3 = ref$FloatRef.element;
            if (f3 != f2 && (a2 = androidx.compose.animation.core.e.a(f3, f2, f, jj2Var, new q0v(13, o62Var, ref$FloatRef), suspendLambda)) == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return a2;
            }
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(lah lahVar, float f, float f2, tls tlsVar, sls slsVar) {
        if (Float.isNaN(f)) {
            ny61.g("The offset provided to computeTarget must not be NaN.");
            return null;
        }
        boolean z = Math.abs(f2) > 0.0f;
        boolean z2 = z && f2 > 0.0f;
        if (!z) {
            return lahVar.a(f);
        }
        if (Math.abs(f2) >= Math.abs(((Number) slsVar.invoke()).floatValue())) {
            return lahVar.b(f, z2);
        }
        Object b2 = lahVar.b(f, false);
        float f3 = lahVar.f(b2);
        Object b3 = lahVar.b(f, true);
        float f4 = lahVar.f(b3);
        float abs = Math.abs(((Number) tlsVar.invoke(Float.valueOf(Math.abs(f3 - f4)))).floatValue());
        if (!z2) {
            f3 = f4;
        }
        boolean z3 = Math.abs(f3 - f) >= abs;
        if (z3) {
            return z2 ? b3 : b2;
        }
        if (z3) {
            w511.b();
            return null;
        }
        if (z2) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(sls slsVar, wls wlsVar, ContinuationImpl continuationImpl) {
        AnchoredDraggableKt$restartable$1 anchoredDraggableKt$restartable$1;
        int i;
        if (continuationImpl instanceof AnchoredDraggableKt$restartable$1) {
            anchoredDraggableKt$restartable$1 = (AnchoredDraggableKt$restartable$1) continuationImpl;
            int i2 = anchoredDraggableKt$restartable$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anchoredDraggableKt$restartable$1.label = i2 - Integer.MIN_VALUE;
                Object obj = anchoredDraggableKt$restartable$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = anchoredDraggableKt$restartable$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    AnchoredDraggableKt$restartable$2 anchoredDraggableKt$restartable$2 = new AnchoredDraggableKt$restartable$2(slsVar, wlsVar, null);
                    anchoredDraggableKt$restartable$1.label = 1;
                    if (bvf0.n(anchoredDraggableKt$restartable$2, anchoredDraggableKt$restartable$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        anchoredDraggableKt$restartable$1 = new AnchoredDraggableKt$restartable$1(continuationImpl);
        Object obj2 = anchoredDraggableKt$restartable$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = anchoredDraggableKt$restartable$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    public static final boolean d(androidx.compose.ui.input.pointer.f fVar) {
        List list = fVar.y.x.a;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (((zvd0) list.get(i)).d) {
                z = true;
                break;
            }
            i++;
        }
        return !z;
    }

    public static f530 e(f530 f530Var, e eVar, Orientation orientation, boolean z, androidx.compose.material3.o oVar, int i) {
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 32) != 0) {
            oVar = null;
        }
        return f530Var.k(new a(eVar, orientation, z, oVar));
    }

    public static final float f(long j) {
        if (Float.intBitsToFloat((int) (j >> 32)) == 0.0f && Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) == 0.0f) {
            return 0.0f;
        }
        return ((-((float) Math.atan2(Float.intBitsToFloat(r0), Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))))) * 180.0f) / 3.1415927f;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(wkp0 wkp0Var, float f, qar qarVar, ContinuationImpl continuationImpl) {
        ScrollExtensionsKt$animateScrollBy$1 scrollExtensionsKt$animateScrollBy$1;
        int i;
        Ref$FloatRef ref$FloatRef;
        if (continuationImpl instanceof ScrollExtensionsKt$animateScrollBy$1) {
            scrollExtensionsKt$animateScrollBy$1 = (ScrollExtensionsKt$animateScrollBy$1) continuationImpl;
            int i2 = scrollExtensionsKt$animateScrollBy$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scrollExtensionsKt$animateScrollBy$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scrollExtensionsKt$animateScrollBy$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scrollExtensionsKt$animateScrollBy$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
                    wls scrollExtensionsKt$animateScrollBy$2 = new ScrollExtensionsKt$animateScrollBy$2(f, qarVar, ref$FloatRef2, null);
                    scrollExtensionsKt$animateScrollBy$1.L$0 = ref$FloatRef2;
                    scrollExtensionsKt$animateScrollBy$1.label = 1;
                    if (wkp0Var.d(MutatePriority.Default, scrollExtensionsKt$animateScrollBy$2, scrollExtensionsKt$animateScrollBy$1) == obj2) {
                        return obj2;
                    }
                    ref$FloatRef = ref$FloatRef2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ref$FloatRef = (Ref$FloatRef) scrollExtensionsKt$animateScrollBy$1.L$0;
                    kotlin.b.b(obj);
                }
                return new Float(ref$FloatRef.element);
            }
        }
        scrollExtensionsKt$animateScrollBy$1 = new ScrollExtensionsKt$animateScrollBy$1(continuationImpl);
        Object obj3 = scrollExtensionsKt$animateScrollBy$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scrollExtensionsKt$animateScrollBy$1.label;
        if (i != 0) {
        }
        return new Float(ref$FloatRef.element);
    }

    public static final Object h(e eVar, SheetValue sheetValue, jj2 jj2Var, ContinuationImpl continuationImpl) {
        Object a2 = eVar.a(sheetValue, MutatePriority.Default, new AnchoredDraggableKt$animateTo$4(eVar, jj2Var, null), continuationImpl);
        return a2 == CoroutineSingletons.COROUTINE_SUSPENDED ? a2 : zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(e eVar, Object obj, float f, jj2 jj2Var, gxg gxgVar, ContinuationImpl continuationImpl) {
        AnchoredDraggableKt$animateToWithDecay$1 anchoredDraggableKt$animateToWithDecay$1;
        int i;
        float f2;
        Ref$FloatRef ref$FloatRef;
        if (continuationImpl instanceof AnchoredDraggableKt$animateToWithDecay$1) {
            anchoredDraggableKt$animateToWithDecay$1 = (AnchoredDraggableKt$animateToWithDecay$1) continuationImpl;
            int i2 = anchoredDraggableKt$animateToWithDecay$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anchoredDraggableKt$animateToWithDecay$1.label = i2 - Integer.MIN_VALUE;
                AnchoredDraggableKt$animateToWithDecay$1 anchoredDraggableKt$animateToWithDecay$12 = anchoredDraggableKt$animateToWithDecay$1;
                Object obj2 = anchoredDraggableKt$animateToWithDecay$12.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = anchoredDraggableKt$animateToWithDecay$12.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
                    ref$FloatRef2.element = f;
                    bms anchoredDraggableKt$animateToWithDecay$2 = new AnchoredDraggableKt$animateToWithDecay$2(eVar, f, jj2Var, ref$FloatRef2, gxgVar, null);
                    anchoredDraggableKt$animateToWithDecay$12.L$0 = ref$FloatRef2;
                    anchoredDraggableKt$animateToWithDecay$12.F$0 = f;
                    anchoredDraggableKt$animateToWithDecay$12.label = 1;
                    if (eVar.a(obj, MutatePriority.Default, anchoredDraggableKt$animateToWithDecay$2, anchoredDraggableKt$animateToWithDecay$12) == obj3) {
                        return obj3;
                    }
                    f2 = f;
                    ref$FloatRef = ref$FloatRef2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f2 = anchoredDraggableKt$animateToWithDecay$12.F$0;
                    ref$FloatRef = (Ref$FloatRef) anchoredDraggableKt$animateToWithDecay$12.L$0;
                    kotlin.b.b(obj2);
                }
                return new Float(f2 - ref$FloatRef.element);
            }
        }
        anchoredDraggableKt$animateToWithDecay$1 = new AnchoredDraggableKt$animateToWithDecay$1(continuationImpl);
        AnchoredDraggableKt$animateToWithDecay$1 anchoredDraggableKt$animateToWithDecay$122 = anchoredDraggableKt$animateToWithDecay$1;
        Object obj22 = anchoredDraggableKt$animateToWithDecay$122.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = anchoredDraggableKt$animateToWithDecay$122.label;
        if (i != 0) {
        }
        return new Float(f2 - ref$FloatRef.element);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [gxg] */
    public static Object j(e eVar, Object obj, float f, ContinuationImpl continuationImpl) {
        ck11 ck11Var;
        hxg hxgVar = null;
        if (eVar.e()) {
            ck11Var = eVar.d;
            if (ck11Var == null) {
                ck11Var = null;
            }
        } else {
            ck11Var = i62.a;
        }
        ck11 ck11Var2 = ck11Var;
        if (eVar.e()) {
            ?? r0 = eVar.e;
            if (r0 != 0) {
                hxgVar = r0;
            }
        } else {
            hxgVar = i62.c;
        }
        return i(eVar, obj, f, ck11Var2, hxgVar, continuationImpl);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0040, code lost:
    
        if (d(r7) == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004c -> B:10:0x004f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object k(androidx.compose.ui.input.pointer.f fVar, PointerEventPass pointerEventPass, BaseContinuationImpl baseContinuationImpl) {
        ForEachGestureKt$awaitAllPointersUp$3 forEachGestureKt$awaitAllPointersUp$3;
        int i;
        if (baseContinuationImpl instanceof ForEachGestureKt$awaitAllPointersUp$3) {
            forEachGestureKt$awaitAllPointersUp$3 = (ForEachGestureKt$awaitAllPointersUp$3) baseContinuationImpl;
            int i2 = forEachGestureKt$awaitAllPointersUp$3.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                forEachGestureKt$awaitAllPointersUp$3.label = i2 - Integer.MIN_VALUE;
                Object obj = forEachGestureKt$awaitAllPointersUp$3.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = forEachGestureKt$awaitAllPointersUp$3.label;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    PointerEventPass pointerEventPass2 = (PointerEventPass) forEachGestureKt$awaitAllPointersUp$3.L$1;
                    androidx.compose.ui.input.pointer.f fVar2 = (androidx.compose.ui.input.pointer.f) forEachGestureKt$awaitAllPointersUp$3.L$0;
                    kotlin.b.b(obj);
                    pointerEventPass = pointerEventPass2;
                    fVar = fVar2;
                    List list = ((tvd0) obj).a;
                    int size = list.size();
                    int i3 = 0;
                    while (i3 < size) {
                        if (((zvd0) list.get(i3)).d) {
                            forEachGestureKt$awaitAllPointersUp$3.L$0 = fVar;
                            forEachGestureKt$awaitAllPointersUp$3.L$1 = pointerEventPass;
                            forEachGestureKt$awaitAllPointersUp$3.label = 1;
                            obj = fVar.a(pointerEventPass, forEachGestureKt$awaitAllPointersUp$3);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            List list2 = ((tvd0) obj).a;
                            int size2 = list2.size();
                            int i32 = 0;
                            while (i32 < size2) {
                            }
                        } else {
                            i32++;
                        }
                    }
                    return zy11.a;
                }
                kotlin.b.b(obj);
            }
        }
        forEachGestureKt$awaitAllPointersUp$3 = new ForEachGestureKt$awaitAllPointersUp$3(baseContinuationImpl);
        Object obj2 = forEachGestureKt$awaitAllPointersUp$3.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = forEachGestureKt$awaitAllPointersUp$3.label;
        if (i == 0) {
        }
    }

    public static final Object l(hwd0 hwd0Var, wls wlsVar, Continuation continuation) {
        Object E0 = ((androidx.compose.ui.input.pointer.g) hwd0Var).E0(new ForEachGestureKt$awaitEachGesture$2(continuation.get_context(), wlsVar, null), continuation);
        return E0 == CoroutineSingletons.COROUTINE_SUSPENDED ? E0 : zy11.a;
    }

    public static final long m(tvd0 tvd0Var, boolean z) {
        List list = tvd0Var.a;
        int size = list.size();
        long j = 0;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            zvd0 zvd0Var = (zvd0) list.get(i2);
            if (zvd0Var.d && zvd0Var.h) {
                j = wu60.f(j, z ? zvd0Var.c : zvd0Var.g);
                i++;
            }
        }
        if (i == 0) {
            return 9205357640488583168L;
        }
        return wu60.b(i, j);
    }

    public static final float n(tvd0 tvd0Var, boolean z) {
        long m = m(tvd0Var, z);
        float f = 0.0f;
        if (wu60.c(m, 9205357640488583168L)) {
            return 0.0f;
        }
        List list = tvd0Var.a;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            zvd0 zvd0Var = (zvd0) list.get(i2);
            if (zvd0Var.d && zvd0Var.h) {
                i++;
                f = wu60.d(wu60.e(z ? zvd0Var.c : zvd0Var.g, m)) + f;
            }
        }
        return f / i;
    }

    public static Object o(hwd0 hwd0Var, dhj0 dhj0Var, Continuation continuation) {
        Object l = l(hwd0Var, new TransformGestureDetectorKt$detectTransformGestures$2(false, dhj0Var, null), continuation);
        return l == CoroutineSingletons.COROUTINE_SUSPENDED ? l : zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object p(wkp0 wkp0Var, float f, ContinuationImpl continuationImpl) {
        ScrollExtensionsKt$scrollBy$1 scrollExtensionsKt$scrollBy$1;
        int i;
        Ref$FloatRef ref$FloatRef;
        if (continuationImpl instanceof ScrollExtensionsKt$scrollBy$1) {
            scrollExtensionsKt$scrollBy$1 = (ScrollExtensionsKt$scrollBy$1) continuationImpl;
            int i2 = scrollExtensionsKt$scrollBy$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scrollExtensionsKt$scrollBy$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scrollExtensionsKt$scrollBy$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scrollExtensionsKt$scrollBy$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
                    wls scrollExtensionsKt$scrollBy$2 = new ScrollExtensionsKt$scrollBy$2(ref$FloatRef2, f, null);
                    scrollExtensionsKt$scrollBy$1.L$0 = ref$FloatRef2;
                    scrollExtensionsKt$scrollBy$1.label = 1;
                    if (wkp0Var.d(MutatePriority.Default, scrollExtensionsKt$scrollBy$2, scrollExtensionsKt$scrollBy$1) == obj2) {
                        return obj2;
                    }
                    ref$FloatRef = ref$FloatRef2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ref$FloatRef = (Ref$FloatRef) scrollExtensionsKt$scrollBy$1.L$0;
                    kotlin.b.b(obj);
                }
                return new Float(ref$FloatRef.element);
            }
        }
        scrollExtensionsKt$scrollBy$1 = new ScrollExtensionsKt$scrollBy$1(continuationImpl);
        Object obj3 = scrollExtensionsKt$scrollBy$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scrollExtensionsKt$scrollBy$1.label;
        if (i != 0) {
        }
        return new Float(ref$FloatRef.element);
    }

    public static Object q(wkp0 wkp0Var, Continuation continuation) {
        Object d = wkp0Var.d(MutatePriority.Default, new ScrollExtensionsKt$stopScroll$2(2, null), continuation);
        return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : zy11.a;
    }
}
