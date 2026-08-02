package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import flex.engine.a;

/* loaded from: classes9.dex */
public final class byl extends RecyclerView.g {
    public final /* synthetic */ a a;

    public byl(a aVar) {
        this.a = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        super.onScrollStateChanged(recyclerView, i);
        this.a.P.z(new jzl(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        this.a.P.z(new kzl(recyclerView.computeVerticalScrollOffset(), recyclerView.computeHorizontalScrollOffset(), i, i2));
    }
}
