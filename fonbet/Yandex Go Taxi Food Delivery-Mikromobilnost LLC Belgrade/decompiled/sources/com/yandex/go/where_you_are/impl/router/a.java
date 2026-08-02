package com.yandex.go.where_you_are.impl.router;

import com.yandex.go.navigation.screen.c;
import com.yandex.go.preorder.mode.SourcePointMode;
import com.yandex.go.taxi.summary.api.ui.MapPositionAction;
import com.yandex.go.where_you_are.impl.presentation.WhereYouAreModalView;
import com.yandex.go.where_you_are.impl.presentation.d;
import defpackage.ah00;
import defpackage.bwx0;
import defpackage.dmb0;
import defpackage.dz41;
import defpackage.e6g;
import defpackage.fi6;
import defpackage.fmb0;
import defpackage.gh00;
import defpackage.hz41;
import defpackage.i130;
import defpackage.i3y;
import defpackage.jpn0;
import defpackage.kz41;
import defpackage.ly41;
import defpackage.nwx0;
import defpackage.o7r0;
import defpackage.ob0;
import defpackage.qd21;
import defpackage.tcc;
import defpackage.wpb0;
import defpackage.yit0;
import defpackage.yvf0;
import defpackage.yy41;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import ru.yandex.taxi.preorder.source.domain.r;
import ru.yandex.taxi.preorder.source.mode.interactor.e;

/* loaded from: classes6.dex */
public final class a {
    public final dz41 a;
    public final i130 b;
    public final jpn0 c;
    public final yy41 d;
    public final ah00 e;
    public final ly41 f;
    public final c g;
    public final hz41 h;
    public final i3y i;
    public kz41 j;

    public a(qd21 qd21Var, dz41 dz41Var, i130 i130Var, jpn0 jpn0Var, yy41 yy41Var, ah00 ah00Var, ly41 ly41Var, c cVar, hz41 hz41Var) {
        this.a = dz41Var;
        this.b = i130Var;
        this.c = jpn0Var;
        this.d = yy41Var;
        this.e = ah00Var;
        this.f = ly41Var;
        this.g = cVar;
        this.h = hz41Var;
        this.i = kotlin.a.b(LazyThreadSafetyMode.NONE, new WhereYouAreRouter$bubbleHolder$1(0, qd21Var, yvf0.class, "get", "get()Ljava/lang/Object;", 0));
    }

    public final void a() {
        i3y i3yVar = this.i;
        if (i3yVar.isInitialized()) {
            ((d) i3yVar.getValue()).a();
        }
    }

    public final void b(kz41 kz41Var) {
        List list = kz41Var.e;
        e6g e6gVar = (e6g) this.a;
        r rVar = (r) e6gVar.l;
        ru.yandex.taxi.map.overlay.pickup.d dVar = rVar.e;
        dmb0 dmb0Var = new dmb0();
        dmb0Var.a = list;
        dmb0Var.c = "boarding_image";
        dmb0Var.b = new ob0(13, rVar);
        dVar.Pg(new fmb0(dmb0Var));
        ((e) e6gVar.n).h(SourcePointMode.WHERE_YOU_ARE, true, false);
        ((bwx0) e6gVar.o).a();
        ((nwx0) e6gVar.p).a.c().C1();
        ((yit0) e6gVar.q).a(MapPositionAction.DEFAULT);
        fi6 fi6Var = new fi6();
        List list2 = kz41Var.e;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((wpb0) it.next()).b);
        }
        fi6Var.f(arrayList);
        ((gh00) this.e).A(fi6Var.g(), null);
        i130 i130Var = this.b;
        WhereYouAreModalView whereYouAreModalView = (WhereYouAreModalView) i130Var.a().i(WhereYouAreModalView.class);
        if (whereYouAreModalView != null) {
            whereYouAreModalView.render(kz41Var);
            return;
        }
        WhereYouAreModalView whereYouAreModalView2 = (WhereYouAreModalView) this.c.get();
        whereYouAreModalView2.render(kz41Var);
        i130Var.a().s(whereYouAreModalView2, false);
        yy41 yy41Var = this.d;
        o7r0 o7r0Var = yy41Var.b;
        o7r0Var.getClass();
        o7r0Var.a.a("WhereAreYou.Shown", new HashMap(), 1, new HashMap());
        o7r0 o7r0Var2 = yy41Var.b;
        o7r0Var2.getClass();
        o7r0Var2.a.a("WhereAreYou.LocationBubble.Shown", new HashMap(), 1, new HashMap());
    }
}
