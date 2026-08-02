package com.yandex.go.taxi.main;

import com.yandex.go.shortcuts.analytic.MainScreenAnalytics$Action;
import defpackage.a3v;
import defpackage.ad5;
import defpackage.bt00;
import defpackage.dz00;
import defpackage.f900;
import defpackage.h3y;
import defpackage.i130;
import defpackage.j621;
import defpackage.j800;
import defpackage.k110;
import defpackage.l30;
import defpackage.m30;
import defpackage.mmp0;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.q2s0;
import defpackage.rh00;
import defpackage.sni0;
import defpackage.t5k0;
import defpackage.tje;
import defpackage.v3s0;
import defpackage.vvx0;
import defpackage.zuj0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.multiexit.MultiexitModalView;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes14.dex */
public final class h extends ad5 {
    public final bt00 A;
    public final j800 B;
    public final com.yandex.go.route.interactor.c C;
    public final sni0 D;
    public final h3y E;
    public final ru.yandex.taxi.e F;
    public final i130 G;
    public final j621 H;
    public final t5k0 I;
    public final f900 J;
    public final dz00 K;
    public final h3y L;
    public final vvx0 M;
    public final m30 N;
    public l30 O;
    public pzt0 P;
    public final zuj0 x;
    public final a3v y;
    public final rh00 z;

    public h(zuj0 zuj0Var, a3v a3vVar, rh00 rh00Var, bt00 bt00Var, j800 j800Var, com.yandex.go.route.interactor.c cVar, sni0 sni0Var, h3y h3yVar, ru.yandex.taxi.e eVar, i130 i130Var, j621 j621Var, t5k0 t5k0Var, f900 f900Var, dz00 dz00Var, h3y h3yVar2, vvx0 vvx0Var, m30 m30Var) {
        super(q2s0.class);
        this.x = zuj0Var;
        this.y = a3vVar;
        this.z = rh00Var;
        this.A = bt00Var;
        this.B = j800Var;
        this.C = cVar;
        this.D = sni0Var;
        this.E = h3yVar;
        this.F = eVar;
        this.G = i130Var;
        this.H = j621Var;
        this.I = t5k0Var;
        this.J = f900Var;
        this.K = dz00Var;
        this.L = h3yVar2;
        this.M = vvx0Var;
        this.N = m30Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Kg(h hVar, ContinuationImpl continuationImpl) {
        ShortcutsMainScreenPresenter$getMapStyle$1 shortcutsMainScreenPresenter$getMapStyle$1;
        int i;
        hVar.getClass();
        if (continuationImpl instanceof ShortcutsMainScreenPresenter$getMapStyle$1) {
            shortcutsMainScreenPresenter$getMapStyle$1 = (ShortcutsMainScreenPresenter$getMapStyle$1) continuationImpl;
            int i2 = shortcutsMainScreenPresenter$getMapStyle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                shortcutsMainScreenPresenter$getMapStyle$1.label = i2 - Integer.MIN_VALUE;
                Object obj = shortcutsMainScreenPresenter$getMapStyle$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = shortcutsMainScreenPresenter$getMapStyle$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    dz00 dz00Var = hVar.K;
                    shortcutsMainScreenPresenter$getMapStyle$1.label = 1;
                    obj = dz00Var.a.b(shortcutsMainScreenPresenter$getMapStyle$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                k110 k110Var = (k110) obj;
                return !k110Var.g ? k110Var.f : "";
            }
        }
        shortcutsMainScreenPresenter$getMapStyle$1 = new ShortcutsMainScreenPresenter$getMapStyle$1(hVar, continuationImpl);
        Object obj2 = shortcutsMainScreenPresenter$getMapStyle$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = shortcutsMainScreenPresenter$getMapStyle$1.label;
        if (i != 0) {
        }
        k110 k110Var2 = (k110) obj2;
        if (!k110Var2.g) {
        }
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        l30 l30Var = this.O;
        if (l30Var != null) {
            l30Var.cancel();
        }
        this.O = null;
    }

    @Override // defpackage.zc5
    public final void Fg() {
        ((com.yandex.go.promocodes.referral.impl.ui.b) this.D).h(null);
        pzt0 pzt0Var = this.P;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.P = null;
    }

    @Override // defpackage.zc5
    public final void Gg() {
        ((com.yandex.go.promocodes.referral.impl.ui.b) this.D).h(new mmp0(19, this));
        this.P = tje.N(Jg(), null, null, new ShortcutsMainScreenPresenter$onResume$$inlined$safeCollectIn$1(this.y.M2(), null, this), 3);
    }

    public final void Lg() {
        if (((v3s0) this.L.get()).B.a()) {
            return;
        }
        MainScreenAnalytics$Action mainScreenAnalytics$Action = MainScreenAnalytics$Action.TAP;
        SourcePicker sourcePicker = SourcePicker.A_FROM_HOME;
        this.B.b(mainScreenAnalytics$Action, sourcePicker);
        this.G.a().m(MultiexitModalView.class);
        ((q2s0) Dg()).showAddressesPicker(sourcePicker, PointType.SOURCE);
    }
}
