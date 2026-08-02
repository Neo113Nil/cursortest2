package defpackage;

import android.content.Context;
import com.yandex.go.mainscreen.superapp.impl.fragment.a;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.preorder.navigation.g;
import com.yandex.go.route.interactor.b;
import ru.yandex.taxi.altpins.confirmation_screen.fragment.ConfirmAlternativeDestinationFragment;
import ru.yandex.taxi.controller.feature.compat.FeatureStubFragment;
import ru.yandex.taxi.fragment.BaseFragment;
import ru.yandex.taxi.masstransit.datasource.routing.f;
import ru.yandex.taxi.masstransit.ui.route.MtRoutesFragment;
import ru.yandex.taxi.ui.FragmentBackground;

/* loaded from: classes5.dex */
public final class iz1 extends dds {
    public final /* synthetic */ int F;
    public final a G;
    public final Object H;
    public final Object I;
    public final Object J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iz1(gyc gycVar, a aVar, g gVar, com.yandex.go.taxi.tariffs.interactor.mapselection.a aVar2) {
        super(null);
        this.F = 1;
        this.H = gycVar;
        this.G = aVar;
        this.I = gVar;
        this.J = aVar2;
    }

    @Override // defpackage.dds, defpackage.h55
    public void H(Object obj) {
        switch (this.F) {
            case 1:
                super.H((jhm) obj);
                ((g) this.I).b(false);
                ((com.yandex.go.taxi.tariffs.interactor.mapselection.a) this.J).b();
                break;
            case 2:
                super.H((zy11) obj);
                ((g) this.J).b(false);
                break;
            default:
                super.H(obj);
                break;
        }
    }

    @Override // defpackage.h55
    public void J(Object obj) {
        switch (this.F) {
            case 0:
                ((mf00) this.H).a(this, new j01(23));
                break;
            case 2:
                ((mf00) this.H).a(this, new pi30(21));
                break;
        }
    }

    @Override // defpackage.dds
    public final a P() {
        switch (this.F) {
        }
        return this.G;
    }

    @Override // defpackage.dds
    public final void Q(Object obj, BaseFragment baseFragment) {
        int i = this.F;
        Object obj2 = this.J;
        Object obj3 = this.I;
        switch (i) {
            case 0:
                ((ConfirmAlternativeDestinationFragment) baseFragment).setCallbackListener(new hz1(this));
                break;
            case 1:
                gyc gycVar = (gyc) this.H;
                w030 modalViewCoordinator = ((FeatureStubFragment) baseFragment).modalViewCoordinator();
                gycVar.getClass();
                modalViewCoordinator.getClass();
                gzf gzfVar = (gzf) gycVar.a;
                n3w a = n3w.a(new wgm(new yzh(gzfVar.d)));
                n3w a2 = n3w.a(new bhm(new j4n(gzfVar.f, gzfVar.g, gzfVar.h, gzfVar.i, gzfVar.j, gzfVar.k, gzfVar.l)));
                n3w a3 = n3w.a(new sgm(new zch(new ut(gzfVar.d, gzfVar.m, gzfVar.n, n3w.a(modalViewCoordinator), gzfVar.f, gzfVar.o, gzfVar.p, gzfVar.q, gzfVar.r, gzfVar.s, gzfVar.t, gzfVar.l, gzfVar.u, gzfVar.v))));
                n3w a4 = n3w.a(new pgm(new boj0(gzfVar.d, gzfVar.w, gzfVar.x, gzfVar.y, gzfVar.z, gzfVar.A, 18)));
                ezf ezfVar = gzfVar.D;
                vyf vyfVar = gzfVar.E;
                ezf ezfVar2 = gzfVar.F;
                ezf ezfVar3 = gzfVar.i;
                rs0 rs0Var = new rs0(ezfVar, vyfVar, ezfVar2, ezfVar3, gzfVar.G, 25);
                vyf vyfVar2 = gzfVar.J;
                n3w a5 = n3w.a(new mgm(new w3i(gzfVar.B, gzfVar.C, hgm.a, ezfVar3, gzfVar.g, rs0Var, new ubq0(gzfVar.H, ezfVar, gzfVar.j, ezfVar3, gzfVar.I, new fat0(ezfVar3, vyfVar2, 5), new fwc(ezfVar3, vyfVar2, 19), 2, false), new p8k0(gzfVar.w, gzfVar.K, gzfVar.L, gzfVar.M, 21), 19)));
                ygm ygmVar = new ygm(((jhm) obj).a);
                c0g c0gVar = (c0g) gzfVar.a;
                y50 q1 = c0gVar.q1();
                q5z.h(q1);
                b W5 = c0gVar.W5();
                q5z.h(W5);
                wgm wgmVar = (wgm) a.a;
                ezf ezfVar4 = gzfVar.e;
                bhm bhmVar = (bhm) a2.a;
                sgm sgmVar = (sgm) a3.a;
                pgm pgmVar = (pgm) a4.a;
                mgm mgmVar = (mgm) a5.a;
                pcm pcmVar = (pcm) c0gVar.z.to.get();
                q5z.h(pcmVar);
                A(new rrj(q1, modalViewCoordinator, W5, wgmVar, ezfVar4, bhmVar, sgmVar, pgmVar, mgmVar, pcmVar), ygmVar, new rhm(this));
                ((com.yandex.go.taxi.tariffs.interactor.mapselection.a) obj2).a();
                ((g) obj3).b(true);
                break;
            default:
                zgf zgfVar = (zgf) obj3;
                w030 modalViewCoordinator2 = ((MtRoutesFragment) baseFragment).modalViewCoordinator();
                zgfVar.getClass();
                modalViewCoordinator2.getClass();
                V(new t3g((x3g) zgfVar.b, modalViewCoordinator2), new ix30(qtb1.H));
                ((g) obj2).b(true);
                break;
        }
    }

