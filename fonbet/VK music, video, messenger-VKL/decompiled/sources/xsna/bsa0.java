package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.compose.component.defaults.PlaceholderMode;
import xsna.q630;

/* compiled from: Placeholder.kt */
/* loaded from: classes17.dex */
public interface bsa0 {

    /* compiled from: Placeholder.kt */
    public static final class a {
        public static final void a(PlaceholderMode placeholderMode, bsa0 bsa0Var, androidx.compose.runtime.a aVar, int i) {
            int i2;
            androidx.compose.runtime.a M = aVar.M(-556887162);
            if ((i & 6) == 0) {
                i2 = (M.J(q630.a.a) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= M.o(placeholderMode == null ? -1 : placeholderMode.ordinal()) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= M.J(bsa0Var) ? 256 : 128;
            }
            if (M.t(i2 & 1, (i2 & 147) != 146)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-556887162, i2, -1, "com.vk.core.compose.component.placeholder.Placeholder.Top.ComposeDefaultImpls.Content$default (Placeholder.kt:-1)");
                }
                bsa0Var.a(i2 & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new o7c(placeholderMode, bsa0Var, i);
            }
        }
    }

    void a(int i, androidx.compose.runtime.a aVar);
}
