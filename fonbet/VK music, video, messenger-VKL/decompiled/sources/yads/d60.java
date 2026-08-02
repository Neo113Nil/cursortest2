package yads;

import kotlin.jvm.internal.Lambda;
import xsna.gzs;

/* loaded from: classes10.dex */
public final class d60 extends Lambda implements gzs {
    public final /* synthetic */ m70 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d60(m70 m70Var) {
        super(0);
        this.b = m70Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        return new v50((ds1) this.b.f.getValue(), (os1) this.b.h.getValue(), (j50) this.b.i.getValue(), (ls1) this.b.j.getValue());
    }
}
