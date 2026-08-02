package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;

/* compiled from: Album.kt */
/* loaded from: classes7.dex */
public final class zi1 {
    public static final void a(rl1 rl1Var, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1454273329);
        int i2 = i | (M.J(rl1Var) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | 384;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1454273329, i2, -1, "com.vk.video.ui.upload.impl.publish.presentation.albumchoose.compose.album.Album (Album.kt:20)");
            }
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar2 = q630.a.a;
            q630 c = qri.c(M, aVar2);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            ty6.b bVar = dt1.a.l;
            gor0 gor0Var = new gor0(bVar);
            String str = rl1Var.c;
            boolean z = rl1Var.a;
            boolean z2 = true;
            boolean z3 = rl1Var.b;
            boolean z4 = (i2 & 112) == 32;
            if ((i2 & 14) != 4) {
                z2 = false;
            }
            boolean z5 = z4 | z2;
            Object x = M.x();
            if (z5 || x == a.C0011a.a) {
                x = new defpackage.f0(3, izsVar, rl1Var);
                M.R(x);
            }
            eku0.d(str, (gzs) x, gor0Var, z3, null, z, false, M, 0, 80);
            gor0 gor0Var2 = new gor0(bVar);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1519174268, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Lock16> (VkSdkIcons.kt:2148)");
            }
            lg90 b = or.b(M, 1650386415, R.drawable.vk_icon_lock_16, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            pzu0.b(b, null, gor0Var2, 0L, M, 56, 8);
            M = M;
            M.G();
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
            s.d = new yi1(i, 0, rl1Var, izsVar, q630Var2);
        }
    }
}
