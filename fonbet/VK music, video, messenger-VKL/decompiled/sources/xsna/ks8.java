package xsna;

import androidx.compose.runtime.a;
import com.vk.profile.design.compose.buttons.ProfileButtons;

/* compiled from: ButtonsSlotImpl.kt */
/* loaded from: classes5.dex */
public final class ks8 implements e95 {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;

    public ks8(ProfileButtons profileButtons, boolean z, rv5 rv5Var) {
        this.a = androidx.compose.runtime.k.b(profileButtons);
        this.b = androidx.compose.runtime.k.b(Boolean.valueOf(z));
        this.c = androidx.compose.runtime.k.b(rv5Var);
    }

    @Override // xsna.e95
    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1087580497);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (M.J(this) ? 32 : 16);
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1087580497, i3, -1, "com.vk.profile.design.compose.header.header.ButtonsSlotImpl.Content (ButtonsSlotImpl.kt:25)");
            }
            izs izsVar = (izs) M.r(h85.a);
            ProfileButtons profileButtons = (ProfileButtons) ((zak0) this.a).getValue();
            boolean booleanValue = ((Boolean) ((zak0) this.b).getValue()).booleanValue();
            rv5 rv5Var = (rv5) ((zak0) this.c).getValue();
            boolean J = M.J(izsVar);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                x = new tj5(izsVar, 1);
                M.R(x);
            }
            q630Var2 = q630Var;
            com.vk.profile.design.compose.buttons.a.c(profileButtons, (izs) x, q630Var2, booleanValue, rv5Var, M, (i3 << 6) & 896);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            q630Var2 = q630Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new js8(this, q630Var2, i, 0);
        }
    }
}
