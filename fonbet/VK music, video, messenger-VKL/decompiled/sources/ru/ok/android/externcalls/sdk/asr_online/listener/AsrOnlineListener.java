package ru.ok.android.externcalls.sdk.asr_online.listener;

import ru.ok.android.externcalls.sdk.asr_online.AsrOnlineChunk;

/* compiled from: AsrOnlineListener.kt */
/* loaded from: classes11.dex */
public interface AsrOnlineListener {
    void onAsrAvailableChanged(boolean z);

    void onAsrChunk(AsrOnlineChunk asrOnlineChunk);
}
