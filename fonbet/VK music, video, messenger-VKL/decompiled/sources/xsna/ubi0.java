package xsna;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.im.engine.models.users.UserNameCase;
import com.vk.im.ui.views.avatars.ImAvatarView;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.ldi0;

/* compiled from: SelectionPreviewVhOld.kt */
/* loaded from: classes2.dex */
public final class ubi0 extends RecyclerView.Adapter<i0r0> {
    public final LayoutInflater c;
    public final int d;
    public final gei0 e;
    public List<? extends ldi0> f = EmptyList.b;

    public ubi0(LayoutInflater layoutInflater, int i, gei0 gei0Var) {
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
    public final void onBindViewHolder(i0r0 i0r0Var, int i) {
        i0r0 i0r0Var2 = i0r0Var;
        ldi0 ldi0Var = this.f.get(i);
        View view = i0r0Var2.n;
        TextView textView = i0r0Var2.o;
        ImAvatarView imAvatarView = i0r0Var2.m;
        i0r0Var2.p = ldi0Var;
        if (ldi0Var instanceof ldi0.b) {
            ldi0.b bVar = (ldi0.b) ldi0Var;
            qtd0 qtd0Var = bVar.a;
            imAvatarView.s1(qtd0Var);
            textView.setText(qtd0Var.d6(UserNameCase.NOM));
            bwt0.p0(view, i0r0Var2.l.t(bVar));
            return;
        }
        if (!ldi0Var.equals(ldi0.a.a)) {
            throw new NoWhenBranchMatchedException();
        }
        Drawable drawable = i0r0Var2.itemView.getContext().getDrawable(R.drawable.vk_icon_users_circle_fill_blue_48);
        imAvatarView.s1(null);
        imAvatarView.setImageDrawable(drawable);
        textView.setText(i0r0Var2.itemView.getContext().getString(R.string.vkim_channel_control_subscribers));
        bwt0.p0(view, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final i0r0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new i0r0(this.c.inflate(R.layout.vkim_contacts_user_selection_vh, viewGroup, false), this.e);
    }
}
