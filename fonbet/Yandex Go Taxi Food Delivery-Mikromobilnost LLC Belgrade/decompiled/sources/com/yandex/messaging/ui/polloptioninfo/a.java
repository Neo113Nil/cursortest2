package com.yandex.messaging.ui.polloptioninfo;

import android.app.Activity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.messaging.core.net.entities.proto.PollInfoRequest;
import com.yandex.messaging.core.net.entities.proto.PollInfoRequestBuilder;
import com.yandex.messaging.internal.authorized.j;
import defpackage.d5b0;
import defpackage.gyd0;
import defpackage.jqr;
import defpackage.ms11;
import defpackage.qxd0;
import defpackage.rp21;
import defpackage.rxd0;
import defpackage.ss11;
import defpackage.tbt;
import defpackage.ubt;
import defpackage.vse;
import kotlinx.coroutines.flow.e;

/* loaded from: classes15.dex */
public final class a extends ss11 {
    public final rxd0 a;
    public final Activity b;
    public final ubt c;
    public final qxd0 w;
    public final b x;

    public a(rxd0 rxd0Var, Activity activity, ubt ubtVar, qxd0 qxd0Var, com.yandex.messaging.internal.avatar.a aVar, j jVar, vse vseVar, rp21 rp21Var) {
        this.a = rxd0Var;
        this.b = activity;
        this.c = ubtVar;
        this.w = qxd0Var;
        PollInfoRequestBuilder pollInfoRequestBuilder = new PollInfoRequestBuilder();
        pollInfoRequestBuilder.a = qxd0Var.b;
        pollInfoRequestBuilder.b = qxd0Var.c;
        pollInfoRequestBuilder.d = qxd0Var.d;
        pollInfoRequestBuilder.e = qxd0Var.e;
        b bVar = new b(new gyd0(vseVar, new PollInfoRequest(pollInfoRequestBuilder), qxd0Var.f, jVar), aVar, vseVar, rp21Var);
        this.x = bVar;
        rxd0Var.w.setOnClickListener(new d5b0(15, this));
        RecyclerView recyclerView = rxd0Var.C;
        recyclerView.setAdapter(bVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickAttach() {
        super.onBrickAttach();
        qxd0 qxd0Var = this.w;
        String str = qxd0Var.b;
        tbt tbtVar = new tbt(1, qxd0Var.c, qxd0Var.e, str, qxd0Var.d);
        this.x.a.b();
        e.H(getBrickScope(), new jqr(this.c.a(tbtVar), new PollOptionInfoBrick$onBrickAttach$1(this, null), 3));
    }

    @Override // com.yandex.bricks.Brick, defpackage.ak6
    public final void onBrickDetach() {
        super.onBrickDetach();
        this.x.a.a();
    }

    @Override // defpackage.ss11
    public final ms11 q() {
        return this.a;
    }
}
