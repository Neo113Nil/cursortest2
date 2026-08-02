package ru.ok.android.webrtc.asr_online.data_channels;

/* loaded from: classes9.dex */
public interface AsrOnlineReceiver {

    public interface Listener {
        void onAsrDataReceived(AsrRecvDataPackage asrRecvDataPackage);
    }

    void addListener(Listener listener);

    void removeListener(Listener listener);
}
