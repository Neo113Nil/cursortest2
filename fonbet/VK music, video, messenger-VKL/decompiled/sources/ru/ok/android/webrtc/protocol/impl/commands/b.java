package ru.ok.android.webrtc.protocol.impl.commands;

import ru.ok.android.webrtc.protocol.RtcFormat;
import ru.ok.android.webrtc.protocol.RtcTransport;

/* loaded from: classes9.dex */
public final class b implements RtcTransport.DataListener {
    public final /* synthetic */ RtcCommandExecutorImpl a;

    public b(RtcCommandExecutorImpl rtcCommandExecutorImpl) {
        this.a = rtcCommandExecutorImpl;
    }

    public final /* synthetic */ void a(RtcTransport rtcTransport, byte[] bArr, RtcFormat rtcFormat) {
        this.a.a(rtcTransport, bArr, rtcFormat);
    }

    @Override // ru.ok.android.webrtc.protocol.RtcTransport.DataListener
    public final void onReceive(final RtcTransport rtcTransport, final byte[] bArr, final RtcFormat rtcFormat) {
        RtcCommandExecutorImpl rtcCommandExecutorImpl = this.a;
        rtcCommandExecutorImpl.f.post(new Runnable() { // from class: xsna.oey0
            @Override // java.lang.Runnable
            public final void run() {
                ru.ok.android.webrtc.protocol.impl.commands.b.this.a(rtcTransport, bArr, rtcFormat);
            }
        });
    }
}
