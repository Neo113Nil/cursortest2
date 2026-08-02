package defpackage;

import android.content.Context;
import com.yandex.go.address.models.Address;
import com.yandex.go.address_confirmation.SourceAddressConfirmationMapFragment;
import com.yandex.go.address_confirmation.api.TargetScreenAfterConfirmation;
import com.yandex.go.mainscreen.superapp.impl.fragment.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.common_models.net.map_object.AdjustmentScreenType;
import ru.yandex.taxi.common_models.net.map_object.i;
import ru.yandex.taxi.common_models.net.map_object.l;
import ru.yandex.taxi.common_models.net.map_object.o0;
import ru.yandex.taxi.common_models.net.map_object.z;
import ru.yandex.taxi.fragment.BaseFragment;

/* loaded from: classes12.dex */
public final class gbt0 extends dds {
    public final a821 F;
    public final kr0 G;
    public final a3t H;
    public final z3g I;
    public final a J;
    public final yvf0 K;
    public hbt0 L;
    public boolean M;
    public bu0 N;
    public pzt0 O;

    public gbt0(a821 a821Var, kr0 kr0Var, a3t a3tVar, z3g z3gVar, a aVar, yvf0 yvf0Var) {
        super(null);
        this.F = a821Var;
        this.G = kr0Var;
        this.H = a3tVar;
        this.I = z3gVar;
        this.J = aVar;
        this.K = yvf0Var;
    }

    @Override // defpackage.dds, defpackage.h55
    public final void H(Object obj) {
        j(dpb.a);
        super.H((abt0) obj);
    }

    @Override // defpackage.dds, defpackage.h55
    public final void I(Object obj) {
        this.D = null;
        pzt0 pzt0Var = this.O;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.O = null;
    }

    @Override // defpackage.dds
    public final a P() {
        return this.J;
    }

