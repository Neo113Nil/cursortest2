package defpackage;

import android.app.Activity;
import com.yandex.go.address.address_map_picker.api.AddressMapPickerPointType;
import com.yandex.go.superapp.discovery.map.impl.domain.interactors.z;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.tipssuggest.experiment.TipsSuggestModalExperiment;
import ru.yandex.taxi.scooters.presentation.ontheway.bluetooth.ScootersBluetoothRouterKt$launchAwait$$inlined$suspendCallbackApi$2;
import ru.yandex.taxi.scooters.presentation.ontheway.bluetooth.ScootersBluetoothRouterKt$launchAwait$$inlined$suspendCallbackApi$3;
import ru.yandex.taxi.search.suggest.i;
import ru.yandex.taxi.widget.dialog.AlertDialog;

/* loaded from: classes6.dex */
public final class c2n0 extends h55 {
    public final /* synthetic */ int D;
    public final Object E;
    public final Object F;
    public Object G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2n0(i6r i6rVar, v3u0 v3u0Var) {
        super(null);
        this.D = 8;
        this.E = i6rVar;
        this.F = v3u0Var;
        this.G = g18.u1;
    }

    @Override // defpackage.h55
    public void G(Object obj) {
        switch (this.D) {
            case 8:
                this.G = ((v3u0) this.F).a(this);
                break;
        }
    }

    @Override // defpackage.h55
    public void H(Object obj) {
        switch (this.D) {
            case 8:
                ((g18) this.G).cancel();
                break;
        }
    }

