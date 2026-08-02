package ru.ok.android.externcalls.sdk.stereo;

import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.stereo.hands.StereoRoomHandsQueue;
import ru.ok.android.externcalls.sdk.stereo.listener.StereoRoomListenerManager;
import xsna.gzs;
import xsna.izs;
import xsna.s3q0;

/* compiled from: StereoRoomManager.kt */
/* loaded from: classes9.dex */
public interface StereoRoomManager extends StereoRoomListenerManager {
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void acceptPromotion$default(StereoRoomManager stereoRoomManager, gzs gzsVar, izs izsVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: acceptPromotion");
        }
        if ((i & 2) != 0) {
            izsVar = null;
        }
        stereoRoomManager.acceptPromotion(gzsVar, izsVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void cancelPromotionRequest$default(StereoRoomManager stereoRoomManager, gzs gzsVar, izs izsVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancelPromotionRequest");
        }
        if ((i & 2) != 0) {
            izsVar = null;
        }
        stereoRoomManager.cancelPromotionRequest(gzsVar, izsVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void grantAdmin$default(StereoRoomManager stereoRoomManager, ParticipantId participantId, gzs gzsVar, izs izsVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: grantAdmin");
        }
        if ((i & 4) != 0) {
            izsVar = null;
        }
        stereoRoomManager.grantAdmin(participantId, gzsVar, izsVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void promoteParticipant$default(StereoRoomManager stereoRoomManager, ParticipantId participantId, gzs gzsVar, izs izsVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: promoteParticipant");
        }
        if ((i & 4) != 0) {
            izsVar = null;
        }
        stereoRoomManager.promoteParticipant(participantId, gzsVar, izsVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void rejectPromotion$default(StereoRoomManager stereoRoomManager, gzs gzsVar, izs izsVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rejectPromotion");
        }
        if ((i & 2) != 0) {
            izsVar = null;
        }
        stereoRoomManager.rejectPromotion(gzsVar, izsVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void rejectPromotionRequest$default(StereoRoomManager stereoRoomManager, ParticipantId participantId, gzs gzsVar, izs izsVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rejectPromotionRequest");
        }
        if ((i & 4) != 0) {
            izsVar = null;
        }
        stereoRoomManager.rejectPromotionRequest(participantId, gzsVar, izsVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void requestPromotion$default(StereoRoomManager stereoRoomManager, gzs gzsVar, izs izsVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestPromotion");
        }
        if ((i & 2) != 0) {
            izsVar = null;
        }
        stereoRoomManager.requestPromotion(gzsVar, izsVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void revokeAdmin$default(StereoRoomManager stereoRoomManager, ParticipantId participantId, gzs gzsVar, izs izsVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: revokeAdmin");
        }
        if ((i & 4) != 0) {
            izsVar = null;
        }
        stereoRoomManager.revokeAdmin(participantId, gzsVar, izsVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void revokePromotion$default(StereoRoomManager stereoRoomManager, ParticipantId participantId, gzs gzsVar, izs izsVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: revokePromotion");
        }
        if ((i & 4) != 0) {
            izsVar = null;
        }
        stereoRoomManager.revokePromotion(participantId, gzsVar, izsVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void unpromoteParticipant$default(StereoRoomManager stereoRoomManager, ParticipantId participantId, gzs gzsVar, izs izsVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unpromoteParticipant");
        }
        if ((i & 4) != 0) {
            izsVar = null;
        }
        stereoRoomManager.unpromoteParticipant(participantId, gzsVar, izsVar);
    }

    void acceptPromotion(gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);

    void cancelPromotionRequest(gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);

    StereoRoomHandsQueue getHandsQueue();

    void grantAdmin(ParticipantId participantId, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);

    boolean isMePromoted();

    void promoteParticipant(ParticipantId participantId, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);

    void rejectPromotion(gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);

    void rejectPromotionRequest(ParticipantId participantId, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);

    void requestPromotion(gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);

    void revokeAdmin(ParticipantId participantId, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);

    void revokePromotion(ParticipantId participantId, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);

    void unpromoteParticipant(ParticipantId participantId, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);
}
