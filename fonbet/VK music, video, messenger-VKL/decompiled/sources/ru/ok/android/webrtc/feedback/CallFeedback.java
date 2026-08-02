package ru.ok.android.webrtc.feedback;

import java.util.List;
import ru.ok.android.webrtc.participant.CallParticipant;

/* loaded from: classes9.dex */
public final class CallFeedback {
    public final int a;
    public final String b;
    public final List c;

    public CallFeedback(int i, String str, List<CallParticipant.ParticipantId> list) {
        this.a = i;
        this.b = str;
        this.c = list;
    }

    public final String getFeedbackId() {
        return this.b;
    }

    public final List<CallParticipant.ParticipantId> getParticipantIds() {
        return this.c;
    }

    public final int getTotalCount() {
        return this.a;
    }
}
