package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.miniinfo.MiniInfoCell$Mode;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: MiniInfoCell.kt */
/* loaded from: classes17.dex */
public final class ar20 {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;
    public final wh50<zhf0> f = androidx.compose.runtime.k.b(zhf0.e);

    /* compiled from: MiniInfoCell.kt */
    public static final class a {
        public static ar20 a(String str, boolean z, boolean z2, boolean z3, com.vk.core.compose.component.semantics.a aVar, androidx.compose.runtime.a aVar2, int i, int i2) {
            if ((i2 & 2) != 0) {
                z = false;
            }
            if ((i2 & 4) != 0) {
                z2 = false;
            }
            if ((i2 & 8) != 0) {
                z3 = false;
            }
            if ((i2 & 16) != 0) {
                aVar = null;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-376912877, i, -1, "com.vk.core.compose.component.cell.miniinfo.MiniInfoCell.Middle.Companion.invoke (MiniInfoCell.kt:107)");
            }
            ar20 b = b(ws2.e(str), z, z2, z3, aVar, aVar2, i & 524272, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return b;
        }

        public static ar20 b(us2 us2Var, boolean z, boolean z2, boolean z3, SemanticsConfiguration semanticsConfiguration, androidx.compose.runtime.a aVar, int i, int i2) {
            us2 us2Var2;
            boolean z4 = (i2 & 2) != 0 ? false : z;
            boolean z5 = (i2 & 4) != 0 ? false : z2;
            boolean z6 = (i2 & 8) != 0 ? false : z3;
            if ((i2 & 16) != 0) {
                semanticsConfiguration = null;
            }
            SemanticsConfiguration semanticsConfiguration2 = semanticsConfiguration;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-102798177, i, -1, "com.vk.core.compose.component.cell.miniinfo.MiniInfoCell.Middle.Companion.invoke (MiniInfoCell.kt:122)");
            }
            Object x = aVar.x();
            if (x == a.C0011a.a) {
                us2Var2 = us2Var;
                ar20 ar20Var = new ar20(us2Var2, z4, z5, z6, semanticsConfiguration2);
                aVar.R(ar20Var);
                x = ar20Var;
            } else {
                us2Var2 = us2Var;
            }
            ar20 ar20Var2 = (ar20) x;
            ((zak0) ar20Var2.a).setValue(us2Var2);
            ((zak0) ar20Var2.b).setValue(Boolean.valueOf(z4));
            ((zak0) ar20Var2.d).setValue(Boolean.valueOf(z5));
            ((zak0) ar20Var2.c).setValue(Boolean.valueOf(z6));
            ((zak0) ar20Var2.e).setValue(semanticsConfiguration2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return ar20Var2;
        }
    }

    public ar20(us2 us2Var, boolean z, boolean z2, boolean z3, SemanticsConfiguration semanticsConfiguration) {
        this.a = androidx.compose.runtime.k.b(us2Var);
        this.b = androidx.compose.runtime.k.b(Boolean.valueOf(z));
        this.c = androidx.compose.runtime.k.b(Boolean.valueOf(z3));
        this.d = androidx.compose.runtime.k.b(Boolean.valueOf(z2));
        this.e = androidx.compose.runtime.k.b(semanticsConfiguration);
    }

    public final void a(MiniInfoCell$Mode miniInfoCell$Mode, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        MiniInfoCell$Mode miniInfoCell$Mode2;
        long j;
        androidx.compose.runtime.a M = aVar.M(-1794291743);
        if ((i & 6) == 0) {
            i2 = (M.o(miniInfoCell$Mode.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1794291743, i2, -1, "com.vk.core.compose.component.cell.miniinfo.MiniInfoCell.Middle.Content (MiniInfoCell.kt:58)");
            }
            q630 b = com.vk.core.compose.component.semantics.b.b(s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 1, q630Var), (SemanticsConfiguration) ((zak0) this.e).getValue());
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, b);
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
            miniInfoCell$Mode2 = miniInfoCell$Mode;
            b(((Boolean) ((zak0) this.c).getValue()).booleanValue(), kai.c(-680810116, new yku(4, this, miniInfoCell$Mode2), M), M, (i2 & 896) | 48);
            f9t.e(txj0.v(q630.a.a, 4), M, 6);
            if (((Boolean) ((zak0) this.d).getValue()).booleanValue()) {
                M.K(781337943);
                gor0 gor0Var = new gor0(dt1.a.l);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-2112191392, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Chevron16> (VkSdkIcons.kt:408)");
                }
                lg90 a3 = pg90.a(R.drawable.vk_icon_chevron_16, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                int i3 = (i2 & 14) | 48;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(316015370, i3, -1, "com.vk.core.compose.component.defaults.VkMiniInfoCellDefaults.chevronTint (VkMiniInfoCellDefaults.kt:60)");
                }
                int i4 = z3v0.$EnumSwitchMapping$0[miniInfoCell$Mode2.ordinal()];
                if (i4 == 1) {
                    M.K(-1251903337);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j = ylu0Var.getIcon().l;
                    M.j();
                } else if (i4 == 2) {
                    M.K(-1251901420);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j = ylu0Var2.getIcon().f;
                    M.j();
                } else if (i4 == 3) {
                    M.K(-1251899788);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var3 = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j = ylu0Var3.getIcon().a;
                    M.j();
                } else if (i4 == 4) {
                    M.K(-1251898060);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var4 = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j = ylu0Var4.getIcon().a;
                    M.j();
                } else {
                    if (i4 != 5) {
                        throw alb0.c(-1251904784, M);
                    }
                    M.K(-1251896300);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var5 = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j = ylu0Var5.getIcon().a;
                    M.j();
                }
                long j2 = j;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                vqv.a(a3, null, gor0Var, j2, M, 56, 0);
            } else {
                M.K(778000669);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            miniInfoCell$Mode2 = miniInfoCell$Mode;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new y2c(i, 2, this, miniInfoCell$Mode2, q630Var);
        }
    }

    public final void b(boolean z, jai jaiVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1601336050);
        if ((i & 6) == 0) {
            i2 = (M.l(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(jaiVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1601336050, i2, -1, "com.vk.core.compose.component.cell.miniinfo.MiniInfoCell.Middle.SelectableContent (MiniInfoCell.kt:90)");
            }
            if (z) {
                M.K(1200647760);
                ici0.a(null, kai.c(-1599196496, new xa2(jaiVar, 8), M), M, 48);
                M.j();
            } else {
                M.K(1200716487);
                jaiVar.invoke(M, Integer.valueOf((i2 >> 3) & 14));
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
            s.d = new sn20(this, z, jaiVar, i, 1);
        }
    }
}
