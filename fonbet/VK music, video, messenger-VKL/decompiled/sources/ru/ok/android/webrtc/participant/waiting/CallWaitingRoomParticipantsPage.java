package ru.ok.android.webrtc.participant.waiting;

import androidx.annotation.NonNull;
import java.util.List;

/* loaded from: classes9.dex */
public class CallWaitingRoomParticipantsPage {
    public final List a;
    public final boolean b;
    public final int c;

    public CallWaitingRoomParticipantsPage(@NonNull List<CallWaitingParticipant> list, int i, boolean z) {
        this.a = list;
        this.c = i;
        this.b = z;
    }

    @NonNull
    public List<CallWaitingParticipant> getParticipants() {
        return this.a;
    }

    public int getTotalCount() {
        return this.c;
    }

    public boolean hasMore() {
        return this.b;
    }
}
