package yads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class fn0 implements Executor {
    public final /* synthetic */ Handler a;

    public fn0(Handler handler) {
        this.a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.post(runnable);
    }
}
