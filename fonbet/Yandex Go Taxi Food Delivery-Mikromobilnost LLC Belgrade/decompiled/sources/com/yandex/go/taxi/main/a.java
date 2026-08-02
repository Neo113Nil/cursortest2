package com.yandex.go.taxi.main;

import defpackage.a3v;
import defpackage.biv0;
import defpackage.cc60;
import defpackage.czo0;
import defpackage.fif;
import defpackage.g18;
import defpackage.hbp0;
import defpackage.i130;
import defpackage.ja00;
import defpackage.jc00;
import defpackage.jgt0;
import defpackage.ka00;
import defpackage.krl0;
import defpackage.mrj;
import defpackage.nwf0;
import defpackage.o500;
import defpackage.od61;
import defpackage.pwf0;
import defpackage.reu;
import defpackage.t5i;
import defpackage.tje;
import defpackage.yb60;
import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.coroutines.CoroutineStart;
import ru.yandex.taxi.preorder.mainscreen.MainScreen;
import ru.yandex.taxi.preorder.mainscreen.transition.ITransitionCoordinator;

/* loaded from: classes14.dex */
public final class a implements ja00 {
    public final od61 a;
    public final jgt0 b;
    public final fif c;
    public final ru.yandex.taxi.preorder.source.mode.interactor.e d;
    public final i130 e;
    public final t5i f;
    public final mrj g;
    public final jc00 h;
    public final o500 i;
    public final biv0 j;
    public final cc60 k;
    public krl0 m;
    public g18 r;
    public boolean s;
    public final hbp0 l = new hbp0(new czo0(14), "", null);
    public final nwf0 n = pwf0.b(MainScreen.class);
    public final nwf0 o = pwf0.b(ITransitionCoordinator.class);
    public final ArrayList p = new ArrayList();
    public final reu q = new reu(25, this);

    public a(od61 od61Var, jgt0 jgt0Var, fif fifVar, ru.yandex.taxi.preorder.source.mode.interactor.e eVar, i130 i130Var, t5i t5iVar, mrj mrjVar, jc00 jc00Var, o500 o500Var, biv0 biv0Var, cc60 cc60Var) {
        this.a = od61Var;
        this.b = jgt0Var;
        this.c = fifVar;
        this.d = eVar;
        this.e = i130Var;
        this.f = t5iVar;
        this.g = mrjVar;
        this.h = jc00Var;
        this.i = o500Var;
        this.j = biv0Var;
        this.k = cc60Var;
    }

    public final void a() {
        ShortcutsMainScreen shortcutsMainScreen;
        this.k.b.g(yb60.a);
        krl0 krl0Var = this.m;
        if (krl0Var != null && (shortcutsMainScreen = (ShortcutsMainScreen) krl0Var.a) != null) {
            shortcutsMainScreen.pause();
        }
        this.o.a(null);
        this.n.a(null);
        this.l.b();
        g18 g18Var = this.r;
        if (g18Var != null) {
            g18Var.cancel();
        }
        this.r = null;
        this.s = false;
    }

    public final void b() {
        this.s = true;
        hbp0 hbp0Var = this.l;
        hbp0Var.a();
        krl0 krl0Var = this.m;
        if (krl0Var == null) {
            return;
        }
        ShortcutsMainScreen shortcutsMainScreen = (ShortcutsMainScreen) krl0Var.a;
        ((a3v) krl0Var.b).q3(MainScreen.class, 0, shortcutsMainScreen.getTopContentHeight(), 0, shortcutsMainScreen.getBottomContentHeight());
        this.o.a(shortcutsMainScreen.getTransitionCoordinator());
        this.n.a(shortcutsMainScreen);
        Iterator it = this.p.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        shortcutsMainScreen.resume();
        if (this.a.a() && this.c.d) {
            c().v7();
        }
        tje.N(hbp0Var, null, null, new MainScreenHolderImpl$onResume$$inlined$safeCollectIn$1(this.b.b, null, this), 3);
        this.r = this.e.a().g(new ka00(0, this));
        tje.N(hbp0Var, null, null, new MainScreenHolderImpl$onResume$$inlined$safeCollectIn$2(this.f.b, null, this), 3);
        hbp0.e(hbp0Var, null, CoroutineStart.UNDISPATCHED, new MainScreenHolderImpl$onResume$4(this, null), 1);
        hbp0.e(hbp0Var, null, null, new MainScreenHolderImpl$onResume$5(this, null), 3);
    }

    public final ITransitionCoordinator c() {
        return (ITransitionCoordinator) this.o.b;
    }
}
