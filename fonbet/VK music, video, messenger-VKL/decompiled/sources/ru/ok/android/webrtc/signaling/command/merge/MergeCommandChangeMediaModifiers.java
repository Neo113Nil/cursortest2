package ru.ok.android.webrtc.signaling.command.merge;

import ru.ok.android.webrtc.signaling.command.SignalingCommand;
import ru.ok.android.webrtc.signaling.command.SignalingCommandChangeMediaModifiers;
import ru.ok.android.webrtc.signaling.command.merge.SignalingCommandMerge;

/* loaded from: classes9.dex */
public final class MergeCommandChangeMediaModifiers extends SignalingCommandMerge {
    public final SignalingCommandChangeMediaModifiers a;

    public MergeCommandChangeMediaModifiers(SignalingCommandChangeMediaModifiers signalingCommandChangeMediaModifiers) {
        this.a = signalingCommandChangeMediaModifiers;
    }

    @Override // ru.ok.android.webrtc.signaling.command.merge.SignalingCommandMerge
    public SignalingCommandMerge.Result mergeWith(SignalingCommand signalingCommand) {
        return signalingCommand instanceof SignalingCommandChangeMediaModifiers ? new SignalingCommandMerge.Result.Replace(this.a) : SignalingCommandMerge.Result.Continue.INSTANCE;
    }
}
