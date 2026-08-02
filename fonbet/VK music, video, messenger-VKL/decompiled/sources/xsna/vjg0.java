package xsna;

/* compiled from: RichCellScreenContent.kt */
/* loaded from: classes18.dex */
public final class vjg0 implements ixj {
    public static final vjg0 b = new vjg0();

    @Override // xsna.ixj
    public final void e(yzs<? super Integer, ? super androidx.compose.runtime.a, ? super Integer, s3q0> yzsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1968108740);
        if ((i & 6) == 0) {
            i2 = (M.y(yzsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1968108740, i2, -1, "com.vk.design.demo.presentation.screens.RichCellScreenContent.createMiddleSlot.<anonymous>.<anonymous>.<no name provided>.Content (RichCellScreenContent.kt:519)");
            }
            yzsVar.invoke(9, M, Integer.valueOf(((i2 << 3) & 112) | 6));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new w78(this, yzsVar, i, 4);
        }
    }
}
