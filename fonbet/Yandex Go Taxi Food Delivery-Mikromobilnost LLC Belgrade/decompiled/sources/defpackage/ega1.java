package defpackage;

import android.os.Process;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes11.dex */
public abstract class ega1 {
    public static final HashMap a;

    static {
        new HashSet(Arrays.asList("native", PluginErrorDetails.Platform.UNITY));
        a = new HashMap();
        Process.myUid();
        Process.myPid();
    }
}
