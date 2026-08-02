package xsna;

import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.animoji.AnimojiCore;
import ru.ok.android.webrtc.animoji.send.AnimojiSender;
import ru.ok.android.webrtc.animoji.util.DataChannelSenderThread;
import ru.ok.android.webrtc.protocol.RtcTransport;
import ru.ok.android.webrtc.utils.ColorUtils;

/* loaded from: classes8.dex */
public final class roy0 {
    public volatile Integer a;
    public volatile Double[] b;
    public final /* synthetic */ AnimojiSender c;

    public roy0(AnimojiSender animojiSender) {
        this.c = animojiSender;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0087, code lost:
    
        r0 = r8.c.d;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        AnimojiCore animojiCore;
        Integer num;
        RtcTransport rtcTransport;
        DataChannelSenderThread dataChannelSenderThread;
        Integer num2;
        DataChannelSenderThread dataChannelSenderThread2;
        RtcTransport rtcTransport2;
        animojiCore = this.c.a;
        RTCLog logger$webrtc_android_sdk_release = animojiCore.getLogger$webrtc_android_sdk_release();
        AnimojiSender animojiSender = this.c;
        num = animojiSender.c;
        Integer num3 = this.a;
        String colorToHex = num3 != null ? ColorUtils.INSTANCE.colorToHex(num3.intValue()) : null;
        rtcTransport = this.c.d;
        Boolean valueOf = rtcTransport != null ? Boolean.valueOf(rtcTransport.isConnected()) : null;
        dataChannelSenderThread = this.c.e;
        logger$webrtc_android_sdk_release.log(AnimojiSender.TAG, animojiSender + ": isReady: v=" + num + " bgColor=" + colorToHex + "} connected=" + valueOf + " senderThread=" + dataChannelSenderThread);
        num2 = this.c.c;
        if (num2 == null) {
            return;
        }
        if (num2.intValue() != 1) {
            if (this.a == null) {
                return;
            }
            dataChannelSenderThread2 = this.c.e;
            if (dataChannelSenderThread2 == null || rtcTransport2 == null || !rtcTransport2.isConnected()) {
                return;
            }
        }
        this.c.g = null;
        Integer num4 = this.a;
        if (num4 != null) {
            this.c.onBgColor(num4.intValue());
        }
        Double[] dArr = this.b;
        if (dArr != null) {
            this.c.onLandmarks(dArr);
        }
    }
}
