package ru.ok.android.webrtc.asr_online.data_channels;

import java.util.Iterator;
import ru.ok.android.webrtc.asr_online.data_channels.AsrOnlineReceiver;
import ru.ok.android.webrtc.protocol.RtcFormat;
import ru.ok.android.webrtc.protocol.RtcTransport;

/* loaded from: classes9.dex */
public final class a implements RtcTransport.DataListener {
    public final /* synthetic */ AsrOnlineReceiverImpl a;

    public a(AsrOnlineReceiverImpl asrOnlineReceiverImpl) {
        this.a = asrOnlineReceiverImpl;
    }

    @Override // ru.ok.android.webrtc.protocol.RtcTransport.DataListener
    public final void onReceive(RtcTransport rtcTransport, byte[] bArr, RtcFormat rtcFormat) {
        AsrOnlineReceiverImpl asrOnlineReceiverImpl = this.a;
        AsrRecvDataPackage fromByteArray = AsrRecvDataPackage.fromByteArray(bArr, asrOnlineReceiverImpl.c);
        Iterator it = asrOnlineReceiverImpl.d.iterator();
        while (it.hasNext()) {
            ((AsrOnlineReceiver.Listener) it.next()).onAsrDataReceived(fromByteArray);
        }
    }
}
