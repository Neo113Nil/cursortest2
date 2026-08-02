package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class ee2 implements ie2 {
    public final be2 a;
    public final be2 b;

    public ee2(be2 be2Var, be2 be2Var2) {
        this.a = be2Var;
        this.b = be2Var2;
    }

    @Override // defpackage.ie2
    public final boolean Bc() {
        return this.a.Bc() && this.b.Bc();
    }

    @Override // defpackage.ie2
    public final i35 I() {
        return new hvt0(this.a.I(), this.b.I());
    }

    @Override // defpackage.ie2
    public final List Nb() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }
}
