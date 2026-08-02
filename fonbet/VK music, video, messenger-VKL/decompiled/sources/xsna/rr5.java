package xsna;

import java.util.List;
import xsna.q630;

/* compiled from: AvatarImpl.kt */
/* loaded from: classes17.dex */
public final class rr5 implements snj {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 f;
    public final wh50 h;
    public final wh50 e = androidx.compose.runtime.k.b(Boolean.TRUE);
    public final wh50 g = androidx.compose.runtime.k.b(null);

    public rr5(rco0 rco0Var, float f, List list, k18 k18Var, z190 z190Var, wzs wzsVar) {
        this.a = androidx.compose.runtime.k.b(rco0Var);
        this.b = cq.f(f);
        this.c = androidx.compose.runtime.k.b(new wow(list));
        this.d = androidx.compose.runtime.k.b(k18Var);
        this.f = androidx.compose.runtime.k.b(z190Var);
        this.h = androidx.compose.runtime.k.b(wzsVar);
    }

    @Override // xsna.snj, xsna.unj
    public final void a(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1243845926);
        q630.a aVar2 = q630.a.a;
        int i2 = (M.J(aVar2) ? 32 : 16) | i | (M.J(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1243845926, i2, -1, "com.vk.core.compose.component.context.menu.AvatarImpl.Content (AvatarImpl.kt:43)");
            }
            ldu0.a((efj) ((zak0) this.a).getValue(), ((pco) ((zak0) this.b).getValue()).b, ((wow) ((zak0) this.c).getValue()).b, aVar2, (k18) ((zak0) this.d).getValue(), false, (z190) ((zak0) this.f).getValue(), (gzs) ((zak0) this.g).getValue(), (wzs) ((zak0) this.h).getValue(), M, (i2 << 6) & 7168, 32);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new u70(this, i, 1);
        }
    }
}
