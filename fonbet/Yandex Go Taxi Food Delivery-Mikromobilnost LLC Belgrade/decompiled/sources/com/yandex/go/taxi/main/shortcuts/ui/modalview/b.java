package com.yandex.go.taxi.main.shortcuts.ui.modalview;

import com.yandex.go.taxi.main.shortcuts.ui.modalview.ShortcutModalViewMvp;
import defpackage.c9y0;
import defpackage.hbp0;
import defpackage.hzr0;
import defpackage.jc00;
import defpackage.ljg0;
import defpackage.n050;
import defpackage.ney;
import defpackage.oep0;
import defpackage.pzt0;
import defpackage.qc5;
import defpackage.r9g;
import defpackage.sxr0;
import defpackage.tje;
import defpackage.tlw0;
import defpackage.x0s0;
import ru.yandex.taxi.multiorder.e;

/* loaded from: classes14.dex */
public final class b extends qc5 {
    public final sxr0 A;
    public final hzr0 B;
    public final tlw0 C;
    public final a D;
    public final e E;
    public final jc00 F;
    public final d G;
    public final ru.yandex.taxi.perf.screen.c H;
    public final n050 I;
    public final ljg0 J;
    public final r9g K;
    public final oep0 L;
    public boolean M;

    public b(ney neyVar, sxr0 sxr0Var, hzr0 hzr0Var, tlw0 tlw0Var, a aVar, e eVar, jc00 jc00Var, d dVar, ru.yandex.taxi.perf.screen.c cVar, n050 n050Var, ljg0 ljg0Var, r9g r9gVar, oep0 oep0Var) {
        super(ShortcutModalViewMvp.class, neyVar);
        this.A = sxr0Var;
        this.B = hzr0Var;
        this.C = tlw0Var;
        this.D = aVar;
        this.E = eVar;
        this.F = jc00Var;
        this.G = dVar;
        this.H = cVar;
        this.I = n050Var;
        this.J = ljg0Var;
        this.K = r9gVar;
        this.L = oep0Var;
    }

    @Override // defpackage.qc5, defpackage.ad5, defpackage.zc5
    public final void Cg() {
        Mg();
        super.Cg();
    }

    @Override // defpackage.qc5, defpackage.zc5
    public final void Fg() {
        super.Fg();
        ((ShortcutModalViewMvp) Dg()).pauseShortcuts();
    }

    @Override // defpackage.qc5, defpackage.zc5
    public final void Gg() {
        super.Gg();
        ((ShortcutModalViewMvp) Dg()).resumeShortcuts();
        tje.N(Kg(), null, null, new ShortcutModalViewPresenter$listenActiveOrdersCount$$inlined$safeCollectIn$1(this.E.a(), null, this), 3);
    }

    public final void Mg() {
        if (this.M && Eg()) {
            this.M = false;
            ((ShortcutModalViewMvp) Dg()).jb();
            this.D.a = ShortcutModalViewMvp.Mode.SHORTCUT;
            d dVar = this.G;
            c9y0 c9y0Var = dVar.g;
            c9y0Var.a = "";
            c9y0Var.b = "";
            x0s0 x0s0Var = dVar.j;
            pzt0 pzt0Var = x0s0Var.b;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            x0s0Var.b = null;
            x0s0Var.c = false;
            dVar.p = null;
            hbp0 hbp0Var = dVar.n;
            if (hbp0Var != null) {
                hbp0Var.b();
            }
            dVar.n = null;
        }
    }

    public final void Ng() {
        if (this.D.a != ShortcutModalViewMvp.Mode.ADDRESS) {
            Mg();
        } else {
            if (this.M || !Eg()) {
                return;
            }
            this.M = true;
            ((ShortcutModalViewMvp) Dg()).wb();
        }
    }
}
