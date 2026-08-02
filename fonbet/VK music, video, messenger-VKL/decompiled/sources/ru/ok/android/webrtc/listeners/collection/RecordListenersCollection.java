package ru.ok.android.webrtc.listeners.collection;

import ru.ok.android.webrtc.listeners.CallRecordListener;

/* loaded from: classes9.dex */
public interface RecordListenersCollection {
    void addRecordListener(CallRecordListener callRecordListener);

    void removeRecordListener(CallRecordListener callRecordListener);
}
