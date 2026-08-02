package com.yandex.go.address.search.common.presenter;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.PlainAddress;
import com.yandex.go.clarify_address.before_order.ClarifyAddressBeforeOrderOrigin;
import com.yandex.go.search.perf.AddressesListPointType;
import com.yandex.go.suggest.DestinationSuggest;
import defpackage.avj0;
import defpackage.d6v0;
import defpackage.dkv0;
import defpackage.ekv0;
import defpackage.elh;
import defpackage.f3o;
import defpackage.fhf;
import defpackage.fvd0;
import defpackage.gvd0;
import defpackage.h4v0;
import defpackage.h51;
import defpackage.hif;
import defpackage.hst;
import defpackage.i3y;
import defpackage.ic61;
import defpackage.igq0;
import defpackage.itj0;
import defpackage.j61;
import defpackage.jst;
import defpackage.kyh0;
import defpackage.lwf0;
import defpackage.mav0;
import defpackage.mbv0;
import defpackage.mxb;
import defpackage.nav0;
import defpackage.nbv0;
import defpackage.nwf0;
import defpackage.nxg;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.oxg;
import defpackage.pav0;
import defpackage.prj0;
import defpackage.pv0;
import defpackage.pxg;
import defpackage.pzt0;
import defpackage.qoi;
import defpackage.rwp0;
import defpackage.s3o;
import defpackage.tpr;
import defpackage.unr0;
import defpackage.v7b0;
import defpackage.w0v0;
import defpackage.w4l0;
import defpackage.w9v0;
import defpackage.x9v0;
import defpackage.yvf0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.address.models.SourcePicker;

/* loaded from: classes12.dex */
public abstract class b extends i {
    public final mav0 k0;
    public final oxg l0;
    public final w4l0 m0;
    public final dkv0 n0;
    public final SourcePicker o0;
    public final mxb p0;
    public final pav0 q0;
    public final com.yandex.go.address.search.perf.c r0;
    public pzt0 s0;
    public final i3y t0;
    public boolean u0;

    public b(ru.yandex.taxi.design.utils.b bVar, ru.yandex.taxi.preorder.suggested.i iVar, v7b0 v7b0Var, mav0 mav0Var, mbv0 mbv0Var, com.yandex.go.address.search.common.domain.interactor.a aVar, oxg oxgVar, fhf fhfVar, rwp0 rwp0Var, s3o s3oVar, f3o f3oVar, w4l0 w4l0Var, nbv0 nbv0Var, ru.yandex.taxi.search.c cVar, h51 h51Var, prj0 prj0Var, qoi qoiVar, yvf0 yvf0Var, oep0 oep0Var, d6v0 d6v0Var, h4v0 h4v0Var, dkv0 dkv0Var, SourcePicker sourcePicker, mxb mxbVar, pav0 pav0Var, com.yandex.go.address.search.perf.c cVar2) {
        super(bVar, iVar, v7b0Var, mbv0Var, aVar, fhfVar, rwp0Var, s3oVar, f3oVar, nbv0Var, cVar, prj0Var, h51Var, qoiVar, yvf0Var, oep0Var, d6v0Var, h4v0Var);
        this.k0 = mav0Var;
        this.l0 = oxgVar;
        this.m0 = w4l0Var;
        this.n0 = dkv0Var;
        this.o0 = sourcePicker;
        this.p0 = mxbVar;
        this.q0 = pav0Var;
        this.r0 = cVar2;
        this.t0 = kotlin.a.a(new w0v0(17));
    }

    @Override // com.yandex.go.address.search.common.presenter.i
    public void Bh(pv0 pv0Var) {
        hst hstVar = jst.e;
        pav0 pav0Var = this.q0;
        unr0.C(new Object[]{pav0Var.b}, 1, "Setting screen %s for address", hstVar);
        PlainAddress z0 = pv0Var.a.z0(pav0Var.b);
        igq0 igq0Var = pav0Var.c;
        if (igq0Var == null) {
            ny61.r("Presenter was not initialized");
            return;
        }
        if (pav0Var.a) {
            igq0Var.I(z0);
        }
        ((j61) Dg()).P6(pv0Var);
    }

    @Override // com.yandex.go.address.search.common.presenter.i, defpackage.w51, defpackage.ad5, defpackage.zc5
    public void Cg() {
        super.Cg();
        this.l0.c.a(null);
        pzt0 pzt0Var = this.j0;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
    }

    @Override // com.yandex.go.address.search.common.presenter.i
    public final void Dh(int i, Address address, pv0 pv0Var) {
        super.Dh(i, address, pv0Var);
        if (((j61) Dg()).isCollapsed()) {
            ((elh) ((nwf0) ((lwf0) this.t0.getValue())).b).tg(i, address);
        }
    }

