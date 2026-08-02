package xsna;

import com.vk.video.growth.impl.ui.entity.TrapViewState;

/* compiled from: TrapContentView.kt */
/* loaded from: classes6.dex */
public final class jpp0 {
    public static final void a(TrapViewState trapViewState, izs<? super dpp0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-686925173);
        if ((i & 6) == 0) {
            i2 = (M.J(trapViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-686925173, i2, -1, "com.vk.video.growth.impl.ui.view.TrapContentView (TrapContentView.kt:43)");
            }
            rrv0.e(true, null, null, null, null, null, kai.c(-812379154, new iq8(9, trapViewState, izsVar), M), M, 1572870, 62);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new vi1(trapViewState, izsVar, i, 7);
        }
    }
}
