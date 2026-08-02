package ru.ok.android.externcalls.sdk.asr.internal;

import ru.ok.android.externcalls.sdk.asr.AsrManager;
import ru.ok.android.externcalls.sdk.asr.internal.commands.AsrCommandsExecutor;
import ru.ok.android.externcalls.sdk.asr.internal.listeners.AsrListenerManager;
import ru.ok.android.externcalls.sdk.asr.listener.AsrRecordListener;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.gzs;
import xsna.izs;
import xsna.s3q0;

/* compiled from: AsrManagerImpl.kt */
/* loaded from: classes9.dex */
public final class AsrManagerImpl implements AsrManager, AsrCommandsExecutor, AsrListenerManager {
    private final AsrCommandsExecutor commandExecutor;
    private final AsrListenerManager listenerManager;

    public AsrManagerImpl(AsrCommandsExecutor asrCommandsExecutor, AsrListenerManager asrListenerManager) {
        this.commandExecutor = asrCommandsExecutor;
        this.listenerManager = asrListenerManager;
    }

    @Override // ru.ok.android.externcalls.sdk.asr.AsrManager, ru.ok.android.externcalls.sdk.asr.internal.listeners.AsrListenerManager
    public void addAsrRecordListener(AsrRecordListener asrRecordListener) {
        this.listenerManager.addAsrRecordListener(asrRecordListener);
    }

    @Override // ru.ok.android.externcalls.sdk.asr.AsrManager, ru.ok.android.externcalls.sdk.asr.internal.listeners.AsrListenerManager
    public void removeAsrRecordListener(AsrRecordListener asrRecordListener) {
        this.listenerManager.removeAsrRecordListener(asrRecordListener);
    }

    @Override // ru.ok.android.externcalls.sdk.asr.AsrManager, ru.ok.android.externcalls.sdk.asr.internal.commands.AsrCommandsExecutor
    public void startRecord(String str, SessionRoomId sessionRoomId, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        this.commandExecutor.startRecord(str, sessionRoomId, gzsVar, izsVar);
    }

    @Override // ru.ok.android.externcalls.sdk.asr.AsrManager, ru.ok.android.externcalls.sdk.asr.internal.commands.AsrCommandsExecutor
    public void stopRecord(SessionRoomId sessionRoomId, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        this.commandExecutor.stopRecord(sessionRoomId, gzsVar, izsVar);
    }
}
