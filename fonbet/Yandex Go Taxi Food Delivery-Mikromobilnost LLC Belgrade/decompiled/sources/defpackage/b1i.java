package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.b;
import androidx.recyclerview.widget.i;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import ru.yandex.taxi.delivery.contacts.DeliveryContactsModalView;
import ru.yandex.taxi.delivery.contacts.a;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemSwitchComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.dialog.AlertDialog;
import ru.yandex.taxi.widget.dialog.BaseDialog;

/* loaded from: classes5.dex */
public final class b1i implements e1i {
    public final /* synthetic */ DeliveryContactsModalView a;

    public b1i(DeliveryContactsModalView deliveryContactsModalView) {
        this.a = deliveryContactsModalView;
    }

    @Override // defpackage.e1i
    public final void A(int i) {
        DeliveryContactsModalView deliveryContactsModalView = this.a;
        OneShotPreDrawListener.add(DeliveryContactsModalView.access$getBinding(deliveryContactsModalView).i, new hl7(deliveryContactsModalView, i, 1));
    }

    @Override // defpackage.e1i
    public final void A6(String str, String str2) {
        DeliveryContactsModalView deliveryContactsModalView = this.a;
        DeliveryContactsModalView.access$getBinding(deliveryContactsModalView).i.setValue(str);
        DeliveryContactsModalView.access$getBinding(deliveryContactsModalView).i.setInputTitle(str2);
    }

    @Override // defpackage.e1i
    public final boolean Fd() {
        return DeliveryContactsModalView.access$getBinding(this.a).i.getInputFocused();
    }

    @Override // defpackage.e1i
    public final void J(String str) {
        DeliveryContactsModalView deliveryContactsModalView = this.a;
        View inflate = LayoutInflater.from(deliveryContactsModalView.getContext()).inflate(drh0.permission_error_view, DeliveryContactsModalView.access$getBinding(deliveryContactsModalView).h);
        inflate.setAlpha(0.0f);
        inflate.animate().alpha(1.0f);
        int i = bfh0.go_to_settings_button;
        WeakHashMap weakHashMap = b.a;
        ((ButtonComponent) ((View) rp31.d(deliveryContactsModalView, i))).setOnClickListener(new y0i(deliveryContactsModalView, 2));
        ((RobotoTextView) ((View) rp31.d(deliveryContactsModalView, bfh0.permission_error_description))).setText(str);
    }

    @Override // defpackage.e1i
    public final void c0() {
        DeliveryContactsModalView deliveryContactsModalView = this.a;
        DeliveryContactsModalView.access$getBinding(deliveryContactsModalView).g.setVisibility(8);
        DeliveryContactsModalView.access$getBinding(deliveryContactsModalView).g.removeAllViews();
    }

    @Override // defpackage.e1i
    public final void closeKeyboard() {
        this.a.closeKeyboard();
    }

    @Override // defpackage.e1i
    public final void d0(String str) {
        uq1 uq1Var;
        sls slsVar;
        a aVar;
        int length = str.length();
        DeliveryContactsModalView deliveryContactsModalView = this.a;
        if (length == 0) {
            str = deliveryContactsModalView.getContext().getString(kyh0.order_for_other_contact_pick_permission_error_message);
        }
        uq1Var = deliveryContactsModalView.alertDialogFactory;
        AlertDialog message = uq1Var.a().setMessage(str);
        int i = kyh0.common_ok;
        slsVar = deliveryContactsModalView.manuallyInputClicked;
        deliveryContactsModalView.alertDialog = message.setPositiveButton(i, new h60(18, slsVar)).setCancelable(false).show();
        aVar = deliveryContactsModalView.presenter;
        aVar.C.B0();
    }

    @Override // defpackage.e1i
    public final void f0() {
        DeliveryContactsModalView.access$getBinding(this.a).b.setVisibility(0);
    }

    @Override // defpackage.e1i
    public final void g0() {
        DeliveryContactsModalView.access$getBinding(this.a).h.removeAllViews();
    }

    @Override // defpackage.e1i
    public final void i0() {
        DeliveryContactsModalView.access$getBinding(this.a).b.setVisibility(8);
    }

    @Override // defpackage.e1i
    public final void l7() {
        DeliveryContactsModalView deliveryContactsModalView = this.a;
        DeliveryContactsModalView.access$getBinding(deliveryContactsModalView).g.setVisibility(0);
        DeliveryContactsModalView.access$getBinding(deliveryContactsModalView).c.setVisibility(8);
        deliveryContactsModalView.setupContactsButton();
        DeliveryContactsModalView.access$getBinding(deliveryContactsModalView).d.setVisibility(8);
    }

    @Override // defpackage.e1i
    public final void r(ArrayList arrayList) {
        fce fceVar;
        fceVar = this.a.contactsAdapter;
        if (fceVar == null) {
            fceVar = null;
        }
        i f = kp50.f(new pce(fceVar.b, arrayList, 0), true);
        fceVar.b = arrayList;
        f.b(fceVar);
    }

