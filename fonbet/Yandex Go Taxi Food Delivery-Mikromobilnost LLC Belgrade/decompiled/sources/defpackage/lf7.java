package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.collections.a;

/* loaded from: classes3.dex */
public final class lf7 extends RecyclerView.d {
    public static final int b = kp50.r(12);
    public final qa3 a;

    public lf7(qa3 qa3Var) {
        this.a = qa3Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void c(Rect rect, View view, RecyclerView recyclerView, RecyclerView.k kVar) {
        kf7 kf7Var;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        Integer valueOf = Integer.valueOf(childAdapterPosition);
        if (childAdapterPosition == -1) {
            valueOf = null;
        }
        if (valueOf == null || (kf7Var = (kf7) a.S(valueOf.intValue(), this.a.b.f)) == null || (kf7Var instanceof if7)) {
            return;
        }
        if (!(kf7Var instanceof jf7)) {
            w511.b();
            return;
        }
        int paddingLeft = recyclerView.getPaddingLeft();
        int i = b;
        rect.set(i - paddingLeft, 0, i - recyclerView.getPaddingRight(), 0);
    }
}
