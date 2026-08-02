package com.yandex.go.summary.ui.compose.common.animation;

import androidx.compose.runtime.f;
import defpackage.aii0;
import defpackage.bts;
import defpackage.did;
import defpackage.fid;
import defpackage.jl40;
import defpackage.n6y;
import defpackage.ny61;
import defpackage.o430;
import defpackage.oz40;
import defpackage.p0u;
import defpackage.rol0;
import defpackage.rqu;
import defpackage.s6y;
import defpackage.t6y;
import defpackage.tls;
import defpackage.v6y;
import defpackage.wls;
import defpackage.zpn;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes14.dex */
public abstract class c {
    public static final void a(androidx.compose.foundation.lazy.b bVar, int i, float f, fid fidVar, int i2) {
        float f2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1396223534);
        int i3 = i2 | (btsVar.k(bVar) ? 4 : 2) | (btsVar.c(i) ? 32 : 16) | 384;
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            oz40 a = androidx.compose.foundation.interaction.a.a(bVar.g, btsVar);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = f.j(Boolean.FALSE);
                btsVar.o0(Q);
            }
            oz40 oz40Var = (oz40) Q;
            Integer valueOf = Integer.valueOf(i);
            boolean z = false;
            Float valueOf2 = Float.valueOf(10.0f);
            boolean z2 = (i3 & 14) == 4;
            if ((i3 & 112) == 32) {
                z = true;
            }
            boolean k = z2 | z | btsVar.k(a);
            Object Q2 = btsVar.Q();
            if (k || Q2 == o430Var) {
                LazyListScrollKt$ObserveFirstItemAndTargetItemScrollEffect$1$1 lazyListScrollKt$ObserveFirstItemAndTargetItemScrollEffect$1$1 = new LazyListScrollKt$ObserveFirstItemAndTargetItemScrollEffect$1$1(oz40Var, bVar, i, 10.0f, a, null);
                btsVar.o0(lazyListScrollKt$ObserveFirstItemAndTargetItemScrollEffect$1$1);
                Q2 = lazyListScrollKt$ObserveFirstItemAndTargetItemScrollEffect$1$1;
            }
            zpn.g(bVar, valueOf, valueOf2, (wls) Q2, btsVar);
            f2 = 10.0f;
        } else {
            btsVar.Y();
            f2 = f;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new v6y(bVar, i, f2, i2, 0);
        }
    }

    public static final void b(androidx.compose.foundation.lazy.b bVar, int i, float f, fid fidVar, int i2) {
        float f2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(820359320);
        int i3 = i2 | (btsVar.k(bVar) ? 4 : 2) | (btsVar.c(i) ? 32 : 16) | 384;
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            oz40 a = androidx.compose.foundation.interaction.a.a(bVar.g, btsVar);
            Integer valueOf = Integer.valueOf(i);
            f2 = 10.0f;
            Float valueOf2 = Float.valueOf(10.0f);
            boolean k = ((i3 & 14) == 4) | ((i3 & 112) == 32) | btsVar.k(a);
            Object Q = btsVar.Q();
            if (k || Q == did.a) {
                LazyListScrollKt$ObserveTargetItemAndAnimateScrollToCenterItemHorizontallyEffect$1$1 lazyListScrollKt$ObserveTargetItemAndAnimateScrollToCenterItemHorizontallyEffect$1$1 = new LazyListScrollKt$ObserveTargetItemAndAnimateScrollToCenterItemHorizontallyEffect$1$1(bVar, i, 10.0f, a, null);
                btsVar.o0(lazyListScrollKt$ObserveTargetItemAndAnimateScrollToCenterItemHorizontallyEffect$1$1);
                Q = lazyListScrollKt$ObserveTargetItemAndAnimateScrollToCenterItemHorizontallyEffect$1$1;
            }
            zpn.g(bVar, valueOf, valueOf2, (wls) Q, btsVar);
        } else {
            btsVar.Y();
            f2 = f;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new v6y(bVar, i, f2, i2, 1);
        }
    }

    public static final Object c(androidx.compose.foundation.lazy.b bVar, int i, SuspendLambda suspendLambda) {
        if (i < 0 || i >= bVar.j().n) {
            return zy11.a;
        }
        List list = bVar.j().k;
        if (list.isEmpty()) {
            list = null;
        }
        int i2 = 0;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                i2 += ((t6y) ((n6y) it.next())).p;
            }
            i2 /= list.size();
        }
        s6y j = bVar.j();
        return bVar.f(i, (i2 / 2) - (((((int) (j.e() >> 32)) - (-j.l)) - j.p) / 2), suspendLambda);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00d6 -> B:11:0x003b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(androidx.compose.foundation.lazy.b bVar, int i, float f, ContinuationImpl continuationImpl) {
        LazyListScrollKt$animateScrollToCenterPerFrame$1 lazyListScrollKt$animateScrollToCenterPerFrame$1;
        int i2;
        androidx.compose.foundation.lazy.b bVar2;
        float f2;
        LazyListScrollKt$animateScrollToCenterPerFrame$1 lazyListScrollKt$animateScrollToCenterPerFrame$12;
        long j;
        int i3;
        androidx.compose.foundation.lazy.b bVar3;
        int i4;
        long j2;
        float h;
        if (continuationImpl instanceof LazyListScrollKt$animateScrollToCenterPerFrame$1) {
            lazyListScrollKt$animateScrollToCenterPerFrame$1 = (LazyListScrollKt$animateScrollToCenterPerFrame$1) continuationImpl;
            int i5 = lazyListScrollKt$animateScrollToCenterPerFrame$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                lazyListScrollKt$animateScrollToCenterPerFrame$1.label = i5 - Integer.MIN_VALUE;
                Object obj = lazyListScrollKt$animateScrollToCenterPerFrame$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = lazyListScrollKt$animateScrollToCenterPerFrame$1.label;
                long j3 = 0;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    bVar2 = bVar;
                    f2 = f;
                    lazyListScrollKt$animateScrollToCenterPerFrame$12 = lazyListScrollKt$animateScrollToCenterPerFrame$1;
                    j = 0;
                    i3 = i;
                    if (kotlinx.coroutines.a.p(lazyListScrollKt$animateScrollToCenterPerFrame$12.get_context())) {
                    }
                    return zy11.a;
                }
                if (i2 == 1) {
                    j2 = lazyListScrollKt$animateScrollToCenterPerFrame$1.J$0;
                    f2 = lazyListScrollKt$animateScrollToCenterPerFrame$1.F$0;
                    i4 = lazyListScrollKt$animateScrollToCenterPerFrame$1.I$0;
                    bVar3 = (androidx.compose.foundation.lazy.b) lazyListScrollKt$animateScrollToCenterPerFrame$1.L$0;
                    kotlin.b.b(obj);
                    long longValue = ((Number) obj).longValue();
                    if (j2 != j3) {
                    }
                    h = h(i4, bVar3);
                    if (Math.abs(h) >= 1.0f) {
                    }
                    return zy11.a;
                }
                if (i2 != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                long j4 = lazyListScrollKt$animateScrollToCenterPerFrame$1.J$0;
                f2 = lazyListScrollKt$animateScrollToCenterPerFrame$1.F$0;
                int i6 = lazyListScrollKt$animateScrollToCenterPerFrame$1.I$0;
                bVar3 = (androidx.compose.foundation.lazy.b) lazyListScrollKt$animateScrollToCenterPerFrame$1.L$0;
                kotlin.b.b(obj);
                lazyListScrollKt$animateScrollToCenterPerFrame$12 = lazyListScrollKt$animateScrollToCenterPerFrame$1;
                i3 = i6;
                j = j4;
                bVar2 = bVar3;
                j3 = 0;
                if (kotlinx.coroutines.a.p(lazyListScrollKt$animateScrollToCenterPerFrame$12.get_context())) {
                    p0u p0uVar = new p0u(13);
                    lazyListScrollKt$animateScrollToCenterPerFrame$12.L$0 = bVar2;
                    lazyListScrollKt$animateScrollToCenterPerFrame$12.I$0 = i3;
                    lazyListScrollKt$animateScrollToCenterPerFrame$12.F$0 = f2;
                    lazyListScrollKt$animateScrollToCenterPerFrame$12.J$0 = j;
                    lazyListScrollKt$animateScrollToCenterPerFrame$12.label = 1;
                    Object v = jl40.z(lazyListScrollKt$animateScrollToCenterPerFrame$12.get_context()).v(p0uVar, lazyListScrollKt$animateScrollToCenterPerFrame$12);
                    if (v != coroutineSingletons) {
                        bVar3 = bVar2;
                        obj = v;
                        i4 = i3;
                        lazyListScrollKt$animateScrollToCenterPerFrame$1 = lazyListScrollKt$animateScrollToCenterPerFrame$12;
                        j2 = j;
                        long longValue2 = ((Number) obj).longValue();
                        float f3 = j2 != j3 ? 0.016666668f : (longValue2 - j2) / 1.0E9f;
                        h = h(i4, bVar3);
                        if (Math.abs(h) >= 1.0f) {
                            float exp = 1.0f - ((float) Math.exp((-f2) * f3));
                            lazyListScrollKt$animateScrollToCenterPerFrame$1.L$0 = bVar3;
                            lazyListScrollKt$animateScrollToCenterPerFrame$1.I$0 = i4;
                            lazyListScrollKt$animateScrollToCenterPerFrame$1.F$0 = f2;
                            lazyListScrollKt$animateScrollToCenterPerFrame$1.J$0 = longValue2;
                            lazyListScrollKt$animateScrollToCenterPerFrame$1.J$1 = longValue2;
                            lazyListScrollKt$animateScrollToCenterPerFrame$1.F$1 = f3;
                            lazyListScrollKt$animateScrollToCenterPerFrame$1.F$2 = h;
                            lazyListScrollKt$animateScrollToCenterPerFrame$1.F$3 = exp;
                            lazyListScrollKt$animateScrollToCenterPerFrame$1.label = 2;
                            if (androidx.compose.foundation.gestures.c.p(bVar3, h * exp, lazyListScrollKt$animateScrollToCenterPerFrame$1) != coroutineSingletons) {
                                lazyListScrollKt$animateScrollToCenterPerFrame$12 = lazyListScrollKt$animateScrollToCenterPerFrame$1;
                                i3 = i4;
                                j = longValue2;
                                bVar2 = bVar3;
                                j3 = 0;
                                if (kotlinx.coroutines.a.p(lazyListScrollKt$animateScrollToCenterPerFrame$12.get_context())) {
                                }
                            }
                        }
                    }
                    return coroutineSingletons;
                }
                return zy11.a;
            }
        }
        lazyListScrollKt$animateScrollToCenterPerFrame$1 = new LazyListScrollKt$animateScrollToCenterPerFrame$1(continuationImpl);
        Object obj2 = lazyListScrollKt$animateScrollToCenterPerFrame$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = lazyListScrollKt$animateScrollToCenterPerFrame$1.label;
        long j32 = 0;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(androidx.compose.foundation.lazy.b bVar, int i, ContinuationImpl continuationImpl) {
        LazyListScrollKt$awaitDisplacementFromCenter$1 lazyListScrollKt$awaitDisplacementFromCenter$1;
        int i2;
        if (continuationImpl instanceof LazyListScrollKt$awaitDisplacementFromCenter$1) {
            lazyListScrollKt$awaitDisplacementFromCenter$1 = (LazyListScrollKt$awaitDisplacementFromCenter$1) continuationImpl;
            int i3 = lazyListScrollKt$awaitDisplacementFromCenter$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                lazyListScrollKt$awaitDisplacementFromCenter$1.label = i3 - Integer.MIN_VALUE;
                Object obj = lazyListScrollKt$awaitDisplacementFromCenter$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = lazyListScrollKt$awaitDisplacementFromCenter$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    rol0 o = f.o(new rqu(bVar, i));
                    LazyListScrollKt$awaitDisplacementFromCenter$3 lazyListScrollKt$awaitDisplacementFromCenter$3 = new LazyListScrollKt$awaitDisplacementFromCenter$3(2, null);
                    lazyListScrollKt$awaitDisplacementFromCenter$1.L$0 = null;
                    lazyListScrollKt$awaitDisplacementFromCenter$1.I$0 = i;
                    lazyListScrollKt$awaitDisplacementFromCenter$1.label = 1;
                    if (e.x(o, lazyListScrollKt$awaitDisplacementFromCenter$3, lazyListScrollKt$awaitDisplacementFromCenter$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        lazyListScrollKt$awaitDisplacementFromCenter$1 = new LazyListScrollKt$awaitDisplacementFromCenter$1(continuationImpl);
        Object obj2 = lazyListScrollKt$awaitDisplacementFromCenter$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = lazyListScrollKt$awaitDisplacementFromCenter$1.label;
        if (i2 != 0) {
        }
        return zy11.a;
    }

    public static final boolean f(int i, androidx.compose.foundation.lazy.b bVar) {
        List<n6y> list = bVar.j().k;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (n6y n6yVar : list) {
            if (((t6y) n6yVar).a == i && ((t6y) n6yVar).p > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, oz40] */
    /* JADX WARN: Type inference failed for: r5v1, types: [oz40] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, zy11] */
    /* JADX WARN: Type inference failed for: r6v0, types: [tls] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(oz40 oz40Var, tls tlsVar, ContinuationImpl continuationImpl) {
        LazyListScrollKt$withAutoScrollingFlag$1 lazyListScrollKt$withAutoScrollingFlag$1;
        int i;
        oz40 oz40Var2;
        try {
            if (continuationImpl instanceof LazyListScrollKt$withAutoScrollingFlag$1) {
                lazyListScrollKt$withAutoScrollingFlag$1 = (LazyListScrollKt$withAutoScrollingFlag$1) continuationImpl;
                int i2 = lazyListScrollKt$withAutoScrollingFlag$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    lazyListScrollKt$withAutoScrollingFlag$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = lazyListScrollKt$withAutoScrollingFlag$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = lazyListScrollKt$withAutoScrollingFlag$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        oz40Var.setValue(Boolean.TRUE);
                        lazyListScrollKt$withAutoScrollingFlag$1.L$0 = oz40Var;
                        lazyListScrollKt$withAutoScrollingFlag$1.L$1 = null;
                        lazyListScrollKt$withAutoScrollingFlag$1.label = 1;
                        oz40Var2 = oz40Var;
                        if (tlsVar.invoke(lazyListScrollKt$withAutoScrollingFlag$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        oz40 oz40Var3 = (oz40) lazyListScrollKt$withAutoScrollingFlag$1.L$0;
                        kotlin.b.b(obj);
                        oz40Var2 = oz40Var3;
                    }
                    oz40Var2.setValue(Boolean.FALSE);
                    oz40Var = zy11.a;
                    return oz40Var;
                }
            }
            if (i != 0) {
            }
            oz40Var2.setValue(Boolean.FALSE);
            oz40Var = zy11.a;
            return oz40Var;
        } catch (Throwable th) {
            oz40Var.setValue(Boolean.FALSE);
            throw th;
        }
        lazyListScrollKt$withAutoScrollingFlag$1 = new LazyListScrollKt$withAutoScrollingFlag$1(continuationImpl);
        Object obj2 = lazyListScrollKt$withAutoScrollingFlag$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lazyListScrollKt$withAutoScrollingFlag$1.label;
    }

    public static final float h(int i, androidx.compose.foundation.lazy.b bVar) {
        Object obj;
        Iterator it = bVar.j().k.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((t6y) ((n6y) obj)).a == i) {
                break;
            }
        }
        n6y n6yVar = (n6y) obj;
        if (n6yVar == null) {
            return 0.0f;
        }
        s6y j = bVar.j();
        t6y t6yVar = (t6y) n6yVar;
        return ((t6yVar.p / 2.0f) + t6yVar.o) - (((((int) (j.e() >> 32)) - (-j.l)) - j.p) / 2.0f);
    }

    public static final Object i(androidx.compose.foundation.lazy.b bVar, int i, int i2, Continuation continuation) {
        return (i < 0 || i >= bVar.j().n || ((int) (bVar.j().e() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) <= 0) ? zy11.a : bVar.f(i, i2, continuation);
    }
}
