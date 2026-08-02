package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes8.dex */
public final class Rl {
    public final Ba a = new Ba();
    public final HashMap b = new HashMap();
    public C5100pm c = null;
    public final Pl d = new Pl(this);

    public static final Rl a() {
        return Ql.a;
    }

    public final Km a(Context context, C4747c5 c4747c5, C4944jm c4944jm) {
        Km km = (Km) this.b.get(c4747c5.a);
        boolean z = true;
        if (km == null) {
            synchronized (this.b) {
                try {
                    km = (Km) this.b.get(c4747c5.a);
                    if (km == null) {
                        km = new Km(new Lm(context, c4747c5.a, c4944jm, this.d));
                        km.f();
                        this.b.put(c4747c5.a, km);
                        z = false;
                    }
                } finally {
                }
            }
        }
        if (z) {
            km.a(c4944jm);
        }
        return km;
    }

    public final void a(C4747c5 c4747c5, InterfaceC4712am interfaceC4712am) {
        synchronized (this.b) {
            try {
                this.a.a(c4747c5.a, interfaceC4712am);
                C5100pm c5100pm = this.c;
                if (c5100pm != null) {
                    interfaceC4712am.a(c5100pm);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
