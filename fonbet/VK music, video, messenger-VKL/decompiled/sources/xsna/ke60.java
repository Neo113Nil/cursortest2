package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.je60;

/* compiled from: NewsfeedCoownersListReducer.kt */
/* loaded from: classes17.dex */
public final class ke60 extends dm50<oe60, je60, me60> {
    public final se60 d;

    public ke60(me60 me60Var, se60 se60Var) {
        super(me60Var);
        this.d = se60Var;
    }

    @Override // xsna.dm50
    public final me60 c(me60 me60Var, je60 je60Var) {
        me60 me60Var2 = me60Var;
        je60 je60Var2 = je60Var;
        if (!(je60Var2 instanceof je60.a)) {
            throw new NoWhenBranchMatchedException();
        }
        return new me60(me60Var2.b, ((je60.a) je60Var2).b, me60Var2.d);
    }

    @Override // xsna.dm50
    public final oe60 d() {
        return new oe60(e(new cws(this, 25)));
    }

    @Override // xsna.dm50
    public final void h(me60 me60Var, oe60 oe60Var) {
        f(oe60Var.a, me60Var);
    }
}