    @Override // defpackage.e1i
    public final void t() {
        uq1 uq1Var;
        sls slsVar;
        sls slsVar2;
        DeliveryContactsModalView deliveryContactsModalView = this.a;
        uq1Var = deliveryContactsModalView.alertDialogFactory;
        AlertDialog message = uq1Var.a().setMessage(kyh0.order_for_other_invalid_number_error_message);
        int i = kyh0.order_for_other_invalid_number_error_enter_manually;
        slsVar = deliveryContactsModalView.manuallyInputClicked;
        AlertDialog positiveButton = message.setPositiveButton(i, new h60(19, slsVar));
        int i2 = kyh0.order_for_other_invalid_number_error_select_from_contact;
        slsVar2 = deliveryContactsModalView.pickFromContactClicked;
        deliveryContactsModalView.alertDialog = positiveButton.setNegativeButton(i2, new h60(20, slsVar2)).setButtonsOrientation(BaseDialog.ButtonsOrientation.VERTICAL).setCancelable(false).show();
    }

    @Override // defpackage.e1i
    public final void u(List list) {
        DeliveryContactsModalView deliveryContactsModalView = this.a;
        DeliveryContactsModalView.access$getBinding(deliveryContactsModalView).g.setVisibility(0);
        deliveryContactsModalView.createDefaultContactsView(list);
    }

    @Override // defpackage.e1i
    public final void updateInputType(int i) {
        DeliveryContactsModalView.access$getBinding(this.a).i.updateInputType(i);
    }

    @Override // defpackage.e1i
    public final void v0(String str) {
        DeliveryContactsModalView.access$getBinding(this.a).i.setInputTitle(str);
    }

    @Override // defpackage.e1i
    public final void x3() {
        DeliveryContactsModalView deliveryContactsModalView = this.a;
        DeliveryContactsModalView.access$getBinding(deliveryContactsModalView).g.setVisibility(8);
        DeliveryContactsModalView.access$getBinding(deliveryContactsModalView).c.setVisibility(0);
        DeliveryContactsModalView.access$getBinding(deliveryContactsModalView).i.setTrailView(null);
        DeliveryContactsModalView.access$getBinding(deliveryContactsModalView).i.setValue("", true);
        DeliveryContactsModalView.access$getBinding(deliveryContactsModalView).d.setVisibility(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
    
        if (r6 == null) goto L17;
     */
    @Override // defpackage.e1i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x7(uti utiVar) {
        g18 g18Var;
        pav pavVar;
        pav pavVar2;
        DeliveryContactsModalView deliveryContactsModalView = this.a;
        ListItemSwitchComponent listItemSwitchComponent = DeliveryContactsModalView.access$getBinding(deliveryContactsModalView).f;
        if (utiVar == null) {
            listItemSwitchComponent.setVisibility(8);
            return;
        }
        listItemSwitchComponent.setVisibility(0);
        listItemSwitchComponent.setTitle(utiVar.a);
        listItemSwitchComponent.setSubtitle(utiVar.b);
        String str = utiVar.c;
        if (str != null) {
            pavVar2 = deliveryContactsModalView.imageLoader;
            ((nac) pavVar2.a(listItemSwitchComponent.getLeadImageView())).c(str);
        } else {
            listItemSwitchComponent.setLeadImage(0);
        }
        String str2 = utiVar.d;
        if (str2 != null) {
            listItemSwitchComponent.setTrailCompanionMode(1);
            ImageView trailCompanionImageView = listItemSwitchComponent.getTrailCompanionImageView();
            if (trailCompanionImageView != null) {
                trailCompanionImageView.setVisibility(0);
                pavVar = deliveryContactsModalView.imageLoader;
                g18Var = ((nac) pavVar.a(trailCompanionImageView)).c(str2);
            } else {
                g18Var = null;
            }
        }
        ImageView trailCompanionImageView2 = listItemSwitchComponent.getTrailCompanionImageView();
        if (trailCompanionImageView2 != null) {
            trailCompanionImageView2.setVisibility(8);
        }
        listItemSwitchComponent.setDividers(DividerPosition.BOTTOM, DividerType.MARGIN);
        listItemSwitchComponent.setSwitchEnabled(utiVar.f);
        listItemSwitchComponent.setChecked(utiVar.e);
        listItemSwitchComponent.setOnCheckedListener(new kc(1, utiVar.g));
        listItemSwitchComponent.setOnClickListener(new a1i(listItemSwitchComponent, 0));
    }

    @Override // defpackage.e1i
    public final void z() {
        DeliveryContactsModalView deliveryContactsModalView = this.a;
        OneShotPreDrawListener.add(DeliveryContactsModalView.access$getBinding(deliveryContactsModalView).i, new uz(25, deliveryContactsModalView));
    }
}
