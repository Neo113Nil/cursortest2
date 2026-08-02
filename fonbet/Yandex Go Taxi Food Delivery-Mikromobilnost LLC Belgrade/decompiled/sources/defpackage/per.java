package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class per extends RecyclerView.d {
    public final qer a;
    public final int b;
    public final int c;
    public final int w;
    public final int x;

    public per(l2l l2lVar, qer qerVar) {
        this.a = qerVar;
        this.b = f(l2lVar.i);
        this.c = f(l2lVar.j);
        this.w = f(l2lVar.k);
        this.x = f(l2lVar.l);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void c(Rect rect, View view, RecyclerView recyclerView, RecyclerView.k kVar) {
        rect.set(this.b, this.c, this.w, this.x);
    }

    public final int f(Integer num) {
        return num != null ? num.intValue() : m810.b(this.a.b());
    }
}
