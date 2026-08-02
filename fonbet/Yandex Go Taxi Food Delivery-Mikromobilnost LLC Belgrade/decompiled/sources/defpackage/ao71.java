package defpackage;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import java.util.List;
import yads.gw1;

/* loaded from: classes7.dex */
public final class ao71 extends RecyclerView.Adapter {
    public final List a;
    public final rr41 b;

    public ao71(v881 v881Var, List list, d881 d881Var) {
        rr41 rr41Var = new rr41(21, v881Var, d881Var);
        this.a = list;
        this.b = rr41Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        ((b871) x0Var).N.D((cu81) this.a.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        rr41 rr41Var = this.b;
        rr41Var.getClass();
        ImageView imageView = new ImageView(viewGroup.getContext());
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setOnClickListener(new gw1());
        int i2 = v871.f;
        return new b871(imageView, new v871(imageView, (v881) rr41Var.b, (d881) rr41Var.c));
    }
}
