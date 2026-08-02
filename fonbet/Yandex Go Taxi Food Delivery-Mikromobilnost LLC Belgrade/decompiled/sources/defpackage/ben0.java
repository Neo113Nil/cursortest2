package defpackage;

import com.yandex.go.scooters.deposit.notification.ui.ScootersDepositNotification;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes13.dex */
public final class ben0 implements den0 {
    public final /* synthetic */ ScootersDepositNotification a;

    public ben0(ScootersDepositNotification scootersDepositNotification) {
        this.a = scootersDepositNotification;
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        ListItemComponent listItemComponent;
        gen0 gen0Var = (gen0) obj;
        listItemComponent = this.a.listItemComponent;
        listItemComponent.setTitle(gen0Var.a);
        String str = gen0Var.b;
        if (str == null) {
            str = "";
        }
        listItemComponent.setSubtitle(str);
    }
}
