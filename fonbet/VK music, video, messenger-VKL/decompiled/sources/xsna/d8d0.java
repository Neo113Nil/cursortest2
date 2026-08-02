package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.ecomm.design.compose.tile.MarketProductTileConfig;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.r7d0;
import xsna.ty6;
import xsna.wra0;
import xsna.zra0;

/* compiled from: PrimaryBlockGoodsContentImpl.kt */
/* loaded from: classes17.dex */
public final class d8d0 extends b920 {
    public final float c = 150;
    public final float d = 180;
    public final wh50 e;
    public final wh50 f;
    public final wh50 g;

    /* compiled from: PrimaryBlockGoodsContentImpl.kt */
    public static final class a implements izs<MarketProductTileConfig.f, s3q0> {
        public final /* synthetic */ ta10 c;
        public final /* synthetic */ int d;

        public a(ta10 ta10Var, int i) {
            this.c = ta10Var;
            this.d = i;
        }

        @Override // xsna.izs
        public final s3q0 invoke(MarketProductTileConfig.f fVar) {
            String str = fVar.a;
            d8d0.this.w().invoke(new r7d0.e(this.c.a.a, this.d));
            return s3q0.a;
        }
    }

    /* compiled from: PrimaryBlockGoodsContentImpl.kt */
    public static final class b implements izs<MarketProductTileConfig.f, s3q0> {
        public final /* synthetic */ ta10 c;
        public final /* synthetic */ int d;

        public b(ta10 ta10Var, int i) {
            this.c = ta10Var;
            this.d = i;
        }

        @Override // xsna.izs
        public final s3q0 invoke(MarketProductTileConfig.f fVar) {
            String str = fVar.a;
            d8d0.this.w().invoke(new r7d0.d(this.c.a.a, this.d));
            return s3q0.a;
        }
    }

    /* compiled from: PrimaryBlockGoodsContentImpl.kt */
    public static final class c implements izs<MarketProductTileConfig.f, s3q0> {
        public final /* synthetic */ ta10 c;
        public final /* synthetic */ int d;

        public c(ta10 ta10Var, int i) {
            this.c = ta10Var;
            this.d = i;
        }

        @Override // xsna.izs
        public final s3q0 invoke(MarketProductTileConfig.f fVar) {
            String str = fVar.a;
            d8d0.this.w().invoke(new r7d0.c(this.c.a.a, this.d));
            return s3q0.a;
        }
    }

    public d8d0(ra10 ra10Var, izs izsVar, com.vk.core.compose.component.semantics.a aVar) {
        this.e = androidx.compose.runtime.k.b(ra10Var);
        this.f = androidx.compose.runtime.k.b(izsVar);
        this.g = androidx.compose.runtime.k.b(aVar);
    }

