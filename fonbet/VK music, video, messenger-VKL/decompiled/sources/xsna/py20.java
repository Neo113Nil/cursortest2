package xsna;

import androidx.compose.runtime.a;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: ModalCard.kt */
/* loaded from: classes17.dex */
public abstract class py20 {

    /* compiled from: ModalCard.kt */
    public static final class a {
        public static xy20 a(int i, int i2, androidx.compose.runtime.a aVar, String str, String str2) {
            if ((i2 & 1) != 0) {
                str = null;
            }
            if ((i2 & 2) != 0) {
                str2 = null;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(271763735, i, -1, "com.vk.core.compose.component.modal.card.ModalCard.Main.Companion.invoke (ModalCard.kt:152)");
            }
            xy20 b = b(str != null ? new us2(str) : null, str2 != null ? new us2(str2) : null, aVar, 384);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return b;
        }

        public static xy20 b(us2 us2Var, us2 us2Var2, androidx.compose.runtime.a aVar, int i) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-360970819, i, -1, "com.vk.core.compose.component.modal.card.ModalCard.Main.Companion.invoke (ModalCard.kt:138)");
            }
            Object x = aVar.x();
            if (x == a.C0011a.a) {
                x = new xy20(us2Var, us2Var2);
                aVar.R(x);
            }
            xy20 xy20Var = (xy20) x;
            ((zak0) xy20Var.a).setValue(us2Var);
            ((zak0) xy20Var.b).setValue(us2Var2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return xy20Var;
        }
    }

    /* compiled from: ModalCard.kt */
    public static final class b {
        public static final void a(q630 q630Var, py20 py20Var, androidx.compose.runtime.a aVar, int i) {
            int i2;
            androidx.compose.runtime.a M = aVar.M(503416944);
            if ((i & 6) == 0) {
                i2 = (M.J(q630Var) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= M.J(py20Var) ? 32 : 16;
            }
            if (M.t(i2 & 1, (i2 & 19) != 18)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(503416944, i2, -1, "com.vk.core.compose.component.modal.card.ModalCard.Main.ComposeDefaultImpls.Content$default (ModalCard.kt:-1)");
                }
                py20Var.a(q630Var, M, i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new w78(q630Var, py20Var, i, 2);
            }
        }
    }

    public abstract void a(q630 q630Var, androidx.compose.runtime.a aVar, int i);
}
