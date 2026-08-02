package defpackage;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import kotlin.collections.b;

/* loaded from: classes10.dex */
public final class pi20 extends e530 implements fud, v0y {
    @Override // defpackage.v0y
    public final aa10 e(k kVar, x910 x910Var, long j) {
        boolean z = isAttached() && ((Boolean) npb1.c(this, j8w.a)).booleanValue();
        long j2 = j8w.b;
        o l0 = x910Var.l0(j);
        int i = l0.a;
        if (z) {
            i = Math.max(i, kVar.f0(c8m.b(j2)));
        }
        int i2 = l0.b;
        if (z) {
            i2 = Math.max(i2, kVar.f0(c8m.a(j2)));
        }
        return kVar.w(i, i2, b.f(), new h2w(i, l0, i2, 2));
    }
}
