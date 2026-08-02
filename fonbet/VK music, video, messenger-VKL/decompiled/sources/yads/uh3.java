package yads;

import java.util.List;

/* loaded from: classes10.dex */
public final class uh3 implements up2 {
    public final up2 a;
    public final Object b;
    public final /* synthetic */ vh3 c;

    public uh3(vh3 vh3Var, up2 up2Var, Object obj) {
        this.c = vh3Var;
        this.a = up2Var;
        this.b = obj;
    }

    public final void a() {
        if (!this.c.d.isEmpty()) {
            this.a.onSuccess(this.c.d);
            return;
        }
        am0 am0Var = new am0();
        up2 up2Var = this.a;
        String message = am0Var.getMessage();
        if (message == null) {
            message = "Ad request completed successfully, but there are no ads available.";
        }
        up2Var.a(new ff3(message));
    }

    @Override // yads.up2
    public final void onSuccess(Object obj) {
        this.c.c.getClass();
        sh3 a = th3.a((List) obj);
        this.c.d.addAll(a.a);
        List list = a.b;
        if (list.isEmpty()) {
            a();
        } else {
            vh3 vh3Var = this.c;
            vh3Var.b.a(vh3Var.a, list, this, this.b);
        }
    }

    @Override // yads.up2
    public final void a(ff3 ff3Var) {
        a();
    }
}
