package defpackage;

import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class f5k0 {
    public final cne0 a;
    public final r0 b;
    public final gci0 c;

    public f5k0(dne0 dne0Var) {
        cne0 a = dne0Var.a("Rida.Summary.AutoAccept");
        this.a = a;
        r0 c = bvf0.c(Boolean.valueOf(a.g("isAutoAcceptEnabled", false)));
        this.b = c;
        this.c = e.d(c);
    }

    public final void a(boolean z) {
        this.a.u("isAutoAcceptEnabled", z);
        qv10.B(z, this.b, null);
    }
}
