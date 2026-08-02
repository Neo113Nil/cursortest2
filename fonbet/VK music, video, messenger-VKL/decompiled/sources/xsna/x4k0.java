package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import one.video.transform.TransformController;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: SmartCropPlayer.kt */
/* loaded from: classes7.dex */
public final class x4k0 {
    public static final void a(y4k0 y4k0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1808321974);
        int i2 = (M.J(y4k0Var) ? 4 : 2) | i | (M.J(q630Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1808321974, i2, -1, "com.vk.video.ui.smartcrop.impl.presentation.compose.player.SmartCropPlayer (SmartCropPlayer.kt:22)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new TransformController(null);
                M.R(x);
            }
            TransformController transformController = (TransformController) x;
            q630 f = txj0.f(sua.d(1.7777778f, q630Var, false), 1.0f);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            boolean y = M.y(transformController);
            Object x2 = M.x();
            if (y || x2 == c0012a) {
                x2 = new r8a0(transformController, 23);
                M.R(x2);
            }
            izs izsVar = (izs) x2;
            int i3 = i2 & 14;
            boolean y2 = (i3 == 4) | M.y(transformController);
            Object x3 = M.x();
            if (y2 || x3 == c0012a) {
                x3 = new d50(27, y4k0Var, transformController);
                M.R(x3);
            }
            ae2.a(0, 2, M, izsVar, (izs) x3, null);
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = new d220(16);
                M.R(x4);
            }
            izs izsVar2 = (izs) x4;
            q630 d2 = txj0.d(q630.a.a, 1.0f);
            boolean z = i3 == 4;
            Object x5 = M.x();
            if (z || x5 == c0012a) {
                x5 = new ba40(y4k0Var, 27);
                M.R(x5);
            }
            ae2.a(54, 0, M, izsVar2, (izs) x5, d2);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ne4(y4k0Var, q630Var, i, 4);
        }
    }
}
