package ru.ok.android.externcalls.sdk.sessionroom.internal.command;

import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.gzs;
import xsna.izs;
import xsna.s3q0;

/* compiled from: SessionRoomCommandExecutor.kt */
/* loaded from: classes9.dex */
public interface SessionRoomCommandExecutor {
    void joinRoom(SessionRoomId.Room room, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);

    void leaveRoom(gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);

    void requestAttention(gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);
}
