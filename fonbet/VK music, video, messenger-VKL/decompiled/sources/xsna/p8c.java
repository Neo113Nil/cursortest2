package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import xsna.q630;

/* compiled from: CheckoutSelectDeliveryAreaBottomSheet.kt */
/* loaded from: classes18.dex */
public final class p8c {
    public static final void a(n4c n4cVar, gzs gzsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        com.vk.core.compose.component.cell.content.h1 b;
        androidx.compose.runtime.a M = aVar.M(1163631070);
        int i2 = i | (M.J(n4cVar) ? 4 : 2) | (M.y(gzsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1163631070, i2, -1, "com.vk.ecomm.cart.impl.checkout.dropdown_dialog.CheckoutOption (CheckoutSelectDeliveryAreaBottomSheet.kt:117)");
            }
            q630 c = ojc.c(q630Var, false, null, null, gzsVar, 15);
            com.vk.core.compose.component.cell.content.h1 a = Cell$Middle.d.b.a(n4cVar.b, null, null, 0, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            String str = n4cVar.c;
            if (str == null) {
                M.K(1052578421);
                M.j();
                b = null;
            } else {
                M.K(1052578422);
                b = Cell$Middle.c.b.b(str, 0, null, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                M.j();
            }
            wiu0.b(c, false, null, Cell$Middle.a.a(a, b, null, null, M, 196608, 28), null, null, null, M, 0, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
            aVar2 = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new l8c(i, 0, n4cVar, gzsVar, q630Var);
        }
    }

    public static final void b(ArrayList arrayList, l22 l22Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1859573133);
        int i2 = i | (M.J(arrayList) ? 4 : 2) | (M.y(l22Var) ? 32 : 16) | 384;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1859573133, i2, -1, "com.vk.ecomm.cart.impl.checkout.dropdown_dialog.CheckoutOptionsContent (CheckoutSelectDeliveryAreaBottomSheet.kt:90)");
            }
            q630.a aVar2 = q630.a.a;
            q630 t = n34.t(ahn.E(aVar2, "select_delivery_area_content_list").g(aVar2), dz5.I(0, 1, M, false), null);
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new ma(3, arrayList, l22Var);
                M.R(x);
            }
            lqy.a(t, null, null, null, null, null, false, null, (izs) x, M, 0, 510);
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
            s.d = new k71(i, 3, arrayList, l22Var, q630Var2);
        }
    }
}
