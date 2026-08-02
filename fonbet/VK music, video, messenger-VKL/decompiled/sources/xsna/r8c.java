package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.form.FormField$Style;
import com.vk.core.compose.component.input.InputSelect$State;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.f8s;
import xsna.g8s;
import xsna.h8s;
import xsna.s2x;

/* compiled from: CheckoutSelect.kt */
/* loaded from: classes18.dex */
public final class r8c {
    public static final void a(q8c q8cVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        String str = q8cVar.h;
        androidx.compose.runtime.a M = aVar.M(1596751093);
        if ((i & 6) == 0) {
            i2 = (M.J(q8cVar) ? 4 : 2) | i;
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
                androidx.compose.runtime.b.f(1596751093, i2, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.item.CheckoutSelect (CheckoutSelect.kt:19)");
            }
            String str2 = q8cVar.g;
            if (str2 == null) {
                str2 = "";
            }
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new uk(5, izsVar, q8cVar);
                M.R(x);
            }
            b7i0 a = s2x.b.a.a(str2, (gzs) x, q8cVar.f, 0L, null, null, M, 805306368, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
            InputSelect$State inputSelect$State = (str == null || str.length() == 0) ? InputSelect$State.Default : InputSelect$State.Error;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new x50(8);
                M.R(x2);
            }
            vr9 vr9Var = null;
            u2x a2 = g8s.b.a.a(a, inputSelect$State, false, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3), M, 24576, 4);
            M = M;
            q630 E = ahn.E(q630Var, "checkout_input_field_".concat(q8cVar.b.e));
            String str3 = q8cVar.e;
            boolean z2 = q8cVar.d;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new vt1(8);
                M.R(x3);
            }
            hly a3 = h8s.a.a(str3, z2, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x3, 3), M, 196608, 12);
            if (str == null) {
                M.K(2050196873);
            } else {
                M.K(2050196874);
                String str4 = q8cVar.h;
                FormField$Style formField$Style = FormField$Style.Error;
                Object x4 = M.x();
                if (x4 == c0012a) {
                    x4 = new gt(7);
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
            s.d = new kw9(q8cVar, izsVar, q630Var, i, 2);
        }
    }
}
