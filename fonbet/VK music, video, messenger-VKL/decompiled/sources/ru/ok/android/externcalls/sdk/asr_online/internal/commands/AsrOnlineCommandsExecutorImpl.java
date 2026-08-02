package ru.ok.android.externcalls.sdk.asr_online.internal.commands;

import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;
import ru.ok.android.webrtc.Call;
import ru.ok.android.webrtc.Topology;
import ru.ok.android.webrtc.signaling.api.Signaling;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.android.webrtc.signaling.command.SignalingCommand;
import xsna.gzs;

/* compiled from: AsrOnlineCommandsExecutorImpl.kt */
/* loaded from: classes9.dex */
public final class AsrOnlineCommandsExecutorImpl implements AsrOnlineCommandsExecutor {
    private final gzs<Call> getCall;
    private boolean isAsrOnlineEnabled;
    private final SignalingProvider signalingProvider;

    public AsrOnlineCommandsExecutorImpl(gzs<Call> gzsVar, SignalingProvider signalingProvider) {
        this.getCall = gzsVar;
        this.signalingProvider = signalingProvider;
    }

    @Override // ru.ok.android.externcalls.sdk.asr_online.internal.commands.AsrOnlineCommandsExecutor
    public void enableAsrOnline(boolean z) {
        this.isAsrOnlineEnabled = z;
        Call invoke = this.getCall.invoke();
        if (invoke == null) {
            return;
        }
        if (!invoke.getTopology().is(Topology.DIRECT)) {
            Call invoke2 = this.getCall.invoke();
            if (invoke2 != null) {
                invoke2.requestAsr(z);
                return;
            }
            return;
        }
        SignalingCommand createRequestAsrOnlineCommand = SignalingProtocol.createRequestAsrOnlineCommand();
        Signaling signaling = this.signalingProvider.getSignaling();
        if (signaling != null) {
            signaling.send(createRequestAsrOnlineCommand);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.asr_online.internal.commands.AsrOnlineCommandsExecutor
    public void onMigratedToServerCallTopology() {
        Call invoke;
        if (!this.isAsrOnlineEnabled || (invoke = this.getCall.invoke()) == null) {
            return;
        }
        invoke.requestAsr(this.isAsrOnlineEnabled);
    }
}
