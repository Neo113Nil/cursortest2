package xsna;

import android.annotation.SuppressLint;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.a;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.LayoutDirection;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Ref$FloatRef;
import xsna.a5x;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: SegmentedSlider.kt */
/* loaded from: classes2.dex */
public final class c6i0 {
    public static final float a = (float) 4.0d;
    public static final float b = (float) 2.0d;
    public static final float c = (float) 3.0d;
    public static final float d = 10;
    public static final q630 e = txj0.j(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 48, 1, txj0.x(144, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630.a.a));

    @SuppressLint({"UnusedBoxWithConstraintsScope"})
    public static final void a(final mtk0 mtk0Var, final mtk0 mtk0Var2, final izs izsVar, final q630 q630Var, final boolean z, final awf awfVar, final boolean z2, final float f, final long j, final gzs gzsVar, sg50 sg50Var, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a aVar2;
        final sg50 sg50Var2;
        sg50 sg50Var3;
        androidx.compose.runtime.a M = aVar.M(-1630880343);
        int i2 = i | (M.J(mtk0Var) ? 4 : 2) | (M.J(mtk0Var2) ? 32 : 16) | (M.y(izsVar) ? 256 : 128) | (M.J(q630Var) ? 2048 : 1024) | (M.l(z) ? 16384 : 8192) | (M.J(awfVar) ? 131072 : 65536) | 1572864 | (M.l(z2) ? 8388608 : 4194304) | (M.n(f) ? 67108864 : 33554432) | (M.p(j) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456);
        int i3 = (M.y(gzsVar) ? 4 : 2) | 48;
        if (M.t(i2 & 1, ((i2 & 306783379) == 306783378 && (i3 & 19) == 18) ? false : true)) {
            M.V();
            if ((i & 1) == 0 || M.i()) {
                Object x = M.x();
                if (x == a.C0011a.a) {
                    x = ir.h(M);
                }
                sg50Var3 = (sg50) x;
            } else {
                M.h();
                sg50Var3 = sg50Var;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1630880343, i2, i3, "com.vk.libvideo.design.compose.base.timeline.SegmentedSlider (SegmentedSlider.kt:101)");
            }
            final wh50 c2 = androidx.compose.runtime.k.c(izsVar, M, (i2 >> 6) & 14);
            iyk0 iyk0Var = abx.a;
            q630 g = q630Var.g(as20.a);
            float f2 = d * 2;
            aVar2 = M;
            final sg50 sg50Var4 = sg50Var3;
            ua8.a(mxr.a(egi0.b(txj0.o(g, f2, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12), true, new izs() { // from class: xsna.v5i0
                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    tgi0 tgi0Var = (tgi0) obj;
                    if (!z) {
                        qgi0.a(tgi0Var);
                    }
                    final mtk0 mtk0Var3 = mtk0Var;
                    final awf awfVar2 = awfVar;
                    final izs izsVar2 = izsVar;
                    final gzs gzsVar2 = gzsVar;
                    qgi0.l(tgi0Var, new izs() { // from class: xsna.y5i0
                        @Override // xsna.izs
                        public final Object invoke(Object obj2) {
                            boolean z3;
                            float floatValue = ((Float) obj2).floatValue();
                            float floatValue2 = ((Number) mtk0.this.getValue()).floatValue();
                            awf awfVar3 = awfVar2;
                            float f3 = awfVar3.b;
                            float floatValue3 = Float.valueOf(f3).floatValue();
                            float f4 = awfVar3.c;
                            float f5 = swe0.f(floatValue2, floatValue3, Float.valueOf(f4).floatValue());
                            float f6 = swe0.f(floatValue, Float.valueOf(f3).floatValue(), Float.valueOf(f4).floatValue());
                            if (f6 == f5) {
                                z3 = false;
                            } else {
                                izsVar2.invoke(Float.valueOf(f6));
                                gzs gzsVar3 = gzsVar2;
                                if (gzsVar3 != null) {
                                    gzsVar3.invoke();
                                }
                                z3 = true;
                            }
                            return Boolean.valueOf(z3);
                        }
                    });
                    qgi0.m(tgi0Var, new t1e0(((Number) swe0.k((Comparable) mtk0Var3.getValue(), awfVar2)).floatValue(), awfVar2, 0));
                    return s3q0.a;
                }
            }), z, sg50Var3), null, false, kai.c(1752128511, new yzs() { // from class: xsna.n5i0
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Object obj4;
                    va8 va8Var = (va8) obj;
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar3.J(va8Var) ? 4 : 2;
                    }
                    if (aVar3.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1752128511, intValue, -1, "com.vk.libvideo.design.compose.base.timeline.SegmentedSlider.<anonymous> (SegmentedSlider.kt:116)");
                        }
                        Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
                        Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
                        final float i4 = o6j.i(va8Var.f());
                        final boolean z3 = aVar3.r(uvi.n) == LayoutDirection.Rtl;
                        azl azlVar = (azl) aVar3.r(uvi.h);
                        float I0 = azlVar.I0(c6i0.d);
                        float max = Math.max(i4 - I0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        ref$FloatRef.element = max;
                        ref$FloatRef2.element = Math.min(I0, max);
                        float k1 = azlVar.k1(i4);
                        Object x2 = aVar3.x();
                        awf awfVar2 = awf.this;
                        mtk0 mtk0Var3 = mtk0Var;
                        Object obj5 = a.C0011a.a;
                        if (x2 == obj5) {
                            x2 = androidx.compose.runtime.k.b(Float.valueOf(q6x.z(ref$FloatRef2.element, ref$FloatRef.element, c6i0.e(Float.valueOf(awfVar2.b).floatValue(), Float.valueOf(awfVar2.c).floatValue(), ((Number) mtk0Var3.getValue()).floatValue()))));
                            aVar3.R(x2);
                        }
                        final wh50 wh50Var = (wh50) x2;
                        Object x3 = aVar3.x();
                        if (x3 == obj5) {
                            x3 = androidx.compose.runtime.k.b(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                            aVar3.R(x3);
                        }
                        final wh50 wh50Var2 = (wh50) x3;
                        boolean n = aVar3.n(ref$FloatRef2.element) | aVar3.n(ref$FloatRef.element) | aVar3.J(awfVar2);
                        Object x4 = aVar3.x();
                        if (n || x4 == obj5) {
                            u5i0 u5i0Var = new u5i0(wh50Var, wh50Var2, ref$FloatRef2, ref$FloatRef, c2, awfVar2);
                            obj4 = awfVar2;
                            x4 = new r0k0(u5i0Var);
                            aVar3.R(x4);
                        } else {
                            obj4 = awfVar2;
                        }
                        final r0k0 r0k0Var = (r0k0) x4;
                        boolean y = aVar3.y(r0k0Var);
                        Object obj6 = gzsVar;
                        boolean J = y | aVar3.J(obj6);
                        Object x5 = aVar3.x();
                        if (J || x5 == obj5) {
                            x5 = new nm1(24, r0k0Var, obj6);
                            aVar3.R(x5);
                        }
                        final wh50 c3 = androidx.compose.runtime.k.c((izs) x5, aVar3, 0);
                        a5x.a aVar4 = a5x.a;
                        final boolean z4 = z;
                        final sg50 sg50Var5 = sg50Var4;
                        yzs yzsVar = new yzs() { // from class: xsna.o5i0
                            @Override // xsna.yzs
                            public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                q630 q630Var2 = (q630) obj7;
                                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj8;
                                int intValue2 = ((Integer) obj9).intValue();
                                aVar5.K(-1249367694);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(-1249367694, intValue2, -1, "com.vk.libvideo.design.compose.base.timeline.sliderTapModifier.<anonymous> (SegmentedSlider.kt:493)");
                                }
                                if (z4) {
                                    aVar5.K(273670054);
                                    Object x6 = aVar5.x();
                                    Object obj10 = a.C0011a.a;
                                    if (x6 == obj10) {
                                        x6 = bap.j(EmptyCoroutineContext.b, aVar5);
                                        aVar5.R(x6);
                                    }
                                    yvj yvjVar = (yvj) x6;
                                    float f3 = i4;
                                    Float valueOf = Float.valueOf(f3);
                                    boolean z5 = z3;
                                    Boolean valueOf2 = Boolean.valueOf(z5);
                                    gho ghoVar = r0k0Var;
                                    Object[] objArr = {ghoVar, sg50Var5, valueOf, valueOf2};
                                    boolean l = aVar5.l(z5) | aVar5.n(f3);
                                    wh50 wh50Var3 = wh50Var2;
                                    boolean J2 = l | aVar5.J(wh50Var3);
                                    mtk0 mtk0Var4 = wh50Var;
                                    boolean J3 = J2 | aVar5.J(mtk0Var4) | aVar5.y(yvjVar) | aVar5.y(ghoVar);
                                    wh50 wh50Var4 = c3;
                                    boolean J4 = J3 | aVar5.J(wh50Var4);
                                    Object x7 = aVar5.x();
                                    if (J4 || x7 == obj10) {
                                        Object b6i0Var = new b6i0(z5, f3, wh50Var3, mtk0Var4, yvjVar, ghoVar, wh50Var4);
                                        aVar5.R(b6i0Var);
                                        x7 = b6i0Var;
                                    }
                                    q630Var2 = skn0.c(q630Var2, objArr, (PointerInputEventHandler) x7);
                                    aVar5.j();
                                } else {
                                    aVar5.K(274670548);
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
                        boolean booleanValue = ((Boolean) ((zak0) r0k0Var.b).getValue()).booleanValue();
                        boolean J2 = aVar3.J(c3);
                        Object x6 = aVar3.x();
                        if (J2 || x6 == obj5) {
                            x6 = new z5i0(c3, null);
                            aVar3.R(x6);
                        }
                        q630 a3 = fho.a(aVar5, r0k0Var, orientation, z4, sg50Var5, booleanValue, (yzs) x6, z3, 32);
                        boolean J3 = aVar3.J(mtk0Var3) | aVar3.J(obj4);
                        Object x7 = aVar3.x();
                        if (J3 || x7 == obj5) {
                            x7 = bbk0.b(new com.vk.movika.sdk.base.presenter.c(22, obj4, mtk0Var3));
                            aVar3.R(x7);
                        }
                        mtk0 mtk0Var4 = (mtk0) x7;
                        Object obj7 = mtk0Var2;
                        boolean J4 = aVar3.J(obj7) | aVar3.J(obj4);
                        Object x8 = aVar3.x();
                        if (J4 || x8 == obj5) {
                            x8 = bbk0.b(new zv(17, obj4, obj7));
                            aVar3.R(x8);
                        }
                        mtk0 mtk0Var5 = (mtk0) x8;
                        if (!z4) {
                            a3 = aVar5;
                        }
                        c6i0.c(mtk0Var4, mtk0Var5, k1, f, z2, j, sg50Var5, a2.g(a3), aVar3, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, aVar2), aVar2, 3072, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            sg50Var2 = sg50Var4;
        } else {
            aVar2 = M;
            aVar2.h();
            sg50Var2 = sg50Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(mtk0Var2, izsVar, q630Var, z, awfVar, z2, f, j, gzsVar, sg50Var2, i) { // from class: xsna.t5i0
                public final /* synthetic */ mtk0 c;
                public final /* synthetic */ izs d;
                public final /* synthetic */ q630 e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ awf g;
                public final /* synthetic */ boolean h;
                public final /* synthetic */ float i;
                public final /* synthetic */ long j;
                public final /* synthetic */ gzs k;
                public final /* synthetic */ sg50 l;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    c6i0.a(mtk0.this, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, (androidx.compose.runtime.a) obj, ne7.I(1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final mtk0 mtk0Var, final mtk0 mtk0Var2, final boolean z, final long j, final float f, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        boolean z2;
        int i3;
        androidx.compose.runtime.a M = aVar.M(-1607008900);
        if ((i & 6) == 0) {
            i2 = (M.J(mtk0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(mtk0Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(null) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            z2 = z;
            i2 |= M.l(z2) ? 2048 : 1024;
        } else {
            z2 = z;
        }
        if ((i & 24576) == 0) {
            i2 |= M.p(j) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.n(f) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= M.J(q630Var) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (M.t(i2 & 1, (i2 & 599187) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1607008900, i2, -1, "com.vk.libvideo.design.compose.base.timeline.SegmentedTrack (SegmentedSlider.kt:289)");
            }
            long j2 = l5g.d;
            final long c2 = l5g.c(14, j2, 0.12f);
            final long c3 = l5g.c(14, j2, 0.28f);
            q630 h = txj0.h(txj0.f(q630Var, 1.0f), a);
            final float[] fArr = null;
            boolean y = ((i2 & 14) == 4) | ((i2 & 112) == 32) | ((458752 & i2) == 131072) | M.y(null) | ((57344 & i2) == 16384) | ((i2 & 7168) == 2048);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                final boolean z3 = z2;
                i3 = 0;
                izs izsVar = new izs() { // from class: xsna.p5i0
                    {
                        float f2 = c6i0.a;
                    }

                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        long j3;
                        long j4;
                        long j5;
                        long j6;
                        long j7;
                        long j8;
                        float[] fArr2;
                        float f2;
                        float f3;
                        int i4;
                        long j9;
                        long j10;
                        long j11;
                        float f4;
                        long j12;
                        long j13;
                        long j14;
                        long j15;
                        long j16;
                        float f5 = c6i0.a;
                        oio oioVar = (oio) obj;
                        float floatValue = ((Number) mtk0Var.getValue()).floatValue();
                        float floatValue2 = ((Number) mtk0Var2.getValue()).floatValue();
                        float intBitsToFloat = Float.intBitsToFloat((int) (oioVar.n1() & 4294967295L));
                        long floatToRawIntBits = (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L);
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (oioVar.d() >> 32));
                        float intBitsToFloat3 = Float.intBitsToFloat((int) (oioVar.n1() & 4294967295L));
                        long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat2) << 32);
                        float I0 = oioVar.I0(c6i0.b);
                        float I02 = oioVar.I0(c6i0.c);
                        float I03 = oioVar.I0(f);
                        float I04 = oioVar.I0(f5);
                        long q = xus.q(floatToRawIntBits, floatToRawIntBits2, floatValue);
                        long q2 = xus.q(floatToRawIntBits, floatToRawIntBits2, floatValue2);
                        float[] fArr3 = fArr;
                        long j17 = c2;
                        long j18 = c3;
                        long j19 = j17;
                        long j20 = j;
                        if (fArr3 != null) {
                            long j21 = j20;
                            if (fArr3.length >= 2) {
                                float f6 = fArr3[0];
                                int length = fArr3.length;
                                int i5 = 1;
                                while (i5 < length) {
                                    int i6 = length;
                                    float f7 = fArr3[i5];
                                    float f8 = I04;
                                    oio oioVar2 = oioVar;
                                    if ((f7 - f6) * (Float.intBitsToFloat((int) (floatToRawIntBits2 >> 32)) - Float.intBitsToFloat((int) (floatToRawIntBits >> 32))) >= I02 || i5 >= fArr3.length - 1) {
                                        float f9 = 2;
                                        long floatToRawIntBits3 = (Float.floatToRawIntBits(Math.min(r2 / f9, I0) / f9) << 32) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L);
                                        float f10 = I0;
                                        fArr2 = fArr3;
                                        long f11 = ov70.f(xus.q(floatToRawIntBits, floatToRawIntBits2, f6), floatToRawIntBits3);
                                        long e2 = ov70.e(xus.q(floatToRawIntBits, floatToRawIntBits2, f7), floatToRawIntBits3);
                                        if (!z3 || floatValue <= f6 || floatValue >= f7) {
                                            f2 = f6;
                                            f3 = I03;
                                        } else {
                                            f2 = f6;
                                            f3 = f8;
                                        }
                                        i4 = i5;
                                        oioVar = oioVar2;
                                        long j22 = j19;
                                        j9 = floatToRawIntBits;
                                        long j23 = j21;
                                        j10 = floatToRawIntBits2;
                                        j11 = j23;
                                        float f12 = f2;
                                        f4 = f10;
                                        oioVar.b1(f3, (r20 & 16) != 0 ? 0 : 0, 3, j22, f11, e2);
                                        j12 = j22;
                                        if (floatValue2 > f7) {
                                            j13 = j18;
                                            oioVar.b1(f3, (r20 & 16) != 0 ? 0 : 0, 3, j13, f11, e2);
                                            j14 = e2;
                                        } else {
                                            j13 = j18;
                                            j14 = e2;
                                            if (floatValue2 > f12) {
                                                oioVar.b1(f3, (r20 & 16) != 0 ? 0 : 0, 3, j13, f11, q2);
                                            }
                                        }
                                        j15 = j13;
                                        if (floatValue > f7) {
                                            oioVar.b1(f3, (r20 & 16) != 0 ? 0 : 0, 3, j11, f11, j14);
                                        } else if (floatValue > f12) {
                                            long j24 = q;
                                            oioVar.b1(f3, (r20 & 16) != 0 ? 0 : 0, 3, j11, f11, j24);
                                            j11 = j11;
                                            j16 = j24;
                                            f6 = f7;
                                        } else {
                                            j11 = j11;
                                        }
                                        j16 = q;
                                        f6 = f7;
                                    } else {
                                        f4 = I0;
                                        fArr2 = fArr3;
                                        j15 = j18;
                                        j16 = q;
                                        j12 = j19;
                                        j11 = j21;
                                        oioVar = oioVar2;
                                        j9 = floatToRawIntBits;
                                        j10 = floatToRawIntBits2;
                                        i4 = i5;
                                    }
                                    i5 = i4 + 1;
                                    I0 = f4;
                                    q = j16;
                                    floatToRawIntBits = j9;
                                    floatToRawIntBits2 = j10;
                                    length = i6;
                                    I04 = f8;
                                    fArr3 = fArr2;
                                    j21 = j11;
                                    j19 = j12;
                                    j18 = j15;
                                }
                                return s3q0.a;
                            }
                            j3 = j21;
                            j5 = j18;
                            j6 = q;
                            j7 = j19;
                            j8 = floatToRawIntBits;
                            j4 = floatToRawIntBits2;
                        } else {
                            j3 = j20;
                            j4 = floatToRawIntBits2;
                            j5 = j18;
                            j6 = q;
                            j7 = j19;
                            j8 = floatToRawIntBits;
                        }
                        long j25 = j8;
                        oioVar.b1(I03, (r20 & 16) != 0 ? 0 : 0, 3, j7, j25, j4);
                        oioVar.b1(I03, (r20 & 16) != 0 ? 0 : 0, 3, j5, j25, q2);
                        oioVar.b1(I03, (r20 & 16) != 0 ? 0 : 0, 3, j3, j25, j6);
                        return s3q0.a;
                    }
                };
                M.R(izsVar);
                x = izsVar;
            } else {
                i3 = 0;
            }
            xa4.i(i3, M, (izs) x, h);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.q5i0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    c6i0.b(mtk0.this, mtk0Var2, z, j, f, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(final mtk0 mtk0Var, final mtk0 mtk0Var2, final float f, final float f2, final boolean z, final long j, final sg50 sg50Var, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(-673306903);
        int i2 = i | (M.J(mtk0Var) ? 4 : 2) | (M.J(mtk0Var2) ? 32 : 16) | (M.J(null) ? 256 : 128) | (M.n(f) ? 2048 : 1024) | (M.n(f2) ? 16384 : 8192) | (M.l(z) ? 131072 : 65536) | (M.p(j) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (M.J(sg50Var) ? 8388608 : 4194304) | (M.J(q630Var) ? 67108864 : 33554432);
        if (M.t(i2 & 1, (38347923 & i2) != 38347922)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-673306903, i2, -1, "com.vk.libvideo.design.compose.base.timeline.SliderImpl (SegmentedSlider.kt:217)");
            }
            q630 g = q630Var.g(e);
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
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new SnapshotStateList();
                M.R(x);
            }
            SnapshotStateList snapshotStateList = (SnapshotStateList) x;
            boolean z2 = (29360128 & i2) == 8388608;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new a6i0(sg50Var, snapshotStateList, null);
                M.R(x2);
            }
            bap.g(sg50Var, (wzs) x2, M, (i2 >> 21) & 14);
            boolean isEmpty = snapshotStateList.isEmpty();
            boolean z3 = !isEmpty;
            final mtk0 a2 = hg2.a(!isEmpty ? 15 : 11, null, null, M, 0, 14);
            int i3 = i2 & 14;
            boolean n = M.n(((pco) a2.getValue()).b) | ((i2 & 7168) == 2048) | (i3 == 4);
            Object x3 = M.x();
            if (n || x3 == c0012a) {
                x3 = bbk0.b(new gzs() { // from class: xsna.w5i0
                    @Override // xsna.gzs
                    public final Object invoke() {
                        return new pco(((Number) mtk0Var.getValue()).floatValue() * (f - ((pco) a2.getValue()).b));
                    }
                });
                M.R(x3);
            }
            mtk0 mtk0Var3 = (mtk0) x3;
            b(mtk0Var, mtk0Var2, z3, j, f2, txj0.d(q630.a.a, 1.0f), M, 1572864 | i3 | (i2 & 112) | (i2 & 896) | (57344 & (i2 >> 6)) | ((i2 << 3) & 458752));
            M = M;
            if (z) {
                M.K(786834537);
                d(mtk0Var3, sg50Var, ((pco) a2.getValue()).b, l5g.d, null, M, 24582 | ((i2 >> 15) & 896));
                M = M;
            } else {
                M.K(776479359);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(mtk0Var2, f, f2, z, j, sg50Var, q630Var, i) { // from class: xsna.x5i0
                public final /* synthetic */ mtk0 c;
                public final /* synthetic */ float d;
                public final /* synthetic */ float e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ long g;
                public final /* synthetic */ sg50 h;
                public final /* synthetic */ q630 i;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    c6i0.c(mtk0.this, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void d(final mtk0 mtk0Var, final sg50 sg50Var, final float f, final long j, q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-936634809);
        int i3 = i & 6;
        ra8 ra8Var = ra8.a;
        if (i3 == 0) {
            i2 = (M.J(ra8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(mtk0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(sg50Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.n(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.p(j) ? 16384 : 8192;
        }
        int i4 = i2 | 196608;
        if (M.t(i4 & 1, (74899 & i4) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-936634809, i4, -1, "com.vk.libvideo.design.compose.base.timeline.SliderThumb (SegmentedSlider.kt:260)");
            }
            azl azlVar = (azl) M.r(uvi.h);
            boolean J = M.J(azlVar) | ((i4 & 112) == 32);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                x = new r5i0(0, azlVar, mtk0Var);
                M.R(x);
            }
            q630Var = q630.a.a;
            q630 a2 = rdu.a(q630Var, (izs) x);
            dt1.a.getClass();
            q630 b2 = ra8Var.b(a2, dt1.a.e);
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
            f9t.e(hr80.m(pgv.a(txj0.s(q630Var, f, f), sg50Var), j, vog0.a), M, 0);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        final q630 q630Var2 = q630Var;
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.s5i0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    c6i0.d(mtk0.this, sg50Var, f, j, q630Var2, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final float e(float f, float f2, float f3) {
        float f4 = f2 - f;
        return swe0.f(f4 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0.0f : (f3 - f) / f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
    }
}
