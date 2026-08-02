package ru.ok.android.webrtc.signaling.command;

import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.android.webrtc.signaling.media_settings.SignalingMediaSettings;
import xsna.yq;

/* loaded from: classes9.dex */
public final class SignalingCommandChangeMediaSettings implements SignalingCommand {

    @Deprecated
    public static final String COMMAND_CHANGE_MEDIA_SETTINGS = "change-media-settings";
    public final SignalingMediaSettings a;
    public final boolean b;
    public final boolean c;

    public SignalingCommandChangeMediaSettings(SignalingMediaSettings signalingMediaSettings, boolean z, boolean z2) {
        this.a = signalingMediaSettings;
        this.b = z;
        this.c = z2;
    }

    @Override // ru.ok.android.webrtc.signaling.command.SignalingCommand
    public JSONObject extractParams() {
        JSONObject d = yq.d("command", COMMAND_CHANGE_MEDIA_SETTINGS);
        d.put(SignalingProtocol.KEY_MEDIA_SETTINGS, SignalingProtocol.createMediaSettingsParams(this.a, this.b, this.c));
        return d;
    }

    public final SignalingMediaSettings getSettings() {
        return this.a;
    }
}
