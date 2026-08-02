package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.form.FormField$Style;
import com.vk.core.compose.component.input.InputSelect$State;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.f8s;
import xsna.g8s;
import xsna.h8s;
import xsna.s2x;

/* compiled from: CheckoutDeliveryPointSelect.kt */
/* loaded from: classes18.dex */
public final class q4c {
    public static final void a(p4c p4cVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        String str = p4cVar.h;
        androidx.compose.runtime.a M = aVar.M(1728354553);
        if ((i & 6) == 0) {
            i2 = (M.J(p4cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1728354553, i2, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.item.CheckoutDeliveryPointSelect (CheckoutDeliveryPointSelect.kt:19)");
            }
            int i3 = i2;
            String str2 = p4cVar.g;
            boolean z = ((i3 & 112) == 32) | ((i3 & 14) == 4);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new pk(2, izsVar, p4cVar);
                M.R(x);
            }
            b7i0 a = s2x.b.a.a(str2, (gzs) x, p4cVar.f, 0L, null, null, M, 805306368, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
            InputSelect$State inputSelect$State = (str == null || str.length() == 0) ? InputSelect$State.Default : InputSelect$State.Error;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new oa(10);
                M.R(x2);
            }
            vr9 vr9Var = null;
            u2x a2 = g8s.b.a.a(a, inputSelect$State, false, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3), M, 24576, 4);
            M = M;
            q630 E = ahn.E(q630Var, "checkout_input_field_".concat(p4cVar.b.e));
            String str3 = p4cVar.e;
            boolean z2 = p4cVar.d;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new com.vk.movika.sdk.base.utils.b(9);
                M.R(x3);
            }
            hly a3 = h8s.a.a(str3, z2, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x3, 3), M, 196608, 12);
            if (str == null) {
                M.K(1343769189);
            } else {
                M.K(1343769190);
                String str4 = p4cVar.h;
                FormField$Style formField$Style = FormField$Style.Error;
                Object x4 = M.x();
                if (x4 == c0012a) {
                    x4 = new qt0(12);
                    M.R(x4);
                }
                vr9Var = f8s.a.a(str4, formField$Style, com.vk.core.compose.component.semantics.b.a(null, (izs) x4, 3), M, 3120, 0);
                M = M;
            }
            M.j();
            nvu0.a(a2, E, a3, null, vr9Var, M, 0, 8);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new l1a(i, 1, p4cVar, izsVar, q630Var);
        }
    }
}
