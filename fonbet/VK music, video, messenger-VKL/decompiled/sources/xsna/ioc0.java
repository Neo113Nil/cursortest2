package xsna;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: PostingStep1View.kt */
/* loaded from: classes4.dex */
public final class ioc0 extends RecyclerView.i {
    public final /* synthetic */ enc0 a;
    public final /* synthetic */ xai0 b;
    public final /* synthetic */ LinearLayoutManager c;

    public ioc0(enc0 enc0Var, xai0 xai0Var, LinearLayoutManager linearLayoutManager) {
        this.a = enc0Var;
        this.b = xai0Var;
        this.c = linearLayoutManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void e(int i, int i2) {
        enc0 enc0Var = this.a;
        enc0Var.Q.postDelayed(new f9p(enc0Var, this.b, this.c, 1), 200L);
    }
}
