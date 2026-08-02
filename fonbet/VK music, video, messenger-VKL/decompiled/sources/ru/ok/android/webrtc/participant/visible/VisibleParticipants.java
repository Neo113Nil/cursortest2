package ru.ok.android.webrtc.participant.visible;

import androidx.annotation.NonNull;
import java.util.Set;
import ru.ok.android.webrtc.participant.CallParticipant;

/* loaded from: classes9.dex */
public class VisibleParticipants {
    public final Set a;
    public final Set b;
    public final Set c;

    public VisibleParticipants(@NonNull Set<CallParticipant.ParticipantId> set, @NonNull Set<CallParticipant.ParticipantId> set2, @NonNull Set<CallParticipant.ParticipantId> set3) {
        this.a = set;
        this.b = set2;
        this.c = set3;
    }

    @NonNull
    public Set<CallParticipant.ParticipantId> getParticipantsWithVisibleAnimoji() {
        return this.c;
    }

    @NonNull
    public Set<CallParticipant.ParticipantId> getParticipantsWithVisibleScreenShare() {
        return this.b;
    }

    @NonNull
    public Set<CallParticipant.ParticipantId> getParticipantsWithVisibleVideo() {
        return this.a;
    }
}
