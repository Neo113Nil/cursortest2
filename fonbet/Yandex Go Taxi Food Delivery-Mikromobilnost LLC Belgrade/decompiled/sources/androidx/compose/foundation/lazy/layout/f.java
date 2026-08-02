package androidx.compose.foundation.lazy.layout;

import defpackage.b92;
import defpackage.fwi;
import defpackage.kj2;
import defpackage.lxv;
import defpackage.ny61;
import defpackage.tls;
import defpackage.uh6;
import defpackage.y6y;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes10.dex */
public abstract class f {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ed A[Catch: ItemFoundInScroll -> 0x01ca, TRY_ENTER, TRY_LEAVE, TryCatch #3 {ItemFoundInScroll -> 0x01ca, blocks: (B:26:0x00cf, B:33:0x00ed, B:41:0x0117, B:43:0x0131, B:46:0x0146, B:49:0x014e), top: B:25:0x00cf }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r10v0, types: [T, kj2] */
    /* JADX WARN: Type inference failed for: r10v16, types: [T, kj2] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v4, types: [boolean] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x019e -> B:21:0x01a9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(y6y y6yVar, int i, int i2, int i3, fwi fwiVar, ContinuationImpl continuationImpl) {
        LazyLayoutScrollScopeKt$animateScrollToItem$1 lazyLayoutScrollScopeKt$animateScrollToItem$1;
        CoroutineSingletons coroutineSingletons;
        int i4;
        ?? r9;
        int i5;
        int i6;
        LazyLayoutScrollScopeKt$animateScrollToItem$1 lazyLayoutScrollScopeKt$animateScrollToItem$12;
        y6y y6yVar2;
        float w0;
        float w02;
        float w03;
        Ref$BooleanRef ref$BooleanRef;
        Ref$ObjectRef ref$ObjectRef;
        y6y y6yVar3;
        final int i7;
        final int i8;
        final Ref$IntRef ref$IntRef;
        float f;
        float f2;
        int i9;
        kj2 l;
        Float f3;
        boolean z;
        b92 b92Var;
        y6y y6yVar4;
        int i10;
        int i11;
        final float f4;
        LazyLayoutScrollScopeKt$animateScrollToItem$1 lazyLayoutScrollScopeKt$animateScrollToItem$13;
        int i12;
        float f5;
        final int i13;
        final float f6;
        final Ref$BooleanRef ref$BooleanRef2;
        final Ref$ObjectRef ref$ObjectRef2;
        final y6y y6yVar5;
        Ref$IntRef ref$IntRef2;
        int i14;
        int i15;
        int i16 = i;
        if (continuationImpl instanceof LazyLayoutScrollScopeKt$animateScrollToItem$1) {
            lazyLayoutScrollScopeKt$animateScrollToItem$1 = (LazyLayoutScrollScopeKt$animateScrollToItem$1) continuationImpl;
            int i17 = lazyLayoutScrollScopeKt$animateScrollToItem$1.label;
            if ((i17 & Integer.MIN_VALUE) != 0) {
                lazyLayoutScrollScopeKt$animateScrollToItem$1.label = i17 - Integer.MIN_VALUE;
                Object obj = lazyLayoutScrollScopeKt$animateScrollToItem$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i4 = lazyLayoutScrollScopeKt$animateScrollToItem$1.label;
                float f7 = 0.0f;
                boolean z2 = true;
                if (i4 != 0) {
                    kotlin.b.b(obj);
                    if (i16 < 0.0f) {
                        lxv.a("Index should be non-negative");
                    }
                    try {
                        w0 = fwiVar.w0(2500.0f);
                        w02 = fwiVar.w0(1500.0f);
                        w03 = fwiVar.w0(50.0f);
                        ref$BooleanRef = new Ref$BooleanRef();
                        ref$BooleanRef.element = true;
                        ref$ObjectRef = new Ref$ObjectRef();
                        ref$ObjectRef.element = uh6.a(0.0f, 0.0f, 30);
                        r9 = c(y6yVar, i);
                        try {
                        } catch (ItemFoundInScroll e) {
                            e = e;
                            i5 = i2;
                            i6 = i16;
                            lazyLayoutScrollScopeKt$animateScrollToItem$12 = lazyLayoutScrollScopeKt$animateScrollToItem$1;
                            y6yVar2 = r9;
                            l = uh6.l(e.getPreviousAnimation(), 0.0f, 0.0f, 30);
                            float itemOffset = e.getItemOffset() + i5;
                            Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
                            f3 = new Float(itemOffset);
                            if (((Number) l.e()).floatValue() == 0.0f) {
                            }
                            b92Var = new b92(itemOffset, ref$FloatRef, y6yVar2, 1);
                            lazyLayoutScrollScopeKt$animateScrollToItem$12.L$0 = y6yVar2;
                            lazyLayoutScrollScopeKt$animateScrollToItem$12.L$1 = null;
                            lazyLayoutScrollScopeKt$animateScrollToItem$12.L$2 = null;
                            lazyLayoutScrollScopeKt$animateScrollToItem$12.L$3 = null;
                            lazyLayoutScrollScopeKt$animateScrollToItem$12.I$0 = i6;
                            lazyLayoutScrollScopeKt$animateScrollToItem$12.I$1 = i5;
                            lazyLayoutScrollScopeKt$animateScrollToItem$12.label = 2;
                            if (androidx.compose.animation.core.e.f(l, f3, null, !z, b92Var, lazyLayoutScrollScopeKt$animateScrollToItem$12, 2) != coroutineSingletons) {
                            }
                            return coroutineSingletons;
                        }
                    } catch (ItemFoundInScroll e2) {
                        e = e2;
                        r9 = y6yVar;
                    }
                    if (r9 != 0) {
                        throw new ItemFoundInScroll(y6yVar.b(i), (kj2) ref$ObjectRef.element);
                    }
                    y6yVar3 = y6yVar;
                    int i18 = i16 > ((androidx.compose.foundation.lazy.b) y6yVar3.c).h() ? 1 : 0;
                    Ref$IntRef ref$IntRef3 = new Ref$IntRef();
                    ref$IntRef3.element = 1;
                    i7 = i2;
                    i8 = i3;
                    ref$IntRef = ref$IntRef3;
                    f = w0;
                    f2 = w03;
                    i9 = i18;
                    f4 = w02;
                    if (ref$BooleanRef.element) {
                    }
                    return zy11.a;
                }
                if (i4 != 1) {
                    if (i4 != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i10 = lazyLayoutScrollScopeKt$animateScrollToItem$1.I$1;
                    i11 = lazyLayoutScrollScopeKt$animateScrollToItem$1.I$0;
                    y6yVar4 = (y6y) lazyLayoutScrollScopeKt$animateScrollToItem$1.L$0;
                    kotlin.b.b(obj);
                    y6yVar4.f(i11, i10);
                    return zy11.a;
                }
                i9 = lazyLayoutScrollScopeKt$animateScrollToItem$1.I$3;
                float f8 = lazyLayoutScrollScopeKt$animateScrollToItem$1.F$2;
                w02 = lazyLayoutScrollScopeKt$animateScrollToItem$1.F$1;
                f = lazyLayoutScrollScopeKt$animateScrollToItem$1.F$0;
                int i19 = lazyLayoutScrollScopeKt$animateScrollToItem$1.I$2;
                int i20 = lazyLayoutScrollScopeKt$animateScrollToItem$1.I$1;
                i6 = lazyLayoutScrollScopeKt$animateScrollToItem$1.I$0;
                Ref$IntRef ref$IntRef4 = (Ref$IntRef) lazyLayoutScrollScopeKt$animateScrollToItem$1.L$3;
                ref$ObjectRef = (Ref$ObjectRef) lazyLayoutScrollScopeKt$animateScrollToItem$1.L$2;
                Ref$BooleanRef ref$BooleanRef3 = (Ref$BooleanRef) lazyLayoutScrollScopeKt$animateScrollToItem$1.L$1;
                y6yVar2 = (y6y) lazyLayoutScrollScopeKt$animateScrollToItem$1.L$0;
                try {
                    kotlin.b.b(obj);
                    y6yVar3 = y6yVar2;
                    ref$BooleanRef = ref$BooleanRef3;
                    f2 = f8;
                    i15 = 1;
                    i8 = i19;
                    i7 = i20;
                    try {
                        try {
                            ref$IntRef4.element += i15;
                            ref$IntRef = ref$IntRef4;
                            i16 = i6;
                            f7 = 0.0f;
                            z2 = true;
                        } catch (ItemFoundInScroll e3) {
                            e = e3;
                            lazyLayoutScrollScopeKt$animateScrollToItem$12 = lazyLayoutScrollScopeKt$animateScrollToItem$1;
                            y6yVar2 = y6yVar3;
                            i5 = i7;
                            l = uh6.l(e.getPreviousAnimation(), 0.0f, 0.0f, 30);
                            float itemOffset2 = e.getItemOffset() + i5;
                            Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
                            f3 = new Float(itemOffset2);
                            if (((Number) l.e()).floatValue() == 0.0f) {
                            }
                            b92Var = new b92(itemOffset2, ref$FloatRef2, y6yVar2, 1);
                            lazyLayoutScrollScopeKt$animateScrollToItem$12.L$0 = y6yVar2;
                            lazyLayoutScrollScopeKt$animateScrollToItem$12.L$1 = null;
                            lazyLayoutScrollScopeKt$animateScrollToItem$12.L$2 = null;
                            lazyLayoutScrollScopeKt$animateScrollToItem$12.L$3 = null;
                            lazyLayoutScrollScopeKt$animateScrollToItem$12.I$0 = i6;
                            lazyLayoutScrollScopeKt$animateScrollToItem$12.I$1 = i5;
                            lazyLayoutScrollScopeKt$animateScrollToItem$12.label = 2;
                            if (androidx.compose.animation.core.e.f(l, f3, null, !z, b92Var, lazyLayoutScrollScopeKt$animateScrollToItem$12, 2) != coroutineSingletons) {
                            }
                            return coroutineSingletons;
                        }
                    } catch (ItemFoundInScroll e4) {
                        e = e4;
                        i6 = i16;
                        lazyLayoutScrollScopeKt$animateScrollToItem$13 = lazyLayoutScrollScopeKt$animateScrollToItem$1;
                        y6yVar2 = y6yVar3;
                    }
                    f4 = w02;
                } catch (ItemFoundInScroll e5) {
                    e = e5;
                    lazyLayoutScrollScopeKt$animateScrollToItem$12 = lazyLayoutScrollScopeKt$animateScrollToItem$1;
                    i5 = i20;
                }
                if (ref$BooleanRef.element) {
                    try {
                    } catch (ItemFoundInScroll e6) {
                        e = e6;
                        i6 = i16;
                        lazyLayoutScrollScopeKt$animateScrollToItem$13 = lazyLayoutScrollScopeKt$animateScrollToItem$1;
                        y6yVar2 = y6yVar3;
                    }
                    switch (y6yVar3.a) {
                        case 0:
                            i12 = ((androidx.compose.foundation.lazy.b) y6yVar3.c).j().n;
                            if (i12 > 0) {
                                try {
                                    try {
                                        try {
                                            int b = y6yVar3.b(i16) + i7;
                                            if (Math.abs(b) >= f) {
                                                f5 = i9 != 0 ? f : -f;
                                            } else {
                                                try {
                                                    f5 = Math.max(Math.abs(b), f2);
                                                    if (i9 == 0) {
                                                        f5 = -f5;
                                                    }
                                                } catch (ItemFoundInScroll e7) {
                                                    e = e7;
                                                    i6 = i16;
                                                    lazyLayoutScrollScopeKt$animateScrollToItem$12 = lazyLayoutScrollScopeKt$animateScrollToItem$1;
                                                    y6yVar2 = y6yVar3;
                                                    i5 = i7;
                                                    l = uh6.l(e.getPreviousAnimation(), 0.0f, 0.0f, 30);
                                                    float itemOffset22 = e.getItemOffset() + i5;
                                                    Ref$FloatRef ref$FloatRef22 = new Ref$FloatRef();
                                                    f3 = new Float(itemOffset22);
                                                    if (((Number) l.e()).floatValue() == 0.0f) {
                                                    }
                                                    b92Var = new b92(itemOffset22, ref$FloatRef22, y6yVar2, 1);
                                                    lazyLayoutScrollScopeKt$animateScrollToItem$12.L$0 = y6yVar2;
                                                    lazyLayoutScrollScopeKt$animateScrollToItem$12.L$1 = null;
                                                    lazyLayoutScrollScopeKt$animateScrollToItem$12.L$2 = null;
                                                    lazyLayoutScrollScopeKt$animateScrollToItem$12.L$3 = null;
                                                    lazyLayoutScrollScopeKt$animateScrollToItem$12.I$0 = i6;
                                                    lazyLayoutScrollScopeKt$animateScrollToItem$12.I$1 = i5;
                                                    lazyLayoutScrollScopeKt$animateScrollToItem$12.label = 2;
                                                    if (androidx.compose.animation.core.e.f(l, f3, null, !z, b92Var, lazyLayoutScrollScopeKt$animateScrollToItem$12, 2) != coroutineSingletons) {
                                                    }
                                                    return coroutineSingletons;
                                                }
                                            }
                                            ref$ObjectRef.element = uh6.l((kj2) ref$ObjectRef.element, f7, f7, 30);
                                            final Ref$FloatRef ref$FloatRef3 = new Ref$FloatRef();
                                            kj2 kj2Var = (kj2) ref$ObjectRef.element;
                                            Float f9 = new Float(f5);
                                            boolean z3 = (((Number) ((kj2) ref$ObjectRef.element).e()).floatValue() == f7 ? z2 : false) ^ z2;
                                            final boolean z4 = i9 != 0 ? z2 : false;
                                            tls tlsVar = new tls() { // from class: androidx.compose.foundation.lazy.layout.e
                                                /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                                                    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v24 float, still in use, count: 2, list:
                                                      (r2v24 float) from 0x002d: PHI (r2v20 float) = (r2v7 float), (r2v24 float) binds: [B:36:0x003d, B:6:0x002a] A[DONT_GENERATE, DONT_INLINE]
                                                      (r2v24 float) from 0x0028: CMP_L (r2v24 float), (r8v0 float) A[WRAPPED]
                                                    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
                                                    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
                                                    	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
                                                    	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
                                                    	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
                                                    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
                                                    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
                                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                                    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
                                                    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
                                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                                    	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
                                                    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
                                                    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
                                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                                    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
                                                    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
                                                    	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
                                                    	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
                                                    	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
                                                    */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                @Override // defpackage.tls
                                                public final java.lang.Object invoke(java.lang.Object r12) {
                                                    /*
                                                        r11 = this;
                                                        xi2 r12 = (defpackage.xi2) r12
                                                        y6y r0 = defpackage.y6y.this
                                                        int r1 = r2
                                                        boolean r2 = androidx.compose.foundation.lazy.layout.f.c(r0, r1)
                                                        kotlin.jvm.internal.Ref$BooleanRef r3 = r5
                                                        boolean r4 = r6
                                                        int r5 = r10
                                                        zy11 r6 = defpackage.zy11.a
                                                        r7 = 0
                                                        if (r2 != 0) goto Lb7
                                                        r2 = 0
                                                        float r8 = r3
                                                        int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                                                        if (r2 <= 0) goto L2f
                                                        oz40 r2 = r12.e
                                                        java.lang.Object r2 = r2.getValue()
                                                        java.lang.Number r2 = (java.lang.Number) r2
                                                        float r2 = r2.floatValue()
                                                        int r9 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
                                                        if (r9 <= 0) goto L2d
                                                        goto L3f
                                                    L2d:
                                                        r8 = r2
                                                        goto L3f
                                                    L2f:
                                                        oz40 r2 = r12.e
                                                        java.lang.Object r2 = r2.getValue()
                                                        java.lang.Number r2 = (java.lang.Number) r2
                                                        float r2 = r2.floatValue()
                                                        int r9 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
                                                        if (r9 >= 0) goto L2d
                                                    L3f:
                                                        kotlin.jvm.internal.Ref$FloatRef r2 = r4
                                                        float r9 = r2.element
                                                        float r8 = r8 - r9
                                                        float r9 = r0.a(r8)
                                                        boolean r10 = androidx.compose.foundation.lazy.layout.f.c(r0, r1)
                                                        if (r10 == 0) goto L4f
                                                        goto Lb7
                                                    L4f:
                                                        boolean r10 = androidx.compose.foundation.lazy.layout.f.b(r4, r0, r1, r5)
                                                        if (r10 != 0) goto Lb7
                                                        int r9 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
                                                        if (r9 != 0) goto Lb1
                                                        float r9 = r2.element
                                                        float r9 = r9 + r8
                                                        r2.element = r9
                                                        float r2 = r7
                                                        if (r4 == 0) goto L76
                                                        oz40 r8 = r12.e
                                                        java.lang.Object r8 = r8.getValue()
                                                        java.lang.Number r8 = (java.lang.Number) r8
                                                        float r8 = r8.floatValue()
                                                        int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                                                        if (r2 <= 0) goto L8a
                                                        r12.a()
                                                        goto L8a
                                                    L76:
                                                        oz40 r8 = r12.e
                                                        java.lang.Object r8 = r8.getValue()
                                                        java.lang.Number r8 = (java.lang.Number) r8
                                                        float r8 = r8.floatValue()
                                                        float r2 = -r2
                                                        int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                                                        if (r2 >= 0) goto L8a
                                                        r12.a()
                                                    L8a:
                                                        kotlin.jvm.internal.Ref$IntRef r2 = r8
                                                        int r2 = r2.element
                                                        int r8 = r9
                                                        r9 = 2
                                                        if (r4 == 0) goto La3
                                                        if (r2 < r9) goto Lb7
                                                        int r2 = r0.e()
                                                        int r2 = r1 - r2
                                                        if (r2 <= r8) goto Lb7
                                                        int r2 = r1 - r8
                                                        r0.f(r2, r7)
                                                        goto Lb7
                                                    La3:
                                                        if (r2 < r9) goto Lb7
                                                        int r2 = r0.c()
                                                        int r2 = r2 - r1
                                                        if (r2 <= r8) goto Lb7
                                                        int r8 = r8 + r1
                                                        r0.f(r8, r7)
                                                        goto Lb7
                                                    Lb1:
                                                        r12.a()
                                                        r3.element = r7
                                                        return r6
                                                    Lb7:
                                                        boolean r2 = androidx.compose.foundation.lazy.layout.f.b(r4, r0, r1, r5)
                                                        if (r2 == 0) goto Lc6
                                                        r0.f(r1, r5)
                                                        r3.element = r7
                                                        r12.a()
                                                        return r6
                                                    Lc6:
                                                        boolean r12 = androidx.compose.foundation.lazy.layout.f.c(r0, r1)
                                                        if (r12 != 0) goto Lcd
                                                        return r6
                                                    Lcd:
                                                        int r12 = r0.b(r1)
                                                        androidx.compose.foundation.lazy.layout.ItemFoundInScroll r0 = new androidx.compose.foundation.lazy.layout.ItemFoundInScroll
                                                        kotlin.jvm.internal.Ref$ObjectRef r11 = r11
                                                        T r11 = r11.element
                                                        kj2 r11 = (defpackage.kj2) r11
                                                        r0.<init>(r12, r11)
                                                        throw r0
                                                    */
                                                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.e.invoke(java.lang.Object):java.lang.Object");
                                                }
                                            };
                                            lazyLayoutScrollScopeKt$animateScrollToItem$1.L$0 = y6yVar2;
                                            lazyLayoutScrollScopeKt$animateScrollToItem$1.L$1 = ref$BooleanRef2;
                                            lazyLayoutScrollScopeKt$animateScrollToItem$1.L$2 = ref$ObjectRef;
                                            lazyLayoutScrollScopeKt$animateScrollToItem$1.L$3 = ref$IntRef2;
                                            lazyLayoutScrollScopeKt$animateScrollToItem$1.I$0 = i6;
                                            lazyLayoutScrollScopeKt$animateScrollToItem$1.I$1 = i5;
                                            lazyLayoutScrollScopeKt$animateScrollToItem$1.I$2 = i14;
                                            lazyLayoutScrollScopeKt$animateScrollToItem$1.F$0 = f;
                                            lazyLayoutScrollScopeKt$animateScrollToItem$1.F$1 = w02;
                                            lazyLayoutScrollScopeKt$animateScrollToItem$1.F$2 = f2;
                                            lazyLayoutScrollScopeKt$animateScrollToItem$1.I$3 = i9;
                                            i15 = 1;
                                            lazyLayoutScrollScopeKt$animateScrollToItem$1.label = 1;
                                            if (androidx.compose.animation.core.e.f(kj2Var, f9, null, z3, tlsVar, lazyLayoutScrollScopeKt$animateScrollToItem$13, 2) != coroutineSingletons) {
                                                y6yVar3 = y6yVar2;
                                                ref$BooleanRef = ref$BooleanRef2;
                                                i7 = i5;
                                                lazyLayoutScrollScopeKt$animateScrollToItem$1 = lazyLayoutScrollScopeKt$animateScrollToItem$13;
                                                ref$IntRef4 = ref$IntRef2;
                                                i8 = i14;
                                                ref$IntRef4.element += i15;
                                                ref$IntRef = ref$IntRef4;
                                                i16 = i6;
                                                f7 = 0.0f;
                                                z2 = true;
                                                f4 = w02;
                                                if (ref$BooleanRef.element) {
                                                }
                                            }
                                        } catch (ItemFoundInScroll e8) {
                                            e = e8;
                                            lazyLayoutScrollScopeKt$animateScrollToItem$12 = lazyLayoutScrollScopeKt$animateScrollToItem$13;
                                            l = uh6.l(e.getPreviousAnimation(), 0.0f, 0.0f, 30);
                                            float itemOffset222 = e.getItemOffset() + i5;
                                            Ref$FloatRef ref$FloatRef222 = new Ref$FloatRef();
                                            f3 = new Float(itemOffset222);
                                            if (((Number) l.e()).floatValue() == 0.0f) {
                                            }
                                            b92Var = new b92(itemOffset222, ref$FloatRef222, y6yVar2, 1);
                                            lazyLayoutScrollScopeKt$animateScrollToItem$12.L$0 = y6yVar2;
                                            lazyLayoutScrollScopeKt$animateScrollToItem$12.L$1 = null;
                                            lazyLayoutScrollScopeKt$animateScrollToItem$12.L$2 = null;
                                            lazyLayoutScrollScopeKt$animateScrollToItem$12.L$3 = null;
                                            lazyLayoutScrollScopeKt$animateScrollToItem$12.I$0 = i6;
                                            lazyLayoutScrollScopeKt$animateScrollToItem$12.I$1 = i5;
                                            lazyLayoutScrollScopeKt$animateScrollToItem$12.label = 2;
                                            if (androidx.compose.animation.core.e.f(l, f3, null, !z, b92Var, lazyLayoutScrollScopeKt$animateScrollToItem$12, 2) != coroutineSingletons) {
                                            }
                                            return coroutineSingletons;
                                        }
                                        lazyLayoutScrollScopeKt$animateScrollToItem$13 = lazyLayoutScrollScopeKt$animateScrollToItem$1;
                                    } catch (ItemFoundInScroll e9) {
                                        e = e9;
                                        lazyLayoutScrollScopeKt$animateScrollToItem$13 = lazyLayoutScrollScopeKt$animateScrollToItem$1;
                                    }
                                    y6yVar2 = y6yVar5;
                                    i6 = i13;
                                    w02 = f4;
                                    ref$IntRef2 = ref$IntRef;
                                    i14 = i8;
                                    i5 = i7;
                                    ref$ObjectRef = ref$ObjectRef2;
                                } catch (ItemFoundInScroll e10) {
                                    e = e10;
                                    lazyLayoutScrollScopeKt$animateScrollToItem$13 = lazyLayoutScrollScopeKt$animateScrollToItem$1;
                                    y6yVar2 = y6yVar5;
                                    i6 = i13;
                                    i5 = i7;
                                    lazyLayoutScrollScopeKt$animateScrollToItem$12 = lazyLayoutScrollScopeKt$animateScrollToItem$13;
                                    l = uh6.l(e.getPreviousAnimation(), 0.0f, 0.0f, 30);
                                    float itemOffset2222 = e.getItemOffset() + i5;
                                    Ref$FloatRef ref$FloatRef2222 = new Ref$FloatRef();
                                    f3 = new Float(itemOffset2222);
                                    if (((Number) l.e()).floatValue() == 0.0f) {
                                    }
                                    b92Var = new b92(itemOffset2222, ref$FloatRef2222, y6yVar2, 1);
                                    lazyLayoutScrollScopeKt$animateScrollToItem$12.L$0 = y6yVar2;
                                    lazyLayoutScrollScopeKt$animateScrollToItem$12.L$1 = null;
                                    lazyLayoutScrollScopeKt$animateScrollToItem$12.L$2 = null;
                                    lazyLayoutScrollScopeKt$animateScrollToItem$12.L$3 = null;
                                    lazyLayoutScrollScopeKt$animateScrollToItem$12.I$0 = i6;
                                    lazyLayoutScrollScopeKt$animateScrollToItem$12.I$1 = i5;
                                    lazyLayoutScrollScopeKt$animateScrollToItem$12.label = 2;
                                    if (androidx.compose.animation.core.e.f(l, f3, null, !z, b92Var, lazyLayoutScrollScopeKt$animateScrollToItem$12, 2) != coroutineSingletons) {
                                    }
                                    return coroutineSingletons;
                                }
                                i13 = i16;
                                f6 = f5;
                                ref$BooleanRef2 = ref$BooleanRef;
                                ref$ObjectRef2 = ref$ObjectRef;
                                y6yVar5 = y6yVar3;
                                return coroutineSingletons;
                            }
                            break;
                        default:
                            i12 = ((androidx.compose.foundation.pager.d) y6yVar3.c).o();
                            if (i12 > 0) {
                            }
                            break;
                    }
                }
                return zy11.a;
                l = uh6.l(e.getPreviousAnimation(), 0.0f, 0.0f, 30);
                float itemOffset22222 = e.getItemOffset() + i5;
                Ref$FloatRef ref$FloatRef22222 = new Ref$FloatRef();
                f3 = new Float(itemOffset22222);
                z = ((Number) l.e()).floatValue() == 0.0f;
                b92Var = new b92(itemOffset22222, ref$FloatRef22222, y6yVar2, 1);
                lazyLayoutScrollScopeKt$animateScrollToItem$12.L$0 = y6yVar2;
                lazyLayoutScrollScopeKt$animateScrollToItem$12.L$1 = null;
                lazyLayoutScrollScopeKt$animateScrollToItem$12.L$2 = null;
                lazyLayoutScrollScopeKt$animateScrollToItem$12.L$3 = null;
                lazyLayoutScrollScopeKt$animateScrollToItem$12.I$0 = i6;
                lazyLayoutScrollScopeKt$animateScrollToItem$12.I$1 = i5;
                lazyLayoutScrollScopeKt$animateScrollToItem$12.label = 2;
                if (androidx.compose.animation.core.e.f(l, f3, null, !z, b92Var, lazyLayoutScrollScopeKt$animateScrollToItem$12, 2) != coroutineSingletons) {
                    y6yVar4 = y6yVar2;
                    i10 = i5;
                    i11 = i6;
                    y6yVar4.f(i11, i10);
                    return zy11.a;
                }
                return coroutineSingletons;
            }
        }
        lazyLayoutScrollScopeKt$animateScrollToItem$1 = new LazyLayoutScrollScopeKt$animateScrollToItem$1(continuationImpl);
        Object obj2 = lazyLayoutScrollScopeKt$animateScrollToItem$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i4 = lazyLayoutScrollScopeKt$animateScrollToItem$1.label;
        float f72 = 0.0f;
        boolean z22 = true;
        if (i4 != 0) {
        }
        l = uh6.l(e.getPreviousAnimation(), 0.0f, 0.0f, 30);
        float itemOffset222222 = e.getItemOffset() + i5;
        Ref$FloatRef ref$FloatRef222222 = new Ref$FloatRef();
        f3 = new Float(itemOffset222222);
        if (((Number) l.e()).floatValue() == 0.0f) {
        }
        b92Var = new b92(itemOffset222222, ref$FloatRef222222, y6yVar2, 1);
        lazyLayoutScrollScopeKt$animateScrollToItem$12.L$0 = y6yVar2;
        lazyLayoutScrollScopeKt$animateScrollToItem$12.L$1 = null;
        lazyLayoutScrollScopeKt$animateScrollToItem$12.L$2 = null;
        lazyLayoutScrollScopeKt$animateScrollToItem$12.L$3 = null;
        lazyLayoutScrollScopeKt$animateScrollToItem$12.I$0 = i6;
        lazyLayoutScrollScopeKt$animateScrollToItem$12.I$1 = i5;
        lazyLayoutScrollScopeKt$animateScrollToItem$12.label = 2;
        if (androidx.compose.animation.core.e.f(l, f3, null, !z, b92Var, lazyLayoutScrollScopeKt$animateScrollToItem$12, 2) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    public static final boolean b(boolean z, y6y y6yVar, int i, int i2) {
        if (z) {
            if (y6yVar.c() > i) {
                return true;
            }
            return y6yVar.c() == i && y6yVar.d() > i2;
        }
        if (y6yVar.c() < i) {
            return true;
        }
        return y6yVar.c() == i && y6yVar.d() < i2;
    }

    public static final boolean c(y6y y6yVar, int i) {
        return i <= y6yVar.e() && y6yVar.c() <= i;
    }
}
