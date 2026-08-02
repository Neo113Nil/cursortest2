package ru.ok.android.webrtc.signaling.api;

import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class b extends d {
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ Signaling c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Signaling signaling, Runnable runnable) {
        super(signaling);
        this.c = signaling;
        this.b = runnable;
    }

    @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
    public final void onResponse(JSONObject jSONObject) {
        this.c.b.removeCallbacks(this.b);
        this.a.dispose();
    }
}
