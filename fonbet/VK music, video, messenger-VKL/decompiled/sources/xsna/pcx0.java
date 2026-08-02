package xsna;

import com.vk.log.L;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStartedData;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStates;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieStoppedData;

/* compiled from: WatchTogetherListenerProxyImpl.kt */
/* loaded from: classes11.dex */
public final class pcx0 implements qcx0, ncx0 {
    public final CopyOnWriteArraySet<ncx0> b = new CopyOnWriteArraySet<>();

    @Override // xsna.qcx0
    public final void a(ncx0 ncx0Var) {
        c("removeWatchTogetherListener");
        this.b.remove(ncx0Var);
    }

    @Override // xsna.qcx0
    public final void b(ncx0 ncx0Var) {
        c("addWatchTogetherListener");
        this.b.add(ncx0Var);
    }

    public final void c(String str) {
        L.e("WatchTogetherListenerProxyImpl", fw3.d(this.b, ho8.b(str, " listeners: ")));
    }

    @Override // xsna.ncx0
    public final void onVideoStarted(MovieStartedData movieStartedData) {
        Iterator<ncx0> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().onVideoStarted(movieStartedData);
        }
    }

    @Override // xsna.ncx0
    public final void onVideoStatesChanged(MovieStates movieStates) {
        i0q0.i(0L, new po4(new p9s0(3, this, movieStates), 8));
    }

    @Override // xsna.ncx0
    public final void onVideoStopped(MovieStoppedData movieStoppedData) {
        Iterator<ncx0> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().onVideoStopped(movieStoppedData);
        }
    }
}
