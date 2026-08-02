package xsna;

import java.util.concurrent.Executor;

/* compiled from: MainExecutor.kt */
/* loaded from: classes3.dex */
public final class je00 implements Executor {
    public static final je00 b = new je00();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        io.reactivex.rxjava3.android.schedulers.a.b().c(runnable);
    }
}
