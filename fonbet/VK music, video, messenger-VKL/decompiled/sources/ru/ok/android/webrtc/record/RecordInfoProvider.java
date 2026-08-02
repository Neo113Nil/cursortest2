package ru.ok.android.webrtc.record;

import ru.ok.android.webrtc.sessionroom.SessionRoomId;

/* loaded from: classes9.dex */
public interface RecordInfoProvider {
    CallRecordDescription getActiveRecording(SessionRoomId sessionRoomId);
}
