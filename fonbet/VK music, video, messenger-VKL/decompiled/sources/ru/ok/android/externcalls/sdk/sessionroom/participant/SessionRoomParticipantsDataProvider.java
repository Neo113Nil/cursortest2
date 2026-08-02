package ru.ok.android.externcalls.sdk.sessionroom.participant;

import java.util.List;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.izs;
import xsna.s3q0;

/* compiled from: SessionRoomParticipantsDataProvider.kt */
/* loaded from: classes9.dex */
public interface SessionRoomParticipantsDataProvider {
    void getAllInRoomParticipants(izs<? super List<SessionRoomParticipants>, s3q0> izsVar, izs<? super Throwable, s3q0> izsVar2);

    void getParticipantRoomId(ParticipantId participantId, izs<? super SessionRoomId, s3q0> izsVar, izs<? super Throwable, s3q0> izsVar2);

    void getRoomParticipants(SessionRoomId sessionRoomId, izs<? super SessionRoomParticipants, s3q0> izsVar, izs<? super Throwable, s3q0> izsVar2);
}
