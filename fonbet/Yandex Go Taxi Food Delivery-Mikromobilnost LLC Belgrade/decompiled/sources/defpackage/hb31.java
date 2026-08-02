package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import androidx.recyclerview.widget.y0;
import kotlin.collections.a;

/* loaded from: classes6.dex */
public final class hb31 extends y0 {
    public final /* synthetic */ ib31 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb31(ib31 ib31Var) {
        super(ib31Var);
        this.c = ib31Var;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x003d -> B:11:0x003e). Please report as a decompilation issue!!! */
    @Override // androidx.recyclerview.widget.y0, androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
        int E;
        RecyclerView.Adapter adapter;
        ob31 ob31Var;
        super.onInitializeAccessibilityNodeInfo(view, whVar);
        RecyclerView recyclerView = this.c.c;
        x0 childViewHolder = recyclerView.getChildViewHolder(view);
        if (childViewHolder == null || (E = childViewHolder.E()) == -1 || (adapter = recyclerView.getAdapter()) == null) {
            return;
        }
        if (adapter instanceof jb31) {
            ob31Var = (ob31) a.S(E, ((jb31) adapter).c);
        } else {
            if (adapter instanceof bys) {
                Object item = ((bys) adapter).getItem(E);
                if (item instanceof ob31) {
                    ob31Var = (ob31) item;
                }
            }
            ob31Var = null;
        }
        if (ob31Var == null) {
            return;
        }
        whVar.D(ob31Var.g);
        whVar.t(ob31Var.f);
        whVar.C(false);
        if (!ob31Var.c) {
            whVar.p("android.widget.Button");
        } else {
            whVar.i(ph.g);
            whVar.q(false);
        }
    }
}
