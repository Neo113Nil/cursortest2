package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.button.tool.ToolButton$Appearance;
import com.vk.core.compose.component.button.tool.ToolButton$Mode;

/* compiled from: ToolButton.kt */
/* loaded from: classes17.dex */
public abstract class p2p0 {
    public final wh50 a = androidx.compose.runtime.k.b(ToolButton$Mode.Primary);
    public final wh50 b = androidx.compose.runtime.k.b(ToolButton$Appearance.Accent);
    public final wh50 c = androidx.compose.runtime.k.b(Boolean.TRUE);

    /* compiled from: ToolButton.kt */
    public static abstract class a extends p2p0 {

        /* compiled from: ToolButton.kt */
        /* renamed from: xsna.p2p0$a$a, reason: collision with other inner class name */
        public static final class C3488a {
            public static kqv a(lg90 lg90Var, uco ucoVar, androidx.compose.runtime.a aVar, int i) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1812569081, i, -1, "com.vk.core.compose.component.button.tool.ToolButton.Slot.Icon.Companion.invoke (ToolButton.kt:53)");
                }
                int i2 = ((i >> 15) & 14) | 64;
                int i3 = i << 3;
                int i4 = (i3 & 458752) | i2 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1253601056, i4, -1, "com.vk.core.compose.component.button.tool.remember (IconImpl.kt:62)");
                }
                Object x = aVar.x();
                if (x == a.C0011a.a) {
                    x = new kqv(lg90Var, ucoVar);
                    aVar.R(x);
                }
                kqv kqvVar = (kqv) x;
                ((zak0) kqvVar.d).setValue(lg90Var);
                ((zak0) kqvVar.e).setValue(null);
                ((zak0) kqvVar.f).setValue(ucoVar);
                ((zak0) kqvVar.g).setValue(null);
                ((zak0) kqvVar.h).setValue(null);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return kqvVar;
            }
        }
    }

    /* compiled from: ToolButton.kt */
    public static abstract class b extends p2p0 {
    }

    public final void a(ToolButton$Mode toolButton$Mode, ToolButton$Appearance toolButton$Appearance, boolean z) {
        uh50 C;
        dak0 j = qak0.j();
        uh50 uh50Var = j instanceof uh50 ? (uh50) j : null;
        if (uh50Var == null || (C = uh50Var.C(null, null)) == null) {
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
        }
        try {
            dak0 j2 = C.j();
            try {
                ((zak0) this.a).setValue(toolButton$Mode);
                ((zak0) this.b).setValue(toolButton$Appearance);
                ((zak0) this.c).setValue(Boolean.valueOf(z));
                s3q0 s3q0Var = s3q0.a;
                C.w().a();
            } finally {
                dak0.q(j2);
            }
        } finally {
        }
    }
}
