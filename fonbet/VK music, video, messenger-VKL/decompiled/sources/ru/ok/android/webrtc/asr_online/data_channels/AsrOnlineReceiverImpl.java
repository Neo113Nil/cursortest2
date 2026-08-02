package ru.ok.android.webrtc.asr_online.data_channels;

import androidx.annotation.NonNull;
import java.util.concurrent.CopyOnWriteArrayList;
import ru.ok.android.webrtc.asr_online.data_channels.AsrOnlineReceiver;
import ru.ok.android.webrtc.protocol.RtcTransport;
import ru.ok.android.webrtc.protocol.mappings.MappingProcessor;

/* loaded from: classes9.dex */
public class AsrOnlineReceiverImpl implements AsrOnlineReceiver {
    public RtcTransport a;
    public a b;
    public final MappingProcessor c;
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();

    public AsrOnlineReceiverImpl(MappingProcessor mappingProcessor) {
        this.c = mappingProcessor;
    }

    @Override // ru.ok.android.webrtc.asr_online.data_channels.AsrOnlineReceiver
    public void addListener(@NonNull AsrOnlineReceiver.Listener listener) {
        this.d.add(listener);
    }

    public void release() {
        RtcTransport rtcTransport = this.a;
        if (rtcTransport == null) {
            return;
        }
        a aVar = this.b;
        if (aVar != null) {
            rtcTransport.removeDataListener(aVar);
        }
        this.a = null;
        this.b = null;
    }

    @Override // ru.ok.android.webrtc.asr_online.data_channels.AsrOnlineReceiver
    public void removeListener(@NonNull AsrOnlineReceiver.Listener listener) {
        this.d.remove(listener);
    }

    public void setTransport(RtcTransport rtcTransport) {
        RtcTransport rtcTransport2;
        if (rtcTransport != null && (rtcTransport2 = this.a) != null) {
            a aVar = this.b;
            if (aVar != null) {
                rtcTransport2.removeDataListener(aVar);
            }
            this.a = null;
            this.b = null;
        }
        this.a = rtcTransport;
        a aVar2 = new a(this);
        this.b = aVar2;
        if (rtcTransport != null) {
            rtcTransport.addDataListener(aVar2);
        }
    }
}
