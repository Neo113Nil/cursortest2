package xsna;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes13.dex */
public final class rvz0 implements ServiceConnection {
    public final /* synthetic */ uvz0 b;

    public /* synthetic */ rvz0(uvz0 uvz0Var) {
        this.b = uvz0Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        uvz0 uvz0Var = this.b;
        uvz0Var.b.d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        uvz0Var.a().post(new kuz0(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        uvz0 uvz0Var = this.b;
        uvz0Var.b.d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        uvz0Var.a().post(new zuz0(this));
    }
}
