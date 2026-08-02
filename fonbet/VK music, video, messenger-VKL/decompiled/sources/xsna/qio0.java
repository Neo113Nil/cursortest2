package xsna;

import android.view.Choreographer;
import java.util.concurrent.Executor;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class qio0 implements Executor {
    public final /* synthetic */ Choreographer b;

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        this.b.postFrameCallback(new Choreographer.FrameCallback() { // from class: xsna.rio0
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                runnable.run();
            }
        });
    }
}
