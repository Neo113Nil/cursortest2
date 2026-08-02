package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: LazyLayoutScrollScope.kt */
/* loaded from: classes11.dex */
public final class kuy {
    public static final float a = 2500;
    public static final float b = 1500;
    public static final float c = 50;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d4 A[Catch: jux -> 0x01bb, TryCatch #4 {jux -> 0x01bb, blocks: (B:26:0x00d0, B:28:0x00d4, B:30:0x00da, B:38:0x0104, B:41:0x0133, B:44:0x013b), top: B:25:0x00d0 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0077  */
    /* JADX WARN: Type inference failed for: r11v0, types: [T, xsna.kq2] */
    /* JADX WARN: Type inference failed for: r12v6, types: [T, xsna.kq2] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x018b -> B:21:0x006c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(guy guyVar, int i, int i2, int i3, azl azlVar, ContinuationImpl continuationImpl) {
        juy juyVar;
        CoroutineSingletons coroutineSingletons;
        int i4;
        final guy guyVar2;
        int i5;
        int i6;
        float I0;
        float I02;
        float I03;
        Ref$BooleanRef ref$BooleanRef;
        Ref$ObjectRef ref$ObjectRef;
        final int i7;
        final int i8;
        final float f;
        final Ref$IntRef ref$IntRef;
        float f2;
        juy juyVar2;
        float f3;
        int i9;
        int i10;
        guy guyVar3;
        juy juyVar3;
        kq2 c2;
        Float f4;
        boolean z;
        izs izsVar;
        guy guyVar4;
        int i11;
        int i12;
        juy juyVar4;
        float f5;
        final guy guyVar5;
        final int i13;
        int i14;
        float f6;
        int i15;
        if (continuationImpl instanceof juy) {
            juyVar = (juy) continuationImpl;
            int i16 = juyVar.label;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                juyVar.label = i16 - Integer.MIN_VALUE;
                Object obj = juyVar.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i4 = juyVar.label;
                float f7 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                boolean z2 = true;
                if (i4 != 0) {
                    kotlin.a.a(obj);
                    if (i < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        xzw.a("Index should be non-negative");
                    }
                    try {
                        I0 = azlVar.I0(a);
                        I02 = azlVar.I0(b);
                        I03 = azlVar.I0(c);
                        ref$BooleanRef = new Ref$BooleanRef();
                        ref$BooleanRef.element = true;
                        ref$ObjectRef = new Ref$ObjectRef();
                        ref$ObjectRef.element = s1v.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 30);
                    } catch (jux e) {
                        e = e;
                        guyVar2 = guyVar;
                        i5 = i2;
                        i6 = i;
                    }
                    if (c(guyVar, i)) {
                        throw new jux(guyVar.e(i), (kq2) ref$ObjectRef.element);
                    }
                    int i17 = i > guyVar.b() ? 1 : 0;
                    Ref$IntRef ref$IntRef2 = new Ref$IntRef();
                    ref$IntRef2.element = 1;
                    i7 = i2;
                    i8 = i3;
                    f = I02;
                    ref$IntRef = ref$IntRef2;
                    f2 = I0;
                    juyVar2 = juyVar;
                    f3 = I03;
                    i9 = i;
                    i10 = i17;
                    guyVar3 = guyVar;
                    if (ref$BooleanRef.element) {
                    }
                    return s3q0.a;
                }
                if (i4 != 1) {
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i12 = juyVar.I$1;
                    i11 = juyVar.I$0;
                    guyVar4 = (guy) juyVar.L$0;
                    kotlin.a.a(obj);
                    guyVar4.d(i11, i12);
                    return s3q0.a;
                }
                i10 = juyVar.I$3;
                float f8 = juyVar.F$2;
                float f9 = juyVar.F$1;
                f2 = juyVar.F$0;
                int i18 = juyVar.I$2;
                int i19 = juyVar.I$1;
                int i20 = juyVar.I$0;
                Ref$IntRef ref$IntRef3 = (Ref$IntRef) juyVar.L$3;
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) juyVar.L$2;
                Ref$BooleanRef ref$BooleanRef2 = (Ref$BooleanRef) juyVar.L$1;
                guy guyVar6 = (guy) juyVar.L$0;
                try {
                    kotlin.a.a(obj);
                    f6 = f9;
                    guyVar2 = guyVar6;
                    i7 = i19;
                    juyVar2 = juyVar;
                    f3 = f8;
                    i15 = 1;
                    i14 = i18;
                    try {
                        ref$BooleanRef = ref$BooleanRef2;
                        ref$ObjectRef = ref$ObjectRef2;
                        try {
                            ref$IntRef3.element += i15;
                        } catch (jux e2) {
                            e = e2;
                            juyVar3 = juyVar2;
                            i6 = i20;
                            i5 = i7;
                        }
                    } catch (jux e3) {
                        e = e3;
                        i6 = i9;
                        juyVar4 = juyVar2;
                        i5 = i7;
                        guyVar2 = guyVar3;
                    }
                    guyVar3 = guyVar2;
                    i9 = i20;
                    ref$IntRef = ref$IntRef3;
                    f = f6;
                    f7 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    i8 = i14;
                    z2 = true;
                } catch (jux e4) {
                    e = e4;
                    guyVar2 = guyVar6;
                    i5 = i19;
                    i6 = i20;
                }
                if (ref$BooleanRef.element && guyVar3.getItemCount() > 0) {
                    try {
                        try {
                            try {
                                int e5 = guyVar3.e(i9) + i7;
                                if (Math.abs(e5) >= f2) {
                                    f5 = i10 != 0 ? f2 : -f2;
                                } else {
                                    try {
                                        f5 = Math.max(Math.abs(e5), f3);
                                        if (i10 == 0) {
                                            f5 = -f5;
                                        }
                                    } catch (jux e6) {
                                        e = e6;
                                        i6 = i9;
                                        juyVar3 = juyVar2;
                                        i5 = i7;
                                        guyVar2 = guyVar3;
                                    }
                                }
                                ref$ObjectRef.element = s1v.c((kq2) ref$ObjectRef.element, f7, f7, 30);
                                final Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
                                kq2 kq2Var = (kq2) ref$ObjectRef.element;
                                Float f10 = new Float(f5);
                                boolean z3 = (((Number) ((kq2) ref$ObjectRef.element).c()).floatValue() != f7 ? z2 : false) ^ z2;
                                final boolean z4 = i10 == 0 ? z2 : false;
                                izs izsVar2 = new izs() { // from class: xsna.huy
                                    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                                        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v27 float, still in use, count: 2, list:
                                          (r2v27 float) from 0x002d: PHI (r2v22 float) = (r2v8 float), (r2v27 float) binds: [B:38:0x003f, B:6:0x002a] A[DONT_GENERATE, DONT_INLINE]
                                          (r2v27 float) from 0x0028: CMP_L (r2v27 float), (r7v0 float) A[WRAPPED] (LINE:41)
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
                                    @Override // xsna.izs
                                    public final java.lang.Object invoke(java.lang.Object r11) {
                                        /*
                                            Method dump skipped, instructions count: 236
                                            To view this dump add '--comments-level debug' option
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: xsna.huy.invoke(java.lang.Object):java.lang.Object");
                                    }
                                };
                                juyVar2.L$0 = guyVar2;
                                juyVar2.L$1 = ref$BooleanRef2;
                                juyVar2.L$2 = ref$ObjectRef2;
                                juyVar2.L$3 = ref$IntRef3;
                                juyVar2.I$0 = i6;
                                juyVar2.I$1 = i5;
                                juyVar2.I$2 = i14;
                                juyVar2.F$0 = f2;
                                juyVar2.F$1 = r1;
                                juyVar2.F$2 = f3;
                                juyVar2.I$3 = i10;
                                f6 = r1;
                                i15 = 1;
                                juyVar2.label = 1;
                                if (nkn0.f(kq2Var, f10, null, z3, izsVar2, juyVar4, 2) != coroutineSingletons) {
                                    i20 = i6;
                                    i7 = i5;
                                    juyVar2 = juyVar4;
                                    ref$BooleanRef = ref$BooleanRef2;
                                    ref$ObjectRef = ref$ObjectRef2;
                                    ref$IntRef3.element += i15;
                                    guyVar3 = guyVar2;
                                    i9 = i20;
                                    ref$IntRef = ref$IntRef3;
                                    f = f6;
                                    f7 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                    i8 = i14;
                                    z2 = true;
                                    if (ref$BooleanRef.element) {
                                        int e52 = guyVar3.e(i9) + i7;
                                        if (Math.abs(e52) >= f2) {
                                        }
                                        ref$ObjectRef.element = s1v.c((kq2) ref$ObjectRef.element, f7, f7, 30);
                                        final Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
                                        kq2 kq2Var2 = (kq2) ref$ObjectRef.element;
                                        Float f102 = new Float(f5);
                                        boolean z32 = (((Number) ((kq2) ref$ObjectRef.element).c()).floatValue() != f7 ? z2 : false) ^ z2;
                                        if (i10 == 0) {
                                        }
                                        guyVar5 = guyVar3;
                                        i13 = i9;
                                        final Ref$BooleanRef ref$BooleanRef3 = ref$BooleanRef;
                                        final Ref$ObjectRef ref$ObjectRef3 = ref$ObjectRef;
                                        final float f11 = f5;
                                        izs izsVar22 = new izs() { // from class: xsna.huy
                                            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                                                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v27 float, still in use, count: 2, list:
                                                  (r2v27 float) from 0x002d: PHI (r2v22 float) = (r2v8 float), (r2v27 float) binds: [B:38:0x003f, B:6:0x002a] A[DONT_GENERATE, DONT_INLINE]
                                                  (r2v27 float) from 0x0028: CMP_L (r2v27 float), (r7v0 float) A[WRAPPED] (LINE:41)
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
                                                */
                                            @Override // xsna.izs
                                            public final java.lang.Object invoke(java.lang.Object r11) {
                                                /*
                                                    Method dump skipped, instructions count: 236
                                                    To view this dump add '--comments-level debug' option
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: xsna.huy.invoke(java.lang.Object):java.lang.Object");
                                            }
                                        };
                                        guyVar2 = guyVar5;
                                        i6 = i13;
                                        ref$BooleanRef2 = ref$BooleanRef3;
                                        float f12 = f;
                                        ref$IntRef3 = ref$IntRef;
                                        i14 = i8;
                                        i5 = i7;
                                        ref$ObjectRef2 = ref$ObjectRef3;
                                        juyVar2.L$0 = guyVar2;
                                        juyVar2.L$1 = ref$BooleanRef2;
                                        juyVar2.L$2 = ref$ObjectRef2;
                                        juyVar2.L$3 = ref$IntRef3;
                                        juyVar2.I$0 = i6;
                                        juyVar2.I$1 = i5;
                                        juyVar2.I$2 = i14;
                                        juyVar2.F$0 = f2;
                                        juyVar2.F$1 = f12;
                                        juyVar2.F$2 = f3;
                                        juyVar2.I$3 = i10;
                                        f6 = f12;
                                        i15 = 1;
                                        juyVar2.label = 1;
                                        juyVar4 = juyVar2;
                                        if (nkn0.f(kq2Var2, f102, null, z32, izsVar22, juyVar4, 2) != coroutineSingletons) {
                                        }
                                    }
                                }
                            } catch (jux e7) {
                                e = e7;
                                juyVar3 = juyVar4;
                                c2 = s1v.c(e.g(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 30);
                                final float d = e.d() + i5;
                                final Ref$FloatRef ref$FloatRef3 = new Ref$FloatRef();
                                f4 = new Float(d);
                                if (((Number) c2.c()).floatValue() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                }
                                izsVar = new izs() { // from class: xsna.iuy
                                    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
                                    
                                        if (r1 < r0) goto L8;
                                     */
                                    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
                                    
                                        if (r1 > r0) goto L8;
                                     */
                                    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
                                    
                                        r0 = r1;
                                     */
                                    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
                                    
                                        r1 = r0;
                                     */
                                    @Override // xsna.izs
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                    */
                                    public final Object invoke(Object obj2) {
                                        float floatValue;
                                        gq2 gq2Var = (gq2) obj2;
                                        float f13 = d;
                                        float f14 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                        if (f13 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                            floatValue = ((Number) ((zak0) gq2Var.e).getValue()).floatValue();
                                        } else if (f13 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                            floatValue = ((Number) ((zak0) gq2Var.e).getValue()).floatValue();
                                        }
                                        Ref$FloatRef ref$FloatRef4 = ref$FloatRef3;
                                        float f15 = f14 - ref$FloatRef4.element;
                                        if (f15 != guyVar2.f(f15) || f14 != ((Number) ((zak0) gq2Var.e).getValue()).floatValue()) {
                                            gq2Var.a();
                                        }
                                        ref$FloatRef4.element += f15;
                                        return s3q0.a;
                                    }
                                };
                                juyVar3.L$0 = guyVar2;
                                juyVar3.L$1 = null;
                                juyVar3.L$2 = null;
                                juyVar3.L$3 = null;
                                juyVar3.I$0 = i6;
                                juyVar3.I$1 = i5;
                                juyVar3.label = 2;
                                if (nkn0.f(c2, f4, null, !z, izsVar, juyVar3, 2) != coroutineSingletons) {
                                }
                                return coroutineSingletons;
                            }
                            juyVar4 = juyVar2;
                        } catch (jux e8) {
                            e = e8;
                            juyVar4 = juyVar2;
                        }
                        guyVar2 = guyVar5;
                        i6 = i13;
                        ref$BooleanRef2 = ref$BooleanRef3;
                        float f122 = f;
                        ref$IntRef3 = ref$IntRef;
                        i14 = i8;
                        i5 = i7;
                        ref$ObjectRef2 = ref$ObjectRef3;
                    } catch (jux e9) {
                        e = e9;
                        juyVar4 = juyVar2;
                        guyVar2 = guyVar5;
                        i6 = i13;
                        i5 = i7;
                    }
                    guyVar5 = guyVar3;
                    i13 = i9;
                    final Ref$BooleanRef ref$BooleanRef32 = ref$BooleanRef;
                    final Ref$ObjectRef ref$ObjectRef32 = ref$ObjectRef;
                    final float f112 = f5;
                    return coroutineSingletons;
                }
                return s3q0.a;
                juyVar3 = juyVar;
                c2 = s1v.c(e.g(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 30);
                final float d2 = e.d() + i5;
                final Ref$FloatRef ref$FloatRef32 = new Ref$FloatRef();
                f4 = new Float(d2);
                z = ((Number) c2.c()).floatValue() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                izsVar = new izs() { // from class: xsna.iuy
                    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
                    
                        if (r1 < r0) goto L8;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
                    
                        if (r1 > r0) goto L8;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
                    
                        r0 = r1;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
                    
                        r1 = r0;
                     */
                    @Override // xsna.izs
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object invoke(Object obj2) {
                        float floatValue;
                        gq2 gq2Var = (gq2) obj2;
                        float f13 = d2;
                        float f14 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        if (f13 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            floatValue = ((Number) ((zak0) gq2Var.e).getValue()).floatValue();
                        } else if (f13 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            floatValue = ((Number) ((zak0) gq2Var.e).getValue()).floatValue();
                        }
                        Ref$FloatRef ref$FloatRef4 = ref$FloatRef32;
                        float f15 = f14 - ref$FloatRef4.element;
                        if (f15 != guyVar2.f(f15) || f14 != ((Number) ((zak0) gq2Var.e).getValue()).floatValue()) {
                            gq2Var.a();
                        }
                        ref$FloatRef4.element += f15;
                        return s3q0.a;
                    }
                };
                juyVar3.L$0 = guyVar2;
                juyVar3.L$1 = null;
                juyVar3.L$2 = null;
                juyVar3.L$3 = null;
                juyVar3.I$0 = i6;
                juyVar3.I$1 = i5;
                juyVar3.label = 2;
                if (nkn0.f(c2, f4, null, !z, izsVar, juyVar3, 2) != coroutineSingletons) {
                    guyVar4 = guyVar2;
                    i11 = i6;
                    i12 = i5;
                    guyVar4.d(i11, i12);
                    return s3q0.a;
                }
                return coroutineSingletons;
            }
        }
        juyVar = new juy(continuationImpl);
        Object obj2 = juyVar.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i4 = juyVar.label;
        float f72 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        boolean z22 = true;
        if (i4 != 0) {
        }
        juyVar3 = juyVar;
        c2 = s1v.c(e.g(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 30);
        final float d22 = e.d() + i5;
        final Ref$FloatRef ref$FloatRef322 = new Ref$FloatRef();
        f4 = new Float(d22);
        if (((Number) c2.c()).floatValue() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
        }
        izsVar = new izs() { // from class: xsna.iuy
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
            
                if (r1 < r0) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
            
                if (r1 > r0) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
            
                r0 = r1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
            
                r1 = r0;
             */
            @Override // xsna.izs
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj22) {
                float floatValue;
                gq2 gq2Var = (gq2) obj22;
                float f13 = d22;
                float f14 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (f13 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    floatValue = ((Number) ((zak0) gq2Var.e).getValue()).floatValue();
                } else if (f13 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    floatValue = ((Number) ((zak0) gq2Var.e).getValue()).floatValue();
                }
                Ref$FloatRef ref$FloatRef4 = ref$FloatRef322;
                float f15 = f14 - ref$FloatRef4.element;
                if (f15 != guyVar2.f(f15) || f14 != ((Number) ((zak0) gq2Var.e).getValue()).floatValue()) {
                    gq2Var.a();
                }
                ref$FloatRef4.element += f15;
                return s3q0.a;
            }
        };
        juyVar3.L$0 = guyVar2;
        juyVar3.L$1 = null;
        juyVar3.L$2 = null;
        juyVar3.L$3 = null;
        juyVar3.I$0 = i6;
        juyVar3.I$1 = i5;
        juyVar3.label = 2;
        if (nkn0.f(c2, f4, null, !z, izsVar, juyVar3, 2) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    public static final boolean b(boolean z, guy guyVar, int i, int i2) {
        if (z) {
            if (guyVar.b() > i) {
                return true;
            }
            return guyVar.b() == i && guyVar.a() > i2;
        }
        if (guyVar.b() < i) {
            return true;
        }
        return guyVar.b() == i && guyVar.a() < i2;
    }

    public static final boolean c(guy guyVar, int i) {
        return i <= guyVar.c() && guyVar.b() <= i;
    }
}
