package xsna;

import androidx.compose.runtime.a;
import xsna.q630;

/* compiled from: AlbumChooseView.kt */
/* loaded from: classes7.dex */
public final class ke1 {
    public static final void a(xe1 xe1Var, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-1724399569);
        if ((i & 6) == 0) {
            i2 = i | (M.J(xe1Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1724399569, i3, -1, "com.vk.video.ui.upload.impl.publish.presentation.albumchoose.compose.screen.AlbumChooseView (AlbumChooseView.kt:35)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getBackground().g;
            q630.a aVar3 = q630.a.a;
            byte b = 0;
            byte b2 = 0;
            aVar2 = M;
            phv0.b(txj0.d(aVar3, 1.0f), kai.c(2009753590, new ae1(izsVar, 0, b), M), kai.c(-261714155, new be1(izsVar, b, b2), M), null, null, 0, j, 0L, kai.c(936536459, new ce1(b2, izsVar, xe1Var), M), aVar2, 805306800, 376);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new de1(i, 0, xe1Var, izsVar, q630Var2);
        }
    }

    public static final void b(int i, int i2, androidx.compose.runtime.a aVar, gzs gzsVar, final xvy xvyVar, final boolean z) {
        androidx.compose.runtime.a M = aVar.M(-841994106);
        int i3 = (M.J(xvyVar) ? 4 : 2) | i2 | (M.y(gzsVar) ? 32 : 16) | (M.l(z) ? 256 : 128) | 3072;
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-841994106, i3, -1, "com.vk.video.ui.upload.impl.publish.presentation.albumchoose.compose.screen.HandlePagination (AlbumChooseView.kt:84)");
            }
            boolean z2 = ((i3 & 14) == 4) | ((i3 & 896) == 256);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2 || x == c0012a) {
                x = bbk0.b(new gzs() { // from class: xsna.xd1
                    @Override // xsna.gzs
                    public final Object invoke() {
                        xvy xvyVar2 = xvy.this;
                        xuy xuyVar = (xuy) j5g.k0(xvyVar2.j().f());
                        return Boolean.valueOf(xuyVar != null && z && xuyVar.getIndex() >= xvyVar2.j().d() + (-5));
                    }
                });
                M.R(x);
            }
            Boolean bool = (Boolean) ((mtk0) x).getValue();
            boolean booleanValue = bool.booleanValue();
            boolean l = M.l(booleanValue) | ((i3 & 112) == 32);
            Object x2 = M.x();
            if (l || x2 == c0012a) {
                x2 = new je1(booleanValue, gzsVar, null);
                M.R(x2);
            }
            bap.g(bool, (wzs) x2, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            i = 5;
        } else {
            M.h();
        }
        int i4 = i;
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new zd1(xvyVar, gzsVar, z, i4, i2, 0);
        }
    }
}
