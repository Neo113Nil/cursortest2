package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.onboarding.api.stat.VkOnboardingStat$Delegate;
import xsna.q630;

/* compiled from: ButtonImpl.kt */
/* loaded from: classes17.dex */
public final class yp8 implements f7v0 {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;
    public final wh50 f = androidx.compose.runtime.k.b(null);

    public yp8(String str, gzs gzsVar, ButtonSize buttonSize, ButtonStyle buttonStyle, ButtonAppearance buttonAppearance) {
        this.a = androidx.compose.runtime.k.b(str);
        this.b = androidx.compose.runtime.k.b(gzsVar);
        this.c = androidx.compose.runtime.k.b(buttonSize);
        this.d = androidx.compose.runtime.k.b(buttonStyle);
        this.e = androidx.compose.runtime.k.b(buttonAppearance);
    }

    @Override // xsna.f7v0
    public final void a(VkOnboardingStat$Delegate vkOnboardingStat$Delegate, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1864364579);
        int i3 = i & 6;
        q630.a aVar3 = q630.a.a;
        if (i3 == 0) {
            i2 = (M.J(aVar3) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(vkOnboardingStat$Delegate) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1864364579, i2, -1, "com.vk.core.tool.compose.onboarding.ButtonImpl.Content (ButtonImpl.kt:38)");
            }
            q630 b = com.vk.core.compose.component.semantics.b.b(aVar3, (SemanticsConfiguration) ((zak0) this.f).getValue());
            ButtonSize buttonSize = (ButtonSize) ((zak0) this.c).getValue();
            ButtonStyle buttonStyle = (ButtonStyle) ((zak0) this.d).getValue();
            ButtonAppearance buttonAppearance = (ButtonAppearance) ((zak0) this.e).getValue();
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new km1(2, vkOnboardingStat$Delegate, this);
                M.R(x);
            }
            aVar2 = M;
            bhu0.c((gzs) x, buttonSize, buttonStyle, buttonAppearance, b, null, null, false, null, null, null, false, kai.c(1184668094, new uq5(this, 1), M), aVar2, 0, 384, 4064);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new qz5(this, vkOnboardingStat$Delegate, i);
        }
    }
}
