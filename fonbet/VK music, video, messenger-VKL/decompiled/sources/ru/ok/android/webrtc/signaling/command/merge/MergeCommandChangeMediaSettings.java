package ru.ok.android.webrtc.signaling.command.merge;

import ru.ok.android.webrtc.signaling.command.SignalingCommand;
import ru.ok.android.webrtc.signaling.command.SignalingCommandChangeMediaSettings;
import ru.ok.android.webrtc.signaling.command.merge.SignalingCommandMerge;

/* loaded from: classes9.dex */
public final class MergeCommandChangeMediaSettings extends SignalingCommandMerge {
    public final SignalingCommandChangeMediaSettings a;

    public MergeCommandChangeMediaSettings(SignalingCommandChangeMediaSettings signalingCommandChangeMediaSettings) {
        this.a = signalingCommandChangeMediaSettings;
    }

    @Override // ru.ok.android.webrtc.signaling.command.merge.SignalingCommandMerge
    public SignalingCommandMerge.Result mergeWith(SignalingCommand signalingCommand) {
        return signalingCommand instanceof SignalingCommandChangeMediaSettings ? new SignalingCommandMerge.Result.Replace(this.a) : SignalingCommandMerge.Result.Continue.INSTANCE;
    }
}
