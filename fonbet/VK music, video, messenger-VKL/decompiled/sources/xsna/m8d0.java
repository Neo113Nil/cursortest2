package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.defaults.CounterAppearance;
import com.vk.core.compose.component.defaults.CounterMode;
import com.vk.core.compose.component.defaults.CounterSize;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.j7d0;
import xsna.q630;

/* compiled from: PrimaryBlockGoodsHeaderRightActionsImpl.kt */
/* loaded from: classes17.dex */
public final class m8d0 extends j7d0.c.b {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;
    public final wh50 f;
    public final wh50 g;
    public final wh50 h;
    public final wh50 i;
    public final wh50 j;

    public m8d0(Integer num, boolean z, boolean z2, j7d0.c.b.a aVar, String str, izs izsVar, com.vk.core.compose.component.semantics.a aVar2, com.vk.core.compose.component.semantics.a aVar3, com.vk.core.compose.component.semantics.a aVar4, com.vk.core.compose.component.semantics.a aVar5) {
        this.a = androidx.compose.runtime.k.b(num);
        this.b = androidx.compose.runtime.k.b(Boolean.valueOf(z));
        this.c = androidx.compose.runtime.k.b(Boolean.valueOf(z2));
        this.d = androidx.compose.runtime.k.b(aVar);
        this.e = androidx.compose.runtime.k.b(str);
        this.f = androidx.compose.runtime.k.b(izsVar);
        this.g = androidx.compose.runtime.k.b(aVar2);
        this.h = androidx.compose.runtime.k.b(aVar3);
        this.i = androidx.compose.runtime.k.b(aVar4);
        this.j = androidx.compose.runtime.k.b(aVar5);
    }

    public static final void d(wh50<Boolean> wh50Var, boolean z) {
        wh50Var.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.j7d0
    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        a.C0011a.C0012a c0012a;
        boolean z;
        androidx.compose.runtime.a M = aVar.M(122969896);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(122969896, i2, -1, "com.vk.community.design.compose.primaryblock.PrimaryBlockGoodsHeaderRightActionsImpl.Content (PrimaryBlockGoodsHeaderRightActionsImpl.kt:88)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (x == c0012a2) {
                x = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(q630Var, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, m);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            int i3 = i2 & 112;
            int i4 = 6 | i3;
            e(i4, M);
            b(i4, M);
            if (((j7d0.c.b.a) ((zak0) this.d).getValue()) != null) {
                c0012a = c0012a2;
                z = true;
            } else {
                c0012a = c0012a2;
                z = false;
            }
            jai c2 = kai.c(1880011884, new m020(1, this, wh50Var), M);
            tpg0 tpg0Var = tpg0.a;
            a.C0011a.C0012a c0012a3 = c0012a;
            mm2.e(tpg0Var, z, null, null, null, null, c2, M, 1572870, 30);
            mm2.e(tpg0Var, ((Boolean) ((zak0) this.c).getValue()).booleanValue(), null, null, null, null, kai.c(1517305109, new lo1(this, 2), M), M, 1572870, 30);
            M.G();
            ty6 ty6Var = dt1.a.d;
            q630 E = ahn.E(q630.a.a, "priority_block_header_action_menu");
            boolean booleanValue = ((Boolean) wh50Var.getValue()).booleanValue();
            long floatToRawIntBits = (Float.floatToRawIntBits(0) << 32) | (Float.floatToRawIntBits(36) & 4294967295L);
            gxb0 gxb0Var = new gxb0(false, false, 22);
            Object x2 = M.x();
            if (x2 == c0012a3) {
                x2 = new uc10(1, wh50Var);
                M.R(x2);
            }
            gzs gzsVar = (gzs) x2;
            boolean z2 = i3 == 32;
            Object x3 = M.x();
            if (z2 || x3 == c0012a3) {
                x3 = new ri0(24, this, wh50Var);
                M.R(x3);
            }
            aou0.g(booleanValue, gzsVar, E, ty6Var, floatToRawIntBits, gxb0Var, null, (izs) x3, M, 224688, PsExtractor.AUDIO_STREAM);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new aak(this, q630Var, i, 3);
        }
    }

