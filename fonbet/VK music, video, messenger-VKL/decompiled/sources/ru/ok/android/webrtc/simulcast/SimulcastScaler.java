package ru.ok.android.webrtc.simulcast;

import java.util.List;
import org.webrtc.Size;
import ru.ok.android.webrtc.PeerVideoSettingsBitrateTable;

/* loaded from: classes9.dex */
public interface SimulcastScaler {
    List<SimulcastLayerInfo> generateSimulcastLayers(Size size, List<PeerVideoSettingsBitrateTable.Bitrate> list, Integer num, SimulcastConfig simulcastConfig, int i, Integer num2);
}
