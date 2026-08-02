package ru.ok.android.webrtc.protocol.commands;

import java.util.List;
import ru.ok.android.webrtc.protocol.RtcCommand;
import ru.ok.android.webrtc.simulcast.SimulcastLayerInfo;

/* loaded from: classes9.dex */
public final class ChangeSimulcastCommand implements RtcCommand<ChangeSimulcastResponse> {
    public final List a;

    public ChangeSimulcastCommand(List<SimulcastLayerInfo> list) {
        this.a = list;
    }

    public final List<SimulcastLayerInfo> getLayers() {
        return this.a;
    }

    @Override // ru.ok.android.webrtc.protocol.RtcCommand
    public boolean isNotify() {
        return false;
    }
}
