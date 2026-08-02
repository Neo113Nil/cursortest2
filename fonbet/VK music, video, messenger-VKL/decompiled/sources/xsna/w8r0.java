package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.m;
import com.vk.superapp.catalog.api.v2.adapter.BlockType;
import java.util.ArrayList;
import java.util.List;

/* compiled from: VKAppsCatalogRedesignAdapter.kt */
/* loaded from: classes6.dex */
public final class w8r0 extends b8r0 {
    public final u8r0 c;
    public final ArrayList d = new ArrayList();

    public w8r0(u8r0 u8r0Var) {
        this.c = u8r0Var;
    }

    @Override // xsna.vic, com.vk.lists.c.i
    public final void clear() {
        this.d.clear();
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return ((x7a) this.d.get(i)).a;
    }

    @Override // xsna.b8r0
    public final void h0(List<? extends x7a> list) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i = size - 1;
        arrayList.addAll(list);
        notifyItemRangeInserted(size, list.size());
        if (i >= 0) {
            notifyItemChanged(i);
        }
    }

    @Override // xsna.jjv0
    public final int n1(int i) {
        if (i >= this.d.size() || i < 0) {
            return 0;
        }
        if (i == 0) {
            return 4;
        }
        return ((x7a) this.d.get(i)).c == BlockType.TOP ? 2 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(e9r0<x7a> e9r0Var, int i) {
        e9r0Var.V5(this.d.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final e9r0<x7a> onCreateViewHolder(ViewGroup viewGroup, int i) {
        u8r0 u8r0Var = this.c;
        if (i == 0) {
            return new wkf0(viewGroup, u8r0Var);
        }
        if (i == 1) {
            return new wkf0(viewGroup, u8r0Var);
        }
        if (i == 3) {
            return new rd90(viewGroup, u8r0Var);
        }
        if (i == 4) {
            return new lla(viewGroup, u8r0Var);
        }
        if (i == 5) {
            return new lcv(viewGroup, u8r0Var);
        }
        if (i == 6) {
            return new w13(viewGroup, u8r0Var);
        }
        if (i == 7) {
            return new zcv(viewGroup, u8r0Var);
        }
        if (i == 10) {
            return new a7s(viewGroup);
        }
        if (i == 999) {
            return new asm0(viewGroup);
        }
        throw new IllegalStateException(("Unknown catalog section type: " + i).toString());
    }

    @Override // xsna.b8r0
    public final void setItems(List<? extends x7a> list) {
        ArrayList arrayList = this.d;
        m.d a = androidx.recyclerview.widget.m.a(new m4a(arrayList, list), true);
        arrayList.clear();
        arrayList.addAll(list);
        a.b(this);
    }

    @Override // xsna.jjv0
    public final int t(int i) {
        if (i >= this.d.size() || i < 0 || i == 0 || ((x7a) this.d.get(i)).c != BlockType.TOP) {
            return 0;
        }
        return iah0.a(12);
    }
}
