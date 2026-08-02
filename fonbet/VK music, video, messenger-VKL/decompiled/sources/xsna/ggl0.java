package xsna;

import java.util.Set;

/* compiled from: StopWorkRunnable.kt */
/* loaded from: classes12.dex */
public final class ggl0 implements Runnable {
    public final ohd0 b;
    public final tqk0 c;
    public final boolean d;
    public final int e;

    public ggl0(ohd0 ohd0Var, tqk0 tqk0Var, boolean z, int i) {
        this.b = ohd0Var;
        this.c = tqk0Var;
        this.d = z;
        this.e = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        uyx0 b;
        if (this.d) {
            ohd0 ohd0Var = this.b;
            tqk0 tqk0Var = this.c;
            int i = this.e;
            ohd0Var.getClass();
            String str = tqk0Var.a.a;
            synchronized (ohd0Var.k) {
                b = ohd0Var.b(str);
            }
            ohd0.d(b, i);
        } else {
            ohd0 ohd0Var2 = this.b;
            tqk0 tqk0Var2 = this.c;
            int i2 = this.e;
            ohd0Var2.getClass();
            String str2 = tqk0Var2.a.a;
            synchronized (ohd0Var2.k) {
                try {
                    if (ohd0Var2.f.get(str2) != null) {
                        m100.c().getClass();
                    } else {
                        Set set = (Set) ohd0Var2.h.get(str2);
                        if (set != null && set.contains(tqk0Var2)) {
                            ohd0.d(ohd0Var2.b(str2), i2);
                        }
                    }
                } finally {
                }
            }
        }
        m100 c = m100.c();
        m100.d("StopWorkRunnable");
        String str3 = this.c.a.a;
        c.getClass();
    }
}
