package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.ecomm.cart.impl.checkout.feature.state.PaymentInfoField;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: CheckoutTooltipTextInfo.kt */
/* loaded from: classes18.dex */
public final class j9c {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(f9c f9cVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-151209806);
        if ((i & 6) == 0) {
            i2 = (M.J(f9cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-151209806, i2, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.item.CheckoutTooltipTextInfo (CheckoutTooltipTextInfo.kt:41)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            q630.a aVar3 = q630.a.a;
            f9t.e(txj0.h(aVar3, 6), M, 6);
            q630 E = s200.E(txj0.f(aVar3, 1.0f), 16, 10);
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g(4), dt1.a.l, M, 54);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, E);
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
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            yqv0.c(f9cVar.b, null, wlb0.h(M).getText().p, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(M).T, M, 0, 0, 8186);
            M = M;
            PaymentInfoField.a aVar4 = f9cVar.c;
            if (aVar4 == null) {
                M.K(438257029);
            } else {
                M.K(438257030);
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (x == c0012a) {
                    x = androidx.compose.runtime.k.b(Boolean.FALSE);
                    M.R(x);
                }
                wh50 wh50Var = (wh50) x;
                qzu0.a.getClass();
                lg90 c0 = qzu0.c0(M);
                long j = wlb0.h(M).getIcon().l;
                Object x2 = M.x();
                if (x2 == c0012a) {
                    x2 = new ah(wh50Var, 17);
                    M.R(x2);
                }
                nzu0.c((gzs) x2, c0, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, j, false, null, false, null, null, M, ApiInvocationException.ErrorCodes.CENSOR_MATCH, 2008);
                M = M;
                if (((Boolean) wh50Var.getValue()).booleanValue()) {
                    M.K(1573571311);
                    Object x3 = M.x();
                    if (x3 == c0012a) {
                        x3 = new g9c(0, wh50Var);
                        M.R(x3);
                    }
                    b(aVar4, (gzs) x3, M, 48);
                } else {
                    M.K(1570649592);
                }
                M.j();
                s3q0 s3q0Var = s3q0.a;
            }
            M.j();
            if (kr.f(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new h9c(f9cVar, q630Var, i, 0);
        }
    }

    public static final void b(PaymentInfoField.a aVar, gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a M = aVar2.M(1879759101);
        int i2 = (M.J(aVar) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1879759101, i2, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.item.TooltipContent (CheckoutTooltipTextInfo.kt:88)");
            }
            rrv0.d(null, null, null, null, kai.c(-1724513886, new cg4(1, gzsVar, aVar), M), M, 24576, 15);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new mq1(aVar, gzsVar, i, 2);
        }
    }
}
