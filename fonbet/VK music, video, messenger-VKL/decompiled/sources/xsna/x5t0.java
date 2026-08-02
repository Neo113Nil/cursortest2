package xsna;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: VideoPresenterExt.kt */
/* loaded from: classes17.dex */
public final class x5t0 {
    public static final void a(RecyclerView recyclerView, RecyclerView.o oVar, izs<? super RecyclerView.e0, s3q0> izsVar) {
        if (oVar instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) oVar;
            int v = linearLayoutManager.v();
            int x = linearLayoutManager.x();
            if (v > x) {
                return;
            }
            while (true) {
                RecyclerView.e0 findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(v);
                if (findViewHolderForAdapterPosition != null) {
                    izsVar.invoke(findViewHolderForAdapterPosition);
                }
                if (v == x) {
                    return;
                } else {
                    v++;
                }
            }
        } else {
            int childCount = oVar.getChildCount();
            if (childCount < 0) {
                return;
            }
            int i = 0;
            while (true) {
                RecyclerView.e0 a = wjf0.a(recyclerView, i);
                if (a != null) {
                    izsVar.invoke(a);
                }
                if (i == childCount) {
                    return;
                } else {
                    i++;
                }
            }
        }
    }

    public static final xh5 b(ent0 ent0Var) {
        dnt0 q3 = ent0Var.q3();
        if (q3 instanceof lnt0) {
            return ((lnt0) q3).i();
        }
        if (q3 instanceof nnt0) {
            return ((nnt0) q3).i();
        }
        return null;
    }

    public static final mnt0 c(ent0 ent0Var) {
        dnt0 q3 = ent0Var.q3();
        if (q3 instanceof mnt0) {
            return (mnt0) q3;
        }
        return null;
    }
}
