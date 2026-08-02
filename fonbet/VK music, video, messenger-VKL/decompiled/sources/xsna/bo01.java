package xsna;

import android.os.Bundle;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.1.0 */
/* loaded from: classes12.dex */
public final class bo01 extends uo01 {
    public bo01(int i, int i2, Bundle bundle) {
        super(i, i2, bundle);
    }

    @Override // xsna.uo01
    public final void a(Bundle bundle) {
        if (!bundle.getBoolean("ack", false)) {
            c(new com.google.android.gms.cloudmessaging.zzs("Invalid response to one way request", null));
            return;
        }
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            toString();
        }
        this.b.setResult(null);
    }

    @Override // xsna.uo01
    public final boolean b() {
        return true;
    }
}
