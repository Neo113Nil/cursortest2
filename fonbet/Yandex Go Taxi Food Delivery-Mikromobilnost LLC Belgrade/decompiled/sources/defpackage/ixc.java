package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes13.dex */
public final class ixc implements zo31 {
    public final RecyclerView a;
    public final RecyclerView b;

    public ixc(RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.a = recyclerView;
        this.b = recyclerView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
