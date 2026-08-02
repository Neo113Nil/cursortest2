package xsna;

import ru.ok.gl.tf.Tensorflow;
import xsna.q630;

/* compiled from: ColorPickerDialog.kt */
/* loaded from: classes5.dex */
public final class i7g {
    public static final void a(int i, int i2, androidx.compose.runtime.a aVar, izs izsVar, izs izsVar2, q630 q630Var) {
        androidx.compose.runtime.a M = aVar.M(665456387);
        int i3 = (M.o(i) ? 4 : 2) | i2 | (M.y(izsVar) ? 32 : 16) | (M.y(izsVar2) ? 256 : 128) | 3072;
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(665456387, i3, -1, "com.vk.settings.impl.presentation.base.view.ColorPickerDialog (ColorPickerDialog.kt:24)");
            }
            jai c = kai.c(-195446562, new g7g(izsVar, i), M);
            int i4 = ((i3 >> 6) & 14) | Tensorflow.FRAME_WIDTH;
            q630.a aVar2 = q630.a.a;
            p7u0.g(izsVar2, c, aVar2, null, null, M, i4, 24);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = aVar2;
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new h7g(i, i2, izsVar, izsVar2, q630Var);
        }
    }
}
