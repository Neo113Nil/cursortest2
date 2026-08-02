package xsna;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes.dex */
public final class z001 extends com.google.android.gms.internal.common.zzg {
    public final /* synthetic */ rd6 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z001(rd6 rd6Var, Looper looper) {
        super(looper);
        this.a = rd6Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        y401 y401Var;
        rd6 rd6Var = this.a;
        if (rd6Var.zzd.get() != message.arg1) {
            int i = message.what;
            if ((i == 2 || i == 1 || i == 7) && (y401Var = (y401) message.obj) != null) {
                synchronized (y401Var) {
                    y401Var.a = null;
                }
                rd6 rd6Var2 = y401Var.c;
                synchronized (rd6Var2.zzj()) {
                    rd6Var2.zzj().remove(y401Var);
                }
                return;
            }
            return;
        }
        int i2 = message.what;
        if ((i2 == 1 || i2 == 7 || ((i2 == 4 && !rd6Var.enableLocalFallback()) || message.what == 5)) && !rd6Var.isConnecting()) {
            y401 y401Var2 = (y401) message.obj;
            if (y401Var2 != null) {
                synchronized (y401Var2) {
                    y401Var2.a = null;
                }
                rd6 rd6Var3 = y401Var2.c;
                synchronized (rd6Var3.zzj()) {
                    rd6Var3.zzj().remove(y401Var2);
                }
                return;
            }
            return;
        }
        int i3 = message.what;
        if (i3 == 4) {
            rd6Var.zzn(new ConnectionResult(message.arg2));
            if (rd6Var.zzg() && !rd6Var.zzo()) {
                rd6Var.zzd(3, null);
                return;
            }
            ConnectionResult zzm = rd6Var.zzm() != null ? rd6Var.zzm() : new ConnectionResult(8);
            rd6Var.zzc.a(zzm);
            rd6Var.onConnectionFailed(zzm);
            return;
        }
        if (i3 == 5) {
            ConnectionResult zzm2 = rd6Var.zzm() != null ? rd6Var.zzm() : new ConnectionResult(8);
            rd6Var.zzc.a(zzm2);
            rd6Var.onConnectionFailed(zzm2);
            return;
        }
        if (i3 == 3) {
            Object obj = message.obj;
            ConnectionResult connectionResult = new ConnectionResult(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            rd6Var.zzc.a(connectionResult);
            rd6Var.onConnectionFailed(connectionResult);
            return;
        }
        if (i3 == 6) {
            rd6Var.zzd(5, null);
            if (rd6Var.zzk() != null) {
                rd6Var.zzk().onConnectionSuspended(message.arg2);
            }
            rd6Var.onConnectionSuspended(message.arg2);
            rd6Var.zze(5, 1, null);
            return;
        }
        if (i3 == 2 && !rd6Var.isConnected()) {
            y401 y401Var3 = (y401) message.obj;
            if (y401Var3 != null) {
                synchronized (y401Var3) {
                    y401Var3.a = null;
                }
                rd6 rd6Var4 = y401Var3.c;
                synchronized (rd6Var4.zzj()) {
                    rd6Var4.zzj().remove(y401Var3);
                }
                return;
            }
            return;
        }
        int i4 = message.what;
        if (i4 != 2 && i4 != 1 && i4 != 7) {
            Log.wtf("GmsClient", z23.b(i4, "Don't know how to handle message: ", new StringBuilder(String.valueOf(i4).length() + 34)), new Exception());
            return;
        }
        y401 y401Var4 = (y401) message.obj;
        synchronized (y401Var4) {
            try {
                bool = y401Var4.a;
                if (y401Var4.b) {
                    new StringBuilder(y401Var4.toString().length() + 47);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            y401Var4.a(bool);
        }
        synchronized (y401Var4) {
            y401Var4.b = true;
        }
        synchronized (y401Var4) {
            y401Var4.a = null;
        }
        rd6 rd6Var5 = y401Var4.c;
        synchronized (rd6Var5.zzj()) {
            rd6Var5.zzj().remove(y401Var4);
        }
    }
}
