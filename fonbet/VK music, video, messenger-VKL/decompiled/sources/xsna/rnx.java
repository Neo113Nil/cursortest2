package xsna;

import androidx.compose.runtime.a;
import com.vkontakte.android.R;

/* compiled from: InternetErrorWithRetry.kt */
/* loaded from: classes4.dex */
public final class rnx {
    public static final void a(izs<? super kqc0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-386301437);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-386301437, i2, -1, "com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.feature.posting.error.InternetErrorWithRetryContent (InternetErrorWithRetry.kt:9)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2039266880, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-GlobeCrossOutline56> (VkSdkIcons.kt:998)");
            }
            lg90 a = pg90.a(R.drawable.vk_icon_globe_cross_outline_56, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new h74(izsVar, 3);
                M.R(x);
            }
            qz20.a(null, R.string.posting_author_selection_error_title, R.string.posting_author_selection_error_retry, a, 0L, (gzs) x, M, 4096);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new h36(izsVar, i, 1);
        }
    }
}
