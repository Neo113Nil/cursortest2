package defpackage;

import androidx.core.view.b;
import com.yandex.go.due_timetable.presentation.widget.day_selector.DaySelectorItemView;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.transfer_requirement.ui.date_selector.TransferDateSelectorItemView;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import java.util.LinkedHashMap;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes5.dex */
public final class psg extends lys {
    public static final /* synthetic */ int Z = 0;
    public static final /* synthetic */ int a0 = 0;
    public static final /* synthetic */ int b0 = 0;
    public final /* synthetic */ int S = 1;
    public final Object T;
    public final Object U;
    public final Object V;
    public Object W;

    public psg(nzm nzmVar, mjf mjfVar) {
        super(nzmVar);
        this.T = mjfVar;
        this.a.getContext();
        DaySelectorItemView daySelectorItemView = (DaySelectorItemView) nzmVar.c;
        this.U = daySelectorItemView;
        qg qgVar = new qg();
        this.V = qgVar;
        b.p(daySelectorItemView, qgVar);
        c.z(new ybf(12, this), this.a);
    }

    @Override // defpackage.wys
    public boolean X() {
        switch (this.S) {
            case 0:
                return false;
            case 1:
            default:
                return super.X();
            case 2:
                return false;
        }
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        int i = this.S;
        Object obj2 = this.V;
        Object obj3 = this.U;
        switch (i) {
            case 0:
                nsg nsgVar = (nsg) obj;
                this.W = nsgVar;
                ((DaySelectorItemView) obj3).render(nsgVar);
                ((qg) obj2).a = nsgVar.e;
                break;
            case 1:
                zbi zbiVar = (zbi) obj;
                String str = zbiVar.a;
                f1x f1xVar = (f1x) ((zo31) this.R);
                ListItemComponent listItemComponent = f1xVar.d;
                listItemComponent.setTitle(str);
                listItemComponent.clearTrailView();
                sk2 sk2Var = zbiVar.b;
                ListItemComponent listItemComponent2 = f1xVar.c;
                String str2 = sk2Var != null ? sk2Var.a : null;
                if (str2 != null) {
                    listItemComponent2.setVisibility(0);
                    String str3 = sk2Var.b;
                    if (str3 == null || str3.length() == 0) {
                        listItemComponent2.setTrailImage(mzg0.ic_delivery_clock);
                    } else {
                        a0(((nac) ((pav) this.T).a(listItemComponent2.getTrailImageView())).c(((m7x0) ((k7x0) obj3)).a(str3)));
                    }
                    hei heiVar = (hei) this.W;
                    i d = ((j) heiVar.b).d("DeliveryDetailsCard.TariffInfo.AdditionalInfo.Shown");
                    LinkedHashMap linkedHashMap = d.a;
                    linkedHashMap.put("text", str2);
                    pex0 m = ((k) heiVar.a).m();
                    linkedHashMap.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, m != null ? m.b : null);
                    d.m();
                } else {
                    listItemComponent2.setVisibility(8);
                }
                ((qnh) obj2).e(f1xVar.b, F(), true);
                break;
            default:
                wh01 wh01Var = (wh01) obj;
                this.W = wh01Var;
                ((TransferDateSelectorItemView) obj3).render(wh01Var);
                ((qg) obj2).a = wh01Var.b;
                break;
        }
    }

    public psg(f1x f1xVar, pav pavVar, k7x0 k7x0Var, qnh qnhVar, hei heiVar, vsi vsiVar) {
        super(f1xVar);
        this.T = pavVar;
        this.U = k7x0Var;
        this.V = qnhVar;
        this.W = heiVar;
        if (!vsiVar.t) {
            f1xVar.c.setBackground(c.k(mzg0.delivery_header_annotation_background, this.a));
        }
        b.q(f1xVar.d, true);
    }

    public psg(nzm nzmVar, hex0 hex0Var) {
        super(nzmVar);
        this.T = hex0Var;
        TransferDateSelectorItemView transferDateSelectorItemView = (TransferDateSelectorItemView) nzmVar.c;
        this.U = transferDateSelectorItemView;
        qg qgVar = new qg();
        this.V = qgVar;
        b.p(transferDateSelectorItemView, qgVar);
        c.z(new zgz0(20, this), this.a);
    }
}
