package xsna;

import androidx.compose.runtime.a;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.q630;

/* compiled from: AutoLockTimePickerView.kt */
/* loaded from: classes15.dex */
public final class tg5 {
    public static final void a(int i, androidx.compose.runtime.a aVar, List list, izs izsVar, q630 q630Var) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1172647014);
        int i2 = i | (M.y(list) ? 4 : 2) | (M.y(izsVar) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) != 130)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1172647014, i2, -1, "com.vk.biometrics.lock.impl.presentation.base.view.AutoLockTimePickerView (AutoLockTimePickerView.kt:24)");
            }
            boolean y = M.y(list) | ((i2 & 896) == 256);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                x = new ng5(0, list, izsVar);
                M.R(x);
            }
            lqy.a(null, null, null, null, null, null, false, null, (izs) x, M, 0, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = q630.a.a;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new og5(list, q630Var2, izsVar, i, 0);
        }
    }
}
