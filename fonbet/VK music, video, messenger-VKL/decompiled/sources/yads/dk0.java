package yads;

import kotlin.jvm.internal.Lambda;
import xsna.izs;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class dk0 extends Lambda implements izs {
    public final /* synthetic */ ek0 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk0(ek0 ek0Var, String str) {
        super(1);
        this.b = ek0Var;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        hk0 hk0Var = (hk0) obj;
        ek0 ek0Var = this.b;
        String str = this.c;
        bk0 bk0Var = (bk0) ek0Var.d.remove(str);
        if (bk0Var != null) {
            ek0Var.c.a(str, hk0Var.a, hk0Var.b);
            ek0Var.a(str, bk0Var, hk0Var.a, null);
        }
        return s3q0.a;
    }
}
