package xsna;

import android.view.View;
import androidx.compose.runtime.a;
import androidx.compose.ui.unit.LayoutDirection;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import java.util.WeakHashMap;
import kotlin.Pair;
import xsna.q630;
import xsna.yqx0;

/* compiled from: NewCoverCropper.kt */
/* loaded from: classes5.dex */
public final class f760 {
    public static final void a(final boolean z, final boolean z2, final zhf0 zhf0Var, final agw agwVar, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(-808827002);
        int i2 = i | (M.l(z) ? 4 : 2) | (M.l(z2) ? 32 : 16) | (M.J(zhf0Var) ? 256 : 128) | (M.y(agwVar) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-808827002, i2, -1, "com.vk.profile.user.impl.ui.edit.cover.crop.CropArea (NewCoverCropper.kt:211)");
            }
            float f = 2;
            azl azlVar = (azl) M.r(uvi.h);
            float f2 = zhf0Var.c;
            float f3 = zhf0Var.b;
            float f4 = zhf0Var.d;
            float f5 = zhf0Var.a;
            long b = byc0.b(azlVar.k1(f2 - f5), azlVar.k1(f4 - f3));
            q630.a aVar2 = q630.a.a;
            if (z) {
                M.K(1225255942);
                s4d0.a((Float.floatToRawIntBits(azlVar.k1(f5)) << 32) | (Float.floatToRawIntBits(azlVar.k1(f4)) & 4294967295L), b, agwVar, z2, txj0.d(aVar2, 1.0f), M, ((i2 << 6) & 7168) | ((i2 >> 3) & 896) | 24576);
                M = M;
                M.j();
            } else {
                M.K(1224961256);
                float k1 = azlVar.k1(f5);
                b(f, (Float.floatToRawIntBits(azlVar.k1(f3)) & 4294967295L) | (Float.floatToRawIntBits(k1) << 32), b, txj0.d(aVar2, 1.0f), M, 3078);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(z, z2, zhf0Var, agwVar, i) { // from class: xsna.c760
                public final /* synthetic */ boolean b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ zhf0 d;
                public final /* synthetic */ agw e;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    f760.a(this.b, this.c, this.d, this.e, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final float f, final long j, final long j2, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(718459579);
        int i2 = i | (M.p(j) ? 32 : 16) | (M.p(j2) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(718459579, i2, -1, "com.vk.profile.user.impl.ui.edit.cover.crop.CropperOverlay (NewCoverCropper.kt:242)");
            }
            ua8.a(q630Var, null, false, kai.c(833211537, new yzs() { // from class: xsna.d760
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if (aVar2.t(intValue & 1, (intValue & 17) != 16)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(833211537, intValue, -1, "com.vk.profile.user.impl.ui.edit.cover.crop.CropperOverlay.<anonymous> (NewCoverCropper.kt:244)");
                        }
                        final float f2 = 12;
                        final float f3 = f;
                        final long j3 = j;
                        final long j4 = j2;
                        rrv0.d(null, null, null, null, kai.c(-821787914, new wzs() { // from class: xsna.y660
                            @Override // xsna.wzs
                            public final Object invoke(Object obj4, Object obj5) {
                                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj4;
                                int intValue2 = ((Integer) obj5).intValue();
                                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(-821787914, intValue2, -1, "com.vk.profile.user.impl.ui.edit.cover.crop.CropperOverlay.<anonymous>.<anonymous> (NewCoverCropper.kt:248)");
                                    }
                                    float f4 = f3;
                                    float f5 = f4 / 2;
                                    q630 D = s200.D(q630.a.a, f5);
                                    long j5 = j3;
                                    q630 l = kci.l(D, rco.a(j5) - f5, rco.b(j5) - f5);
                                    long j6 = j4;
                                    ja8.a(ltk.a(txj0.h(txj0.v(l, uco.c(j6)), uco.b(j6)), aqw.a(f4, l5g.c(14, l5g.d, 0.6f)), null, f2, f2, 18), aVar3, 0);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                } else {
                                    aVar3.h();
                                }
                                return s3q0.a;
                            }
                        }, aVar2), aVar2, 24576, 15);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 3078, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(f, j, j2, q630Var, i) { // from class: xsna.e760
                public final /* synthetic */ float b;
                public final /* synthetic */ long c;
                public final /* synthetic */ long d;
                public final /* synthetic */ q630 e;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(3079);
                    f760.b(this.b, this.c, this.d, this.e, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(final njw njwVar, final gzs gzsVar, final boolean z, final izs izsVar, final gzs gzsVar2, final q630 q630Var, final gzs gzsVar3, final agw agwVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        agw agwVar2;
        androidx.compose.runtime.a M = aVar.M(-1504467126);
        if ((i & 6) == 0) {
            i2 = (M.J(njwVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(izsVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.y(gzsVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(q630Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= M.y(gzsVar3) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            agwVar2 = agwVar;
            i2 |= M.y(agwVar2) ? 8388608 : 4194304;
        } else {
            agwVar2 = agwVar;
        }
        if (M.t(i2 & 1, (4793491 & i2) != 4793490)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1504467126, i2, -1, "com.vk.profile.user.impl.ui.edit.cover.crop.NewCoverCropper (NewCoverCropper.kt:63)");
            }
            final agw agwVar3 = agwVar2;
            ua8.a(rte0.e(q630Var), null, false, kai.c(870351392, new yzs() { // from class: xsna.z660
                /* JADX WARN: Multi-variable type inference failed */
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    va8 va8Var;
                    int i3;
                    int i4;
                    long j;
                    int i5;
                    int i6;
                    mxj0 mxj0Var;
                    final float f;
                    float f2;
                    float f3;
                    q630 q630Var2;
                    q630 q630Var3;
                    va8 va8Var2 = (va8) obj;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar2.J(va8Var2) ? 4 : 2;
                    }
                    if (aVar2.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(870351392, intValue, -1, "com.vk.profile.user.impl.ui.edit.cover.crop.NewCoverCropper.<anonymous> (NewCoverCropper.kt:65)");
                        }
                        njw njwVar2 = njw.this;
                        agw agwVar4 = (agw) njwVar2.b;
                        mxj0 mxj0Var2 = (mxj0) njwVar2.a;
                        long j2 = mxj0Var2.a;
                        azl azlVar = (azl) aVar2.r(uvi.h);
                        LayoutDirection layoutDirection = (LayoutDirection) aVar2.r(uvi.n);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1596175702, 6, -1, "androidx.compose.foundation.layout.<get-navigationBars> (WindowInsets.android.kt:176)");
                        }
                        WeakHashMap<View, yqx0> weakHashMap = yqx0.w;
                        te2 te2Var = yqx0.a.c(aVar2).e;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        int i7 = te2Var.e().a;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1596175702, 6, -1, "androidx.compose.foundation.layout.<get-navigationBars> (WindowInsets.android.kt:176)");
                        }
                        te2 te2Var2 = yqx0.a.c(aVar2).e;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        int i8 = te2Var2.e().c;
                        int i9 = (i7 - i8) / 2;
                        if (androidx.compose.runtime.b.d()) {
                            va8Var = va8Var2;
                            i3 = intValue;
                            androidx.compose.runtime.b.f(266248589, 0, -1, "com.vk.profile.user.impl.ui.edit.cover.crop.getActionBarOffset (NewCoverCropper.kt:188)");
                        } else {
                            va8Var = va8Var2;
                            i3 = intValue;
                        }
                        float f4 = 0;
                        aVar2.K(-1833140787);
                        if (androidx.compose.runtime.b.d()) {
                            i4 = i8;
                            androidx.compose.runtime.b.f(-675090670, 6, -1, "androidx.compose.foundation.layout.<get-statusBars> (WindowInsets.android.kt:180)");
                        } else {
                            i4 = i8;
                        }
                        te2 te2Var3 = yqx0.a.c(aVar2).f;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        float j1 = azlVar.j1(te2Var3.e().b);
                        aVar2.j();
                        float f5 = j1 + f4;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        int i10 = i3 & 14;
                        if (androidx.compose.runtime.b.d()) {
                            j = j2;
                            androidx.compose.runtime.b.f(1012043494, i10, -1, "com.vk.profile.user.impl.ui.edit.cover.crop.getApplyButtonsOffset (NewCoverCropper.kt:192)");
                        } else {
                            j = j2;
                        }
                        float g = va8Var.g() + 16;
                        aVar2.K(1911192557);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1596175702, 6, -1, "androidx.compose.foundation.layout.<get-navigationBars> (WindowInsets.android.kt:176)");
                        }
                        te2 te2Var4 = yqx0.a.c(aVar2).e;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        float j12 = azlVar.j1(te2Var4.e().d);
                        aVar2.j();
                        float f6 = j12 + g;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        float f7 = 2;
                        float f8 = 8 + f7;
                        gzs gzsVar4 = gzsVar2;
                        float f9 = ((pco) gzsVar4.invoke()).b;
                        int b = an10.b((float) Math.floor(azlVar.I0(f8)));
                        int b2 = an10.b((float) Math.floor(azlVar.I0(f9)));
                        long b3 = wa8.b((int) Float.intBitsToFloat((int) (j >> 32)), (int) Float.intBitsToFloat((int) (j & 4294967295L)), va8Var.f());
                        if (androidx.compose.runtime.b.d()) {
                            i5 = b2;
                            i6 = i7;
                            androidx.compose.runtime.b.f(1788733564, 0, -1, "com.vk.profile.user.impl.ui.edit.cover.crop.getCropSize (NewCoverCropper.kt:195)");
                        } else {
                            i5 = b2;
                            i6 = i7;
                        }
                        int i11 = ((int) (b3 >> 32)) - (b * 2);
                        if (i11 < 0) {
                            i11 = 0;
                        }
                        int i12 = ((int) (b3 & 4294967295L)) - i5;
                        if (i12 < 0) {
                            i12 = 0;
                        }
                        Pair pair = new Pair(Integer.valueOf(Math.min(i11, i12)), Integer.valueOf(an10.b((float) Math.floor(r6 * 0.4f))));
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        int intValue2 = ((Number) pair.d()).intValue();
                        int intValue3 = ((Number) pair.g()).intValue();
                        float a = wq.a(f6, f5, f7, f5);
                        final gzs gzsVar5 = gzsVar;
                        boolean booleanValue = ((Boolean) gzsVar5.invoke()).booleanValue();
                        final boolean z2 = z;
                        if (booleanValue) {
                            mxj0Var = mxj0Var2;
                            f = (z2 ? 62 : 36) / f7;
                        } else {
                            mxj0Var = mxj0Var2;
                            f = f4;
                        }
                        float f10 = intValue3 / 2;
                        float k1 = azlVar.k1((((r13 - intValue3) - i5) / 2) - (azlVar.I0(a - f) - f10));
                        boolean J = aVar2.J(agwVar4) | aVar2.p(b3);
                        Object x = aVar2.x();
                        Object obj4 = a.C0011a.a;
                        if (J || x == obj4) {
                            x = p490.e((Float.floatToRawIntBits(((r5 - intValue2) / 2.0f) + i9) << 32) | (Float.floatToRawIntBits(azlVar.I0(r9) - f10) & 4294967295L), (Float.floatToRawIntBits(intValue2) << 32) | (Float.floatToRawIntBits(intValue3) & 4294967295L));
                            aVar2.R(x);
                        }
                        zhf0 zhf0Var = (zhf0) x;
                        Object x2 = aVar2.x();
                        if (x2 == obj4) {
                            x2 = androidx.compose.runtime.k.b(null);
                            aVar2.R(x2);
                        }
                        final wh50 wh50Var = (wh50) x2;
                        if (androidx.compose.runtime.b.d()) {
                            f2 = k1;
                            androidx.compose.runtime.b.f(470020527, 0, -1, "com.vk.profile.user.impl.ui.edit.cover.crop.getStartPadding (NewCoverCropper.kt:171)");
                        } else {
                            f2 = k1;
                        }
                        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
                        float j13 = azlVar.j1(layoutDirection == layoutDirection2 ? i6 : i4);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            f3 = j13;
                            androidx.compose.runtime.b.f(-142879768, 0, -1, "com.vk.profile.user.impl.ui.edit.cover.crop.getEndPadding (NewCoverCropper.kt:179)");
                        } else {
                            f3 = j13;
                        }
                        float j14 = azlVar.j1(layoutDirection == layoutDirection2 ? i4 : i6);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        float f11 = (f2 * f7) + ((pco) gzsVar4.invoke()).b;
                        q630.a aVar3 = q630.a.a;
                        q630 d = txj0.d(aVar3, 1.0f);
                        q630 d2 = txj0.d(aVar3, 1.0f);
                        q630 G = s200.G(aVar3, f8 + f3, ((pco) swe0.c(new pco(-f11), new pco(f4))).b, f8 + j14, ((pco) swe0.c(new pco(f11), new pco(f4))).b);
                        long floatToRawIntBits = (Float.floatToRawIntBits(384.0f) & 4294967295L) | (Float.floatToRawIntBits(960.0f) << 32);
                        long j3 = mxj0Var.a;
                        if (androidx.compose.runtime.b.d()) {
                            q630Var2 = d2;
                            q630Var3 = d;
                            androidx.compose.runtime.b.f(1155173385, 0, -1, "com.vk.profile.user.impl.ui.edit.cover.crop.cropper.rememberCropperState (ImageCropper.kt:187)");
                        } else {
                            q630Var2 = d2;
                            q630Var3 = d;
                        }
                        boolean J2 = aVar2.J(agwVar4) | aVar2.p(j3) | aVar2.p(floatToRawIntBits) | aVar2.J(zhf0Var);
                        Object x3 = aVar2.x();
                        if (J2 || x3 == obj4) {
                            int i13 = (int) (j3 >> 32);
                            int i14 = (int) (j3 & 4294967295L);
                            float max = Math.max(Float.intBitsToFloat(i13) / agwVar4.getWidth(), Float.intBitsToFloat(i14) / agwVar4.getHeight());
                            float min = Math.min(Float.intBitsToFloat(i13) / Float.intBitsToFloat((int) (floatToRawIntBits >> 32)), Float.intBitsToFloat(i14) / Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)));
                            float max2 = Math.max((zhf0Var.c - zhf0Var.a) / Float.intBitsToFloat(i13), (zhf0Var.d - zhf0Var.b) / Float.intBitsToFloat(i14)) * max;
                            float f12 = min * max2;
                            x3 = new ajk((Float.floatToRawIntBits(agwVar4.getWidth()) << 32) | (Float.floatToRawIntBits(agwVar4.getHeight()) & 4294967295L), zhf0Var, max2, f12 < max2 ? max2 : f12);
                            aVar2.R(x3);
                        }
                        ajk ajkVar = (ajk) x3;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long c = ((Boolean) gzsVar5.invoke()).booleanValue() ? l5g.b : l5g.c(14, l5g.b, 0.6f);
                        boolean l = aVar2.l(z2) | aVar2.J(gzsVar5) | aVar2.n(f);
                        Object x4 = aVar2.x();
                        if (l || x4 == obj4) {
                            x4 = new wzs() { // from class: xsna.b760
                                @Override // xsna.wzs
                                public final Object invoke(Object obj5, Object obj6) {
                                    oio oioVar = (oio) obj5;
                                    zhf0 zhf0Var2 = (zhf0) obj6;
                                    if (!z2 && ((Boolean) gzsVar5.invoke()).booleanValue()) {
                                        zhf0Var2 = zhf0.b(zhf0Var2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, oioVar.I0(22) + zhf0Var2.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, zhf0Var2.d - oioVar.I0(28), 5);
                                    }
                                    zhf0 zhf0Var3 = zhf0Var2;
                                    float f13 = zhf0Var3.b;
                                    float f14 = f;
                                    zhf0 b4 = zhf0.b(zhf0Var3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f13 - oioVar.I0(f14), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, zhf0Var3.d - oioVar.I0(f14), 5);
                                    wh50Var.setValue(b4);
                                    long e = b4.e();
                                    long d3 = b4.d();
                                    long j4 = l5g.b;
                                    float f15 = 2;
                                    float I0 = oioVar.I0(f15);
                                    float I02 = oioVar.I0(f15);
                                    oio.C1(oioVar, j4, e, d3, (Float.floatToRawIntBits(I0) << 32) | (Float.floatToRawIntBits(I02) & 4294967295L), null, 112);
                                    return s3q0.a;
                                }
                            };
                            aVar2.R(x4);
                        }
                        wzs wzsVar = (wzs) x4;
                        boolean J3 = aVar2.J(gzsVar5);
                        Object x5 = aVar2.x();
                        if (J3 || x5 == obj4) {
                            x5 = new n7w(gzsVar5, 14);
                            aVar2.R(x5);
                        }
                        gzs gzsVar6 = (gzs) x5;
                        boolean J4 = aVar2.J(gzsVar5);
                        Object x6 = aVar2.x();
                        if (J4 || x6 == obj4) {
                            x6 = new ixn(1, gzsVar5);
                            aVar2.R(x6);
                        }
                        iiw.c(agwVar4, ajkVar, c, izsVar, wzsVar, q630Var3, q630Var2, G, gzsVar3, gzsVar6, (gzs) x6, false, aVar2, 1769472);
                        zhf0 zhf0Var2 = (zhf0) wh50Var.getValue();
                        if (zhf0Var2 == null) {
                            aVar2.K(-75027376);
                        } else {
                            aVar2.K(-75027375);
                            f760.a(((Boolean) gzsVar5.invoke()).booleanValue(), z2, zhf0Var2, agwVar3, aVar2, 0);
                            s3q0 s3q0Var = s3q0.a;
                        }
                        aVar2.j();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 3072, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.a760
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    f760.c(njw.this, gzsVar, z, izsVar, gzsVar2, q630Var, gzsVar3, agwVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
