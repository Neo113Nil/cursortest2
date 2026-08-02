package xsna;

import java.lang.Thread;
import ru.ok.tracer.heap.dumps.HeapDumps;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class e1v implements Thread.UncaughtExceptionHandler {
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        HeapDumps.install$lambda$0(thread, th);
    }
}
