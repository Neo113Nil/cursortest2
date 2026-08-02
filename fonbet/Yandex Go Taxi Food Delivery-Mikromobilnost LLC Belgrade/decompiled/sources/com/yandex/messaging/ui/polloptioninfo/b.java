package com.yandex.messaging.ui.polloptioninfo;

import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.x0;
import com.yandex.messaging.core.net.entities.proto.PollInfoResponse;
import com.yandex.messaging.core.net.entities.proto.message.ReducedUserInfo;
import com.yandex.messaging.domain.user.UserNameType;
import defpackage.b890;
import defpackage.cyd0;
import defpackage.d890;
import defpackage.dyd0;
import defpackage.gyd0;
import defpackage.h791;
import defpackage.in21;
import defpackage.olh0;
import defpackage.pzt0;
import defpackage.qp21;
import defpackage.rp21;
import defpackage.tje;
import defpackage.vse;

/* loaded from: classes15.dex */
public final class b extends d890 {
    public final com.yandex.messaging.internal.avatar.a x;
    public final vse y;
    public final rp21 z;

    public b(gyd0 gyd0Var, com.yandex.messaging.internal.avatar.a aVar, vse vseVar, rp21 rp21Var) {
        super(new b890(gyd0Var, new Handler(Looper.getMainLooper()), 100, 50), new dyd0());
        this.x = aVar;
        this.y = vseVar;
        this.z = rp21Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        cyd0 cyd0Var = (cyd0) x0Var;
        PollInfoResponse.Vote vote = (PollInfoResponse.Vote) getItem(i);
        ReducedUserInfo userInfo = vote.getUserInfo();
        rp21 rp21Var = cyd0Var.P;
        String str = userInfo.userId;
        long c = rp21Var.b.c();
        in21 a = rp21Var.a.a().a(str);
        String g = h791.g(a == null ? new qp21(null, UserNameType.NOT_FOUND) : rp21Var.c.a(a, c), cyd0Var.a.getResources(), vote.getUserInfo().displayName);
        cyd0Var.R.setText(g);
        pzt0 pzt0Var = cyd0Var.U;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        cyd0Var.U = tje.N(cyd0Var.O, null, null, new PollVoterViewHolder$bind$1(userInfo, g, cyd0Var, null), 3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new cyd0(LayoutInflater.from(viewGroup.getContext()).inflate(olh0.msg_vh_member_without_divider, viewGroup, false), this.x, this.y.c(false), this.z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(x0 x0Var) {
        cyd0 cyd0Var = (cyd0) x0Var;
        super.onViewRecycled(cyd0Var);
        pzt0 pzt0Var = cyd0Var.U;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        cyd0Var.U = null;
    }
}
