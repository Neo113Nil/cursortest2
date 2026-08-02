package com.ybsdk.feature.savings.internal.screens.dashboard.v4;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;
import defpackage.bgc;
import defpackage.fcl0;
import defpackage.ftr0;
import defpackage.g8m0;
import defpackage.hc5;
import defpackage.iwg0;
import defpackage.j8m;
import defpackage.jw00;
import defpackage.lum;
import defpackage.mcm0;
import defpackage.nam0;
import defpackage.ncm0;
import defpackage.oam0;
import defpackage.q2d0;
import defpackage.qa3;
import defpackage.sls;
import defpackage.t1m0;
import defpackage.t3c0;
import defpackage.tls;
import defpackage.uam0;
import defpackage.vqy;
import defpackage.wnf0;
import defpackage.xvq;
import java.util.List;

/* loaded from: classes3.dex */
public final class b {
    public final ftr0 a;
    public final uam0 b;
    public final tls c;
    public final qa3 d;
    public final jw00 e;

    public b(Context context, tls tlsVar, c cVar, c cVar2, uam0 uam0Var, tls tlsVar2) {
        this.a = cVar;
        this.b = uam0Var;
        this.c = tlsVar2;
        byte b = 0;
        this.d = new qa3(hc5.b, new lum(new t1m0(b, 21), nam0.a, new vqy(tlsVar, cVar, cVar2, new a(this, 0), 29), oam0.a), new lum(new t1m0(b, 22), mcm0.a, new wnf0(tlsVar, new xvq(29), 2), ncm0.a));
        this.e = new jw00(context.getResources().getDimensionPixelSize(iwg0.ybsdk_savings_shelves_vertical_margins), 0, 0, null, 14);
    }

    public final void a(List list, sls slsVar) {
        this.d.h(list, new fcl0(3, slsVar));
    }

    public final void b(RecyclerView recyclerView) {
        qa3 qa3Var = this.d;
        recyclerView.setAdapter(qa3Var);
        recyclerView.addItemDecoration(this.e);
        t3c0 t3c0Var = new t3c0(recyclerView.getContext());
        j8m j8mVar = new j8m(recyclerView, 0.0f, new SavingsDashboardRecyclerHelperV4$setupDragAndDrop$dragAndDropItemTouchHelper$1(2, this.a, ftr0.class, "changeShelfPosition", "changeShelfPosition(II)V", 0), new a(this, 1), new g8m0(4, this), this.b, qa3Var, t3c0Var, new bgc(12), new q2d0(7), false);
        recyclerView.addItemDecoration(t3c0Var);
        new s(j8mVar).f(recyclerView);
    }
}
