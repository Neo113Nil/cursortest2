package ru.ok.android.externcalls.sdk.asr.internal.commands;

import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.gzs;
import xsna.izs;
import xsna.s3q0;

/* compiled from: AsrCommandsExecutor.kt */
/* loaded from: classes9.dex */
public interface AsrCommandsExecutor {
    void startRecord(String str, SessionRoomId sessionRoomId, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);

    void stopRecord(SessionRoomId sessionRoomId, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);
}
