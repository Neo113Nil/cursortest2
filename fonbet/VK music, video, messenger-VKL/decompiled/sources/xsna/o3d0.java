package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import java.util.List;
import xsna.pfm0;

/* compiled from: PreviewAdapter.kt */
/* loaded from: classes6.dex */
public final class o3d0 extends androidx.recyclerview.widget.x<m4d0, y5d0> {
    public final w65 c;
    public pfm0.a d;
    public String e;

    public o3d0() {
        super(p3d0.a);
        this.c = new w65(15);
        this.e = "H,16:9";
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((y5d0) e0Var).V5(getItem(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new y5d0(tf3.b(viewGroup, R.layout.pds_item_story_statistics_preview, viewGroup, false), this.d, this.e);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i, List list) {
        y5d0 y5d0Var = (y5d0) e0Var;
        if (!list.isEmpty()) {
            y5d0Var.W5(getItem(i), j5g.Y(list));
        } else {
            y5d0Var.V5(getItem(i));
        }
    }
}
