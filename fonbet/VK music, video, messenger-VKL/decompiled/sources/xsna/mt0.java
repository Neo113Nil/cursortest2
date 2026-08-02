package xsna;

import java.lang.ref.WeakReference;
import xsna.oj00;

/* compiled from: AddressesUtils.kt */
/* loaded from: classes5.dex */
public final class mt0 implements oj00.a {
    public final /* synthetic */ oj00.a a;
    public final /* synthetic */ WeakReference<oj00> b;
    public final /* synthetic */ fo9 c;
    public final /* synthetic */ u9h0 d;

    public mt0(oj00.a aVar, WeakReference<oj00> weakReference, fo9 fo9Var, u9h0 u9h0Var) {
        this.a = aVar;
        this.b = weakReference;
        this.c = fo9Var;
        this.d = u9h0Var;
    }

    @Override // xsna.oj00.a
    public final void onCancel() {
        oj00.a aVar = this.a;
        if (aVar != null) {
            aVar.onCancel();
        }
    }

    @Override // xsna.oj00.a
    public final void onFinish() {
        oj00 oj00Var = this.b.get();
        if (oj00Var != null) {
            u9h0 u9h0Var = this.d;
            oj00Var.g(this.c.b(nt0.a, u9h0Var), 1000, this.a);
        }
    }
}
