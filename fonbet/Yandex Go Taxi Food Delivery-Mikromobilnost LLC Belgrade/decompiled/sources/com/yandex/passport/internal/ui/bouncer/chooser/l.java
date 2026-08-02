package com.yandex.passport.internal.ui.bouncer.chooser;

import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.yandex.passport.internal.report.q5;
import com.yandex.passport.internal.ui.bouncer.BouncerActivity;
import com.yandex.passport.internal.ui.bouncer.model.d1;
import com.yandex.passport.internal.ui.bouncer.model.u1;
import defpackage.ins0;
import defpackage.tcc;
import defpackage.yv5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class l extends ins0 implements yv5 {
    public final com.yandex.passport.internal.ui.bouncer.t D;
    public final a E;
    public final com.yandex.passport.internal.report.reporters.s F;
    public final ComposeView G;
    public ArrayList H;

    public l(BouncerActivity bouncerActivity, com.yandex.passport.internal.ui.bouncer.t tVar, a aVar, com.yandex.passport.internal.report.reporters.s sVar) {
        this.D = tVar;
        this.E = aVar;
        this.F = sVar;
        this.G = new ComposeView(bouncerActivity, null, 0, 6, null);
    }

    @Override // defpackage.yv5
    public final void c(Object obj) {
        u1 u1Var = (u1) obj;
        List list = u1Var.b;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((d1) it.next()).a);
        }
        this.H = arrayList;
        this.G.setContent(new androidx.compose.runtime.internal.a(-1237476288, new k(this, u1Var, 1), true));
    }

    @Override // defpackage.ins0
    public final View e() {
        return this.G;
    }

    @Override // defpackage.ins0
    public final void f(Bundle bundle) {
        ArrayList arrayList = this.H;
        if (bundle != null || arrayList == null) {
            return;
        }
        com.yandex.passport.internal.report.reporters.s sVar = this.F;
        sVar.getClass();
        sVar.f(q5.w, new com.yandex.passport.internal.report.a(arrayList.size(), 18), new com.yandex.passport.internal.report.i(arrayList, 28));
    }
}
