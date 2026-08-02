package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class r implements Runnable {
    public final /* synthetic */ ItemTouchHelper$3 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ s c;

    public r(s sVar, ItemTouchHelper$3 itemTouchHelper$3, int i) {
        this.c = sVar;
        this.a = itemTouchHelper$3;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s sVar = this.c;
        RecyclerView recyclerView = sVar.K;
        if (recyclerView == null || !recyclerView.isAttachedToWindow()) {
            return;
        }
        ItemTouchHelper$3 itemTouchHelper$3 = this.a;
        if (itemTouchHelper$3.mOverridden || itemTouchHelper$3.mViewHolder.E() == -1) {
            return;
        }
        RecyclerView.c itemAnimator = sVar.K.getItemAnimator();
        if (itemAnimator == null || !itemAnimator.m()) {
            ArrayList arrayList = sVar.I;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((ItemTouchHelper$RecoverAnimation) arrayList.get(i)).mEnded) {
                }
            }
            sVar.F.p(itemTouchHelper$3.mViewHolder, this.b);
            return;
        }
        sVar.K.post(this);
    }
}
