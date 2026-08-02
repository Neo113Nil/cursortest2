package yads;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes10.dex */
public final class iy1 extends RecyclerView.Adapter {
    public final List a;
    public final fy1 b;

    public iy1(nj2 nj2Var, List list, v9 v9Var) {
        this.a = list;
        this.b = new fy1(nj2Var, v9Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((dy1) e0Var).a.b((x41) this.a.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        fy1 fy1Var = this.b;
        fy1Var.getClass();
        ImageView imageView = new ImageView(viewGroup.getContext());
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setOnClickListener(new ey1());
        return new dy1(imageView, new f51(imageView, fy1Var.a, fy1Var.b));
    }
}
