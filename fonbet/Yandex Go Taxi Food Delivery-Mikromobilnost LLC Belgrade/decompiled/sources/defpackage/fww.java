package defpackage;

import com.yandex.go.payments.shared.members.invitation.InvitationView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemSwitchComponent;
import ru.yandex.taxi.design.ListTextComponent;
import ru.yandex.taxi.design.ListTitleComponent;

/* loaded from: classes13.dex */
public final class fww implements bww {
    public final /* synthetic */ InvitationView a;

    public fww(InvitationView invitationView) {
        this.a = invitationView;
    }

    @Override // defpackage.bww
    public final void C5(gww gwwVar) {
        ListTitleComponent listTitleComponent;
        ListTextComponent listTextComponent;
        ListItemSwitchComponent listItemSwitchComponent;
        ListItemSwitchComponent listItemSwitchComponent2;
        ButtonComponent buttonComponent;
        ListTitleComponent listTitleComponent2;
        InvitationView invitationView = this.a;
        listTitleComponent = invitationView.title;
        listTitleComponent.setTitle(gwwVar.b);
        listTextComponent = invitationView.description;
        listTextComponent.setText(gwwVar.c);
        k0a0 k0a0Var = gwwVar.a;
        if (k0a0Var != null) {
            listTitleComponent2 = invitationView.title;
            listTitleComponent2.setLeadImage(k0a0Var.a(invitationView.getContext()));
        }
        listItemSwitchComponent = invitationView.paymentSwitch;
        listItemSwitchComponent.setTitle(gwwVar.d);
        listItemSwitchComponent2 = invitationView.paymentSwitch;
        listItemSwitchComponent2.setCheckedWithAnimation(gwwVar.e);
        buttonComponent = invitationView.doneButton;
        buttonComponent.setText(gwwVar.f);
    }

    @Override // defpackage.bww
    public final void dismiss() {
        this.a.dismiss();
    }
}
