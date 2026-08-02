package defpackage;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.work.WorkerParameters;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class kuy {
    private Context mAppContext;
    private final AtomicInteger mStopReason = new AtomicInteger(-256);
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    public kuy(Context context, WorkerParameters workerParameters) {
        this.mAppContext = context;
        this.mWorkerParams = workerParameters;
    }

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.f;
    }

    public abstract euy getForegroundInfoAsync();

    public final UUID getId() {
        return this.mWorkerParams.a;
    }

    public final ong getInputData() {
        return this.mWorkerParams.b;
    }

    public final Network getNetwork() {
        return this.mWorkerParams.d.c;
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.e;
    }

    public final int getStopReason() {
        return this.mStopReason.get();
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.c;
    }

    public btx0 getTaskExecutor() {
        return this.mWorkerParams.h;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return this.mWorkerParams.d.a;
    }

    public final List<Uri> getTriggeredContentUris() {
        return this.mWorkerParams.d.b;
    }

    public na51 getWorkerFactory() {
        return this.mWorkerParams.i;
    }

    public final boolean isStopped() {
        return this.mStopReason.get() != -256;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public void onStopped() {
    }

    public final euy setForegroundAsync(s2s s2sVar) {
        m951 m951Var = this.mWorkerParams.k;
        Context applicationContext = getApplicationContext();
        UUID id = getId();
        return jx81.r(new i3f(6, m951Var.a.a, "setForegroundAsync", new r8c0(m951Var, id, s2sVar, applicationContext, 18)));
    }

    public euy setProgressAsync(ong ongVar) {
        y951 y951Var = this.mWorkerParams.j;
        getApplicationContext();
        UUID id = getId();
        return jx81.r(new i3f(6, y951Var.b.a, "updateProgress", new wp01(10, y951Var, id, ongVar)));
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract euy startWork();

    public final void stop(int i) {
        if (this.mStopReason.compareAndSet(-256, i)) {
            onStopped();
        }
    }
}
