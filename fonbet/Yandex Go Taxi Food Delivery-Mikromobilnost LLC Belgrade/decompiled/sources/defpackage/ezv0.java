package defpackage;

import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class ezv0 {
    public czv0 a;
    public final r0 b;
    public final gci0 c;

    public ezv0() {
        azv0 azv0Var = azv0.a;
        this.a = azv0Var;
        r0 c = bvf0.c(azv0Var);
        this.b = c;
        this.c = e.d(c);
    }

    public final void a(czv0 czv0Var, boolean z) {
        if ((czv0Var instanceof azv0) || (czv0Var instanceof bzv0)) {
            this.a = czv0Var;
        }
        r0 r0Var = this.b;
        czv0 czv0Var2 = (czv0) r0Var.getValue();
        if ((czv0Var2 instanceof azv0) || (czv0Var2 instanceof bzv0) || z) {
            r0Var.getClass();
            r0Var.m(null, czv0Var);
        }
    }
}