    @Override // defpackage.dds
    public final void Q(Object obj, BaseFragment baseFragment) {
        i iVar;
        String str;
        i iVar2;
        abt0 abt0Var = (abt0) obj;
        SourceAddressConfirmationMapFragment sourceAddressConfirmationMapFragment = (SourceAddressConfirmationMapFragment) baseFragment;
        bu0 bu0Var = this.N;
        int i = 10;
        int i2 = 2;
        int i3 = 3;
        if (bu0Var == null) {
            z3g z3gVar = this.I;
            z3gVar.getClass();
            bu0 bu0Var2 = new bu0();
            bu0Var2.a = z3gVar;
            bu0Var2.b = sourceAddressConfirmationMapFragment;
            xvf0 b = i5m.b(dbt0.a);
            bu0Var2.c = b;
            int i4 = 15;
            bu0Var2.d = new aag(z3gVar, i4);
            bu0Var2.e = new aag(z3gVar, i3);
            bu0Var2.f = new aag(z3gVar, i2);
            aag aagVar = new aag(z3gVar, 12);
            gaq0 gaq0Var = new gaq0(new aag(z3gVar, i), 17);
            aag aagVar2 = new aag(z3gVar, 16);
            int i5 = 0;
            aag aagVar3 = new aag(z3gVar, i5);
            bu0Var2.g = n3w.a(new xat0(new s14(aagVar, gaq0Var, aagVar2, aagVar3, new fat0(nbt0.a, b, i5), b, new aag(z3gVar, 18), new d701(new aag(z3gVar, 19), new aag(z3gVar, 14), i4), new aag(z3gVar, 1), new l9t0((xvf0) aagVar3, (xvf0) new aag(z3gVar, 17), (xvf0) new aag(z3gVar, 4), (xvf0) new lk(7, new aag(z3gVar, 5)), 1, false), new aag(z3gVar, 9), new aag(z3gVar, 13), new aag(z3gVar, 11), new aag(z3gVar, 6), new aag(z3gVar, 8))));
            bu0Var2.h = new aag(z3gVar, 7);
            bu0Var2.i = i5m.b(uat0.a);
            this.N = bu0Var2;
            bu0Var = bu0Var2;
        }
        sourceAddressConfirmationMapFragment.setOnMapDraggedListener(new gas0(13, new hhs0(5, new mbt0(), (cbt0) ((xvf0) bu0Var.c).get())));
        sourceAddressConfirmationMapFragment.setCallbackListener(new mc30(this, 2));
        z3g z3gVar2 = (z3g) bu0Var.a;
        Context context = (Context) z3gVar2.a;
        q5z.h(context);
        h3y a = i5m.a((aag) bu0Var.d);
        aag aagVar4 = (aag) bu0Var.e;
        aag aagVar5 = (aag) bu0Var.f;
        w030 w030Var = (w030) z3gVar2.g;
        q5z.h(w030Var);
        y9y0 y9y0Var = (y9y0) z3gVar2.d;
        q5z.h(y9y0Var);
        atd0 atd0Var = (atd0) z3gVar2.r;
        q5z.h(atd0Var);
        oy80 oy80Var = new oy80(24, y9y0Var, atd0Var);
        SourceAddressConfirmationMapFragment sourceAddressConfirmationMapFragment2 = (SourceAddressConfirmationMapFragment) bu0Var.b;
        xat0 xat0Var = (xat0) ((n3w) bu0Var.g).a;
        ru.yandex.taxi.search.suggest.i iVar3 = (ru.yandex.taxi.search.suggest.i) z3gVar2.i;
        q5z.h(iVar3);
        po21 po21Var = (po21) z3gVar2.m;
        q5z.h(po21Var);
        ru.yandex.taxi.preorder.source.userposition.a aVar = (ru.yandex.taxi.preorder.source.userposition.a) z3gVar2.o;
        q5z.h(aVar);
        pho phoVar = (pho) z3gVar2.j;
        q5z.h(phoVar);
        com.yandex.go.address_confirmation.analytics.a aVar2 = new com.yandex.go.address_confirmation.analytics.a(iVar3, po21Var, aVar, new pj(phoVar));
        hnb0 hnb0Var = (hnb0) z3gVar2.v;
        q5z.h(hnb0Var);
        jpb0 jpb0Var = (jpb0) z3gVar2.w;
        q5z.h(jpb0Var);
        aag aagVar6 = (aag) bu0Var.h;
        ysd0 ysd0Var = (ysd0) z3gVar2.A;
        q5z.h(ysd0Var);
        f7r f7rVar = (f7r) z3gVar2.B;
        q5z.h(f7rVar);
        zat0 zat0Var = new zat0(context, a, aagVar4, aagVar5, w030Var, oy80Var, sourceAddressConfirmationMapFragment2, xat0Var, aVar2, hnb0Var, jpb0Var, aagVar6, ysd0Var, f7rVar, (AddressResolveRepository) ((xvf0) bu0Var.i).get());
        hbt0 hbt0Var = this.L;
        if (hbt0Var == null) {
            String str2 = null;
            pv0 pv0Var = (pv0) this.H.a.i().orElse(null);
            if (pv0Var != null) {
                Address address = pv0Var.a;
                List conditionalActions = address.getConditionalActions();
                if (conditionalActions != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = conditionalActions.iterator();
                    while (it.hasNext()) {
                        ycc.r(((hyd) it.next()).b, arrayList);
                    }
                    ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        z zVar = (z) it2.next();
                        if (zVar instanceof o0) {
                            l lVar = ((o0) zVar).a;
                            if (lVar.a() == AdjustmentScreenType.ADDRESS_CONFIRMATION) {
                                iVar2 = (i) lVar;
                                arrayList2.add(iVar2);
                            }
                        }
                        iVar2 = null;
                        arrayList2.add(iVar2);
                    }
                    iVar = (i) kotlin.collections.a.R(arrayList2);
                } else {
                    iVar = null;
                }
                if (iVar != null) {
                    List conditionalActions2 = address.getConditionalActions();
                    if (conditionalActions2 != null) {
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it3 = conditionalActions2.iterator();
                        while (it3.hasNext()) {
                            ycc.r(((hyd) it3.next()).b, arrayList3);
                        }
                        ArrayList arrayList4 = new ArrayList(tcc.n(arrayList3, 10));
                        Iterator it4 = arrayList3.iterator();
                        while (it4.hasNext()) {
                            z zVar2 = (z) it4.next();
                            if (zVar2 instanceof o0) {
                                o0 o0Var = (o0) zVar2;
                                if (o0Var.a.a() == AdjustmentScreenType.ADDRESS_CONFIRMATION) {
                                    str = o0Var.b;
                                    arrayList4.add(str);
                                }
                            }
                            str = null;
                            arrayList4.add(str);
                        }
                        str2 = (String) kotlin.collections.a.R(arrayList4);
                    }
                    hbt0Var = new hbt0(pv0Var, iVar, str2);
                }
            }
            hbt0Var = null;
        }
        if (hbt0Var != null) {
            V(hbt0Var, zat0Var, sourceAddressConfirmationMapFragment, abt0Var.a);
        } else {
            r(new x8t0(3));
        }
        this.L = hbt0Var;
    }

    @Override // defpackage.dds
    public final BaseFragment T(Object obj) {
        return new SourceAddressConfirmationMapFragment();
    }

    public final void V(hbt0 hbt0Var, zat0 zat0Var, SourceAddressConfirmationMapFragment sourceAddressConfirmationMapFragment, TargetScreenAfterConfirmation targetScreenAfterConfirmation) {
        sourceAddressConfirmationMapFragment.setInitialAddress(hbt0Var.a);
        sourceAddressConfirmationMapFragment.updateInitialPoint(hbt0Var.a.a.B());
        D(zat0Var, new wat0(targetScreenAfterConfirmation, hbt0Var, this.M, new gas0(14, this)), new com.yandex.go.address_confirmation.navigation.a(this, hbt0Var, zat0Var, sourceAddressConfirmationMapFragment, targetScreenAfterConfirmation));
    }
}
