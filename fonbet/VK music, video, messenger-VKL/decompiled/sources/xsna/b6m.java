package xsna;

import android.content.Context;

/* compiled from: DeviceIdProvider.kt */
/* loaded from: classes.dex */
public final class b6m implements b9i {
    public static final /* synthetic */ b6m b = new b6m();
    public static bpn0 c;
    public static bpn0 d;

    public static final spl0 a() {
        bpn0 bpn0Var = c;
        if (bpn0Var == null) {
            bpn0Var = null;
        }
        return (spl0) bpn0Var.getValue();
    }

    public static final synchronized String b(Context context) {
        String b2;
        synchronized (b6m.class) {
            String str = m8f0.a;
            synchronized (m8f0.class) {
                b2 = m8f0.b(context);
            }
        }
        return b2;
    }

    public static final synchronized String d(Context context) {
        String b2;
        synchronized (b6m.class) {
            String str = m8f0.a;
            synchronized (m8f0.class) {
                b2 = m8f0.b(context);
            }
        }
        return b2;
    }

    public static final d6w0 e() {
        bpn0 bpn0Var = d;
        if (bpn0Var == null) {
            bpn0Var = null;
        }
        return (d6w0) bpn0Var.getValue();
    }

    @Override // xsna.b9i
    public Object c(lcg0 lcg0Var) {
        return new w801((qa01) lcg0Var.a(qa01.class), (m3q) lcg0Var.a(m3q.class));
    }
}
