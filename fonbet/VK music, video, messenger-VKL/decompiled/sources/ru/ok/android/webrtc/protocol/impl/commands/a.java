package ru.ok.android.webrtc.protocol.impl.commands;

import ru.ok.android.webrtc.protocol.RtcTransport;

/* loaded from: classes9.dex */
public final class a implements RtcTransport.ConnectionStateListener {
    public final /* synthetic */ RtcCommandExecutorImpl a;

    public a(RtcCommandExecutorImpl rtcCommandExecutorImpl) {
        this.a = rtcCommandExecutorImpl;
    }

    public final void a(RtcTransport rtcTransport, boolean z) {
        RtcCommandExecutorImpl rtcCommandExecutorImpl = this.a;
        RtcTransport rtcTransport2 = (RtcTransport) rtcCommandExecutorImpl.b.get();
        if (rtcCommandExecutorImpl.j.get() || rtcTransport2 != rtcTransport) {
            return;
        }
        if (z) {
            rtcCommandExecutorImpl.b();
        } else {
            rtcCommandExecutorImpl.a();
        }
    }

    @Override // ru.ok.android.webrtc.protocol.RtcTransport.ConnectionStateListener
    public final void onConnectionStateChanged(final RtcTransport rtcTransport, final boolean z) {
        RtcCommandExecutorImpl rtcCommandExecutorImpl = this.a;
        rtcCommandExecutorImpl.f.post(new Runnable() { // from class: xsna.e8y0
            @Override // java.lang.Runnable
            public final void run() {
                ru.ok.android.webrtc.protocol.impl.commands.a.this.a(rtcTransport, z);
            }
        });
    }
}
