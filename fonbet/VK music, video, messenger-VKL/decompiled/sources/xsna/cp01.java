package xsna;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: com.google.android.play:review@@2.0.0 */
/* loaded from: classes13.dex */
public final class cp01 implements ServiceConnection {
    public final /* synthetic */ up01 b;

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        up01 up01Var = this.b;
        up01Var.b.a("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        up01Var.a().post(new bn01(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        up01 up01Var = this.b;
        up01Var.b.a("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        up01Var.a().post(new un01(this));
    }
}
