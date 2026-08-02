package xsna;

import androidx.compose.runtime.a;
import xsna.q630;

/* compiled from: Modal.kt */
/* loaded from: classes7.dex */
public final class yz20 {
    public static final void a(p230 p230Var, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-544045502);
        if ((i & 6) == 0) {
            i2 = i | (M.J(p230Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-544045502, i3, -1, "com.vk.video.ui.upload.impl.publish.presentation.author.compose.modal.Modal (Modal.kt:37)");
            }
            q630.a aVar2 = q630.a.a;
            q630 E = ahn.E(n34.t(txj0.f(aVar2, 1.0f), dz5.I(0, 1, M, false), null), "ModalTags.AUTHORS_LIST");
            boolean z = ((i3 & 14) == 4) | ((i3 & 112) == 32);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new com.vk.libvideo.b(19, p230Var, izsVar);
                M.R(x);
            }
            x1v0.a(E, null, null, null, null, null, false, null, (izs) x, M, 0, 510);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new bg4(p230Var, izsVar, q630Var2, i, 2);
        }
    }
}
