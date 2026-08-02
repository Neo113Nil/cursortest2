package xsna;

import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.q630;

/* compiled from: TextArea.kt */
/* loaded from: classes17.dex */
public interface wbo0 {

    /* compiled from: TextArea.kt */
    public static final class a implements wbo0 {
        public final wh50 a;
        public final wh50 b = androidx.compose.runtime.k.b(null);
        public final wh50 c = androidx.compose.runtime.k.b(null);

        public a(lg90 lg90Var) {
            this.a = androidx.compose.runtime.k.b(lg90Var);
        }

        @Override // xsna.wbo0
        public final void a(int i, androidx.compose.runtime.a aVar) {
            androidx.compose.runtime.a M = aVar.M(1862957432);
            int i2 = (M.J(this) ? 4 : 2) | i;
            if (M.t(i2 & 1, (i2 & 3) != 2)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1862957432, i2, -1, "com.vk.core.compose.component.input.TextArea.After.Icon.Content (TextArea.kt:87)");
                }
                q630 b = com.vk.core.compose.component.semantics.b.b(txj0.q(q630.a.a, 24), (SemanticsConfiguration) ((zak0) this.c).getValue());
                lg90 lg90Var = (lg90) ((zak0) this.a).getValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                pzu0.b(lg90Var, (String) ((zak0) this.b).getValue(), b, ylu0Var.getIcon().l, M, 8, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new uog(this, i, 8);
            }
        }
    }

    void a(int i, androidx.compose.runtime.a aVar);
}
