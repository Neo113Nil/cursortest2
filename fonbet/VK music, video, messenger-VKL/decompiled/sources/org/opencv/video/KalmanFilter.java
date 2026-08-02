package org.opencv.video;

/* loaded from: classes8.dex */
public class KalmanFilter {
    public final long a = KalmanFilter_3();

    private static native long KalmanFilter_0(int i, int i2, int i3, int i4);

    private static native long KalmanFilter_1(int i, int i2, int i3);

    private static native long KalmanFilter_2(int i, int i2);

    private static native long KalmanFilter_3();

    private static native long correct_0(long j, long j2);

    private static native void delete(long j);

    private static native long get_controlMatrix_0(long j);

    private static native long get_errorCovPost_0(long j);

    private static native long get_errorCovPre_0(long j);

    private static native long get_gain_0(long j);

    private static native long get_measurementMatrix_0(long j);

    private static native long get_measurementNoiseCov_0(long j);

    private static native long get_processNoiseCov_0(long j);

    private static native long get_statePost_0(long j);

    private static native long get_statePre_0(long j);

    private static native long get_transitionMatrix_0(long j);

    private static native long predict_0(long j, long j2);

    private static native long predict_1(long j);

    private static native void set_controlMatrix_0(long j, long j2);

    private static native void set_errorCovPost_0(long j, long j2);

    private static native void set_errorCovPre_0(long j, long j2);

    private static native void set_gain_0(long j, long j2);

    private static native void set_measurementMatrix_0(long j, long j2);

    private static native void set_measurementNoiseCov_0(long j, long j2);

    private static native void set_processNoiseCov_0(long j, long j2);

    private static native void set_statePost_0(long j, long j2);

    private static native void set_statePre_0(long j, long j2);

    private static native void set_transitionMatrix_0(long j, long j2);

    public final void finalize() throws Throwable {
        delete(this.a);
    }
}
