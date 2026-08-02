package com.yandex.go.taxi.main.transition;

import com.yandex.go.taxi.main.ShortcutsMainScreen;
import defpackage.a3v;
import defpackage.biv0;
import defpackage.bk4;
import defpackage.c9l0;
import defpackage.dai;
import defpackage.fpv0;
import defpackage.g18;
import defpackage.hp0;
import defpackage.i130;
import defpackage.jpv0;
import defpackage.nqz0;
import defpackage.qy41;
import defpackage.ry41;
import defpackage.tit0;
import defpackage.v3s0;
import defpackage.wj10;
import defpackage.yit0;
import java.util.HashSet;
import ru.yandex.taxi.badge.b;
import ru.yandex.taxi.multiexit.MultiexitModalView;
import ru.yandex.taxi.preorder.mainscreen.MainScreen;
import ru.yandex.taxi.preorder.mainscreen.transition.ITransitionCoordinator;
import ru.yandex.taxi.preorder.tollroad.TollRoadModalView;
import ru.yandex.taxi.search.view.AddressSearchModalView;

/* loaded from: classes14.dex */
public abstract class a implements ITransitionCoordinator {
    public static final Object M = new Object();
    public static final Object N = new Object();
    public static final Object O = new Object();
    public static final Object P = new Object();
    public static final Object Q = new Object();
    public final c9l0 A;
    public final hp0 B;
    public final qy41 C;
    public final nqz0 D;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean K;
    public final a3v a;
    public final i130 b;
    public final yit0 c;
    public final biv0 w;
    public final bk4 x;
    public final wj10 y;
    public final tit0 z;
    public boolean E = true;
    public final HashSet I = new HashSet();
    public final dai J = g18.u1;
    public MainScreen.MainScreenMode L = MainScreen.MainScreenMode.DEFAULT;

    public a(a3v a3vVar, i130 i130Var, yit0 yit0Var, biv0 biv0Var, bk4 bk4Var, wj10 wj10Var, tit0 tit0Var, c9l0 c9l0Var, hp0 hp0Var, qy41 qy41Var, nqz0 nqz0Var) {
        this.a = a3vVar;
        this.b = i130Var;
        this.c = yit0Var;
        this.w = biv0Var;
        this.x = bk4Var;
        this.y = wj10Var;
        this.z = tit0Var;
        this.A = c9l0Var;
        this.B = hp0Var;
        this.C = qy41Var;
        this.D = nqz0Var;
    }

    public final boolean B0() {
        jpv0 b = this.w.b();
        b.getClass();
        return b instanceof fpv0;
    }

    @Override // ru.yandex.taxi.preorder.mainscreen.transition.ITransitionCoordinator
    public final void C1() {
        ((v3s0) this).p6(true, false);
    }

    @Override // ru.yandex.taxi.preorder.mainscreen.transition.ITransitionCoordinator
    public final void D8() {
        Object obj = M;
        bk4 bk4Var = this.x;
        ((b) bk4Var).c(obj);
        ((b) bk4Var).c(N);
        ((b) bk4Var).c(O);
        ((b) bk4Var).c(P);
        ((b) bk4Var).c(Q);
    }

    @Override // ru.yandex.taxi.preorder.mainscreen.transition.ITransitionCoordinator
    public final boolean F4() {
        return this.b.a().i(TollRoadModalView.class) != null || ((Boolean) this.D.b.getValue()).booleanValue();
    }

    public final void I() {
        boolean z = this.E;
        wj10 wj10Var = this.y;
        if (!z) {
            wj10Var.b(this.G);
            return;
        }
        if (!this.F) {
            wj10Var.b(this.G);
        } else if (this.w.c()) {
            wj10Var.setVisibility(0);
        } else {
            wj10Var.c();
        }
    }

    @Override // ru.yandex.taxi.preorder.mainscreen.transition.ITransitionCoordinator
    public final void Kf() {
        this.H = true;
        if (this.F) {
            this.F = false;
            this.G = false;
            I();
        }
    }

    public final boolean M1() {
        if (this.A.b() || F4() || !B0()) {
            return true;
        }
        i130 i130Var = this.b;
        return (i130Var.a().i(MultiexitModalView.class) == null && !this.B.a() && !((ry41) this.C).f() && this.z.c == null && i130Var.a().i(AddressSearchModalView.class) == null && i130Var.a().j() == null) ? false : true;
    }

    @Override // ru.yandex.taxi.preorder.mainscreen.transition.ITransitionCoordinator
    public final void Nd() {
        ((b) this.x).c(P);
    }

    @Override // ru.yandex.taxi.preorder.mainscreen.transition.ITransitionCoordinator
    public final void Qb(Object obj, boolean z) {
        boolean z2;
        HashSet hashSet = this.I;
        if (z) {
            hashSet.remove(obj);
            z2 = hashSet.isEmpty();
        } else {
            hashSet.add(obj);
            z2 = false;
        }
        if (this.E == z2) {
            return;
        }
        this.E = z2;
        Object obj2 = M;
        if (z2) {
            v3s0 v3s0Var = (v3s0) this;
            if (!((ShortcutsMainScreen) v3s0Var.S.get()).isProcessing()) {
                ((b) v3s0Var.x).c(obj2);
                if (v3s0Var.B0()) {
                    v3s0Var.p6(true, true);
                }
            }
        } else {
            v3s0 v3s0Var2 = (v3s0) this;
            v3s0Var2.I();
            ((b) v3s0Var2.x).a(obj2);
            v3s0Var2.p6(true, false);
        }
        I();
    }

    @Override // ru.yandex.taxi.preorder.mainscreen.transition.ITransitionCoordinator
    public final void T3() {
        this.K = false;
        ((b) this.x).c(O);
        if (!B0() || this.A.b() || F4() || this.b.a().j() != null) {
            return;
        }
        h();
    }

    @Override // ru.yandex.taxi.preorder.mainscreen.transition.ITransitionCoordinator
    public final void Tb(boolean z) {
        this.y.setEnabled(z);
    }

    @Override // ru.yandex.taxi.preorder.mainscreen.transition.ITransitionCoordinator
    public final void Wa() {
        if (this.A.b() || F4() || this.b.a().j() != null) {
            return;
        }
        showControlElements(true);
    }

    public final void h() {
        if (this.H) {
            return;
        }
        this.F = true;
        I();
    }

    @Override // ru.yandex.taxi.preorder.mainscreen.transition.ITransitionCoordinator
    public final void o8() {
        this.F = false;
        this.G = false;
        I();
    }

    @Override // ru.yandex.taxi.preorder.mainscreen.transition.ITransitionCoordinator
    public final void o9() {
        ((b) this.x).a(P);
    }

    @Override // ru.yandex.taxi.preorder.mainscreen.transition.ITransitionCoordinator
    public final void onModalViewDisappear() {
        if (B0()) {
            h();
        }
    }

    @Override // ru.yandex.taxi.preorder.mainscreen.transition.ITransitionCoordinator
    public final void xb() {
        ((b) this.x).c(N);
    }
}
