package xsna;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import xsna.qfq;

/* compiled from: SharingExternalAppAdapter.java */
/* loaded from: classes5.dex */
public final class obj0 extends RecyclerView.Adapter<a> {
    public yhu c;
    public ArrayList<qfq> d;

    /* compiled from: SharingExternalAppAdapter.java */
    public static final class a extends RecyclerView.e0 implements View.OnClickListener {

        @NonNull
        public ybj0 l;

        @Nullable
        public qfq m;

        @NonNull
        public yhu n;

        public a() {
            throw null;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(@NonNull View view) {
            qfq qfqVar = this.m;
            if (qfqVar != null) {
                this.n.invoke(qfqVar);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NonNull a aVar, int i) {
        a aVar2 = aVar;
        int adapterPosition = aVar2.getAdapterPosition();
        if (adapterPosition != -1) {
            qfq qfqVar = this.d.get(adapterPosition);
            aVar2.m = qfqVar;
            ybj0 ybj0Var = aVar2.l;
            Drawable a2 = m33.a(qfqVar.b, e43.a);
            boolean z = qfqVar instanceof qfq.a;
            ybj0Var.getClass();
            if (a2 != null) {
                Drawable mutate = a2.mutate();
                if (!z) {
                    mutate.setTint(ybj0Var.d);
                }
                ybj0Var.b = mutate;
                ybj0Var.e.setImageDrawable(mutate);
            }
            String e = y8g0.e(qfqVar.a);
            if (e != null) {
                ybj0Var.f.setText(e);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        ybj0 ybj0Var = new ybj0(viewGroup.getContext(), 5, null, null, false, false);
        yhu yhuVar = this.c;
        a aVar = new a(ybj0Var);
        aVar.n = yhuVar;
        aVar.l = ybj0Var;
        ybj0Var.setOnClickListener(aVar);
        return aVar;
    }
}
