package yads;

import kotlin.jvm.internal.Lambda;
import xsna.gzs;

/* loaded from: classes10.dex */
public final class z60 extends Lambda implements gzs {
    public final /* synthetic */ m70 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z60(m70 m70Var) {
        super(0);
        this.b = m70Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        return new os1((ps1) this.b.g.getValue());
    }
}
