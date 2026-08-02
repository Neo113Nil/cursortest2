package ru.ok.android.webrtc.enumerator;

import org.webrtc.Camera1Enumerator;
import org.webrtc.CameraEnumerator;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.enumerator.base.BaseCameraEnumeratorHandler;

/* loaded from: classes9.dex */
public final class Camera1EnumeratorHandlerImpl extends BaseCameraEnumeratorHandler {
    public final Camera1Enumerator c;

    public Camera1EnumeratorHandlerImpl(RTCLog rTCLog, boolean z) {
        super(rTCLog);
        this.c = new Camera1Enumerator(z);
    }

    @Override // ru.ok.android.webrtc.enumerator.base.BaseCameraEnumeratorHandler
    public CameraEnumerator getEnumerator() {
        return this.c;
    }
}
