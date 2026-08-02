package xsna;

import androidx.compose.runtime.a;
import xsna.d16;
import xsna.z06;

/* compiled from: Onboarding.kt */
/* loaded from: classes7.dex */
public final class ae80 {
    public static final void a(int i, androidx.compose.runtime.a aVar, String str, izs izsVar, q630 q630Var) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1114602064);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1114602064, i2, -1, "com.vk.video.ui.upload.impl.publish.presentation.author.compose.onboarding.Onboarding (Onboarding.kt:14)");
            }
            s3q0 s3q0Var = s3q0.a;
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new zd80(izsVar, null);
                M.R(x);
            }
            bap.g(s3q0Var, (wzs) x, M, 6);
            xl20 a = d16.b.a(null, null, d16.c.b.a.a(str, null, M, (i2 & 14) | 384, 2), null, null, null, null, null, M, 100663296, 250);
            boolean z2 = i3 == 32;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new gr7(izsVar, 5);
                M.R(x2);
            }
            aVar2 = M;
            beu0.a(a, q630Var, null, null, null, null, null, null, z06.b.a.a((gzs) x2, null, null, null, null, null, aVar2, 1572864, 62), null, null, null, aVar2, 48, 0, 3836);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new g6i(str, izsVar, q630Var, i, 1);
        }
    }
}
