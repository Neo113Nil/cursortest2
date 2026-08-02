package ru.ok.android.webrtc.protocol.screenshare.send;

import ru.ok.android.webrtc.protocol.RtcTransport;
import ru.ok.android.webrtc.protocol.screenshare.send.FrameEncoder;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* loaded from: classes9.dex */
public interface FrameSender extends FrameEncoder.Consumer, FrameEncoder.SenderBackpressure {
    default double fps() {
        return ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
    }

    void release();

    void setTransport(RtcTransport rtcTransport);

    void startSending();

    void stopSending();
}
