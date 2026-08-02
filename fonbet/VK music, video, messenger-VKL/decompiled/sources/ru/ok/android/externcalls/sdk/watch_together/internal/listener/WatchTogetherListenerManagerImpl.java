package ru.ok.android.externcalls.sdk.watch_together.internal.listener;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.watch_together.listener.WatchTogetherListener;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStartedData;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieState;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStates;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStoppedData;
import ru.ok.android.webrtc.participant.movie.Movie;
import ru.ok.android.webrtc.participant.movie.MovieId;
import ru.ok.android.webrtc.participant.movie.MoviePosition;
import ru.ok.android.webrtc.participant.movie.MovieSourceType;
import ru.ok.android.webrtc.participant.movie.MovieSourceTypeExtensionsKt;
import ru.ok.android.webrtc.participant.movie.MovieVolume;
import ru.ok.android.webrtc.watch_together.MovieStartInfo;
import ru.ok.android.webrtc.watch_together.MovieStateUpdate;
import ru.ok.android.webrtc.watch_together.MovieStateUpdates;
import ru.ok.android.webrtc.watch_together.MovieStopInfo;
import xsna.epx;
import xsna.i6k;
import xsna.jgp;
import xsna.s3q0;

/* compiled from: WatchTogetherListenerManagerImpl.kt */
/* loaded from: classes9.dex */
public final class WatchTogetherListenerManagerImpl implements WatchTogetherListenerManager {
    private final ParticipantStore participantsStorage;
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    private volatile MovieStates movieStates = new MovieStates(jgp.b);
    private final CopyOnWriteArraySet<WatchTogetherListener> listeners = new CopyOnWriteArraySet<>();

    public WatchTogetherListenerManagerImpl(ParticipantStore participantStore) {
        this.participantsStorage = participantStore;
    }

    private final MoviePosition getPosition(Long l) {
        return (l == null || l.longValue() < 0) ? MoviePosition.Undefined.INSTANCE : new MoviePosition.Defined(l.longValue(), TimeUnit.SECONDS);
    }

    private final void sendActualState(WatchTogetherListener watchTogetherListener) {
        this.mainHandler.post(new i6k(8, this, watchTogetherListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendActualState$lambda$0(WatchTogetherListenerManagerImpl watchTogetherListenerManagerImpl, WatchTogetherListener watchTogetherListener) {
        if (watchTogetherListenerManagerImpl.listeners.contains(watchTogetherListener) && !watchTogetherListenerManagerImpl.movieStates.getStates().isEmpty()) {
            watchTogetherListener.onVideoStatesChanged(watchTogetherListenerManagerImpl.movieStates);
        }
    }

    private final void sendActualStateToAll() {
        Iterator<WatchTogetherListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onVideoStatesChanged(this.movieStates);
        }
    }

    private final void updateState(MovieStateUpdates movieStateUpdates) {
        MovieSourceType movieSourceType;
        Object obj;
        HashMap hashMap = new HashMap();
        for (MovieStateUpdate movieStateUpdate : movieStateUpdates.getUpdates()) {
            ConversationParticipant byInternal = this.participantsStorage.getByInternal(movieStateUpdate.getTrackKey().getParticipantId());
            if (byInternal != null) {
                ParticipantId externalId = byInternal.getExternalId();
                MovieId movieId = movieStateUpdate.getTrackKey().getMovieId();
                if (movieId != null && (movieSourceType = MovieSourceTypeExtensionsKt.toMovieSourceType(movieStateUpdate.getTrackKey().getType())) != null) {
                    Iterator<T> it = byInternal.getMovies().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        Movie movie = (Movie) obj;
                        if (movie.getSourceType() == movieSourceType && epx.f(movie.getMovieId(), movieId)) {
                            break;
                        }
                    }
                    Movie movie2 = (Movie) obj;
                    hashMap.put(movieId, new MovieState(externalId, getPosition(movieStateUpdate.getPosition()), !movieStateUpdate.isPaused(), MovieVolume.m365constructorimpl(movieStateUpdate.getVolume()), movieStateUpdate.isMuted(), movie2, null));
                    if (!this.movieStates.getStates().containsKey(movieId) && movie2 != null) {
                        MovieStartedData movieStartedData = new MovieStartedData(externalId, this.participantsStorage.getActiveRoomId(), movie2);
                        Iterator<T> it2 = this.listeners.iterator();
                        while (it2.hasNext()) {
                            ((WatchTogetherListener) it2.next()).onVideoStarted(movieStartedData);
                        }
                    }
                }
            }
        }
        this.movieStates = this.movieStates.copy(hashMap);
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.internal.listener.WatchTogetherListenerManager
    public void addListener(WatchTogetherListener watchTogetherListener) {
        this.listeners.add(watchTogetherListener);
        sendActualState(watchTogetherListener);
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.internal.listener.WatchTogetherListenerManager
    public MovieStates getMovieStates() {
        return this.movieStates;
    }

    public final void onVideoStarted(MovieStartInfo movieStartInfo) {
        ConversationParticipant byInternal = this.participantsStorage.getByInternal(movieStartInfo.getInitiatorId());
        if (byInternal != null) {
            Movie movie = movieStartInfo.getMovie();
            ParticipantId externalId = byInternal.getExternalId();
            MovieStates movieStates = this.movieStates;
            LinkedHashMap linkedHashMap = new LinkedHashMap(this.movieStates.getStates());
            linkedHashMap.put(movie.getMovieId(), new MovieState(externalId, MoviePosition.Undefined.INSTANCE, true, MovieVolume.Companion.m376getMUTED_pGdNCs(), true, movie, null));
            s3q0 s3q0Var = s3q0.a;
            this.movieStates = movieStates.copy(linkedHashMap);
            MovieStartedData movieStartedData = new MovieStartedData(byInternal.getExternalId(), movieStartInfo.getRoomId(), movie);
            Iterator<T> it = this.listeners.iterator();
            while (it.hasNext()) {
                ((WatchTogetherListener) it.next()).onVideoStarted(movieStartedData);
            }
        }
    }

    public final void onVideoStatesUpdatedChanged(MovieStateUpdates movieStateUpdates) {
        updateState(movieStateUpdates);
        sendActualStateToAll();
    }

    public final void onVideoStopped(MovieStopInfo movieStopInfo) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.movieStates.getStates());
        MovieState movieState = (MovieState) linkedHashMap.remove(movieStopInfo.getMovieId());
        this.movieStates = this.movieStates.copy(linkedHashMap);
        if (movieState != null) {
            MovieStoppedData movieStoppedData = new MovieStoppedData(movieState.getParticipantId(), movieStopInfo.getRoomId(), movieStopInfo.getMovieId(), movieStopInfo.getSourceType());
            Iterator<T> it = this.listeners.iterator();
            while (it.hasNext()) {
                ((WatchTogetherListener) it.next()).onVideoStopped(movieStoppedData);
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.internal.listener.WatchTogetherListenerManager
    public void removeListener(WatchTogetherListener watchTogetherListener) {
        this.listeners.remove(watchTogetherListener);
    }
}
