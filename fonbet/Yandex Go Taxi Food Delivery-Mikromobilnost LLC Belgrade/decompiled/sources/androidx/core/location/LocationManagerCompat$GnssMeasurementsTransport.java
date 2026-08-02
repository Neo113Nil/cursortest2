package androidx.core.location;

import android.location.GnssMeasurementsEvent;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
class LocationManagerCompat$GnssMeasurementsTransport extends GnssMeasurementsEvent.Callback {
    final GnssMeasurementsEvent.Callback mCallback;
    volatile Executor mExecutor;

    public LocationManagerCompat$GnssMeasurementsTransport(GnssMeasurementsEvent.Callback callback, Executor executor) {
        this.mCallback = callback;
        this.mExecutor = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onGnssMeasurementsReceived$0(Executor executor, GnssMeasurementsEvent gnssMeasurementsEvent) {
        if (this.mExecutor != executor) {
            return;
        }
        this.mCallback.onGnssMeasurementsReceived(gnssMeasurementsEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onStatusChanged$1(Executor executor, int i) {
        if (this.mExecutor != executor) {
            return;
        }
        this.mCallback.onStatusChanged(i);
    }

    @Override // android.location.GnssMeasurementsEvent.Callback
    public void onGnssMeasurementsReceived(GnssMeasurementsEvent gnssMeasurementsEvent) {
        Executor executor = this.mExecutor;
        if (executor == null) {
            return;
        }
        executor.execute(new c(this, executor, gnssMeasurementsEvent, 0));
    }

    @Override // android.location.GnssMeasurementsEvent.Callback
    public void onStatusChanged(int i) {
        Executor executor = this.mExecutor;
        if (executor == null) {
            return;
        }
        executor.execute(new d(this, executor, i, 0));
    }

    public void unregister() {
        this.mExecutor = null;
    }
}
