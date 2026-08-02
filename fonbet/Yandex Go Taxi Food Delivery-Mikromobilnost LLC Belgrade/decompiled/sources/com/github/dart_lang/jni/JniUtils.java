package com.github.dart_lang.jni;

/* loaded from: classes10.dex */
public class JniUtils {
    static {
        System.loadLibrary("dartjni");
    }

    public static native Object fromReferenceAddress(long j);
}
