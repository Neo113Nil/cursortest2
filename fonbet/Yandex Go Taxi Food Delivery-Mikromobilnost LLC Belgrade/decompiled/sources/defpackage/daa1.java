package defpackage;

import android.content.Context;
import com.google.android.gms.common.b;
import com.google.android.gms.internal.mlkit_vision_barcode.n;

/* loaded from: classes.dex */
public final class daa1 extends t4y {
    public final qk20 b;

    public daa1(qk20 qk20Var) {
        this.b = qk20Var;
    }

    @Override // defpackage.t4y
    public final Object a(Object obj) {
        txa1 u7b1Var;
        uv4 uv4Var = (uv4) obj;
        qk20 qk20Var = this.b;
        Context b = qk20Var.b();
        n l = uvb1.l(e891.b());
        if (!u7b1.b(b)) {
            b.b.getClass();
            if (b.a(b) < 204500000) {
                u7b1Var = new gl(b, uv4Var, l);
                return new yra1(qk20Var, uv4Var, u7b1Var, l);
            }
        }
        u7b1Var = new u7b1(b, uv4Var, l);
        return new yra1(qk20Var, uv4Var, u7b1Var, l);
    }
}
