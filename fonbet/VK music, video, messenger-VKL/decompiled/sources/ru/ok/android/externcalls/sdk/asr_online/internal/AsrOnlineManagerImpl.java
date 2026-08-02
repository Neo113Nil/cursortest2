package ru.ok.android.externcalls.sdk.asr_online.internal;

import ru.ok.android.externcalls.sdk.asr_online.AsrOnlineManager;
import ru.ok.android.externcalls.sdk.asr_online.internal.commands.AsrOnlineCommandsExecutor;
import ru.ok.android.externcalls.sdk.asr_online.internal.listeners.AsrOnlineListenerManager;
import ru.ok.android.externcalls.sdk.asr_online.internal.listeners.AsrOnlineListenerManagerImpl;
import ru.ok.android.externcalls.sdk.asr_online.listener.AsrOnlineListener;
import ru.ok.android.webrtc.Call;
import ru.ok.android.webrtc.asr_online.data_channels.AsrRecvDataPackage;
import ru.ok.android.webrtc.listeners.CallAsrOnlineListener;
import xsna.gzs;

/* compiled from: AsrOnlineManagerImpl.kt */
/* loaded from: classes9.dex */
public final class AsrOnlineManagerImpl implements AsrOnlineManager, CallAsrOnlineListener, AsrOnlineListenerManager, AsrOnlineCommandsExecutor {
    private final AsrOnlineCommandsExecutor commandExecutor;
    private final gzs<Call> getCall;
    private final AsrOnlineListenerManagerImpl listenerManager;

    public AsrOnlineManagerImpl(AsrOnlineCommandsExecutor asrOnlineCommandsExecutor, AsrOnlineListenerManagerImpl asrOnlineListenerManagerImpl, gzs<Call> gzsVar) {
        this.commandExecutor = asrOnlineCommandsExecutor;
        this.listenerManager = asrOnlineListenerManagerImpl;
        this.getCall = gzsVar;
    }

    @Override // ru.ok.android.externcalls.sdk.asr_online.AsrOnlineManager, ru.ok.android.externcalls.sdk.asr_online.internal.listeners.AsrOnlineListenerManager
    public void addAsrOnlineListener(AsrOnlineListener asrOnlineListener) {
        this.listenerManager.addAsrOnlineListener(asrOnlineListener);
    }

    @Override // ru.ok.android.externcalls.sdk.asr_online.AsrOnlineManager, ru.ok.android.externcalls.sdk.asr_online.internal.commands.AsrOnlineCommandsExecutor
    public void enableAsrOnline(boolean z) {
        this.commandExecutor.enableAsrOnline(z);
    }

    @Override // ru.ok.android.externcalls.sdk.asr_online.AsrOnlineManager
    public boolean isAsrAvailable() {
        Call invoke = this.getCall.invoke();
        return invoke != null && invoke.isAsrAvailable();
    }

    @Override // ru.ok.android.externcalls.sdk.asr_online.internal.listeners.AsrOnlineListenerManager
    public void onAsrAvailableChanged(boolean z) {
        this.listenerManager.onAsrAvailableChanged(z);
    }

    @Override // ru.ok.android.webrtc.listeners.CallAsrOnlineListener
    public void onAsrDataPackage(AsrRecvDataPackage asrRecvDataPackage) {
        this.listenerManager.onAsrDataPackage(asrRecvDataPackage);
    }

    @Override // ru.ok.android.externcalls.sdk.asr_online.internal.commands.AsrOnlineCommandsExecutor
    public void onMigratedToServerCallTopology() {
        this.commandExecutor.onMigratedToServerCallTopology();
    }

    @Override // ru.ok.android.externcalls.sdk.asr_online.AsrOnlineManager, ru.ok.android.externcalls.sdk.asr_online.internal.listeners.AsrOnlineListenerManager
    public void removeAsrOnlineListener(AsrOnlineListener asrOnlineListener) {
        this.listenerManager.removeAsrOnlineListener(asrOnlineListener);
    }
}
