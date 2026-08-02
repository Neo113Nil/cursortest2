package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Handler;
import android.os.Looper;
import ru.yandex.yx_platform_api.VpnStreamHandler$callback$1;

/* loaded from: classes7.dex */
public final class f041 implements zeo {
    public final ConnectivityManager a;
    public yeo b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final VpnStreamHandler$callback$1 w = new VpnStreamHandler$callback$1(this);
    public final NetworkRequest x = new NetworkRequest.Builder().addTransportType(4).removeCapability(15).build();

    public f041(Context context) {
        this.a = (ConnectivityManager) context.getSystemService("connectivity");
    }

    @Override // defpackage.zeo
    public final void onCancel(Object obj) {
        this.a.unregisterNetworkCallback(this.w);
        this.b = null;
    }

    @Override // defpackage.zeo
    public final void onListen(Object obj, xeo xeoVar) {
        this.b = (yeo) xeoVar;
        this.a.registerNetworkCallback(this.x, this.w);
    }
}
