package ru.ok.android.webrtc;

import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.record.CallRecordDescription;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;

/* loaded from: classes9.dex */
public interface CallState {
    CallRecordDescription getActiveRecording(SessionRoomId sessionRoomId);

    CallParticipant getCurrentUserCallParticipant();
}
