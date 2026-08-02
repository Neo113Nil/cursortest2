package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;

/* compiled from: ColorContent.kt */
/* loaded from: classes17.dex */
public final class v5g implements efj {
    public final wh50 a;
    public final wh50 b = androidx.compose.runtime.k.b(null);

    /* compiled from: ColorContent.kt */
    public static final class a {
        public static v5g a(long j, androidx.compose.runtime.a aVar) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1436572690, 384, -1, "com.vk.core.compose.component.image.content.ColorContent.Companion.invoke (ColorContent.kt:41)");
            }
            Object x = aVar.x();
            if (x == a.C0011a.a) {
                x = new v5g(j);
                aVar.R(x);
            }
            v5g v5gVar = (v5g) x;
            ((zak0) v5gVar.a).setValue(new l5g(j));
            ((zak0) v5gVar.b).setValue(null);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return v5gVar;
        }
    }

    public v5g(long j) {
        this.a = zy60.d(j);
    }

    @Override // xsna.efj
    public final void a(int i, long j, androidx.compose.runtime.a aVar, q630 q630Var) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(109063288);
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
                androidx.compose.runtime.b.f(109063288, i2, -1, "com.vk.core.compose.component.image.content.ColorContent.invoke (ColorContent.kt:27)");
            }
            f9t.e(hr80.m(txj0.d(com.vk.core.compose.component.semantics.b.b(q630Var, (SemanticsConfiguration) ((zak0) this.b).getValue()), 1.0f), ((l5g) ((zak0) this.a).getValue()).a, androidx.compose.ui.graphics.e.a), M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new u5g(this, j, q630Var, i);
        }
    }
}
