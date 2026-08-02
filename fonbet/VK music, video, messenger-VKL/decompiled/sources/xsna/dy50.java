package xsna;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: NavigationDelegateLeftMenu.java */
/* loaded from: classes7.dex */
public final class dy50 extends RecyclerView.t {
    public final /* synthetic */ yx50 b;

    public dy50(yx50 yx50Var) {
        this.b = yx50Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
        if (i == 0) {
            this.b.y0();
        }
    }
}
