package androidx.core.location;

import android.location.GnssStatus;
import defpackage.d6z;
import defpackage.vlt;

/* loaded from: classes10.dex */
class LocationManagerCompat$GnssStatusTransport extends GnssStatus.Callback {
    final vlt mCallback;

    public LocationManagerCompat$GnssStatusTransport(vlt vltVar) {
        d6z.m("invalid null callback", vltVar != null);
        this.mCallback = vltVar;
    }

    @Override // android.location.GnssStatus.Callback
    public void onFirstFix(int i) {
        this.mCallback.getClass();
    }

    @Override // android.location.GnssStatus.Callback
    public void onSatelliteStatusChanged(GnssStatus gnssStatus) {
        vlt vltVar = this.mCallback;
        gnssStatus.getClass();
        vltVar.getClass();
    }

    @Override // android.location.GnssStatus.Callback
    public void onStarted() {
        this.mCallback.getClass();
    }

    @Override // android.location.GnssStatus.Callback
    public void onStopped() {
        this.mCallback.getClass();
    }
}
