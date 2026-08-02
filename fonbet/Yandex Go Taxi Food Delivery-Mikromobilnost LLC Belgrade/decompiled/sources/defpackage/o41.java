package defpackage;

import com.yandex.go.mainscreen.superapp.impl.fragment.a;
import com.yandex.go.search.router.Origin;
import ru.yandex.taxi.fragment.BaseFragment;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.search.fragment.AddressMapPickerFragment;
import ru.yandex.taxi.search.fragment.CustomizedAddressMapPickerFragment;

/* loaded from: classes6.dex */
public final class o41 extends dds {
    public final a F;
    public final f01 G;
    public final pl H;
    public final hnb0 I;
    public tls J;
    public final g191 K;

    public o41(a aVar, f01 f01Var, pl plVar, hnb0 hnb0Var) {
        super(null);
        this.F = aVar;
        this.G = f01Var;
        this.H = plVar;
        this.I = hnb0Var;
        this.K = new g191(this);
    }

    @Override // defpackage.dds, defpackage.h55
    public final void H(Object obj) {
        super.H((m41) obj);
        this.J = null;
    }

    @Override // defpackage.dds
    public final a P() {
        return this.F;
    }

    @Override // defpackage.dds
    public final void Q(Object obj, BaseFragment baseFragment) {
        this.J = ((m41) obj).r;
        ((AddressMapPickerFragment) baseFragment).setCallbackListener(new n41(this));
    }

    @Override // defpackage.dds
    public final BaseFragment T(Object obj) {
        m41 m41Var;
        pv0 pv0Var;
        zzs zzsVar;
        AddressMapPickerFragment a;
        m41 m41Var2 = (m41) obj;
        int i = m41Var2.a;
        String str = m41Var2.b;
        PointType pointType = m41Var2.c;
        Origin origin = m41Var2.d;
        pv0 pv0Var2 = m41Var2.e;
        zzs zzsVar2 = m41Var2.f;
        boolean z = m41Var2.g;
        boolean z2 = m41Var2.h;
        l41 l41Var = m41Var2.j;
        boolean z3 = m41Var2.i;
        boolean z4 = m41Var2.k;
        boolean z5 = m41Var2.l;
        boolean z6 = m41Var2.m;
        boolean z7 = m41Var2.n;
        boolean z8 = m41Var2.o;
        boolean z9 = m41Var2.p;
        boolean z10 = m41Var2.q;
        this.G.getClass();
        if (l41Var != null) {
            knf knfVar = CustomizedAddressMapPickerFragment.Companion;
            int i2 = l41Var.a;
            int i3 = l41Var.b;
            int i4 = l41Var.c;
            int i5 = l41Var.d;
            knfVar.getClass();
            a = knf.a(i, pointType, str, origin, z, z2, i2, i3, i4, i5, z3);
            m41Var = m41Var2;
            pv0Var = pv0Var2;
            zzsVar = zzsVar2;
        } else {
            AddressMapPickerFragment.Companion.getClass();
            m41Var = m41Var2;
            pv0Var = pv0Var2;
            zzsVar = zzsVar2;
            a = d01.a(i, pointType, str, origin, z, z2, z3, z4, z5, z6, z7, z8, z9, z10);
        }
        if (pv0Var != null) {
            a.setInitialAddress(pv0Var);
        } else {
            a.updateInitialPoint(zzsVar);
        }
        a.setMyLocationTriggerInitializer(m41Var.s);
        a.setNavigator(this.K);
        return a;
    }
}
