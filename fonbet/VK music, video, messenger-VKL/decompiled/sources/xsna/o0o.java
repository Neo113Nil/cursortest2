package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.group.header.b;
import com.vk.core.compose.component.group.header.f;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.e;
import com.vk.newsfeed.posting.impl.presentation.model.DonutLevel;
import com.vk.toggle.features.ComFeatures;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: DonutLevelsFragment.kt */
/* loaded from: classes4.dex */
public final class o0o {
    public static final void a(final DonutLevel donutLevel, final boolean z, final gzs gzsVar, final boolean z2, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        com.vk.core.compose.component.cell.content.h1 h1Var;
        com.vk.core.compose.component.cell.content.o oVar;
        com.vk.core.compose.component.cell.content.o oVar2;
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1742221764);
        int i3 = i | (M.J(donutLevel) ? 4 : 2) | (M.l(z) ? 32 : 16) | (M.y(gzsVar) ? 256 : 128);
        if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1742221764, i3, -1, "com.vk.newsfeed.posting.privacy_picker.presentation.donut_levels.LevelCell (DonutLevelsFragment.kt:243)");
            }
            String str = donutLevel.c;
            String str2 = donutLevel.d;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new md(26);
                M.R(x);
            }
            com.vk.core.compose.component.cell.content.h1 a = Cell$Middle.d.b.a(str, null, null, 1, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), null, M, 12610560, 70);
            if (str2.length() > 0) {
                M.K(762150869);
                com.vk.core.compose.component.cell.content.h1 b = Cell$Middle.c.b.b(str2, 2, null, null, null, M, 12583344, 120);
                M = M;
                M.j();
                h1Var = b;
            } else {
                M.K(-2142973727);
                M.j();
                h1Var = null;
            }
            Cell$Middle.Size size = Cell$Middle.Size.Medium;
            androidx.compose.runtime.a aVar2 = M;
            com.vk.core.compose.component.cell.content.k0 a2 = Cell$Middle.a.a(a, h1Var, null, null, aVar2, 199680, 20);
            M = aVar2;
            if (z2) {
                M.K(-2142876479);
                int i4 = i3 >> 3;
                int i5 = i4 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1941692219, i5, -1, "com.vk.newsfeed.posting.privacy_picker.presentation.donut_levels.resolveNewLevelCellRight (DonutLevelsFragment.kt:276)");
                }
                int i6 = i4 & 14;
                boolean z3 = ((i6 ^ 6) > 4 && M.l(z)) || (i4 & 6) == 4;
                Object x2 = M.x();
                if (z3 || x2 == c0012a) {
                    x2 = new izs() { // from class: xsna.l0o
                        @Override // xsna.izs
                        public final Object invoke(Object obj) {
                            tgi0 tgi0Var = (tgi0) obj;
                            if (z) {
                                qgi0.r(tgi0Var, "PrivacySettingsForDonutLevelsSelectedLevel");
                            }
                            return s3q0.a;
                        }
                    };
                    M.R(x2);
                }
                com.vk.core.compose.component.cell.content.o a3 = o.e.a.C0736a.a(z, gzsVar, false, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3), M, i6 | 24576 | (i4 & 112), 4);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                oVar2 = a3;
            } else {
                M.K(-2142802358);
                int i7 = (i3 >> 3) & 14;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(2064556458, i7, -1, "com.vk.newsfeed.posting.privacy_picker.presentation.donut_levels.resolveOldLevelCellRight (DonutLevelsFragment.kt:289)");
                }
                if (z) {
                    M.K(1269878492);
                    if (androidx.compose.runtime.b.d()) {
                        i2 = 0;
                        androidx.compose.runtime.b.f(521903826, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CheckCircleOn24> (VkSdkIcons.kt:360)");
                    } else {
                        i2 = 0;
                    }
                    lg90 a4 = pg90.a(R.drawable.vk_icon_check_circle_on_24, i2, M);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, i2, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j = ylu0Var.getIcon().a;
                    float f = 24;
                    long b2 = byc0.b(f, f);
                    Object x3 = M.x();
                    if (x3 == c0012a) {
                        x3 = new pl2(25);
                        M.R(x3);
                    }
                    oVar = com.vk.core.compose.component.cell.content.p.a(a4, j, b2, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x3, 3), M, 1573256, 24);
                    M = M;
                    M.j();
                } else {
                    M.K(1270188492);
                    M.j();
                    oVar = null;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
                oVar2 = oVar;
            }
            wiu0.b(ojc.c(q630Var, false, null, null, gzsVar, 15), false, null, a2, oVar2, null, null, M, 0, 102);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(z, gzsVar, z2, q630Var, i) { // from class: xsna.k0o
                public final /* synthetic */ boolean c;
                public final /* synthetic */ gzs d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ q630 f;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(27649);
                    o0o.a(DonutLevel.this, this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final DonutLevel donutLevel, final List list, final gzs gzsVar, final gzs gzsVar2, final izs izsVar, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(16561890);
        int i2 = i | (M.J(donutLevel) ? 4 : 2) | (M.J(list) ? 32 : 16) | (M.y(gzsVar) ? 256 : 128) | (M.y(gzsVar2) ? 2048 : 1024) | (M.y(izsVar) ? 16384 : 8192);
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(16561890, i2, -1, "com.vk.newsfeed.posting.privacy_picker.presentation.donut_levels.ThemedContent (DonutLevelsFragment.kt:147)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                ComFeatures comFeatures = ComFeatures.COM_NEW_POSTING_PRIVACY_UX;
                comFeatures.getClass();
                x = Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures));
                M.R(x);
            }
            final boolean booleanValue = ((Boolean) x).booleanValue();
            q630 d = txj0.d(q630.a.a, 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            phv0.b(d, kai.c(2041458025, new wzs() { // from class: xsna.m0o
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    int i3;
                    int i4;
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (aVar3.t(intValue & 1, (intValue & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(2041458025, intValue, -1, "com.vk.newsfeed.posting.privacy_picker.presentation.donut_levels.ThemedContent.<anonymous> (DonutLevelsFragment.kt:154)");
                        }
                        String N = d370.N(R.string.back, 0, aVar3);
                        SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.Merge;
                        Object x2 = aVar3.x();
                        a.C0011a.C0012a c0012a = a.C0011a.a;
                        if (x2 == c0012a) {
                            x2 = new pe1(22);
                            aVar3.R(x2);
                        }
                        com.vk.core.compose.component.semantics.a a = com.vk.core.compose.component.semantics.b.a(mode, (izs) x2, 2);
                        gzs gzsVar3 = gzsVar;
                        boolean J = aVar3.J(gzsVar3);
                        Object x3 = aVar3.x();
                        if (J || x3 == c0012a) {
                            x3 = new rrk(2, gzsVar3);
                            aVar3.R(x3);
                        }
                        TopBar$Before.e a2 = e.a.a((gzs) x3, N, null, null, a, aVar3, 196608, 12);
                        if (booleanValue) {
                            i3 = 339663496;
                            i4 = R.string.donut_level_picker_top_bar_title;
                        } else {
                            i3 = 339781296;
                            i4 = R.string.donut_level_picker_title;
                        }
                        muv0.h(TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(zq.a(aVar3, i3, i4, aVar3, 0), null, null, null, null, aVar3, 196608, 30), null, null, null, aVar3, 14), ahn.E(q630.a.a, "PrivacySettingsForDonutLevelsToolbar"), null, null, a2, null, null, null, true, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar3, 100663344, 0, 7916);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M), kai.c(-2009972408, new wzs() { // from class: xsna.n0o
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    int i3;
                    int i4;
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (aVar3.t(intValue & 1, (intValue & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-2009972408, intValue, -1, "com.vk.newsfeed.posting.privacy_picker.presentation.donut_levels.ThemedContent.<anonymous> (DonutLevelsFragment.kt:176)");
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var2 = (ylu0) aVar3.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j = ylu0Var2.getBackground().g;
                        e.a aVar4 = androidx.compose.ui.graphics.e.a;
                        q630.a aVar5 = q630.a.a;
                        q630 m = hr80.m(aVar5, j, aVar4);
                        a.m mVar = androidx.compose.foundation.layout.a.c;
                        dt1.a.getClass();
                        androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar3, 0);
                        int hashCode = Long.hashCode(n34.n(aVar3));
                        sy90 D = aVar3.D();
                        q630 c = qri.c(aVar3, m);
                        cri.h7.getClass();
                        LayoutNode.a aVar6 = cri.a.b;
                        if (aVar3.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar3.H();
                        if (aVar3.L()) {
                            aVar3.I(aVar6);
                        } else {
                            aVar3.f();
                        }
                        k9q0.w(aVar3, a, cri.a.f);
                        k9q0.w(aVar3, D, cri.a.e);
                        k9q0.w(aVar3, Integer.valueOf(hashCode), cri.a.g);
                        k9q0.t(aVar3, cri.a.h);
                        k9q0.w(aVar3, c, cri.a.d);
                        if (booleanValue) {
                            i3 = -2015372215;
                            i4 = R.string.donut_level_picker_next_button;
                        } else {
                            i3 = -2015264459;
                            i4 = R.string.music_picker_ready;
                        }
                        String a2 = zq.a(aVar3, i3, i4, aVar3, 0);
                        ButtonSize buttonSize = ButtonSize.Large;
                        ButtonStyle buttonStyle = ButtonStyle.Primary;
                        ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                        boolean z = donutLevel != null;
                        q630 E = ahn.E(s200.D(txj0.f(aVar5, 1.0f), 12), "PrivacySettingsForDonutLevelsDoneButton");
                        gzs gzsVar3 = gzsVar2;
                        boolean J = aVar3.J(gzsVar3);
                        Object x2 = aVar3.x();
                        if (J || x2 == a.C0011a.a) {
                            x2 = new j0o(0, gzsVar3);
                            aVar3.R(x2);
                        }
                        bhu0.e((gzs) x2, buttonSize, buttonStyle, buttonAppearance, E, null, false, false, null, null, null, a2, null, null, null, null, z, null, null, null, aVar3, 28080, 0, 0, 4059104);
                        aVar3.G();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M), null, null, 0, 0L, ylu0Var.getBackground().g, kai.c(-1007555778, new yzs() { // from class: xsna.h0o
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    float f;
                    androidx.compose.runtime.a aVar3;
                    s890 s890Var = (s890) obj;
                    androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar4.J(s890Var) ? 4 : 2;
                    }
                    if (aVar4.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1007555778, intValue, -1, "com.vk.newsfeed.posting.privacy_picker.presentation.donut_levels.ThemedContent.<anonymous> (DonutLevelsFragment.kt:200)");
                        }
                        q630.a aVar5 = q630.a.a;
                        q630 D = p490.D(s200.C(txj0.d(aVar5, 1.0f), s890Var), p490.x(aVar4), 14);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var2 = (ylu0) aVar4.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        q630 E = ahn.E(hr80.m(D, ylu0Var2.getBackground().g, androidx.compose.ui.graphics.e.a), "PrivacySettingsForDonutLevelsListButton");
                        a.m mVar = androidx.compose.foundation.layout.a.c;
                        dt1.a.getClass();
                        androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar4, 0);
                        int hashCode = Long.hashCode(n34.n(aVar4));
                        sy90 D2 = aVar4.D();
                        q630 c = qri.c(aVar4, E);
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
                        k9q0.w(aVar4, a, cri.a.f);
                        k9q0.w(aVar4, D2, cri.a.e);
                        k9q0.w(aVar4, Integer.valueOf(hashCode), cri.a.g);
                        k9q0.t(aVar4, cri.a.h);
                        k9q0.w(aVar4, c, cri.a.d);
                        boolean z = booleanValue;
                        if (z) {
                            f = 1.0f;
                            aVar3 = aVar4;
                            aVar3.K(1508981198);
                        } else {
                            aVar4.K(1517573127);
                            f = 1.0f;
                            aVar3 = aVar4;
                            com.vk.core.compose.component.group.header.g.b(f.a.a(d370.N(R.string.donut_level_picker_description, 0, aVar4), null, null, null, null, null, null, null, false, aVar4, 805306368, 510), txj0.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 46, 1, txj0.f(aVar5, 1.0f)), b.d.a, null, null, null, true, aVar3, 1573296, 56);
                        }
                        aVar3.j();
                        aVar3.K(-782314574);
                        for (DonutLevel donutLevel2 : list) {
                            boolean f2 = epx.f(donutLevel2, donutLevel);
                            izs izsVar2 = izsVar;
                            boolean J = aVar3.J(izsVar2) | aVar3.J(donutLevel2);
                            Object x2 = aVar3.x();
                            if (J || x2 == a.C0011a.a) {
                                x2 = new pw(8, izsVar2, donutLevel2);
                                aVar3.R(x2);
                            }
                            o0o.a(donutLevel2, f2, (gzs) x2, z, txj0.f(aVar5, f), aVar3, 27648);
                        }
                        if (gp.d(aVar3)) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar4.h();
                    }
                    return s3q0.a;
                }
            }, M), aVar2, 805306806, 248);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(list, gzsVar, gzsVar2, izsVar, i) { // from class: xsna.i0o
                public final /* synthetic */ List c;
                public final /* synthetic */ gzs d;
                public final /* synthetic */ gzs e;
                public final /* synthetic */ izs f;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    o0o.b(DonutLevel.this, this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
