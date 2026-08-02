package yads;

import kotlin.jvm.internal.Lambda;
import xsna.gzs;

/* loaded from: classes10.dex */
public final class k70 extends Lambda implements gzs {
    public final /* synthetic */ m70 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k70(m70 m70Var) {
        super(0);
        this.b = m70Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        return new da0(((mm0) this.b.a.getValue()).a);
    }
}
