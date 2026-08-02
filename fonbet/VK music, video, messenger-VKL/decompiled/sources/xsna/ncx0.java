package xsna;

import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStartedData;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStates;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStoppedData;

/* compiled from: WatchTogetherListener.kt */
/* loaded from: classes11.dex */
public interface ncx0 {
    default void onVideoStarted(MovieStartedData movieStartedData) {
    }

    default void onVideoStatesChanged(MovieStates movieStates) {
    }

    default void onVideoStopped(MovieStoppedData movieStoppedData) {
    }
}
