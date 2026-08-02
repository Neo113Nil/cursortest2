package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;

/* loaded from: classes15.dex */
public final class mdu0 extends RecyclerView.Adapter {
    public final Context a;
    public final h3y b;
    public qgn0 c;
    public r3k0 w;

    public mdu0(Activity activity, h3y h3yVar) {
        this.a = activity;
        this.b = h3yVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        qgn0 qgn0Var = this.c;
        if (qgn0Var == null) {
            return 0;
        }
        return ((vcu0) qgn0Var.b).b.getCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        ((vcu0) this.c.b).b.moveToPosition(i);
        return ((vcu0) this.c.b).b.isNull(2) ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        ybu0 ybu0Var = (ybu0) x0Var;
        ybu0Var.b();
        ((vcu0) this.c.b).b.moveToPosition(i);
        ybu0Var.W(this.c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        Context context = this.a;
        if (i == 0) {
            return new wbu0(context, viewGroup);
        }
        if (i != 1) {
            ny61.r(oyr.i(i, "Unknown type "));
            return null;
        }
        xbu0 xbu0Var = new xbu0(context, viewGroup, (xav) this.b.get());
        xbu0Var.T = this.w;
        return xbu0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(x0 x0Var) {
        ((ybu0) x0Var).b();
    }
}
