package xsna;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes.dex */
public final class kn01 implements Handler.Callback {
    public final /* synthetic */ do01 b;

    public /* synthetic */ kn01(do01 do01Var) {
        this.b = do01Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            do01 do01Var = this.b;
            synchronized (do01Var.e) {
                try {
                    fm01 fm01Var = (fm01) message.obj;
                    tm01 tm01Var = (tm01) do01Var.e.get(fm01Var);
                    if (tm01Var != null && tm01Var.b.isEmpty()) {
                        if (tm01Var.d) {
                            fm01 fm01Var2 = tm01Var.f;
                            do01 do01Var2 = tm01Var.h;
                            do01Var2.g.removeMessages(1, fm01Var2);
                            do01Var2.h.c(do01Var2.f, tm01Var);
                            tm01Var.d = false;
                            tm01Var.c = 2;
                        }
                        do01Var.e.remove(fm01Var);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        do01 do01Var3 = this.b;
        synchronized (do01Var3.e) {
            try {
                fm01 fm01Var3 = (fm01) message.obj;
                tm01 tm01Var2 = (tm01) do01Var3.e.get(fm01Var3);
                if (tm01Var2 != null && tm01Var2.c == 3) {
                    String valueOf = String.valueOf(fm01Var3);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName componentName = tm01Var2.g;
                    if (componentName == null) {
                        fm01Var3.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = fm01Var3.b;
                        exc0.i(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    tm01Var2.onServiceDisconnected(componentName);
                }
            } finally {
            }
        }
        return true;
    }
}
