package xsna;

import java.util.Collections;
import java.util.List;

/* compiled from: TextPreparedSelection.kt */
/* loaded from: classes11.dex */
public final class qgo0 extends dp6<qgo0> {
    public final tho0 h;
    public final mjo0 i;

    public qgo0(tho0 tho0Var, uv70 uv70Var, mjo0 mjo0Var, pko0 pko0Var) {
        super(tho0Var.a, tho0Var.b, mjo0Var != null ? mjo0Var.a : null, uv70Var, pko0Var);
        this.h = tho0Var;
        this.i = mjo0Var;
    }

    public final List<pzo> q(izs<? super qgo0, ? extends pzo> izsVar) {
        if (!qko0.c(this.f)) {
            return e43.l(new pgg("", 0), new bzi0(qko0.f(this.f), qko0.f(this.f)));
        }
        pzo invoke = izsVar.invoke(this);
        if (invoke != null) {
            return Collections.singletonList(invoke);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        if (r9 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int r(mjo0 mjo0Var, int i) {
        zhf0 zhf0Var;
        tny tnyVar = mjo0Var.b;
        ljo0 ljo0Var = mjo0Var.a;
        if (tnyVar != null) {
            tny tnyVar2 = mjo0Var.c;
            zhf0Var = tnyVar2 != null ? tnyVar2.z(tnyVar, true) : null;
        }
        zhf0Var = zhf0.e;
        long j = this.h.b;
        int i2 = qko0.c;
        int i3 = (int) (j & 4294967295L);
        uv70 uv70Var = this.d;
        zhf0 c = ljo0Var.c(uv70Var.b(i3));
        float f = c.a;
        float intBitsToFloat = (Float.intBitsToFloat((int) (zhf0Var.d() & 4294967295L)) * i) + c.b;
        return uv70Var.a(ljo0Var.b.h((Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(f) << 32)));
    }
}
