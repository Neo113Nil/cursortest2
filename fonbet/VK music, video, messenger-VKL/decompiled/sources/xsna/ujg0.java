package xsna;

/* compiled from: RichCellScreenContent.kt */
/* loaded from: classes18.dex */
public final class ujg0 implements wq5<String> {
    public static final ujg0 b = new ujg0();

    @Override // xsna.wq5
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void e(String str, yzs<? super lg90, ? super androidx.compose.runtime.a, ? super Integer, s3q0> yzsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1191382362);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(yzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        int i3 = i2;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1191382362, i3, -1, "com.vk.design.demo.presentation.screens.RichCellScreenContent.createMiddleSlot.<anonymous>.<anonymous>.<no name provided>.Content (RichCellScreenContent.kt:517)");
            }
            if (as.a((i3 & 112) | 8, yzsVar, fwu0.l(str, null, null, null, M, i3 & 14, 62), M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new h7g(i, 3, this, str, yzsVar);
        }
    }
}
