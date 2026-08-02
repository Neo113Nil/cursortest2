package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.defaults.SeparatorAppearance;
import com.vk.core.compose.component.defaults.SeparatorDpi;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.cri;
import xsna.dt1;
import xsna.pg00;
import xsna.phw;
import xsna.q630;
import xsna.zg00;

/* compiled from: ManageCommunitiesNotificationsView.kt */
/* loaded from: classes5.dex */
public final class kh00 extends i6v0<lh00, qg00> {

    /* compiled from: ManageCommunitiesNotificationsView.kt */
    public static final class a implements znj {
        public final /* synthetic */ izs<qg00, s3q0> b;
        public final /* synthetic */ pg00.b c;
        public final /* synthetic */ wh50<Boolean> d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(izs<? super qg00, s3q0> izsVar, pg00.b bVar, wh50<Boolean> wh50Var) {
            this.b = izsVar;
            this.c = bVar;
            this.d = wh50Var;
        }

        @Override // xsna.znj
        public final void g(znj znjVar, androidx.compose.runtime.a aVar, int i) {
            znj znjVar2;
            androidx.compose.runtime.a M = aVar.M(-1833842888);
            int i2 = (M.J(znjVar) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
            if (M.t(i2 & 1, (i2 & 19) != 18)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1833842888, i2, -1, "com.vk.settings.impl.presentation.base.mvi.communities.ManageCommunitiesNotificationsView.CommunityItem.<anonymous>.<anonymous>.<anonymous>.<no name provided>.Content (ManageCommunitiesNotificationsView.kt:245)");
                }
                izs<qg00, s3q0> izsVar = this.b;
                boolean J = M.J(izsVar);
                pg00.b bVar = this.c;
                boolean J2 = J | M.J(bVar);
                Object x = M.x();
                if (J2 || x == a.C0011a.a) {
                    x = new d5f(izsVar, bVar, this.d, 4);
                    M.R(x);
                }
                znjVar2 = znjVar;
                aou0.d(znjVar2, (gzs) x, null, null, false, null, nzo.d(3072, 6, M, d370.N(R.string.manage_communities_edit, 0, M), false), null, M, i2 & 14, 94);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                znjVar2 = znjVar;
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new zd0(this, znjVar2, i, 3);
            }
        }
    }

    /* compiled from: ManageCommunitiesNotificationsView.kt */
    public static final class b implements znj {
        public final /* synthetic */ izs<qg00, s3q0> b;
        public final /* synthetic */ pg00.b c;
        public final /* synthetic */ wh50<Boolean> d;

        /* JADX WARN: Multi-variable type inference failed */
        public b(izs<? super qg00, s3q0> izsVar, pg00.b bVar, wh50<Boolean> wh50Var) {
            this.b = izsVar;
            this.c = bVar;
            this.d = wh50Var;
        }

        @Override // xsna.znj
        public final void g(znj znjVar, androidx.compose.runtime.a aVar, int i) {
            znj znjVar2;
            androidx.compose.runtime.a M = aVar.M(740326767);
            int i2 = (M.J(znjVar) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
            if (M.t(i2 & 1, (i2 & 19) != 18)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(740326767, i2, -1, "com.vk.settings.impl.presentation.base.mvi.communities.ManageCommunitiesNotificationsView.CommunityItem.<anonymous>.<anonymous>.<anonymous>.<no name provided>.Content (ManageCommunitiesNotificationsView.kt:256)");
                }
                izs<qg00, s3q0> izsVar = this.b;
                boolean J = M.J(izsVar);
                pg00.b bVar = this.c;
                boolean J2 = J | M.J(bVar);
                Object x = M.x();
                if (J2 || x == a.C0011a.a) {
                    x = new j49(izsVar, bVar, this.d, 3);
                    M.R(x);
                }
                znjVar2 = znjVar;
                aou0.d(znjVar2, (gzs) x, null, null, false, null, nzo.d(3072, 6, M, d370.N(R.string.manage_communities_switch_off, 0, M), false), null, M, i2 & 14, 94);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                znjVar2 = znjVar;
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new q85(this, znjVar2, i, 5);
            }
        }
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        m((lh00) ao50Var, izsVar, aVar, 512);
    }

    public final void h(final int i, androidx.compose.runtime.a aVar, final List list, final izs izsVar, q630 q630Var) {
        final q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-476170174);
        int i2 = i | (M.J(list) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | 384 | (M.y(this) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-476170174, i2, -1, "com.vk.settings.impl.presentation.base.mvi.communities.ManageCommunitiesNotificationsView.CommunitiesList (ManageCommunitiesNotificationsView.kt:153)");
            }
            xvy a2 = zvy.a(0, 3, M);
            q630.a aVar2 = q630.a.a;
            q630 d = txj0.d(aVar2, 1.0f);
            u890 n = s200.n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 76, 5);
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32) | ((i2 & 7168) == 2048 || M.y(this));
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new zo8(list, izsVar, this, 4);
                M.R(x);
            }
            lqy.a(d, a2, n, null, null, null, false, null, (izs) x, M, 384, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
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
            s.d = new wzs(list, izsVar, q630Var2, i) { // from class: xsna.gh00
                public final /* synthetic */ List c;
                public final /* synthetic */ izs d;
                public final /* synthetic */ q630 e;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(4097);
                    kh00.this.h(I, (androidx.compose.runtime.a) obj, this.c, this.d, this.e);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(pg00.b bVar, izs<? super qg00, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1854188375);
        int i2 = i | (M.J(bVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1854188375, i2, -1, "com.vk.settings.impl.presentation.base.mvi.communities.ManageCommunitiesNotificationsView.CommunityItem (ManageCommunitiesNotificationsView.kt:200)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = androidx.compose.runtime.i.a(0);
                M.R(x2);
            }
            rg50 rg50Var = (rg50) x2;
            float j1 = ((azl) M.r(uvi.h)).j1(rg50Var.getIntValue());
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new v8u(1, rg50Var);
                M.R(x3);
            }
            q630 o = egi.o(aVar2, (izs) x3);
            com.vk.core.compose.component.cell.content.t a2 = com.vk.core.compose.component.cell.content.e.a(phw.a.a(fwu0.l(bVar.b, null, null, null, M, 0, 62), null, null, null, null, M, 196616, 30), Cell$Left.Main.Size.Medium, null, null, null, null, null, M, 100663344, 252);
            com.vk.core.compose.component.cell.content.k0 a3 = Cell$Middle.a.a(Cell$Middle.d.b.a(bVar.d, null, null, 0, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), Cell$Middle.c.b.b(bVar.e, 0, null, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, M, 196608, 28);
            String N = d370.N(R.string.manage_communities_more_description, 0, M);
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = new nwk(wh50Var, 15);
                M.R(x4);
            }
            com.vk.core.compose.component.cell.content.w0 a4 = com.vk.core.compose.component.cell.content.r.a(N, (gzs) x4, 0L, null, M, 24624, 12);
            int i3 = i2 & 112;
            int i4 = i2 & 14;
            boolean z = (i4 == 4) | (i3 == 32);
            Object x5 = M.x();
            if (z || x5 == c0012a) {
                x5 = new km1(12, izsVar, bVar);
                M.R(x5);
            }
            wiu0.b(o, false, a2, a3, a4, (gzs) x5, null, M, 6, 66);
            boolean booleanValue = ((Boolean) wh50Var.getValue()).booleanValue();
            ty6 ty6Var = dt1.a.d;
            long floatToRawIntBits = (Float.floatToRawIntBits(-16) << 32) | (Float.floatToRawIntBits((j1 / 2) + 16) & 4294967295L);
            gxb0 gxb0Var = new gxb0(false, false, 22);
            Object x6 = M.x();
            if (x6 == c0012a) {
                x6 = new jni(2, wh50Var);
                M.R(x6);
            }
            gzs gzsVar = (gzs) x6;
            boolean z2 = (i3 == 32) | (i4 == 4);
            Object x7 = M.x();
            if (z2 || x7 == c0012a) {
                x7 = new o83(izsVar, bVar, wh50Var, 4);
                M.R(x7);
            }
            aou0.g(booleanValue, gzsVar, aVar2, ty6Var, floatToRawIntBits, gxb0Var, null, (izs) x7, M, 200112, PsExtractor.AUDIO_STREAM);
            M = M;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ar0(i, 4, this, bVar, izsVar);
        }
    }

    public final void j(zg00.b bVar, zg00.d dVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-337266592);
        if ((i & 6) == 0) {
            i2 = (M.J(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(dVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 |= (32768 & i) == 0 ? M.J(this) : M.y(this) ? 16384 : 8192;
        }
        if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-337266592, i3, -1, "com.vk.settings.impl.presentation.base.mvi.communities.ManageCommunitiesNotificationsView.ContentSurface (ManageCommunitiesNotificationsView.kt:89)");
            }
            q630.a aVar3 = q630.a.a;
            aVar2 = M;
            phv0.b(txj0.d(aVar3, 1.0f), kai.c(298980217, new fdc(4, this, izsVar), M), null, null, null, 0, 0L, 0L, kai.c(-735190396, new eh00(izsVar, bVar, dVar, this), M), aVar2, 805306416, IronSourceError.ERROR_CODE_INIT_FAILED);
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
            s.d = new kd00(this, bVar, dVar, izsVar, q630Var2, i);
        }
    }

    public final void k(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(822929448);
        int i2 = i & 1;
        if (M.t(i2, i2 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(822929448, i, -1, "com.vk.settings.impl.presentation.base.mvi.communities.ManageCommunitiesNotificationsView.EmptyCommunitiesItem (ManageCommunitiesNotificationsView.kt:182)");
            }
            q630 E = s200.E(q630.a.a, 16, 8);
            String N = d370.N(R.string.manage_communities_empty_stub, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.d0;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            yqv0.c(N, E, ylu0Var.getText().p, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, aVar2, 48, 0, 8184);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new com.vk.movika.tools.controls.seekbar.w(this, i, 10);
        }
    }

    public final void l(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1216709675);
        int i2 = i & 1;
        if (M.t(i2, i2 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1216709675, i, -1, "com.vk.settings.impl.presentation.base.mvi.communities.ManageCommunitiesNotificationsView.Loading (ManageCommunitiesNotificationsView.kt:192)");
            }
            mku0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 30, 0L, M, q630.a.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new m2h(this, i, 5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m(lh00 lh00Var, izs<? super qg00, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-657953930);
        int i2 = (M.J(lh00Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-657953930, i2, -1, "com.vk.settings.impl.presentation.base.mvi.communities.ManageCommunitiesNotificationsView.ThemedContent (ManageCommunitiesNotificationsView.kt:65)");
            }
            zg00 zg00Var = (zg00) d(zg00.c.a, new n0u0[]{lh00Var.a}, M, (i2 & 896) | 518).getValue();
            if (zg00Var instanceof zg00.a) {
                M.K(1125670759);
                zg00.a aVar2 = (zg00.a) zg00Var;
                j((zg00.b) jk50.c(aVar2.b, M).getValue(), (zg00.d) jk50.c(aVar2.a, M).getValue(), izsVar, null, M, ((i2 << 3) & 896) | 32768 | ((i2 << 6) & 57344));
                M.j();
            } else {
                M.K(-933511558);
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
            s.d = new xc4(i, 2, this, lh00Var, izsVar);
        }
    }

    public final void n(izs<? super qg00, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(673668344);
        int i2 = i | (M.y(izsVar) ? 4 : 2);
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(673668344, i2, -1, "com.vk.settings.impl.presentation.base.mvi.communities.ManageCommunitiesNotificationsView.TopBar (ManageCommunitiesNotificationsView.kt:125)");
            }
            q630.a aVar3 = q630.a.a;
            q630 f = txj0.f(aVar3, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            TopBar$Middle.Text a3 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(d370.N(R.string.manage_communities_title, 0, M), null, null, null, null, M, 196608, 30), null, null, null, M, 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
            }
            lg90 b2 = or.b(M, -45049119, R.drawable.vk_icon_arrow_left_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            String N = d370.N(R.string.manage_communities_back, 0, M);
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new i97(izsVar, 5);
                M.R(x);
            }
            aVar2 = M;
            muv0.h(a3, aVar3, null, null, null, TopBar$Before.e.a.a(b2, N, (gzs) x, null, null, null, M, 1572872, 56), null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar2, 48, 0, 8156);
            ijv0.c(SeparatorDpi.At2x, SeparatorAppearance.Primary, s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar3), aVar2, 438, 0);
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
            s.d = new hy7(this, izsVar, i, 2);
        }
    }
}
