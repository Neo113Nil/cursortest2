package xsna;

import xsna.q630;

/* compiled from: PrimaryBlockGoodsShimmerContentImpl.kt */
/* loaded from: classes17.dex */
public final class o8d0 extends czi {
    public final float c;
    public final float d;
    public final wh50 e;
    public final wh50 f;

    public o8d0(int i) {
        super(6);
        this.c = 150;
        this.d = 180;
        this.e = androidx.compose.runtime.k.b(Integer.valueOf(i));
        this.f = androidx.compose.runtime.k.b(null);
    }

    @Override // xsna.i7d0
    public final void a(final int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(2011888916);
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
                androidx.compose.runtime.b.f(2011888916, i2, -1, "com.vk.community.design.compose.primaryblock.PrimaryBlockGoodsShimmerContentImpl.Content (PrimaryBlockGoodsShimmerContentImpl.kt:30)");
            }
            ckv0.a(txj0.f(aVar2, 1.0f), null, kai.c(147858841, new dqg(this, 1), M), M, 384, 2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.n8d0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i | 1);
                    o8d0.this.a(I, (androidx.compose.runtime.a) obj);
                    return s3q0.a;
                }
            };
        }
    }
}
