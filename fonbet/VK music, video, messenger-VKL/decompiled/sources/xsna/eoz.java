package xsna;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import xsna.sy70;

/* compiled from: LivesPublisherNetworkInfoProvider.kt */
/* loaded from: classes13.dex */
public final class eoz implements sy70.c {
    public final ConnectivityManager a;
    public final TelephonyManager b;

    public eoz(Context context) {
        this.a = (ConnectivityManager) context.getSystemService("connectivity");
        this.b = (TelephonyManager) context.getSystemService("phone");
    }

    @Override // xsna.sy70.c
    public final NetworkInfo a() {
        return this.a.getActiveNetworkInfo();
    }

    @Override // xsna.sy70.c
    public final String getNetworkOperatorName() {
        return this.b.getNetworkOperatorName();
    }
}
