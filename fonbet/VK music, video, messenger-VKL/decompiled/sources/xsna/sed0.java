package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vkontakte.android.R;
import xsna.q630;

/* compiled from: PrivacySettingsAcceptablePointCell.kt */
/* loaded from: classes4.dex */
public final class sed0 {
    public static final void a(final int i, androidx.compose.runtime.a aVar, final String str, final String str2, final String str3, final gzs gzsVar, final boolean z) {
        int i2;
        String str4;
        androidx.compose.runtime.a M = aVar.M(-1292571061);
        if ((i & 6) == 0) {
            i2 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(str3) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1292571061, i2, -1, "com.vk.newsfeed.posting.privacy_picker.presentation.PrivacySettingsAcceptablePointCell (PrivacySettingsAcceptablePointCell.kt:21)");
            }
            com.vk.core.compose.component.cell.content.b0 b0Var = null;
            if (z) {
                M.K(1692617234);
                M.j();
                str4 = null;
            } else {
                str4 = zq.a(M, -915233073, R.string.privacy_settings_select_content_description, M, 0);
            }
            q630 q630Var = q630.a.a;
            if (str2 != null) {
                q630Var = ahn.E(q630Var, str2);
            }
            q630 f = txj0.f(q630Var, 1.0f);
            boolean z2 = (i2 & 14) == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2 || x == c0012a) {
                x = new hvz(gzsVar, 29);
                M.R(x);
            }
            q630 c = ojc.c(f, false, str4, null, (gzs) x, 13);
            boolean z3 = (57344 & i2) == 16384;
            Object x2 = M.x();
            if (z3 || x2 == c0012a) {
                x2 = new vsp(str3, 1);
                M.R(x2);
            }
            com.vk.core.compose.component.cell.content.k0 a = Cell$Middle.a.a(Cell$Middle.d.b.a(str, null, null, 0, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3), null, M, ((i2 >> 6) & 14) | 12582912, 94), null, null, null, M, 196608, 30);
            if (z) {
                M.K(1693200500);
                b0Var = o.e.a.C0736a.a(true, null, false, null, M, 24582, 14);
                M.j();
            } else {
                M.K(1693302459);
                M.j();
            }
            wiu0.b(c, false, null, a, b0Var, null, null, M, 0, 102);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.red0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    sed0.a(ne7.I(i | 1), (androidx.compose.runtime.a) obj, str, str2, str3, gzsVar, z);
                    return s3q0.a;
                }
            };
        }
    }
}
