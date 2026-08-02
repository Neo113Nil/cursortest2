package com.yandex.go.payments_widgets.mini.widgets.presentation;

import android.content.Context;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import com.yandex.go.coroutines.b;
import defpackage.dea0;
import defpackage.kn4;
import defpackage.nla0;
import defpackage.p800;
import defpackage.pzt0;
import defpackage.tse;
import defpackage.yo40;

/* loaded from: classes8.dex */
public final class a extends kn4 {
    public final ViewGroup b;
    public final tse c;
    public final Context d;
    public final ComponentActivity e;
    public final yo40 f;
    public final nla0 g;
    public final dea0 h;
    public final p800 i;
    public pzt0 j;

    public a(ViewGroup viewGroup, tse tseVar, Context context, ComponentActivity componentActivity, yo40 yo40Var, nla0 nla0Var, dea0 dea0Var, p800 p800Var) {
        super(viewGroup);
        this.b = viewGroup;
        this.c = tseVar;
        this.d = context;
        this.e = componentActivity;
        this.f = yo40Var;
        this.g = nla0Var;
        this.h = dea0Var;
        this.i = p800Var;
    }

    @Override // defpackage.kn4
    public final void a() {
        this.j = b.g(this.c, null, null, new PaymentsMiniWidgetsViewHolder$attach$1(this, null), 3);
    }

    @Override // defpackage.kn4
    public final void b() {
        pzt0 pzt0Var = this.j;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
    }
}
