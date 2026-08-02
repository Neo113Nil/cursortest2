package defpackage;

import com.yandex.go.address.models.PlaceType;
import com.yandex.go.address.models.PlainAddress;
import com.yandex.go.clarify_address.AddressClarificationReason;
import com.yandex.go.favorites.router.FavoritesScreenRouterImpl$onAttachWithFragment$$inlined$safeCollectIn$1;
import com.yandex.go.mainscreen.superapp.impl.fragment.a;
import com.yandex.go.navigation.api.router.FragmentAnimation$TransitionType;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import java.util.Collections;
import java.util.HashMap;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.favorites.domain.e;
import ru.yandex.taxi.favorites.edit.arguments.EditArguments;
import ru.yandex.taxi.favorites.list.ui.f;
import ru.yandex.taxi.favorites.suggest.b;
import ru.yandex.taxi.fragment.BaseFragment;
import ru.yandex.taxi.fragment.favorites.c;
import ru.yandex.taxi.fragment.favorites.list.FavoritesFragment;

/* loaded from: classes5.dex */
public final class ljp extends dds {
    public final a F;
    public final dqe0 G;
    public final n3h H;
    public final cgp0 I;
    public final s770 J;
    public final ra00 K;
    public final bip L;
    public final y5i M;
    public final cpw0 N;
    public final yvf0 O;
    public final yvf0 P;
    public final yvf0 Q;
    public final yvf0 R;
    public final kr0 S;
    public final yvf0 T;
    public final yvf0 U;
    public final l01 V;
    public final c W;
    public final yvf0 Z;
    public final i6r a0;
    public final eqe b0;
    public FavoritesFragment c0;
    public pzt0 d0;
    public final i3y e0;

    public ljp(a aVar, dqe0 dqe0Var, n3h n3hVar, cgp0 cgp0Var, s770 s770Var, ra00 ra00Var, bip bipVar, y5i y5iVar, cpw0 cpw0Var, yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, kr0 kr0Var, yvf0 yvf0Var5, yvf0 yvf0Var6, l01 l01Var, c cVar, yvf0 yvf0Var7, i6r i6rVar, eqe eqeVar) {
        super(null);
        this.F = aVar;
        this.G = dqe0Var;
        this.H = n3hVar;
        this.I = cgp0Var;
        this.J = s770Var;
        this.K = ra00Var;
        this.L = bipVar;
        this.M = y5iVar;
        this.N = cpw0Var;
        this.O = yvf0Var;
        this.P = yvf0Var2;
        this.Q = yvf0Var3;
        this.R = yvf0Var4;
        this.S = kr0Var;
        this.T = yvf0Var5;
        this.U = yvf0Var6;
        this.V = l01Var;
        this.W = cVar;
        this.Z = yvf0Var7;
        this.a0 = i6rVar;
        this.b0 = eqeVar;
        this.e0 = kotlin.a.a(new c1o(19, this));
    }

    public static final void V(ljp ljpVar, PlainAddress plainAddress) {
        ((j) ljpVar.L.a).n("favorites.setDestination");
        ((com.yandex.go.clarify_address.a) ljpVar.S).c(true, AddressClarificationReason.Other);
        s770 s770Var = ljpVar.J;
        s770Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put(CRLReasonCodeExtension.REASON, "pick favorite address");
        s770Var.a.a("OpenPreorderController", hashMap, 1, new HashMap());
        ljpVar.N.a = false;
        Preorder preorder = ljpVar.G.a;
        preorder.p(Collections.singletonList(plainAddress));
        ljpVar.M.o(qke.B(preorder.G.b));
        ljpVar.K.b((m950) ljpVar.Z.get(), new hre0(qtb1.M, zre0.a, "pick favorite address", true, dab1.b));
    }

    public static final void W(ljp ljpVar, EditArguments editArguments, boolean z) {
        ljpVar.A((m950) ljpVar.O.get(), new edp(editArguments, z), new jjp(ljpVar));
    }

