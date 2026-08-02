package ru.ok.android.webrtc.enumerator;

import android.content.Context;
import org.webrtc.Camera2Enumerator;
import org.webrtc.CameraEnumerator;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.enumerator.base.BaseCameraEnumeratorHandler;

/* loaded from: classes9.dex */
public final class Camera2EnumeratorHandlerImpl extends BaseCameraEnumeratorHandler {
    public final Camera2Enumerator c;

    public Camera2EnumeratorHandlerImpl(RTCLog rTCLog, Context context) {
        super(rTCLog);
        this.c = new Camera2Enumerator(context);
    }

    @Override // ru.ok.android.webrtc.enumerator.base.BaseCameraEnumeratorHandler
    public CameraEnumerator getEnumerator() {
        return this.c;
    }
}
