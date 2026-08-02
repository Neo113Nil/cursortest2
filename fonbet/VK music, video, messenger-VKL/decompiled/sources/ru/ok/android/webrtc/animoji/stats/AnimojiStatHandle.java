package ru.ok.android.webrtc.animoji.stats;

import ru.ok.android.webrtc.participant.CallParticipant;

/* loaded from: classes9.dex */
public interface AnimojiStatHandle {
    void onDispatchBgColor(CallParticipant.ParticipantId participantId);

    void onDispatchFrame(CallParticipant.ParticipantId participantId);

    void onDispatchLandmarks(CallParticipant.ParticipantId participantId);

    void onLandmarksSenderCreated();

    void onMlLandmarks();

    void onMlParams(Boolean bool, String str);

    void onReceiverBytesReceived(int i);

    void onReceiverCreated();

    void onReceiverPackageReceived();

    void onRenderFrameDrawn(CallParticipant.ParticipantId participantId);

    void onRenderResolutionChanged(CallParticipant.ParticipantId participantId, int i, int i2);

    void onSenderBytesSend(int i);

    void onSenderPackageDropped();

    void onSenderPackageQueued();

    void onSenderPackageSent();

    public static final class Disabled implements AnimojiStatHandle {
        public static final Disabled INSTANCE = new Disabled();

        @Override // ru.ok.android.webrtc.animoji.stats.AnimojiStatHandle
        public void onLandmarksSenderCreated() {
        }

        @Override // ru.ok.android.webrtc.animoji.stats.AnimojiStatHandle
        public void onMlLandmarks() {
        }

        @Override // ru.ok.android.webrtc.animoji.stats.AnimojiStatHandle
        public void onReceiverCreated() {
        }

        @Override // ru.ok.android.webrtc.animoji.stats.AnimojiStatHandle
        public void onReceiverPackageReceived() {
        }

        @Override // ru.ok.android.webrtc.animoji.stats.AnimojiStatHandle
        public void onSenderPackageDropped() {
        }

        @Override // ru.ok.android.webrtc.animoji.stats.AnimojiStatHandle
        public void onSenderPackageQueued() {
        }

        @Override // ru.ok.android.webrtc.animoji.stats.AnimojiStatHandle
        public void onSenderPackageSent() {
        }

        @Override // ru.ok.android.webrtc.animoji.stats.AnimojiStatHandle
        public void onDispatchBgColor(CallParticipant.ParticipantId participantId) {
        }

        @Override // ru.ok.android.webrtc.animoji.stats.AnimojiStatHandle
        public void onDispatchFrame(CallParticipant.ParticipantId participantId) {
        }

        @Override // ru.ok.android.webrtc.animoji.stats.AnimojiStatHandle
        public void onDispatchLandmarks(CallParticipant.ParticipantId participantId) {
        }

        @Override // ru.ok.android.webrtc.animoji.stats.AnimojiStatHandle
        public void onReceiverBytesReceived(int i) {
        }

        @Override // ru.ok.android.webrtc.animoji.stats.AnimojiStatHandle
        public void onRenderFrameDrawn(CallParticipant.ParticipantId participantId) {
        }

        @Override // ru.ok.android.webrtc.animoji.stats.AnimojiStatHandle
        public void onSenderBytesSend(int i) {
        }

        @Override // ru.ok.android.webrtc.animoji.stats.AnimojiStatHandle
        public void onMlParams(Boolean bool, String str) {
        }

        @Override // ru.ok.android.webrtc.animoji.stats.AnimojiStatHandle
        public void onRenderResolutionChanged(CallParticipant.ParticipantId participantId, int i, int i2) {
        }
    }
}
