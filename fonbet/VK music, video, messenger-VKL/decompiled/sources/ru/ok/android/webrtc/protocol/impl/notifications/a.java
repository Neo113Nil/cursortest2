package ru.ok.android.webrtc.protocol.impl.notifications;

import ru.ok.android.webrtc.protocol.RtcFormat;
import ru.ok.android.webrtc.protocol.RtcNotification;
import ru.ok.android.webrtc.protocol.RtcTransport;

/* loaded from: classes9.dex */
public final class a implements RtcTransport.DataListener {
    public final /* synthetic */ RtcNotificationReceiverImpl a;

    public a(RtcNotificationReceiverImpl rtcNotificationReceiverImpl) {
        this.a = rtcNotificationReceiverImpl;
    }

    public final void a(RtcTransport rtcTransport, byte[] bArr, RtcFormat rtcFormat) {
        RtcNotificationReceiverImpl rtcNotificationReceiverImpl = this.a;
        RtcTransport rtcTransport2 = (RtcTransport) rtcNotificationReceiverImpl.h.get();
        if (rtcNotificationReceiverImpl.g.get() || rtcTransport2 != rtcTransport) {
            return;
        }
        rtcNotificationReceiverImpl.a(bArr, rtcFormat);
        try {
            RtcNotification deserialize = rtcNotificationReceiverImpl.a.deserialize(bArr, rtcFormat);
            if (deserialize != null) {
                rtcNotificationReceiverImpl.a(deserialize);
            }
        } catch (Throwable th) {
            rtcNotificationReceiverImpl.a(th);
        }
    }

    @Override // ru.ok.android.webrtc.protocol.RtcTransport.DataListener
    public final void onReceive(final RtcTransport rtcTransport, final byte[] bArr, final RtcFormat rtcFormat) {
        RtcNotificationReceiverImpl rtcNotificationReceiverImpl = this.a;
        rtcNotificationReceiverImpl.e.post(new Runnable() { // from class: xsna.f8y0
            @Override // java.lang.Runnable
            public final void run() {
                ru.ok.android.webrtc.protocol.impl.notifications.a.this.a(rtcTransport, bArr, rtcFormat);
            }
        });
    }
}
