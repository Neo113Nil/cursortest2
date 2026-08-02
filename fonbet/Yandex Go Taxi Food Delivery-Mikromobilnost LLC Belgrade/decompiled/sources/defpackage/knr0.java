package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes9.dex */
public final class knr0 extends pa {
    public long a = -1;
    public j18 b;

    @Override // defpackage.pa
    public final boolean a(oa oaVar) {
        n0 n0Var = (n0) oaVar;
        if (this.a >= 0) {
            return false;
        }
        long j = n0Var.B;
        if (j < n0Var.C) {
            n0Var.C = j;
        }
        this.a = j;
        return true;
    }

    @Override // defpackage.pa
    public final Continuation[] b(oa oaVar) {
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return ((n0) oaVar).w(j);
    }
}
