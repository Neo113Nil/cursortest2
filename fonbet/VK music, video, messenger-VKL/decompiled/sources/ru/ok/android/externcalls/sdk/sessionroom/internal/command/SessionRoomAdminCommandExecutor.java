package ru.ok.android.externcalls.sdk.sessionroom.internal.command;

import ru.ok.android.externcalls.sdk.sessionroom.admin.AssignParticipantsToRoomsParams;
import ru.ok.android.externcalls.sdk.sessionroom.admin.MoveParticipantParams;
import ru.ok.android.webrtc.sessionroom.admin.ActivateRoomsParams;
import ru.ok.android.webrtc.sessionroom.admin.RemoveRoomsParams;
import ru.ok.android.webrtc.sessionroom.admin.SwitchRoomParams;
import ru.ok.android.webrtc.sessionroom.admin.UpdateRoomsParams;
import xsna.gzs;
import xsna.izs;
import xsna.s3q0;

/* compiled from: SessionRoomAdminCommandExecutor.kt */
/* loaded from: classes9.dex */
public interface SessionRoomAdminCommandExecutor {
    void activateRooms(ActivateRoomsParams activateRoomsParams, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);

    void assignParticipantsToRooms(AssignParticipantsToRoomsParams assignParticipantsToRoomsParams, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);

    void moveParticipant(MoveParticipantParams moveParticipantParams, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);

    void removeRooms(RemoveRoomsParams removeRoomsParams, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);

    void switchRoom(SwitchRoomParams switchRoomParams, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);

    void updateRooms(UpdateRoomsParams updateRoomsParams, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);
}
