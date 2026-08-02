package com.yandex.runtime.sensors.internal.wifi;

import android.net.wifi.WifiManager;
import com.yandex.runtime.Runtime;
import ru.yandex.common.startup.StartupRequest;

/* loaded from: classes2.dex */
public class WifiScanner {
    public static boolean activeScan() {
        return ((WifiManager) Runtime.getApplicationContext().getSystemService(StartupRequest.PARAM_WIFI)).startScan();
    }
}
