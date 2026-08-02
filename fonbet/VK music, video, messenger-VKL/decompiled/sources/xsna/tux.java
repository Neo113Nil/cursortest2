package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vungle.ads.internal.protos.Sdk;
import xsna.phw;
import xsna.q630;

/* compiled from: Item.kt */
/* loaded from: classes7.dex */
public final class tux {
    public static final void a(ovx ovxVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        lg90 p;
        com.vk.core.compose.component.cell.content.b0 b0Var;
        androidx.compose.runtime.a M = aVar.M(1195108834);
        int i2 = i | (M.J(ovxVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | 384;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1195108834, i2, -1, "com.vk.video.ui.upload.impl.publish.presentation.author.compose.item.Item (Item.kt:23)");
            }
            if (((Boolean) M.r(c5x.a)).booleanValue()) {
                M.K(-1791339576);
                p = w65.p(null, M, 6);
                M.j();
            } else {
                M.K(-1791404924);
                p = fwu0.l(null, ovxVar.a, null, null, M, 0, 61);
                M.j();
            }
            lg90 lg90Var = p;
            int i3 = i2 & 112;
            int i4 = i2 & 14;
            boolean z = (i3 == 32) | (i4 == 4);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new xy0(11, izsVar, ovxVar);
                M.R(x);
            }
            q630.a aVar2 = q630.a.a;
            q630 f = txj0.f(ojc.c(aVar2, false, null, null, (gzs) x, 15), 1.0f);
            phw a = phw.a.a(lg90Var, null, null, null, null, M, 196616, 30);
            Cell$Left.Main.Size size = Cell$Left.Main.Size.Small;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new rd1(26);
                M.R(x2);
            }
            com.vk.core.compose.component.cell.content.t a2 = com.vk.core.compose.component.cell.content.e.a(a, size, null, null, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3), M, 100663344, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
            String str = ovxVar.b;
            if (str == null) {
                str = "";
            }
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new y8(26);
                M.R(x3);
            }
            com.vk.core.compose.component.cell.content.k0 a3 = Cell$Middle.a.a(Cell$Middle.d.b.a(str, null, null, 1, com.vk.core.compose.component.semantics.b.a(null, (izs) x3, 3), null, M, 12610560, 70), null, null, null, M, 196608, 30);
            if (ovxVar.d) {
                M.K(-1790478768);
                boolean z2 = (i3 == 32) | (i4 == 4);
                Object x4 = M.x();
                if (z2 || x4 == c0012a) {
                    x4 = new yq1(10, izsVar, ovxVar);
                    M.R(x4);
                }
                gzs gzsVar = (gzs) x4;
                Object x5 = M.x();
                if (x5 == c0012a) {
                    x5 = new sux(0);
                    M.R(x5);
                }
                b0Var = o.e.a.C0736a.a(true, gzsVar, false, com.vk.core.compose.component.semantics.b.a(null, (izs) x5, 3), M, 24582, 4);
                M.j();
            } else {
                M.K(-1790118300);
                M.j();
                b0Var = null;
            }
            wiu0.b(f, false, a2, a3, b0Var, null, null, M, 0, 98);
            M = M;
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
            s.d = new fjh(i, 2, ovxVar, izsVar, q630Var2);
        }
    }
}
