package defpackage;

import kotlinx.coroutines.flow.n0;

/* loaded from: classes9.dex */
public final class k0v0 extends n0 implements n4u0 {
    @Override // defpackage.n4u0
    public final Object getValue() {
        Integer valueOf;
        synchronized (this) {
            valueOf = Integer.valueOf(((Number) this.A[((int) ((this.B + ((int) ((q() + this.D) - this.B))) - 1)) & (r0.length - 1)]).intValue());
        }
        return valueOf;
    }

    public final void x(int i) {
        synchronized (this) {
            g(Integer.valueOf(((Number) this.A[((int) ((this.B + ((int) ((q() + this.D) - this.B))) - 1)) & (r0.length - 1)]).intValue() + i));
        }
    }
}
