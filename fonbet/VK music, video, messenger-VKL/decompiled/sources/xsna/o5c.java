package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.group.header.b;
import com.vk.core.compose.component.group.header.f;
import xsna.cku;

/* compiled from: CheckoutHeader.kt */
/* loaded from: classes18.dex */
public final class o5c {
    public static final void a(m5c m5cVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        cku a;
        String str = m5cVar.e;
        androidx.compose.runtime.a M = aVar.M(817270161);
        if ((i & 6) == 0) {
            i2 = (M.J(m5cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(817270161, i2, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.item.CheckoutHeader (CheckoutHeader.kt:17)");
            }
            com.vk.core.compose.component.group.header.f a2 = f.a.a(kq01.g(m5cVar.d, M), null, null, null, null, null, null, null, false, M, 805306368, 510);
            aVar2 = M;
            if (str == null) {
                aVar2.K(-873918379);
                aVar2.j();
                a = null;
            } else {
                aVar2.K(-873918378);
                a = cku.b.a(m5cVar.e, null, null, null, aVar2, 24576, 14);
                aVar2 = aVar2;
                aVar2.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(958254720, 384, -1, "com.vk.core.compose.component.group.header.GroupHeader.Middle.Companion.invoke (GroupHeader.kt:1088)");
            }
            Object x = aVar2.x();
            if (x == a.C0011a.a) {
                x = new com.vk.core.compose.component.group.header.a(a2, a);
                aVar2.R(x);
            }
            com.vk.core.compose.component.group.header.a aVar3 = (com.vk.core.compose.component.group.header.a) x;
            ((zak0) aVar3.a).setValue(a2);
            ((zak0) aVar3.b).setValue(a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            com.vk.core.compose.component.group.header.g.a(aVar3, txj0.f(s200.H(q630Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, str != null ? kqu0.s : 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 1.0f), b.c.a, null, null, false, aVar2, 384, 120);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new n5c(m5cVar, q630Var, i, 0);
        }
    }
}
