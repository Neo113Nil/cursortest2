package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;

/* compiled from: Button.kt */
/* loaded from: classes17.dex */
public abstract class cp8 {
    public final wh50 a = androidx.compose.runtime.k.b(ButtonSize.Medium);
    public final wh50 b = androidx.compose.runtime.k.b(ButtonStyle.Primary);
    public final wh50 c = androidx.compose.runtime.k.b(ButtonAppearance.Accent);
    public final wh50 d = androidx.compose.runtime.k.b(Boolean.TRUE);

    /* compiled from: Button.kt */
    public static abstract class a extends cp8 {
    }

    /* compiled from: Button.kt */
    public static abstract class b extends cp8 {

        /* compiled from: Button.kt */
        public static final class a {
            public static pqv a(lg90 lg90Var, l5g l5gVar, uco ucoVar, String str, com.vk.core.compose.component.semantics.a aVar, androidx.compose.runtime.a aVar2, int i, int i2) {
                lg90 lg90Var2;
                l5g l5gVar2 = (i2 & 2) != 0 ? null : l5gVar;
                uco ucoVar2 = (i2 & 4) != 0 ? null : ucoVar;
                String str2 = (i2 & 8) != 0 ? null : str;
                com.vk.core.compose.component.semantics.a aVar3 = (i2 & 16) != 0 ? null : aVar;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-541166711, i, -1, "com.vk.core.compose.component.button.Button.Slot.Icon.Companion.invoke (Button.kt:66)");
                }
                int i3 = i << 3;
                int i4 = ((i >> 15) & 14) | 64 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-578131566, i4, -1, "com.vk.core.compose.component.button.remember (IconImpl.kt:64)");
                }
                Object x = aVar2.x();
                if (x == a.C0011a.a) {
                    lg90Var2 = lg90Var;
                    pqv pqvVar = new pqv(lg90Var2, l5gVar2, ucoVar2, str2, aVar3);
                    aVar2.R(pqvVar);
                    x = pqvVar;
                } else {
                    lg90Var2 = lg90Var;
                }
                pqv pqvVar2 = (pqv) x;
                ((zak0) pqvVar2.e).setValue(lg90Var2);
                ((zak0) pqvVar2.f).setValue(l5gVar2);
                ((zak0) pqvVar2.g).setValue(ucoVar2);
                ((zak0) pqvVar2.h).setValue(str2);
                ((zak0) pqvVar2.i).setValue(aVar3);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return pqvVar2;
            }
        }
    }

    /* compiled from: Button.kt */
    public static abstract class c extends cp8 {

        /* compiled from: Button.kt */
        public static final class a {
            public static m2e0 a(l5g l5gVar, pco pcoVar, pco pcoVar2, androidx.compose.runtime.a aVar, int i, int i2) {
                if ((i2 & 1) != 0) {
                    l5gVar = null;
                }
                if ((i2 & 2) != 0) {
                    pcoVar = null;
                }
                if ((i2 & 4) != 0) {
                    pcoVar2 = null;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1022225256, i, -1, "com.vk.core.compose.component.button.Button.Slot.ProgressIndicator.Companion.invoke (Button.kt:109)");
                }
                int i3 = i << 3;
                int i4 = (i3 & 7168) | (i3 & 896) | 6;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-811077421, i4, -1, "com.vk.core.compose.component.button.remember (ProgressIndicatorImpl.kt:60)");
                }
                Object x = aVar.x();
                if (x == a.C0011a.a) {
                    x = new m2e0(l5gVar, pcoVar, pcoVar2);
                    aVar.R(x);
                }
                m2e0 m2e0Var = (m2e0) x;
                ((zak0) m2e0Var.e).setValue(l5gVar);
                ((zak0) m2e0Var.f).setValue(pcoVar);
                ((zak0) m2e0Var.g).setValue(pcoVar2);
                ((zak0) m2e0Var.h).setValue(null);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return m2e0Var;
            }
        }
    }

    /* compiled from: Button.kt */
    public static abstract class d extends cp8 {

        /* compiled from: Button.kt */
        public static final class a {
            public static gio0 a(String str, com.vk.core.compose.component.semantics.a aVar, androidx.compose.runtime.a aVar2, int i, int i2) {
                if ((i2 & 2) != 0) {
                    aVar = null;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1049078006, i, -1, "com.vk.core.compose.component.button.Button.Slot.Text.Companion.invoke (Button.kt:84)");
                }
                int i3 = (i >> 9) & 14;
                int i4 = i << 3;
                int i5 = (i4 & 7168) | i3 | (i4 & 112) | (i4 & 896);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(458625187, i5, -1, "com.vk.core.compose.component.button.remember (TextImpl.kt:48)");
                }
                Object x = aVar2.x();
                if (x == a.C0011a.a) {
                    x = new gio0(str, aVar, null);
                    aVar2.R(x);
                }
                gio0 gio0Var = (gio0) x;
                ((zak0) gio0Var.f).setValue(str);
                ((zak0) gio0Var.g).setValue(aVar);
                ((zak0) gio0Var.e).setValue(null);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return gio0Var;
            }
        }
    }

    public abstract void a(lgu0 lgu0Var, androidx.compose.runtime.a aVar, int i);

    public final void b(ButtonSize buttonSize, ButtonStyle buttonStyle, ButtonAppearance buttonAppearance, boolean z) {
        uh50 C;
        dak0 j = qak0.j();
        uh50 uh50Var = j instanceof uh50 ? (uh50) j : null;
        if (uh50Var == null || (C = uh50Var.C(null, null)) == null) {
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
        }
        try {
            dak0 j2 = C.j();
            try {
                ((zak0) this.a).setValue(buttonSize);
                ((zak0) this.b).setValue(buttonStyle);
                ((zak0) this.c).setValue(buttonAppearance);
                ((zak0) this.d).setValue(Boolean.valueOf(z));
                s3q0 s3q0Var = s3q0.a;
                C.w().a();
            } finally {
                dak0.q(j2);
            }
        } finally {
        }
    }

    public final ButtonSize c() {
        return (ButtonSize) ((zak0) this.a).getValue();
    }

    public final boolean d() {
        return ((Boolean) ((zak0) this.d).getValue()).booleanValue();
    }
}
