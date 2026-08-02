package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.CellButton$Appearance;
import com.vk.core.compose.component.defaults.CellButton$IconAlign;
import com.vk.core.compose.component.defaults.CellButton$IconBackgroundStyle;
import com.vk.core.compose.component.defaults.CellButton$IconSize;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.NoWhenBranchMatchedException;
import xsna.cri;
import xsna.dt1;
import xsna.hiu0;
import xsna.q630;
import xsna.ty6;

/* compiled from: VkCellButtonMilkshake.kt */
/* loaded from: classes17.dex */
public final class uiu0 {

    /* compiled from: VkCellButtonMilkshake.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CellButton$IconAlign.values().length];
            try {
                iArr[CellButton$IconAlign.Top.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CellButton$IconAlign.Center.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(jai jaiVar, final gzs gzsVar, final q630 q630Var, final lg90 lg90Var, l5g l5gVar, final CellButton$Appearance cellButton$Appearance, final CellButton$IconBackgroundStyle cellButton$IconBackgroundStyle, final CellButton$IconSize cellButton$IconSize, final CellButton$IconAlign cellButton$IconAlign, final boolean z, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        gzs gzsVar2;
        int i4;
        jai jaiVar2;
        l5g l5gVar2;
        sg50 sg50Var;
        int i5;
        q630.a aVar2;
        float f;
        int i6;
        ty6.b bVar;
        float f2;
        float a2;
        long j;
        uog0 uog0Var;
        int i7;
        long j2;
        int i8;
        androidx.compose.runtime.a M = aVar.M(630245531);
        if ((i & 6) == 0) {
            i3 = (M.y(jaiVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            gzsVar2 = gzsVar;
            i3 |= M.y(gzsVar2) ? 32 : 16;
        } else {
            gzsVar2 = gzsVar;
        }
        if ((i & 384) == 0) {
            i3 |= M.J(q630Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= M.y(null) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= (32768 & i) == 0 ? M.J(lg90Var) : M.y(lg90Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= M.J(l5gVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= M.o(cellButton$Appearance == null ? -1 : cellButton$Appearance.ordinal()) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= M.o(cellButton$IconBackgroundStyle == null ? -1 : cellButton$IconBackgroundStyle.ordinal()) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= M.o(cellButton$IconSize == null ? -1 : cellButton$IconSize.ordinal()) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= M.o(cellButton$IconAlign == null ? -1 : cellButton$IconAlign.ordinal()) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (M.l(z) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= M.J(null) ? 32 : 16;
        }
        if (M.t(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(630245531, i3, i4, "com.vk.core.compose.component.cell.button.VkCellButtonMilkshake (VkCellButtonMilkshake.kt:69)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = ir.h(M);
            }
            sg50 sg50Var2 = (sg50) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                sg50Var = sg50Var2;
                i5 = i3;
                x2 = qer0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 7, 0L, false);
                M.R(x2);
            } else {
                sg50Var = sg50Var2;
                i5 = i3;
            }
            guw guwVar = (guw) x2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(654261423, 6, -1, "com.vk.core.compose.component.defaults.VkCellButtonDefaults.minHeight (VkCellButtonDefaults.kt:20)");
            }
            float f3 = 44;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630.a aVar3 = q630.a.a;
            int i9 = 0;
            int i10 = i4;
            q630 d = ojc.d(txj0.f(txj0.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, 1, aVar3), 1.0f), sg50Var, guwVar, z, new plg0(0), null, gzsVar2, 424);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(807787085, 6, -1, "com.vk.core.compose.component.defaults.VkCellButtonDefaults.verticalPadding (VkCellButtonDefaults.kt:28)");
                i9 = 0;
            }
            float f4 = i9;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, 1, d);
            boolean z2 = (i10 & 14) == 4;
            Object x3 = M.x();
            if (z2 || x3 == c0012a) {
                x3 = new xib(z, 2);
                M.R(x3);
            }
            q630 g = q630Var.g(rdu.a(F, (izs) x3));
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            ty6.b bVar2 = dt1.a.l;
            androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(lVar, bVar2, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, g);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a3, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar3 = cri.a.g;
            k9q0.w(M, valueOf, bVar3);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            float f5 = kqu0.b;
            f9t.e(txj0.v(aVar3, f5), M, 0);
            if (lg90Var != null) {
                M.K(-1222726050);
                int i11 = a.$EnumSwitchMapping$0[cellButton$IconAlign.ordinal()];
                if (i11 == 1) {
                    bVar = dt1.a.k;
                } else {
                    if (i11 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar = bVar2;
                }
                int i12 = ((i5 >> 21) & 14) | 48;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1360619590, i12, -1, "com.vk.core.compose.component.defaults.VkCellButtonDefaults.iconBackgroundVerticalPadding (VkCellButtonDefaults.kt:62)");
                }
                int[] iArr = hiu0.a.$EnumSwitchMapping$1;
                int i13 = iArr[cellButton$IconBackgroundStyle.ordinal()];
                if (i13 == 1) {
                    f2 = kqu0.u;
                } else if (i13 == 2) {
                    f2 = kqu0.s;
                } else if (i13 == 3) {
                    f2 = kqu0.s;
                } else if (i13 == 4) {
                    f2 = kqu0.s;
                } else {
                    if (i13 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f2 = kqu0.s;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630 F2 = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, 1, aVar3);
                int i14 = iArr[cellButton$IconBackgroundStyle.ordinal()];
                if (i14 == 1) {
                    a2 = hiu0.a(cellButton$IconSize, cellButton$IconBackgroundStyle);
                } else {
                    if (i14 != 2 && i14 != 3 && i14 != 4 && i14 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i15 = hiu0.a.$EnumSwitchMapping$0[cellButton$IconSize.ordinal()];
                    if (i15 == 1) {
                        i8 = 40;
                    } else if (i15 == 2) {
                        a2 = 48;
                    } else {
                        if (i15 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i8 = 72;
                    }
                    a2 = i8;
                }
                q630 g2 = txj0.q(F2, a2).g(new gor0(bVar));
                cp10 d2 = ja8.d(dt1.a.f, false);
                int hashCode2 = Long.hashCode(n34.n(M));
                sy90 D2 = M.D();
                q630 c2 = qri.c(M, g2);
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
                k9q0.w(M, d2, cVar);
                k9q0.w(M, D2, eVar);
                ur.d(hashCode2, M, bVar3, M, c2678a);
                k9q0.w(M, c2, dVar);
                q630 d3 = txj0.d(aVar3, 1.0f);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1028075261, i12, -1, "com.vk.core.compose.component.defaults.VkCellButtonDefaults.iconBackgroundColor (VkCellButtonDefaults.kt:83)");
                }
                int i16 = iArr[cellButton$IconBackgroundStyle.ordinal()];
                if (i16 == 1) {
                    M.K(137854184);
                    M.j();
                    j = l5g.j;
                } else if (i16 == 2) {
                    M.K(137857104);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j = ylu0Var.getBackground().x;
                    M.j();
                } else if (i16 == 3) {
                    M.K(137860624);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j = ylu0Var2.getBackground().x;
                    M.j();
                } else if (i16 == 4) {
                    M.K(137864176);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var3 = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j = ylu0Var3.getBackground().x;
                    M.j();
                } else {
                    if (i16 != 5) {
                        throw alb0.c(137851958, M);
                    }
                    M.K(137867696);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var4 = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j = ylu0Var4.getBackground().x;
                    M.j();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                int i17 = i5 >> 18;
                int i18 = ((i5 >> 24) & 14) | 384 | (i17 & 112);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1296211707, i18, -1, "com.vk.core.compose.component.defaults.VkCellButtonDefaults.iconBackgroundShape (VkCellButtonDefaults.kt:95)");
                }
                boolean z3 = ((((i18 & 14) ^ 6) > 4 && M.o(cellButton$IconSize.ordinal())) || (i18 & 6) == 4) | ((((i18 & 112) ^ 48) > 32 && M.o(cellButton$IconBackgroundStyle.ordinal())) || (i18 & 48) == 32);
                Object x4 = M.x();
                if (z3 || x4 == c0012a) {
                    int i19 = iArr[cellButton$IconBackgroundStyle.ordinal()];
                    if (i19 == 1) {
                        uog0Var = vog0.a;
                    } else if (i19 == 2) {
                        uog0Var = vog0.a;
                    } else if (i19 == 3) {
                        int i20 = hiu0.a.$EnumSwitchMapping$0[cellButton$IconSize.ordinal()];
                        if (i20 == 1 || i20 == 2) {
                            uog0Var = vog0.b(3);
                        } else {
                            if (i20 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            uog0Var = vog0.b(4);
                        }
                    } else if (i19 == 4) {
                        int i21 = hiu0.a.$EnumSwitchMapping$0[cellButton$IconSize.ordinal()];
                        if (i21 == 1 || i21 == 2) {
                            uog0Var = vog0.b(4);
                        } else {
                            if (i21 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            uog0Var = vog0.b(6);
                        }
                    } else {
                        if (i19 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        int i22 = hiu0.a.$EnumSwitchMapping$0[cellButton$IconSize.ordinal()];
                        if (i22 == 1 || i22 == 2) {
                            uog0Var = vog0.b(8);
                        } else {
                            if (i22 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            uog0Var = vog0.b(16);
                        }
                    }
                    x4 = uog0Var;
                    M.R(x4);
                }
                uog0 uog0Var2 = (uog0) x4;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                f9t.e(hr80.m(d3, j, uog0Var2), M, 0);
                q630 q = txj0.q(aVar3, hiu0.a(cellButton$IconSize, cellButton$IconBackgroundStyle));
                if (l5gVar == null) {
                    M.K(-1958547733);
                    int i23 = (i17 & 14) | 48;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1157831587, i23, -1, "com.vk.core.compose.component.defaults.VkCellButtonDefaults.iconColor (VkCellButtonDefaults.kt:137)");
                    }
                    int i24 = hiu0.a.$EnumSwitchMapping$2[cellButton$Appearance.ordinal()];
                    if (i24 != 1) {
                        if (i24 == 2) {
                            M.K(-279614680);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                            }
                            ylu0 ylu0Var5 = (ylu0) M.r(rrv0.a);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            j2 = ylu0Var5.getIcon().j;
                            M.j();
                        } else {
                            if (i24 != 3) {
                                throw alb0.c(-279622566, M);
                            }
                            M.K(-279612311);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                            }
                            ylu0 ylu0Var6 = (ylu0) M.r(rrv0.a);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            j2 = ylu0Var6.getIcon().h;
                            M.j();
                        }
                        i7 = 0;
                    } else {
                        M.K(-279620860);
                        M.K(-78234225);
                        i7 = 0;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var7 = (ylu0) M.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j2 = ylu0Var7.getIcon().a;
                        M.j();
                        M.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    M.j();
                    l5gVar2 = l5gVar;
                } else {
                    i7 = 0;
                    M.K(-1958548756);
                    M.j();
                    l5gVar2 = l5gVar;
                    j2 = l5gVar2.a;
                }
                long j3 = j2;
                i6 = i7;
                aVar2 = aVar3;
                f = f5;
                vqv.a(lg90Var, null, q, j3, M, 56 | ((i5 >> 12) & 14), 0);
                M.G();
                mq.d(aVar2, kqu0.v, M, i6);
            } else {
                l5gVar2 = l5gVar;
                aVar2 = aVar3;
                f = f5;
                i6 = 0;
                M.K(-1226840277);
                M.j();
            }
            jaiVar2 = jaiVar;
            jaiVar2.invoke(M, Integer.valueOf(i5 & 14));
            f9t.e(txj0.v(aVar2, f), M, i6);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            jaiVar2 = jaiVar;
            l5gVar2 = l5gVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final jai jaiVar3 = jaiVar2;
            final l5g l5gVar3 = l5gVar2;
            s.d = new wzs() { // from class: xsna.tiu0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    uiu0.a(jai.this, gzsVar, q630Var, lg90Var, l5gVar3, cellButton$Appearance, cellButton$IconBackgroundStyle, cellButton$IconSize, cellButton$IconAlign, z, (androidx.compose.runtime.a) obj, ne7.I(i | 1), ne7.I(i2));
                    return s3q0.a;
                }
            };
        }
    }
}
