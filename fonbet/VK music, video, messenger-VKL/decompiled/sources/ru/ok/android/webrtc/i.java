package ru.ok.android.webrtc;

import ru.ok.android.webrtc.media_settings.DiffMediaSettingsSender;
import ru.ok.android.webrtc.signaling.api.Signaling;

/* loaded from: classes9.dex */
public final class i implements DiffMediaSettingsSender.SignalingProvider {
    public final /* synthetic */ Call a;

    public i(Call call) {
        this.a = call;
    }

    @Override // ru.ok.android.webrtc.media_settings.DiffMediaSettingsSender.SignalingProvider
    public final Signaling getSignaling() {
        return this.a.k;
    }
}
