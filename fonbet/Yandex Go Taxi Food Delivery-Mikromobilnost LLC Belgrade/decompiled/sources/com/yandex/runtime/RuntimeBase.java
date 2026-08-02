package com.yandex.runtime;

import java.util.Map;

/* loaded from: classes7.dex */
public class RuntimeBase {
    public static native String getVersion();

    public static native int onDartVMCreated();

    public static native void onDetachedFromEngine(int i);

    public static native void setFailedAssertionListener(FailedAssertionListener failedAssertionListener);

    public static native void setPreinitializationOptions(Map<String, String> map);

    public static native void setSwallowedExceptionListener(SwallowedExceptionListener swallowedExceptionListener);
}
