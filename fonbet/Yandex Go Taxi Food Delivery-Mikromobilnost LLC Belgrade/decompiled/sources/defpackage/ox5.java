package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class ox5 implements Executor {
    public final /* synthetic */ int a;
    public final Handler b;

    public ox5() {
        this.a = 0;
        this.b = new Handler(Looper.getMainLooper());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                this.b.post(runnable);
                break;
            default:
                this.b.post(runnable);
                break;
        }
    }

    public /* synthetic */ ox5(Handler handler) {
        this.a = 1;
        this.b = handler;
    }
}
