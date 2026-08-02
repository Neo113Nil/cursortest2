package org.chromium.base.memory;

import android.os.Debug;
import internal.org.jni_zero.CalledByNative;
import java.io.IOException;
import org.chromium.base.Log;

/* loaded from: classes8.dex */
public final class JavaHeapDumpGenerator {
    private static final String TAG = "JavaHprofGenerator";

    private JavaHeapDumpGenerator() {
    }

    @CalledByNative
    public static boolean generateHprof(String str) {
        try {
            Debug.dumpHprofData(str);
            return true;
        } catch (IOException e) {
            Log.i(TAG, "Error writing to file " + str + ". Error: " + e.getMessage());
            return false;
        }
    }
}
