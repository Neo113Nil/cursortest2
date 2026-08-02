package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.uhg0;

/* compiled from: ReviewFriendsComposeContentView.kt */
/* loaded from: classes18.dex */
public final class hhg0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(uhg0.a aVar, gzs gzsVar, final izs izsVar, final gzs gzsVar2, q630 q630Var, androidx.compose.runtime.a aVar2, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar2.M(-2028543699);
        int i2 = i | (M.J(aVar) ? 4 : 2) | (M.y(gzsVar) ? 32 : 16) | (M.y(izsVar) ? 256 : 128) | (M.y(gzsVar2) ? 2048 : 1024) | 24576;
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2028543699, i2, -1, "com.vk.ecomm.reviews.impl.reviewfriends.presentation.content.ReviewFriendsComposeContentView (ReviewFriendsComposeContentView.kt:45)");
            }
            final wh50 d = jk50.d(aVar.a, new wow(EmptyList.b), M, 0);
            final wh50 d2 = jk50.d(aVar.b, 0, M, 48);
            yzt0<Boolean> yzt0Var = aVar.c;
            Boolean bool = Boolean.FALSE;
            final wh50 d3 = jk50.d(yzt0Var, bool, M, 48);
            final wh50 d4 = jk50.d(aVar.d, bool, M, 48);
            final wh50 d5 = jk50.d(aVar.e, bool, M, 48);
            boolean booleanValue = ((Boolean) d3.getValue()).booleanValue();
            boolean z = (i2 & 112) == 32;
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (z || x == obj) {
                x = new mxn(1, gzsVar);
                M.R(x);
            }
            xvy z2 = crx0.z(booleanValue, (gzs) x, 0, M, 0, 60);
            q630.a aVar3 = q630.a.a;
            q630 z3 = txj0.z(aVar3, null, 3);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, z3);
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
            q630 E = ahn.E(n34.t(txj0.d(aVar3, 1.0f), dz5.I(6, 0, M, true), null), "reviewFriendsList");
            boolean J = ((i2 & 896) == 256) | M.J(d) | M.J(d2) | M.J(d4) | M.J(d5) | M.J(d3) | ((i2 & 7168) == 2048);
            Object x2 = M.x();
            if (J || x2 == obj) {
                x2 = new izs() { // from class: xsna.fhg0
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // xsna.izs
                    public final Object invoke(Object obj2) {
                        nvy nvyVar = (nvy) obj2;
                        List<T> list = ((wow) d.getValue()).b;
                        wow wowVar = new wow(list);
                        nvyVar.e(list.size(), null, new p6l(wowVar, 1), new jai(802480018, new ghg0(wowVar, izsVar), true));
                        mtk0 mtk0Var = d2;
                        int intValue = ((Number) mtk0Var.getValue()).intValue();
                        mtk0 mtk0Var2 = d4;
                        mtk0 mtk0Var3 = d5;
                        if (intValue > 0 && !((Boolean) mtk0Var2.getValue()).booleanValue() && !((Boolean) mtk0Var3.getValue()).booleanValue() && !((Boolean) d3.getValue()).booleanValue()) {
                            nvy.g(nvyVar, null, null, new jai(1382115271, new wg2(mtk0Var, 3), true), 3);
                        }
                        if (((Boolean) mtk0Var2.getValue()).booleanValue()) {
                            nvy.g(nvyVar, null, null, mki.a, 3);
                        }
                        if (((Boolean) mtk0Var3.getValue()).booleanValue()) {
                            nvy.g(nvyVar, null, null, new jai(1740740687, new psp(gzsVar2, 1), true), 3);
                        }
                        return s3q0.a;
                    }
                };
                M.R(x2);
            }
            M = M;
            lqy.a(E, z2, null, null, null, null, false, null, (izs) x2, M, 0, IronSourceError.ERROR_CODE_INIT_FAILED);
            if (xga0.c(aVar3, 12, M, 6)) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new lz7(aVar, gzsVar, izsVar, gzsVar2, q630Var2, i);
        }
    }
}
