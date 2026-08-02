package xsna;

import android.content.res.TypedArray;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* compiled from: OnBackPressedCallback.kt */
/* loaded from: classes.dex */
public abstract class m180 {
    private boolean isEnabled;
    private final List<a> eventHandlers = new ArrayList();
    private final CopyOnWriteArrayList<AutoCloseable> closeables = new CopyOnWriteArrayList<>();

    /* compiled from: OnBackPressedCallback.kt */
    public static final class a extends ly50<ny50> {
        public final m180 f;
        public boolean g;

        public a(m180 m180Var, ny50 ny50Var) {
            super(ny50Var, m180Var.isEnabled());
            this.f = m180Var;
            this.g = true;
        }

        @Override // xsna.ly50
        public final void a() {
            this.f.handleOnBackCancelled();
        }

        @Override // xsna.ly50
        public final void b() {
            this.f.handleOnBackPressed();
        }

        @Override // xsna.ly50
        public final void c(hy50 hy50Var) {
            this.f.handleOnBackProgressed(new wu5(hy50Var));
        }

        @Override // xsna.ly50
        public final void d(hy50 hy50Var) {
            this.f.handleOnBackStarted(new wu5(hy50Var));
        }

        public final void g(boolean z) {
            this.g = z;
            f(z && this.f.isEnabled());
        }
    }

    public m180(boolean z) {
        this.isEnabled = z;
    }

    public final void addCloseable$activity(AutoCloseable autoCloseable) {
        this.closeables.add(autoCloseable);
    }

    public final a createNavigationEventHandler$activity(ny50 ny50Var) {
        a aVar = new a(this, ny50Var);
        this.eventHandlers.add(aVar);
        return aVar;
    }

    public abstract void handleOnBackPressed();

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final void remove() {
        boolean isTerminated;
        Iterator<AutoCloseable> it = this.closeables.iterator();
        while (it.hasNext()) {
            AutoCloseable next = it.next();
            if (next instanceof AutoCloseable) {
                next.close();
            } else if (next instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) next;
                if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                    executorService.shutdown();
                    boolean z = false;
                    while (!isTerminated) {
                        try {
                            isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (!z) {
                                executorService.shutdownNow();
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else if (next instanceof TypedArray) {
                ((TypedArray) next).recycle();
            } else {
                if (!(next instanceof MediaMetadataRetriever)) {
                    throw new IllegalArgumentException();
                }
                ((MediaMetadataRetriever) next).release();
            }
        }
        this.closeables.clear();
        Iterator<a> it2 = this.eventHandlers.iterator();
        while (it2.hasNext()) {
            it2.next().e();
        }
        this.eventHandlers.clear();
    }

    public final void removeCloseable$activity(AutoCloseable autoCloseable) {
        this.closeables.remove(autoCloseable);
    }

    public final void setEnabled(boolean z) {
        this.isEnabled = z;
        for (a aVar : this.eventHandlers) {
            aVar.f(aVar.g && z);
        }
    }

    public void handleOnBackCancelled() {
    }

    public void handleOnBackProgressed(wu5 wu5Var) {
    }

    public void handleOnBackStarted(wu5 wu5Var) {
    }
}
