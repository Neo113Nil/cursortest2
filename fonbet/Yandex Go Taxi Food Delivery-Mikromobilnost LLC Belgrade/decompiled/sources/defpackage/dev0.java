package defpackage;

import ru.yandex.taxi.modal.popup.ui.PopupDialogModalView;

/* loaded from: classes6.dex */
public final class dev0 implements e8e0 {
    public final PopupDialogModalView a;

    public dev0(PopupDialogModalView popupDialogModalView) {
        this.a = popupDialogModalView;
    }

    @Override // defpackage.e8e0
    public final void close() {
        this.a.dismiss();
    }
}
