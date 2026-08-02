package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.SliderSize;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.NoWhenBranchMatchedException;
import xsna.cri;
import xsna.dt1;
import xsna.k0k0;
import xsna.q630;

/* compiled from: VkSlider.kt */
/* loaded from: classes17.dex */
public final class hkv0 {
    public static final void a(final bwf bwfVar, final izs izsVar, q630 q630Var, final boolean z, final SliderSize sliderSize, final bwf bwfVar2, final int i, final pml pmlVar, androidx.compose.runtime.a aVar, final int i2) {
        bwf bwfVar3;
        int i3;
        izs izsVar2;
        bwf bwfVar4;
        int i4;
        pml pmlVar2;
        final q630 q630Var2;
        q630 q630Var3;
        int i5;
        androidx.compose.runtime.a M = aVar.M(-564186993);
        if ((i2 & 6) == 0) {
            bwfVar3 = bwfVar;
            i3 = (M.J(bwfVar3) ? 4 : 2) | i2;
        } else {
            bwfVar3 = bwfVar;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            izsVar2 = izsVar;
            i3 |= M.y(izsVar2) ? 32 : 16;
        } else {
            izsVar2 = izsVar;
        }
        int i6 = i3 | 384;
        if ((i2 & 3072) == 0) {
            i6 |= M.l(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i6 |= M.o(sliderSize == null ? -1 : sliderSize.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            bwfVar4 = bwfVar2;
            i6 |= M.J(bwfVar4) ? 131072 : 65536;
        } else {
            bwfVar4 = bwfVar2;
        }
        if ((1572864 & i2) == 0) {
            i4 = i;
            i6 |= M.o(i4) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            i4 = i;
        }
        if ((12582912 & i2) == 0) {
            i6 |= M.y(null) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            pmlVar2 = pmlVar;
            i6 |= M.J(pmlVar2) ? 67108864 : 33554432;
        } else {
            pmlVar2 = pmlVar;
        }
        if (M.t(i6 & 1, (38347923 & i6) != 38347922)) {
            M.V();
            if ((i2 & 1) == 0 || M.i()) {
                q630Var3 = q630.a.a;
            } else {
                M.h();
                q630Var3 = q630Var;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-564186993, i6, -1, "com.vk.core.compose.component.VkRangeSlider (VkSlider.kt:136)");
            }
            q630 a = o19.a(q630Var3, z ? 1.0f : 0.64f);
            m4s.t().getClass();
            int i7 = k0k0.a.$EnumSwitchMapping$0[sliderSize.ordinal()];
            if (i7 == 1) {
                i5 = 14;
            } else {
                if (i7 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i5 = 12;
            }
            float f = i5;
            m4s.t().getClass();
            int i8 = i6 & 7294;
            int i9 = i6 >> 3;
            nmx.b(bwfVar3, izsVar2, a, z, bwfVar4, i4, pmlVar2, f, 2, M, (i9 & 29360128) | i8 | (57344 & i9) | (458752 & i9) | (3670016 & i9));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = q630Var3;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.gkv0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    hkv0.a(bwf.this, izsVar, q630Var2, z, sliderSize, bwfVar2, i, pmlVar, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final bwf bwfVar, final izs izsVar, final q630 q630Var, final String str, boolean z, SliderSize sliderSize, bwf bwfVar2, int i, pml pmlVar, androidx.compose.runtime.a aVar, final int i2, final int i3) {
        boolean z2;
        int i4;
        bwf bwfVar3;
        int i5;
        int i6;
        int i7;
        int i8;
        final SliderSize sliderSize2;
        final boolean z3;
        final bwf bwfVar4;
        final int i9;
        final pml pmlVar2;
        androidx.compose.runtime.f s;
        int i10;
        int i11;
        SliderSize sliderSize3;
        pml a;
        int i12;
        androidx.compose.runtime.a M = aVar.M(979831690);
        int i13 = (M.J(bwfVar) ? 4 : 2) | i2;
        if ((i2 & 384) == 0) {
            i13 |= M.J(q630Var) ? 256 : 128;
        }
        int i14 = i13 | (M.J(str) ? 2048 : 1024);
        int i15 = i3 & 16;
        if (i15 != 0) {
            i4 = i14 | 24576;
            z2 = z;
        } else {
            z2 = z;
            i4 = i14 | (M.l(z2) ? 16384 : 8192);
        }
        int i16 = i4 | 196608;
        if ((i3 & 64) == 0) {
            bwfVar3 = bwfVar2;
            if (M.J(bwfVar3)) {
                i5 = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                int i17 = i16 | i5;
                i6 = i3 & 128;
                if (i6 == 0) {
                    i17 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    i7 = i;
                    i17 |= M.o(i7) ? 8388608 : 4194304;
                    i8 = i17 | 369098752;
                    if (M.t(i8 & 1, (306783379 & i8) != 306783378)) {
                        M.V();
                        if ((i2 & 1) == 0 || M.i()) {
                            if (i15 != 0) {
                                z2 = true;
                            }
                            SliderSize sliderSize4 = SliderSize.Regular;
                            if ((i3 & 64) != 0) {
                                i10 = -1879048193;
                                bwfVar3 = new awf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                                i8 &= -3670017;
                            } else {
                                i10 = -1879048193;
                            }
                            if (i6 != 0) {
                                i7 = 0;
                            }
                            i11 = i8 & i10;
                            sliderSize3 = sliderSize4;
                            a = m4s.t().a(M);
                        } else {
                            M.h();
                            if ((i3 & 64) != 0) {
                                i8 &= -3670017;
                            }
                            i11 = i8 & (-1879048193);
                            sliderSize3 = sliderSize;
                            a = pmlVar;
                        }
                        boolean z4 = z2;
                        bwf bwfVar5 = bwfVar3;
                        int i18 = i7;
                        M.S();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(979831690, i11, -1, "com.vk.core.compose.component.VkRangeSliderForm (VkSlider.kt:170)");
                        }
                        m4s.t().getClass();
                        a.m mVar = androidx.compose.foundation.layout.a.c;
                        dt1.a.getClass();
                        androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
                        int hashCode = Long.hashCode(n34.n(M));
                        sy90 D = M.D();
                        q630 c = qri.c(M, q630Var);
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
                        k9q0.w(M, a2, cri.a.f);
                        k9q0.w(M, D, cri.a.e);
                        k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                        k9q0.t(M, cri.a.h);
                        k9q0.w(M, c, cri.a.d);
                        if (str == null || str.length() == 0) {
                            i12 = i11;
                            M.K(-1820196830);
                        } else {
                            M.K(-1814733204);
                            m4s.t().getClass();
                            i12 = i11;
                            yqv0.c(str, s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, yn20.b, 7), m4s.t().c(M), null, null, 0, 0, null, 0, false, 0, 0, null, m4s.t().d(M), M, (i11 >> 9) & 14, 0, 8184);
                            M = M;
                        }
                        M.j();
                        int i19 = i12 >> 3;
                        SliderSize sliderSize5 = sliderSize3;
                        pml pmlVar3 = a;
                        a(bwfVar, izsVar, null, z4, sliderSize5, bwfVar5, i18, pmlVar3, M, (i12 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | (i19 & 7168) | 24576 | (458752 & i19) | (i19 & 3670016) | 12582912);
                        M.G();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        z3 = z4;
                        sliderSize2 = sliderSize5;
                        bwfVar4 = bwfVar5;
                        i9 = i18;
                        pmlVar2 = pmlVar3;
                    } else {
                        M.h();
                        sliderSize2 = sliderSize;
                        z3 = z2;
                        bwfVar4 = bwfVar3;
                        i9 = i7;
                        pmlVar2 = pmlVar;
                    }
                    s = M.s();
                    if (s != null) {
                        s.d = new wzs() { // from class: xsna.dkv0
                            @Override // xsna.wzs
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                hkv0.b(bwf.this, izsVar, q630Var, str, z3, sliderSize2, bwfVar4, i9, pmlVar2, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1), i3);
                                return s3q0.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                i7 = i;
                i8 = i17 | 369098752;
                if (M.t(i8 & 1, (306783379 & i8) != 306783378)) {
                }
                s = M.s();
                if (s != null) {
                }
            }
        } else {
            bwfVar3 = bwfVar2;
        }
        i5 = 524288;
        int i172 = i16 | i5;
        i6 = i3 & 128;
        if (i6 == 0) {
        }
        i7 = i;
        i8 = i172 | 369098752;
        if (M.t(i8 & 1, (306783379 & i8) != 306783378)) {
        }
        s = M.s();
        if (s != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final float f, final izs izsVar, q630 q630Var, boolean z, SliderSize sliderSize, final bwf bwfVar, int i, pml pmlVar, androidx.compose.runtime.a aVar, final int i2, final int i3) {
        int i4;
        q630 q630Var2;
        int i5;
        boolean z2;
        int i6;
        int i7;
        int i8;
        int i9;
        androidx.compose.runtime.a aVar2;
        final pml pmlVar2;
        final boolean z3;
        final int i10;
        final q630 q630Var3;
        final SliderSize sliderSize2;
        androidx.compose.runtime.f s;
        SliderSize sliderSize3;
        pml pmlVar3;
        boolean z4;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        androidx.compose.runtime.a M = aVar.M(-1699920005);
        if ((i2 & 6) == 0) {
            i4 = (M.n(f) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= M.y(izsVar) ? 32 : 16;
        }
        int i18 = i3 & 4;
        if (i18 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            q630Var2 = q630Var;
            i4 |= M.J(q630Var2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                z2 = z;
                i4 |= M.l(z2) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    i4 |= M.o(sliderSize == null ? -1 : sliderSize.ordinal()) ? 16384 : 8192;
                }
                if ((196608 & i2) == 0) {
                    i4 |= M.J(bwfVar) ? 131072 : 65536;
                }
                i7 = i3 & 64;
                if (i7 != 0) {
                    i4 |= 1572864;
                    i8 = i;
                } else {
                    i8 = i;
                    if ((i2 & 1572864) == 0) {
                        i4 |= M.o(i8) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                    }
                }
                if ((i3 & 128) != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    i4 |= M.y(null) ? 8388608 : 4194304;
                }
                if ((100663296 & i2) == 0) {
                    if ((i3 & 256) == 0 && M.J(pmlVar)) {
                        i17 = 67108864;
                        i4 |= i17;
                    }
                    i17 = 33554432;
                    i4 |= i17;
                }
                i9 = i4;
                if (M.t(i9 & 1, (i4 & 38347923) != 38347922)) {
                    M.V();
                    if ((i2 & 1) == 0 || M.i()) {
                        if (i18 != 0) {
                            q630Var2 = q630.a.a;
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        sliderSize3 = i6 != 0 ? SliderSize.Regular : sliderSize;
                        int i19 = i7 == 0 ? i8 : 0;
                        if ((i3 & 256) != 0) {
                            i11 = i9 & (-234881025);
                            pmlVar3 = m4s.t().a(M);
                            z4 = z2;
                        } else {
                            pmlVar3 = pmlVar;
                            z4 = z2;
                            i11 = i9;
                        }
                        i12 = i19;
                    } else {
                        M.h();
                        if ((i3 & 256) != 0) {
                            pmlVar3 = pmlVar;
                            i11 = i9 & (-234881025);
                            i12 = i8;
                            z4 = z2;
                            i13 = -1;
                            i14 = -1699920005;
                            sliderSize3 = sliderSize;
                            M.S();
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(i14, i11, i13, "com.vk.core.compose.component.VkSlider (VkSlider.kt:51)");
                            }
                            q630 a = o19.a(q630Var2, !z4 ? 1.0f : 0.64f);
                            m4s.t().getClass();
                            i15 = k0k0.a.$EnumSwitchMapping$0[sliderSize3.ordinal()];
                            if (i15 != 1) {
                                i16 = 14;
                            } else {
                                if (i15 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                i16 = 12;
                            }
                            float f2 = i16;
                            m4s.t().getClass();
                            int i20 = i11 >> 3;
                            aVar2 = M;
                            nmx.d(f, izsVar, a, z4, bwfVar, i12, null, pmlVar3, f2, 2, aVar2, (i11 & 7294) | (57344 & i20) | (458752 & i20) | (i20 & 3670016) | (i11 & 234881024));
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            q630Var3 = q630Var2;
                            z3 = z4;
                            i10 = i12;
                            pmlVar2 = pmlVar3;
                            sliderSize2 = sliderSize3;
                        } else {
                            sliderSize3 = sliderSize;
                            pmlVar3 = pmlVar;
                            i12 = i8;
                            z4 = z2;
                            i11 = i9;
                        }
                    }
                    i13 = -1;
                    i14 = -1699920005;
                    M.S();
                    if (androidx.compose.runtime.b.d()) {
                    }
                    q630 a2 = o19.a(q630Var2, !z4 ? 1.0f : 0.64f);
                    m4s.t().getClass();
                    i15 = k0k0.a.$EnumSwitchMapping$0[sliderSize3.ordinal()];
                    if (i15 != 1) {
                    }
                    float f22 = i16;
                    m4s.t().getClass();
                    int i202 = i11 >> 3;
                    aVar2 = M;
                    nmx.d(f, izsVar, a2, z4, bwfVar, i12, null, pmlVar3, f22, 2, aVar2, (i11 & 7294) | (57344 & i202) | (458752 & i202) | (i202 & 3670016) | (i11 & 234881024));
                    if (androidx.compose.runtime.b.d()) {
                    }
                    q630Var3 = q630Var2;
                    z3 = z4;
                    i10 = i12;
                    pmlVar2 = pmlVar3;
                    sliderSize2 = sliderSize3;
                } else {
                    aVar2 = M;
                    aVar2.h();
                    pmlVar2 = pmlVar;
                    z3 = z2;
                    i10 = i8;
                    q630Var3 = q630Var2;
                    sliderSize2 = sliderSize;
                }
                s = aVar2.s();
                if (s != null) {
                    s.d = new wzs() { // from class: xsna.ekv0
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            hkv0.c(f, izsVar, q630Var3, z3, sliderSize2, bwfVar, i10, pmlVar2, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1), i3);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
            z2 = z;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            if ((196608 & i2) == 0) {
            }
            i7 = i3 & 64;
            if (i7 != 0) {
            }
            if ((i3 & 128) != 0) {
            }
            if ((100663296 & i2) == 0) {
            }
            i9 = i4;
            if (M.t(i9 & 1, (i4 & 38347923) != 38347922)) {
            }
            s = aVar2.s();
            if (s != null) {
            }
        }
        q630Var2 = q630Var;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        z2 = z;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        if ((196608 & i2) == 0) {
        }
        i7 = i3 & 64;
        if (i7 != 0) {
        }
        if ((i3 & 128) != 0) {
        }
        if ((100663296 & i2) == 0) {
        }
        i9 = i4;
        if (M.t(i9 & 1, (i4 & 38347923) != 38347922)) {
        }
        s = aVar2.s();
        if (s != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(final float f, final izs izsVar, q630 q630Var, String str, boolean z, SliderSize sliderSize, bwf bwfVar, int i, pml pmlVar, androidx.compose.runtime.a aVar, final int i2, final int i3) {
        izs izsVar2;
        q630 q630Var2;
        int i4;
        String str2;
        int i5;
        int i6;
        boolean z2;
        int i7;
        bwf bwfVar2;
        int i8;
        int i9;
        int i10;
        int i11;
        androidx.compose.runtime.a aVar2;
        final pml pmlVar2;
        final q630 q630Var3;
        final String str3;
        final boolean z3;
        final bwf bwfVar3;
        final int i12;
        final SliderSize sliderSize2;
        androidx.compose.runtime.f s;
        int i13;
        bwf bwfVar4;
        pml a;
        int i14;
        bwf bwfVar5;
        SliderSize sliderSize3;
        String str4;
        int i15;
        androidx.compose.runtime.a M = aVar.M(-666170026);
        int i16 = (M.n(f) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            izsVar2 = izsVar;
            i16 |= M.y(izsVar2) ? 32 : 16;
        } else {
            izsVar2 = izsVar;
        }
        int i17 = i3 & 4;
        if (i17 != 0) {
            i16 |= 384;
        } else if ((i2 & 384) == 0) {
            q630Var2 = q630Var;
            i16 |= M.J(q630Var2) ? 256 : 128;
            i4 = i3 & 8;
            if (i4 == 0) {
                i5 = i16 | 3072;
                str2 = str;
            } else {
                str2 = str;
                i5 = i16 | (M.J(str2) ? 2048 : 1024);
            }
            i6 = i3 & 16;
            if (i6 == 0) {
                i7 = i5 | 24576;
                z2 = z;
            } else {
                z2 = z;
                i7 = i5 | (M.l(z2) ? 16384 : 8192);
            }
            int i18 = i7 | 196608;
            if ((i3 & 64) != 0) {
                bwfVar2 = bwfVar;
                if (M.J(bwfVar2)) {
                    i8 = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    int i19 = i18 | i8;
                    i9 = i3 & 128;
                    if (i9 != 0) {
                        i19 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        i10 = i;
                        i19 |= M.o(i10) ? 8388608 : 4194304;
                        i11 = i19 | 369098752;
                        if (M.t(i11 & 1, (i11 & 306783379) == 306783378)) {
                            aVar2 = M;
                            aVar2.h();
                            pmlVar2 = pmlVar;
                            q630Var3 = q630Var2;
                            str3 = str2;
                            z3 = z2;
                            bwfVar3 = bwfVar2;
                            i12 = i10;
                            sliderSize2 = sliderSize;
                        } else {
                            M.V();
                            int i20 = i2 & 1;
                            q630.a aVar3 = q630.a.a;
                            if (i20 == 0 || M.i()) {
                                if (i17 != 0) {
                                    q630Var2 = aVar3;
                                }
                                if (i4 != 0) {
                                    str2 = null;
                                }
                                if (i6 != 0) {
                                    z2 = true;
                                }
                                SliderSize sliderSize4 = SliderSize.Regular;
                                if ((i3 & 64) != 0) {
                                    bwfVar4 = new awf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                                    i13 = i11 & (-3670017);
                                } else {
                                    i13 = i11;
                                    bwfVar4 = bwfVar2;
                                }
                                if (i9 != 0) {
                                    i10 = 0;
                                }
                                a = m4s.t().a(M);
                                i14 = i13 & (-1879048193);
                                bwfVar5 = bwfVar4;
                                sliderSize3 = sliderSize4;
                            } else {
                                M.h();
                                sliderSize3 = sliderSize;
                                a = pmlVar;
                                bwfVar5 = bwfVar2;
                                i14 = ((i3 & 64) != 0 ? i11 & (-3670017) : i11) & (-1879048193);
                            }
                            boolean z4 = z2;
                            String str5 = str2;
                            int i21 = i10;
                            M.S();
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-666170026, i14, -1, "com.vk.core.compose.component.VkSliderForm (VkSlider.kt:89)");
                            }
                            m4s.t().getClass();
                            a.m mVar = androidx.compose.foundation.layout.a.c;
                            dt1.a.getClass();
                            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
                            int hashCode = Long.hashCode(n34.n(M));
                            sy90 D = M.D();
                            q630 c = qri.c(M, q630Var2);
                            cri.h7.getClass();
                            LayoutNode.a aVar4 = cri.a.b;
                            if (M.N() == null) {
                                n34.r();
                                throw null;
                            }
                            M.H();
                            if (M.L()) {
                                M.I(aVar4);
                            } else {
                                M.f();
                            }
                            k9q0.w(M, a2, cri.a.f);
                            k9q0.w(M, D, cri.a.e);
                            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                            k9q0.t(M, cri.a.h);
                            k9q0.w(M, c, cri.a.d);
                            if (str5 == null || str5.length() == 0) {
                                str4 = str5;
                                i15 = i14;
                                M.K(1236372982);
                            } else {
                                M.K(1239496480);
                                m4s.t().getClass();
                                i15 = i14;
                                yqv0.c(str5, s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, yn20.b, 7), m4s.t().c(M), null, null, 0, 0, null, 0, false, 0, 0, null, m4s.t().d(M), M, (i14 >> 9) & 14, 0, 8184);
                                str4 = str5;
                            }
                            M.j();
                            int i22 = i15 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
                            int i23 = i15 >> 3;
                            SliderSize sliderSize5 = sliderSize3;
                            bwf bwfVar6 = bwfVar5;
                            pml pmlVar3 = a;
                            c(f, izsVar2, null, z4, sliderSize5, bwfVar6, i21, pmlVar3, M, (i23 & 3670016) | i22 | (i23 & 7168) | 24576 | (458752 & i23) | 12582912, 4);
                            aVar2 = M;
                            aVar2.G();
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            str3 = str4;
                            q630Var3 = q630Var2;
                            z3 = z4;
                            sliderSize2 = sliderSize5;
                            bwfVar3 = bwfVar6;
                            i12 = i21;
                            pmlVar2 = pmlVar3;
                        }
                        s = aVar2.s();
                        if (s == null) {
                            s.d = new wzs() { // from class: xsna.fkv0
                                @Override // xsna.wzs
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    hkv0.d(f, izsVar, q630Var3, str3, z3, sliderSize2, bwfVar3, i12, pmlVar2, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1), i3);
                                    return s3q0.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    i10 = i;
                    i11 = i19 | 369098752;
                    if (M.t(i11 & 1, (i11 & 306783379) == 306783378)) {
                    }
                    s = aVar2.s();
                    if (s == null) {
                    }
                }
            } else {
                bwfVar2 = bwfVar;
            }
            i8 = 524288;
            int i192 = i18 | i8;
            i9 = i3 & 128;
            if (i9 != 0) {
            }
            i10 = i;
            i11 = i192 | 369098752;
            if (M.t(i11 & 1, (i11 & 306783379) == 306783378)) {
            }
            s = aVar2.s();
            if (s == null) {
            }
        }
        q630Var2 = q630Var;
        i4 = i3 & 8;
        if (i4 == 0) {
        }
        i6 = i3 & 16;
        if (i6 == 0) {
        }
        int i182 = i7 | 196608;
        if ((i3 & 64) != 0) {
        }
        i8 = 524288;
        int i1922 = i182 | i8;
        i9 = i3 & 128;
        if (i9 != 0) {
        }
        i10 = i;
        i11 = i1922 | 369098752;
        if (M.t(i11 & 1, (i11 & 306783379) == 306783378)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }
}
