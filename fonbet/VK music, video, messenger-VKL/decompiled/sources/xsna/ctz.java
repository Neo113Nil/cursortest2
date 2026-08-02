package xsna;

import androidx.compose.runtime.a;
import com.vkontakte.android.R;

/* compiled from: LoadingErrorContent.kt */
/* loaded from: classes4.dex */
public final class ctz {
    public static final void a(izs<? super kqc0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1662348140);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1662348140, i2, -1, "com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.feature.posting.error.LoadingErrorContent (LoadingErrorContent.kt:9)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1223610404, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ErrorOutline56> (VkSdkIcons.kt:814)");
            }
            lg90 a = pg90.a(R.drawable.vk_icon_error_outline_56, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new z87(izsVar, 6);
                M.R(x);
            }
            qz20.a(null, R.string.posting_author_selection_general_error_title, R.string.posting_author_selection_error_close, a, 0L, (gzs) x, M, 4096);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new btz(izsVar, i, 0);
        }
    }
}
