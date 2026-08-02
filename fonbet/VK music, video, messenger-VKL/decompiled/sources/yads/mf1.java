package yads;

import kotlin.jvm.internal.Lambda;
import xsna.izs;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class mf1 extends Lambda implements izs {
    public final /* synthetic */ qf1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf1(qf1 qf1Var) {
        super(1);
        this.b = qf1Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        dq2 dq2Var = (dq2) this.b.d.invoke();
        dq2Var.getClass();
        dq2Var.a(new aq2("light_bundle_js_request_tag"));
        return s3q0.a;
    }
}
