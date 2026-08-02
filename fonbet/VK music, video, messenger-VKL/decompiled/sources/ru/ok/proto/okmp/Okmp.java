package ru.ok.proto.okmp;

/* loaded from: classes9.dex */
public class Okmp {
    public static void DMN_throwJavaException(SWIGTYPE_p_JNIEnv sWIGTYPE_p_JNIEnv, String str, String str2) {
        OkmpJNI.DMN_throwJavaException(SWIGTYPE_p_JNIEnv.getCPtr(sWIGTYPE_p_JNIEnv), str, str2);
    }

    public static byte[] cdata(SWIGTYPE_p_void sWIGTYPE_p_void, long j) {
        return OkmpJNI.cdata(SWIGTYPE_p_void.getCPtr(sWIGTYPE_p_void), j);
    }

    public static void memmove(SWIGTYPE_p_void sWIGTYPE_p_void, byte[] bArr) {
        OkmpJNI.memmove(SWIGTYPE_p_void.getCPtr(sWIGTYPE_p_void), bArr);
    }
}
