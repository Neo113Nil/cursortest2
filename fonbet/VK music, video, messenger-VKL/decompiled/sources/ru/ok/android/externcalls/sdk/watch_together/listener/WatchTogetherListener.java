package ru.ok.android.externcalls.sdk.watch_together.listener;

import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStartedData;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStates;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStoppedData;

/* compiled from: WatchTogetherListener.kt */
/* loaded from: classes9.dex */
public interface WatchTogetherListener {
    void onVideoStarted(MovieStartedData movieStartedData);

    void onVideoStatesChanged(MovieStates movieStates);

    void onVideoStopped(MovieStoppedData movieStoppedData);
}
