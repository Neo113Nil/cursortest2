package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: ActionAdapter.kt */
/* loaded from: classes13.dex */
public final class cu extends RecyclerView.Adapter<v60> {
    public final u50 c;
    public final LayoutInflater d;
    public final a e = new a();
    public List<? extends zt<?>> f = EmptyList.b;
    public uy<Object> g;

    /* compiled from: ActionAdapter.kt */
    public final class a implements uy<Object> {
        public a() {
        }

        @Override // xsna.uy
        public final void a(zt<Object> ztVar) {
            uy<Object> uyVar = cu.this.g;
            if (uyVar != null) {
                uyVar.a(ztVar);
            }
        }
    }

    public cu(Context context, u50 u50Var) {
        this.c = u50Var;
        this.d = LayoutInflater.from(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(v60 v60Var, int i) {
        v60 v60Var2 = v60Var;
        v60Var2.p = this.e;
        zt<?> ztVar = this.f.get(i);
        v60Var2.o = ztVar;
        v60Var2.m.setImageDrawable(ztVar.c);
        v60Var2.n.setText(ztVar.d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final v60 onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = v60.q;
        return new v60(this.d.inflate(R.layout.vklib_actionslistview_entry, viewGroup, false), this.c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(v60 v60Var) {
        v60 v60Var2 = v60Var;
        super.onViewRecycled(v60Var2);
        v60Var2.p = null;
    }
}
