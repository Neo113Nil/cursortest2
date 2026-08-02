package xsna;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: BaseMsgSkeletonView.kt */
/* loaded from: classes2.dex */
public abstract class hh6 extends FrameLayout {
    public fmm b;

    public hh6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public final int a() {
        RecyclerView.o layoutManager;
        List list;
        ViewParent parent = getParent();
        RecyclerView recyclerView = parent instanceof RecyclerView ? (RecyclerView) parent : null;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return 0;
        }
        kxt0 kxt0Var = new kxt0(recyclerView);
        if (kxt0Var.hasNext()) {
            View next = kxt0Var.next();
            if (kxt0Var.hasNext()) {
                ArrayList b = y57.b(next);
                while (kxt0Var.hasNext()) {
                    b.add(kxt0Var.next());
                }
                list = b;
            } else {
                list = Collections.singletonList(next);
            }
        } else {
            list = EmptyList.b;
        }
        int measuredHeight = recyclerView.getMeasuredHeight();
        if (j5g.a0(list) == this) {
            return list.size() > 1 ? layoutManager.getDecoratedTop((View) list.get(1)) : layoutManager.getDecoratedTop(this);
        }
        if (j5g.k0(list) == this) {
            return measuredHeight - (list.size() > 1 ? layoutManager.getDecoratedBottom((View) list.get(recyclerView.getChildCount() - 2)) : layoutManager.getDecoratedBottom(this));
        }
        return 0;
    }

    public abstract void b();

    public abstract void c();

    public final fmm getDialogUnreadMsgMediator() {
        return this.b;
    }

    public abstract wz30 getSkeletonConfig();

    public final void setDialogUnreadMsgMediator(fmm fmmVar) {
        this.b = fmmVar;
    }

    public abstract void setSkeletonConfig(wz30 wz30Var);
}
