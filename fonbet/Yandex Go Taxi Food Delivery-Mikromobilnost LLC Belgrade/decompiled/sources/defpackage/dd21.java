package defpackage;

import java.util.ArrayList;

/* loaded from: classes15.dex */
public final class dd21 implements Runnable {
    public volatile r2x0 a;
    public final /* synthetic */ gd21 b;

    public dd21(gd21 gd21Var) {
        this.b = gd21Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.b.n.get();
        final gd21 gd21Var = this.b;
        if (z) {
            final int i = 0;
            gd21Var.a.post(new Runnable() { // from class: cd21
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i) {
                        case 0:
                            gd21.a(gd21Var, this.a);
                            break;
                        default:
                            gd21.a(gd21Var, this.a);
                            break;
                    }
                }
            });
            return;
        }
        final int i2 = 1;
        try {
            r2x0 a = gd21Var.e.a();
            this.a = a;
            gd21 gd21Var2 = this.b;
            aqb1.e(gd21Var2.i, gd21Var2.c, ((ArrayList) a.c).size(), this.b.l);
        } catch (Throwable th) {
            try {
                this.b.c("read_contacts_exception", th);
            } finally {
                final gd21 gd21Var3 = this.b;
                gd21Var3.a.post(new Runnable() { // from class: cd21
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2) {
                            case 0:
                                gd21.a(gd21Var3, this.a);
                                break;
                            default:
                                gd21.a(gd21Var3, this.a);
                                break;
                        }
                    }
                });
            }
        }
    }
}
