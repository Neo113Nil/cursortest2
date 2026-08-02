package ru.ok.android.webrtc.asr_online;

import ru.ok.android.webrtc.asr_online.data_channels.AsrRecvDataPackage;
import ru.ok.android.webrtc.listeners.CallListeners;

/* loaded from: classes9.dex */
public final class CallAsrOnlineManagerImpl implements CallAsrOnlineManager {
    public final CallListeners a;

    public CallAsrOnlineManagerImpl(CallListeners callListeners) {
        this.a = callListeners;
    }

    @Override // ru.ok.android.webrtc.asr_online.CallAsrOnlineManager
    public void onAsrPackage(AsrRecvDataPackage asrRecvDataPackage) {
        this.a.getAsrOnlineListenerProxy().onAsrDataPackage(asrRecvDataPackage);
    }
}