    @Override // defpackage.dds, defpackage.h55
    public final void H(Object obj) {
        super.H((mip) obj);
        pzt0 pzt0Var = this.d0;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.d0 = null;
        this.c0 = null;
    }

    @Override // defpackage.dds
    public final a P() {
        return this.F;
    }

    @Override // defpackage.dds
    public final void Q(Object obj, BaseFragment baseFragment) {
        mip mipVar = (mip) obj;
        FavoritesFragment favoritesFragment = (FavoritesFragment) baseFragment;
        favoritesFragment.setDatumType(mipVar);
        cgp0 cgp0Var = this.I;
        cgp0Var.getClass();
        cgp0Var.a.a("screen.favorites", new HashMap(), 1, new HashMap());
        this.c0 = favoritesFragment;
        int i = fjp.a[mipVar.a.ordinal()];
        if (i == 1) {
            PlaceType placeType = mipVar.i;
            if (placeType != null) {
                favoritesFragment.addSuggestedAddress(placeType);
            }
        } else if (i == 2) {
            this.d0 = tje.N(o(), null, null, new FavoritesScreenRouterImpl$onAttachWithFragment$$inlined$safeCollectIn$1(this.W.a(mipVar), null, favoritesFragment), 3);
        }
        favoritesFragment.setCallbackListener(new hjp(this, mipVar));
    }

    @Override // defpackage.dds
    public final xbs S(Object obj) {
        return new vbs(FragmentAnimation$TransitionType.ENTER);
    }

    @Override // defpackage.dds
    public final BaseFragment T(Object obj) {
        ejp ejpVar = new ejp(0, this);
        i6r i6rVar = this.a0;
        i6rVar.getClass();
        ((mip) obj).getClass();
        c0g c0gVar = (c0g) i6rVar;
        d0g d0gVar = c0gVar.A.a;
        zzf zzfVar = d0gVar.a;
        e eVar = new e((ru.yandex.taxi.favorites.data.repo.a) zzfVar.W7.get(), new sjp((rqo) zzfVar.C.get(), 0), (ru.yandex.taxi.favorites.rides.save_modal.domain.c) zzfVar.dp.get(), (ru.yandex.taxi.favorites.rides.delete_modal.data.a) zzfVar.no.get());
        c0g c0gVar2 = d0gVar.b;
        ru.yandex.taxi.favorites.list.ui.a aVar = new ru.yandex.taxi.favorites.list.ui.a((ru.yandex.taxi.widget.utils.e) c0gVar2.J9.get(), c0gVar2.f6(), new chp());
        zzf zzfVar2 = c0gVar.z;
        n3h n3hVar = (n3h) zzfVar2.J1.get();
        zuj0 N2 = c0gVar.N2();
        q5z.h(N2);
        b bVar = new b((on2) zzfVar2.w0.get(), new uhp((dne0) zzfVar2.d.get()), new yhp((rqo) zzfVar2.C.get(), 0));
        aip aipVar = new aip((pho) zzfVar2.d0.get());
        qmp qmpVar = (qmp) zzfVar2.D.get();
        q5z.h(qmpVar);
        qx2 qx2Var = (qx2) zzfVar2.X7.get();
        q5z.h(qx2Var);
        pwy0 pwy0Var = (pwy0) zzfVar2.U.get();
        q5z.h(pwy0Var);
        f fVar = new f(eVar, aVar, n3hVar, N2, bVar, aipVar, qmpVar, qx2Var, pwy0Var);
        ru.yandex.taxi.widget.utils.e A2 = c0gVar.A2();
        q5z.h(A2);
        grs0 s = dab1.s((pav) zzfVar2.p3.get());
        FavoritesFragment.Companion.getClass();
        FavoritesFragment favoritesFragment = new FavoritesFragment();
        favoritesFragment.presenter = fVar;
        favoritesFragment.mediaInfoConverter = A2;
        favoritesFragment.slotItemViewFactory = s;
        favoritesFragment.backAction = ejpVar;
        return favoritesFragment;
    }

    @Override // defpackage.dds
    public final xbs U() {
        return new vbs(FragmentAnimation$TransitionType.RETURN);
    }
}
