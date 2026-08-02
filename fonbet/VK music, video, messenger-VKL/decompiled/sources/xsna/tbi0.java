package xsna;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.tile.VkTile;
import com.vk.im.engine.models.users.UserNameCase;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.h0r0;
import xsna.ldi0;

/* compiled from: SelectionPreviewVh.kt */
/* loaded from: classes2.dex */
public final class tbi0 extends RecyclerView.Adapter<h0r0> {
    public final LayoutInflater c;
    public final int d;
    public final gei0 e;
    public List<? extends ldi0> f = EmptyList.b;

    public tbi0(LayoutInflater layoutInflater, int i, gei0 gei0Var) {
        this.c = layoutInflater;
        this.d = i;
        this.e = gei0Var;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return this.f.get(i).getId();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return this.d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(h0r0 h0r0Var, int i) {
        h0r0 h0r0Var2 = h0r0Var;
        ldi0 ldi0Var = this.f.get(i);
        VkTile vkTile = h0r0Var2.m;
        h0r0Var2.n = ldi0Var;
        if (ldi0Var instanceof ldi0.b) {
            qtd0 qtd0Var = ((ldi0.b) ldi0Var).a;
            vkTile.setTitle(new VkTile.e(oq.d(tlo0.Companion, qtd0Var.d6(UserNameCase.NOM)), 0, null, null, null, null, null, 510));
            vkTile.setVisualContentParams(new h0r0.a(qtd0Var, null, 2));
            vkTile.setRemovable(true);
            vkTile.setTextAlignment(VkTile.TextAlignment.Center);
            return;
        }
        if (!ldi0Var.equals(ldi0.a.a)) {
            throw new NoWhenBranchMatchedException();
        }
        Drawable drawable = h0r0Var2.itemView.getContext().getDrawable(R.drawable.vk_icon_users_circle_fill_blue_48);
        vkTile.setRemovable(true);
        vkTile.setTextAlignment(VkTile.TextAlignment.Center);
        vkTile.setVisualContentParams(new h0r0.a(null, drawable, 1));
        vkTile.setTitle(new VkTile.e(tq.h(tlo0.Companion, R.string.vkim_channel_control_subscribers), 0, null, null, null, null, null, 510));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final h0r0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new h0r0(this.c.inflate(R.layout.vkim_contacts_user_selection_vh_v2, viewGroup, false), this.e);
    }
}
