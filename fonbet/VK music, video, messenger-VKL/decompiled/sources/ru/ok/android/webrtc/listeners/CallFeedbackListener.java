package ru.ok.android.webrtc.listeners;

import java.util.List;
import ru.ok.android.webrtc.feedback.CallFeedback;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;

/* loaded from: classes9.dex */
public interface CallFeedbackListener {

    public static final class Feedback {
        public final SessionRoomId a;
        public final List b;

        public Feedback(SessionRoomId sessionRoomId, List<CallFeedback> list) {
            this.a = sessionRoomId;
            this.b = list;
        }

        public final List<CallFeedback> getFeedbacks() {
            return this.b;
        }

        public final SessionRoomId getRoomId() {
            return this.a;
        }
    }

    void onFeedback(Feedback feedback);
}