    @Override // defpackage.dds
    public final BaseFragment T(Object obj) {
        switch (this.F) {
            case 0:
                p2e p2eVar = ConfirmAlternativeDestinationFragment.Companion;
                f4e f4eVar = ((jz1) obj).a;
                p2eVar.getClass();
                ConfirmAlternativeDestinationFragment confirmAlternativeDestinationFragment = new ConfirmAlternativeDestinationFragment();
                confirmAlternativeDestinationFragment.screenModel = f4eVar;
                return confirmAlternativeDestinationFragment;
            case 1:
                nmp nmpVar = FeatureStubFragment.Companion;
                ysl yslVar = new ysl(119, FragmentBackground.MAP);
                Screen screen = Screen.SUMMARY_DRIVE;
                nmpVar.getClass();
                return nmp.a(yslVar, screen, null);
            default:
                MtRoutesFragment.Companion.getClass();
                return new MtRoutesFragment();
        }
    }

    public void V(t3g t3gVar, ix30 ix30Var) {
        w030 w030Var = (w030) t3gVar.e;
        x3g x3gVar = (x3g) t3gVar.f;
        h0z h0zVar = x3gVar.x;
        gy30 gy30Var = x3gVar.a;
        y50 y50Var = gy30Var.u;
        q5z.h(y50Var);
        xvf0 xvf0Var = x3gVar.O;
        Context context = gy30Var.a;
        q5z.h(context);
        v920 v920Var = new v920(context, (kx30) ((n3w) t3gVar.a).a, (ze30) ((n3w) t3gVar.b).a, (pe30) ((n3w) t3gVar.c).a, (rj30) ((n3w) t3gVar.d).a, (mj30) ((n3w) t3gVar.i).a);
        pho phoVar = gy30Var.Y;
        q5z.h(phoVar);
        b611 b611Var = new b611(phoVar);
        q5z.h(phoVar);
        yw30 yw30Var = new yw30(b611Var, new mb11(phoVar), new ih01(phoVar));
        c8w c8wVar = (c8w) t3gVar.u;
        f fVar = (f) x3gVar.t.get();
        dj30 dj30Var = (dj30) x3gVar.T.get();
        o08 o08Var = (o08) t3gVar.w;
        x0z x0zVar = (x0z) t3gVar.x;
        h3y a = i5m.a(x3gVar.I0);
        zuj0 zuj0Var = gy30Var.o;
        q5z.h(zuj0Var);
        wu30 wu30Var = gy30Var.G0;
        q5z.h(wu30Var);
        A(new vx30(w030Var, h0zVar, y50Var, xvf0Var, v920Var, yw30Var, c8wVar, fVar, dj30Var, o08Var, x0zVar, a, zuj0Var, wu30Var, i5m.a(x3gVar.J0), x3gVar.K0), ix30Var, new oy30(this, t3gVar));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iz1(mf00 mf00Var, Object obj, a aVar, Object obj2, int i) {
        super(null);
        this.F = i;
        this.H = mf00Var;
        this.I = obj;
        this.G = aVar;
        this.J = obj2;
    }
}
