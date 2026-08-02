package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vkontakte.android.R;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;
import xsna.xpv;

/* compiled from: DisabledNotification.kt */
/* loaded from: classes4.dex */
public final class i0n {
    public static final void a(r970 r970Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(665652975);
        if ((i & 6) == 0) {
            i2 = (M.J(r970Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        int i3 = i & 384;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar2) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(665652975, i2, -1, "com.vk.notifications.design.compose.list.common.DisabledNotification (DisabledNotification.kt:42)");
            }
            M.K(604040652);
            b(r970Var, izsVar, aVar2, M, i2 & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new jh4(r970Var, izsVar, i);
        }
    }

    public static final void b(r970 r970Var, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        cri.a.e eVar;
        int i3;
        LayoutNode.a aVar2;
        long j;
        r970 r970Var2 = r970Var;
        izs izsVar2 = izsVar;
        androidx.compose.runtime.a M = aVar.M(-361760832);
        if ((i & 6) == 0) {
            i2 = (M.J(r970Var2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-361760832, i2, -1, "com.vk.notifications.design.compose.list.common.MilkshakeDisabledNotification (DisabledNotification.kt:96)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            ty6.a aVar3 = dt1.a.n;
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, aVar3, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a, cVar);
            cri.a.e eVar2 = cri.a.e;
            k9q0.w(M, D, eVar2);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            q630.a aVar5 = q630.a.a;
            q630 E = s200.E(txj0.z(txj0.f(aVar5, 1.0f), null, 3), 16, 10);
            int i4 = i2;
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.k, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, E);
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
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar2);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            y18 a3 = aqw.a((float) 0.5d, wlb0.h(M).getBackground().z);
            uog0 uog0Var = vog0.a;
            q630 d = rte0.d(r18.b(a3.a, a3.b, aVar5, uog0Var), uog0Var);
            float f = 48;
            if (androidx.compose.runtime.b.d()) {
                eVar = eVar2;
                i3 = 0;
                androidx.compose.runtime.b.f(-1060031380, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-DoneOutline28> (VkSdkIcons.kt:712)");
            } else {
                eVar = eVar2;
                i3 = 0;
            }
            lg90 a4 = pg90.a(R.drawable.vk_icon_done_outline_28, i3, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (wlb0.h(M).s()) {
                M.K(1452364827);
                M.j();
                aVar2 = aVar4;
                j = l5g.k;
            } else {
                aVar2 = aVar4;
                j = vcl0.a(M, 1452435724, M).c;
                M.j();
            }
            LayoutNode.a aVar6 = aVar2;
            cri.a.e eVar3 = eVar;
            ldu0.b(xpv.a.a(a4, j, new rek0(wlb0.h(M).getBackground().x), M, 24584, 8), f, d, null, null, false, null, null, null, M, 48, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
            f9t.e(txj0.v(aVar5, 12), M, 6);
            androidx.compose.foundation.layout.c a5 = androidx.compose.foundation.layout.b.a(mVar, aVar3, M, 0);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c3 = qri.c(M, aVar5);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar6);
            } else {
                M.f();
            }
            k9q0.w(M, a5, cVar);
            k9q0.w(M, D3, eVar3);
            ur.d(hashCode3, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            r970Var2 = r970Var;
            yqv0.c(r970Var2.a, ahn.E(aVar5, "NotificationDisabledTitle"), 0L, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(M).e0, M, 48, 0, 8188);
            M = M;
            f9t.e(txj0.h(aVar5, 8), M, 6);
            izsVar2 = izsVar;
            h870.b(r970Var2.b, izsVar2, M, i4 & 112);
            M.G();
            M.G();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new hj(i, 3, r970Var2, izsVar2, q630Var);
        }
    }
}
