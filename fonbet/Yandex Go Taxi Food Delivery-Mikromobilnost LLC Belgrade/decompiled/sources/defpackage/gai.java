package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import com.yandex.go.search.address.model.Service;
import kotlin.Pair;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.logistics.experiments.k;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.search.view.AddressSearchModalView;
import ru.yandex.taxi.search.view.AddressSearchView;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes12.dex */
public final class gai extends m230 {
    public final Context E;
    public final w030 F;
    public final zu8 G;
    public final zuj0 H;
    public final fif I;
    public final hwe0 J;
    public final c4r0 K;
    public final k L;
    public final wiq0 M;
    public final yvf0 N;
    public final dyh O;
    public g18 P;
    public final boolean Q;

    public gai(Context context, w030 w030Var, zu8 zu8Var, zuj0 zuj0Var, fif fifVar, hwe0 hwe0Var, c4r0 c4r0Var, k kVar, wiq0 wiq0Var, yvf0 yvf0Var, dyh dyhVar) {
        super(null);
        this.E = context;
        this.F = w030Var;
        this.G = zu8Var;
        this.H = zuj0Var;
        this.I = fifVar;
        this.J = hwe0Var;
        this.K = c4r0Var;
        this.L = kVar;
        this.M = wiq0Var;
        this.N = yvf0Var;
        this.O = dyhVar;
        this.P = new dai();
        this.Q = true;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        this.P.cancel();
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        lbi lbiVar = (lbi) obj;
        String str = lbiVar.d;
        if (str != null) {
            this.P = this.I.c(new eai(str, 0));
        }
        String str2 = lbiVar.e;
        if (str2 != null) {
            this.J.a(TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY, str2);
            this.K.b(SelectionOrigin.USER, str2, TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY, true);
        }
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.F;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return this.Q;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        Pair pair;
        PointType pointType;
        AddressSearchModalView a;
        String str;
        lbi lbiVar = (lbi) obj;
        hki hkiVar = lbiVar.b;
        String str2 = lbiVar.f;
        String str3 = lbiVar.h;
        boolean z = lbiVar.a;
        int i = 0;
        zu8 zu8Var = this.G;
        ButtonComponent buttonComponent = null;
        zuj0 zuj0Var = this.H;
        if (z) {
            if (hkiVar.equals(gki.a)) {
                p51 p51Var = AddressSearchModalView.Companion;
                c61 c61Var = AddressSearchView.Companion;
                kxf c = zu8Var.c(null);
                c61Var.getClass();
                b61 b61Var = new b61(c);
                b61Var.p = true;
                b61Var.n = ((avj0) zuj0Var).h(kyh0.summary_source_address_delivery_hint);
                b61Var.x = false;
                p51Var.getClass();
                a = p51.a(b61Var);
                a.setOnKeyboardListener(new o51(a, 5));
            } else {
                if (!(hkiVar instanceof fki)) {
                    w511.b();
                    return null;
                }
                pex0 m = ((com.yandex.go.taxi.tariffs.internal.repository.k) this.M).m();
                String d = (m == null || (str = m.b) == null) ? "" : this.L.d(str);
                p51 p51Var2 = AddressSearchModalView.Companion;
                c61 c61Var2 = AddressSearchView.Companion;
                f0j b = zu8Var.b(new iu0(((fki) hkiVar).a), null);
                c61Var2.getClass();
                b61 b61Var2 = new b61(b);
                b61Var2.p = false;
                b61Var2.n = d;
                b61Var2.t = false;
                b61Var2.x = false;
                p51Var2.getClass();
                a = p51.a(b61Var2);
                a.setOnKeyboardListener(new o51(a, 6));
            }
            a.setOnAddressPickedListener(new fai(i, this));
            return a;
        }
        boolean z2 = hkiVar instanceof fki;
        if (z2) {
            f0j b2 = zu8Var.b(lbiVar.c, str3);
            if (str2 == null) {
                str2 = ((avj0) zuj0Var).h(kyh0.summary_destination_address_delivery_hint);
            }
            pair = new Pair(b2, str2);
        } else {
            kxf c2 = zu8Var.c(str3);
            if (str2 == null) {
                str2 = ((avj0) zuj0Var).h(kyh0.summary_source_address_delivery_hint);
            }
            pair = new Pair(c2, str2);
        }
        f51 f51Var = (f51) pair.getFirst();
        String str4 = (String) pair.getSecond();
        AddressSearchView.Companion.getClass();
        b61 b61Var3 = new b61(f51Var);
        b61Var3.p = true;
        b61Var3.q = new e90(24, this, hkiVar);
        b61Var3.n = str4;
        b61Var3.o = Service.DELIVERY;
        if (hkiVar instanceof gki) {
            pointType = PointType.SOURCE;
        } else {
            if (!z2) {
                w511.b();
                return null;
            }
            pointType = PointType.DESTINATION;
        }
        b61Var3.u = pointType;
        if (lbiVar.g) {
            ButtonComponent buttonComponent2 = new ButtonComponent(this.E, null, 0, 6, null);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.setMarginEnd(tje.r(mrg0.go_design_s_space, buttonComponent2.getContext()));
            buttonComponent2.setLayoutParams(layoutParams);
            buttonComponent2.setButtonSize(0);
            buttonComponent2.setRoundedCornersRadius(tje.u(100, buttonComponent2.getContext()));
            buttonComponent2.setButtonBackground(qje.t(xng0.controlMinor, buttonComponent2.getContext()));
            buttonComponent2.setButtonTitleColor(qje.t(xng0.textOnControlMinor, buttonComponent2.getContext()));
            buttonComponent2.setTextSize(0, tje.r(mrg0.component_text_size_caption, buttonComponent2.getContext()));
            buttonComponent2.setText(buttonComponent2.getContext().getString(kyh0.point_on_map));
            buttonComponent2.setOnClickListener(new ci8(29, this));
            buttonComponent = buttonComponent2;
        }
        b61Var3.w = buttonComponent;
        b61Var3.x = lbiVar.i;
        AddressSearchModalView.Companion.getClass();
        AddressSearchModalView a2 = p51.a(b61Var3);
        a2.setOnAddressPickedListener(new x71(4, this));
        return a2;
    }
}
