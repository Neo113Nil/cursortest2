package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: ModalCard.kt */
/* loaded from: classes17.dex */
public abstract class oy20 {

    /* compiled from: ModalCard.kt */
    public static abstract class a {

        /* compiled from: ModalCard.kt */
        /* renamed from: xsna.oy20$a$a, reason: collision with other inner class name */
        public static final class C3478a {
            public static sy20 a(String str, gzs gzsVar, ButtonSize buttonSize, ButtonStyle buttonStyle, ButtonAppearance buttonAppearance, com.vk.core.compose.component.semantics.a aVar, androidx.compose.runtime.a aVar2, int i, int i2) {
                String str2;
                gzs gzsVar2;
                if ((i2 & 4) != 0) {
                    buttonSize = ButtonSize.Large;
                }
                ButtonSize buttonSize2 = buttonSize;
                if ((i2 & 8) != 0) {
                    buttonStyle = ButtonStyle.Primary;
                }
                ButtonStyle buttonStyle2 = buttonStyle;
                if ((i2 & 16) != 0) {
                    buttonAppearance = ButtonAppearance.Accent;
                }
                ButtonAppearance buttonAppearance2 = buttonAppearance;
                com.vk.core.compose.component.semantics.a aVar3 = (i2 & 4096) != 0 ? null : aVar;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(741160699, i, 3072, "com.vk.core.compose.component.modal.card.ModalCard.Buttons.Button.Companion.invoke (ModalCard.kt:202)");
                }
                Object x = aVar2.x();
                if (x == a.C0011a.a) {
                    str2 = str;
                    gzsVar2 = gzsVar;
                    sy20 sy20Var = new sy20(str2, gzsVar2, buttonSize2, buttonStyle2, buttonAppearance2, aVar3);
                    aVar2.R(sy20Var);
                    x = sy20Var;
                } else {
                    str2 = str;
                    gzsVar2 = gzsVar;
                }
                sy20 sy20Var2 = (sy20) x;
                ((zak0) sy20Var2.a).setValue(str2);
                ((zak0) sy20Var2.b).setValue(gzsVar2);
                ((zak0) sy20Var2.c).setValue(buttonSize2);
                ((zak0) sy20Var2.d).setValue(buttonStyle2);
                ((zak0) sy20Var2.e).setValue(buttonAppearance2);
                ((zak0) sy20Var2.f).setValue(null);
                ((zak0) sy20Var2.g).setValue(null);
                ((zak0) sy20Var2.h).setValue(null);
                ((zak0) sy20Var2.i).setValue(null);
                ((zak0) sy20Var2.j).setValue(null);
                ((zak0) sy20Var2.k).setValue(null);
                ((zak0) sy20Var2.l).setValue(null);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return sy20Var2;
            }
        }

        /* compiled from: ModalCard.kt */
        public static final class b {
            public static final void a(q630 q630Var, a aVar, androidx.compose.runtime.a aVar2, int i) {
                int i2;
                androidx.compose.runtime.a M = aVar2.M(1233164582);
                if ((i & 6) == 0) {
                    i2 = (M.J(q630Var) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                int i3 = i2 | (M.J(aVar) ? 32 : 16);
                if (M.t(i3 & 1, (i3 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1233164582, i3, -1, "com.vk.core.compose.component.modal.card.ModalCard.Buttons.Button.ComposeDefaultImpls.Content$default (ModalCard.kt:-1)");
                    }
                    aVar.a(q630Var, M, i3 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    M.h();
                }
                androidx.compose.runtime.f s = M.s();
                if (s != null) {
                    s.d = new aak(q630Var, aVar, i);
                }
            }
        }

        public abstract void a(q630 q630Var, androidx.compose.runtime.a aVar, int i);
    }

    /* compiled from: ModalCard.kt */
    public static final class b {
        public static ty20 a(sy20 sy20Var, sy20 sy20Var2, boolean z, androidx.compose.runtime.a aVar, int i) {
            if ((i & 2) != 0) {
                sy20Var2 = null;
            }
            if ((i & 4) != 0) {
                z = true;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(810603889, 3072, -1, "com.vk.core.compose.component.modal.card.ModalCard.Buttons.Companion.invoke (ModalCard.kt:169)");
            }
            Object x = aVar.x();
            if (x == a.C0011a.a) {
                x = new ty20(sy20Var, sy20Var2, z);
                aVar.R(x);
            }
            ty20 ty20Var = (ty20) x;
            ((zak0) ty20Var.a).setValue(sy20Var);
            ((zak0) ty20Var.b).setValue(sy20Var2);
            ((zak0) ty20Var.c).setValue(Boolean.valueOf(z));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return ty20Var;
        }
    }

    /* compiled from: ModalCard.kt */
    public static final class c {
        public static final void a(q630 q630Var, oy20 oy20Var, androidx.compose.runtime.a aVar, int i) {
            int i2;
            androidx.compose.runtime.a M = aVar.M(1467001748);
            if ((i & 6) == 0) {
                i2 = (M.J(q630Var) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= M.J(oy20Var) ? 32 : 16;
            }
            if (M.t(i2 & 1, (i2 & 19) != 18)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1467001748, i2, -1, "com.vk.core.compose.component.modal.card.ModalCard.Buttons.ComposeDefaultImpls.Content$default (ModalCard.kt:-1)");
                }
                oy20Var.a(q630Var, M, i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new u9z(q630Var, oy20Var, i, 2);
            }
        }
    }

    public abstract void a(q630 q630Var, androidx.compose.runtime.a aVar, int i);
}
