package yads;

import com.ironsource.X3;

/* loaded from: classes10.dex */
public final class f52 {
    public final cj a;

    public f52(cj cjVar) {
        this.a = cjVar;
    }

    public final e52 a() {
        q82 q82Var;
        Object obj = this.a.a.get(X3.i.I0);
        f72 f72Var = null;
        po1 po1Var = obj instanceof po1 ? (po1) obj : null;
        if (po1Var != null) {
            f72 f72Var2 = po1Var.b != null ? new f72() : null;
            q82Var = po1Var.a != null ? new q82() : null;
            f72Var = f72Var2;
        } else {
            q82Var = null;
        }
        return new e52(f72Var, q82Var);
    }
}
