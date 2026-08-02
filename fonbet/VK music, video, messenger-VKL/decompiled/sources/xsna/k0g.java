package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: CollageColorsAdapter.kt */
/* loaded from: classes4.dex */
public final class k0g extends androidx.recyclerview.widget.x<f0g, i0g> {
    public final int c;
    public izs<? super Integer, s3q0> d;

    public k0g(int i) {
        super(g0g.a);
        this.c = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, final int i) {
        i0g i0gVar = (i0g) e0Var;
        f0g item = getItem(i);
        ImageView imageView = i0gVar.o;
        ImageView imageView2 = i0gVar.n;
        ImageView imageView3 = i0gVar.p;
        ImageView imageView4 = i0gVar.q;
        View view = i0gVar.l;
        View view2 = i0gVar.m;
        int i2 = item.b;
        view2.setBackgroundColor(i2);
        view2.setContentDescription(item.a);
        if (item.d) {
            view.setSelected(true);
            imageView2.setVisibility(8);
            imageView.setVisibility(0);
            if (i2 == -1) {
                imageView4.setVisibility(0);
                imageView3.setVisibility(8);
            } else {
                imageView4.setVisibility(8);
                imageView3.setVisibility(0);
            }
        } else {
            view.setSelected(false);
            imageView2.setVisibility(0);
            imageView.setVisibility(8);
            imageView3.setVisibility(8);
            imageView4.setVisibility(8);
        }
        view.setContentDescription(item.c.a(view.getContext()));
        view.setOnClickListener(new View.OnClickListener() { // from class: xsna.j0g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                izs<? super Integer, s3q0> izsVar = k0g.this.d;
                if (izsVar != null) {
                    izsVar.invoke(Integer.valueOf(i));
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new i0g(LayoutInflater.from(viewGroup.getContext()).inflate(this.c, viewGroup, false));
    }
}
