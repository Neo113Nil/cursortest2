package xsna;

import xsna.q630;

/* compiled from: PrimaryBlockServicesTileShimmerContentImpl.kt */
/* loaded from: classes17.dex */
public final class g9d0 extends de {
    public final wh50 d;
    public final float b = 150;
    public final float c = 168;
    public final wh50 e = androidx.compose.runtime.k.b(null);

    public g9d0(int i) {
        this.d = androidx.compose.runtime.k.b(Integer.valueOf(i));
    }

    @Override // xsna.i7d0
    public final void a(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(170759946);
        int i3 = i & 6;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 = (M.J(aVar2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(170759946, i2, -1, "com.vk.community.design.compose.primaryblock.PrimaryBlockServicesTileShimmerContentImpl.Content (PrimaryBlockServicesTileShimmerContentImpl.kt:30)");
            }
            ckv0.a(txj0.f(aVar2, 1.0f), null, kai.c(-1645546801, new ljj(this, 3), M), M, 384, 2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new sbo(this, i);
        }
    }
}
