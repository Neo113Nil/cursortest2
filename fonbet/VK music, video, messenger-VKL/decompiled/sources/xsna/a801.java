package xsna;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes.dex */
public final class a801 implements ServiceConnection {
    public final int b;
    public final /* synthetic */ rd6 c;

    public a801(rd6 rd6Var, int i) {
        this.c = rd6Var;
        this.b = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        rd6 rd6Var = this.c;
        if (iBinder == null) {
            rd6Var.zzf(16);
            return;
        }
        synchronized (rd6Var.zzh()) {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                rd6Var.zzi((queryLocalInterface == null || !(queryLocalInterface instanceof cnv)) ? new ztz0(iBinder) : (cnv) queryLocalInterface);
            } catch (Throwable th) {
                throw th;
            }
        }
        this.c.zzb(0, null, this.b);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        rd6 rd6Var = this.c;
        synchronized (rd6Var.zzh()) {
            rd6Var.zzi(null);
        }
        rd6 rd6Var2 = this.c;
        int i = this.b;
        Handler handler = rd6Var2.zzb;
        handler.sendMessage(handler.obtainMessage(6, i, 1));
    }
}
