package xsna;

import java.util.concurrent.Executor;
import org.chromium.base.task.PostTask;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class kz3 implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        PostTask.postTask(1, runnable);
    }
}
