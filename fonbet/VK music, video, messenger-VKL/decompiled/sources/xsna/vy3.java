package xsna;

import xsna.pnb0;
import xsna.v1j;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class vy3 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vy3(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [xsna.j8i, xsna.smb$a] */
    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                wy3 wy3Var = (wy3) this.c;
                wy3Var.a.f = null;
                ez3 ez3Var = wy3Var.a;
                ez3Var.n = 0;
                ez3Var.m = true;
                ez3 ez3Var2 = wy3Var.c;
                ez3Var2.G = true;
                ez3Var2.K = 0L;
                ez3Var.h.set(false);
                break;
            case 1:
                smb smbVar = (smb) this.c;
                smbVar.l = null;
                ?? r0 = smbVar.c;
                if (r0 != 0) {
                    r0.t();
                    break;
                }
                break;
            case 2:
                ((neh) this.c).c.b(null);
                break;
            case 3:
                ((a2j) this.c).C(v1j.l.b);
                break;
            default:
                ((job0) this.c).a.b(pnb0.c.e.b);
                break;
        }
    }
}
