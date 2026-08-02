package defpackage;

import androidx.concurrent.futures.b;

/* loaded from: classes.dex */
public final class fl7 extends ga {
    public final /* synthetic */ gl7 A;

    public fl7(gl7 gl7Var) {
        this.A = gl7Var;
    }

    @Override // defpackage.ga
    public final String i() {
        b bVar = (b) this.A.a.get();
        return bVar == null ? "Completer object has been garbage collected, future will fail soon" : x4e.h(new StringBuilder("tag=["), bVar.a, "]");
    }
}
