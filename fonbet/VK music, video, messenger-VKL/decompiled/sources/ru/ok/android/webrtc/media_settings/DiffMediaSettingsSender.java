package ru.ok.android.webrtc.media_settings;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONObject;
import ru.ok.android.webrtc.CallParams;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.media_settings.DiffMediaSettingsSender;
import ru.ok.android.webrtc.signaling.api.Signaling;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import ru.ok.android.webrtc.signaling.media_settings.SignalingMediaSettings;

/* loaded from: classes9.dex */
public class DiffMediaSettingsSender implements MediaSettingsSender {
    public final SignalingProvider a;
    public final CallState b;
    public final RTCLog c;
    public final CallParams d;
    public SignalingMediaSettings f = null;
    public boolean g = false;
    public final Signaling.Listener e = a();

    public interface CallState {
        boolean isAnswered();

        boolean isCaller();

        boolean isInitializationCompleted();

        boolean isMeInWaitingRoom();
    }

    public interface SignalingProvider {
        @Nullable
        Signaling getSignaling();
    }

    public DiffMediaSettingsSender(@NonNull SignalingProvider signalingProvider, @NonNull CallState callState, @NonNull RTCLog rTCLog, @NonNull CallParams callParams) {
        this.a = signalingProvider;
        this.b = callState;
        this.c = rTCLog;
        this.d = callParams;
    }

    public final Signaling.Listener a() {
        return new Signaling.Listener() { // from class: xsna.mxm
            @Override // ru.ok.android.webrtc.signaling.api.Signaling.Listener
            public final void onResponse(JSONObject jSONObject) {
                DiffMediaSettingsSender.this.a(jSONObject);
            }
        };
    }

    @Override // ru.ok.android.webrtc.media_settings.MediaSettingsSender
    public void send(@NonNull SignalingMediaSettings signalingMediaSettings) {
        Signaling signaling;
        SignalingMediaSettings signalingMediaSettings2 = this.f;
        if (signalingMediaSettings2 == null) {
            return;
        }
        if (!signalingMediaSettings2.equals(signalingMediaSettings) || this.g) {
            if (this.b.isMeInWaitingRoom()) {
                this.g = true;
                return;
            }
            if (this.b.isInitializationCompleted()) {
                if ((this.b.isCaller() || this.b.isAnswered()) && (signaling = this.a.getSignaling()) != null) {
                    CallParams callParams = this.d;
                    boolean z = callParams != null && callParams.isFastScreenCaptureEnabled();
                    CallParams callParams2 = this.d;
                    signaling.send(SignalingProtocol.createChangeMediaSettingsCommand(signalingMediaSettings, z, callParams2 != null && callParams2.isDeviceAudioShareEnabled()), (Signaling.Listener) null, this.e);
                    this.f = signalingMediaSettings;
                    this.g = false;
                }
            }
        }
    }

    @Override // ru.ok.android.webrtc.media_settings.MediaSettingsSender
    public void setActualSettings(@NonNull SignalingMediaSettings signalingMediaSettings) {
        this.f = signalingMediaSettings;
    }

    public final /* synthetic */ void a(JSONObject jSONObject) {
        if (jSONObject != null && SignalingProtocol.ERROR_COMMAND_DISCARDED.equals(jSONObject.optString("error"))) {
            this.c.log("MediaSettingsSender", "change-media-settings command was merged with ongoing one");
            return;
        }
        this.c.log("MediaSettingsSender", "change-media-settings error" + jSONObject);
    }

    @Override // ru.ok.android.webrtc.media_settings.MediaSettingsSender
    public void release() {
    }
}
