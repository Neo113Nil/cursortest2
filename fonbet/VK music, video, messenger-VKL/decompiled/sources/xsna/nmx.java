package xsna;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.a;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.LayoutDirection;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$LongRef;
import xsna.a5x;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: InternalSlider.kt */
/* loaded from: classes17.dex */
public final class nmx {
    public static final float a;
    public static final float b;
    public static final q630 c = txj0.j(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48, 1, txj0.x(144, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630.a.a));
    public static final float d;

    static {
        float f = 8;
        a = f;
        b = f;
        nkk nkkVar = luo.a;
        d = ((float) 0.125d) / 18;
    }

    public static final void a(final izs izsVar, final bwf bwfVar, final awf awfVar, final wh50 wh50Var, final float f, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(-1177000274);
        int i2 = i | (M.y(izsVar) ? 4 : 2) | (M.J(bwfVar) ? 32 : 16) | (M.J(awfVar) ? 256 : 128) | (M.n(f) ? 16384 : 8192);
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1177000274, i2, -1, "com.vk.core.compose.component.internal.CorrectValueSideEffect (InternalSlider.kt:632)");
            }
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4) | ((57344 & i2) == 16384) | ((i2 & 896) == 256);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                gzs gzsVar = new gzs() { // from class: xsna.mlx
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // xsna.gzs
                    public final Object invoke() {
                        bwf bwfVar2 = bwf.this;
                        float floatValue = (((Number) bwfVar2.c()).floatValue() - ((Number) bwfVar2.getStart()).floatValue()) / 1000;
                        float floatValue2 = ((Number) izsVar.invoke(Float.valueOf(f))).floatValue();
                        wh50 wh50Var2 = wh50Var;
                        if (Math.abs(floatValue2 - ((Number) wh50Var2.getValue()).floatValue()) > floatValue) {
                            if (awfVar.b((Comparable) wh50Var2.getValue())) {
                                wh50Var2.setValue(Float.valueOf(floatValue2));
                            }
                        }
                        return s3q0.a;
                    }
                };
                M.R(gzsVar);
                x = gzsVar;
            }
            bap.i((gzs) x, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(bwfVar, awfVar, wh50Var, f, i) { // from class: xsna.nlx
                public final /* synthetic */ bwf c;
                public final /* synthetic */ awf d;
                public final /* synthetic */ wh50 e;
                public final /* synthetic */ float f;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(3073);
                    nmx.a(izs.this, this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final bwf bwfVar, final izs izsVar, final q630 q630Var, final boolean z, final bwf bwfVar2, final int i, final pml pmlVar, final float f, final float f2, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        q630 q630Var2;
        final boolean z2;
        bwf bwfVar3;
        final pml pmlVar2;
        final float f3;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1250577946);
        if ((i2 & 6) == 0) {
            i3 = (M.J(bwfVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 256 : 128;
        } else {
            q630Var2 = q630Var;
        }
        if ((i2 & 3072) == 0) {
            z2 = z;
            i3 |= M.l(z2) ? 2048 : 1024;
        } else {
            z2 = z;
        }
        if ((i2 & 24576) == 0) {
            bwfVar3 = bwfVar2;
            i3 |= M.J(bwfVar3) ? 16384 : 8192;
        } else {
            bwfVar3 = bwfVar2;
        }
        if ((196608 & i2) == 0) {
            i3 |= M.o(i) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= M.y(null) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i2) == 0) {
            pmlVar2 = pmlVar;
            i3 |= M.J(pmlVar2) ? 8388608 : 4194304;
        } else {
            pmlVar2 = pmlVar;
        }
        if ((100663296 & i2) == 0) {
            i3 |= M.n(f) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            f3 = f2;
            i3 |= M.n(f3) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        } else {
            f3 = f2;
        }
        if (M.t(i3 & 1, (i3 & 306783379) != 306783378)) {
            M.V();
            if ((i2 & 1) != 0 && !M.i()) {
                M.h();
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1250577946, i3, -1, "com.vk.core.compose.component.internal.InternalRangeSlider (InternalSlider.kt:213)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = ir.h(M);
            }
            final sg50 sg50Var = (sg50) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = ir.h(M);
            }
            final sg50 sg50Var2 = (sg50) x2;
            if (i < 0) {
                throw new IllegalArgumentException("steps should be >= 0");
            }
            final wh50 c2 = androidx.compose.runtime.k.c(izsVar, M, (i3 >> 3) & 14);
            boolean z3 = (i3 & 458752) == 131072;
            Object x3 = M.x();
            if (z3 || x3 == c0012a) {
                x3 = q(i);
                M.R(x3);
            }
            final List list = (List) x3;
            final bwf bwfVar4 = bwfVar3;
            aVar2 = M;
            ua8.a(txj0.o(q630Var2, f * 4, f * 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12), null, false, kai.c(-1108963632, new yzs() { // from class: xsna.vlx
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r17v5, types: [xsna.q630] */
                /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.runtime.a] */
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    List list2;
                    Ref$FloatRef ref$FloatRef;
                    Ref$FloatRef ref$FloatRef2;
                    final wh50 wh50Var;
                    bwf bwfVar5;
                    final bwf bwfVar6;
                    bwf bwfVar7;
                    float f4;
                    Object obj4;
                    q630.a aVar3;
                    boolean z4;
                    bwf bwfVar8;
                    q630.a aVar4;
                    va8 va8Var = (va8) obj;
                    ?? r7 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= r7.J(va8Var) ? 4 : 2;
                    }
                    if (r7.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1108963632, intValue, -1, "com.vk.core.compose.component.internal.InternalRangeSlider.<anonymous> (InternalSlider.kt:227)");
                        }
                        boolean z5 = r7.r(uvi.n) == LayoutDirection.Rtl;
                        float i4 = o6j.i(va8Var.f());
                        final Ref$FloatRef ref$FloatRef3 = new Ref$FloatRef();
                        final Ref$FloatRef ref$FloatRef4 = new Ref$FloatRef();
                        azl azlVar = (azl) r7.r(uvi.h);
                        float f5 = f;
                        ref$FloatRef3.element = i4 - azlVar.I0(f5);
                        ref$FloatRef4.element = azlVar.I0(f5);
                        s3q0 s3q0Var = s3q0.a;
                        Object x4 = r7.x();
                        final bwf bwfVar9 = bwf.this;
                        bwf bwfVar10 = bwfVar;
                        final List list3 = list;
                        Object obj5 = a.C0011a.a;
                        if (x4 == obj5) {
                            x4 = androidx.compose.runtime.k.b(Float.valueOf(nmx.p(nmx.c(bwfVar9, ref$FloatRef4, ref$FloatRef3, ((Number) bwfVar10.getStart()).floatValue()), list3, ref$FloatRef4.element, ref$FloatRef3.element)));
                            r7.R(x4);
                        }
                        final wh50 wh50Var2 = (wh50) x4;
                        Object x5 = r7.x();
                        if (x5 == obj5) {
                            x5 = androidx.compose.runtime.k.b(Float.valueOf(nmx.p(nmx.c(bwfVar9, ref$FloatRef4, ref$FloatRef3, ((Number) bwfVar10.getStart()).floatValue()), list3, ref$FloatRef4.element, ref$FloatRef3.element)));
                            r7.R(x5);
                        }
                        final wh50 wh50Var3 = (wh50) x5;
                        Object x6 = r7.x();
                        if (x6 == obj5) {
                            x6 = androidx.compose.runtime.k.b(Float.valueOf(nmx.p(nmx.c(bwfVar9, ref$FloatRef4, ref$FloatRef3, ((Number) bwfVar10.c()).floatValue()), list3, ref$FloatRef4.element, ref$FloatRef3.element)));
                            r7.R(x6);
                        }
                        final wh50 wh50Var4 = (wh50) x6;
                        Object x7 = r7.x();
                        if (x7 == obj5) {
                            x7 = androidx.compose.runtime.k.b(Float.valueOf(nmx.p(nmx.c(bwfVar9, ref$FloatRef4, ref$FloatRef3, ((Number) bwfVar10.c()).floatValue()), list3, ref$FloatRef4.element, ref$FloatRef3.element)));
                            r7.R(x7);
                        }
                        final wh50 wh50Var5 = (wh50) x7;
                        boolean J = r7.J(bwfVar9) | r7.n(ref$FloatRef4.element) | r7.n(ref$FloatRef3.element);
                        Object x8 = r7.x();
                        if (J || x8 == obj5) {
                            x8 = new cmx(bwfVar9, ref$FloatRef4, ref$FloatRef3);
                            r7.R(x8);
                        }
                        nmx.a((izs) ((fcy) x8), bwfVar9, new awf(ref$FloatRef4.element, ref$FloatRef3.element), wh50Var2, ((Number) bwfVar10.getStart()).floatValue(), r7, 3072);
                        boolean J2 = r7.J(bwfVar9) | r7.n(ref$FloatRef4.element) | r7.n(ref$FloatRef3.element);
                        Object x9 = r7.x();
                        if (J2 || x9 == obj5) {
                            x9 = new dmx(bwfVar9, ref$FloatRef4, ref$FloatRef3);
                            r7.R(x9);
                        }
                        nmx.a((izs) ((fcy) x9), bwfVar9, new awf(ref$FloatRef4.element, ref$FloatRef3.element), wh50Var4, ((Number) bwfVar10.c()).floatValue(), r7, 3072);
                        Object x10 = r7.x();
                        if (x10 == obj5) {
                            x10 = bap.j(EmptyCoroutineContext.b, r7);
                            r7.R(x10);
                        }
                        final yvj yvjVar = (yvj) x10;
                        boolean y = r7.y(list3) | r7.n(ref$FloatRef4.element) | r7.n(ref$FloatRef3.element) | r7.J(null) | r7.y(yvjVar);
                        final wh50 wh50Var6 = c2;
                        boolean J3 = y | r7.J(wh50Var6) | r7.J(bwfVar9);
                        Object x11 = r7.x();
                        if (J3 || x11 == obj5) {
                            x11 = new izs() { // from class: xsna.xlx
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // xsna.izs
                                public final Object invoke(Object obj6) {
                                    boolean booleanValue = ((Boolean) obj6).booleanValue();
                                    wh50 wh50Var7 = wh50.this;
                                    wh50 wh50Var8 = wh50Var4;
                                    float floatValue = ((Number) (booleanValue ? wh50Var7 : wh50Var8).getValue()).floatValue();
                                    Ref$FloatRef ref$FloatRef5 = ref$FloatRef4;
                                    float f6 = ref$FloatRef5.element;
                                    Ref$FloatRef ref$FloatRef6 = ref$FloatRef3;
                                    float p = nmx.p(floatValue, list3, f6, ref$FloatRef6.element);
                                    if (floatValue == p) {
                                        return s3q0.a;
                                    }
                                    myc0.h(yvjVar, null, null, new emx(booleanValue, wh50Var7, wh50Var8, p, wh50Var3, wh50Var5, wh50Var6, null, ref$FloatRef5, ref$FloatRef6, bwfVar9, null), 3);
                                    return s3q0.a;
                                }
                            };
                            list2 = list3;
                            ref$FloatRef = ref$FloatRef4;
                            ref$FloatRef2 = ref$FloatRef3;
                            wh50Var3 = wh50Var3;
                            wh50Var = wh50Var6;
                            bwfVar5 = bwfVar9;
                            r7.R(x11);
                        } else {
                            bwfVar5 = bwfVar9;
                            wh50Var = wh50Var6;
                            ref$FloatRef2 = ref$FloatRef3;
                            ref$FloatRef = ref$FloatRef4;
                            list2 = list3;
                        }
                        wh50 c3 = androidx.compose.runtime.k.c((izs) x11, r7, 0);
                        boolean J4 = r7.J(bwfVar5) | r7.n(ref$FloatRef.element) | r7.n(ref$FloatRef2.element) | r7.J(bwfVar10) | r7.y(list2) | r7.J(wh50Var);
                        Object x12 = r7.x();
                        if (J4 || x12 == obj5) {
                            final Ref$FloatRef ref$FloatRef5 = ref$FloatRef2;
                            final Ref$FloatRef ref$FloatRef6 = ref$FloatRef;
                            final bwf bwfVar11 = bwfVar5;
                            final List list4 = list2;
                            final wh50 wh50Var7 = wh50Var;
                            bwfVar6 = bwfVar10;
                            x12 = new wzs() { // from class: xsna.ylx
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // xsna.wzs
                                public final Object invoke(Object obj6, Object obj7) {
                                    awf awfVar;
                                    boolean booleanValue = ((Boolean) obj6).booleanValue();
                                    float floatValue = ((Float) obj7).floatValue();
                                    wh50 wh50Var8 = wh50.this;
                                    wh50 wh50Var9 = wh50Var4;
                                    bwf bwfVar12 = bwfVar6;
                                    List list5 = list4;
                                    Ref$FloatRef ref$FloatRef7 = ref$FloatRef6;
                                    Ref$FloatRef ref$FloatRef8 = ref$FloatRef5;
                                    bwf bwfVar13 = bwfVar11;
                                    if (booleanValue) {
                                        wh50Var8.setValue(Float.valueOf(((Number) wh50Var8.getValue()).floatValue() + floatValue));
                                        wh50Var9.setValue(Float.valueOf(nmx.c(bwfVar13, ref$FloatRef7, ref$FloatRef8, ((Number) bwfVar12.c()).floatValue())));
                                        float floatValue2 = ((Number) wh50Var9.getValue()).floatValue();
                                        float f6 = ref$FloatRef7.element;
                                        float f7 = ref$FloatRef8.element;
                                        wh50 wh50Var10 = wh50Var3;
                                        nmx.o(wh50Var10, wh50Var8, list5, f6, f7);
                                        wh50Var8.setValue(Float.valueOf(swe0.f(((Number) wh50Var8.getValue()).floatValue(), ref$FloatRef7.element, floatValue2)));
                                        awfVar = new awf(swe0.f(((Number) wh50Var10.getValue()).floatValue(), ref$FloatRef7.element, floatValue2), floatValue2);
                                    } else {
                                        wh50Var9.setValue(Float.valueOf(((Number) wh50Var9.getValue()).floatValue() + floatValue));
                                        wh50Var8.setValue(Float.valueOf(nmx.c(bwfVar13, ref$FloatRef7, ref$FloatRef8, ((Number) bwfVar12.getStart()).floatValue())));
                                        float floatValue3 = ((Number) wh50Var8.getValue()).floatValue();
                                        float f8 = ref$FloatRef7.element;
                                        float f9 = ref$FloatRef8.element;
                                        wh50 wh50Var11 = wh50Var5;
                                        nmx.o(wh50Var11, wh50Var9, list5, f8, f9);
                                        wh50Var9.setValue(Float.valueOf(swe0.f(((Number) wh50Var9.getValue()).floatValue(), floatValue3, ref$FloatRef8.element)));
                                        awfVar = new awf(floatValue3, swe0.f(((Number) wh50Var11.getValue()).floatValue(), floatValue3, ref$FloatRef8.element));
                                    }
                                    izs izsVar2 = (izs) wh50Var7.getValue();
                                    float f10 = ref$FloatRef7.element;
                                    float f11 = ref$FloatRef8.element;
                                    float floatValue4 = ((Number) bwfVar13.getStart()).floatValue();
                                    float floatValue5 = ((Number) bwfVar13.c()).floatValue();
                                    izsVar2.invoke(new awf(nmx.m(f10, f11, awfVar.b, floatValue4, floatValue5), nmx.m(f10, f11, awfVar.c, floatValue4, floatValue5)));
                                    return s3q0.a;
                                }
                            };
                            r7.R(x12);
                        } else {
                            bwfVar6 = bwfVar10;
                        }
                        wh50 c4 = androidx.compose.runtime.k.c((wzs) x12, r7, 0);
                        sg50 sg50Var3 = sg50Var;
                        sg50 sg50Var4 = sg50Var2;
                        boolean z6 = z2;
                        q630.a aVar5 = q630.a.a;
                        if (z6) {
                            Object[] objArr = {sg50Var3, sg50Var4, Float.valueOf(i4), Boolean.valueOf(z5), bwfVar5};
                            bwfVar7 = bwfVar5;
                            f4 = f5;
                            obj4 = obj5;
                            bwf bwfVar12 = bwfVar6;
                            z4 = z6;
                            aVar3 = aVar5;
                            ?? c5 = skn0.c(aVar3, objArr, new lmx(sg50Var3, sg50Var4, wh50Var2, wh50Var4, c4, z5, i4, c3));
                            bwfVar8 = bwfVar12;
                            aVar4 = c5;
                        } else {
                            bwfVar7 = bwfVar5;
                            f4 = f5;
                            obj4 = obj5;
                            aVar3 = aVar5;
                            bwf bwfVar13 = bwfVar6;
                            z4 = z6;
                            bwfVar8 = bwfVar13;
                            aVar4 = aVar3;
                        }
                        final float f6 = swe0.f(((Number) bwfVar8.getStart()).floatValue(), ((Number) bwfVar7.getStart()).floatValue(), ((Number) bwfVar8.c()).floatValue());
                        final float f7 = swe0.f(((Number) bwfVar8.c()).floatValue(), ((Number) bwfVar8.getStart()).floatValue(), ((Number) bwfVar7.c()).floatValue());
                        float l = nmx.l(((Number) bwfVar7.getStart()).floatValue(), ((Number) bwfVar7.c()).floatValue(), f6);
                        float l2 = nmx.l(((Number) bwfVar7.getStart()).floatValue(), ((Number) bwfVar7.c()).floatValue(), f7);
                        boolean J5 = r7.J(wh50Var) | r7.n(f7);
                        List list5 = list2;
                        Object x13 = r7.x();
                        if (J5 || x13 == obj4) {
                            x13 = new izs() { // from class: xsna.zlx
                                @Override // xsna.izs
                                public final Object invoke(Object obj6) {
                                    ((izs) wh50.this.getValue()).invoke(new awf(((Float) obj6).floatValue(), f7));
                                    return s3q0.a;
                                }
                            };
                            r7.R(x13);
                        }
                        izs izsVar2 = (izs) x13;
                        awf awfVar = new awf(((Number) bwfVar7.getStart()).floatValue(), f7);
                        int i5 = i;
                        q630.a aVar6 = aVar3;
                        q630 n = nmx.n(aVar6, f6, list5, z4, izsVar2, awfVar, i5);
                        boolean J6 = r7.J(wh50Var) | r7.n(f6);
                        Object x14 = r7.x();
                        if (J6 || x14 == obj4) {
                            x14 = new izs() { // from class: xsna.amx
                                @Override // xsna.izs
                                public final Object invoke(Object obj6) {
                                    ((izs) wh50.this.getValue()).invoke(new awf(f6, ((Float) obj6).floatValue()));
                                    return s3q0.a;
                                }
                            };
                            r7.R(x14);
                        }
                        nmx.f(z4, l, l2, pmlVar2, ref$FloatRef2.element - ref$FloatRef.element, sg50Var3, sg50Var4, aVar4, n, nmx.n(aVar6, f7, list5, z4, (izs) x14, new awf(f6, ((Number) bwfVar7.c()).floatValue()), i5), f4, f3, r7, 1769472);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        r7.h();
                    }
                    return s3q0.a;
                }
            }, M), aVar2, 3072, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.wlx
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    nmx.b(bwf.this, izsVar, q630Var, z, bwfVar2, i, pmlVar, f, f2, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final float c(bwf<Float> bwfVar, Ref$FloatRef ref$FloatRef, Ref$FloatRef ref$FloatRef2, float f) {
        return m(bwfVar.getStart().floatValue(), bwfVar.c().floatValue(), f, ref$FloatRef.element, ref$FloatRef2.element);
    }

    public static final void d(final float f, final izs izsVar, final q630 q630Var, final boolean z, final bwf bwfVar, final int i, sg50 sg50Var, final pml pmlVar, final float f2, final float f3, androidx.compose.runtime.a aVar, final int i2) {
        float f4;
        int i3;
        bwf bwfVar2;
        androidx.compose.runtime.a aVar2;
        final sg50 sg50Var2;
        sg50 sg50Var3;
        sg50 sg50Var4;
        androidx.compose.runtime.a M = aVar.M(1967575381);
        if ((i2 & 6) == 0) {
            f4 = f;
            i3 = (M.n(f4) ? 4 : 2) | i2;
        } else {
            f4 = f;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.J(q630Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= M.l(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            bwfVar2 = bwfVar;
            i3 |= M.J(bwfVar2) ? 16384 : 8192;
        } else {
            bwfVar2 = bwfVar;
        }
        if ((196608 & i2) == 0) {
            i3 |= M.o(i) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= M.y(null) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i4 = i3 | 12582912;
        if ((100663296 & i2) == 0) {
            i4 |= M.J(pmlVar) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i4 |= M.n(f2) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        int i5 = M.n(f3) ? 4 : 2;
        if (M.t(i4 & 1, ((i4 & 306783379) == 306783378 && (i5 & 3) == 2) ? false : true)) {
            M.V();
            int i6 = i2 & 1;
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (i6 == 0 || M.i()) {
                Object x = M.x();
                if (x == c0012a) {
                    x = ir.h(M);
                }
                sg50Var3 = (sg50) x;
            } else {
                M.h();
                sg50Var3 = sg50Var;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                sg50Var4 = sg50Var3;
                androidx.compose.runtime.b.f(1967575381, i4, i5, "com.vk.core.compose.component.internal.InternalSlider (InternalSlider.kt:103)");
            } else {
                sg50Var4 = sg50Var3;
            }
            if (i < 0) {
                throw new IllegalArgumentException("steps should be >= 0");
            }
            final wh50 c2 = androidx.compose.runtime.k.c(izsVar, M, (i4 >> 3) & 14);
            boolean z2 = (458752 & i4) == 131072;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = q(i);
                M.R(x2);
            }
            final List list = (List) x2;
            float f5 = 2 * f2;
            final sg50 sg50Var5 = sg50Var4;
            aVar2 = M;
            ua8.a(mxr.a(n(txj0.o(q630Var, f5, f5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12), f4, list, z, izsVar, bwfVar2, i), z, sg50Var5), null, false, kai.c(2062651819, new yzs() { // from class: xsna.jlx
                /* JADX WARN: Multi-variable type inference failed */
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    wh50 wh50Var;
                    List list2;
                    Ref$FloatRef ref$FloatRef;
                    bwf bwfVar3;
                    Ref$FloatRef ref$FloatRef2;
                    final s0k0 s0k0Var;
                    va8 va8Var = (va8) obj;
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar3.J(va8Var) ? 4 : 2;
                    }
                    if (aVar3.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(2062651819, intValue, -1, "com.vk.core.compose.component.internal.InternalSlider.<anonymous> (InternalSlider.kt:115)");
                        }
                        final boolean z3 = aVar3.r(uvi.n) == LayoutDirection.Rtl;
                        final float i7 = o6j.i(va8Var.f());
                        final Ref$FloatRef ref$FloatRef3 = new Ref$FloatRef();
                        Ref$FloatRef ref$FloatRef4 = new Ref$FloatRef();
                        azl azlVar = (azl) aVar3.r(uvi.h);
                        float f6 = f2;
                        ref$FloatRef3.element = i7 - azlVar.I0(f6);
                        ref$FloatRef4.element = azlVar.I0(f6);
                        Object x3 = aVar3.x();
                        Object obj4 = a.C0011a.a;
                        if (x3 == obj4) {
                            x3 = bap.j(EmptyCoroutineContext.b, aVar3);
                            aVar3.R(x3);
                        }
                        final yvj yvjVar = (yvj) x3;
                        Object x4 = aVar3.x();
                        bwf bwfVar4 = bwf.this;
                        float f7 = f;
                        List list3 = list;
                        if (x4 == obj4) {
                            x4 = androidx.compose.runtime.k.b(Float.valueOf(nmx.p(nmx.e(bwfVar4, ref$FloatRef4, ref$FloatRef3, f7), list3, ref$FloatRef4.element, ref$FloatRef3.element)));
                            aVar3.R(x4);
                        }
                        final wh50 wh50Var2 = (wh50) x4;
                        Object x5 = aVar3.x();
                        if (x5 == obj4) {
                            x5 = androidx.compose.runtime.k.b(Float.valueOf(nmx.p(nmx.e(bwfVar4, ref$FloatRef4, ref$FloatRef3, f7), list3, ref$FloatRef4.element, ref$FloatRef3.element)));
                            aVar3.R(x5);
                        }
                        final wh50 wh50Var3 = (wh50) x5;
                        Object x6 = aVar3.x();
                        if (x6 == obj4) {
                            x6 = androidx.compose.runtime.k.b(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                            aVar3.R(x6);
                        }
                        wh50 wh50Var4 = (wh50) x6;
                        boolean n = aVar3.n(ref$FloatRef4.element) | aVar3.n(ref$FloatRef3.element) | aVar3.J(bwfVar4);
                        Object x7 = aVar3.x();
                        if (n || x7 == obj4) {
                            wh50Var = wh50Var4;
                            list2 = list3;
                            ref$FloatRef = ref$FloatRef4;
                            bwfVar3 = bwfVar4;
                            x7 = new s0k0(new yuo(wh50Var2, wh50Var4, wh50Var3, list3, ref$FloatRef4, ref$FloatRef3, c2, bwfVar4));
                            aVar3.R(x7);
                        } else {
                            ref$FloatRef = ref$FloatRef4;
                            bwfVar3 = bwfVar4;
                            list2 = list3;
                            wh50Var = wh50Var4;
                        }
                        final s0k0 s0k0Var2 = (s0k0) x7;
                        boolean J = aVar3.J(bwfVar3) | aVar3.n(ref$FloatRef.element) | aVar3.n(ref$FloatRef3.element);
                        Object x8 = aVar3.x();
                        if (J || x8 == obj4) {
                            x8 = new fmx(bwfVar3, ref$FloatRef, ref$FloatRef3);
                            aVar3.R(x8);
                        }
                        final List list4 = list2;
                        nmx.a((izs) ((fcy) x8), bwfVar3, new awf(ref$FloatRef.element, ref$FloatRef3.element), wh50Var2, f7, aVar3, 3072);
                        boolean y = aVar3.y(list4) | aVar3.n(ref$FloatRef.element) | aVar3.n(ref$FloatRef3.element) | aVar3.y(yvjVar) | aVar3.y(s0k0Var2) | aVar3.J(null);
                        Object x9 = aVar3.x();
                        if (y || x9 == obj4) {
                            final Ref$FloatRef ref$FloatRef5 = ref$FloatRef;
                            x9 = new gzs() { // from class: xsna.klx
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // xsna.gzs
                                public final Object invoke() {
                                    float floatValue = ((Number) wh50.this.getValue()).floatValue();
                                    float p = nmx.p(floatValue, list4, ref$FloatRef5.element, ref$FloatRef3.element);
                                    s0k0 s0k0Var3 = s0k0Var2;
                                    if (floatValue == p) {
                                        ((Boolean) ((zak0) s0k0Var3.b).getValue()).booleanValue();
                                    } else {
                                        myc0.h(yvjVar, null, null, new hmx(s0k0Var3, null, p, floatValue, null), 3);
                                    }
                                    return s3q0.a;
                                }
                            };
                            ref$FloatRef2 = ref$FloatRef5;
                            s0k0Var = s0k0Var2;
                            aVar3.R(x9);
                        } else {
                            s0k0Var = s0k0Var2;
                            ref$FloatRef2 = ref$FloatRef;
                        }
                        wh50 c3 = androidx.compose.runtime.k.c((gzs) x9, aVar3, 0);
                        a5x.a aVar4 = a5x.a;
                        final boolean z4 = z;
                        final sg50 sg50Var6 = sg50Var5;
                        final wh50 wh50Var5 = wh50Var;
                        yzs yzsVar = new yzs() { // from class: xsna.llx
                            @Override // xsna.yzs
                            public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                q630 q630Var2 = (q630) obj5;
                                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj6;
                                int intValue2 = ((Integer) obj7).intValue();
                                aVar5.K(-362857636);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(-362857636, intValue2, -1, "com.vk.core.compose.component.internal.sliderTapModifier.<anonymous> (InternalSlider.kt:689)");
                                }
                                if (z4) {
                                    aVar5.K(540902875);
                                    Object x10 = aVar5.x();
                                    Object obj8 = a.C0011a.a;
                                    if (x10 == obj8) {
                                        x10 = bap.j(EmptyCoroutineContext.b, aVar5);
                                        aVar5.R(x10);
                                    }
                                    yvj yvjVar2 = (yvj) x10;
                                    float f8 = i7;
                                    Float valueOf = Float.valueOf(f8);
                                    boolean z5 = z3;
                                    Boolean valueOf2 = Boolean.valueOf(z5);
                                    gho ghoVar = s0k0Var;
                                    Object[] objArr = {ghoVar, sg50Var6, valueOf, valueOf2};
                                    boolean l = aVar5.l(z5) | aVar5.n(f8);
                                    wh50 wh50Var6 = wh50Var5;
                                    boolean J2 = l | aVar5.J(wh50Var6);
                                    mtk0 mtk0Var = wh50Var2;
                                    boolean J3 = J2 | aVar5.J(mtk0Var) | aVar5.y(yvjVar2) | aVar5.y(ghoVar);
                                    Object x11 = aVar5.x();
                                    if (J3 || x11 == obj8) {
                                        Object mmxVar = new mmx(z5, f8, wh50Var6, mtk0Var, yvjVar2, ghoVar);
                                        aVar5.R(mmxVar);
                                        x11 = mmxVar;
                                    }
                                    q630Var2 = skn0.c(q630Var2, objArr, (PointerInputEventHandler) x11);
                                    aVar5.j();
                                } else {
                                    aVar5.K(541842826);
                                    aVar5.j();
                                }
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                aVar5.j();
                                return q630Var2;
                            }
                        };
                        q630.a aVar5 = q630.a.a;
                        q630 a2 = qri.a(aVar5, aVar4, yzsVar);
                        Orientation orientation = Orientation.Horizontal;
                        boolean booleanValue = ((Boolean) ((zak0) s0k0Var.b).getValue()).booleanValue();
                        boolean J2 = aVar3.J(c3);
                        bwf bwfVar5 = bwfVar3;
                        Object x10 = aVar3.x();
                        if (J2 || x10 == obj4) {
                            x10 = new gmx(c3, null);
                            aVar3.R(x10);
                        }
                        nmx.g(z4, nmx.l(((Number) bwfVar5.getStart()).floatValue(), ((Number) bwfVar5.c()).floatValue(), swe0.f(f7, ((Number) bwfVar5.getStart()).floatValue(), ((Number) bwfVar5.c()).floatValue())), pmlVar, ref$FloatRef3.element - ref$FloatRef2.element, sg50Var6, a2.g(fho.a(aVar5, s0k0Var, orientation, z4, sg50Var6, booleanValue, (yzs) x10, z3, 32)), f6, f3, aVar3, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M), aVar2, 3072, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            sg50Var2 = sg50Var5;
        } else {
            aVar2 = M;
            aVar2.h();
            sg50Var2 = sg50Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.slx
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    nmx.d(f, izsVar, q630Var, z, bwfVar, i, sg50Var2, pmlVar, f2, f3, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final float e(bwf<Float> bwfVar, Ref$FloatRef ref$FloatRef, Ref$FloatRef ref$FloatRef2, float f) {
        return m(bwfVar.getStart().floatValue(), bwfVar.c().floatValue(), f, ref$FloatRef.element, ref$FloatRef2.element);
    }

    public static final void f(final boolean z, final float f, final float f2, final pml pmlVar, final float f3, final sg50 sg50Var, final sg50 sg50Var2, final q630 q630Var, final q630 q630Var2, final q630 q630Var3, final float f4, final float f5, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(1750369345);
        int i2 = i | (M.l(z) ? 4 : 2) | (M.n(f) ? 32 : 16) | (M.n(f2) ? 256 : 128) | (M.J(pmlVar) ? 2048 : 1024) | (M.n(f3) ? 16384 : 8192) | (M.J(q630Var) ? 8388608 : 4194304) | (M.J(q630Var2) ? 67108864 : 33554432) | (M.J(q630Var3) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456);
        int i3 = (M.n(f4) ? 4 : 2) | (M.n(f5) ? 32 : 16);
        if (M.t(i2 & 1, ((306783379 & i2) == 306783378 && (i3 & 19) == 18) ? false : true)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1750369345, i2, i3, "com.vk.core.compose.component.internal.RangeSliderImpl (InternalSlider.kt:437)");
            }
            q630 g = q630Var.g(c);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, g);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            azl azlVar = (azl) M.r(uvi.h);
            float I0 = azlVar.I0(f5);
            float I02 = azlVar.I0(f4);
            float k1 = azlVar.k1(f3);
            float f6 = f4 * 2;
            float f7 = k1 * f;
            float f8 = k1 * f2;
            ty6 ty6Var = dt1.a.e;
            ra8 ra8Var = ra8.a;
            q630.a aVar3 = q630.a.a;
            q630 d3 = txj0.d(ra8Var.b(aVar3, ty6Var), 1.0f);
            int i4 = i2 << 6;
            i(d3, pmlVar, z, f, f2, I02, I0, M, (i4 & 57344) | ((i2 >> 6) & 112) | (i4 & 896) | (i4 & 7168));
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new azt(8);
                M.R(x);
            }
            int i5 = (i2 << 3) & 57344;
            int i6 = (i2 << 15) & 458752;
            h(mxr.a(egi0.b(aVar3, true, (izs) x), true, sg50Var).g(q630Var2), f7, sg50Var, pmlVar, z, f6, M, 3078 | i5 | i6);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new y8m(7);
                M.R(x2);
            }
            h(mxr.a(egi0.b(aVar3, true, (izs) x2), true, sg50Var2).g(q630Var3), f8, sg50Var2, pmlVar, z, f6, M, 3078 | i5 | i6);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(z, f, f2, pmlVar, f3, sg50Var, sg50Var2, q630Var, q630Var2, q630Var3, f4, f5, i) { // from class: xsna.qlx
                public final /* synthetic */ boolean b;
                public final /* synthetic */ float c;
                public final /* synthetic */ float d;
                public final /* synthetic */ pml e;
                public final /* synthetic */ float f;
                public final /* synthetic */ sg50 g;
                public final /* synthetic */ sg50 h;
                public final /* synthetic */ q630 i;
                public final /* synthetic */ q630 j;
                public final /* synthetic */ q630 k;
                public final /* synthetic */ float l;
                public final /* synthetic */ float m;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    nmx.f(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, (androidx.compose.runtime.a) obj, ne7.I(1769473));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void g(final boolean z, final float f, final pml pmlVar, final float f2, final sg50 sg50Var, final q630 q630Var, final float f3, final float f4, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(470029417);
        int i2 = i | (M.l(z) ? 4 : 2) | (M.n(f) ? 32 : 16) | (M.J(pmlVar) ? 256 : 128) | (M.n(f2) ? 2048 : 1024) | (M.J(sg50Var) ? 16384 : 8192) | (M.J(q630Var) ? 131072 : 65536) | (M.n(f3) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (M.n(f4) ? 8388608 : 4194304);
        if (M.t(i2 & 1, (4793491 & i2) != 4793490)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(470029417, i2, -1, "com.vk.core.compose.component.internal.SliderImpl (InternalSlider.kt:396)");
            }
            q630 g = q630Var.g(c);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, g);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            azl azlVar = (azl) M.r(uvi.h);
            float I0 = azlVar.I0(f4);
            float I02 = azlVar.I0(f3);
            float k1 = azlVar.k1(f2) * f;
            q630.a aVar3 = q630.a.a;
            q630 d3 = txj0.d(aVar3, 1.0f);
            int i3 = i2 >> 3;
            int i4 = i2 << 6;
            i(d3, pmlVar, z, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, I02, I0, M, ((i2 << 9) & 57344) | (i4 & 896) | (i3 & 112) | 3078);
            h(aVar3, k1, sg50Var, pmlVar, z, f3 * 2, M, (i3 & 7168) | 54 | (i4 & 57344) | ((i2 << 15) & 458752));
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(z, f, pmlVar, f2, sg50Var, q630Var, f3, f4, i) { // from class: xsna.plx
                public final /* synthetic */ boolean b;
                public final /* synthetic */ float c;
                public final /* synthetic */ pml d;
                public final /* synthetic */ float e;
                public final /* synthetic */ sg50 f;
                public final /* synthetic */ q630 g;
                public final /* synthetic */ float h;
                public final /* synthetic */ float i;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    nmx.g(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(final q630 q630Var, final float f, final sg50 sg50Var, final pml pmlVar, final boolean z, final float f2, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(2967820);
        int i3 = i & 6;
        ra8 ra8Var = ra8.a;
        if (i3 == 0) {
            i2 = (M.J(ra8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.n(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(sg50Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(pmlVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.l(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= M.n(f2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (M.t(i2 & 1, (599187 & i2) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2967820, i2, -1, "com.vk.core.compose.component.internal.SliderThumb (InternalSlider.kt:499)");
            }
            q630 H = s200.H(q630.a.a, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
            dt1.a.getClass();
            q630 b2 = ra8Var.b(H, dt1.a.e);
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, b2);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new SnapshotStateList();
                M.R(x);
            }
            SnapshotStateList snapshotStateList = (SnapshotStateList) x;
            boolean z2 = (i2 & 7168) == 2048;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new imx(sg50Var, snapshotStateList, null);
                M.R(x2);
            }
            int i4 = i2 >> 9;
            bap.g(sg50Var, (wzs) x2, M, i4 & 14);
            float f3 = !snapshotStateList.isEmpty() ? b : a;
            q630 a2 = pgv.a(cuw.a(txj0.s(q630Var, f2, f2), sg50Var, null), sg50Var);
            if (!z) {
                f3 = 0;
            }
            float f4 = f3;
            uog0 uog0Var = vog0.a;
            q630 b3 = a5j0.b(a2, f4, uog0Var, false, 0L, 0L, 24);
            int i5 = ((i2 >> 15) & 14) | (i4 & 112);
            pmlVar.getClass();
            M.K(-1733795637);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1733795637, i5, -1, "androidx.compose.material.DefaultSliderColors.thumbColor (Slider.kt:1186)");
            }
            wh50 f5 = bo.f(0, z ? pmlVar.a : pmlVar.b, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            M.j();
            f9t.e(hr80.m(b3, ((l5g) f5.getValue()).a, uog0Var), M, 0);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.rlx
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    nmx.h(q630.this, f, sg50Var, pmlVar, z, f2, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void i(final q630 q630Var, final pml pmlVar, final boolean z, final float f, final float f2, final float f3, final float f4, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        float f5;
        androidx.compose.runtime.a M = aVar.M(-1028789456);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(pmlVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.n(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.n(f2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            f5 = f3;
            i2 |= M.n(f5) ? 131072 : 65536;
        } else {
            f5 = f3;
        }
        if ((1572864 & i) == 0) {
            i2 |= M.n(f4) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (M.t(i2 & 1, (599187 & i2) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1028789456, i2, -1, "com.vk.core.compose.component.internal.Track (InternalSlider.kt:547)");
            }
            int i3 = ((i2 >> 6) & 14) | 48 | ((i2 << 3) & 896);
            final wh50 a2 = pmlVar.a(z, false, M, i3);
            final wh50 a3 = pmlVar.a(z, true, M, i3);
            boolean J = ((458752 & i2) == 131072) | M.J(a2) | ((3670016 & i2) == 1048576) | ((57344 & i2) == 16384) | ((i2 & 7168) == 2048) | M.J(a3);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                final float f6 = f5;
                Object obj = new izs() { // from class: xsna.tlx
                    @Override // xsna.izs
                    public final Object invoke(Object obj2) {
                        oio oioVar = (oio) obj2;
                        boolean z2 = oioVar.getLayoutDirection() == LayoutDirection.Rtl;
                        float intBitsToFloat = Float.intBitsToFloat((int) (oioVar.n1() & 4294967295L));
                        long floatToRawIntBits = (Float.floatToRawIntBits(r2) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L);
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (oioVar.d() >> 32)) - f6;
                        long floatToRawIntBits2 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (oioVar.n1() & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat2) << 32);
                        long j = floatToRawIntBits;
                        if (z2) {
                            floatToRawIntBits = floatToRawIntBits2;
                        }
                        if (!z2) {
                            j = floatToRawIntBits2;
                        }
                        long j2 = ((l5g) a2.getValue()).a;
                        float f7 = f4;
                        oioVar.b1(f7, (r20 & 16) != 0 ? 0 : 1, 3, j2, floatToRawIntBits, j);
                        int i4 = (int) (floatToRawIntBits >> 32);
                        int i5 = (int) (j >> 32);
                        float intBitsToFloat3 = ((Float.intBitsToFloat(i5) - Float.intBitsToFloat(i4)) * f2) + Float.intBitsToFloat(i4);
                        float intBitsToFloat4 = ((Float.intBitsToFloat(i5) - Float.intBitsToFloat(i4)) * f) + Float.intBitsToFloat(i4);
                        oioVar.b1(f7, (r20 & 16) != 0 ? 0 : 1, 3, ((l5g) a3.getValue()).a, (Float.floatToRawIntBits(Float.intBitsToFloat((int) (oioVar.n1() & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat4) << 32), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (oioVar.n1() & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat3) << 32));
                        return s3q0.a;
                    }
                };
                M.R(obj);
                x = obj;
            }
            xa4.i(i2 & 14, M, (izs) x, q630Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.ulx
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    nmx.i(q630.this, pmlVar, z, f, f2, f3, f4, (androidx.compose.runtime.a) obj2, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable j(eu5 eu5Var, long j, int i, BaseContinuationImpl baseContinuationImpl) {
        kmx kmxVar;
        int i2;
        Ref$FloatRef ref$FloatRef;
        xlb0 xlb0Var;
        if (baseContinuationImpl instanceof kmx) {
            kmxVar = (kmx) baseContinuationImpl;
            int i3 = kmxVar.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                kmxVar.label = i3 - Integer.MIN_VALUE;
                kmx kmxVar2 = kmxVar;
                Object obj = kmxVar2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = kmxVar2.label;
                if (i2 != 0) {
                    kotlin.a.a(obj);
                    Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
                    hq5 hq5Var = new hq5(ref$FloatRef2, 10);
                    kmxVar2.L$0 = ref$FloatRef2;
                    kmxVar2.label = 1;
                    Object k = k(eu5Var, j, i, hq5Var, kmxVar2);
                    if (k == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = k;
                    ref$FloatRef = ref$FloatRef2;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ref$FloatRef = (Ref$FloatRef) kmxVar2.L$0;
                    kotlin.a.a(obj);
                }
                xlb0Var = (xlb0) obj;
                if (xlb0Var == null) {
                    return new Pair(xlb0Var, new Float(ref$FloatRef.element));
                }
                return null;
            }
        }
        kmxVar = new kmx(baseContinuationImpl);
        kmx kmxVar22 = kmxVar;
        Object obj2 = kmxVar22.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = kmxVar22.label;
        if (i2 != 0) {
        }
        xlb0Var = (xlb0) obj2;
        if (xlb0Var == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r12v9, types: [xsna.wzs] */
    /* JADX WARN: Type inference failed for: r13v7, types: [xsna.wzs] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0149 -> B:15:0x00c5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x018d -> B:11:0x0190). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x01b3 -> B:14:0x0199). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object k(eu5 eu5Var, long j, int i, hq5 hq5Var, ContinuationImpl continuationImpl) {
        jmx jmxVar;
        int i2;
        xlb0 xlb0Var;
        eu5 eu5Var2;
        hq5 hq5Var2;
        Ref$LongRef ref$LongRef;
        jmx jmxVar2;
        float f;
        float f2;
        Ref$LongRef ref$LongRef2;
        jmx jmxVar3;
        float f3;
        float f4;
        int size;
        int i3;
        xlb0 xlb0Var2;
        jmx jmxVar4;
        xlb0 xlb0Var3;
        xlb0 xlb0Var4;
        xlb0 xlb0Var5;
        Object I1;
        if (continuationImpl instanceof jmx) {
            jmxVar = (jmx) continuationImpl;
            int i4 = jmxVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                jmxVar.label = i4 - Integer.MIN_VALUE;
                Object obj = jmxVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = jmxVar.label;
                int i5 = 1;
                xlb0 xlb0Var6 = null;
                if (i2 != 0) {
                    kotlin.a.a(obj);
                    List<xlb0> list = eu5Var.z0().a;
                    int size2 = list.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size2) {
                            xlb0Var = null;
                            break;
                        }
                        xlb0Var = list.get(i6);
                        if (wlb0.g(xlb0Var.a, j)) {
                            break;
                        }
                        i6++;
                    }
                    xlb0 xlb0Var7 = xlb0Var;
                    if (xlb0Var7 == null || !xlb0Var7.d) {
                        return null;
                    }
                    rut0 viewConfiguration = eu5Var.getViewConfiguration();
                    float e = i == 2 ? viewConfiguration.e() * d : viewConfiguration.e();
                    Ref$LongRef ref$LongRef3 = new Ref$LongRef();
                    ref$LongRef3.element = j;
                    eu5Var2 = eu5Var;
                    hq5Var2 = hq5Var;
                    ref$LongRef = ref$LongRef3;
                    jmxVar2 = jmxVar;
                    f = e;
                    f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    jmxVar2.L$0 = hq5Var2;
                    jmxVar2.L$1 = eu5Var2;
                    jmxVar2.L$2 = ref$LongRef;
                    jmxVar2.L$3 = xlb0Var6;
                    jmxVar2.F$0 = f;
                    jmxVar2.F$1 = f2;
                    jmxVar2.label = i5;
                    I1 = eu5Var2.I1(PointerEventPass.Main, jmxVar2);
                    if (I1 != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    float f5 = jmxVar.F$1;
                    float f6 = jmxVar.F$0;
                    xlb0 xlb0Var8 = (xlb0) jmxVar.L$3;
                    ref$LongRef = (Ref$LongRef) jmxVar.L$2;
                    eu5 eu5Var3 = (eu5) jmxVar.L$1;
                    ?? r13 = (wzs) jmxVar.L$0;
                    kotlin.a.a(obj);
                    f2 = f5;
                    jmx jmxVar5 = jmxVar;
                    xlb0Var2 = null;
                    eu5Var2 = eu5Var3;
                    f = f6;
                    hq5Var2 = r13;
                    if (!xlb0Var8.c()) {
                        return xlb0Var2;
                    }
                    xlb0Var6 = xlb0Var2;
                    jmxVar2 = jmxVar5;
                    i5 = 1;
                    jmxVar2.L$0 = hq5Var2;
                    jmxVar2.L$1 = eu5Var2;
                    jmxVar2.L$2 = ref$LongRef;
                    jmxVar2.L$3 = xlb0Var6;
                    jmxVar2.F$0 = f;
                    jmxVar2.F$1 = f2;
                    jmxVar2.label = i5;
                    I1 = eu5Var2.I1(PointerEventPass.Main, jmxVar2);
                    if (I1 != coroutineSingletons) {
                        float f7 = f;
                        f4 = f2;
                        obj = I1;
                        ref$LongRef2 = ref$LongRef;
                        jmxVar3 = jmxVar2;
                        f3 = f7;
                        plb0 plb0Var = (plb0) obj;
                        List<xlb0> list2 = plb0Var.a;
                        size = list2.size();
                        i3 = 0;
                        while (true) {
                            if (i3 < size) {
                                xlb0Var2 = xlb0Var6;
                                jmxVar4 = jmxVar3;
                                xlb0Var3 = xlb0Var2;
                                break;
                            }
                            xlb0Var3 = list2.get(i3);
                            xlb0Var2 = xlb0Var6;
                            jmxVar4 = jmxVar3;
                            if (wlb0.g(xlb0Var3.a, ref$LongRef2.element)) {
                                break;
                            }
                            i3++;
                            jmxVar3 = jmxVar4;
                            xlb0Var6 = xlb0Var2;
                        }
                        xlb0Var4 = xlb0Var3;
                        if (xlb0Var4.c()) {
                            return xlb0Var2;
                        }
                        if (fdi.o(xlb0Var4)) {
                            List<xlb0> list3 = plb0Var.a;
                            int size3 = list3.size();
                            int i7 = 0;
                            while (true) {
                                if (i7 >= size3) {
                                    xlb0Var5 = xlb0Var2;
                                    break;
                                }
                                xlb0Var5 = list3.get(i7);
                                if (xlb0Var5.d) {
                                    break;
                                }
                                i7++;
                            }
                            xlb0 xlb0Var9 = xlb0Var5;
                            if (xlb0Var9 == null) {
                                return xlb0Var2;
                            }
                            ref$LongRef2.element = xlb0Var9.a;
                            f2 = f4;
                            f = f3;
                            xlb0Var6 = xlb0Var2;
                            ref$LongRef = ref$LongRef2;
                            i5 = 1;
                            jmxVar2 = jmxVar4;
                            jmxVar2.L$0 = hq5Var2;
                            jmxVar2.L$1 = eu5Var2;
                            jmxVar2.L$2 = ref$LongRef;
                            jmxVar2.L$3 = xlb0Var6;
                            jmxVar2.F$0 = f;
                            jmxVar2.F$1 = f2;
                            jmxVar2.label = i5;
                            I1 = eu5Var2.I1(PointerEventPass.Main, jmxVar2);
                            if (I1 != coroutineSingletons) {
                            }
                        } else {
                            f2 = (Float.intBitsToFloat((int) (xlb0Var4.c >> 32)) - Float.intBitsToFloat((int) (xlb0Var4.g >> 32))) + f4;
                            if (Math.abs(f2) < f3) {
                                PointerEventPass pointerEventPass = PointerEventPass.Final;
                                jmxVar5 = jmxVar4;
                                jmxVar5.L$0 = hq5Var2;
                                jmxVar5.L$1 = eu5Var2;
                                jmxVar5.L$2 = ref$LongRef2;
                                jmxVar5.L$3 = xlb0Var4;
                                jmxVar5.F$0 = f3;
                                jmxVar5.F$1 = f2;
                                jmxVar5.label = 2;
                                if (eu5Var2.I1(pointerEventPass, jmxVar5) != coroutineSingletons) {
                                    f = f3;
                                    xlb0Var8 = xlb0Var4;
                                    ref$LongRef = ref$LongRef2;
                                    if (!xlb0Var8.c()) {
                                    }
                                }
                            } else {
                                jmx jmxVar6 = jmxVar4;
                                hq5Var2.invoke(xlb0Var4, new Float(f2 - (Math.signum(f2) * f3)));
                                if (xlb0Var4.c()) {
                                    return xlb0Var4;
                                }
                                f = f3;
                                xlb0Var6 = xlb0Var2;
                                jmxVar2 = jmxVar6;
                                ref$LongRef = ref$LongRef2;
                                f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                i5 = 1;
                                jmxVar2.L$0 = hq5Var2;
                                jmxVar2.L$1 = eu5Var2;
                                jmxVar2.L$2 = ref$LongRef;
                                jmxVar2.L$3 = xlb0Var6;
                                jmxVar2.F$0 = f;
                                jmxVar2.F$1 = f2;
                                jmxVar2.label = i5;
                                I1 = eu5Var2.I1(PointerEventPass.Main, jmxVar2);
                                if (I1 != coroutineSingletons) {
                                }
                            }
                        }
                    }
                    return coroutineSingletons;
                }
                float f8 = jmxVar.F$1;
                float f9 = jmxVar.F$0;
                Ref$LongRef ref$LongRef4 = (Ref$LongRef) jmxVar.L$2;
                eu5 eu5Var4 = (eu5) jmxVar.L$1;
                ?? r12 = (wzs) jmxVar.L$0;
                kotlin.a.a(obj);
                jmx jmxVar7 = jmxVar;
                f4 = f8;
                eu5Var2 = eu5Var4;
                jmxVar3 = jmxVar7;
                f3 = f9;
                hq5Var2 = r12;
                ref$LongRef2 = ref$LongRef4;
                plb0 plb0Var2 = (plb0) obj;
                List<xlb0> list22 = plb0Var2.a;
                size = list22.size();
                i3 = 0;
                while (true) {
                    if (i3 < size) {
                    }
                    i3++;
                    jmxVar3 = jmxVar4;
                    xlb0Var6 = xlb0Var2;
                }
                xlb0Var4 = xlb0Var3;
                if (xlb0Var4.c()) {
                }
            }
        }
        jmxVar = new jmx(continuationImpl);
        Object obj2 = jmxVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = jmxVar.label;
        int i52 = 1;
        xlb0 xlb0Var62 = null;
        if (i2 != 0) {
        }
    }

    public static final float l(float f, float f2, float f3) {
        float f4 = f2 - f;
        return swe0.f(f4 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0.0f : (f3 - f) / f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
    }

    public static final float m(float f, float f2, float f3, float f4, float f5) {
        return q6x.z(f4, f5, l(f, f2, f3));
    }

    public static final q630 n(q630 q630Var, float f, final List<Float> list, final boolean z, final izs<? super Float, s3q0> izsVar, final bwf<Float> bwfVar, final int i) {
        final float f2 = swe0.f(f, bwfVar.getStart().floatValue(), bwfVar.c().floatValue());
        return egi0.b(egi0.b(q630Var, false, new izs() { // from class: xsna.bmx
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                tgi0 tgi0Var = (tgi0) obj;
                if (!z) {
                    qgi0.a(tgi0Var);
                }
                final bwf bwfVar2 = bwfVar;
                final int i2 = i;
                final List list2 = list;
                final float f3 = f2;
                final izs izsVar2 = izsVar;
                qgi0.l(tgi0Var, new izs() { // from class: xsna.olx
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // xsna.izs
                    public final Object invoke(Object obj2) {
                        boolean z2;
                        Object obj3;
                        float floatValue = ((Float) obj2).floatValue();
                        bwf bwfVar3 = bwf.this;
                        float f4 = swe0.f(floatValue, ((Number) bwfVar3.getStart()).floatValue(), ((Number) bwfVar3.c()).floatValue());
                        if (i2 > 0) {
                            List list3 = list2;
                            ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
                            Iterator it = list3.iterator();
                            while (it.hasNext()) {
                                arrayList.add(Float.valueOf(q6x.z(((Number) bwfVar3.getStart()).floatValue(), ((Number) bwfVar3.c()).floatValue(), ((Number) it.next()).floatValue())));
                            }
                            Iterator it2 = arrayList.iterator();
                            if (it2.hasNext()) {
                                Object next = it2.next();
                                if (it2.hasNext()) {
                                    float abs = Math.abs(((Number) next).floatValue() - f4);
                                    do {
                                        Object next2 = it2.next();
                                        float abs2 = Math.abs(((Number) next2).floatValue() - f4);
                                        if (Float.compare(abs, abs2) > 0) {
                                            next = next2;
                                            abs = abs2;
                                        }
                                    } while (it2.hasNext());
                                }
                                obj3 = next;
                            } else {
                                obj3 = null;
                            }
                            Float f5 = (Float) obj3;
                            if (f5 != null) {
                                f4 = f5.floatValue();
                            }
                        }
                        if (f4 == f3) {
                            z2 = false;
                        } else {
                            izsVar2.invoke(Float.valueOf(f4));
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                    }
                });
                return s3q0.a;
            }
        }), true, new i3e0(f, bwfVar, i));
    }

    public static final void o(wh50<Float> wh50Var, wh50<Float> wh50Var2, List<Float> list, float f, float f2) {
        float p = p(wh50Var2.getValue().floatValue(), list, f, f2);
        if (wh50Var.getValue().floatValue() == p) {
            return;
        }
        wh50Var.setValue(Float.valueOf(p));
        wh50Var2.setValue(Float.valueOf(p));
    }

    public static final float p(float f, List<Float> list, float f2, float f3) {
        Object obj;
        Iterator<T> it = list.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                float abs = Math.abs(q6x.z(f2, f3, ((Number) next).floatValue()) - f);
                do {
                    Object next2 = it.next();
                    float abs2 = Math.abs(q6x.z(f2, f3, ((Number) next2).floatValue()) - f);
                    if (Float.compare(abs, abs2) > 0) {
                        next = next2;
                        abs = abs2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        Float f4 = (Float) obj;
        return f4 != null ? q6x.z(f2, f3, f4.floatValue()) : f;
    }

    public static final List<Float> q(int i) {
        if (i == 0) {
            return EmptyList.b;
        }
        int i2 = i + 2;
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(Float.valueOf(i3 / (i + 1)));
        }
        return arrayList;
    }
}
