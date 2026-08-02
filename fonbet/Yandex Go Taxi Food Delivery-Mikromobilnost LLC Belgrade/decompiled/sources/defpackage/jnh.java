package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final /* synthetic */ class jnh implements Executor {
    public final /* synthetic */ int a;

    private final void a(Runnable runnable) {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                break;
            default:
                new Handler(Looper.getMainLooper()).post(runnable);
                break;
        }
    }
}
