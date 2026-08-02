package xsna;

import androidx.annotation.NonNull;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.perf.v1.ApplicationProcessState;
import java.lang.ref.WeakReference;
import xsna.u93;

/* compiled from: AppStateUpdateHandler.java */
/* loaded from: classes13.dex */
public abstract class y93 implements u93.b {
    private final WeakReference<u93.b> appStateCallback;
    private final u93 appStateMonitor;
    private ApplicationProcessState currentAppState;
    private boolean isRegisteredForAppState;

    public y93() {
        this(u93.a());
    }

    public ApplicationProcessState getAppState() {
        return this.currentAppState;
    }

    @VisibleForTesting
    public WeakReference<u93.b> getAppStateCallback() {
        return this.appStateCallback;
    }

    public void incrementTsnsCount(int i) {
        this.appStateMonitor.i.addAndGet(i);
    }

    @Override // xsna.u93.b
    public void onUpdateAppState(ApplicationProcessState applicationProcessState) {
        ApplicationProcessState applicationProcessState2 = this.currentAppState;
        ApplicationProcessState applicationProcessState3 = ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN;
        if (applicationProcessState2 == applicationProcessState3) {
            this.currentAppState = applicationProcessState;
        } else {
            if (applicationProcessState2 == applicationProcessState || applicationProcessState == applicationProcessState3) {
                return;
            }
            this.currentAppState = ApplicationProcessState.FOREGROUND_BACKGROUND;
        }
    }

    public void registerForAppState() {
        if (this.isRegisteredForAppState) {
            return;
        }
        u93 u93Var = this.appStateMonitor;
        this.currentAppState = u93Var.p;
        WeakReference<u93.b> weakReference = this.appStateCallback;
        synchronized (u93Var.g) {
            u93Var.g.add(weakReference);
        }
        this.isRegisteredForAppState = true;
    }

    public void unregisterForAppState() {
        if (this.isRegisteredForAppState) {
            u93 u93Var = this.appStateMonitor;
            WeakReference<u93.b> weakReference = this.appStateCallback;
            synchronized (u93Var.g) {
                u93Var.g.remove(weakReference);
            }
            this.isRegisteredForAppState = false;
        }
    }

    public y93(@NonNull u93 u93Var) {
        this.isRegisteredForAppState = false;
        this.currentAppState = ApplicationProcessState.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.appStateMonitor = u93Var;
        this.appStateCallback = new WeakReference<>(this);
    }
}
