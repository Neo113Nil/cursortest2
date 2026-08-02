package androidx.media3.common.util;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import defpackage.c260;

/* loaded from: classes10.dex */
final class NetworkTypeObserver$Api31$DisplayInfoCallback extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    private final c260 instance;

    public NetworkTypeObserver$Api31$DisplayInfoCallback(c260 c260Var) {
        this.instance = c260Var;
    }

    public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType;
        overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        this.instance.c(overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
    }
}
