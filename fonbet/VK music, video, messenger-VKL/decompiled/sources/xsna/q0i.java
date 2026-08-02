package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: CommunityScheduledClipsGridItemDecorator.kt */
/* loaded from: classes5.dex */
public final class q0i extends RecyclerView.n {
    public final t0i b;
    public final int c = iah0.a(2.0f);

    public q0i(t0i t0iVar) {
        this.b = t0iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // androidx.recyclerview.widget.RecyclerView.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        o0i o0iVar;
        int i;
        super.getItemOffsets(rect, view, recyclerView, a0Var);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        t0i t0iVar = this.b;
        if (childAdapterPosition < 0) {
            t0iVar.getClass();
        } else if (childAdapterPosition < t0iVar.getItemCount()) {
            o0iVar = (o0i) t0iVar.c.c(childAdapterPosition);
            i = t0iVar.f;
            if (o0iVar != null) {
                childAdapterPosition = o0iVar.b.intValue();
            }
            int i2 = childAdapterPosition % i;
            int i3 = this.c;
            float f = i;
            rect.left = an10.b((i2 * i3) / f);
            rect.right = i3 - an10.b(((i2 + 1) * i3) / f);
            if (childAdapterPosition < i) {
                rect.top = i3;
                return;
            }
            return;
        }
        o0iVar = null;
        i = t0iVar.f;
        if (o0iVar != null) {
        }
        int i22 = childAdapterPosition % i;
        int i32 = this.c;
        float f2 = i;
        rect.left = an10.b((i22 * i32) / f2);
        rect.right = i32 - an10.b(((i22 + 1) * i32) / f2);
        if (childAdapterPosition < i) {
        }
    }
}
