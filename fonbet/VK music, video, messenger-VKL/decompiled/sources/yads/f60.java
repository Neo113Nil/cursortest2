package yads;

import kotlin.jvm.internal.Lambda;
import xsna.bdn;
import xsna.gzs;
import xsna.wgl;

/* loaded from: classes10.dex */
public final class f60 extends Lambda implements gzs {
    public final /* synthetic */ m70 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f60(m70 m70Var) {
        super(0);
        this.b = m70Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        qh1 qh1Var = (qh1) this.b.w.getValue();
        do2 do2Var = (do2) this.b.x.getValue();
        os1 os1Var = (os1) this.b.h.getValue();
        z61 z61Var = (z61) this.b.A.getValue();
        e71 e71Var = (e71) this.b.z.getValue();
        bdn bdnVar = bdn.a;
        return new o80(qh1Var, do2Var, os1Var, z61Var, e71Var, wgl.c);
    }
}
