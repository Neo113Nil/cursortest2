package ru.ok.android.externcalls.sdk.stereo.internal.command;

import com.vk.movika.sdk.android.defaultplayer.interactive.c;
import java.util.List;
import ru.ok.android.webrtc.participant.CallParticipant;
import ru.ok.android.webrtc.participant.waiting.CallWaitingParticipantId;
import xsna.epx;
import xsna.gzs;
import xsna.izs;
import xsna.s3q0;
import xsna.yzs;

/* compiled from: StereoRoomCommandExecutor.kt */
/* loaded from: classes9.dex */
public interface StereoRoomCommandExecutor {

    /* compiled from: StereoRoomCommandExecutor.kt */
    public static final class AcceptPromotionParams {
        private final boolean reject;

        public AcceptPromotionParams(boolean z) {
            this.reject = z;
        }

        public static /* synthetic */ AcceptPromotionParams copy$default(AcceptPromotionParams acceptPromotionParams, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = acceptPromotionParams.reject;
            }
            return acceptPromotionParams.copy(z);
        }

        public final boolean component1() {
            return this.reject;
        }

        public final AcceptPromotionParams copy(boolean z) {
            return new AcceptPromotionParams(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AcceptPromotionParams) && this.reject == ((AcceptPromotionParams) obj).reject;
        }

        public final boolean getReject() {
            return this.reject;
        }

        public int hashCode() {
            return Boolean.hashCode(this.reject);
        }

        public String toString() {
            return c.a("AcceptPromotionParams(reject=", ")", this.reject);
        }
    }

    /* compiled from: StereoRoomCommandExecutor.kt */
    public static final class PromoteParticipantParams {
        private final CallParticipant.ParticipantId participantId;
        private final boolean promote;

        public PromoteParticipantParams(CallParticipant.ParticipantId participantId, boolean z) {
            this.participantId = participantId;
            this.promote = z;
        }

        public static /* synthetic */ PromoteParticipantParams copy$default(PromoteParticipantParams promoteParticipantParams, CallParticipant.ParticipantId participantId, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                participantId = promoteParticipantParams.participantId;
            }
            if ((i & 2) != 0) {
                z = promoteParticipantParams.promote;
            }
            return promoteParticipantParams.copy(participantId, z);
        }

        public final CallParticipant.ParticipantId component1() {
            return this.participantId;
        }

        public final boolean component2() {
            return this.promote;
        }

        public final PromoteParticipantParams copy(CallParticipant.ParticipantId participantId, boolean z) {
            return new PromoteParticipantParams(participantId, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PromoteParticipantParams)) {
                return false;
            }
            PromoteParticipantParams promoteParticipantParams = (PromoteParticipantParams) obj;
            return epx.f(this.participantId, promoteParticipantParams.participantId) && this.promote == promoteParticipantParams.promote;
        }

        public final CallParticipant.ParticipantId getParticipantId() {
            return this.participantId;
        }

        public final boolean getPromote() {
            return this.promote;
        }

        public int hashCode() {
            return Boolean.hashCode(this.promote) + (this.participantId.hashCode() * 31);
        }

        public String toString() {
            return "PromoteParticipantParams(participantId=" + this.participantId + ", promote=" + this.promote + ")";
        }
    }

    /* compiled from: StereoRoomCommandExecutor.kt */
    public static final class RequestPromotionParams {
        private final boolean unrequest;

        public RequestPromotionParams(boolean z) {
            this.unrequest = z;
        }

        public static /* synthetic */ RequestPromotionParams copy$default(RequestPromotionParams requestPromotionParams, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = requestPromotionParams.unrequest;
            }
            return requestPromotionParams.copy(z);
        }

        public final boolean component1() {
            return this.unrequest;
        }

        public final RequestPromotionParams copy(boolean z) {
            return new RequestPromotionParams(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RequestPromotionParams) && this.unrequest == ((RequestPromotionParams) obj).unrequest;
        }

        public final boolean getUnrequest() {
            return this.unrequest;
        }

        public int hashCode() {
            return Boolean.hashCode(this.unrequest);
        }

        public String toString() {
            return c.a("RequestPromotionParams(unrequest=", ")", this.unrequest);
        }
    }

    void acceptPromotion(AcceptPromotionParams acceptPromotionParams, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);

    void getHandsQueue(yzs<? super Integer, ? super Boolean, ? super List<CallWaitingParticipantId>, s3q0> yzsVar, izs<? super Throwable, s3q0> izsVar);

    void promoteParticipant(PromoteParticipantParams promoteParticipantParams, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);

    void requestPromotion(RequestPromotionParams requestPromotionParams, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);
}
