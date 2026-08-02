package ru.ok.android.externcalls.sdk.stereo.internal;

import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.webrtc.participant.CallParticipant;
import xsna.izs;

/* compiled from: StereoRoomManagerImpl.kt */
/* loaded from: classes9.dex */
public final /* synthetic */ class StereoRoomManagerImpl$handsQueue$2 extends FunctionReferenceImpl implements izs<CallParticipant.ParticipantId, ParticipantId> {
    public StereoRoomManagerImpl$handsQueue$2(Object obj) {
        super(1, obj, StereoRoomManagerImpl.class, "getExternalId", "getExternalId(Lru/ok/android/webrtc/participant/CallParticipant$ParticipantId;)Lru/ok/android/externcalls/sdk/id/ParticipantId;", 0);
    }

    @Override // xsna.izs
    public final ParticipantId invoke(CallParticipant.ParticipantId participantId) {
        ParticipantId externalId;
        externalId = ((StereoRoomManagerImpl) this.receiver).getExternalId(participantId);
        return externalId;
    }
}
