package yads;

import java.util.List;

/* loaded from: classes10.dex */
public final class kq3 implements up2 {
    public final /* synthetic */ lq3 a;

    public kq3(lq3 lq3Var) {
        this.a = lq3Var;
    }

    public final void a() {
        lq3 lq3Var = this.a;
        up2 up2Var = lq3Var.c;
        if (lq3Var.d != 0 || up2Var == null) {
            return;
        }
        up2Var.onSuccess(lq3Var.b);
    }

    @Override // yads.up2
    public final void onSuccess(Object obj) {
        r0.d--;
        this.a.b.addAll((List) obj);
        a();
    }

    @Override // yads.up2
    public final void a(ff3 ff3Var) {
        lq3 lq3Var = this.a;
        lq3Var.d--;
        a();
    }
}
