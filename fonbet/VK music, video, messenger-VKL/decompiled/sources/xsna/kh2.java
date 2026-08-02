package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.state.ToggleableState;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.List;
import xsna.dt1;
import xsna.q630;

/* compiled from: AnimatedCheck.kt */
/* loaded from: classes17.dex */
public final class kh2 {
    public static final float a = 24;

    /* compiled from: AnimatedCheck.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[ToggleableState.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToggleableState.Indeterminate.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToggleableState.Off.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(ToggleableState toggleableState, final gzs<s3q0> gzsVar, final u1c u1cVar, final float f, final q630 q630Var, boolean z, boolean z2, final sg50 sg50Var, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        boolean z3;
        int i4;
        final ToggleableState toggleableState2;
        androidx.compose.runtime.a aVar2;
        final boolean z4;
        androidx.compose.runtime.f s;
        q630 q630Var2;
        boolean z5 = z;
        androidx.compose.runtime.a M = aVar.M(1254244883);
        if ((i & 6) == 0) {
            i3 = (M.o(toggleableState.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.y(gzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= M.J(u1cVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= M.n(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= M.J(q630Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= M.l(z5) ? 131072 : 65536;
        }
        int i5 = i2 & 64;
        if (i5 != 0) {
            i3 |= 1572864;
        } else if ((1572864 & i) == 0) {
            z3 = z2;
            i3 |= M.l(z3) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
            if ((12582912 & i) == 0) {
                i3 |= M.J(sg50Var) ? 8388608 : 4194304;
            }
            i4 = i3;
            if (M.t(i4 & 1, (4793491 & i4) == 4793490)) {
                toggleableState2 = toggleableState;
                aVar2 = M;
                aVar2.h();
                z4 = z3;
            } else {
                boolean z6 = i5 != 0 ? false : z3;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1254244883, i4, -1, "com.vk.core.compose.component.internal.AnimatedCheck (AnimatedCheck.kt:51)");
                }
                if (gzsVar != null) {
                    mlg0 a2 = qer0.a(a, 4, 0L, false);
                    plg0 plg0Var = new plg0(1);
                    if (a2 != null) {
                        z5 = z;
                        toggleableState2 = toggleableState;
                        q630Var2 = new cqp0(toggleableState2, sg50Var, a2, false, z5, plg0Var, gzsVar);
                    } else if (a2 == null) {
                        toggleableState2 = toggleableState;
                        z5 = z;
                        q630Var2 = new cqp0(toggleableState2, sg50Var, null, false, z5, plg0Var, gzsVar);
                    } else {
                        q630.a aVar3 = q630.a.a;
                        if (sg50Var != null) {
                            z5 = z;
                            toggleableState2 = toggleableState;
                            q630Var2 = cuw.a(aVar3, sg50Var, a2).g(new cqp0(toggleableState2, sg50Var, null, false, z5, plg0Var, gzsVar));
                        } else {
                            toggleableState2 = toggleableState;
                            z5 = z;
                            q630Var2 = qri.a(aVar3, a5x.a, new c1p0(a2, toggleableState, z, plg0Var, gzsVar));
                        }
                    }
                } else {
                    toggleableState2 = toggleableState;
                    q630Var2 = q630.a.a;
                }
                q630 g = q630Var.g(q630Var2);
                dt1.a.getClass();
                q630 m = txj0.m(txj0.B(g, dt1.a.f, 2), f);
                M.K(-1004964588);
                aVar2 = M;
                vqv.a(xx1.C(im2.a(z6 ? R.drawable.ds_internal_avd_check_circle : R.drawable.ds_internal_avd_check_box, 6, M), toggleableState2 == ToggleableState.On, M, 0), null, m, u1cVar.a(z5, toggleableState2, M, ((i4 >> 15) & 14) | ((i4 << 3) & 112) | (i4 & 896)).getValue().a, aVar2, 56, 0);
                aVar2.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                z4 = z6;
            }
            s = aVar2.s();
            if (s == null) {
                final boolean z7 = z5;
                s.d = new wzs() { // from class: xsna.jh2
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        kh2.a(ToggleableState.this, gzsVar, u1cVar, f, q630Var, z7, z4, sg50Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        z3 = z2;
        if ((12582912 & i) == 0) {
        }
        i4 = i3;
        if (M.t(i4 & 1, (4793491 & i4) == 4793490)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(int i, androidx.compose.runtime.a aVar, ToggleableState toggleableState, q630 q630Var, boolean z) {
        boolean z2;
        long j;
        char c;
        long j2;
        char c2;
        char c3;
        boolean z3;
        long c4;
        int i2;
        long c5;
        androidx.compose.runtime.a M = aVar.M(1202344790);
        int i3 = i | (M.J(q630Var) ? 32 : 16) | 384;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1202344790, i3, -1, "com.vk.core.compose.component.internal.LegoCheckboxImpl (AnimatedCheck.kt:103)");
            }
            dtp0 d = jq2.d(200, 0, null, 6);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                sq90 sq90Var = new sq90(0);
                sq90Var.d("M8 0 l8 0 a8 8 0 0 1 8 8 L24 16 A8 8 0 0 1 16 24 L8 24 A8 8 0 0 1 0 16 L0 8 A8 8 0 0 1 8 0 Z");
                x = sq90Var.f();
                M.R(x);
            }
            final List list = (List) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                sq90 sq90Var2 = new sq90(0);
                sq90Var2.d("M8 0.5 l8 0 a7.5 7.5 0 0 1 7.5 7.5 l0 8 a7.5 7.5 0 0 1 -7.5 7.5 l-8 0 a7.5 7.5 0 0 1 -7.5 -7.5 l0 -8 a7.5 7.5 0 0 1 7.5 -7.5");
                x2 = sq90Var2.f();
                M.R(x2);
            }
            final List list2 = (List) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                sq90 sq90Var3 = new sq90(0);
                sq90Var3.d("M15.8338 7.05679C16.3548 6.41282 17.2991 6.3132 17.9432 6.83413C18.587 7.35516 18.6867 8.29951 18.1658 8.94351L11.6951 16.9435C11.4271 17.2747 11.0308 17.4765 10.6053 17.4982C10.1797 17.5198 9.7649 17.3592 9.46466 17.0568L5.93537 13.5011C5.35183 12.9132 5.35535 11.9636 5.94318 11.38C6.53111 10.7965 7.48066 10.8 8.06427 11.3878L10.4149 13.756L15.8338 7.05679Z");
                x3 = sq90Var3.f();
                M.R(x3);
            }
            final List list3 = (List) x3;
            Object x4 = M.x();
            if (x4 == c0012a) {
                sq90 sq90Var4 = new sq90(0);
                sq90Var4.d("M17 10.5C17.8284 10.5 18.5 11.1716 18.5 12C18.5 12.8284 17.8284 13.5 17 13.5H7C6.17157 13.5 5.5 12.8284 5.5 12C5.5 11.1716 6.17157 10.5 7 10.5H17Z");
                x4 = sq90Var4.f();
                M.R(x4);
            }
            final List list4 = (List) x4;
            int[] iArr = a.$EnumSwitchMapping$0;
            int i4 = iArr[toggleableState.ordinal()];
            if (i4 == 1 || i4 == 2) {
                M.K(107191649);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var.getIcon().j;
                M.j();
            } else {
                if (i4 != 3) {
                    throw alb0.c(107188269, M);
                }
                M.K(107194025);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var2.getBackground().x;
                M.j();
            }
            final mtk0 b = lwj0.b(j, d, null, M, 48, 12);
            int i5 = iArr[toggleableState.ordinal()];
            if (i5 == 1) {
                c = 41192;
                M.K(107200712);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var3 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j2 = ylu0Var3.getIcon().e;
                M.j();
            } else {
                if (i5 != 2 && i5 != 3) {
                    throw alb0.c(107198718, M);
                }
                M.K(107205094);
                if (androidx.compose.runtime.b.d()) {
                    c = 41192;
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                } else {
                    c = 41192;
                }
                ylu0 ylu0Var4 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j2 = l5g.c(14, ylu0Var4.getIcon().e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                M.j();
            }
            final mtk0 b2 = lwj0.b(j2, d, null, M, 48, 12);
            int i6 = iArr[toggleableState.ordinal()];
            if (i6 != 1) {
                if (i6 == 2) {
                    M.K(107212008);
                    if (androidx.compose.runtime.b.d()) {
                        c2 = 41192;
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    } else {
                        c2 = 41192;
                    }
                    ylu0 ylu0Var5 = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    c4 = ylu0Var5.getIcon().e;
                    M.j();
                    c3 = 14;
                    z3 = false;
                    final mtk0 b3 = lwj0.b(c4, d, null, M, 48, 12);
                    i2 = iArr[toggleableState.ordinal()];
                    if (i2 != 1 || i2 == 2) {
                        M.K(107226982);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var6 = (ylu0) M.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        c5 = l5g.c(14, ylu0Var6.r().b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        M.j();
                    } else {
                        if (i2 != 3) {
                            throw alb0.c(107220669, M);
                        }
                        M.K(107222726);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var7 = (ylu0) M.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        c5 = ylu0Var7.r().b;
                        M.j();
                    }
                    final mtk0 b4 = lwj0.b(c5, d, null, M, 48, 12);
                    uog0 b5 = vog0.b(8);
                    q630 a2 = o19.a(q630Var, 1.0f);
                    float f = 24;
                    llr0 g = mlr0.g(f, f, 24.0f, 24.0f, null, 0L, 0, false, kai.c(-1562966442, new zzs() { // from class: xsna.hh2
                        @Override // xsna.zzs
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            ((Float) obj).getClass();
                            ((Float) obj2).getClass();
                            androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                            int intValue = ((Integer) obj4).intValue();
                            if (aVar2.t(intValue & 1, (intValue & 129) != 128)) {
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(-1562966442, intValue, -1, "com.vk.core.compose.component.internal.LegoCheckboxImpl.<anonymous> (AnimatedCheck.kt:176)");
                                }
                                blr0.b(list, 0, null, new rek0(((l5g) b.getValue()).a), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar2, 0, 0, 16374);
                                blr0.b(list2, 0, null, new rek0(((l5g) b4.getValue()).a), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar2, 0, 0, 16374);
                                blr0.b(list4, 0, null, new rek0(((l5g) b3.getValue()).a), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar2, 0, 0, 16374);
                                blr0.b(list3, 0, null, new rek0(((l5g) b2.getValue()).a), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar2, 0, 0, 16374);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                            } else {
                                aVar2.h();
                            }
                            return s3q0.a;
                        }
                    }, M), M, 113249718, 112);
                    M = M;
                    ja8.a(r18.a(1, ((l5g) b4.getValue()).a, ng90.a(a2, g, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 62), b5), M, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    z2 = true;
                } else if (i6 != 3) {
                    throw alb0.c(107209662, M);
                }
            }
            c2 = 41192;
            M.K(107216038);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var8 = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j3 = ylu0Var8.getIcon().e;
            c3 = 14;
            z3 = false;
            c4 = l5g.c(14, j3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            M.j();
            final mtk0 b32 = lwj0.b(c4, d, null, M, 48, 12);
            i2 = iArr[toggleableState.ordinal()];
            if (i2 != 1) {
            }
            M.K(107226982);
            if (androidx.compose.runtime.b.d()) {
            }
            ylu0 ylu0Var62 = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
            }
            c5 = l5g.c(14, ylu0Var62.r().b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            M.j();
            final mtk0 b42 = lwj0.b(c5, d, null, M, 48, 12);
            uog0 b52 = vog0.b(8);
            q630 a22 = o19.a(q630Var, 1.0f);
            float f2 = 24;
            llr0 g2 = mlr0.g(f2, f2, 24.0f, 24.0f, null, 0L, 0, false, kai.c(-1562966442, new zzs() { // from class: xsna.hh2
                @Override // xsna.zzs
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    ((Float) obj).getClass();
                    ((Float) obj2).getClass();
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if (aVar2.t(intValue & 1, (intValue & 129) != 128)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1562966442, intValue, -1, "com.vk.core.compose.component.internal.LegoCheckboxImpl.<anonymous> (AnimatedCheck.kt:176)");
                        }
                        blr0.b(list, 0, null, new rek0(((l5g) b.getValue()).a), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar2, 0, 0, 16374);
                        blr0.b(list2, 0, null, new rek0(((l5g) b42.getValue()).a), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar2, 0, 0, 16374);
                        blr0.b(list4, 0, null, new rek0(((l5g) b32.getValue()).a), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar2, 0, 0, 16374);
                        blr0.b(list3, 0, null, new rek0(((l5g) b2.getValue()).a), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar2, 0, 0, 16374);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 113249718, 112);
            M = M;
            ja8.a(r18.a(1, ((l5g) b42.getValue()).a, ng90.a(a22, g2, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 62), b52), M, 0);
            if (androidx.compose.runtime.b.d()) {
            }
            z2 = true;
        } else {
            M.h();
            z2 = z;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ih2(i, 0, toggleableState, q630Var, z2);
        }
    }
}
