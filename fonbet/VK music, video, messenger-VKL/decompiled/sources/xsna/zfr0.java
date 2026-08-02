package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.SpinnerMode;
import com.vk.core.compose.component.defaults.SpinnerSize;
import com.vk.core.compose.component.defaults.SpinnerState;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import org.chromium.net.NetError;
import xsna.cri;
import xsna.dt1;
import xsna.mlv0;
import xsna.q630;
import xsna.zfr0;

/* compiled from: VKSpinner.kt */
/* loaded from: classes17.dex */
public final class zfr0 {

    /* compiled from: VKSpinner.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SpinnerState.values().length];
            try {
                iArr[SpinnerState.Loading.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SpinnerState.Error.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SpinnerState.Done.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SpinnerState.Custom.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SpinnerSize.values().length];
            try {
                iArr2[SpinnerSize.Size16.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[SpinnerSize.Size24.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[SpinnerSize.Size28.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[SpinnerSize.Size36.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[SpinnerSize.Size56.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final SpinnerSize spinnerSize, final long j, q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        final q630 q630Var2;
        int i2;
        androidx.compose.runtime.a M = aVar.M(1649610647);
        int i3 = i | (M.o(spinnerSize.ordinal()) ? 4 : 2) | (M.p(j) ? 32 : 16) | 384;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1649610647, i3, -1, "com.vk.core.compose.component.DoneState (VKSpinner.kt:163)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                int i4 = a.$EnumSwitchMapping$1[spinnerSize.ordinal()];
                if (i4 == 1) {
                    i2 = R.drawable.ds_internal_spinner_done_state_16;
                } else if (i4 == 2) {
                    i2 = R.drawable.ds_internal_spinner_done_state_24;
                } else if (i4 == 3) {
                    i2 = R.drawable.ds_internal_spinner_done_state_28;
                } else if (i4 == 4) {
                    i2 = R.drawable.ds_internal_spinner_done_state_36;
                } else {
                    if (i4 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = R.drawable.ds_internal_spinner_done_state_56;
                }
                x = Integer.valueOf(i2);
                M.R(x);
            }
            yk2 a2 = im2.a(((Number) x).intValue(), 54, M);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x2);
            }
            wh50 wh50Var = (wh50) x2;
            llr0 C = xx1.C(a2, ((Boolean) wh50Var.getValue()).booleanValue(), M, 0);
            float a3 = mlv0.a(spinnerSize, (i3 & 14) | 48);
            q630.a aVar2 = q630.a.a;
            vqv.a(C, d370.N(R.string.vk_spinner_done, 0, M), txj0.q(aVar2, a3), j, M, 8 | ((i3 << 6) & 7168), 0);
            s3q0 s3q0Var = s3q0.a;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new xfr0(wh50Var, null);
                M.R(x3);
            }
            bap.g(s3q0Var, (wzs) x3, M, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(j, q630Var2, i) { // from class: xsna.wfr0
                public final /* synthetic */ long c;
                public final /* synthetic */ q630 d;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    zfr0.a(SpinnerSize.this, this.c, this.d, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final SpinnerSize spinnerSize, final long j, q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        final q630 q630Var2;
        int i2;
        androidx.compose.runtime.a M = aVar.M(-2027063827);
        int i3 = i | (M.o(spinnerSize.ordinal()) ? 4 : 2) | (M.p(j) ? 32 : 16) | 384;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2027063827, i3, -1, "com.vk.core.compose.component.ErrorState (VKSpinner.kt:192)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                int i4 = a.$EnumSwitchMapping$1[spinnerSize.ordinal()];
                if (i4 == 1) {
                    i2 = R.drawable.ds_internal_spinner_error_state_16;
                } else if (i4 == 2) {
                    i2 = R.drawable.ds_internal_spinner_error_state_24;
                } else if (i4 == 3) {
                    i2 = R.drawable.ds_internal_spinner_error_state_28;
                } else if (i4 == 4) {
                    i2 = R.drawable.ds_internal_spinner_error_state_36;
                } else {
                    if (i4 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = R.drawable.ds_internal_spinner_error_state_56;
                }
                x = Integer.valueOf(i2);
                M.R(x);
            }
            yk2 a2 = im2.a(((Number) x).intValue(), 54, M);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x2);
            }
            wh50 wh50Var = (wh50) x2;
            llr0 C = xx1.C(a2, ((Boolean) wh50Var.getValue()).booleanValue(), M, 0);
            float a3 = mlv0.a(spinnerSize, (i3 & 14) | 48);
            q630.a aVar2 = q630.a.a;
            vqv.a(C, d370.N(R.string.vk_spinner_error, 0, M), txj0.q(aVar2, a3), j, M, 8 | ((i3 << 6) & 7168), 0);
            s3q0 s3q0Var = s3q0.a;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new yfr0(wh50Var, null);
                M.R(x3);
            }
            bap.g(s3q0Var, (wzs) x3, M, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(j, q630Var2, i) { // from class: xsna.vfr0
                public final /* synthetic */ long c;
                public final /* synthetic */ q630 d;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    zfr0.b(SpinnerSize.this, this.c, this.d, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(SpinnerSize spinnerSize, final long j, final gzs gzsVar, q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        SpinnerSize spinnerSize2;
        final q630 q630Var2;
        float f;
        androidx.compose.runtime.a M = aVar.M(684028997);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (M.o(spinnerSize.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.p(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(gzsVar) ? 256 : 128;
        }
        int i4 = i2 | 3072;
        if (M.t(i4 & 1, (i4 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(684028997, i4, -1, "com.vk.core.compose.component.LoadingState (VKSpinner.kt:222)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new xep0(2);
                M.R(x);
            }
            q630.a aVar2 = q630.a.a;
            q630 b = egi0.b(aVar2, true, (izs) x);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.f, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, b);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            int i5 = (i4 & 14) | 48;
            spinnerSize2 = spinnerSize;
            q630 q = txj0.q(aVar2, mlv0.a(spinnerSize2, i5));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1474752132, i5, -1, "com.vk.core.compose.component.defaults.VkSpinnerDefault.strokeWidth (VkSpinnerDefault.kt:24)");
            }
            int i6 = mlv0.a.$EnumSwitchMapping$0[spinnerSize2.ordinal()];
            if (i6 != 1) {
                if (i6 != 2) {
                    i3 = 3;
                    if (i6 != 3) {
                        if (i6 != 4 && i6 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
                f = (float) 2.5d;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                x2e0.b(q, j, f, 0L, 1, M, i4 & 112, 8);
                if (gzsVar == null) {
                    M.K(1628639302);
                    nzu0.e(gzsVar, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, null, null, kai.c(-698381457, new wzs() { // from class: xsna.rfr0
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                            int intValue = ((Integer) obj2).intValue();
                            if (aVar4.t(intValue & 1, (intValue & 3) != 2)) {
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(-698381457, intValue, -1, "com.vk.core.compose.component.LoadingState.<anonymous>.<anonymous> (VKSpinner.kt:232)");
                                }
                                q630 q2 = txj0.q(q630.a.a, 24);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1243383292, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Cancel24> (VkSdkIcons.kt:226)");
                                }
                                lg90 b2 = or.b(aVar4, 1833859693, R.drawable.vk_icon_cancel_24, aVar4, 0);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                vqv.a(b2, d370.N(R.string.vk_spinner_cancel, 0, aVar4), q2, j, aVar4, 392, 0);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                            } else {
                                aVar4.h();
                            }
                            return s3q0.a;
                        }
                    }, M), M, ((i4 >> 6) & 14) | 100663296, 254);
                    M = M;
                } else {
                    M.K(1620287747);
                }
                M.j();
                M.G();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630Var2 = aVar2;
            }
            f = i3;
            if (androidx.compose.runtime.b.d()) {
            }
            x2e0.b(q, j, f, 0L, 1, M, i4 & 112, 8);
            if (gzsVar == null) {
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
            }
            q630Var2 = aVar2;
        } else {
            spinnerSize2 = spinnerSize;
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final SpinnerSize spinnerSize3 = spinnerSize2;
            s.d = new wzs() { // from class: xsna.sfr0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    zfr0.c(SpinnerSize.this, j, gzsVar, q630Var2, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(final SpinnerState spinnerState, q630 q630Var, SpinnerMode spinnerMode, String str, gzs<s3q0> gzsVar, long j, long j2, SpinnerSize spinnerSize, mkk0 mkk0Var, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        q630 q630Var2;
        int i4;
        String str2;
        int i5;
        gzs<s3q0> gzsVar2;
        long j3;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        androidx.compose.runtime.a aVar2;
        final SpinnerMode spinnerMode2;
        final SpinnerSize spinnerSize2;
        final q630 q630Var3;
        final String str3;
        final gzs<s3q0> gzsVar3;
        final long j4;
        final long j5;
        final mkk0 mkk0Var2;
        androidx.compose.runtime.f s;
        int i14;
        SpinnerMode spinnerMode3;
        int i15;
        long j6;
        SpinnerSize spinnerSize3;
        int i16;
        mkk0 mkk0Var3;
        int i17;
        final mkk0 mkk0Var4;
        q630 q630Var4;
        float f;
        androidx.compose.runtime.a M = aVar.M(-2143345908);
        if ((i & 6) == 0) {
            i3 = (M.o(spinnerState.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i18 = i2 & 2;
        if (i18 != 0) {
            i4 = i3 | 48;
            q630Var2 = q630Var;
        } else {
            q630Var2 = q630Var;
            i4 = i3 | (M.J(q630Var2) ? 32 : 16);
        }
        int i19 = i2 & 4;
        if (i19 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= M.o(spinnerMode == null ? -1 : spinnerMode.ordinal()) ? 256 : 128;
        }
        int i20 = i2 & 8;
        if (i20 != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            str2 = str;
            i4 |= M.J(str2) ? 2048 : 1024;
            i5 = i2 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i & 24576) == 0) {
                gzsVar2 = gzsVar;
                i4 |= M.y(gzsVar2) ? 16384 : 8192;
                if ((i2 & 32) == 0) {
                    j3 = j;
                    if (M.p(j3)) {
                        i6 = 131072;
                        int i21 = i4 | i6;
                        if ((i2 & 64) != 0) {
                            i7 = i18;
                            if (M.p(j2)) {
                                i8 = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                                int i22 = i21 | i8;
                                i9 = i2 & 128;
                                if (i9 != 0) {
                                    i22 |= 12582912;
                                } else if ((i & 12582912) == 0) {
                                    i22 |= M.o(spinnerSize == null ? -1 : spinnerSize.ordinal()) ? 8388608 : 4194304;
                                }
                                i10 = i2 & 256;
                                if (i10 != 0) {
                                    i12 = i22 | 100663296;
                                    i11 = i9;
                                } else {
                                    i11 = i9;
                                    i12 = i22 | (M.J(mkk0Var) ? 67108864 : 33554432);
                                }
                                i13 = i12;
                                if (M.t(i13 & 1, (i12 & 38347923) != 38347922)) {
                                    M.V();
                                    int i23 = i & 1;
                                    q630.a aVar3 = q630.a.a;
                                    if (i23 == 0 || M.i()) {
                                        if (i7 != 0) {
                                            q630Var2 = aVar3;
                                        }
                                        SpinnerMode spinnerMode4 = i19 != 0 ? SpinnerMode.Shadow : spinnerMode;
                                        if (i20 != 0) {
                                            str2 = null;
                                        }
                                        if (i5 != 0) {
                                            gzsVar2 = null;
                                        }
                                        if ((i2 & 32) != 0) {
                                            float f2 = mlv0.a;
                                            int i24 = ((i13 >> 6) & 14) | 48;
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.f(-261662094, i24, -1, "com.vk.core.compose.component.defaults.VkSpinnerDefault.backgroundColor (VkSpinnerDefault.kt:50)");
                                            }
                                            int i25 = mlv0.a.$EnumSwitchMapping$1[spinnerMode4.ordinal()];
                                            if (i25 == 1) {
                                                M.K(1945803210);
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                                }
                                                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.e();
                                                }
                                                j3 = ylu0Var.getBackground().n;
                                                M.j();
                                            } else {
                                                if (i25 != 2) {
                                                    throw alb0.c(1945800997, M);
                                                }
                                                M.K(1945805823);
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                                }
                                                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.e();
                                                }
                                                j3 = ylu0Var2.i().a;
                                                M.j();
                                            }
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.e();
                                            }
                                            i14 = i13 & (-458753);
                                        } else {
                                            i14 = i13;
                                        }
                                        if ((i2 & 64) != 0) {
                                            float f3 = mlv0.a;
                                            int i26 = ((i14 >> 6) & 14) | 48;
                                            if (androidx.compose.runtime.b.d()) {
                                                spinnerMode3 = spinnerMode4;
                                                androidx.compose.runtime.b.f(1099825313, i26, -1, "com.vk.core.compose.component.defaults.VkSpinnerDefault.contentColor (VkSpinnerDefault.kt:42)");
                                            } else {
                                                spinnerMode3 = spinnerMode4;
                                            }
                                            int i27 = mlv0.a.$EnumSwitchMapping$1[spinnerMode3.ordinal()];
                                            if (i27 == 1) {
                                                i17 = i14;
                                                M.K(370175755);
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                                }
                                                ylu0 ylu0Var3 = (ylu0) M.r(rrv0.a);
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.e();
                                                }
                                                j6 = ylu0Var3.getIcon().f;
                                                M.j();
                                            } else {
                                                if (i27 != 2) {
                                                    throw alb0.c(370173725, M);
                                                }
                                                M.K(370177869);
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                                }
                                                ylu0 ylu0Var4 = (ylu0) M.r(rrv0.a);
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.e();
                                                }
                                                i17 = i14;
                                                j6 = ylu0Var4.getIcon().c;
                                                M.j();
                                            }
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.e();
                                            }
                                            i15 = i17 & (-3670017);
                                        } else {
                                            spinnerMode3 = spinnerMode4;
                                            i15 = i14;
                                            j6 = j2;
                                        }
                                        spinnerSize3 = i11 != 0 ? SpinnerSize.Size56 : spinnerSize;
                                        if (i10 != 0) {
                                            i16 = i15;
                                            mkk0Var3 = null;
                                        } else {
                                            i16 = i15;
                                            mkk0Var3 = mkk0Var;
                                        }
                                    } else {
                                        M.h();
                                        if ((i2 & 32) != 0) {
                                            i13 &= -458753;
                                        }
                                        if ((i2 & 64) != 0) {
                                            i13 &= -3670017;
                                        }
                                        spinnerMode3 = spinnerMode;
                                        j6 = j2;
                                        spinnerSize3 = spinnerSize;
                                        mkk0Var3 = mkk0Var;
                                        i16 = i13;
                                    }
                                    M.S();
                                    if (androidx.compose.runtime.b.d()) {
                                        mkk0Var4 = mkk0Var3;
                                        androidx.compose.runtime.b.f(-2143345908, i16, -1, "com.vk.core.compose.component.VkScreenSpinner (VKSpinner.kt:69)");
                                    } else {
                                        mkk0Var4 = mkk0Var3;
                                    }
                                    q630 g = txj0.w(aVar3, 88, mlv0.a).g(q630Var2);
                                    int i28 = ((i16 >> 6) & 14) | 48;
                                    if (androidx.compose.runtime.b.d()) {
                                        q630Var4 = g;
                                        androidx.compose.runtime.b.f(-1725954475, i28, -1, "com.vk.core.compose.component.defaults.VkSpinnerDefault.elevation (VkSpinnerDefault.kt:34)");
                                    } else {
                                        q630Var4 = g;
                                    }
                                    int i29 = mlv0.a.$EnumSwitchMapping$1[spinnerMode3.ordinal()];
                                    if (i29 == 1) {
                                        M.K(-784869798);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.f(-1412929589, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-elevation> (VkTheme.kt:170)");
                                        }
                                        squ0 squ0Var = (squ0) M.r(rrv0.b);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                        squ0Var.getClass();
                                        f = tqu0.d;
                                        M.j();
                                    } else {
                                        if (i29 != 2) {
                                            throw alb0.c(-784871776, M);
                                        }
                                        M.K(-784867911);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.f(-1412929589, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-elevation> (VkTheme.kt:170)");
                                        }
                                        squ0 squ0Var2 = (squ0) M.r(rrv0.b);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                        squ0Var2.getClass();
                                        f = tqu0.b;
                                        M.j();
                                    }
                                    float f4 = f;
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    final long j7 = j6;
                                    final SpinnerSize spinnerSize4 = spinnerSize3;
                                    final String str4 = str2;
                                    final gzs<s3q0> gzsVar4 = gzsVar2;
                                    final SpinnerMode spinnerMode5 = spinnerMode3;
                                    mkk0 mkk0Var5 = mkk0Var4;
                                    long j8 = j3;
                                    aVar2 = M;
                                    shu0.a(q630Var4, null, j8, 0L, null, f4, kai.c(347269597, new wzs() { // from class: xsna.ofr0
                                        @Override // xsna.wzs
                                        public final Object invoke(Object obj, Object obj2) {
                                            long j9;
                                            androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                                            int intValue = ((Integer) obj2).intValue();
                                            if (aVar4.t(intValue & 1, (intValue & 3) != 2)) {
                                                if (androidx.compose.runtime.b.d()) {
                                                    androidx.compose.runtime.b.f(347269597, intValue, -1, "com.vk.core.compose.component.VkScreenSpinner.<anonymous> (VKSpinner.kt:77)");
                                                }
                                                float f5 = kqu0.w;
                                                q630.a aVar5 = q630.a.a;
                                                q630 D = s200.D(aVar5, f5);
                                                dt1.a.getClass();
                                                cp10 d = ja8.d(dt1.a.f, false);
                                                int hashCode = Long.hashCode(n34.n(aVar4));
                                                sy90 D2 = aVar4.D();
                                                q630 c = qri.c(aVar4, D);
                                                cri.h7.getClass();
                                                LayoutNode.a aVar6 = cri.a.b;
                                                if (aVar4.N() == null) {
                                                    n34.r();
                                                    throw null;
                                                }
                                                aVar4.H();
                                                if (aVar4.L()) {
                                                    aVar4.I(aVar6);
                                                } else {
                                                    aVar4.f();
                                                }
                                                cri.a.c cVar = cri.a.f;
                                                k9q0.w(aVar4, d, cVar);
                                                cri.a.e eVar = cri.a.e;
                                                k9q0.w(aVar4, D2, eVar);
                                                Integer valueOf = Integer.valueOf(hashCode);
                                                cri.a.b bVar = cri.a.g;
                                                k9q0.w(aVar4, valueOf, bVar);
                                                cri.a.C2678a c2678a = cri.a.h;
                                                k9q0.t(aVar4, c2678a);
                                                cri.a.d dVar = cri.a.d;
                                                k9q0.w(aVar4, c, dVar);
                                                androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, aVar4, 48);
                                                int hashCode2 = Long.hashCode(n34.n(aVar4));
                                                sy90 D3 = aVar4.D();
                                                q630 c2 = qri.c(aVar4, aVar5);
                                                if (aVar4.N() == null) {
                                                    n34.r();
                                                    throw null;
                                                }
                                                aVar4.H();
                                                if (aVar4.L()) {
                                                    aVar4.I(aVar6);
                                                } else {
                                                    aVar4.f();
                                                }
                                                k9q0.w(aVar4, a2, cVar);
                                                k9q0.w(aVar4, D3, eVar);
                                                ur.d(hashCode2, aVar4, bVar, aVar4, c2678a);
                                                k9q0.w(aVar4, c2, dVar);
                                                zfr0.f(SpinnerState.this, txj0.q(aVar5, 56), gzsVar4, j7, spinnerSize4, mkk0Var4, aVar4, 48, 0);
                                                String str5 = str4;
                                                if (str5 == null || str5.length() == 0) {
                                                    aVar4.K(-1211455359);
                                                } else {
                                                    aVar4.K(-1207622488);
                                                    if (a690.d(aVar5, kqu0.r, aVar4, 0)) {
                                                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                                                    }
                                                    wuv0 wuv0Var = (wuv0) aVar4.r(rrv0.c);
                                                    if (androidx.compose.runtime.b.d()) {
                                                        androidx.compose.runtime.b.e();
                                                    }
                                                    frv0 frv0Var = wuv0Var.i0;
                                                    float f6 = mlv0.a;
                                                    if (androidx.compose.runtime.b.d()) {
                                                        androidx.compose.runtime.b.f(-1847429327, 48, -1, "com.vk.core.compose.component.defaults.VkSpinnerDefault.textColor (VkSpinnerDefault.kt:58)");
                                                    }
                                                    int i30 = mlv0.a.$EnumSwitchMapping$1[spinnerMode5.ordinal()];
                                                    if (i30 == 1) {
                                                        aVar4.K(-1558085314);
                                                        if (androidx.compose.runtime.b.d()) {
                                                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                                        }
                                                        ylu0 ylu0Var5 = (ylu0) aVar4.r(rrv0.a);
                                                        if (androidx.compose.runtime.b.d()) {
                                                            androidx.compose.runtime.b.e();
                                                        }
                                                        j9 = ylu0Var5.getText().p;
                                                        aVar4.j();
                                                    } else {
                                                        if (i30 != 2) {
                                                            throw alb0.c(-1558087344, aVar4);
                                                        }
                                                        aVar4.K(-1558083107);
                                                        if (androidx.compose.runtime.b.d()) {
                                                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                                        }
                                                        ylu0 ylu0Var6 = (ylu0) aVar4.r(rrv0.a);
                                                        if (androidx.compose.runtime.b.d()) {
                                                            androidx.compose.runtime.b.e();
                                                        }
                                                        j9 = ylu0Var6.getText().d;
                                                        aVar4.j();
                                                    }
                                                    long j10 = j9;
                                                    if (androidx.compose.runtime.b.d()) {
                                                        androidx.compose.runtime.b.e();
                                                    }
                                                    yqv0.c(str5, null, j10, null, null, 0, 3, null, 0, false, 0, 2, null, frv0Var, aVar4, 0, 48, 6074);
                                                    aVar4 = aVar4;
                                                }
                                                aVar4.j();
                                                if (kr.f(aVar4)) {
                                                    androidx.compose.runtime.b.e();
                                                }
                                            } else {
                                                aVar4.h();
                                            }
                                            return s3q0.a;
                                        }
                                    }, M), aVar2, ((i16 >> 9) & 896) | 1572864, 26);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    str3 = str2;
                                    j5 = j6;
                                    gzs<s3q0> gzsVar5 = gzsVar2;
                                    mkk0Var2 = mkk0Var5;
                                    q630Var3 = q630Var2;
                                    gzsVar3 = gzsVar5;
                                    spinnerMode2 = spinnerMode5;
                                    spinnerSize2 = spinnerSize3;
                                    j4 = j8;
                                } else {
                                    aVar2 = M;
                                    aVar2.h();
                                    spinnerMode2 = spinnerMode;
                                    spinnerSize2 = spinnerSize;
                                    q630Var3 = q630Var2;
                                    str3 = str2;
                                    gzsVar3 = gzsVar2;
                                    j4 = j3;
                                    j5 = j2;
                                    mkk0Var2 = mkk0Var;
                                }
                                s = aVar2.s();
                                if (s != null) {
                                    s.d = new wzs() { // from class: xsna.pfr0
                                        @Override // xsna.wzs
                                        public final Object invoke(Object obj, Object obj2) {
                                            ((Integer) obj2).getClass();
                                            zfr0.d(SpinnerState.this, q630Var3, spinnerMode2, str3, gzsVar3, j4, j5, spinnerSize2, mkk0Var2, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                                            return s3q0.a;
                                        }
                                    };
                                    return;
                                }
                                return;
                            }
                        } else {
                            i7 = i18;
                        }
                        i8 = 524288;
                        int i222 = i21 | i8;
                        i9 = i2 & 128;
                        if (i9 != 0) {
                        }
                        i10 = i2 & 256;
                        if (i10 != 0) {
                        }
                        i13 = i12;
                        if (M.t(i13 & 1, (i12 & 38347923) != 38347922)) {
                        }
                        s = aVar2.s();
                        if (s != null) {
                        }
                    }
                } else {
                    j3 = j;
                }
                i6 = 65536;
                int i212 = i4 | i6;
                if ((i2 & 64) != 0) {
                }
                i8 = 524288;
                int i2222 = i212 | i8;
                i9 = i2 & 128;
                if (i9 != 0) {
                }
                i10 = i2 & 256;
                if (i10 != 0) {
                }
                i13 = i12;
                if (M.t(i13 & 1, (i12 & 38347923) != 38347922)) {
                }
                s = aVar2.s();
                if (s != null) {
                }
            }
            gzsVar2 = gzsVar;
            if ((i2 & 32) == 0) {
            }
            i6 = 65536;
            int i2122 = i4 | i6;
            if ((i2 & 64) != 0) {
            }
            i8 = 524288;
            int i22222 = i2122 | i8;
            i9 = i2 & 128;
            if (i9 != 0) {
            }
            i10 = i2 & 256;
            if (i10 != 0) {
            }
            i13 = i12;
            if (M.t(i13 & 1, (i12 & 38347923) != 38347922)) {
            }
            s = aVar2.s();
            if (s != null) {
            }
        }
        str2 = str;
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        gzsVar2 = gzsVar;
        if ((i2 & 32) == 0) {
        }
        i6 = 65536;
        int i21222 = i4 | i6;
        if ((i2 & 64) != 0) {
        }
        i8 = 524288;
        int i222222 = i21222 | i8;
        i9 = i2 & 128;
        if (i9 != 0) {
        }
        i10 = i2 & 256;
        if (i10 != 0) {
        }
        i13 = i12;
        if (M.t(i13 & 1, (i12 & 38347923) != 38347922)) {
        }
        s = aVar2.s();
        if (s != null) {
        }
    }

    public static final void e(q630 q630Var, long j, SpinnerSize spinnerSize, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        final long j2;
        final SpinnerSize spinnerSize2;
        androidx.compose.runtime.a M = aVar.M(956851746);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && M.p(j)) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= M.o(spinnerSize == null ? -1 : spinnerSize.ordinal()) ? 256 : 128;
        }
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            M.V();
            if ((i & 1) == 0 || M.i()) {
                if (i4 != 0) {
                    q630Var = q630.a.a;
                }
                if ((i2 & 2) != 0) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j = ylu0Var.getIcon().f;
                    i3 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                }
                if (i5 != 0) {
                    spinnerSize = SpinnerSize.Size24;
                }
            } else {
                M.h();
                if ((i2 & 2) != 0) {
                    i3 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                }
            }
            int i6 = i3;
            SpinnerSize spinnerSize3 = spinnerSize;
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(956851746, i6, -1, "com.vk.core.compose.component.VkSpinner (VKSpinner.kt:152)");
            }
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.f, false);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            j2 = j;
            c(spinnerSize3, j2, null, null, M, ((i6 >> 6) & 14) | 384 | (i6 & 112));
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            spinnerSize2 = spinnerSize3;
        } else {
            M.h();
            j2 = j;
            spinnerSize2 = spinnerSize;
        }
        final q630 q630Var2 = q630Var;
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.qfr0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    zfr0.e(q630.this, j2, spinnerSize2, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(final SpinnerState spinnerState, q630 q630Var, gzs<s3q0> gzsVar, long j, SpinnerSize spinnerSize, mkk0 mkk0Var, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        q630 q630Var2;
        int i4;
        gzs<s3q0> gzsVar2;
        int i5;
        int i6;
        int i7;
        mkk0 mkk0Var2;
        int i8;
        androidx.compose.runtime.a aVar2;
        final q630 q630Var3;
        final gzs<s3q0> gzsVar3;
        final long j2;
        final mkk0 mkk0Var3;
        final SpinnerSize spinnerSize2;
        androidx.compose.runtime.f s;
        q630 q630Var4;
        SpinnerSize spinnerSize3;
        androidx.compose.runtime.a M = aVar.M(1711696746);
        if ((i & 6) == 0) {
            i3 = (M.o(spinnerState.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i5 = i3 | 384;
                gzsVar2 = gzsVar;
            } else {
                gzsVar2 = gzsVar;
                i5 = i3 | (M.y(gzsVar2) ? 256 : 128);
            }
            long j3 = j;
            int i10 = i5 | (((i2 & 8) == 0 || !M.p(j3)) ? 1024 : 2048);
            i6 = i2 & 16;
            if (i6 == 0) {
                i10 |= 24576;
            } else if ((i & 24576) == 0) {
                i10 |= M.o(spinnerSize == null ? -1 : spinnerSize.ordinal()) ? 16384 : 8192;
            }
            i7 = i2 & 32;
            if (i7 == 0) {
                i8 = i10 | 196608;
                mkk0Var2 = mkk0Var;
            } else {
                mkk0Var2 = mkk0Var;
                i8 = i10 | (M.J(mkk0Var2) ? 131072 : 65536);
            }
            if (M.t(i8 & 1, (74899 & i8) == 74898)) {
                aVar2 = M;
                aVar2.h();
                q630Var3 = q630Var2;
                gzsVar3 = gzsVar2;
                j2 = j3;
                mkk0Var3 = mkk0Var2;
                spinnerSize2 = spinnerSize;
            } else {
                M.V();
                if ((i & 1) == 0 || M.i()) {
                    q630Var4 = i9 != 0 ? q630.a.a : q630Var2;
                    if (i4 != 0) {
                        gzsVar2 = null;
                    }
                    if ((i2 & 8) != 0) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        i8 &= -7169;
                        j3 = ylu0Var.getIcon().f;
                    }
                    spinnerSize3 = i6 != 0 ? SpinnerSize.Size24 : spinnerSize;
                    if (i7 != 0) {
                        mkk0Var2 = null;
                    }
                } else {
                    M.h();
                    if ((i2 & 8) != 0) {
                        i8 &= -7169;
                    }
                    q630Var4 = q630Var2;
                    spinnerSize3 = spinnerSize;
                }
                M.S();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1711696746, i8, -1, "com.vk.core.compose.component.VkSpinner (VKSpinner.kt:122)");
                }
                dt1.a.getClass();
                ty6 ty6Var = dt1.a.f;
                cp10 d = ja8.d(ty6Var, false);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, q630Var4);
                cri.h7.getClass();
                LayoutNode.a aVar3 = cri.a.b;
                if (M.N() == null) {
                    n34.r();
                    throw null;
                }
                M.H();
                if (M.L()) {
                    M.I(aVar3);
                } else {
                    M.f();
                }
                k9q0.w(M, d, cri.a.f);
                k9q0.w(M, D, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c, cri.a.d);
                final SpinnerSize spinnerSize4 = spinnerSize3;
                final gzs<s3q0> gzsVar4 = gzsVar2;
                final long j4 = j3;
                final mkk0 mkk0Var4 = mkk0Var2;
                mkk0Var3 = mkk0Var4;
                aVar2 = M;
                xh2.a(spinnerState, null, null, ty6Var, "SpinnerAnimation", null, kai.c(-543757197, new zzs() { // from class: xsna.tfr0
                    @Override // xsna.zzs
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        SpinnerState spinnerState2 = (SpinnerState) obj2;
                        androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj3;
                        int intValue = ((Integer) obj4).intValue();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-543757197, intValue, -1, "com.vk.core.compose.component.VkSpinner.<anonymous>.<anonymous> (VKSpinner.kt:129)");
                        }
                        int i11 = zfr0.a.$EnumSwitchMapping$0[spinnerState2.ordinal()];
                        SpinnerSize spinnerSize5 = SpinnerSize.this;
                        long j5 = j4;
                        if (i11 == 1) {
                            aVar4.K(1435346710);
                            zfr0.c(spinnerSize5, j5, gzsVar4, null, aVar4, 0);
                            aVar4.j();
                        } else if (i11 == 2) {
                            aVar4.K(1435349066);
                            zfr0.b(spinnerSize5, j5, null, aVar4, 0);
                            aVar4.j();
                        } else if (i11 == 3) {
                            aVar4.K(1435351017);
                            zfr0.a(spinnerSize5, j5, null, aVar4, 0);
                            aVar4.j();
                        } else {
                            if (i11 != 4) {
                                throw alb0.c(1435345073, aVar4);
                            }
                            aVar4.K(1546305444);
                            mkk0 mkk0Var5 = mkk0Var4;
                            if (mkk0Var5 == null) {
                                aVar4.K(1546305443);
                                aVar4.j();
                            } else {
                                aVar4.K(1435354142);
                                mkk0Var5.a(6, j5, aVar4);
                                aVar4.j();
                                s3q0 s3q0Var = s3q0.a;
                            }
                            aVar4.j();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        return s3q0.a;
                    }
                }, M), aVar2, (i8 & 14) | 1600512, 38);
                aVar2.G();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                spinnerSize2 = spinnerSize3;
                j2 = j4;
                q630Var3 = q630Var4;
                gzsVar3 = gzsVar4;
            }
            s = aVar2.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.ufr0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        zfr0.f(SpinnerState.this, q630Var3, gzsVar3, j2, spinnerSize2, mkk0Var3, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        q630Var2 = q630Var;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        long j32 = j;
        int i102 = i5 | (((i2 & 8) == 0 || !M.p(j32)) ? 1024 : 2048);
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        i7 = i2 & 32;
        if (i7 == 0) {
        }
        if (M.t(i8 & 1, (74899 & i8) == 74898)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }
}
