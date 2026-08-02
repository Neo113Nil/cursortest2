package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.phw;
import xsna.q630;
import xsna.r1k0;
import xsna.ty6;

/* compiled from: CommentCardBody.kt */
/* loaded from: classes7.dex */
public final class tag {
    public static final void a(r1k0.a.AbstractC3589a abstractC3589a, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-2124143635);
        if ((i & 6) == 0) {
            i2 = (M.J(abstractC3589a) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2124143635, i2, -1, "com.vk.video.ui.discovery.minimizable.recycler.design.compose.cards.comment.CommentCardBody (CommentCardBody.kt:30)");
            }
            if (abstractC3589a instanceof r1k0.a.AbstractC3589a.b) {
                M.K(-1192560837);
                c((r1k0.a.AbstractC3589a.b) abstractC3589a, q630Var, M, i2 & 112);
                M.j();
            } else {
                if (!(abstractC3589a instanceof r1k0.a.AbstractC3589a.C3590a)) {
                    throw alb0.c(-1192563080, M);
                }
                M.K(-1192556421);
                b((r1k0.a.AbstractC3589a.C3590a) abstractC3589a, q630Var, M, i2 & 112);
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
            s.d = new n74(abstractC3589a, q630Var, i, 1);
        }
    }

    public static final void b(r1k0.a.AbstractC3589a.C3590a c3590a, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        int i3;
        q630.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-390232278);
        if ((i & 6) == 0) {
            i2 = (M.J(c3590a) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-390232278, i2, -1, "com.vk.video.ui.discovery.minimizable.recycler.design.compose.cards.comment.EmptyState (CommentCardBody.kt:48)");
            }
            q630 f = txj0.f(q630Var, 1.0f);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
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
            String str = c3590a.b;
            q630.a aVar4 = q630.a.a;
            if (str == null || str.length() == 0) {
                i3 = 0;
                aVar2 = aVar4;
                M.K(-1505035524);
                M.j();
            } else {
                M.K(-1503101248);
                i3 = 0;
                aVar2 = aVar4;
                ldu0.b(phw.a.a(fwu0.l(c3590a.b, null, null, null, M, 0, 62), null, null, null, null, M, 196616, 30), kqu0.a, null, null, null, false, null, null, null, M, 0, IronSourceError.ERROR_CODE_INIT_FAILED);
                mq.d(aVar2, kqu0.v, M, 0);
            }
            yqv0.c(d370.N(R.string.video_write_comment, i3, M), s200.E(hr80.m(txj0.f(aVar2, 1.0f), wlb0.h(M).getWrite().b, vog0.b(18)), kqu0.v, kqu0.s), wlb0.h(M).getText().m, null, null, 0, 0, null, 2, false, 0, 1, null, wlb0.l(M).s0, M, 100663296, 48, 5880);
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
            s.d = new ig8(c3590a, q630Var, i, 2);
        }
    }

    public static final void c(r1k0.a.AbstractC3589a.b bVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630.a aVar2;
        ty6.b bVar2;
        int i3;
        int i4;
        androidx.compose.runtime.a M = aVar.M(-1347128307);
        if ((i & 6) == 0) {
            i2 = i | (M.J(bVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1347128307, i2, -1, "com.vk.video.ui.discovery.minimizable.recycler.design.compose.cards.comment.TopComment (CommentCardBody.kt:84)");
            }
            q630 f = txj0.f(txj0.h(q630Var, 36), 1.0f);
            dt1.a.getClass();
            ty6.b bVar3 = dt1.a.l;
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, bVar3, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
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
            String str = bVar.b;
            q630.a aVar4 = q630.a.a;
            if (str == null || str.length() == 0) {
                aVar2 = aVar4;
                bVar2 = bVar3;
                i3 = 0;
                M.K(-275188399);
                M.j();
            } else {
                M.K(-271986502);
                aVar2 = aVar4;
                bVar2 = bVar3;
                i3 = 0;
                M = M;
                ldu0.b(phw.a.a(fwu0.l(bVar.b, null, null, null, M, 0, 62), null, null, null, null, M, 196616, 30), kqu0.a, null, null, null, false, null, null, null, M, 0, IronSourceError.ERROR_CODE_INIT_FAILED);
                mq.d(aVar2, kqu0.v, M, 0);
            }
            String str2 = bVar.c;
            q630 g = txj0.f(aVar2, 1.0f).g(new gor0(bVar2));
            if (androidx.compose.runtime.b.d()) {
                i4 = -1;
                androidx.compose.runtime.b.f(-473561179, i3, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            } else {
                i4 = -1;
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.s0;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, i3, i4, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            androidx.compose.runtime.a aVar5 = M;
            yqv0.c(str2, g, ylu0Var.getText().m, null, null, q7z.d, 0, null, 2, false, 0, 2, null, frv0Var, aVar5, 100859904, 48, 5848);
            M = aVar5;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new sag(bVar, q630Var, i, 0);
        }
    }
}
