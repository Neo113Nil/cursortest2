package xsna;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes13.dex */
public final class ur01 implements ServiceConnection {
    public final /* synthetic */ as01 b;

    public /* synthetic */ ur01(as01 as01Var) {
        this.b = as01Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        as01 as01Var = this.b;
        as01Var.b.c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        as01Var.a().post(new tp01(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        as01 as01Var = this.b;
        as01Var.b.c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        as01Var.a().post(new jq01(this));
    }
}
