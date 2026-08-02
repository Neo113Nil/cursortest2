package ru.ok.android.webrtc.record;

import ru.ok.android.webrtc.signaling.record.event.SignalingRecordInfo;

/* loaded from: classes9.dex */
public final class CallRecordDescriptionKt {
    public static final CallRecordDescription toCallRecordDescription(SignalingRecordInfo signalingRecordInfo) {
        return new CallRecordDescription(signalingRecordInfo.getRecordMovieId(), signalingRecordInfo.getRecordType(), signalingRecordInfo.getInitiator(), signalingRecordInfo.getRecordStartTime(), signalingRecordInfo.getRecordExternalMovieId(), signalingRecordInfo.getRecordExternalOwnerId());
    }
}
