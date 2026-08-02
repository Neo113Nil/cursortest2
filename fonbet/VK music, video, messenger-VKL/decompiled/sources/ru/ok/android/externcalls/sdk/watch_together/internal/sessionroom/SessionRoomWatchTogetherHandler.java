package ru.ok.android.externcalls.sdk.watch_together.internal.sessionroom;

import java.util.Map;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayer;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieState;
import ru.ok.android.webrtc.listeners.CallSessionRoomsListener;
import ru.ok.android.webrtc.participant.movie.MovieId;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.epx;

/* compiled from: SessionRoomWatchTogetherHandler.kt */
/* loaded from: classes9.dex */
public final class SessionRoomWatchTogetherHandler implements CallSessionRoomsListener {
    private SessionRoomId roomId = SessionRoomId.MainCall.INSTANCE;
    private final ParticipantStore store;
    private final WatchTogetherPlayer watchTogetherManager;

    public SessionRoomWatchTogetherHandler(ParticipantStore participantStore, WatchTogetherPlayer watchTogetherPlayer) {
        this.store = participantStore;
        this.watchTogetherManager = watchTogetherPlayer;
    }

    private final void stopWatchTogetherForMe() {
        for (Map.Entry<MovieId, MovieState> entry : this.watchTogetherManager.getMovieStates().getStates().entrySet()) {
            MovieId key = entry.getKey();
            ParticipantId participantId = entry.getValue().getParticipantId();
            ConversationParticipant me2 = this.store.getMe();
            if (epx.f(participantId, me2 != null ? me2.getExternalId() : null)) {
                WatchTogetherPlayer.stop$default(this.watchTogetherManager, key, null, null, 6, null);
            }
        }
    }

    @Override // ru.ok.android.webrtc.listeners.CallSessionRoomsListener
    public void onCurrentParticipantActiveRoomChanged(CallSessionRoomsListener.ActiveRoomChangedParams activeRoomChangedParams) {
        if (!epx.f(this.roomId, activeRoomChangedParams.getRoomId())) {
            stopWatchTogetherForMe();
        }
        this.roomId = activeRoomChangedParams.getRoomId();
    }
}
