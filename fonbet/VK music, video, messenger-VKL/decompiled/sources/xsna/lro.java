package xsna;

import com.vkontakte.android.R;
import xsna.py20;
import xsna.qy20;

/* compiled from: DzenArticleInfoDialog.kt */
/* loaded from: classes18.dex */
public final class lro {
    public static final void a(us2 us2Var, gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1780241745);
        int i2 = (M.J(us2Var) ? 4 : 2) | i | (M.y(gzsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1780241745, i2, -1, "com.vk.dzenarticle.impl.ui.view.DzenArticleInfoDialog (DzenArticleInfoDialog.kt:15)");
            }
            qzu0.a.getClass();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-103481350, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-LogoDzenColor56> (VkIcons.kt:6860)");
            }
            lg90 a = pg90.a(R.drawable.vk_icon_logo_dzen_color_56, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            b5v0.a(gzsVar, null, qy20.c.a.a(a, 0L, null, M, 6), py20.a.b(ws2.e(d370.N(R.string.dzen_article_info_title, 0, M)), us2Var, M, ((i2 << 3) & 112) | 384), null, null, false, false, null, M, (i2 >> 3) & 14, 498);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wbi(us2Var, gzsVar, i, 3);
        }
    }
}
