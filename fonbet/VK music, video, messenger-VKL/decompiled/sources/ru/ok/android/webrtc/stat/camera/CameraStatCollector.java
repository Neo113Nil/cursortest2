package ru.ok.android.webrtc.stat.camera;

import android.os.SystemClock;
import org.webrtc.Size;
import org.webrtc.VideoFrame;
import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.utils.TimedEvent;

@CallInternalApi
/* loaded from: classes9.dex */
public final class CameraStatCollector implements CameraStatProvider {

    @Deprecated
    public static final int LOG_INTERVAL = 10000;

    @Deprecated
    public static final String TAG = "CameraStatCollector";
    public final RTCLog a;
    public final TimedEvent b = new TimedEvent(0.3d);
    public volatile Size c = new Size(0, 0);
    public long d = SystemClock.elapsedRealtime();

    public CameraStatCollector(RTCLog rTCLog) {
        this.a = rTCLog;
    }

    public final RTCLog getLog() {
        return this.a;
    }

    @Override // ru.ok.android.webrtc.stat.camera.CameraStatProvider
    public CameraStat getStat() {
        return new CameraStat((float) this.b.perSecond(), this.c.width, this.c.height);
    }

    public final void onCameraFrame$webrtc_android_sdk_release(VideoFrame videoFrame) {
        this.b.fire();
        this.c = new Size(videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight());
        if (SystemClock.elapsedRealtime() - this.d < 10000) {
            return;
        }
        this.a.log(TAG, toString());
        this.d = SystemClock.elapsedRealtime();
    }

    public String toString() {
        return "fps estimation: " + this.b.perSecond() + ", frame size: " + this.c;
    }
}