    public final void b(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(651334062);
        int i3 = i & 6;
        tpg0 tpg0Var = tpg0.a;
        if (i3 == 0) {
            i2 = (M.J(tpg0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(651334062, i2, -1, "com.vk.community.design.compose.primaryblock.PrimaryBlockGoodsHeaderRightActionsImpl.AddItemBtn (PrimaryBlockGoodsHeaderRightActionsImpl.kt:175)");
            }
            mm2.e(tpg0Var, ((Boolean) ((zak0) this.b).getValue()).booleanValue(), null, null, null, null, kai.c(75486678, new vvq(this, 3), M), M, (i2 & 14) | 1572864, 30);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new x07(this, i, 1);
        }
    }

    public final void c(q630 q630Var, final int i, final gzs gzsVar, final SemanticsConfiguration semanticsConfiguration, androidx.compose.runtime.a aVar, final int i2) {
        final q630 q630Var2;
        androidx.compose.runtime.f s;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar;
        androidx.compose.runtime.a M = aVar.M(-1817160165);
        int i3 = i2 | 6 | (M.o(i) ? 32 : 16) | (M.y(gzsVar) ? 256 : 128) | (M.J(semanticsConfiguration) ? 2048 : 1024);
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1817160165, i3, -1, "com.vk.community.design.compose.primaryblock.PrimaryBlockGoodsHeaderRightActionsImpl.CartButton (PrimaryBlockGoodsHeaderRightActionsImpl.kt:263)");
            }
            q630.a aVar2 = q630.a.a;
            if (i == 0) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                s = M.s();
                if (s != null) {
                    wzsVar = new qqd(this, aVar2, i, gzsVar, semanticsConfiguration, i2);
                    s.d = wzsVar;
                }
                return;
            }
            String O = d370.O(R.string.community_priority_block_header_market_goods_cart_items_accessibility, new Object[]{Integer.valueOf(i)}, M);
            SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.ClearAndSet;
            boolean J = ((i3 & 7168) == 2048) | M.J(O);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (J || x == c0012a) {
                x = new a5(19, semanticsConfiguration, O);
                M.R(x);
            }
            q630 b = com.vk.core.compose.component.semantics.b.b(aVar2, com.vk.core.compose.component.semantics.b.a(mode, (izs) x, 2));
            ButtonStyle buttonStyle = ButtonStyle.Secondary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Neutral;
            ButtonSize buttonSize = ButtonSize.Small;
            uog0 b2 = vog0.b(48);
            u890 m = s200.m(8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            boolean z = (i3 & 896) == 256;
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new rsa0(1, gzsVar);
                M.R(x2);
            }
            bhu0.c((gzs) x2, buttonSize, buttonStyle, buttonAppearance, b, b2, m, false, null, null, null, false, kai.c(-1052049674, new yzs() { // from class: xsna.h8d0
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if (aVar3.t(intValue & 1, (intValue & 17) != 16)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1052049674, intValue, -1, "com.vk.community.design.compose.primaryblock.PrimaryBlockGoodsHeaderRightActionsImpl.CartButton.<anonymous> (PrimaryBlockGoodsHeaderRightActionsImpl.kt:282)");
                        }
                        q630.a aVar4 = q630.a.a;
                        q630 q = txj0.q(aVar4, 16);
                        qzu0.a.getClass();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(601770628, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-ShoppingCartOutline16> (VkIcons.kt:9822)");
                        }
                        lg90 a = pg90.a(R.drawable.vk_icon_shopping_cart_outline_16, 0, aVar3);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar3.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        pzu0.b(a, null, q, ylu0Var.getIcon().f, aVar3, 440, 0);
                        f9t.e(txj0.v(aVar4, 6), aVar3, 6);
                        nou0.a(i, CounterSize.Small, CounterAppearance.Design.AccentRed, null, CounterMode.Primary, false, aVar3, 25008, 40);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 1576368, 384, 3968);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        s = M.s();
        if (s != null) {
            wzsVar = new wzs(q630Var2, i, gzsVar, semanticsConfiguration, i2) { // from class: xsna.i8d0
                public final /* synthetic */ q630 c;
                public final /* synthetic */ int d;
                public final /* synthetic */ gzs e;
                public final /* synthetic */ SemanticsConfiguration f;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    m8d0.this.c(this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
            s.d = wzsVar;
        }
    }

    public final void e(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1135872031);
        int i3 = i & 6;
        tpg0 tpg0Var = tpg0.a;
        if (i3 == 0) {
            i2 = (M.J(tpg0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1135872031, i2, -1, "com.vk.community.design.compose.primaryblock.PrimaryBlockGoodsHeaderRightActionsImpl.ItemsInCartBtn (PrimaryBlockGoodsHeaderRightActionsImpl.kt:188)");
            }
            mm2.e(tpg0Var, ((Integer) ((zak0) this.a).getValue()) != null, null, null, null, null, kai.c(1129510983, new ini(this, 3), M), M, (i2 & 14) | 1572864, 30);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new b9q(this, i, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(final lg90 lg90Var, q630 q630Var, q630 q630Var2, final gzs gzsVar, final SemanticsConfiguration semanticsConfiguration, androidx.compose.runtime.a aVar, final int i, final int i2) {
        q630 q630Var3;
        int i3;
        q630 q630Var4;
        int i4;
        int i5;
        androidx.compose.runtime.a aVar2;
        final q630 q630Var5;
        final q630 q630Var6;
        androidx.compose.runtime.f s;
        gzs gzsVar2;
        androidx.compose.runtime.a M = aVar.M(238517241);
        int i6 = i | (M.y(lg90Var) ? 4 : 2);
        int i7 = i2 & 2;
        if (i7 != 0) {
            i6 |= 48;
        } else if ((i & 48) == 0) {
            q630Var3 = q630Var;
            i6 |= M.J(q630Var3) ? 32 : 16;
            i3 = i2 & 4;
            if (i3 == 0) {
                i4 = i6 | 384;
                q630Var4 = q630Var2;
            } else {
                q630Var4 = q630Var2;
                i4 = i6 | (M.J(q630Var4) ? 256 : 128);
            }
            i5 = i4 | 3072 | (!M.y(gzsVar) ? 16384 : 8192) | (!M.J(semanticsConfiguration) ? 131072 : 65536);
            if (M.t(i5 & 1, (74899 & i5) == 74898)) {
                aVar2 = M;
                aVar2.h();
                q630Var5 = q630Var3;
                q630Var6 = q630Var4;
            } else {
                q630.a aVar3 = q630.a.a;
                if (i7 != 0) {
                    q630Var3 = aVar3;
                }
                q630 q630Var7 = i3 != 0 ? aVar3 : q630Var4;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(238517241, i5, -1, "com.vk.community.design.compose.primaryblock.PrimaryBlockGoodsHeaderRightActionsImpl.RightActionButton (PrimaryBlockGoodsHeaderRightActionsImpl.kt:306)");
                }
                q630 q = txj0.q(q630Var3, 36);
                dt1.a.getClass();
                cp10 d = ja8.d(dt1.a.g, false);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, q);
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
                k9q0.w(M, d, cri.a.f);
                k9q0.w(M, D, cri.a.e);
                k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                k9q0.t(M, cri.a.h);
                k9q0.w(M, c, cri.a.d);
                if (gzsVar == null) {
                    M.K(-1996280703);
                    Object x = M.x();
                    if (x == a.C0011a.a) {
                        x = new xu0(28);
                        M.R(x);
                    }
                    M.j();
                    gzsVar2 = (gzs) x;
                } else {
                    M.K(766887562);
                    M.j();
                    gzsVar2 = gzsVar;
                }
                q630 b = com.vk.core.compose.component.semantics.b.b(q630Var7, semanticsConfiguration);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2 = M;
                nzu0.c(gzsVar2, lg90Var, null, b, Float.NaN, ylu0Var.getIcon().f, false, null, gzsVar != null, null, null, aVar2, ((i5 << 3) & 112) | 25024, 1728);
                aVar2.G();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630 q630Var8 = q630Var3;
                q630Var6 = q630Var7;
                q630Var5 = q630Var8;
            }
            s = aVar2.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.g8d0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        m8d0.this.f(lg90Var, q630Var5, q630Var6, gzsVar, semanticsConfiguration, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        q630Var3 = q630Var;
        i3 = i2 & 4;
        if (i3 == 0) {
        }
        i5 = i4 | 3072 | (!M.y(gzsVar) ? 16384 : 8192) | (!M.J(semanticsConfiguration) ? 131072 : 65536);
        if (M.t(i5 & 1, (74899 & i5) == 74898)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }

    public final izs<s7d0, s3q0> g() {
        return (izs) ((zak0) this.f).getValue();
    }
}
