package xsna;

import xsna.jms0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class hms0 implements Runnable {
    public final /* synthetic */ jms0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ jms0.b d;

    public /* synthetic */ hms0(jms0 jms0Var, boolean z, jms0.b bVar) {
        this.b = jms0Var;
        this.c = z;
        this.d = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jms0.b bVar;
        jms0 jms0Var = this.b;
        boolean z = this.c;
        jms0.b bVar2 = this.d;
        try {
            synchronized (jms0Var.e) {
                try {
                    if (jms0Var.g && z) {
                        return;
                    }
                    while (true) {
                        synchronized (jms0Var.e) {
                            bVar = (jms0.b) jms0Var.f.poll();
                        }
                        if (bVar == null) {
                            bVar2.run();
                            return;
                        }
                        bVar.run();
                    }
                } finally {
                }
            }
        } catch (Exception e) {
            jms0Var.b(e);
        }
    }
}
