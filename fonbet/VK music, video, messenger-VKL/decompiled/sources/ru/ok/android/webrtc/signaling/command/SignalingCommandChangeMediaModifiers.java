package ru.ok.android.webrtc.signaling.command;

import org.json.JSONObject;
import ru.ok.android.webrtc.mediamodifiers.MediaModifiers;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* loaded from: classes9.dex */
public final class SignalingCommandChangeMediaModifiers implements SignalingCommand {

    @Deprecated
    public static final String COMMAND_UPDATE_MEDIA_MODIFIERS = "update-media-modifiers";
    public final MediaModifiers a;

    public SignalingCommandChangeMediaModifiers(MediaModifiers mediaModifiers) {
        this.a = mediaModifiers;
    }

    @Override // ru.ok.android.webrtc.signaling.command.SignalingCommand
    public JSONObject extractParams() {
        return new JSONObject().put("command", COMMAND_UPDATE_MEDIA_MODIFIERS).put(SignalingProtocol.KEY_MEDIA_MODIFIERS, this.a.writeToJson());
    }

    public final MediaModifiers getModifiers() {
        return this.a;
    }
}
