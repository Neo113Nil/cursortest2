package xsna;

import android.location.Location;
import android.os.Bundle;
import com.vk.reefton.literx.observable.ObservableCreate;
import xsna.vnf0;

/* compiled from: ReefLocationObservableOnSubscribe.kt */
/* loaded from: classes5.dex */
public final class wnf0 extends vnf0.a {
    public final /* synthetic */ ObservableCreate.CreateEmitter a;

    public wnf0(ObservableCreate.CreateEmitter createEmitter) {
        this.a = createEmitter;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        ObservableCreate.CreateEmitter createEmitter = this.a;
        if (createEmitter.get()) {
            return;
        }
        createEmitter.b(location);
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
        ObservableCreate.CreateEmitter createEmitter = this.a;
        if (createEmitter.get()) {
            return;
        }
        createEmitter.a(new Exception("Provider disabled."));
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i, Bundle bundle) {
        ObservableCreate.CreateEmitter createEmitter = this.a;
        if (createEmitter.get() || i != 0) {
            return;
        }
        createEmitter.a(new Exception("Provider out of service."));
    }
}
