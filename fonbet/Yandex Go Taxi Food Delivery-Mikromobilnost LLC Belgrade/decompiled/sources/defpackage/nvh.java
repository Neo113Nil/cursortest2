package defpackage;

import android.text.method.ArrowKeyMovementMethod;
import ru.yandex.taxi.delivery.addresscorrection.DeliveryAddressCorrectionView;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes5.dex */
public final class nvh implements avh {
    public final /* synthetic */ DeliveryAddressCorrectionView a;

    public nvh(DeliveryAddressCorrectionView deliveryAddressCorrectionView) {
        this.a = deliveryAddressCorrectionView;
    }

    @Override // defpackage.avh
    public final void X(String str) {
        this.a.announceForAccessibility(str);
    }

    @Override // defpackage.avh
    public final void close() {
        this.a.dismiss();
    }

    @Override // defpackage.avh
    public final void hg() {
        ey60 ey60Var;
        DeliveryAddressCorrectionView deliveryAddressCorrectionView = this.a;
        ey60Var = deliveryAddressCorrectionView.addressCorrectionExitListener;
        ((zc) ((zch) ey60Var).a).r(new wth(1));
        deliveryAddressCorrectionView.dismiss();
    }

    @Override // defpackage.avh
    public final void x6(as0 as0Var) {
        ovh binding;
        ovh binding2;
        ovh binding3;
        ovh binding4;
        ovh binding5;
        ovh binding6;
        ovh binding7;
        ovh binding8;
        ovh binding9;
        ovh binding10;
        ovh binding11;
        ovh binding12;
        ovh binding13;
        ovh binding14;
        ovh binding15;
        ovh binding16;
        ovh binding17;
        int i;
        ovh binding18;
        ovh binding19;
        ovh binding20;
        ovh binding21;
        ovh binding22;
        ovh binding23;
        tqo tqoVar = as0Var.a;
        DeliveryAddressCorrectionView deliveryAddressCorrectionView = this.a;
        binding = deliveryAddressCorrectionView.getBinding();
        binding.m.setTitle(tqoVar.a);
        binding2 = deliveryAddressCorrectionView.getBinding();
        binding2.c.setText(tqoVar.b);
        binding3 = deliveryAddressCorrectionView.getBinding();
        binding3.f.setText(tqoVar.c);
        binding4 = deliveryAddressCorrectionView.getBinding();
        binding4.b.setInputTitle(tqoVar.d);
        binding5 = deliveryAddressCorrectionView.getBinding();
        binding5.k.setInputTitle(tqoVar.e);
        binding6 = deliveryAddressCorrectionView.getBinding();
        binding6.h.setInputTitle(tqoVar.f);
        binding7 = deliveryAddressCorrectionView.getBinding();
        binding7.g.setInputTitle(tqoVar.g);
        binding8 = deliveryAddressCorrectionView.getBinding();
        binding8.d.setInputTitle(tqoVar.h);
        binding9 = deliveryAddressCorrectionView.getBinding();
        binding9.e.setTitle(tqoVar.i);
        binding10 = deliveryAddressCorrectionView.getBinding();
        ListItemComponent listItemComponent = binding10.j;
        listItemComponent.setTitle(tqoVar.j);
        listItemComponent.setSubtitle(tqoVar.k);
        if (tqoVar.l) {
            listItemComponent.title().setImportantForAccessibility(2);
            listItemComponent.subtitle().setContentDescription(listItemComponent.getSubtitleText() + " " + listItemComponent.getTitleText());
            listItemComponent.title().setTextIsSelectable(true);
            listItemComponent.setTitleMovementMethod(ArrowKeyMovementMethod.getInstance());
            listItemComponent.setTitleTextColor(qje.t(xng0.textMain, listItemComponent.getContext()));
            listItemComponent.clearTrailView();
        } else {
            listItemComponent.title().setTextIsSelectable(false);
            listItemComponent.setTitleMovementMethod(null);
            listItemComponent.setTitleTextColor(qje.t(xng0.textMinor, listItemComponent.getContext()));
            listItemComponent.setTrailImage(dzg0.chevron_next);
        }
        yr0 yr0Var = as0Var.b;
        binding11 = deliveryAddressCorrectionView.getBinding();
        binding11.i.setTitle(q5z.F(yr0Var.a));
        binding12 = deliveryAddressCorrectionView.getBinding();
        binding12.b.setValue(yr0Var.b);
        binding13 = deliveryAddressCorrectionView.getBinding();
        binding13.k.setValue(yr0Var.c);
        binding14 = deliveryAddressCorrectionView.getBinding();
        binding14.h.setValue(yr0Var.d);
        binding15 = deliveryAddressCorrectionView.getBinding();
        binding15.g.setValue(yr0Var.e);
        binding16 = deliveryAddressCorrectionView.getBinding();
        binding16.d.setValue(yr0Var.f);
        binding17 = deliveryAddressCorrectionView.getBinding();
        ListItemComponent listItemComponent2 = binding17.e;
        bgq0 bgq0Var = yr0Var.g;
        if (jl40.l(bgq0Var, bgq0.f)) {
            listItemComponent2.setLeadTint(qje.t(xng0.iconMinor, listItemComponent2.getContext()));
            listItemComponent2.setTitleTextColor(qje.t(xng0.textMinor, listItemComponent2.getContext()));
            listItemComponent2.setTrailTint(qje.t(xng0.textMain, listItemComponent2.getContext()));
            listItemComponent2.setTrailCompanionText("");
        } else {
            listItemComponent2.setLeadTint(qje.t(xng0.textMain, listItemComponent2.getContext()));
            listItemComponent2.setTitleTextColor(qje.t(xng0.textMain, listItemComponent2.getContext()));
            listItemComponent2.setTrailTint(qje.t(xng0.textMinor, listItemComponent2.getContext()));
            String str = bgq0Var.a;
            if (evu0.J(str)) {
                str = bgq0Var.b;
            }
            listItemComponent2.setTrailCompanionText(str);
        }
        int i2 = mvh.a[as0Var.c.ordinal()];
        if (i2 == 1) {
            i = mzg0.ic_logistics_source_point;
        } else {
            if (i2 != 2) {
                w511.b();
                return;
            }
            i = f1h0.ic_summary_destination_point;
        }
        binding18 = deliveryAddressCorrectionView.getBinding();
        binding18.i.setLeadImage(i);
        binding19 = deliveryAddressCorrectionView.getBinding();
        binding19.b.combineAccessibilityFocus();
        binding20 = deliveryAddressCorrectionView.getBinding();
        binding20.k.combineAccessibilityFocus();
        binding21 = deliveryAddressCorrectionView.getBinding();
        binding21.h.combineAccessibilityFocus();
        binding22 = deliveryAddressCorrectionView.getBinding();
        binding22.g.combineAccessibilityFocus();
        binding23 = deliveryAddressCorrectionView.getBinding();
        binding23.d.combineAccessibilityFocus();
    }
}
