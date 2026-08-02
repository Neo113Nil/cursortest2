package xsna;

import androidx.compose.runtime.a;
import com.vkontakte.android.R;
import xsna.q630;

/* compiled from: DownloadingIndication.kt */
/* loaded from: classes3.dex */
public final class hco {

    /* compiled from: DownloadingIndication.kt */
    public static final class a implements yzs<bi40, androidx.compose.runtime.a, Integer, l5g> {
        public static final a b = new a();

        @Override // xsna.yzs
        public final l5g invoke(bi40 bi40Var, androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            aVar2.K(1801902070);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1801902070, intValue, -1, "com.vk.music.ui.search.history.DownloadingIndication.<anonymous> (DownloadingIndication.kt:20)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.b().b;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return com.vk.movika.sdk.android.defaultplayer.interactive.c.c(j, aVar2);
        }
    }

    public static final void a(bi40 bi40Var, androidx.compose.runtime.a aVar, int i) {
        bi40 bi40Var2;
        androidx.compose.runtime.a M = aVar.M(8406909);
        int i2 = (M.J(bi40Var) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(8406909, i2, -1, "com.vk.music.ui.search.history.DownloadingIndication (DownloadingIndication.kt:14)");
            }
            q630 q = txj0.q(q630.a.a, r490.d(R.dimen.search_history_icons_size, M));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1899616736, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowDownCircle16> (VkSdkIcons.kt:96)");
            }
            lg90 a2 = pg90.a(R.drawable.vk_icon_arrow_down_circle_16, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new qt(26);
                M.R(x);
            }
            bi40Var2 = bi40Var;
            ki40.a(bi40Var2, a2, a.b, (izs) x, q, null, true, M, (i2 & 14) | 1576000, 32);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            bi40Var2 = bi40Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new com.vk.movika.tools.controls.seekbar.l(bi40Var2, i, 7);
        }
    }
}
