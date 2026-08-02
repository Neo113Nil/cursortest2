package defpackage;

import com.yandex.go.zone.dto.objects.a3;
import ru.yandex.taxi.modal.popup.ui.PopupDialogModalView;

/* loaded from: classes6.dex */
public final class fu6 implements eu6 {
    public final PopupDialogModalView a;
    public final zk7 b;

    public fu6(PopupDialogModalView popupDialogModalView, zk7 zk7Var) {
        this.a = popupDialogModalView;
        this.b = zk7Var;
    }

    @Override // defpackage.eu6
    public final void close() {
        this.a.dismiss();
    }

    @Override // defpackage.eu6
    public final void le(a3 a3Var) {
        zk7 zk7Var = this.b;
        if (zk7Var != null) {
            zk7Var.b(a3Var);
        }
    }

    @Override // defpackage.eu6
    public final void t3(a3 a3Var) {
        zk7 zk7Var = this.b;
        if (zk7Var != null) {
            zk7Var.a(a3Var);
        }
    }
}
