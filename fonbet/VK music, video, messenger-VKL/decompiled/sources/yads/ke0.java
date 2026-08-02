package yads;

import android.content.Context;
import java.util.List;
import kotlin.Pair;
import xsna.i5g;
import xsna.rli0;
import xsna.s3q0;
import xsna.ulp0;

/* loaded from: classes10.dex */
public final class ke0 {
    public final w5 a;
    public final b72 b;
    public final f82 c;
    public final Object d;

    public /* synthetic */ ke0(Context context, w5 w5Var) {
        this(w5Var, new b72(context), new f82());
    }

    public final void a(String str) {
        nj0 nj0Var;
        synchronized (this.d) {
            try {
                b72 b72Var = this.b;
                if (b72Var.c.containsKey(str) && (nj0Var = (nj0) b72Var.b.getValue()) != null) {
                    nj0Var.c++;
                    nj0Var.a.obtainMessage(3, 1, 0, str).sendToTarget();
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ke0(w5 w5Var, b72 b72Var, f82 f82Var) {
        this.a = w5Var;
        this.b = b72Var;
        this.c = f82Var;
        this.d = new Object();
    }

    public final void a(sz1 sz1Var, i72 i72Var, z30 z30Var) {
        synchronized (this.d) {
            e22 e22Var = sz1Var.a;
            f82 f82Var = this.c;
            f82Var.getClass();
            List<Pair> A = rli0.A(new ulp0(new ulp0(rli0.t(rli0.p(new i5g(e22Var.a), new c82(f82Var)), d82.b), a82.b), b82.b));
            if (A.isEmpty()) {
                i72Var.a();
                return;
            }
            je0 je0Var = new je0(this.a, A.size(), i72Var, z30Var);
            this.a.a(v5.p, null);
            for (Pair pair : A) {
                this.b.a((String) pair.d(), je0Var, (String) pair.g());
            }
            s3q0 s3q0Var = s3q0.a;
        }
    }
}
