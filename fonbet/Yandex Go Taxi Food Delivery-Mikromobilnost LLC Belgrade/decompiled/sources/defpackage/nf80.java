package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes13.dex */
public final class nf80 extends RecyclerView.d {
    public final /* synthetic */ int a;

    public nf80(int i) {
        this.a = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void c(Rect rect, View view, RecyclerView recyclerView, RecyclerView.k kVar) {
        int i = this.a;
        rect.left = i;
        rect.right = i;
    }
}
