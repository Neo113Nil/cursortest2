package xsna;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import xsna.ky6;

/* compiled from: TimeProvider.kt */
@ozl
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes.dex */
public final class xuo0 {
    public static long c;
    public static volatile Context e;
    public static ky6 f;
    public static final xuo0 a = new xuo0();
    public static final bpn0 b = new bpn0(new q57(12));
    public static volatile boolean d = true;
    public static final bpn0 g = new bpn0(new xu2(11));

    /* compiled from: TimeProvider.kt */
    public static final class a extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            xuo0.a.getClass();
            xuo0.d = true;
        }
    }

    public static long a() {
        return b() ? qni0.a() : System.currentTimeMillis() - c;
    }

    public static boolean b() {
        return ((Boolean) g.getValue()).booleanValue();
    }

    public static long c() {
        return a() / 1000;
    }

    public static long d(long j) {
        return j + (b() ? qni0.h : c);
    }

    public static void e(long j) {
        if (b()) {
            qni0.a.getClass();
            qni0.e(j);
        } else {
            c = System.currentTimeMillis() - j;
            ky6 ky6Var = f;
            if (ky6Var != null) {
                ky6.a aVar = (ky6.a) ky6Var.edit();
                aVar.putLong("im_server_time_diff", c);
                aVar.apply();
            }
        }
        d = false;
        pvo0.q((int) c());
    }
}
