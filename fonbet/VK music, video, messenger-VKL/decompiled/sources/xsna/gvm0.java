package xsna;

import com.ironsource.X2;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;

/* compiled from: SubscribeButton.kt */
/* loaded from: classes4.dex */
public final class gvm0 implements com.vk.core.compose.component.cell.content.o {
    public final int a;
    public final int b;
    public final boolean c;
    public final gzs<s3q0> d;
    public final fvm0 e = new fvm0();

    public gvm0(int i, int i2, gzs gzsVar, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = gzsVar;
    }

    @Override // com.vk.core.compose.component.cell.content.o
    public final void a(spg0 spg0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-995054836);
        if ((i & 48) == 0) {
            i2 = (M.J(q630Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-995054836, i2, -1, "com.vk.newsfeed.common.views.subscribe.SubscribeButton.Content (SubscribeButton.kt:36)");
            }
            aVar2 = M;
            bhu0.c(this.d, ButtonSize.Small, ButtonStyle.Secondary, ButtonAppearance.Neutral, q630Var, null, null, false, d370.N(this.b, 0, M), null, null, false, kai.c(1719957329, new u0r(this, 3), M), aVar2, ((i2 << 9) & 57344) | X2.b.f, 384, 3808);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new ju80(i, 3, this, spg0Var, q630Var);
        }
    }
}
