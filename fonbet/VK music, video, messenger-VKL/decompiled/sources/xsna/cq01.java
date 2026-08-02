package xsna;

import android.os.Bundle;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.1.0 */
/* loaded from: classes.dex */
public final class cq01 extends uo01 {
    @Override // xsna.uo01
    public final void a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            toString();
            String.valueOf(bundle2);
        }
        this.b.setResult(bundle2);
    }

    @Override // xsna.uo01
    public final boolean b() {
        return false;
    }
}
