package xsna;

import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.q630;

/* compiled from: LeftNotificationIconImpl.kt */
/* loaded from: classes17.dex */
public final class xzy implements f16 {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;

    public xzy(lg90 lg90Var, long j, long j2, String str, SemanticsConfiguration semanticsConfiguration) {
        this.a = androidx.compose.runtime.k.b(lg90Var);
        this.b = zy60.d(j);
        this.c = androidx.compose.runtime.k.b(new uco(j2));
        this.d = androidx.compose.runtime.k.b(str);
        this.e = androidx.compose.runtime.k.b(semanticsConfiguration);
    }

    @Override // xsna.f16
    public final void a(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-880641196);
        int i2 = (M.J(this) ? 32 : 16) | i;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-880641196, i2, -1, "com.vk.core.compose.component.banner.LeftNotificationIconImpl.Content (LeftNotificationIconImpl.kt:32)");
            }
            SemanticsConfiguration semanticsConfiguration = (SemanticsConfiguration) ((zak0) this.e).getValue();
            q630.a aVar2 = q630.a.a;
            q630 b = com.vk.core.compose.component.semantics.b.b(aVar2, semanticsConfiguration);
            wh50 wh50Var = this.c;
            if (!uco.a(((uco) ((zak0) wh50Var).getValue()).a, 9205357640488583168L)) {
                b = b.g(txj0.r(((uco) ((zak0) wh50Var).getValue()).a, aVar2));
            }
            vqv.a((lg90) ((zak0) this.a).getValue(), (String) ((zak0) this.d).getValue(), b, ((l5g) ((zak0) this.b).getValue()).a, M, 8, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new fne(this, i, 6);
        }
    }
}