    @Override // defpackage.h55
    public void I(Object obj) {
        switch (this.D) {
            case 7:
                AlertDialog alertDialog = (AlertDialog) this.G;
                if (alertDialog != null) {
                    alertDialog.dismiss();
                }
                this.G = null;
                break;
        }
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        zzs B;
        int i = this.D;
        int i2 = 25;
        int i3 = 18;
        int i4 = 3;
        Object obj2 = this.F;
        int i5 = 2;
        Object obj3 = this.E;
        switch (i) {
            case 0:
                A((w1n0) obj3, (zy11) obj, new b2n0(this, (ScootersBluetoothRouterKt$launchAwait$$inlined$suspendCallbackApi$2) obj2, (ScootersBluetoothRouterKt$launchAwait$$inlined$suspendCallbackApi$3) this.G));
                break;
            case 1:
                A((olp0) obj3, (plp0) obj, new mit0(this));
                break;
            case 2:
                A((pmp0) obj3, (rmp0) obj, new nit0(this));
                break;
            case 3:
                A((abu0) obj3, (zau0) obj, new lbu0(this, 1));
                break;
            case 4:
                ymu ymuVar = null;
                pv0 pv0Var = (pv0) ((i) obj2).i().orElse(null);
                if (pv0Var != null && (B = pv0Var.a.B()) != null) {
                    if (B.equals(zzs.f)) {
                        B = null;
                    }
                    if (B != null) {
                        ymuVar = new ymu(6, B, ymuVar);
                    }
                }
                A((m950) ((iag) obj3).get(), new m01(ymuVar, AddressMapPickerPointType.Source), sy60.Q2);
                ((z) this.G).a();
                break;
            case 5:
                A((zc) obj3, (xc) obj, new kox0(this));
                break;
            case 6:
                TaxiOrder taxiOrder = (TaxiOrder) obj;
                sbm0 sbm0Var = (sbm0) ((sii) this.G).get();
                w030 a = ((i130) obj3).a();
                ((ohz0) obj2).getClass();
                TipsSuggestModalExperiment a2 = ohz0.a(taxiOrder);
                a.getClass();
                a2.getClass();
                int i6 = 0;
                z(new ej1(20, a, (thz0) n3w.a(new thz0(new c1x0(new dbg(sbm0Var, i6)))).a, (whz0) n3w.a(new whz0(new hlx0(n3w.a(taxiOrder), n3w.a(a2), new z7y0(new dbg(sbm0Var, 4), new dbg(sbm0Var, i4), new dbg(sbm0Var, 5), new dbg(sbm0Var, 7), new dbg(sbm0Var, 6), new dbg(sbm0Var, 8), 1), new uzu0(new gmh(new dbg(sbm0Var, 1), i6), i2), new dbg(sbm0Var, 2), 3))).a), new mhz0(this, i6));
                break;
            case 7:
                Activity activity = (Activity) obj3;
                this.G = new AlertDialog(activity).setTitle(activity.getString(kyh0.add_credit_card_random_amt_retry_title, t7s.f(activity, (nf7) obj2, ((asz0) obj).a))).setMessage(kyh0.add_credit_card_random_amt_retry_desc).setPositiveButton(kyh0.common_got_it).setDismissListener(new kux0(i3, this)).show();
                break;
            case 8:
                i6r i6rVar = (i6r) obj3;
                i6rVar.getClass();
                sag sagVar = new sag(i6rVar, 9);
                xvf0 b = i5m.b(k021.a);
                xvf0 b2 = i5m.b(new mg11(sagVar, b, i4));
                sag sagVar2 = new sag(i6rVar, 11);
                xvf0 b3 = i5m.b(g121.a);
                xvf0 b4 = i5m.b(qz11.a);
                z6x0 z6x0Var = new z6x0(sagVar2, b3, b2, b4, 21);
                sag sagVar3 = new sag(i6rVar, 15);
                sag sagVar4 = new sag(i6rVar, 16);
                sag sagVar5 = new sag(i6rVar, 19);
                sag sagVar6 = new sag(i6rVar, 22);
                sag sagVar7 = new sag(i6rVar, 10);
                sag sagVar8 = new sag(i6rVar, 12);
                sag sagVar9 = new sag(i6rVar, i3);
                sag sagVar10 = new sag(i6rVar, 13);
                sag sagVar11 = new sag(i6rVar, i2);
                xvf0 b5 = i5m.b(new mg11(new sag(i6rVar, 24), i5m.b(nz11.a), 2));
                xvf0 b6 = i5m.b(zz11.a);
                usx0 usx0Var = new usx0(sagVar2, sagVar6, sagVar7, sagVar8, sagVar9, sagVar10, sagVar11, b5, b6);
                sag sagVar12 = new sag(i6rVar, 21);
                xvf0 b7 = i5m.b(b121.a);
                mg11 mg11Var = new mg11(sagVar12, b7, 7);
                uw11 uw11Var = new uw11(sagVar3, sagVar4, sagVar5, usx0Var, b5, new mg11(mg11Var, b7, 8));
                xvf0 b8 = i5m.b(d021.a);
                xvf0 b9 = i5m.b(new mg11(new tw11(sagVar, 1), i5m.b(new nb11(b8, 5)), 6));
                xvf0 b10 = i5m.b(new z6x0(sagVar2, uw11Var, b8, b9, 20));
                on11 on11Var = new on11(new sag(i6rVar, 14), 10);
                n3w a3 = n3w.a(new n021(new o021(b2, z6x0Var, b10, mg11Var, new rct0((xvf0) sagVar2, b3, (xvf0) mg11Var, (xvf0) new tw11(on11Var, 2), (v7p) new mg11(on11Var, b4, 5), 26), on11Var, b5, b9, new mg11(new sag(i6rVar, 20), b4, 4), b6)));
                n3w a4 = n3w.a(new j021(new cjw0(sagVar, new sag(i6rVar, 17), b)));
                gpx0 gpx0Var = new gpx0((xvf0) sagVar, (xvf0) new sag(i6rVar, 23), (xvf0) s021.a, 27, (char) 0);
                c0g c0gVar = (c0g) i6rVar;
                w030 w030Var = (w030) c0gVar.o0.get();
                q5z.h(w030Var);
                y50 y0 = c0gVar.y0();
                q5z.h(y0);
                z(new zxa(w030Var, y0, (n021) a3.a, (j021) a4.a, gpx0Var, 1), new yio0(27, this));
                break;
            default:
                A((da0) obj3, (sy41) obj, new v71(this, i5));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c2n0(int i, Object obj, Object obj2, Object obj3) {
        super(null);
        this.D = i;
        this.E = obj;
        this.F = obj2;
        this.G = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2n0(w1n0 w1n0Var, ScootersBluetoothRouterKt$launchAwait$$inlined$suspendCallbackApi$2 scootersBluetoothRouterKt$launchAwait$$inlined$suspendCallbackApi$2, ScootersBluetoothRouterKt$launchAwait$$inlined$suspendCallbackApi$3 scootersBluetoothRouterKt$launchAwait$$inlined$suspendCallbackApi$3) {
        super(null);
        this.D = 0;
        this.E = w1n0Var;
        this.F = scootersBluetoothRouterKt$launchAwait$$inlined$suspendCallbackApi$2;
        this.G = scootersBluetoothRouterKt$launchAwait$$inlined$suspendCallbackApi$3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2n0(Activity activity, nf7 nf7Var) {
        super(null);
        this.D = 7;
        this.E = activity;
        this.F = nf7Var;
    }
}
