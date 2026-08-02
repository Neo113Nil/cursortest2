package xsna;

import ru.ok.android.externcalls.sdk.watch_together.listener.WatchTogetherListener;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStartedData;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStates;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStoppedData;

/* compiled from: WatchTogetherListenerDelegate.kt */
/* loaded from: classes7.dex */
public final class ocx0 implements WatchTogetherListener {
    public final pcx0 a;

    public ocx0(pcx0 pcx0Var) {
        this.a = pcx0Var;
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.listener.WatchTogetherListener
    public final void onVideoStarted(MovieStartedData movieStartedData) {
        this.a.onVideoStarted(movieStartedData);
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.listener.WatchTogetherListener
    public final void onVideoStatesChanged(MovieStates movieStates) {
        this.a.onVideoStatesChanged(movieStates);
    }

    @Override // ru.ok.android.externcalls.sdk.watch_together.listener.WatchTogetherListener
    public final void onVideoStopped(MovieStoppedData movieStoppedData) {
        this.a.onVideoStopped(movieStoppedData);
    }
}
