package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vkontakte.android.R;

/* compiled from: ErrorToTextMapper.kt */
/* loaded from: classes18.dex */
public final class zwp {
    public static final tlo0 a(Throwable th) {
        if (th instanceof VKApiExecutionException) {
            VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th;
            if (vKApiExecutionException.x() && !drm0.N(vKApiExecutionException.t())) {
                return oq.d(tlo0.Companion, vKApiExecutionException.t());
            }
        }
        return tq.h(tlo0.Companion, R.string.error);
    }
}
