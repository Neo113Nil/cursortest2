package xsna;

/* compiled from: StatusContent.kt */
/* loaded from: classes18.dex */
public final class gzk0 {
    public final wh50 a;

    public gzk0(String str) {
        this.a = androidx.compose.runtime.k.b(str);
    }

    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1194878536);
        int i2 = (M.J(q630Var) ? 4 : 2) | i | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1194878536, i2, -1, "com.vk.ecomm.design.compose.tile.impl.image.StatusContent.Content (StatusContent.kt:27)");
            }
            float f = 6;
            float f2 = 4;
            aVar2 = M;
            yqv0.c((String) ((zak0) this.a).getValue(), ahn.E(s200.G(hr80.m(q630Var, wlb0.h(M).j().a, vog0.b(f)), f, f2, f, f2), "product_item_status_above_image"), wlb0.h(M).getText().d, null, null, 0, 3, null, 2, false, 0, 1, null, wlb0.l(M).s0, aVar2, 100663296, 48, 5816);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new at0(this, q630Var, i, 7);
        }
    }
}
