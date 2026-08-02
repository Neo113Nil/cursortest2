package ru.ok.android.externcalls.sdk.stereo.listener;

import com.vk.movika.sdk.android.defaultplayer.interactive.c;
import java.util.List;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.stereo.hands.StereoHandQueueItem;
import xsna.epx;
import xsna.fw3;
import xsna.pn;
import xsna.vp;
import xsna.zn;

/* compiled from: StereoRoomManagerListener.kt */
/* loaded from: classes9.dex */
public interface StereoRoomManagerListener {

    /* compiled from: StereoRoomManagerListener.kt */
    public static final class HandStatusUpdated {
        private final List<StereoHandQueueItem> raisedHands;
        private final int totalCount;

        public HandStatusUpdated(int i, List<StereoHandQueueItem> list) {
            this.totalCount = i;
            this.raisedHands = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HandStatusUpdated copy$default(HandStatusUpdated handStatusUpdated, int i, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = handStatusUpdated.totalCount;
            }
            if ((i2 & 2) != 0) {
                list = handStatusUpdated.raisedHands;
            }
            return handStatusUpdated.copy(i, list);
        }

        public final int component1() {
            return this.totalCount;
        }

        public final List<StereoHandQueueItem> component2() {
            return this.raisedHands;
        }

        public final HandStatusUpdated copy(int i, List<StereoHandQueueItem> list) {
            return new HandStatusUpdated(i, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HandStatusUpdated)) {
                return false;
            }
            HandStatusUpdated handStatusUpdated = (HandStatusUpdated) obj;
            return this.totalCount == handStatusUpdated.totalCount && epx.f(this.raisedHands, handStatusUpdated.raisedHands);
        }

        public final List<StereoHandQueueItem> getRaisedHands() {
            return this.raisedHands;
        }

        public final int getTotalCount() {
            return this.totalCount;
        }

        public int hashCode() {
            return this.raisedHands.hashCode() + (Integer.hashCode(this.totalCount) * 31);
        }

        public String toString() {
            return pn.c(this.totalCount, "HandStatusUpdated(totalCount=", ", raisedHands=", ")", this.raisedHands);
        }
    }

    /* compiled from: StereoRoomManagerListener.kt */
    public static final class ListenersUpdated {
        private final List<ParticipantId> addedParticipantIds;
        private final List<ParticipantId> removedParticipantIds;
        private final int totalCount;

        public ListenersUpdated(int i, List<ParticipantId> list, List<ParticipantId> list2) {
            this.totalCount = i;
            this.addedParticipantIds = list;
            this.removedParticipantIds = list2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ListenersUpdated copy$default(ListenersUpdated listenersUpdated, int i, List list, List list2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = listenersUpdated.totalCount;
            }
            if ((i2 & 2) != 0) {
                list = listenersUpdated.addedParticipantIds;
            }
            if ((i2 & 4) != 0) {
                list2 = listenersUpdated.removedParticipantIds;
            }
            return listenersUpdated.copy(i, list, list2);
        }

        public final int component1() {
            return this.totalCount;
        }

        public final List<ParticipantId> component2() {
            return this.addedParticipantIds;
        }

        public final List<ParticipantId> component3() {
            return this.removedParticipantIds;
        }

        public final ListenersUpdated copy(int i, List<ParticipantId> list, List<ParticipantId> list2) {
            return new ListenersUpdated(i, list, list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ListenersUpdated)) {
                return false;
            }
            ListenersUpdated listenersUpdated = (ListenersUpdated) obj;
            return this.totalCount == listenersUpdated.totalCount && epx.f(this.addedParticipantIds, listenersUpdated.addedParticipantIds) && epx.f(this.removedParticipantIds, listenersUpdated.removedParticipantIds);
        }

        public final List<ParticipantId> getAddedParticipantIds() {
            return this.addedParticipantIds;
        }

        public final List<ParticipantId> getRemovedParticipantIds() {
            return this.removedParticipantIds;
        }

        public final int getTotalCount() {
            return this.totalCount;
        }

        public int hashCode() {
            return this.removedParticipantIds.hashCode() + fw3.a(Integer.hashCode(this.totalCount) * 31, 31, this.addedParticipantIds);
        }

        public String toString() {
            int i = this.totalCount;
            List<ParticipantId> list = this.addedParticipantIds;
            return vp.b(")", zn.c(i, "ListenersUpdated(totalCount=", ", addedParticipantIds=", ", removedParticipantIds=", list), this.removedParticipantIds);
        }
    }

    /* compiled from: StereoRoomManagerListener.kt */
    public static final class PromotionRequestUpdated {
        private final boolean approved;

        public PromotionRequestUpdated(boolean z) {
            this.approved = z;
        }

        public static /* synthetic */ PromotionRequestUpdated copy$default(PromotionRequestUpdated promotionRequestUpdated, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = promotionRequestUpdated.approved;
            }
            return promotionRequestUpdated.copy(z);
        }

        public final boolean component1() {
            return this.approved;
        }

        public final PromotionRequestUpdated copy(boolean z) {
            return new PromotionRequestUpdated(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PromotionRequestUpdated) && this.approved == ((PromotionRequestUpdated) obj).approved;
        }

        public final boolean getApproved() {
            return this.approved;
        }

        public int hashCode() {
            return Boolean.hashCode(this.approved);
        }

        public String toString() {
            return c.a("PromotionRequestUpdated(approved=", ")", this.approved);
        }
    }

    void onHandStatusChange(HandStatusUpdated handStatusUpdated);

    void onListenersChanged(ListenersUpdated listenersUpdated);

    void onOwnPromotionChanged(boolean z);

    void onPromotionRequestUpdated(PromotionRequestUpdated promotionRequestUpdated);
}
