package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.x0;

/* loaded from: classes.dex */
public final class ld80 extends v0x {
    public final jc60 c;
    public final kd80 d = new kd80();

    public ld80(jc60 jc60Var) {
        this.c = jc60Var;
    }

    @Override // defpackage.v0x
    public final void b(x0 x0Var, u0x u0xVar) {
        ((jd80) x0Var).p(((id80) u0xVar).h);
    }

    @Override // defpackage.v0x
    public final x0 d(ViewGroup viewGroup) {
        return new jd80((qd80) this.c.get());
    }

    @Override // defpackage.v0x
    public final pdh e() {
        return this.d;
    }

    @Override // defpackage.v0x
    public final void h(x0 x0Var) {
        ((jd80) x0Var).b();
    }
}
