package defpackage;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import ru.yandex.taxi.location.lbs.gsm.GsmCellsInteractorImpl$requestCellInfos$2$callback$1;

/* loaded from: classes.dex */
public final class k3f implements Executor {
    public final /* synthetic */ int a;
    public final Executor b;
    public final Object c;
    public Object w;

    public k3f(ExecutorService executorService) {
        this.a = 0;
        this.c = new Object();
        this.w = udq0.p(null);
        this.b = executorService;
    }

    public Task a(Runnable runnable) {
        Task i;
        synchronized (this.c) {
            i = ((Task) this.w).i((ExecutorService) this.b, new s59(runnable));
            this.w = i;
        }
        return i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.a;
        Executor executor = this.b;
        switch (i) {
            case 0:
                ((ExecutorService) executor).execute(runnable);
                break;
            default:
                executor.execute(new r94(7, runnable, (n3u) this.w, this));
                break;
        }
    }

    public k3f(n3u n3uVar, Executor executor, GsmCellsInteractorImpl$requestCellInfos$2$callback$1 gsmCellsInteractorImpl$requestCellInfos$2$callback$1) {
        this.a = 1;
        this.w = n3uVar;
        this.b = executor;
        this.c = gsmCellsInteractorImpl$requestCellInfos$2$callback$1;
    }
}
