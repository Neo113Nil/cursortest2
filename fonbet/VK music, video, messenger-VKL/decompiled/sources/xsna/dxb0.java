package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PopupMenuAdapter.kt */
/* loaded from: classes4.dex */
public final class dxb0 extends RecyclerView.Adapter<RecyclerView.e0> {
    public final fux<exb0> c;
    public final ArrayList<exb0> d = new ArrayList<>();

    /* compiled from: PopupMenuAdapter.kt */
    public final class a extends RecyclerView.e0 {
        public final fux<exb0> l;
        public final TextView m;

        /* JADX WARN: Multi-variable type inference failed */
        public a(dxb0 dxb0Var, ViewGroup viewGroup, fux<? super exb0> fuxVar) {
            super(tf3.b(viewGroup, R.layout.holder_popup_menu_item, viewGroup, false));
            this.l = fuxVar;
            View view = this.itemView;
            this.m = (TextView) view;
            view.setOnClickListener(new eju(4, this, dxb0Var));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dxb0(fux<? super exb0> fuxVar) {
        this.c = fuxVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        if (e0Var instanceof a) {
            exb0 exb0Var = this.d.get(i);
            TextView textView = ((a) e0Var).m;
            textView.setText(exb0Var.b);
            textView.setEnabled(exb0Var.c);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(this, viewGroup, this.c);
    }

    public final void x0(int i, boolean z) {
        ArrayList<exb0> arrayList = this.d;
        Iterator<exb0> it = arrayList.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (it.next().a == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1) {
            return;
        }
        arrayList.get(i2).c = z;
        notifyItemChanged(i2);
    }
}
