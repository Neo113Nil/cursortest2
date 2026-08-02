package xsna;

import android.os.Bundle;
import android.os.Process;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: com.google.android.play:review@@2.0.0 */
/* loaded from: classes13.dex */
public final class zg01 {
    public static final HashMap a;

    static {
        new HashSet(Arrays.asList("native", PluginErrorDetails.Platform.UNITY));
        a = new HashMap();
        sl9.c(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat("PlayCoreVersion");
    }

    public static Bundle a() {
        HashMap hashMap;
        Bundle bundle = new Bundle();
        synchronized (zg01.class) {
            hashMap = a;
            hashMap.put("java", 11004);
        }
        bundle.putInt("playcore_version_code", ((Integer) hashMap.get("java")).intValue());
        if (hashMap.containsKey("native")) {
            bundle.putInt("playcore_native_version", ((Integer) hashMap.get("native")).intValue());
        }
        if (hashMap.containsKey(PluginErrorDetails.Platform.UNITY)) {
            bundle.putInt("playcore_unity_version", ((Integer) hashMap.get(PluginErrorDetails.Platform.UNITY)).intValue());
        }
        return bundle;
    }
}
