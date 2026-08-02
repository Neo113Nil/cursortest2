package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import ru.ok.android.api.core.ApiInvocationException;

/* compiled from: NotificationSettingsList.kt */
/* loaded from: classes5.dex */
public final class ng70 {
    public static final void a(int i, androidx.compose.runtime.a aVar, List list, izs izsVar, q630 q630Var) {
        androidx.compose.runtime.a M = aVar.M(1940331481);
        int i2 = i | (M.y(list) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.J(q630Var) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1940331481, i2, -1, "com.vk.settings.impl.presentation.base.view.NotificationSettingsList (NotificationSettingsList.kt:21)");
            }
            xvy a = zvy.a(0, 3, M);
            q630 d = txj0.d(q630Var, 1.0f);
            u890 n = s200.n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 7);
            boolean y = M.y(list) | ((i2 & 112) == 32);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                x = new s53(27, list, izsVar);
                M.R(x);
            }
            x1v0.a(d, a, n, null, null, null, false, null, (izs) x, M, 0, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xa10(list, izsVar, q630Var, i, 1);
        }
    }
}
