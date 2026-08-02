package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.Window;

/* loaded from: classes10.dex */
public final class mqh {
    public static long a(View view) {
        if (udq0.e < 0) {
            Window window = (view != null ? view.getContext() : null) instanceof Activity ? ((Activity) view.getContext()).getWindow() : null;
            float f = 60.0f;
            float refreshRate = window != null ? window.getWindowManager().getDefaultDisplay().getRefreshRate() : 60.0f;
            if (refreshRate >= 30.0f && refreshRate <= 200.0f) {
                f = refreshRate;
            }
            udq0.e = (long) ((1000.0f / f) * 1000000.0f);
        }
        return udq0.e;
    }
}
