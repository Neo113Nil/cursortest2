package xsna;

import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.profile.core.tabs.ui.fab.ProfileFabState;
import com.vkontakte.android.R;
import xsna.cp8;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;

/* compiled from: ProfileFabView.kt */
/* loaded from: classes5.dex */
public final class mwd0 {
    public static final void a(final ProfileFabState profileFabState, final gzs<s3q0> gzsVar, final gzs<s3q0> gzsVar2, final boolean z, androidx.compose.runtime.a aVar, final int i) {
        long j;
        androidx.compose.runtime.a M = aVar.M(1923560243);
        int i2 = i | (M.J(profileFabState) ? 4 : 2) | (M.y(gzsVar) ? 32 : 16) | (M.y(gzsVar2) ? 256 : 128) | (M.l(z) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1923560243, i2, -1, "com.vk.profile.design.view.fab.FabContent (ProfileFabView.kt:296)");
            }
            a.c cVar = androidx.compose.foundation.layout.a.e;
            dt1.a.getClass();
            ty6.b bVar = dt1.a.l;
            IntrinsicSize intrinsicSize = IntrinsicSize.Min;
            q630.a aVar2 = q630.a.a;
            q630 u = m200.u(aVar2, intrinsicSize);
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(cVar, bVar, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, u);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            cwd0 cwd0Var = profileFabState.c;
            dwd0 dwd0Var = profileFabState.d;
            dwd0 dwd0Var2 = profileFabState.e;
            if (cwd0Var != null) {
                M.K(-1541619367);
                b(gzsVar, cwd0Var, z, M, (i2 >> 3) & 910);
            } else {
                M.K(-1553004117);
            }
            M.j();
            if (dwd0Var == null || cwd0Var == null) {
                M.K(-1553004117);
            } else {
                M.K(-1541381380);
                q630 v = txj0.v(txj0.c(aVar2, z ? 0.5f : 1.0f), z ? 1 : (float) 0.66d);
                if (z) {
                    M.K(-2127923821);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j = ylu0Var.m().d;
                } else {
                    M.K(-2127921943);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j = ylu0Var2.p().c;
                }
                M.j();
                ja8.a(hr80.m(v, j, androidx.compose.ui.graphics.e.a), M, 0);
            }
            M.j();
            if (dwd0Var != null) {
                M.K(-1540989323);
                c(gzsVar2, dwd0Var, z, M, ((i2 >> 6) & 14) | ((i2 >> 3) & 896));
            } else {
                M.K(-1553004117);
            }
            M.j();
            if (dwd0Var2 != null) {
                M.K(-1540774028);
                c(gzsVar2, dwd0Var2, z, M, ((i2 >> 6) & 14) | ((i2 >> 3) & 896));
            } else {
                M.K(-1553004117);
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
            s.d = new wzs(gzsVar, gzsVar2, z, i) { // from class: xsna.jwd0
                public final /* synthetic */ gzs c;
                public final /* synthetic */ gzs d;
                public final /* synthetic */ boolean e;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    mwd0.a(ProfileFabState.this, this.c, this.d, this.e, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(gzs<s3q0> gzsVar, cwd0 cwd0Var, boolean z, androidx.compose.runtime.a aVar, int i) {
        int i2;
        lg90 a;
        long j;
        androidx.compose.runtime.a M = aVar.M(-925088536);
        if ((i & 6) == 0) {
            i2 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? M.J(cwd0Var) : M.y(cwd0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-925088536, i2, -1, "com.vk.profile.design.view.fab.LeftButton (ProfileFabView.kt:365)");
            }
            if (cwd0Var.b == 0) {
                M.K(48153837);
                qzu0.a.getClass();
                a = qzu0.a(M);
            } else {
                M.K(48154222);
                a = pg90.a(cwd0Var.b, 0, M);
            }
            M.j();
            final lg90 lg90Var = a;
            final float f = 16;
            final String N = d370.N(cwd0Var.a, 0, M);
            final Integer num = cwd0Var.c;
            if (z) {
                M.K(48161307);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var.getBackground().x;
            } else {
                M.K(48162942);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var2.getBackground().d;
            }
            M.j();
            final long j2 = j;
            ButtonSize buttonSize = ButtonSize.Medium;
            ButtonStyle buttonStyle = z ? ButtonStyle.Link : ButtonStyle.Tertiary;
            ButtonAppearance buttonAppearance = z ? ButtonAppearance.Overlay : ButtonAppearance.Neutral;
            final lgu0 b = hr80.z().b(buttonStyle, buttonAppearance, M, 0);
            bhu0.c(gzsVar, buttonSize, buttonStyle, buttonAppearance, ahn.E(s200.H(q630.a.a, z ? 8 : 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, z ? 8 : 4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10), "ProfileFabLeftButton"), null, null, false, null, null, null, false, kai.c(-671419901, new yzs() { // from class: xsna.kwd0
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if (aVar2.t(intValue & 1, (intValue & 17) != 16)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-671419901, intValue, -1, "com.vk.profile.design.view.fab.LeftButton.<anonymous> (ProfileFabView.kt:389)");
                        }
                        a.l lVar = androidx.compose.foundation.layout.a.a;
                        hr80.z().getClass();
                        op8.h();
                        float f2 = kqu0.s;
                        dt1.a.getClass();
                        androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.h(f2, dt1.a.o), dt1.a.l, aVar2, 48);
                        int hashCode = Long.hashCode(n34.n(aVar2));
                        sy90 D = aVar2.D();
                        q630 c = qri.c(aVar2, q630.a.a);
                        cri.h7.getClass();
                        LayoutNode.a aVar3 = cri.a.b;
                        if (aVar2.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar2.H();
                        if (aVar2.L()) {
                            aVar2.I(aVar3);
                        } else {
                            aVar2.f();
                        }
                        k9q0.w(aVar2, a2, cri.a.f);
                        k9q0.w(aVar2, D, cri.a.e);
                        k9q0.w(aVar2, Integer.valueOf(hashCode), cri.a.g);
                        k9q0.t(aVar2, cri.a.h);
                        k9q0.w(aVar2, c, cri.a.d);
                        aVar2.K(927080226);
                        float f3 = f;
                        pqv a3 = cp8.b.a.a(lg90.this, null, new uco(byc0.b(f3, f3)), null, null, aVar2, 197048, 24);
                        lgu0 lgu0Var = b;
                        a3.a(lgu0Var, aVar2, 390);
                        aVar2.j();
                        aVar2.K(927084935);
                        cp8.d.a.a(N, null, aVar2, 3072, 6).a(lgu0Var, aVar2, 390);
                        aVar2.j();
                        Integer num2 = num;
                        if (num2 != null) {
                            aVar2.K(-1324997407);
                            int intValue2 = num2.intValue();
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-884589047, 3072, -1, "com.vk.profile.design.view.fab.ColoredCounter.Companion.invoke (ProfileFabView.kt:420)");
                            }
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-918468882, 6, -1, "com.vk.profile.design.view.fab.remember (ProfileFabView.kt:453)");
                            }
                            Object x = aVar2.x();
                            a.C0011a.C0012a c0012a = a.C0011a.a;
                            long j3 = j2;
                            if (x == c0012a) {
                                x = new i9g(intValue2, j3);
                                aVar2.R(x);
                            }
                            i9g i9gVar = (i9g) x;
                            ((zak0) i9gVar.e).setValue(num2);
                            ((zak0) i9gVar.f).setValue(new l5g(j3));
                            ((zak0) i9gVar.g).setValue(null);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            i9gVar.a(lgu0Var, aVar2, 390);
                        } else {
                            aVar2.K(-1340018333);
                        }
                        aVar2.j();
                        aVar2.G();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, (i2 & 14) | 48, 384, 4064);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new lwd0(gzsVar, cwd0Var, z, i);
        }
    }

    public static final void c(gzs<s3q0> gzsVar, dwd0 dwd0Var, boolean z, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1165202212);
        if ((i & 6) == 0) {
            i2 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? M.J(dwd0Var) : M.y(dwd0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1165202212, i2, -1, "com.vk.profile.design.view.fab.RightButton (ProfileFabView.kt:342)");
            }
            q630 E = ahn.E(s200.H(q630.a.a, z ? 8 : 4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, z ? 8 : 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10), "ProfileFabRightButton");
            ButtonSize buttonSize = ButtonSize.Medium;
            ButtonStyle buttonStyle = z ? ButtonStyle.Link : ButtonStyle.Tertiary;
            ButtonAppearance buttonAppearance = z ? ButtonAppearance.Overlay : ButtonAppearance.Neutral;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2112191392, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Chevron16> (VkSdkIcons.kt:408)");
            }
            lg90 a = pg90.a(R.drawable.vk_icon_chevron_16, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            bhu0.e(gzsVar, buttonSize, buttonStyle, buttonAppearance, E, null, false, false, null, null, null, d370.N(dwd0Var.a, 0, M), null, a, null, new pco(16), false, null, null, null, aVar2, (i2 & 14) | 48, 1605632, 0, 4108256);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new sn20(gzsVar, dwd0Var, z, i);
        }
    }
}
