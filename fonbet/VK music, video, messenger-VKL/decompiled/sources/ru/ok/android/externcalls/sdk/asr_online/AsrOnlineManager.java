package ru.ok.android.externcalls.sdk.asr_online;

import ru.ok.android.externcalls.sdk.asr_online.listener.AsrOnlineListener;

/* compiled from: AsrOnlineManager.kt */
/* loaded from: classes11.dex */
public interface AsrOnlineManager {
    void addAsrOnlineListener(AsrOnlineListener asrOnlineListener);

    void enableAsrOnline(boolean z);

    boolean isAsrAvailable();

    void removeAsrOnlineListener(AsrOnlineListener asrOnlineListener);
}
