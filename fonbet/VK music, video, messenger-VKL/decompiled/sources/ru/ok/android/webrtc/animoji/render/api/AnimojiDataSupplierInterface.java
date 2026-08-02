package ru.ok.android.webrtc.animoji.render.api;

import ru.ok.android.webrtc.animoji.util.AnimojiChannelBehavior;
import ru.ok.android.webrtc.participant.CallParticipant;
import xsna.gzs;
import xsna.izs;
import xsna.s3q0;

/* loaded from: classes9.dex */
public interface AnimojiDataSupplierInterface {

    public static final class Disabled implements AnimojiDataSupplierInterface {
        public static final Disabled INSTANCE = new Disabled();

        @Override // ru.ok.android.webrtc.animoji.render.api.AnimojiDataSupplierInterface
        /* renamed from: createRender, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ void mo363createRender(izs izsVar) {
            createRender((izs<? super AnimojiRenderInterface, s3q0>) izsVar);
        }

        @Override // ru.ok.android.webrtc.animoji.render.api.AnimojiDataSupplierInterface
        public boolean enabled() {
            return false;
        }

        @Override // ru.ok.android.webrtc.animoji.render.api.AnimojiDataSupplierInterface
        public AnimojiChannelBehavior getBehavior() {
            return AnimojiChannelBehavior.NONE;
        }

        @Override // ru.ok.android.webrtc.animoji.render.api.AnimojiDataSupplierInterface
        public String getLibPath() {
            throw new UnsupportedOperationException("noop supplier");
        }

        @Override // ru.ok.android.webrtc.animoji.render.api.AnimojiDataSupplierInterface
        public String getModelPath() {
            throw new UnsupportedOperationException("noop supplier");
        }

        @Override // ru.ok.android.webrtc.animoji.render.api.AnimojiDataSupplierInterface
        public String getResourcePackPath() {
            throw new UnsupportedOperationException("noop supplier");
        }

        @Override // ru.ok.android.webrtc.animoji.render.api.AnimojiDataSupplierInterface
        public AnimojiSvgResource getSvg(CallParticipant.ParticipantId participantId) {
            throw new UnsupportedOperationException("noop supplier");
        }

        @Override // ru.ok.android.webrtc.animoji.render.api.AnimojiDataSupplierInterface
        public boolean requestResolveParticipantIdFromInternal(CallParticipant.ParticipantId participantId) {
            throw new UnsupportedOperationException("noop supplier");
        }

        public Void createRender(izs<? super AnimojiRenderInterface, s3q0> izsVar) {
            throw new UnsupportedOperationException("noop supplier");
        }

        @Override // ru.ok.android.webrtc.animoji.render.api.AnimojiDataSupplierInterface
        public void release() {
        }

        @Override // ru.ok.android.webrtc.animoji.render.api.AnimojiDataSupplierInterface
        public void addOnReadyCallback(gzs<s3q0> gzsVar) {
        }

        @Override // ru.ok.android.webrtc.animoji.render.api.AnimojiDataSupplierInterface
        public void handleAnimojiChanged(CallParticipant.ParticipantId participantId) {
        }
    }

    void addOnReadyCallback(gzs<s3q0> gzsVar);

    /* renamed from: createRender */
    void mo363createRender(izs<? super AnimojiRenderInterface, s3q0> izsVar);

    boolean enabled();

    AnimojiChannelBehavior getBehavior();

    String getLibPath();

    String getModelPath();

    String getResourcePackPath();

    AnimojiSvgResource getSvg(CallParticipant.ParticipantId participantId);

    void handleAnimojiChanged(CallParticipant.ParticipantId participantId);

    void release();

    boolean requestResolveParticipantIdFromInternal(CallParticipant.ParticipantId participantId);
}
