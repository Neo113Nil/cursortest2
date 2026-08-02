package org.opencv.core;

/* loaded from: classes8.dex */
public class TickMeter {
    public final long a = TickMeter_0();

    private static native long TickMeter_0();

    private static native void delete(long j);

    private static native long getCounter_0(long j);

    private static native double getTimeMicro_0(long j);

    private static native double getTimeMilli_0(long j);

    private static native double getTimeSec_0(long j);

    private static native long getTimeTicks_0(long j);

    private static native void reset_0(long j);

    private static native void start_0(long j);

    private static native void stop_0(long j);

    public final void finalize() throws Throwable {
        delete(this.a);
    }
}
