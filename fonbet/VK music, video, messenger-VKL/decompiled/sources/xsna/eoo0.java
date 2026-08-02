package xsna;

import androidx.compose.runtime.a;
import xsna.q630;

/* compiled from: TextWithSuffixLayout.kt */
/* loaded from: classes3.dex */
public final class eoo0 {
    public static final void a(final String str, final frv0 frv0Var, final int i, final jai jaiVar, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        jai jaiVar2;
        androidx.compose.runtime.a M = aVar.M(-1296025121);
        if ((i2 & 6) == 0) {
            i3 = (M.J(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.J(frv0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.o(i) ? 256 : 128;
        }
        int i4 = i2 & 3072;
        q630.a aVar2 = q630.a.a;
        if (i4 == 0) {
            i3 |= M.J(aVar2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            jaiVar2 = jaiVar;
            i3 |= M.y(jaiVar2) ? 16384 : 8192;
        } else {
            jaiVar2 = jaiVar;
        }
        if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1296025121, i3, -1, "com.vk.libvideo.tool.compose.textwithsuffix.TextWithSuffixLayout (TextWithSuffixLayout.kt:58)");
            }
            wjo0 a = xjo0.a(0, 1, M);
            q630 B = txj0.B(aVar2, null, 3);
            boolean J = ((i3 & 14) == 4) | ((i3 & 112) == 32) | M.J(a) | ((i3 & 896) == 256) | ((i3 & 57344) == 16384);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                p050 p050Var = new p050(frv0Var, a, str, i, jaiVar2);
                M.R(p050Var);
                x = p050Var;
            }
            xtm0.a(B, (wzs) x, M, 0, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.doo0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    eoo0.a(str, frv0Var, i, jaiVar, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
