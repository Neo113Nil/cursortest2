package xsna;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* compiled from: NetworkDetectorCommon.kt */
@ozl
/* loaded from: classes2.dex */
public final class a360 implements y260 {
    public final bpn0 a;

    public a360(Context context) {
        this.a = new bpn0(new z260(context, 0));
    }

    @Override // xsna.y260
    public final boolean a() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.a.getValue()).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnectedOrConnecting();
            }
            return false;
        } catch (SecurityException unused) {
            return false;
        }
    }
}
