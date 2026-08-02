package xsna;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.1.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class de01 implements Runnable {
    public final /* synthetic */ dm01 b;

    public /* synthetic */ de01(dm01 dm01Var) {
        this.b = dm01Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            final dm01 dm01Var = this.b;
            synchronized (dm01Var) {
                try {
                    if (dm01Var.b != 2) {
                        return;
                    }
                    if (dm01Var.e.isEmpty()) {
                        dm01Var.l();
                        return;
                    }
                    final uo01 uo01Var = (uo01) dm01Var.e.poll();
                    dm01Var.f.put(uo01Var.a, uo01Var);
                    dm01Var.g.b.schedule(new Runnable() { // from class: xsna.lk01
                        @Override // java.lang.Runnable
                        public final void run() {
                            dm01 dm01Var2 = dm01.this;
                            int i = uo01Var.a;
                            synchronized (dm01Var2) {
                                uo01 uo01Var2 = (uo01) dm01Var2.f.get(i);
                                if (uo01Var2 != null) {
                                    dm01Var2.f.remove(i);
                                    uo01Var2.c(new com.google.android.gms.cloudmessaging.zzs("Timed out waiting for response", null));
                                    dm01Var2.l();
                                }
                            }
                        }
                    }, 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        "Sending ".concat(String.valueOf(uo01Var));
                    }
                    nq01 nq01Var = dm01Var.g;
                    Messenger messenger = dm01Var.c;
                    int i = uo01Var.c;
                    Context context = nq01Var.a;
                    Message obtain = Message.obtain();
                    obtain.what = i;
                    obtain.arg1 = uo01Var.a;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", uo01Var.b());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", uo01Var.d);
                    obtain.setData(bundle);
                    try {
                        jn01 jn01Var = dm01Var.d;
                        Messenger messenger2 = jn01Var.a;
                        if (messenger2 != null) {
                            messenger2.send(obtain);
                        } else {
                            com.google.android.gms.cloudmessaging.zze zzeVar = jn01Var.b;
                            if (zzeVar == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            zzeVar.a(obtain);
                        }
                    } catch (RemoteException e) {
                        dm01Var.f(e.getMessage());
                    }
                } finally {
                }
            }
        }
    }
}
