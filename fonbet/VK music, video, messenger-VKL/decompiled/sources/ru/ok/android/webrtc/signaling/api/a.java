package ru.ok.android.webrtc.signaling.api;

import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.Signaling;

/* loaded from: classes9.dex */
public final class a implements Signaling.Transport.Listener {
    public final /* synthetic */ Signaling a;

    public a(Signaling signaling) {
        this.a = signaling;
    }

    @Override // ru.ok.android.webrtc.signaling.api.Signaling.Transport.Listener
    public final void onConnected() {
        synchronized (this.a.e) {
            try {
                Signaling signaling = this.a;
                if (signaling.q) {
                    signaling.t = signaling.s;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a.a(true);
    }

    @Override // ru.ok.android.webrtc.signaling.api.Signaling.Transport.Listener
    public final void onDisconnected() {
        Signaling signaling;
        synchronized (this.a.e) {
            signaling = this.a;
            signaling.r = false;
        }
        signaling.a(false);
    }

    @Override // ru.ok.android.webrtc.signaling.api.Signaling.Transport.Listener
    public final void onMessage(JSONObject jSONObject) {
        this.a.c(jSONObject);
    }
}
