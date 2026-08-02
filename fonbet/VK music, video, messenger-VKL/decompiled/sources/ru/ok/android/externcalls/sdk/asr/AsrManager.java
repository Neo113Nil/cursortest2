package ru.ok.android.externcalls.sdk.asr;

import ru.ok.android.externcalls.sdk.asr.listener.AsrRecordListener;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.gzs;
import xsna.izs;
import xsna.s3q0;

/* compiled from: AsrManager.kt */
/* loaded from: classes9.dex */
public interface AsrManager {
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void startRecord$default(AsrManager asrManager, String str, SessionRoomId sessionRoomId, gzs gzsVar, izs izsVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startRecord");
        }
        if ((i & 2) != 0) {
            sessionRoomId = null;
        }
        if ((i & 4) != 0) {
            gzsVar = null;
        }
        if ((i & 8) != 0) {
            izsVar = null;
        }
        asrManager.startRecord(str, sessionRoomId, gzsVar, izsVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void stopRecord$default(AsrManager asrManager, SessionRoomId sessionRoomId, gzs gzsVar, izs izsVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stopRecord");
        }
        if ((i & 1) != 0) {
            sessionRoomId = null;
        }
        if ((i & 2) != 0) {
            gzsVar = null;
        }
        if ((i & 4) != 0) {
            izsVar = null;
        }
        asrManager.stopRecord(sessionRoomId, gzsVar, izsVar);
    }

    void addAsrRecordListener(AsrRecordListener asrRecordListener);

    void removeAsrRecordListener(AsrRecordListener asrRecordListener);

    void startRecord(String str, SessionRoomId sessionRoomId, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);

    void stopRecord(SessionRoomId sessionRoomId, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);
}
