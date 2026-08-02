package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.q630;
import xsna.wra0;
import xsna.zra0;

/* compiled from: DraftsListViewEmpty.kt */
/* loaded from: classes18.dex */
public final class xeo {
    public static final void a(izs<? super sdo, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1501618114);
        int i2 = i | (M.y(izsVar) ? 4 : 2);
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1501618114, i2, -1, "com.vk.draftslist.impl.ui.view.DraftsListViewEmpty (DraftsListViewEmpty.kt:16)");
            }
            q630 E = ahn.E(q630.a.a, "drafts_list_empty_state_placeholder");
            vl20 a = zra0.a.a(d370.N(R.string.newsfeed_empty_drafts, 0, M), null, d370.N(R.string.newsfeed_empty_drafts_description, 0, M), null, M, 196608, 26);
            String N = d370.N(R.string.newsfeed_drafts_create_post, 0, M);
            ButtonSize buttonSize = ButtonSize.Small;
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new ega(izsVar, 3);
                M.R(x);
            }
            aVar2 = M;
            ldv0.d(E, null, a, wra0.b.a(wra0.a.C3954a.a(N, (gzs) x, buttonSize, buttonStyle, buttonAppearance, false, null, null, null, null, null, null, false, false, null, null, aVar2, 28032, 12582912, 131040), null, null, aVar2, 14), null, null, false, aVar2, 6, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new o85(izsVar, i, 5);
        }
    }
}
