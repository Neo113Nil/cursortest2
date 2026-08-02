package ru.ok.android.webrtc;

import ru.ok.android.webrtc.media_settings.DiffMediaSettingsSender;

/* loaded from: classes9.dex */
public final class h implements DiffMediaSettingsSender.CallState {
    public final /* synthetic */ Call a;

    public h(Call call) {
        this.a = call;
    }

    @Override // ru.ok.android.webrtc.media_settings.DiffMediaSettingsSender.CallState
    public final boolean isAnswered() {
        return this.a.isAnswered();
    }

    @Override // ru.ok.android.webrtc.media_settings.DiffMediaSettingsSender.CallState
    public final boolean isCaller() {
        return this.a.s;
    }

    @Override // ru.ok.android.webrtc.media_settings.DiffMediaSettingsSender.CallState
    public final boolean isInitializationCompleted() {
        return this.a.C;
    }

    @Override // ru.ok.android.webrtc.media_settings.DiffMediaSettingsSender.CallState
    public final boolean isMeInWaitingRoom() {
        return this.a.x0;
    }
}
