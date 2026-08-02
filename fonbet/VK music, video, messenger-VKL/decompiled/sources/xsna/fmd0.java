package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: ProductCardPropertyPickerBottomSheetBuilder.kt */
/* loaded from: classes18.dex */
public final class fmd0 {
    public static final void a(ArrayList arrayList, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        com.vk.core.compose.component.cell.content.y0 y0Var;
        androidx.compose.runtime.a M = aVar.M(1254866599);
        int i2 = (M.J(arrayList) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1254866599, i2, -1, "com.vk.ecomm.market.orders.ProductCardPropertyPickerContent (ProductCardPropertyPickerBottomSheetBuilder.kt:57)");
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            M.K(-1990149498);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                cmd0 cmd0Var = (cmd0) it.next();
                q630 c2 = ojc.c(txj0.f(q630.a.a, 1.0f), false, null, null, cmd0Var.d, 15);
                boolean z = cmd0Var.c;
                androidx.compose.runtime.a aVar3 = M;
                androidx.compose.runtime.a aVar4 = aVar3;
                com.vk.core.compose.component.cell.content.k0 a2 = Cell$Middle.a.a(Cell$Middle.d.b.a(cmd0Var.a, null, null, 0, null, null, aVar3, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, null, aVar4, 196608, 30);
                if (cmd0Var.b) {
                    aVar4.K(-1887674334);
                    y0Var = o.c.a(null, null, o.e.a.C0736a.a(true, cmd0Var.d, false, null, aVar4, 24582, 12), null, null, aVar4, 59);
                    aVar4 = aVar4;
                    aVar4.j();
                } else {
                    aVar4.K(-1887415236);
                    aVar4.j();
                    y0Var = null;
                }
                androidx.compose.runtime.a aVar5 = aVar4;
                wiu0.b(c2, z, null, a2, y0Var, null, null, aVar5, 0, 100);
                M = aVar5;
            }
            if (gp.d(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new o9d(arrayList, q630Var, i, 8);
        }
    }
}
