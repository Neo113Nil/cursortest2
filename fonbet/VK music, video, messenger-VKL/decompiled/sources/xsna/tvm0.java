package xsna;

import android.view.View;
import xsna.av20;

/* compiled from: SubscribeControllerNoViews.kt */
/* loaded from: classes17.dex */
public final class tvm0 implements av20.b<String> {
    public final /* synthetic */ gzs<s3q0> a;
    public final /* synthetic */ uvm0 b;

    public tvm0(gzs<s3q0> gzsVar, uvm0 uvm0Var) {
        this.a = gzsVar;
        this.b = uvm0Var;
    }

    @Override // xsna.av20.b
    public final void a(View view, Object obj, int i, wmg wmgVar) {
        this.a.invoke();
        dw20 dw20Var = this.b.f;
        if (dw20Var != null) {
            dw20Var.dismiss();
        }
    }
}
