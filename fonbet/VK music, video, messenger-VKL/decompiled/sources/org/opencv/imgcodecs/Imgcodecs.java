package org.opencv.imgcodecs;

/* loaded from: classes8.dex */
public class Imgcodecs {
    private static native boolean haveImageReader_0(String str);

    private static native boolean haveImageWriter_0(String str);

    private static native long imdecode_0(long j, int i);

    private static native boolean imencode_0(String str, long j, long j2, long j3);

    private static native boolean imencode_1(String str, long j, long j2);

    private static native long imread_0(String str, int i);

    private static native long imread_1(String str);

    private static native boolean imreadmulti_0(String str, long j, int i);

    private static native boolean imreadmulti_1(String str, long j);

    private static native boolean imwrite_0(String str, long j, long j2);

    private static native boolean imwrite_1(String str, long j);
}
