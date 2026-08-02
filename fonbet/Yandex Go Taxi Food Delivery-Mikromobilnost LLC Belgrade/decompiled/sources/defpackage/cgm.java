package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class cgm extends db5 {
    public final bpx0 a;
    public final j7h b;

    public cgm(bpx0 bpx0Var, j7h j7hVar) {
        this.a = bpx0Var;
        this.b = j7hVar;
    }

    @Override // defpackage.db5
    public final Object a(vi70 vi70Var, Continuation continuation) {
        bj70 bj70Var = vi70Var.b;
        pex0 pex0Var = vi70Var.a.a;
        bpx0 bpx0Var = this.a;
        bpx0Var.getClass();
        boolean z = pex0Var.u || bpx0Var.a.a(pex0Var) || pex0Var.o0 < bpx0Var.b.b().size();
        j7h j7hVar = this.b;
        if (!z) {
            return j7hVar.a(vi70Var, bj70Var);
        }
        wi70 b = j7hVar.b(pex0Var);
        String str = pex0Var.G;
        return ("drive_not_portal".equals(str) || "drive_not_registered".equals(str) || "drive_unknown_error".equals(str)) ? wi70.a(b, bj70Var, 103) : b;
    }
}
