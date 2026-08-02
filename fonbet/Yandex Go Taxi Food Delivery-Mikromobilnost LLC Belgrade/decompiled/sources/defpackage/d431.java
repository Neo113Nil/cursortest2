package defpackage;

import com.yandex.go.vault.flexsdk.descriptors.widget.view.b;
import com.yandex.go.vault.ui.VaultErrorNotification;

/* loaded from: classes14.dex */
public final /* synthetic */ class d431 implements xj60 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;
    public final /* synthetic */ VaultErrorNotification c;

    public /* synthetic */ d431(b bVar, VaultErrorNotification vaultErrorNotification, int i) {
        this.a = i;
        this.b = bVar;
        this.c = vaultErrorNotification;
    }

    @Override // defpackage.xj60
    public final void a() {
        int i = this.a;
        VaultErrorNotification vaultErrorNotification = this.c;
        b bVar = this.b;
        switch (i) {
            case 0:
                bVar.C.c(vaultErrorNotification.getNotificationId());
                break;
            default:
                bVar.C.c(vaultErrorNotification.getNotificationId());
                break;
        }
    }
}
