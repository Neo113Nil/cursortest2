package androidx.compose.material;

import androidx.compose.foundation.gestures.l;
import androidx.compose.foundation.gestures.n;
import defpackage.ejb1;
import defpackage.jj2;
import defpackage.jl40;
import defpackage.nah;
import defpackage.ny61;
import defpackage.oew0;
import defpackage.oxv0;
import defpackage.oz40;
import defpackage.pjv0;
import defpackage.s5w0;
import defpackage.tx40;
import defpackage.v9b;
import defpackage.zls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.t;

/* loaded from: classes10.dex */
public final class e {
    public final jj2 a;
    public final oz40 b;
    public final oz40 c = androidx.compose.runtime.f.j(Boolean.FALSE);
    public final tx40 d = androidx.compose.runtime.f.f(0.0f);
    public final tx40 e = androidx.compose.runtime.f.f(0.0f);
    public final tx40 f = androidx.compose.runtime.f.f(0.0f);
    public final oz40 g = androidx.compose.runtime.f.j(null);
    public final oz40 h = androidx.compose.runtime.f.j(kotlin.collections.b.f());
    public final t i = kotlinx.coroutines.flow.e.T(new v9b(androidx.compose.runtime.f.o(new oew0(5, this)), 1), 1);
    public float j = Float.NEGATIVE_INFINITY;
    public float k = Float.POSITIVE_INFINITY;
    public final oz40 l = androidx.compose.runtime.f.j(new pjv0(2));
    public final tx40 m = androidx.compose.runtime.f.f(0.0f);
    public final oz40 n = androidx.compose.runtime.f.j(null);
    public final nah o;

    public e(Boolean bool, jj2 jj2Var, oxv0 oxv0Var) {
        this.a = jj2Var;
        this.b = androidx.compose.runtime.f.j(bool);
        s5w0 s5w0Var = new s5w0(8, this);
        zls zlsVar = l.a;
        this.o = new nah(s5w0Var);
    }

    public static Object b(e eVar, Object obj, Continuation continuation) {
        Object collect = eVar.i.collect(new c(obj, eVar, eVar.a), continuation);
        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : zy11.a;
    }