    @Override // xsna.i7d0
    public final void a(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1546359850);
        if ((i & 48) == 0) {
            i2 = (M.J(this) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 17) != 16)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1546359850, i2, -1, "com.vk.community.design.compose.primaryblock.PrimaryBlockGoodsContentImpl.Content (PrimaryBlockGoodsContentImpl.kt:59)");
            }
            xvy a2 = zvy.a(0, 3, M);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = bbk0.b(new lo10(a2, 22));
                M.R(x);
            }
            mtk0 mtk0Var = (mtk0) x;
            Boolean bool = (Boolean) mtk0Var.getValue();
            bool.getClass();
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new w7d0(this, mtk0Var, null);
                M.R(x2);
            }
            bap.g(bool, (wzs) x2, M, 0);
            Boolean valueOf = Boolean.valueOf(v().c);
            boolean J = (i3 == 32) | M.J(a2);
            Object x3 = M.x();
            if (J || x3 == c0012a) {
                x3 = new x7d0(this, a2, null);
                M.R(x3);
            }
            bap.g(valueOf, (wzs) x3, M, 0);
            boolean J2 = (i3 == 32) | M.J(a2);
            Object x4 = M.x();
            if (J2 || x4 == c0012a) {
                x4 = new yb1(9, this, a2);
                M.R(x4);
            }
            xtm0.a(null, (wzs) x4, M, 0, 1);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new cq0(this, i);
        }
    }

    public final void q(final qa10 qa10Var, final int i, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        androidx.compose.runtime.a M = aVar.M(-438747097);
        if ((i2 & 6) == 0) {
            i3 = (M.J(qa10Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.o(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-438747097, i3, -1, "com.vk.community.design.compose.primaryblock.PrimaryBlockGoodsContentImpl.AlbumItem (PrimaryBlockGoodsContentImpl.kt:167)");
            }
            o7d0 o7d0Var = qa10Var.a;
            q630 b2 = com.vk.core.compose.component.semantics.b.b(txj0.v(q630.a.a, PsExtractor.AUDIO_STREAM), qa10Var.b);
            boolean z = ((i3 & 14) == 4) | ((i3 & 896) == 256) | ((i3 & 112) == 32);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new gzs() { // from class: xsna.u7d0
                    @Override // xsna.gzs
                    public final Object invoke() {
                        d8d0.this.w().invoke(new r7d0.a(qa10Var.a.a, i));
                        return s3q0.a;
                    }
                };
                M.R(x);
            }
            n7d0.c(o7d0Var, b2, (gzs) x, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.v7d0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i2 | 1);
                    d8d0.this.q(qa10Var, i, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public final void r(ztm0 ztm0Var, int i, xvy xvyVar, q630 q630Var, androidx.compose.runtime.a aVar, int i2) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-591150976);
        int i3 = i2 | (M.J(ztm0Var) ? 4 : 2) | (M.o(i) ? 32 : 16) | (M.J(xvyVar) ? 256 : 128) | 3072 | (M.J(this) ? 16384 : 8192);
        if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-591150976, i3, -1, "com.vk.community.design.compose.primaryblock.PrimaryBlockGoodsContentImpl.ContentItems (PrimaryBlockGoodsContentImpl.kt:113)");
            }
            q630.a aVar2 = q630.a.a;
            if (i > 0) {
                txj0.h(aVar2, ztm0Var.j1(i));
            }
            q630 b2 = com.vk.core.compose.component.semantics.b.b(aVar2, (SemanticsConfiguration) ((zak0) this.g).getValue());
            float f = 10;
            u890 n = s200.n(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
            dt1.a.getClass();
            ty6.b bVar = dt1.a.k;
            boolean z = (57344 & i3) == 16384;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new fv90(this, 13);
                M.R(x);
            }
            z1v0.a(b2, xvyVar, n, null, bVar, null, false, (izs) x, M, ((i3 >> 3) & 112) | 196992, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE);
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
            s.d = new u5u(this, ztm0Var, i, xvyVar, q630Var2, i2);
        }
    }

    public final void s(final ta10 ta10Var, final int i, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        androidx.compose.runtime.a M = aVar.M(-1572197005);
        if ((i2 & 6) == 0) {
            i3 = (M.J(ta10Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.o(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1572197005, i3, -1, "com.vk.community.design.compose.primaryblock.PrimaryBlockGoodsContentImpl.GoodItem (PrimaryBlockGoodsContentImpl.kt:151)");
            }
            MarketProductTileConfig marketProductTileConfig = ta10Var.a;
            q630 b2 = com.vk.core.compose.component.semantics.b.b(q630.a.a, ta10Var.b);
            pco pcoVar = new pco(162);
            int i4 = i3 & 896;
            int i5 = i3 & 14;
            int i6 = i3 & 112;
            boolean z = (i4 == 256) | (i5 == 4) | (i6 == 32);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new a(ta10Var, i);
                M.R(x);
            }
            izs izsVar = (izs) x;
            boolean z2 = (i6 == 32) | (i4 == 256) | (i5 == 4);
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new b(ta10Var, i);
                M.R(x2);
            }
            izs izsVar2 = (izs) x2;
            boolean z3 = (i4 == 256) | (i5 == 4) | (i6 == 32);
            Object x3 = M.x();
            if (z3 || x3 == c0012a) {
                x3 = new c(ta10Var, i);
                M.R(x3);
            }
            com.vk.ecomm.design.compose.tile.a.a(marketProductTileConfig, b2, pcoVar, izsVar, izsVar2, (izs) x3, M, 384, 64);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.t7d0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i2 | 1);
                    d8d0.this.s(ta10Var, i, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public final void t(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(162552310);
        int i2 = i | 6 | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(162552310, i2, -1, "com.vk.community.design.compose.primaryblock.PrimaryBlockGoodsContentImpl.ProductTilePaginationError (PrimaryBlockGoodsContentImpl.kt:187)");
            }
            float f = kqu0.r;
            float f2 = kqu0.s;
            q630.a aVar3 = q630.a.a;
            q630 G = s200.G(aVar3, f2, f, f2, f2);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.f, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, G);
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
            k9q0.w(M, c2, cri.a.d);
            q630 h = txj0.h(txj0.v(aVar3, this.c), this.d);
            vl20 a2 = zra0.a.a(null, null, d370.N(R.string.community_profile_priority_block_goods_pagination_error_title, 0, M), null, M, 196608, 27);
            String N = d370.N(R.string.community_profile_priority_block_goods_pagination_error_retry_button, 0, M);
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
                x = new b290(this, 10);
                M.R(x);
            }
            aVar2 = M;
            ldv0.d(h, null, a2, wra0.b.a(wra0.a.C3954a.a(N, (gzs) x, buttonSize, buttonStyle, buttonAppearance, false, j1, new l5g(j), null, null, null, null, false, false, null, null, aVar2, 2125184, 12582912, 130848), null, null, aVar2, 14), null, null, false, aVar2, 1572864, 50);
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
            s.d = new h08(this, q630Var2, i, 7);
        }
    }

    public final void u(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(874931929);
        int i2 = i | 6 | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(874931929, i2, -1, "com.vk.community.design.compose.primaryblock.PrimaryBlockGoodsContentImpl.ProductTileSkeleton (PrimaryBlockGoodsContentImpl.kt:178)");
            }
            jai c2 = kai.c(-1294603106, new ze4(this, 4), M);
            q630.a aVar2 = q630.a.a;
            ckv0.a(aVar2, null, c2, M, 390, 2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = aVar2;
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new e3(this, q630Var, i, 11);
        }
    }

    public final ra10 v() {
        return (ra10) ((zak0) this.e).getValue();
    }

    public final izs<r7d0, s3q0> w() {
        return (izs) ((zak0) this.f).getValue();
    }
}
