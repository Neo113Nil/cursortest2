package ru.ok.android.externcalls.sdk.stereo;

import io.reactivex.rxjava3.core.a;
import io.reactivex.rxjava3.core.b;
import io.reactivex.rxjava3.internal.operators.completable.e;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import xsna.cod0;
import xsna.i1l0;
import xsna.khc0;
import xsna.lph;
import xsna.mrc0;
import xsna.s1j0;
import xsna.sj7;
import xsna.sqk0;
import xsna.t1j0;
import xsna.xyf;

/* compiled from: StereoRoomManagerAdapters.kt */
/* loaded from: classes9.dex */
public final class StereoRoomManagerAdaptersKt {
    public static final a acceptPromotion(StereoRoomManager stereoRoomManager) {
        return new e(new mrc0(stereoRoomManager, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void acceptPromotion$lambda$0(StereoRoomManager stereoRoomManager, b bVar) {
        stereoRoomManager.acceptPromotion(new StereoRoomManagerAdaptersKt$acceptPromotion$1$1(bVar), new StereoRoomManagerAdaptersKt$acceptPromotion$1$2(bVar));
    }

    public static final a cancelPromotionRequest(StereoRoomManager stereoRoomManager) {
        return new e(new khc0(stereoRoomManager, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cancelPromotionRequest$lambda$0(StereoRoomManager stereoRoomManager, b bVar) {
        stereoRoomManager.cancelPromotionRequest(new StereoRoomManagerAdaptersKt$cancelPromotionRequest$1$1(bVar), new StereoRoomManagerAdaptersKt$cancelPromotionRequest$1$2(bVar));
    }

    public static final a grantAdmin(StereoRoomManager stereoRoomManager, ParticipantId participantId) {
        return new e(new cod0(stereoRoomManager, participantId));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void grantAdmin$lambda$0(StereoRoomManager stereoRoomManager, ParticipantId participantId, b bVar) {
        stereoRoomManager.grantAdmin(participantId, new StereoRoomManagerAdaptersKt$grantAdmin$1$1(bVar), new StereoRoomManagerAdaptersKt$grantAdmin$1$2(bVar));
    }

    public static final a promoteParticipant(StereoRoomManager stereoRoomManager, ParticipantId participantId) {
        return new e(new i1l0(stereoRoomManager, participantId));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void promoteParticipant$lambda$0(StereoRoomManager stereoRoomManager, ParticipantId participantId, b bVar) {
        stereoRoomManager.promoteParticipant(participantId, new StereoRoomManagerAdaptersKt$promoteParticipant$1$1(bVar), new StereoRoomManagerAdaptersKt$promoteParticipant$1$2(bVar));
    }

    public static final a rejectPromotion(StereoRoomManager stereoRoomManager) {
        return new e(new sqk0(stereoRoomManager, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rejectPromotion$lambda$0(StereoRoomManager stereoRoomManager, b bVar) {
        stereoRoomManager.rejectPromotion(new StereoRoomManagerAdaptersKt$rejectPromotion$1$1(bVar), new StereoRoomManagerAdaptersKt$rejectPromotion$1$2(bVar));
    }

    public static final a rejectPromotionRequest(StereoRoomManager stereoRoomManager, ParticipantId participantId) {
        return new e(new t1j0(stereoRoomManager, participantId));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void rejectPromotionRequest$lambda$0(StereoRoomManager stereoRoomManager, ParticipantId participantId, b bVar) {
        stereoRoomManager.rejectPromotionRequest(participantId, new StereoRoomManagerAdaptersKt$rejectPromotionRequest$1$1(bVar), new StereoRoomManagerAdaptersKt$rejectPromotionRequest$1$2(bVar));
    }

    public static final a requestPromotion(StereoRoomManager stereoRoomManager) {
        return new e(new s1j0(stereoRoomManager, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestPromotion$lambda$0(StereoRoomManager stereoRoomManager, b bVar) {
        stereoRoomManager.requestPromotion(new StereoRoomManagerAdaptersKt$requestPromotion$1$1(bVar), new StereoRoomManagerAdaptersKt$requestPromotion$1$2(bVar));
    }

    public static final a revokeAdmin(StereoRoomManager stereoRoomManager, ParticipantId participantId) {
        return new e(new lph(2, stereoRoomManager, participantId));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void revokeAdmin$lambda$0(StereoRoomManager stereoRoomManager, ParticipantId participantId, b bVar) {
        stereoRoomManager.revokeAdmin(participantId, new StereoRoomManagerAdaptersKt$revokeAdmin$1$1(bVar), new StereoRoomManagerAdaptersKt$revokeAdmin$1$2(bVar));
    }

    public static final a revokePromotion(StereoRoomManager stereoRoomManager, ParticipantId participantId) {
        return new e(new xyf(stereoRoomManager, participantId));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void revokePromotion$lambda$0(StereoRoomManager stereoRoomManager, ParticipantId participantId, b bVar) {
        stereoRoomManager.revokePromotion(participantId, new StereoRoomManagerAdaptersKt$revokePromotion$1$1(bVar), new StereoRoomManagerAdaptersKt$revokePromotion$1$2(bVar));
    }

    public static final a unpromoteParticipant(StereoRoomManager stereoRoomManager, ParticipantId participantId) {
        return new e(new sj7(3, stereoRoomManager, participantId));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void unpromoteParticipant$lambda$0(StereoRoomManager stereoRoomManager, ParticipantId participantId, b bVar) {
        stereoRoomManager.unpromoteParticipant(participantId, new StereoRoomManagerAdaptersKt$unpromoteParticipant$1$1(bVar), new StereoRoomManagerAdaptersKt$unpromoteParticipant$1$2(bVar));
    }
}
