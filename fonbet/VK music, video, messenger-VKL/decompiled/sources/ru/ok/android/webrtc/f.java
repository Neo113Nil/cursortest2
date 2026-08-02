package ru.ok.android.webrtc;

import ru.ok.android.webrtc.LocalMediaStreamAdapter;

/* loaded from: classes9.dex */
public final class f implements LocalMediaStreamAdapter.OnCameraStreamListener {
    public final /* synthetic */ Call a;

    public f(Call call) {
        this.a = call;
    }

    @Override // ru.ok.android.webrtc.LocalMediaStreamAdapter.OnCameraStreamListener
    public final void onCameraStreamChanged(boolean z) {
        this.a.b(CallEvents.CAMERA_CHANGED, Boolean.valueOf(z));
    }
}
