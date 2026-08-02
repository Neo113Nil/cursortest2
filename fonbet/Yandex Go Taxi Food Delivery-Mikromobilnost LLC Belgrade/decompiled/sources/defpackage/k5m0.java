package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes13.dex */
public final class k5m0 extends RecyclerView.g {
    public int a;
    public final /* synthetic */ sls b;

    public k5m0(sls slsVar) {
        this.b = slsVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (i == 1 && this.a != i) {
            this.b.invoke();
        }
        this.a = i;
    }
}
