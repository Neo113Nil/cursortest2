package ru.ok.android.externcalls.sdk.asr_online.internal.listeners;

import ru.ok.android.externcalls.sdk.asr_online.listener.AsrOnlineListener;

/* compiled from: AsrOnlineListenerManager.kt */
/* loaded from: classes9.dex */
public interface AsrOnlineListenerManager {
    void addAsrOnlineListener(AsrOnlineListener asrOnlineListener);

    void onAsrAvailableChanged(boolean z);

    void removeAsrOnlineListener(AsrOnlineListener asrOnlineListener);
}
