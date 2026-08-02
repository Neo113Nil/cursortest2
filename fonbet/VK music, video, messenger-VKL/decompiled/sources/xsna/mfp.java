package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.cell.content.SexyCell$Size;
import com.vk.core.compose.component.cell.content.a1;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.q630;

/* compiled from: EmptyContactsSlotImpl.kt */
/* loaded from: classes5.dex */
public final class mfp implements l95 {
    @Override // xsna.l95
    public final void a(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1512445026);
        int i3 = i & 48;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 = (M.J(aVar2) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 17) != 16)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1512445026, i2, -1, "com.vk.profile.design.compose.header.info.EmptyContactsSlotImpl.Content (EmptyContactsSlotImpl.kt:20)");
            }
            izs izsVar = (izs) M.r(h85.a);
            q630 E = ahn.E(aVar2, "author_header_empty_contacts");
            SexyCell$Size sexyCell$Size = SexyCell$Size.Small;
            qzu0.a.getClass();
            lg90 v0 = qzu0.v0(M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            com.vk.core.compose.component.cell.content.x a = f4j0.a(v0, 20, ylu0Var.getIcon().j, M, 196664, 24);
            com.vk.core.compose.component.cell.content.b1 a2 = a1.b.a(a1.g.b.a(d370.N(R.string.author_header_empty_community_contacts, 0, M), null, null, 0, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, null, null, null, null, null, null, M, 2046);
            boolean J = M.J(izsVar);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                x = new zyf(izsVar, 1);
                M.R(x);
            }
            mjv0.a(E, a2, a, null, sexyCell$Size, null, false, (gzs) x, null, M, 24576, 360);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wwl(this, i);
        }
    }
}
