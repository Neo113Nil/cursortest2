package xsna;

import com.vk.ecomm.cart.impl.checkout.ui.items.IslandPart;
import java.util.ArrayList;
import xsna.q630;

/* compiled from: LazyDsl.kt */
/* loaded from: classes18.dex */
public final class w3c implements zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ l5c c;
    public final /* synthetic */ izs d;

    public w3c(ArrayList arrayList, l5c l5cVar, izs izsVar) {
        this.b = arrayList;
        this.c = l5cVar;
        this.d = izsVar;
    }

    @Override // xsna.zzs
    public final s3q0 invoke(ksy ksyVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
        int i;
        ksy ksyVar2 = ksyVar;
        int intValue = num.intValue();
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue2 = num2.intValue();
        if ((intValue2 & 6) == 0) {
            i = (aVar2.J(ksyVar2) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= aVar2.o(intValue) ? 32 : 16;
        }
        if (aVar2.t(i & 1, (i & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(802480018, i, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            k7r k7rVar = (k7r) this.b.get(intValue);
            aVar2.K(-1162406243);
            q630 f = txj0.f(q630.a.a, 1.0f);
            IslandPart U0 = k7rVar.U0();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            w5c.a(this.c, k7rVar, this.d, ksy.c(ksyVar2, x3c.g(f, U0, ylu0Var.getBackground().g), 5), aVar2, 0);
            aVar2.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
