package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.cri;
import xsna.dt1;
import xsna.p5g;
import xsna.q630;
import xsna.xpv;

/* compiled from: ClipsAuthorsPicker.kt */
/* loaded from: classes17.dex */
public final class fid {
    public static final void a(s61 s61Var, gzs gzsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1294870697);
        int i2 = i | (M.J(s61Var) ? 4 : 2) | (M.y(gzsVar) ? 32 : 16) | 384;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1294870697, i2, -1, "com.vk.clips.upload.ui.impl.compose.views.author.AfterAuthorsItem (ClipsAuthorsPicker.kt:162)");
            }
            q630.a aVar3 = q630.a.a;
            q630 v = txj0.v(aVar3, 72);
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new oa(12);
                M.R(x);
            }
            q630 E = ahn.E(ojc.c(egi0.b(v, true, (izs) x), false, null, null, gzsVar, 15), "upload_after_authors_item");
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            s61Var.getClass();
            float f = 8;
            float f2 = 4;
            ldu0.b(xpv.a.a(pg90.a(R.drawable.vk_icon_add_outline_28, 0, M), wlb0.h(M).getIcon().a, null, M, 24584, 12), 56, s200.G(aVar3, f, f2, f, f), null, p5g.a.a((float) 0.5d, 199680, 22, wlb0.h(M).getImage().a, M, false), false, null, null, null, M, 48, 488);
            aVar2 = M;
            yqv0.c(d370.N(R.string.clips_author_upload_create_channel_title, 0, M), txj0.f(s200.E(aVar3, f2, 2), 1.0f), wlb0.h(M).getText().a, null, null, 0, 3, null, 2, false, 0, 2, null, null, aVar2, 100663344, 48, 14008);
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
            s.d = new fn7(i, 2, s61Var, gzsVar, q630Var2);
        }
    }

    public static final void b(final ub5 ub5Var, final boolean z, final int i, final gzs gzsVar, final q630 q630Var, androidx.compose.runtime.a aVar, final int i2) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(823104200);
        int i3 = i2 | (M.J(ub5Var) ? 4 : 2) | (M.l(z) ? 32 : 16) | (M.o(i) ? 256 : 128) | (M.y(gzsVar) ? 2048 : 1024) | (M.J(q630Var) ? 16384 : 8192);
        if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(823104200, i3, -1, "com.vk.clips.upload.ui.impl.compose.views.author.AuthorItem (ClipsAuthorsPicker.kt:105)");
            }
            q630 E = ahn.E(ojc.c(txj0.v(q630Var, 72), false, null, null, gzsVar, 15), "upload_author_container");
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            float f = 8;
            float f2 = 4;
            q630.a aVar4 = q630.a.a;
            q630 G = s200.G(aVar4, f, f2, f, f);
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, G);
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
            k9q0.w(M, d, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            nr5.a(ub5Var.b, z, 56, M, (i3 & 112) | 3456);
            M.G();
            String str = ub5Var.c;
            q630 E2 = ahn.E(txj0.f(s200.E(aVar4, f2, 2), 1.0f), "upload_author_title");
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            yqv0.c(str, E2, ylu0Var.getText().m, null, null, 0, 3, null, 2, false, i, i, null, null, aVar2, 100663344, ((i3 >> 6) & 14) | ((i3 >> 3) & 112), 12984);
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
            s.d = new wzs(z, i, gzsVar, q630Var, i2) { // from class: xsna.yhd
                public final /* synthetic */ boolean c;
                public final /* synthetic */ int d;
                public final /* synthetic */ gzs e;
                public final /* synthetic */ q630 f;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    fid.b(ub5.this, this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(final ldf ldfVar, final izs izsVar, final gzs gzsVar, final gzs gzsVar2, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a aVar2;
        a.C0011a.C0012a c0012a;
        xvy xvyVar;
        int i2;
        androidx.compose.runtime.a M = aVar.M(-703337007);
        int i3 = i | (M.J(ldfVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(gzsVar) ? 256 : 128) | (M.y(gzsVar2) ? 2048 : 1024) | (M.J(q630Var) ? 16384 : 8192);
        if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-703337007, i3, -1, "com.vk.clips.upload.ui.impl.compose.views.author.ClipsAuthorsPicker (ClipsAuthorsPicker.kt:46)");
            }
            boolean z = ldfVar.d;
            int i4 = i3 >> 3;
            int i5 = i4 & 112;
            xvy a = zvy.a(0, 3, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2132428519, i5, -1, "com.vk.clips.upload.ui.impl.compose.views.utils.rememberPaginatableLazyListState (PaginatableLazyListState.kt:18)");
            }
            Boolean valueOf = Boolean.valueOf(z);
            boolean J = M.J(a) | M.o(3) | M.l(z) | (((i5 ^ 48) > 32 && M.J(gzsVar)) || (i4 & 48) == 32);
            Object x = M.x();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (J || x == c0012a2) {
                c0012a = c0012a2;
                xvyVar = a;
                i2 = 0;
                hd90 hd90Var = new hd90(xvyVar, 3, z, gzsVar, null);
                M.R(hd90Var);
                x = hd90Var;
            } else {
                c0012a = c0012a2;
                xvyVar = a;
                i2 = 0;
            }
            bap.g(valueOf, (wzs) x, M, i2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (ldfVar.f) {
                M.K(2033079095);
                ub5 ub5Var = (ub5) j5g.a0(new wow(ldfVar.a));
                Long valueOf2 = ub5Var != null ? Long.valueOf(ub5Var.a) : null;
                boolean J2 = M.J(xvyVar);
                Object x2 = M.x();
                if (J2 || x2 == c0012a) {
                    x2 = new zhd(xvyVar, null);
                    M.R(x2);
                }
                bap.g(valueOf2, (wzs) x2, M, i2);
            } else {
                M.K(2030730225);
            }
            M.j();
            q630 f = txj0.f(q630Var, 1.0f);
            u890 m = s200.m(8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            int i6 = ((i3 & 112) == 32 ? 1 : i2) | ((i3 & 14) == 4 ? 1 : i2) | ((i3 & 7168) == 2048 ? 1 : i2);
            Object x3 = M.x();
            if (i6 != 0 || x3 == c0012a) {
                x3 = new ab6(ldfVar, izsVar, gzsVar2, 1);
                M.R(x3);
            }
            aVar2 = M;
            lqy.b(f, xvyVar, m, null, null, null, false, null, (izs) x3, aVar2, 384, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(izsVar, gzsVar, gzsVar2, q630Var, i) { // from class: xsna.vhd
                public final /* synthetic */ izs c;
                public final /* synthetic */ gzs d;
                public final /* synthetic */ gzs e;
                public final /* synthetic */ q630 f;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    fid.c(ldf.this, this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void d(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1642524898);
        if (M.t(i & 1, i != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1642524898, i, -1, "com.vk.clips.upload.ui.impl.compose.views.author.PlaceholderItem (ClipsAuthorsPicker.kt:136)");
            }
            q630.a aVar2 = q630.a.a;
            q630 v = txj0.v(aVar2, 72);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, v);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            float f = 8;
            q630 G = s200.G(aVar2, f, 4, f, f);
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, G);
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
            k9q0.w(M, d, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            q630 d2 = rte0.d(txj0.q(aVar2, 56), vog0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getImage().b;
            e.a aVar4 = androidx.compose.ui.graphics.e.a;
            ja8.a(hr80.m(d2, j, aVar4), M, 0);
            M.G();
            q630 s = txj0.s(aVar2, 48, 16);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (dt.c(hr80.m(s, ylu0Var2.getImage().b, aVar4), M, 0)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            s2.d = new uhd(i, 0);
        }
    }
}
