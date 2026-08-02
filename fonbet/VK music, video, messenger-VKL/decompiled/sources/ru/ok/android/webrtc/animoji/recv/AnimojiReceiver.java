package ru.ok.android.webrtc.animoji.recv;

import android.os.SystemClock;
import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.webrtc.animoji.AnimojiCore;
import ru.ok.android.webrtc.animoji.stats.AnimojiStatHandle;
import ru.ok.android.webrtc.protocol.RtcFormat;
import ru.ok.android.webrtc.protocol.RtcTransport;

@CallInternalApi
/* loaded from: classes9.dex */
public final class AnimojiReceiver implements RtcTransport.DataListener {

    @Deprecated
    public static final String TAG = "AniRecv";
    public final AnimojiCore a;
    public final AnimojiStatHandle b;
    public RtcTransport c;

    public AnimojiReceiver(AnimojiCore animojiCore, AnimojiStatHandle animojiStatHandle) {
        this.a = animojiCore;
        this.b = animojiStatHandle;
    }

    public final void clearTransport() {
        RtcTransport rtcTransport = this.c;
        if (rtcTransport != null) {
            rtcTransport.removeDataListener(this);
        }
        this.c = null;
    }

    @Override // ru.ok.android.webrtc.protocol.RtcTransport.DataListener
    public void onReceive(RtcTransport rtcTransport, byte[] bArr, RtcFormat rtcFormat) {
        SystemClock.elapsedRealtime();
        AnimojiRecvDataPackage fromByteArray = AnimojiRecvDataPackage.Companion.fromByteArray(bArr);
        this.b.onReceiverPackageReceived();
        this.b.onReceiverBytesReceived(bArr.length);
        this.a.onRemoteAnimojiData(fromByteArray);
    }

    public final void release() {
        clearTransport();
    }

    public final void setTransport(RtcTransport rtcTransport) {
        clearTransport();
        this.c = rtcTransport;
        this.b.onReceiverCreated();
        rtcTransport.addDataListener(this);
    }
}
