package org.chromium.base.version_info;

import internal.org.jni_zero.CalledByNative;

/* loaded from: classes8.dex */
public class VersionConstantsBridge {

    public interface Natives {
        void nativeSetChannel(int i);
    }

    @CalledByNative
    public static int getChannel() {
        return 0;
    }

    public static void setChannel(int i) {
        VersionConstantsBridgeJni.get().nativeSetChannel(i);
    }
}
