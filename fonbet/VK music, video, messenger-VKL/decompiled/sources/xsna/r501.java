package xsna;

import android.content.Context;
import android.content.IntentFilter;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes13.dex */
public final class r501 extends bk01 {
    public r501(Context context) {
        super(new tk01("AppUpdateListenerRegistry"), new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), context);
    }
}