    public final Object a(float f, jj2 jj2Var, Continuation continuation) {
        Object a = n.a(this.o, new SwipeableState$animateInternalToOffset$2(this, f, jj2Var, null), continuation);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : zy11.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:(2:3|(7:5|6|7|(1:(1:(1:(5:12|13|14|15|16)(2:18|19))(2:20|21))(2:24|25))(3:26|(2:28|(3:30|(1:32)|(1:35))(2:36|37))(2:38|(3:40|(2:42|(1:44)(3:47|(1:49)(2:51|(2:53|(3:54|(1:56)|57)))|50))(4:61|(1:63)|64|(1:66)(3:67|(1:69)(2:71|(2:73|(3:74|(1:76)|77)))|70))|45))|34)|22|15|16))|7|(0)(0)|22|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01b2, code lost:
    
        if (r15 == r1) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01e2, code lost:
    
        r0.L$0 = r14;
        r0.F$0 = r13;
        r0.label = 3;
        r15 = androidx.compose.foundation.gestures.n.a(r3, new androidx.compose.material.SwipeableState$snapInternalToOffset$2(r13, r12, null), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01f3, code lost:
    
        if (r15 != kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01f6, code lost:
    
        r15 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01f7, code lost:
    
        if (r15 == r1) goto L87;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r13v57, types: [float] */
    /* JADX WARN: Type inference failed for: r13v60 */
    /* JADX WARN: Type inference failed for: r13v61 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Map map, Map map2, ContinuationImpl continuationImpl) {
        SwipeableState$processNewAnchors$1 swipeableState$processNewAnchors$1;
        int i;
        Float f;
        Object next;
        float f2;
        Object next2;
        try {
            if (continuationImpl instanceof SwipeableState$processNewAnchors$1) {
                swipeableState$processNewAnchors$1 = (SwipeableState$processNewAnchors$1) continuationImpl;
                int i2 = swipeableState$processNewAnchors$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    swipeableState$processNewAnchors$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = swipeableState$processNewAnchors$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = swipeableState$processNewAnchors$1.label;
                    nah nahVar = this.o;
                    Object obj3 = zy11.a;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        boolean isEmpty = map.isEmpty();
                        oz40 oz40Var = this.b;
                        if (isEmpty) {
                            this.j = kotlin.collections.a.i0(map2.keySet()).floatValue();
                            this.k = kotlin.collections.a.e0(map2.keySet()).floatValue();
                            Float a = ejb1.a(oz40Var.getValue(), map2);
                            if (a == null) {
                                ny61.g("The initial value must have an associated anchor.");
                                return null;
                            }
                            float floatValue = a.floatValue();
                            swipeableState$processNewAnchors$1.label = 1;
                            Object a2 = n.a(nahVar, new SwipeableState$snapInternalToOffset$2(floatValue, this, null), swipeableState$processNewAnchors$1);
                            if (a2 != obj2) {
                                a2 = obj3;
                            }
                            if (a2 == obj2) {
                                return obj2;
                            }
                        } else if (!jl40.l(map2, map)) {
                            this.j = Float.NEGATIVE_INFINITY;
                            this.k = Float.POSITIVE_INFINITY;
                            Float f3 = (Float) this.g.getValue();
                            if (f3 != null) {
                                Float a3 = ejb1.a(map.get(f3), map2);
                                if (a3 != null) {
                                    f2 = a3.floatValue();
                                } else {
                                    Iterator it = map2.keySet().iterator();
                                    if (it.hasNext()) {
                                        next2 = it.next();
                                        if (it.hasNext()) {
                                            float abs = Math.abs(((Number) next2).floatValue() - f3.floatValue());
                                            do {
                                                Object next3 = it.next();
                                                float abs2 = Math.abs(((Number) next3).floatValue() - f3.floatValue());
                                                if (Float.compare(abs, abs2) > 0) {
                                                    next2 = next3;
                                                    abs = abs2;
                                                }
                                            } while (it.hasNext());
                                        }
                                    } else {
                                        next2 = null;
                                    }
                                    f2 = ((Number) next2).floatValue();
                                }
                            } else {
                                tx40 tx40Var = this.d;
                                Object obj4 = map.get(tx40Var.getValue());
                                if (jl40.l(obj4, oz40Var.getValue())) {
                                    obj4 = oz40Var.getValue();
                                }
                                Float a4 = ejb1.a(obj4, map2);
                                if (a4 != null) {
                                    f2 = a4.floatValue();
                                } else {
                                    Iterator it2 = map2.keySet().iterator();
                                    if (it2.hasNext()) {
                                        next = it2.next();
                                        if (it2.hasNext()) {
                                            float abs3 = Math.abs(((Number) next).floatValue() - ((Number) tx40Var.getValue()).floatValue());
                                            do {
                                                Object next4 = it2.next();
                                                float abs4 = Math.abs(((Number) next4).floatValue() - ((Number) tx40Var.getValue()).floatValue());
                                                if (Float.compare(abs3, abs4) > 0) {
                                                    next = next4;
                                                    abs3 = abs4;
                                                }
                                            } while (it2.hasNext());
                                        }
                                    } else {
                                        next = null;
                                    }
                                    f2 = ((Number) next).floatValue();
                                }
                            }
                            jj2 jj2Var = this.a;
                            swipeableState$processNewAnchors$1.L$0 = map2;
                            swipeableState$processNewAnchors$1.F$0 = f2;
                            swipeableState$processNewAnchors$1.label = 2;
                            Object a5 = a(f2, jj2Var, swipeableState$processNewAnchors$1);
                            map = f2;
                        }
                        return obj3;
                    }
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return obj3;
                    }
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        map = swipeableState$processNewAnchors$1.F$0;
                        map2 = (Map) swipeableState$processNewAnchors$1.L$0;
                        kotlin.b.b(obj);
                        f = new Float(map);
                        d(kotlin.collections.b.g(f, map2));
                        this.j = kotlin.collections.a.i0(map2.keySet()).floatValue();
                        this.k = kotlin.collections.a.e0(map2.keySet()).floatValue();
                        return obj3;
                    }
                    float f4 = swipeableState$processNewAnchors$1.F$0;
                    map2 = (Map) swipeableState$processNewAnchors$1.L$0;
                    kotlin.b.b(obj);
                    map = f4;
                    f = new Float((float) map);
                    d(kotlin.collections.b.g(f, map2));
                    this.j = kotlin.collections.a.i0(map2.keySet()).floatValue();
                    this.k = kotlin.collections.a.e0(map2.keySet()).floatValue();
                    return obj3;
                }
            }
            if (i != 0) {
            }
            f = new Float((float) map);
            d(kotlin.collections.b.g(f, map2));
            this.j = kotlin.collections.a.i0(map2.keySet()).floatValue();
            this.k = kotlin.collections.a.e0(map2.keySet()).floatValue();
            return obj3;
        } catch (Throwable th) {
            d(kotlin.collections.b.g(new Float(map), map2));
            this.j = kotlin.collections.a.i0(map2.keySet()).floatValue();
            this.k = kotlin.collections.a.e0(map2.keySet()).floatValue();
            throw th;
        }
        swipeableState$processNewAnchors$1 = new SwipeableState$processNewAnchors$1(this, continuationImpl);
        Object obj5 = swipeableState$processNewAnchors$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = swipeableState$processNewAnchors$1.label;
        nah nahVar2 = this.o;
        Object obj32 = zy11.a;
    }

    public final void d(Object obj) {
        this.b.setValue(obj);
    }
}
