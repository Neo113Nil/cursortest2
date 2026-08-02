package ru.ok.android.externcalls.sdk.asr;

import ru.ok.android.externcalls.sdk.ConversationParticipant;

/* compiled from: AsrInfo.kt */
/* loaded from: classes9.dex */
public final class AsrInfo {
    private final ConversationParticipant initiator;
    private final Long movieId;

    public AsrInfo(ConversationParticipant conversationParticipant, Long l) {
        this.initiator = conversationParticipant;
        this.movieId = l;
    }

    public final ConversationParticipant getInitiator() {
        return this.initiator;
    }

    public final Long getMovieId() {
        return this.movieId;
    }
}
