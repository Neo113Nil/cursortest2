package androidx.core.location;

import android.location.GnssStatus;
import defpackage.d6z;
import defpackage.vlt;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
class LocationManagerCompat$PreRGnssStatusTransport extends GnssStatus.Callback {
    final vlt mCallback;
    volatile Executor mExecutor;

    public LocationManagerCompat$PreRGnssStatusTransport(vlt vltVar) {
        d6z.m("invalid null callback", vltVar != null);
        this.mCallback = vltVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onFirstFix$2(Executor executor, int i) {
        if (this.mExecutor != executor) {
            return;
        }
        this.mCallback.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$onSatelliteStatusChanged$3(Executor executor, GnssStatus gnssStatus) {
        if (this.mExecutor != executor) {
            return;
        }
        vlt vltVar = this.mCallback;
        gnssStatus.getClass();
        vltVar.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onStarted$0(Executor executor) {
        if (this.mExecutor != executor) {
            return;
        }
        this.mCallback.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onStopped$1(Executor executor) {
        if (this.mExecutor != executor) {
            return;
        }
        this.mCallback.getClass();
    }

    @Override // android.location.GnssStatus.Callback
    public void onFirstFix(int i) {
        Executor executor = this.mExecutor;
        if (executor == null) {
            return;
        }
        executor.execute(new d(this, executor, i, 2));
    }

    @Override // android.location.GnssStatus.Callback
    public void onSatelliteStatusChanged(GnssStatus gnssStatus) {
        Executor executor = this.mExecutor;
        if (executor == null) {
            return;
        }
        executor.execute(new c(this, executor, gnssStatus, 2));
    }

    @Override // android.location.GnssStatus.Callback
    public void onStarted() {
        Executor executor = this.mExecutor;
        if (executor == null) {
            return;
        }
        executor.execute(new i(this, executor, 1));
    }

    @Override // android.location.GnssStatus.Callback
    public void onStopped() {
        Executor executor = this.mExecutor;
        if (executor == null) {
            return;
        }
        executor.execute(new i(this, executor, 0));
    }

    public void register(Executor executor) {
        d6z.m("invalid null executor", executor != null);
        d6z.y(null, this.mExecutor == null);
        this.mExecutor = executor;
    }

    public void unregister() {
        this.mExecutor = null;
    }
}
