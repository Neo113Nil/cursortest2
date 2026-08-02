package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.ecomm.design.compose.tile.MarketProductTileConfig;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cri;
import xsna.dt1;
import xsna.efu;
import xsna.q630;
import xsna.wra0;
import xsna.zra0;

/* compiled from: PrimaryBlockServicesListContentImpl.kt */
/* loaded from: classes17.dex */
public final class w8d0 extends be {
    public final float b = 150;
    public final float c = 168;
    public final wh50 d;
    public final wh50 e;
    public final wh50 f;
    public final wh50 g;
    public final wh50 h;
    public final wh50 i;

    public w8d0(sa10 sa10Var, wzs wzsVar, wzs wzsVar2, gzs gzsVar, gzs gzsVar2, com.vk.core.compose.component.semantics.a aVar) {
        this.d = androidx.compose.runtime.k.b(sa10Var);
        this.e = androidx.compose.runtime.k.b(wzsVar);
        this.f = androidx.compose.runtime.k.b(wzsVar2);
        this.g = androidx.compose.runtime.k.b(gzsVar);
        this.h = androidx.compose.runtime.k.b(gzsVar2);
        this.i = androidx.compose.runtime.k.b(aVar);
    }

    @Override // xsna.i7d0
    public final void a(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-140064522);
        int i3 = i & 6;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 = (M.J(aVar2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-140064522, i2, -1, "com.vk.community.design.compose.primaryblock.PrimaryBlockServicesListContentImpl.Content (PrimaryBlockServicesListContentImpl.kt:75)");
            }
            boolean z = e0().b;
            int i4 = i2 & 112;
            boolean z2 = i4 == 32;
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (z2 || x == obj) {
                x = new z4d0(this, 1);
                M.R(x);
            }
            gzs gzsVar = (gzs) x;
            dsy a = gsy.a(0, 3, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-636614176, 3072, -1, "com.vk.core.compose.utils.paging.rememberPaginatableLazyGridState (PaginatableLazyGridState.kt:17)");
            }
            Boolean valueOf = Boolean.valueOf(z);
            boolean J = M.J(a) | M.l(z) | M.J(gzsVar);
            Object x2 = M.x();
            if (J || x2 == obj) {
                Object ed90Var = new ed90(a, 1, z, gzsVar, null);
                M.R(ed90Var);
                x2 = ed90Var;
            }
            bap.g(valueOf, (wzs) x2, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            Boolean valueOf2 = Boolean.valueOf(e0().c);
            boolean J2 = (i4 == 32) | M.J(a);
            Object x3 = M.x();
            if (J2 || x3 == obj) {
                x3 = new v8d0(this, a, null);
                M.R(x3);
            }
            bap.g(valueOf2, (wzs) x3, M, 0);
            q630 b = com.vk.core.compose.component.semantics.b.b(txj0.h(aVar2, 174), (SemanticsConfiguration) ((zak0) this.i).getValue());
            efu.b bVar = new efu.b(3);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            a.j g = androidx.compose.foundation.layout.a.g(kqu0.b);
            boolean z3 = i4 == 32;
            Object x4 = M.x();
            if (z3 || x4 == obj) {
                x4 = new fuc0(this, 3);
                M.R(x4);
            }
            uqy.a(bVar, b, a, null, g, null, null, false, null, (izs) x4, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new j95(this, i);
        }
    }

    public final void a0(final MarketProductTileConfig marketProductTileConfig, final q630 q630Var, final int i, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        int i4;
        int i5;
        com.vk.core.compose.component.cell.content.h1 h1Var;
        com.vk.core.compose.component.cell.content.h1 h1Var2;
        int i6;
        a.C0011a.C0012a c0012a;
        androidx.compose.runtime.a M = aVar.M(-1116489999);
        if ((i2 & 6) == 0) {
            i3 = (M.J(marketProductTileConfig) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.o(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= M.J(this) ? 2048 : 1024;
        }
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1116489999, i3, -1, "com.vk.community.design.compose.primaryblock.PrimaryBlockServicesListContentImpl.ListServiceItem (PrimaryBlockServicesListContentImpl.kt:129)");
            }
            String str = marketProductTileConfig.j;
            com.vk.core.compose.component.cell.content.y0 y0Var = null;
            if (str == null) {
                M.K(-1126570279);
                M.j();
                i5 = -1;
                i4 = 0;
                h1Var = null;
            } else {
                M.K(-1126570278);
                i4 = 0;
                i5 = -1;
                com.vk.core.compose.component.cell.content.h1 a = Cell$Middle.d.b.a(str, null, null, 1, null, null, M, 12610560, 102);
                M = M;
                M.j();
                h1Var = a;
            }
            MarketProductTileConfig.e eVar = marketProductTileConfig.i;
            String str2 = eVar != null ? eVar.a : null;
            if (str2 == null) {
                M.K(-1126310747);
                M.j();
                h1Var2 = null;
            } else {
                M.K(-1126310746);
                com.vk.core.compose.component.cell.content.h1 b = Cell$Middle.c.b.b(str2, 0, null, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                M.j();
                h1Var2 = b;
            }
            androidx.compose.runtime.a aVar2 = M;
            com.vk.core.compose.component.cell.content.k0 a2 = Cell$Middle.a.a(h1Var, h1Var2, null, null, aVar2, 196608, 28);
            androidx.compose.runtime.a aVar3 = aVar2;
            MarketProductTileConfig.b bVar = marketProductTileConfig.p;
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (bVar == null) {
                aVar3.K(-1126188080);
                aVar3.j();
                c0012a = c0012a2;
                i6 = 2048;
            } else {
                aVar3.K(-1126188079);
                ButtonStyle buttonStyle = ButtonStyle.Secondary;
                ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                ButtonSize buttonSize = ButtonSize.Small;
                qzu0.a.getClass();
                lg90 L0 = qzu0.L0(aVar3);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, i4, i5, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) aVar3.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j = ylu0Var.getIcon().b;
                SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.ClearAndSet;
                boolean J = aVar3.J(bVar);
                Object x = aVar3.x();
                if (J || x == c0012a2) {
                    x = new aj50(bVar, 12);
                    aVar3.R(x);
                }
                com.vk.core.compose.component.semantics.a a3 = com.vk.core.compose.component.semantics.b.a(mode, (izs) x, 2);
                l5g l5gVar = new l5g(j);
                boolean z = ((i3 & 14) == 4) | ((i3 & 7168) == 2048) | ((i3 & 896) == 256);
                Object x2 = aVar3.x();
                if (z || x2 == c0012a2) {
                    x2 = new gzs() { // from class: xsna.r8d0
                        @Override // xsna.gzs
                        public final Object invoke() {
                            wzs wzsVar = (wzs) ((zak0) w8d0.this.f).getValue();
                            if (wzsVar != null) {
                                wzsVar.invoke(new MarketProductTileConfig.f(marketProductTileConfig.a), Integer.valueOf(i));
                            }
                            return s3q0.a;
                        }
                    };
                    aVar3.R(x2);
                }
                i6 = 2048;
                c0012a = c0012a2;
                com.vk.core.compose.component.cell.content.v a4 = com.vk.core.compose.component.cell.content.k.a(buttonStyle, buttonAppearance, buttonSize, null, L0, l5gVar, null, false, null, a3, (gzs) x2, aVar3, 33206, 1572864, 16328);
                aVar3 = aVar3;
                y0Var = o.c.a(a4, null, null, null, null, aVar3, 62);
                aVar3.j();
            }
            com.vk.core.compose.component.cell.content.y0 y0Var2 = y0Var;
            boolean z2 = ((i3 & 14) == 4) | ((i3 & 7168) == i6) | ((i3 & 896) == 256);
            Object x3 = aVar3.x();
            if (z2 || x3 == c0012a) {
                x3 = new gzs() { // from class: xsna.s8d0
                    @Override // xsna.gzs
                    public final Object invoke() {
                        wzs wzsVar = (wzs) ((zak0) w8d0.this.e).getValue();
                        if (wzsVar != null) {
                            wzsVar.invoke(new MarketProductTileConfig.f(marketProductTileConfig.a), Integer.valueOf(i));
                        }
                        return s3q0.a;
                    }
                };
                aVar3.R(x3);
            }
            androidx.compose.runtime.a aVar4 = aVar3;
            wiu0.b(q630Var, false, null, a2, y0Var2, (gzs) x3, null, aVar4, (i3 >> 3) & 14, 70);
            M = aVar4;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.t8d0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    w8d0.this.a0(marketProductTileConfig, q630Var, i, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public final void b0(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(566720962);
        int i2 = i | 6 | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(566720962, i2, -1, "com.vk.community.design.compose.primaryblock.PrimaryBlockServicesListContentImpl.ProductTilePaginationError (PrimaryBlockServicesListContentImpl.kt:214)");
            }
            float f = kqu0.r;
            float f2 = kqu0.s;
            q630.a aVar3 = q630.a.a;
            q630 G = s200.G(aVar3, f2, f, f2, f2);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.f, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, G);
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
            q630 h = txj0.h(txj0.v(aVar3, this.b), this.c);
            vl20 a = zra0.a.a(null, null, d370.N(R.string.community_profile_priority_block_services_pagination_error_title, 0, M), null, M, 196608, 27);
            String N = d370.N(R.string.community_profile_priority_block_services_pagination_error_retry_button, 0, M);
            qzu0.a.getClass();
            lg90 j1 = qzu0.j1(M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getIcon().b;
            ButtonSize buttonSize = ButtonSize.Small;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            ButtonStyle buttonStyle = ButtonStyle.Link;
            boolean z = (i2 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new n7w(this, 25);
                M.R(x);
            }
            aVar2 = M;
            ldv0.d(h, null, a, wra0.b.a(wra0.a.C3954a.a(N, (gzs) x, buttonSize, buttonStyle, buttonAppearance, false, j1, new l5g(j), null, null, null, null, false, false, null, null, aVar2, 2125184, 12582912, 130848), null, null, aVar2, 14), null, null, false, aVar2, 1572864, 50);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new d6(this, q630Var2, i, 8);
        }
    }

    public final void c0(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(1840452388);
        int i2 = i & 1;
        if (M.t(i2, i2 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1840452388, i, -1, "com.vk.community.design.compose.primaryblock.PrimaryBlockServicesListContentImpl.ShimmerItem (PrimaryBlockServicesListContentImpl.kt:173)");
            }
            ckv0.a(null, null, sji.a, M, 384, 3);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new qq3(this, i, 2);
        }
    }

    public final void d0(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(871578630);
        int i2 = i | 6 | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(871578630, i2, -1, "com.vk.community.design.compose.primaryblock.PrimaryBlockServicesListContentImpl.Skeleton (PrimaryBlockServicesListContentImpl.kt:164)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar2 = q630.a.a;
            q630 c = qri.c(M, aVar2);
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
            int i3 = (i2 >> 3) & 14;
            c0(i3, M);
            c0(i3, M);
            c0(i3, M);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = aVar2;
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new pzj(this, q630Var, i, 6);
        }
    }

    public final sa10 e0() {
        return (sa10) ((zak0) this.d).getValue();
    }
}
