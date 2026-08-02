package ru.ok.android.webrtc.chatroom;

import com.vk.movika.sdk.android.defaultplayer.interactive.c;
import java.util.List;
import ru.ok.android.webrtc.feedback.CallFeedback;
import ru.ok.android.webrtc.participant.CallParticipant;
import xsna.epx;
import xsna.fw3;
import xsna.vp;
import xsna.zn;

/* loaded from: classes9.dex */
public interface CallChatRoomEvent {

    public static final class Attendee implements CallChatRoomEvent {
        public final int a;
        public final List b;
        public final List c;

        public Attendee(int i, List<CallParticipant.ParticipantId> list, List<CallParticipant.ParticipantId> list2) {
            this.a = i;
            this.b = list;
            this.c = list2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Attendee copy$default(Attendee attendee, int i, List list, List list2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = attendee.a;
            }
            if ((i2 & 2) != 0) {
                list = attendee.b;
            }
            if ((i2 & 4) != 0) {
                list2 = attendee.c;
            }
            return attendee.copy(i, list, list2);
        }

        public final int component1() {
            return this.a;
        }

        public final List<CallParticipant.ParticipantId> component2() {
            return this.b;
        }

        public final List<CallParticipant.ParticipantId> component3() {
            return this.c;
        }

        public final Attendee copy(int i, List<CallParticipant.ParticipantId> list, List<CallParticipant.ParticipantId> list2) {
            return new Attendee(i, list, list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Attendee)) {
                return false;
            }
            Attendee attendee = (Attendee) obj;
            return this.a == attendee.a && epx.f(this.b, attendee.b) && epx.f(this.c, attendee.c);
        }

        public final List<CallParticipant.ParticipantId> getAddedParticipantIds() {
            return this.b;
        }

        public final List<CallParticipant.ParticipantId> getRemovedParticipantIds() {
            return this.c;
        }

        public final int getTotalCount() {
            return this.a;
        }

        public int hashCode() {
            return this.c.hashCode() + fw3.a(Integer.hashCode(this.a) * 31, 31, this.b);
        }

        public String toString() {
            int i = this.a;
            List list = this.b;
            return vp.b(")", zn.c(i, "Attendee(totalCount=", ", addedParticipantIds=", ", removedParticipantIds=", list), this.c);
        }
    }

    public static final class Feedback implements CallChatRoomEvent {
        public final CallFeedback a;

        public Feedback(CallFeedback callFeedback) {
            this.a = callFeedback;
        }

        public static /* synthetic */ Feedback copy$default(Feedback feedback, CallFeedback callFeedback, int i, Object obj) {
            if ((i & 1) != 0) {
                callFeedback = feedback.a;
            }
            return feedback.copy(callFeedback);
        }

        public final CallFeedback component1() {
            return this.a;
        }

        public final Feedback copy(CallFeedback callFeedback) {
            return new Feedback(callFeedback);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Feedback) && epx.f(this.a, ((Feedback) obj).a);
        }

        public final CallFeedback getFeedback() {
            return this.a;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "Feedback(feedback=" + this.a + ")";
        }
    }

    public static final class HandUp implements CallChatRoomEvent {
        public final int a;
        public final List b;
        public final List c;

        public HandUp(int i, List<CallParticipant.ParticipantId> list, List<CallParticipant.ParticipantId> list2) {
            this.a = i;
            this.b = list;
            this.c = list2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HandUp copy$default(HandUp handUp, int i, List list, List list2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = handUp.a;
            }
            if ((i2 & 2) != 0) {
                list = handUp.b;
            }
            if ((i2 & 4) != 0) {
                list2 = handUp.c;
            }
            return handUp.copy(i, list, list2);
        }

        public final int component1() {
            return this.a;
        }

        public final List<CallParticipant.ParticipantId> component2() {
            return this.b;
        }

        public final List<CallParticipant.ParticipantId> component3() {
            return this.c;
        }

        public final HandUp copy(int i, List<CallParticipant.ParticipantId> list, List<CallParticipant.ParticipantId> list2) {
            return new HandUp(i, list, list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HandUp)) {
                return false;
            }
            HandUp handUp = (HandUp) obj;
            return this.a == handUp.a && epx.f(this.b, handUp.b) && epx.f(this.c, handUp.c);
        }

        public final List<CallParticipant.ParticipantId> getAddedParticipantIds() {
            return this.b;
        }

        public final List<CallParticipant.ParticipantId> getRemovedParticipantIds() {
            return this.c;
        }

        public final int getTotalCount() {
            return this.a;
        }

        public int hashCode() {
            return this.c.hashCode() + fw3.a(Integer.hashCode(this.a) * 31, 31, this.b);
        }

        public String toString() {
            int i = this.a;
            List list = this.b;
            return vp.b(")", zn.c(i, "HandUp(totalCount=", ", addedParticipantIds=", ", removedParticipantIds=", list), this.c);
        }
    }

    public static final class PromotionApproved implements CallChatRoomEvent {
        public final boolean a;

        public PromotionApproved(boolean z) {
            this.a = z;
        }

        public static /* synthetic */ PromotionApproved copy$default(PromotionApproved promotionApproved, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = promotionApproved.a;
            }
            return promotionApproved.copy(z);
        }

        public final boolean component1() {
            return this.a;
        }

        public final PromotionApproved copy(boolean z) {
            return new PromotionApproved(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PromotionApproved) && this.a == ((PromotionApproved) obj).a;
        }

        public final boolean getApproved() {
            return this.a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public String toString() {
            return c.a("PromotionApproved(approved=", ")", this.a);
        }
    }
}
