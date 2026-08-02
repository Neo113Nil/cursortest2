package org.tensorflow.lite;

/* loaded from: classes8.dex */
public final class TensorFlowLite {
    public static final UnsatisfiedLinkError a;
    public static volatile boolean b = false;

    static {
        try {
            System.loadLibrary("tensorflowlite_jni");
            e = null;
        } catch (UnsatisfiedLinkError e) {
            e = e;
        }
        a = e;
    }

    public static void a() {
        if (b) {
            return;
        }
        try {
            nativeRuntimeVersion();
            b = true;
        } catch (UnsatisfiedLinkError e) {
            e = e;
            UnsatisfiedLinkError unsatisfiedLinkError = a;
            if (unsatisfiedLinkError != null) {
                e = unsatisfiedLinkError;
            }
            throw new UnsatisfiedLinkError("Failed to load native TensorFlow Lite methods. Check that the correct native libraries are present, and, if using a custom native library, have been properly loaded via System.loadLibrary():\n  " + e);
        }
    }

    public static native String nativeRuntimeVersion();

    public static native String nativeSchemaVersion();
}
