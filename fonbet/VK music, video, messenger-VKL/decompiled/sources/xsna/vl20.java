package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.PlaceholderMode;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ym20;

/* compiled from: MiddleImpl.kt */
/* loaded from: classes17.dex */
public final class vl20 implements zra0 {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;

    public vl20() {
        this(null, null, null, Integer.MAX_VALUE, null);
    }

    @Override // xsna.zra0
    public final void a(PlaceholderMode placeholderMode, androidx.compose.runtime.a aVar, int i) {
        aVar.K(-998365453);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-998365453, i, -1, "com.vk.core.compose.component.placeholder.MiddleImpl.Content (MiddleImpl.kt:47)");
        }
        aVar.K(343624727);
        b(placeholderMode, aVar, ((i >> 6) & 896) | (i & 14) | ((i >> 3) & 112));
        aVar.j();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
    }

    public final void b(PlaceholderMode placeholderMode, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        String str;
        boolean z;
        long j;
        String str2;
        int i3;
        String str3;
        int i4;
        q630.a aVar3;
        long j2;
        int i5;
        int i6;
        long j3;
        androidx.compose.runtime.a M = aVar.M(-1965823468);
        int i7 = i & 6;
        q630.a aVar4 = q630.a.a;
        if (i7 == 0) {
            i2 = (M.J(aVar4) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.o(placeholderMode == null ? -1 : placeholderMode.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1965823468, i2, -1, "com.vk.core.compose.component.placeholder.MiddleImpl.MilkshakeContent (MiddleImpl.kt:59)");
            }
            q630 x = txj0.x(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 584, 1, aVar4);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            a.j g = androidx.compose.foundation.layout.a.g(kqu0.s);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(g, dt1.a.o, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, x);
            cri.h7.getClass();
            LayoutNode.a aVar5 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar5);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            us2 us2Var = (us2) ((zak0) this.a).getValue();
            if (us2Var == null) {
                M.K(1068029647);
                M.j();
                i3 = i2;
                aVar3 = aVar4;
                str2 = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                str3 = "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)";
                i4 = -473561179;
            } else {
                M.K(1068029648);
                q630 b = com.vk.core.compose.component.semantics.b.b(aVar4, (SemanticsConfiguration) ((zak0) this.b).getValue());
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.C;
                int i8 = (i2 >> 3) & 14;
                sdy.m().getClass();
                M.K(-2066874538);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-2066874538, i8, -1, "com.vk.core.compose.component.defaults.milkshake.MilkShakePlaceholderDefaults.titleTextColor (MilkShakePlaceholderDefaults.kt:22)");
                }
                int i9 = ym20.a.$EnumSwitchMapping$0[placeholderMode.ordinal()];
                if (i9 != 1) {
                    if (i9 != 2) {
                        M.K(-1991532511);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        str = "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)";
                        j2 = ylu0Var.getText().m;
                        M.j();
                    } else {
                        str = "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)";
                        M.K(-1991534206);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j2 = ylu0Var2.getText().d;
                        M.j();
                    }
                    j = j2;
                    z = false;
                } else {
                    str = "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)";
                    M.K(-1991535967);
                    if (androidx.compose.runtime.b.d()) {
                        z = false;
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    } else {
                        z = false;
                    }
                    ylu0 ylu0Var3 = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j = ylu0Var3.getText().m;
                    M.j();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                str2 = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                i3 = i2;
                str3 = str;
                i4 = -473561179;
                aVar3 = aVar4;
                yqv0.d(us2Var, b, j, 3, null, 0, false, 0, null, null, frv0Var, M, 0, 0, 8120);
                M = M;
                M.j();
            }
            us2 us2Var2 = (us2) ((zak0) this.c).getValue();
            if (us2Var2 == null) {
                M.K(1068425052);
                M.j();
                aVar2 = M;
            } else {
                M.K(1068425053);
                q630 b2 = com.vk.core.compose.component.semantics.b.b(aVar3, (SemanticsConfiguration) ((zak0) this.e).getValue());
                if (androidx.compose.runtime.b.d()) {
                    i5 = -1;
                    i6 = 0;
                    androidx.compose.runtime.b.f(i4, 0, -1, str3);
                } else {
                    i5 = -1;
                    i6 = 0;
                }
                wuv0 wuv0Var2 = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var2 = wuv0Var2.X;
                int i10 = (i3 >> 3) & 14;
                sdy.m().getClass();
                M.K(-1043147406);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1043147406, i10, i5, "com.vk.core.compose.component.defaults.milkshake.MilkShakePlaceholderDefaults.subtitleTextColor (MilkShakePlaceholderDefaults.kt:30)");
                }
                int i11 = ym20.a.$EnumSwitchMapping$0[placeholderMode.ordinal()];
                if (i11 == 1) {
                    String str4 = str2;
                    M.K(-1737272801);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, i6, i5, str4);
                    }
                    ylu0 ylu0Var4 = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j3 = ylu0Var4.getText().p;
                    M.j();
                } else if (i11 != 2) {
                    M.K(-1737269281);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, i6, i5, str2);
                    }
                    ylu0 ylu0Var5 = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j3 = ylu0Var5.getText().p;
                    M.j();
                } else {
                    String str5 = str2;
                    M.K(-1737270978);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, i6, i5, str5);
                    }
                    ylu0 ylu0Var6 = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j3 = ylu0Var6.getText().d;
                    M.j();
                }
                long j4 = j3;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                aVar2 = M;
                yqv0.d(us2Var2, b2, j4, 3, null, 0, false, 0, null, null, frv0Var2, aVar2, 0, 0, 8120);
                aVar2.j();
            }
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new adh(this, placeholderMode, i);
        }
    }

    public vl20(us2 us2Var, SemanticsConfiguration semanticsConfiguration, us2 us2Var2, int i, SemanticsConfiguration semanticsConfiguration2) {
        this.a = androidx.compose.runtime.k.b(us2Var);
        this.b = androidx.compose.runtime.k.b(semanticsConfiguration);
        this.c = androidx.compose.runtime.k.b(us2Var2);
        this.d = androidx.compose.runtime.k.b(Integer.valueOf(i));
        this.e = androidx.compose.runtime.k.b(semanticsConfiguration2);
    }
}
