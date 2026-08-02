package xsna;

import com.vk.core.compose.component.banner.Banner$BackgroundMode;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.d16;
import xsna.q630;

/* compiled from: PlainDescriptionImpl.kt */
/* loaded from: classes17.dex */
public final class vsa0 extends d16.c.b {
    public final wh50 b;
    public final wh50 c;

    public vsa0(us2 us2Var, SemanticsConfiguration semanticsConfiguration) {
        this.b = androidx.compose.runtime.k.b(us2Var);
        this.c = androidx.compose.runtime.k.b(semanticsConfiguration);
    }

    @Override // xsna.d16.c
    public final void a(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-289520076);
        int i2 = (M.J(this) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-289520076, i2, -1, "com.vk.core.compose.component.banner.PlainDescriptionImpl.Content (PlainDescriptionImpl.kt:23)");
            }
            aVar2 = M;
            ntu0.c((us2) ((zak0) this.b).getValue(), com.vk.core.compose.component.semantics.b.b(q630.a.a, (SemanticsConfiguration) ((zak0) this.c).getValue()), tdu0.d(M), tdu0.c((Banner$BackgroundMode) ((zak0) this.a).getValue(), M), 0, false, false, false, null, 0, null, 0, null, aVar2, 0, 0, 8112);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new bt3(this, i, 12);
        }
    }
}
