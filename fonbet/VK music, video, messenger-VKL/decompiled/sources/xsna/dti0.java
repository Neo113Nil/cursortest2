package xsna;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.util.Base64;

/* compiled from: SessionDataStoreConfigs.kt */
/* loaded from: classes.dex */
public final class dti0 {
    public static final String a;
    public static final String b;

    static {
        String processName;
        if (Build.VERSION.SDK_INT > 33) {
            processName = Process.myProcessName();
        } else {
            processName = Application.getProcessName();
            if (processName == null && (processName = ahd0.a()) == null) {
                processName = "";
            }
        }
        String encodeToString = Base64.encodeToString(processName.getBytes(emb.b), 10);
        a = zr.a("firebase_session_", encodeToString, "_data");
        b = zr.a("firebase_session_", encodeToString, "_settings");
    }
}
