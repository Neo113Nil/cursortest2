package xsna;

import java.util.ArrayList;

/* compiled from: PollMediator.kt */
/* loaded from: classes2.dex */
public final class lqb0 implements kqb0 {
    public final ArrayList a = new ArrayList();
    public boolean b;

    @Override // xsna.kqb0
    public final boolean a() {
        return this.b;
    }

    @Override // xsna.kqb0
    public final void b(zs30 zs30Var) {
        this.a.remove(zs30Var);
    }

    @Override // xsna.kqb0
    public final void c(zs30 zs30Var) {
        this.a.add(zs30Var);
    }
}
