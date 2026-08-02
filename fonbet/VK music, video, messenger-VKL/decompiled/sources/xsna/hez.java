package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.im.ui.components.viewcontrollers.msg_list.MsgLinearLayoutManager;

/* compiled from: ListControllerImpl.kt */
/* loaded from: classes2.dex */
public final class hez {
    public final RecyclerView a;
    public final MsgLinearLayoutManager b;
    public final ok30 c;
    public final g1l d;

    public hez(RecyclerView recyclerView, MsgLinearLayoutManager msgLinearLayoutManager, ok30 ok30Var, g1l g1lVar) {
        this.a = recyclerView;
        this.b = msgLinearLayoutManager;
        this.c = ok30Var;
        this.d = g1lVar;
    }

    public final void a(View view, boolean z) {
        g1l g1lVar;
        if (view == null || (g1lVar = this.d) == null) {
            return;
        }
        g1lVar.c(view, z);
    }

    public final uel0 b(Rect rect) {
        RecyclerView recyclerView = this.a;
        if (recyclerView.isComputingLayout()) {
            return new uel0(null, -1);
        }
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            MsgLinearLayoutManager msgLinearLayoutManager = this.b;
            if (msgLinearLayoutManager.getDecoratedBottom(childAt) >= rect.top) {
                if (msgLinearLayoutManager.getDecoratedTop(childAt) > rect.bottom) {
                    return new uel0(null, -1);
                }
                int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
                com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g b = qk30.b(childAdapterPosition, this.c);
                if (b != null ? b.M() : false) {
                    return new uel0(childAt, childAdapterPosition);
                }
            }
        }
        return new uel0(null, -1);
    }

    public final uel0 c(Rect rect) {
        RecyclerView recyclerView = this.a;
        if (recyclerView.isComputingLayout()) {
            return new uel0(null, -1);
        }
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            MsgLinearLayoutManager msgLinearLayoutManager = this.b;
            if (msgLinearLayoutManager.getDecoratedBottom(childAt) >= rect.top) {
                return msgLinearLayoutManager.getDecoratedTop(childAt) > rect.bottom ? new uel0(null, -1) : new uel0(childAt, recyclerView.getChildAdapterPosition(childAt));
            }
        }
        return new uel0(null, -1);
    }

    public final Long d(int i) {
        ok30 ok30Var = this.c;
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) j5g.b0(i, ok30Var.f);
        if (gVar == null) {
            gVar = null;
        }
        Long valueOf = gVar != null ? Long.valueOf(gVar.v()) : null;
        if (valueOf == null) {
            com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
            StringBuilder sb = new StringBuilder("Date is null. isComputingLayout=");
            sb.append(this.a.isComputingLayout());
            sb.append(", adapterItemCount=");
            sb.append(ok30Var.f.size());
            sb.append(", requestedPos=");
            sb.append(i);
            sb.append(",fvp=");
            MsgLinearLayoutManager msgLinearLayoutManager = this.b;
            sb.append(msgLinearLayoutManager.v());
            sb.append(",lvp=");
            sb.append(msgLinearLayoutManager.x());
            bVar.a(new IllegalStateException(sb.toString()));
        }
        return valueOf;
    }

    public final boolean e(int i, Rect rect) {
        MsgLinearLayoutManager msgLinearLayoutManager = this.b;
        View findViewByPosition = msgLinearLayoutManager.findViewByPosition(i);
        if (findViewByPosition == null) {
            return false;
        }
        rect.set(msgLinearLayoutManager.getDecoratedLeft(findViewByPosition), msgLinearLayoutManager.getDecoratedTop(findViewByPosition), msgLinearLayoutManager.getDecoratedRight(findViewByPosition), msgLinearLayoutManager.getDecoratedBottom(findViewByPosition));
        return true;
    }
}
