package ru.ok.android.webrtc.camera;

import java.util.List;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.Size;
import ru.ok.android.webrtc.RTCLog;
import xsna.bjn0;
import xsna.j5g;
import xsna.odj;

/* loaded from: classes9.dex */
public final class CaptureFormatHelper implements CameraVideoCapturer.CaptureFormatHelper {

    @Deprecated
    public static final String TAG = "CaptureFormatHelper";
    public final RTCLog a;

    public CaptureFormatHelper(RTCLog rTCLog) {
        this.a = rTCLog;
    }

    @Override // org.webrtc.CameraVideoCapturer.CaptureFormatHelper
    public CameraEnumerationAndroid.CaptureFormat.FramerateRange getClosestSupportedFramerateRange(List<? extends CameraEnumerationAndroid.CaptureFormat.FramerateRange> list, int i) {
        CameraEnumerationAndroid.CaptureFormat.FramerateRange closestSupportedFramerateRange = super.getClosestSupportedFramerateRange(list, i);
        bjn0.b("available fps ranges are ", j5g.g0(list, ", ", null, null, 0, null, 62), this.a, TAG);
        this.a.log(TAG, "closest frame rate range for requested " + i + " is " + closestSupportedFramerateRange);
        return closestSupportedFramerateRange;
    }

    @Override // org.webrtc.CameraVideoCapturer.CaptureFormatHelper
    public Size getClosestSupportedSize(List<? extends Size> list, int i, int i2) {
        Size closestSupportedSize = super.getClosestSupportedSize(list, i, i2);
        bjn0.b("available frame sizes are ", j5g.g0(list, ", ", null, null, 0, null, 62), this.a, TAG);
        RTCLog rTCLog = this.a;
        StringBuilder a = odj.a(i, i2, "closest frame size range for requested ", "x", " is ");
        a.append(closestSupportedSize);
        rTCLog.log(TAG, a.toString());
        return closestSupportedSize;
    }
}
