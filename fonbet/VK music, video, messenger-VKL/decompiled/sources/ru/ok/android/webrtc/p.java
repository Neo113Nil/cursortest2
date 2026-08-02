package ru.ok.android.webrtc;

import java.util.Iterator;
import ru.ok.android.webrtc.CameraCapturerAdapter;
import ru.ok.android.webrtc.LocalMediaStreamSource;
import ru.ok.android.webrtc.mediarecord.VideoRecord;
import xsna.zy60;

/* loaded from: classes9.dex */
public final class p implements VideoRecord.EventListener {
    public final /* synthetic */ LocalMediaStreamAdapter a;

    public p(LocalMediaStreamAdapter localMediaStreamAdapter) {
        this.a = localMediaStreamAdapter;
    }

    public final void a(boolean z, boolean z2) {
        this.a.n.log("OKRTCLmsAdapter", zy60.c("capture state changed, isCapturing=", ", isFailedStart=", z, z2));
        CameraCapturerAdapter cameraCapturerAdapter = this.a.r;
        if (cameraCapturerAdapter != null) {
            if (z) {
                Iterator it = cameraCapturerAdapter.f.iterator();
                while (it.hasNext()) {
                    ((CameraCapturerAdapter.EventListener) it.next()).onCameraCapturerStreamStarted();
                }
            } else if (z2) {
                return;
            } else {
                cameraCapturerAdapter.stop();
            }
        }
        f fVar = this.a.x;
        if (fVar != null) {
            fVar.a.b(CallEvents.CAMERA_CHANGED, Boolean.valueOf(z));
        }
        LocalMediaStreamAdapter localMediaStreamAdapter = this.a;
        Iterator it2 = localMediaStreamAdapter.c.iterator();
        while (it2.hasNext()) {
            ((LocalMediaStreamSource.EventListener) it2.next()).onLocalMediaStreamChanged(localMediaStreamAdapter);
        }
    }

    @Override // ru.ok.android.webrtc.mediarecord.VideoRecord.EventListener
    public final void onCaptureStateChanged(final boolean z, final boolean z2) {
        this.a.g.execute(new Runnable() { // from class: xsna.l8z0
            @Override // java.lang.Runnable
            public final void run() {
                ru.ok.android.webrtc.p.this.a(z, z2);
            }
        });
    }
}
