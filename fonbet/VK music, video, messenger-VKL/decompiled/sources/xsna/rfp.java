package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.cell.content.SexyCell$Size;
import com.vk.core.compose.component.cell.content.a1;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.q630;

/* compiled from: EmptyDescriptionSlotImpl.kt */
/* loaded from: classes5.dex */
public final class rfp implements l95 {
    public final wh50 a;

    public rfp(boolean z) {
        this.a = androidx.compose.runtime.k.b(Boolean.valueOf(z));
    }

    @Override // xsna.l95
    public final void a(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(2099668348);
        int i3 = i & 48;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 = (M.J(aVar2) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2099668348, i2, -1, "com.vk.profile.design.compose.header.info.EmptyDescriptionSlotImpl.Content (EmptyDescriptionSlotImpl.kt:28)");
            }
            izs izsVar = (izs) M.r(h85.a);
            int i4 = ((Boolean) ((zak0) this.a).getValue()).booleanValue() ? R.string.author_header_empty_community_description : R.string.author_header_empty_profile_description;
            q630 E = ahn.E(aVar2, "author_header_description");
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
            com.vk.core.compose.component.cell.content.b1 a2 = a1.b.a(a1.g.b.a(d370.N(i4, 0, M), null, null, 0, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, null, null, null, null, null, null, M, 2046);
            boolean J = M.J(izsVar);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                x = new me1(izsVar, 3);
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
            s.d = new ds7(this, i);
        }
    }
}
