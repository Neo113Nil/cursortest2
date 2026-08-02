package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: ModalAdapter.kt */
/* loaded from: classes17.dex */
public final class av20<Item> extends RecyclerView.Adapter<av20<Item>.c> {
    public final LayoutInflater c;
    public final Integer d;
    public final boolean e;
    public final s770 f;
    public final b<Item> g;
    public final bpn0 h;
    public final ArrayList i;

    /* compiled from: ModalAdapter.kt */
    public static final class a<Item> {
        public boolean a;
        public LayoutInflater b;
        public Integer c;
        public s770 d;
        public b<Item> e;
        public List<? extends Item> f;

        public final void a(w9h0 w9h0Var) {
            this.d = w9h0Var;
        }

        public final av20<Item> b() {
            Integer num;
            LayoutInflater layoutInflater = this.b;
            if (layoutInflater == null || (num = this.c) == null) {
                throw new IllegalArgumentException("You should provide layout or inflater and layoutId to inflate!");
            }
            s770 s770Var = this.d;
            if (s770Var == null) {
                throw new IllegalArgumentException("binder must not be null!");
            }
            av20<Item> av20Var = new av20<>(layoutInflater, num, this.a, s770Var, this.e);
            List<? extends Item> list = this.f;
            if (list != null && !list.isEmpty()) {
                av20Var.setItems(this.f);
            }
            return av20Var;
        }

        public final void c(yzs yzsVar) {
            this.e = new zu20(yzsVar);
        }

        public final void d(int i, LayoutInflater layoutInflater) {
            this.c = Integer.valueOf(i);
            this.b = layoutInflater;
        }

        public final void e() {
            this.a = true;
        }
    }

    /* compiled from: ModalAdapter.kt */
    public interface b<Item> {
        void a(View view, Object obj, int i, wmg wmgVar);
    }

    /* compiled from: ModalAdapter.kt */
    public final class c extends RecyclerView.e0 implements View.OnClickListener {
        public static final /* synthetic */ int p = 0;
        public Item l;
        public int m;
        public final hkp n;

        public c(View view) {
            super(view);
            this.m = -1;
            if (av20.this.e || av20.this.g != null) {
                jjc.f(this, view);
            }
            this.n = av20.this.f.p(view);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void V5(int i, Object obj, List list) {
            this.l = obj;
            this.m = i;
            av20<Item> av20Var = av20.this;
            s770 s770Var = av20Var.f;
            boolean z = av20Var.e;
            hkp hkpVar = this.n;
            if (z) {
                s770Var.o(hkpVar, obj, av20Var.x0().containsKey(Integer.valueOf(this.m)));
            } else {
                s770Var.n(hkpVar, obj, i, list);
            }
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            av20<Item> av20Var = av20.this;
            if (av20Var.e) {
                av20Var.y0(this.m);
            }
            b<Item> bVar = av20Var.g;
            if (bVar != null) {
                Object obj = this.l;
                if (obj == null) {
                    obj = s3q0.a;
                }
                bVar.a(view, obj, this.m, new wmg(av20Var, 4));
            }
        }
    }

    public av20() {
        throw null;
    }

    public av20(LayoutInflater layoutInflater, Integer num, boolean z, s770 s770Var, b bVar) {
        this.c = layoutInflater;
        this.d = num;
        this.e = z;
        this.f = s770Var;
        this.g = bVar;
        this.h = new bpn0(new e20(17));
        this.i = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.i.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        Object obj = this.i.get(i);
        int i2 = c.p;
        ((c) e0Var).V5(i, obj, EmptyList.b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        Integer num;
        LayoutInflater layoutInflater = this.c;
        return new c((layoutInflater == null || (num = this.d) == null) ? null : layoutInflater.inflate(num.intValue(), viewGroup, false));
    }

    public final void setItems(List<? extends Item> list) {
        ArrayList arrayList = this.i;
        arrayList.clear();
        arrayList.addAll(list);
        notifyDataSetChanged();
    }

    public final dpj0<Integer, Item> x0() {
        return (dpj0) this.h.getValue();
    }

    public final void y0(int i) {
        if (x0().containsKey(Integer.valueOf(i))) {
            x0().remove(Integer.valueOf(i));
        } else {
            x0().put(Integer.valueOf(i), this.i.get(i));
        }
        notifyItemChanged(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i, List list) {
        ((c) e0Var).V5(i, this.i.get(i), list);
    }
}
