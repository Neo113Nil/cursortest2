package ru.ok.android.externcalls.sdk.watch_together.internal.listener;

import ru.ok.android.externcalls.sdk.watch_together.listener.WatchTogetherListener;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStates;

/* compiled from: WatchTogetherListenerManager.kt */
/* loaded from: classes9.dex */
public interface WatchTogetherListenerManager {
    void addListener(WatchTogetherListener watchTogetherListener);

    MovieStates getMovieStates();

    void removeListener(WatchTogetherListener watchTogetherListener);
}
