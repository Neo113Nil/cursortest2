package defpackage;

import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class ed80 {
    public final r0 a;
    public final eci0 b;

    public ed80() {
        r0 c = bvf0.c(new ny70(0));
        this.a = c;
        this.b = e.c(c);
    }

    public final void a(int i, int i2, float f, float f2, boolean z) {
        boolean z2 = false;
        if (!z ? f <= f2 : f <= 0.0f) {
            z2 = true;
        }
        ny70 ny70Var = new ny70(i, i2, true, z2);
        r0 r0Var = this.a;
        r0Var.getClass();
        r0Var.m(null, ny70Var);
    }
}
