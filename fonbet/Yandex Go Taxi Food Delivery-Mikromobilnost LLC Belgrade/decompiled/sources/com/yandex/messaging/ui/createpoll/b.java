package com.yandex.messaging.ui.createpoll;

import android.app.Activity;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;
import defpackage.a6f;
import defpackage.ai91;
import defpackage.ci8;
import defpackage.gse;
import defpackage.jqr;
import defpackage.k7f;
import defpackage.lxw0;
import defpackage.m7f;
import defpackage.ms11;
import defpackage.ss11;
import defpackage.t7f;
import defpackage.tje;
import kotlinx.coroutines.flow.e;

/* loaded from: classes15.dex */
public final class b extends ss11 {
    public final Activity a;
    public final m7f b;
    public final k7f c;
    public final t7f w;

    public b(Activity activity, m7f m7fVar, k7f k7fVar, t7f t7fVar) {
        this.a = activity;
        this.b = m7fVar;
        this.c = k7fVar;
        this.w = t7fVar;
        ai91.b(new gse(3), m7fVar.b);
        m7fVar.w.setOnClickListener(new ci8(13, this));
        RecyclerView recyclerView = m7fVar.x;
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
        recyclerView.setAdapter(k7fVar);
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(new a6f());
        new s(new lxw0(t7fVar)).f(recyclerView);
        m7fVar.y.setOnClickListener(new View.OnClickListener() { // from class: com.yandex.messaging.ui.createpoll.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b bVar = b.this;
                tje.N(bVar.getBrickScope(), null, null, new CreateMessagePollBrick$4$1(bVar, null), 3);
            }
        });
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickAttach() {
        super.onBrickAttach();
        t7f t7fVar = this.w;
        e.H(t7fVar.e, new jqr(t7fVar.c.a(t7fVar.b), new CreatePollViewModel$onBrickAttached$1(t7fVar, null), 3));
        e.H(getBrickScope(), new jqr(t7fVar.n, new CreateMessagePollBrick$onBrickAttach$1(this, null), 3));
        e.H(getBrickScope(), new jqr(t7fVar.o, new CreateMessagePollBrick$onBrickAttach$2(this, null), 3));
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickDetach() {
        super.onBrickDetach();
        kotlinx.coroutines.a.g(this.w.e.a, null);
    }

    @Override // defpackage.ss11
    public final ms11 q() {
        return this.b;
    }
}
