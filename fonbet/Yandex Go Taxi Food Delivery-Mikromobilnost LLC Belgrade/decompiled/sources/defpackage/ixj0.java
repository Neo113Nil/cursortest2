package defpackage;

import android.os.Looper;
import com.yandex.messaging.data.e;

/* loaded from: classes15.dex */
public final class ixj0 implements x08 {
    public final String a;
    public final w920 b;
    public final d7g0 c;
    public final yb7 w;
    public final vpp0 x;
    public xo3 y;
    public final /* synthetic */ boj0 z;

    public ixj0(boj0 boj0Var, String str, w920 w920Var, d7g0 d7g0Var) {
        this.z = boj0Var;
        yb7 yb7Var = new yb7(1, this);
        this.w = yb7Var;
        z83.g(null, (Looper) boj0Var.b, Looper.myLooper());
        this.a = str;
        this.b = w920Var;
        this.c = d7g0Var;
        a();
        if (this.y == null) {
            sb7 sb7Var = (sb7) boj0Var.x;
            z83.g(null, sb7Var.a, Looper.myLooper());
            sb7Var.f.b(yb7Var);
            e eVar = (e) boj0Var.y;
            k9b k9bVar = new k9b(14, this);
            eVar.getClass();
            qhw0 a = jl40.a();
            sjh sjhVar = uyj.a;
            this.x = new vpp0(bvf0.a(cvw.U(a, o400.a.x)), eVar, k9bVar);
        }
    }

    public final void a() {
        String r;
        boolean z;
        boj0 boj0Var = this.z;
        z83.g(null, (Looper) boj0Var.b, Looper.myLooper());
        if (this.y == null && (r = ((k020) boj0Var.w).r()) != null) {
            switch (this.c.a) {
                case 9:
                    if (!"U".equals(r) && !"Lu".equals(r)) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                default:
                    z = "U".equals(r);
                    break;
            }
            if (z) {
                this.y = ((nk21) boj0Var.c).b(this.a, this.b);
            }
        }
    }

    @Override // defpackage.x08
    public final void cancel() {
        boj0 boj0Var = this.z;
        z83.g(null, (Looper) boj0Var.b, Looper.myLooper());
        sb7 sb7Var = (sb7) boj0Var.x;
        z83.g(null, sb7Var.a, Looper.myLooper());
        sb7Var.f.d(this.w);
        vpp0 vpp0Var = this.x;
        if (vpp0Var != null) {
            vpp0Var.close();
        }
        xo3 xo3Var = this.y;
        if (xo3Var != null) {
            xo3Var.cancel();
            this.y = null;
        }
    }
}