    public void Gh(List list) {
        fvd0 fvd0Var;
        ArrayList<Address> arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DestinationSuggest destinationSuggest = (DestinationSuggest) it.next();
            if (destinationSuggest instanceof Address) {
                arrayList.add(destinationSuggest);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        hif hifVar = this.k0.b.a;
        ArrayList arrayList2 = new ArrayList();
        for (Address address : arrayList) {
            String pickMethod = address.getPickMethod();
            if (pickMethod != null) {
                fvd0Var = new fvd0(pickMethod, address.B(), address.q2(), address.getPickPosition(), address.getPickAction(), null, null);
            } else {
                jst.e.k(new IllegalArgumentException("Wrong destination address suggest provided"), "Wrong destination address suggest provided");
                fvd0Var = null;
            }
            if (fvd0Var != null) {
                arrayList2.add(fvd0Var);
            }
        }
        gvd0 gvd0Var = new gvd0(arrayList2);
        ArrayList arrayList3 = (ArrayList) hifVar.d;
        int indexOf = arrayList3.indexOf(gvd0Var);
        if (indexOf != -1 && indexOf != hifVar.b) {
            ((ArrayList) hifVar.d).remove(indexOf);
            int i = hifVar.b;
            if (indexOf < i) {
                hifVar.b = i - 1;
            }
        }
        arrayList3.add(gvd0Var);
    }

    public tpr Hh() {
        return this.G.c(this.H.b);
    }

    public boolean Ih() {
        return !this.u0;
    }

    public boolean Jh(int i) {
        this.q0.c = Mh((Address) kotlin.collections.a.S(i, this.k0.c.c().b));
        return true;
    }

    @Override // ru.yandex.taxi.search.presenter.e
    public void Kg(boolean z) {
        Ug();
        SourcePicker sourcePicker = SourcePicker.FROM_TRANSPORT_DISCOVERY;
        SourcePicker sourcePicker2 = this.o0;
        if (sourcePicker2 == sourcePicker || sourcePicker2 == SourcePicker.FROM_TRANSPORT_SUMMARY) {
            this.m0.b();
        }
    }

    public boolean Kh(DestinationSuggest destinationSuggest) {
        this.q0.c = Mh(destinationSuggest);
        return true;
    }

    public void Lh() {
    }

    public abstract igq0 Mh(DestinationSuggest destinationSuggest);

    @Override // com.yandex.go.address.search.common.presenter.i, defpackage.w51, ru.yandex.taxi.search.presenter.e
    public void Qg(itj0 itj0Var) {
        List list = itj0Var.d;
        oxg oxgVar = this.l0;
        if (oxgVar.a.isSearchResultBottom) {
            List list2 = list;
            int size = list.size();
            String h = ((avj0) oxgVar.b).h(kyh0.suggests_ask_driver);
            w9v0 w9v0Var = new w9v0(size | 16777216);
            w9v0Var.b = h;
            list = kotlin.collections.a.o0(list2, new pxg(w9v0Var));
        }
        super.Qg(new itj0(itj0Var.a, itj0Var.b, itj0Var.c, list, itj0Var.e, itj0Var.f));
    }

    @Override // com.yandex.go.address.search.common.presenter.i, ru.yandex.taxi.search.presenter.e
    public void Zg() {
        super.Zg();
        pzt0 pzt0Var = this.j0;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
    }

    @Override // com.yandex.go.address.search.common.presenter.i, ru.yandex.taxi.search.presenter.f
    public void eh(j61 j61Var) {
        super.eh(j61Var);
        this.l0.c.a(new nav0(this));
        String zh = zh();
        if (zh != null && zh.length() != 0) {
            Ah();
            showProgress();
            Sg(this.x.b(zh));
        } else if (Ih()) {
            Ah();
            com.yandex.go.coroutines.b.g(Jg(), null, null, new SuggestedDestinationsPresenter$startZeroSuggest$1(Hh(), this, null), 3);
        }
    }

    @Override // com.yandex.go.address.search.common.presenter.i, ru.yandex.taxi.search.presenter.f
    public void ih(x9v0 x9v0Var) {
        this.n0.a(new ekv0(this.o0));
        this.p0.a(ClarifyAddressBeforeOrderOrigin.DESTINATION_ADDRESS_SUGGEST);
        oxg oxgVar = this.l0;
        oxgVar.getClass();
        int i = pxg.Q;
        int i2 = x9v0Var.a;
        if (((-16777216) & i2) == 16777216) {
            ((nxg) oxgVar.c.b).Wc(16777215 & i2);
        } else {
            super.ih(x9v0Var);
        }
    }

    @Override // com.yandex.go.address.search.common.presenter.i, ru.yandex.taxi.search.presenter.f
    public void kh() {
        super.kh();
        SourcePicker sourcePicker = SourcePicker.FROM_TRANSPORT_DISCOVERY;
        SourcePicker sourcePicker2 = this.o0;
        if (sourcePicker2 == sourcePicker || sourcePicker2 == SourcePicker.FROM_TRANSPORT_SUMMARY) {
            this.m0.b();
        }
    }

    @Override // ru.yandex.taxi.search.presenter.e
    public void onDismiss() {
        ch();
        pzt0 pzt0Var = this.j0;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
    }

    public void onSourceAddressChanged(pv0 pv0Var) {
    }

    @Override // defpackage.w51
    public void rh(ic61 ic61Var) {
        super.rh(ic61Var);
        Gh(ic61Var.a);
    }

    @Override // com.yandex.go.address.search.common.presenter.i, defpackage.w51
    public final void sh(Throwable th) {
        super.sh(th);
        ((elh) ((nwf0) ((lwf0) this.t0.getValue())).b).onError();
    }

    @Override // defpackage.w51
    public final void uh(List list) {
        oxg oxgVar = this.l0;
        if (oxgVar.a.isZeroSuggestTop) {
            String h = ((avj0) oxgVar.b).h(kyh0.suggests_ask_driver);
            w9v0 w9v0Var = new w9v0(16777216);
            w9v0Var.b = h;
            list = kotlin.collections.a.m0(list, Collections.singletonList(new pxg(w9v0Var)));
        }
        super.uh(list);
        ((elh) ((nwf0) ((lwf0) this.t0.getValue())).b).F7();
    }

    @Override // com.yandex.go.address.search.common.presenter.i
    public final AddressesListPointType xh() {
        return AddressesListPointType.B;
    }
}
