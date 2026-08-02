package ru.ok.android.webrtc.protocol.screenshare.recv;

import org.webrtc.VideoFrame;
import ru.ok.android.webrtc.participant.CallParticipant;

/* loaded from: classes9.dex */
public interface ParticipantRendererCollection {
    void deliverScreenCaptureFrame(CallParticipant.ParticipantId participantId, VideoFrame videoFrame);
}
