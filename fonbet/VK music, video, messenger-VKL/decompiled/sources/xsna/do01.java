package xsna;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Looper;
import android.os.UserHandle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes.dex */
public final class do01 extends v2u {
    public final HashMap e = new HashMap();
    public final Context f;
    public volatile com.google.android.gms.internal.common.zzg g;
    public final o4j h;
    public final long i;
    public final long j;

    public do01(Context context, Looper looper) {
        kn01 kn01Var = new kn01(this);
        this.f = context.getApplicationContext();
        this.g = new com.google.android.gms.internal.common.zzg(looper, kn01Var);
        this.h = o4j.b();
        this.i = 5000L;
        this.j = 300000L;
    }

    @Override // xsna.v2u
    public final ConnectionResult c(fm01 fm01Var, a801 a801Var, String str, @Nullable Executor executor) {
        HashMap hashMap = this.e;
        synchronized (hashMap) {
            try {
                tm01 tm01Var = (tm01) hashMap.get(fm01Var);
                ConnectionResult connectionResult = null;
                if (executor == null) {
                    executor = null;
                }
                if (tm01Var == null) {
                    tm01Var = new tm01(this, fm01Var);
                    tm01Var.b.put(a801Var, a801Var);
                    UserHandle userHandle = fm01Var.d;
                    connectionResult = (userHandle == null || Build.VERSION.SDK_INT < 33) ? tm01Var.a(executor, str) : tm01Var.c(userHandle);
                    hashMap.put(fm01Var, tm01Var);
                } else {
                    this.g.removeMessages(0, fm01Var);
                    if (tm01Var.b.containsKey(a801Var)) {
                        String fm01Var2 = fm01Var.toString();
                        StringBuilder sb = new StringBuilder(fm01Var2.length() + 81);
                        sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb.append(fm01Var2);
                        throw new IllegalStateException(sb.toString());
                    }
                    tm01Var.b.put(a801Var, a801Var);
                    int i = tm01Var.c;
                    if (i == 1) {
                        a801Var.onServiceConnected(tm01Var.g, tm01Var.e);
                    } else if (i == 2) {
                        UserHandle userHandle2 = fm01Var.d;
                        connectionResult = (userHandle2 == null || Build.VERSION.SDK_INT < 33) ? tm01Var.a(executor, str) : tm01Var.c(userHandle2);
                    }
                }
                if (tm01Var.d) {
                    return ConnectionResult.g;
                }
                if (connectionResult == null) {
                    connectionResult = new ConnectionResult(-1);
                }
                return connectionResult;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.v2u
    public final void d(fm01 fm01Var, ServiceConnection serviceConnection) {
        exc0.j(serviceConnection, "ServiceConnection must not be null");
        HashMap hashMap = this.e;
        synchronized (hashMap) {
            try {
                tm01 tm01Var = (tm01) hashMap.get(fm01Var);
                if (tm01Var == null) {
                    String fm01Var2 = fm01Var.toString();
                    StringBuilder sb = new StringBuilder(fm01Var2.length() + 50);
                    sb.append("Nonexistent connection status for service config: ");
                    sb.append(fm01Var2);
                    throw new IllegalStateException(sb.toString());
                }
                if (!tm01Var.b.containsKey(serviceConnection)) {
                    String fm01Var3 = fm01Var.toString();
                    StringBuilder sb2 = new StringBuilder(fm01Var3.length() + 76);
                    sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb2.append(fm01Var3);
                    throw new IllegalStateException(sb2.toString());
                }
                tm01Var.b.remove(serviceConnection);
                if (tm01Var.b.isEmpty()) {
                    this.g.sendMessageDelayed(this.g.obtainMessage(0, fm01Var), this.i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
