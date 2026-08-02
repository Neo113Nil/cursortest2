package com.yandex.messaging.ui.settings;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import com.yandex.messaging.internal.avatar.AvatarImageView;
import defpackage.bn4;
import defpackage.e9h0;
import defpackage.fx00;
import defpackage.ike;
import defpackage.jl40;
import defpackage.nyh0;
import defpackage.o5b0;
import defpackage.olh0;
import defpackage.oy80;
import defpackage.p5b0;
import defpackage.vqb;
import defpackage.vse;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes15.dex */
public final class c extends RecyclerView.Adapter {
    public final oy80 a;
    public List b = EmptyList.a;
    public vqb c;

    public c(oy80 oy80Var) {
        this.a = oy80Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        p5b0 p5b0Var = (p5b0) x0Var;
        ike ikeVar = p5b0Var.O;
        View view = p5b0Var.a;
        view.setTag(e9h0.should_skip_divider, Boolean.valueOf(i == 0));
        view.setOnClickListener(new fx00(15, this, p5b0Var));
        o5b0 o5b0Var = (o5b0) this.b.get(i);
        boolean l = jl40.l(this.b.get(i), null);
        kotlinx.coroutines.a.g(ikeVar.a, null);
        p5b0Var.Q.setText(o5b0Var.b);
        com.yandex.messaging.extension.flow.c.b(com.yandex.messaging.domain.unreadcount.d.d(p5b0Var.N, Long.valueOf(o5b0Var.a), null, 6), ikeVar, new PersonalOrganizationsAdapter$ViewHolder$bind$1(p5b0Var, null));
        AvatarImageView avatarImageView = p5b0Var.P;
        avatarImageView.setImageDrawable(o5b0Var.c);
        avatarImageView.setBorderColor(l ? p5b0Var.T : 0);
        avatarImageView.setTag(l ? Integer.valueOf(nyh0.selected_organization_avatar_tag) : null);
        p5b0Var.S.setBadge(o5b0Var.d ? new bn4(0) : null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(olh0.msg_vh_organization, viewGroup, false);
        oy80 oy80Var = this.a;
        oy80Var.getClass();
        return new p5b0(inflate, (vse) oy80Var.b, (com.yandex.messaging.domain.unreadcount.d) oy80Var.c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(x0 x0Var) {
        p5b0 p5b0Var = (p5b0) x0Var;
        super.onViewRecycled(p5b0Var);
        kotlinx.coroutines.a.g(p5b0Var.O.a, null);
    }
}
