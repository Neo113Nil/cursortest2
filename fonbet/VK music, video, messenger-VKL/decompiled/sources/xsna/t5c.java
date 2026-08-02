package xsna;

import com.vk.ecomm.cart.impl.checkout.feature.state.FieldKey;
import java.util.Map;
import xsna.k8s;
import xsna.q630;

/* compiled from: CheckoutInputFieldsRow.kt */
/* loaded from: classes18.dex */
public final class t5c implements k8s.a {
    public final /* synthetic */ u1x a;
    public final /* synthetic */ izs<r2c, s3q0> b;
    public final /* synthetic */ l5c c;

    /* JADX WARN: Multi-variable type inference failed */
    public t5c(u1x u1xVar, izs<? super r2c, s3q0> izsVar, l5c l5cVar) {
        this.a = u1xVar;
        this.b = izsVar;
        this.c = l5cVar;
    }

    @Override // xsna.k8s.a
    public final void a(k8s.a aVar, androidx.compose.runtime.a aVar2, int i) {
        k8s.a aVar3;
        q630 g;
        androidx.compose.runtime.a M = aVar2.M(-1250068547);
        int i2 = (M.J(aVar) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1250068547, i2, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.item.CheckoutInputFieldsRow.<anonymous>.<anonymous>.<anonymous>.<no name provided>.Content (CheckoutInputFieldsRow.kt:25)");
            }
            izs<r2c, s3q0> izsVar = this.b;
            u1x u1xVar = this.a;
            g8s c = r5c.c(u1xVar, izsVar, M, 0);
            FieldKey fieldKey = u1xVar.b;
            String concat = "checkout_input_field_".concat(fieldKey.d);
            q630.a aVar4 = q630.a.a;
            q630 E = ahn.E(aVar4, concat);
            rwr rwrVar = (rwr) ((Map) ((zak0) this.c.a).getValue()).get(fieldKey);
            if (rwrVar != null && (g = E.g(jvi.d(aVar4, rwrVar))) != null) {
                E = g;
            }
            aVar3 = aVar;
            vyu0.a(aVar3, c, E, r5c.e(u1xVar, M, 0), null, r5c.b(u1xVar.f, M), M, i2 & 14, 8);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar3 = aVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new d6(this, aVar3, i, 2);
        }
    }
}
