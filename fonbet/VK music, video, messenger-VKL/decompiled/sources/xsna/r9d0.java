package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.tile.VkTile;
import com.vkontakte.android.R;
import xsna.q9d0;
import xsna.q9d0.a;
import xsna.zp0;

/* compiled from: PrimaryHolder.kt */
/* loaded from: classes5.dex */
public final class r9d0 extends zoj0<zp0.b.a.C4192a, q9d0.a> {
    public final /* synthetic */ q9d0 e;

    public r9d0(q9d0 q9d0Var) {
        this.e = q9d0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((q9d0.a) e0Var).V5(this.c.c(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        VkTile vkTile = new VkTile(viewGroup.getContext(), null, 6);
        vkTile.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        vkTile.setTextAlignment(VkTile.TextAlignment.Center);
        vkTile.setBackgroundResource(R.drawable.profile_content_ripple_bounded_14dp);
        return this.e.new a(vkTile);
    }
}
