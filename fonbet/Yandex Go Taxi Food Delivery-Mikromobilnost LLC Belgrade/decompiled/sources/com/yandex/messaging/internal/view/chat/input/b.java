package com.yandex.messaging.internal.view.chat.input;

import android.view.View;
import android.widget.TextView;
import com.yandex.bricks.d;
import com.yandex.messaging.domain.g;
import com.yandex.messaging.domain.statuses.e;
import com.yandex.messaging.internal.avatar.AvatarImageView;
import com.yandex.messaging.ui.badges.MarkedBadgeImageView;
import defpackage.bvf0;
import defpackage.dft;
import defpackage.dk6;
import defpackage.e9h0;
import defpackage.fx00;
import defpackage.gvg0;
import defpackage.h3y;
import defpackage.ike;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.kgx;
import defpackage.nl21;
import defpackage.o0k;
import defpackage.pzt0;
import defpackage.q0k;
import defpackage.qoi0;
import defpackage.rp3;
import defpackage.tje;
import defpackage.u9u0;
import defpackage.x6t;
import defpackage.xbb;
import defpackage.zyj;
import java.util.Objects;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes15.dex */
public final class b extends d implements nl21 {
    public static final /* synthetic */ kgx[] e0;
    public final q0k R;
    public final com.yandex.messaging.internal.team.gaps.a S;
    public final e T;
    public final g U;
    public final h3y V;
    public final AvatarImageView W;
    public final TextView Z;
    public final MarkedBadgeImageView a0;
    public zyj b0;
    public final rp3 c0;
    public final ike d0;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl("workflowJob", 0, "getWorkflowJob()Lkotlinx/coroutines/Job;", b.class);
        qoi0.a.getClass();
        e0 = new kgx[]{mutablePropertyReference1Impl};
    }

    public b(View view, q0k q0kVar, com.yandex.messaging.internal.team.gaps.a aVar, e eVar, g gVar, h3y h3yVar, xbb xbbVar) {
        super(view);
        this.R = q0kVar;
        this.S = aVar;
        this.T = eVar;
        this.U = gVar;
        this.V = h3yVar;
        this.W = (AvatarImageView) view.findViewById(e9h0.mention_suggest_avatar);
        this.Z = (TextView) view.findViewById(e9h0.mention_suggest_shown_name);
        this.a0 = (MarkedBadgeImageView) view.findViewById(e9h0.mention_suggest_badge);
        this.c0 = new rp3();
        this.d0 = bvf0.b();
        view.setOnClickListener(new fx00(3, xbbVar, this));
    }

    @Override // defpackage.nl21
    public final void B(o0k o0kVar) {
        this.Z.setText(o0kVar.a);
        this.W.setImageDrawable(o0kVar.b);
    }

    @Override // com.yandex.bricks.d, defpackage.ak6
    public final void onBrickAttach() {
        b bVar;
        super.onBrickAttach();
        Object obj = this.Q;
        Objects.requireNonNull(obj);
        int i = gvg0.avatar_size_24;
        this.b0 = this.R.b((String) obj, i, this);
        boolean z = ((u9u0) this.V.get()).w;
        dk6 dk6Var = this.P;
        if (z) {
            Object obj2 = this.Q;
            Objects.requireNonNull(obj2);
            bVar = this;
            kotlinx.coroutines.flow.e.H(dk6Var.a(), new jqr(this.T.a(new x6t((String) obj2)), new MentionSuggestViewHolder$onBrickAttach$1(2, bVar, b.class, "onStatusChanged", "onStatusChanged(Lcom/yandex/messaging/domain/statuses/DisplayUserStatus;)V", 4), 3));
        } else {
            bVar = this;
        }
        Object obj3 = bVar.Q;
        Objects.requireNonNull(obj3);
        kotlinx.coroutines.flow.e.H(dk6Var.a(), new jqr(bVar.U.a(new dft((String) obj3)), new MentionSuggestViewHolder$onBrickAttach$2(bVar, null), 3));
        pzt0 N = tje.N(bVar.d0, null, null, new MentionSuggestViewHolder$onBrickAttach$3(bVar, null), 3);
        kgx kgxVar = e0[0];
        bVar.c0.a(N);
    }

    @Override // com.yandex.bricks.d, defpackage.ak6
    public final void onBrickDetach() {
        super.onBrickDetach();
        this.W.clear();
        kgx kgxVar = e0[0];
        this.c0.a(null);
        zyj zyjVar = this.b0;
        if (zyjVar != null) {
            zyjVar.close();
        }
        this.b0 = null;
    }

    @Override // com.yandex.bricks.d
    public final boolean t(Object obj, Object obj2) {
        return jl40.l((String) obj, (String) obj2);
    }
}
