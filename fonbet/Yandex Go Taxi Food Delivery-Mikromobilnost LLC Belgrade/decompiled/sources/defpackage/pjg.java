package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class pjg extends RecyclerView.g {
    public final /* synthetic */ rjg a;

    public pjg(rjg rjgVar) {
        this.a = rjgVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        rjg rjgVar = this.a;
        if (i != 0) {
            if (i != 1) {
                return;
            }
            rjgVar.d0 = false;
        } else if (rjgVar.d0) {
            rjgVar.d0 = false;
            rjgVar.c0.invoke();
        }
    }
}
