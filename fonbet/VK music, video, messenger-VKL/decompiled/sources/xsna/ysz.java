package xsna;

import com.vk.core.compose.component.semantics.SemanticsConfiguration;

/* compiled from: LoadingContent.kt */
/* loaded from: classes17.dex */
public final class ysz implements efj {
    public final wh50 a = androidx.compose.runtime.k.b(null);

    @Override // xsna.efj
    public final void a(int i, long j, androidx.compose.runtime.a aVar, q630 q630Var) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-294395350);
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
                androidx.compose.runtime.b.f(-294395350, i2, -1, "com.vk.core.compose.component.image.content.LoadingContent.invoke (LoadingContent.kt:24)");
            }
            q630 d = txj0.d(com.vk.core.compose.component.semantics.b.b(q630Var, (SemanticsConfiguration) ((zak0) this.a).getValue()), 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            f9t.e(hr80.m(d, ylu0Var.getBackground().x, androidx.compose.ui.graphics.e.a), M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xsz(this, j, q630Var, i, 0);
        }
    }
}
