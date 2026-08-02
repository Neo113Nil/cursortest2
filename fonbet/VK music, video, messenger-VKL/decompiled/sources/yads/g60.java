package yads;

import kotlin.jvm.internal.Lambda;
import xsna.bdn;
import xsna.gzs;
import xsna.wgl;

/* loaded from: classes10.dex */
public final class g60 extends Lambda implements gzs {
    public final /* synthetic */ m70 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g60(m70 m70Var) {
        super(0);
        this.b = m70Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        qh1 qh1Var = (qh1) this.b.w.getValue();
        do2 do2Var = (do2) this.b.x.getValue();
        v50 v50Var = (v50) this.b.B.getValue();
        bdn bdnVar = bdn.a;
        return new q80(qh1Var, do2Var, v50Var, wgl.c);
    }
}
